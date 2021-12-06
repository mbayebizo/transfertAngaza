package net.msapi.transfertangaza.service;

import com.google.gson.Gson;

import net.msapi.transfertangaza.models.PaiAngaza;
import net.msapi.transfertangaza.models.angaza.accounts.Account;
import net.msapi.transfertangaza.models.angaza.client.detail.AttributeValue;
import net.msapi.transfertangaza.models.angaza.client.detail.RootClient;
import net.msapi.transfertangaza.models.angaza.piaiement.ItemPayement;
import net.msapi.transfertangaza.models.angaza.piaiement.RootPayement;
import net.msapi.transfertangaza.models.cai.CaiBonEntree;
import net.msapi.transfertangaza.models.cmm.CmmTier;
import net.msapi.transfertangaza.respository.PaiAngazaRepository;
import net.msapi.transfertangaza.respository.cai.CaiBonEntreeRepository;
import net.msapi.transfertangaza.respository.cai.CaiExercicesCaisseRepository;
import net.msapi.transfertangaza.respository.cmm.CmmTiersRepository;
import net.msapi.transfertangaza.utils.CalculChrono;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class PaiAngazaService {
    static final String COMPTEEPEGASE = "N° Client Epegase";
    private final Logger log = LoggerFactory.getLogger(PaiAngazaService.class);
    private final CmmTiersRepository cmmTiersRepository;
    private final PaiAngazaRepository paiAngazaRepository;
    private final CaiExercicesCaisseRepository caiExercicesCaisseRepository;
    private final CalculChrono calculChrono;
    private final CaiBonEntreeRepository caiBonEntreeRepository;

    public PaiAngazaService(CmmTiersRepository cmmTiersRepository, PaiAngazaRepository paiAngazaRepository, CaiExercicesCaisseRepository caiExercicesCaisseRepository, CalculChrono calculChrono, CaiBonEntreeRepository caiBonEntreeRepository) {
        this.cmmTiersRepository = cmmTiersRepository;
        this.paiAngazaRepository = paiAngazaRepository;
        this.caiExercicesCaisseRepository = caiExercicesCaisseRepository;
        this.calculChrono = calculChrono;
        this.caiBonEntreeRepository = caiBonEntreeRepository;
    }




    @Transactional
    public List<PaiAngaza> findAll() {
        log.debug("Request to get all PaiAngazas");
        chargerAllPaiement();
        return paiAngazaRepository.findAll().stream().filter(p->p.getEtat()==0).collect(Collectors.toList());
    }

    private void chargerAllPaiement() {
        List<ItemPayement> items = new ArrayList<>();
        String url = "https://payg.angazadesign.com/data/payments";
        String plainCreds = "amdia@horus-solutions.net:payg12345";
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);

        if (response.getBody() != null && response.getStatusCodeValue() == 200) {
            Gson gson = new Gson();
            RootPayement root = gson.fromJson(response.getBody(), RootPayement.class);
            items = root.get_embedded().getItem();
            items.forEach(item -> {
                var pai = paiAngazaRepository.findByAccountNumberAndAccountQidAndAngazaTransactionQidAndMsisdnAndQid(item.getAccount_number(), item.getAccount_qid(), item.getAngaza_transaction_qid(), item.getMsisdn(), item.getQid());
                if (pai.isEmpty()) {
                    PaiAngaza p = new PaiAngaza();
                    p.setAccountNumber(item.getAccount_number());
                    p.setAccountQid(item.getAccount_qid());
                    p.setPrix(Double.parseDouble(item.getAmount()));
                    p.setAngazaTransactionQid(item.getAngaza_transaction_qid());
                    p.setCurrency(item.getCurrency());
                    p.setEffectiveDate(item.getEffective_date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    p.setExternalXref(item.getExternal_xref());
                    p.setReversed(item.is_reversed);
                    p.setMsisdn(item.getMsisdn());
                    p.setQid(item.getQid());
                    p.setHref(item.getHref());
                    p.setEtat(0);
                    paiAngazaRepository.saveAndFlush(p);
                }
            });

        }
    }

    /**
     * Get one paiAngaza by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional
    public ResponseWrapper findOne(Long id) {

        log.debug("Request to get PaiAngaza : {}", id);
       try {
           var paiAngaza = paiAngazaRepository.findById(id).get();
           Account account = findAccount(paiAngaza);
           RootClient _c = findClient(account);
           Optional<AttributeValue> compte = _c.getAttribute_values().stream().
                   filter(_a -> _a.getName().equalsIgnoreCase(COMPTEEPEGASE)).findFirst();
           if(compte.isPresent()){
               var cpt = compte.get();
               String compte0 = (String) cpt.getValue();
               var tiers = cmmTiersRepository.findByTieCompte0(compte0);
               if (tiers == null) {
                   return ResponseWrapper.ko("Le Compte Tiers "+compte0+" n 'est  pas attribué dans Epégasse");
               }else{
                   creationBonEntree(tiers, paiAngaza);
               }

           }
           return ResponseWrapper.ok(paiAngazaRepository.findById(id).get());
       }catch (Exception e) {
               log.error(e.getMessage(), e);
               return ResponseWrapper.ko(e.getMessage());
           }
    }

    private void creationBonEntree(CmmTier tiers, PaiAngaza itemPayement) {
        if (tiers != null) {
            CaiBonEntree bonentree = new CaiBonEntree();
            bonentree.setEntrMontant(itemPayement.getPrix());
            bonentree.setEntrDate(new Date());
            bonentree.setEntrEtat(1);
            bonentree = calculeTiers(tiers, bonentree);
            var exercice = caiExercicesCaisseRepository.findFirstByOrderByIdDesc();
            bonentree.setExecaiId(exercice.get().getId());
            bonentree.setEntrNature(63);
            bonentree.setEntrSerie("A");
            var numChrono = calculChrono.numCompose(bonentree.getEntrDate(), 63, bonentree.getEntrSerie());
            bonentree.setEntrNum(numChrono);
            bonentree.setEntrCle(bonentree.getEntrNum() + ":" + bonentree.getEntrNature());
            bonentree.setEntrEtat(1);
            caiBonEntreeRepository.saveAndFlush(bonentree);
            itemPayement.setEtat(1);
            paiAngazaRepository.saveAndFlush(itemPayement);


        }
    }

    private CaiBonEntree calculeTiers(CmmTier tiers, CaiBonEntree bonentree) {
        if (tiers != null) {
            if (bonentree.getEntrTypeTiers() == 0) {
                bonentree.setEntrIdTiers(tiers.getId());
                if (tiers.getTiePrenom() != null && !tiers.getTiePrenom().isEmpty()) {
                    bonentree.setEntrNomTiers(tiers.getTieCompte0() + ":" + tiers.getTieRaisonSocialeNom() + " " + tiers.getTiePrenom());
                } else {
                    bonentree.setEntrNomTiers(tiers.getTieCompte0() + ":" + tiers.getTieRaisonSocialeNom());
                }
            } else if (bonentree.getEntrTypeTiers() == 1) {
                bonentree.setEntrIdTiers(tiers.getId());
                if (tiers.getTiePrenom() != null && !tiers.getTiePrenom().isEmpty()) {
                    bonentree.setEntrNomTiers(tiers.getTieCompte0() + ":" + tiers.getTieRaisonSocialeNom() + " " + tiers.getTiePrenom());
                } else {
                    bonentree.setEntrNomTiers(tiers.getTieCompte0() + ":" + tiers.getTieRaisonSocialeNom());
                }
            } else if (bonentree.getEntrTypeTiers() == 2) {
                bonentree.setEntrIdTiers(tiers.getId());
                if (tiers.getTiePrenom() != null && !tiers.getTiePrenom().isEmpty()) {
                    bonentree.setEntrNomTiers(tiers.getTieRaisonSocialeNom() + " " + tiers.getTiePrenom());
                } else {
                    bonentree.setEntrNomTiers(tiers.getTieRaisonSocialeNom());
                }
            } else if (bonentree.getEntrTypeTiers() == 3) {
                bonentree.setEntrIdTiers(0L);
                bonentree.setEntrNomTiers(tiers.getTieCompte0() + ":" + tiers.getTieRaisonSocialeNom());
            } else if (bonentree.getEntrTypeTiers() == 4) {
                bonentree.setEntrIdTiers(tiers.getId());
                if (tiers.getTiePrenom() != null && !tiers.getTiePrenom().isEmpty()) {
                    bonentree.setEntrNomTiers(tiers.getTieRaisonSocialeNom() + " " + tiers.getTiePrenom());
                } else {
                    bonentree.setEntrNomTiers(tiers.getTieRaisonSocialeNom());
                }
            } else if (bonentree.getEntrTypeTiers() == 5) {
                bonentree.setEntrIdTiers(tiers.getId());
                if (tiers.getTiePrenom() != null && !tiers.getTiePrenom().isEmpty()) {
                    bonentree.setEntrNomTiers(tiers.getTieRaisonSocialeNom() + " " + tiers.getTiePrenom());
                } else {
                    bonentree.setEntrNomTiers(tiers.getTieRaisonSocialeNom());
                }
            }

            bonentree.setEntrTypeTiers(Integer.parseInt(tiers.getTieType()));
        }

        return bonentree;
    }

    public RootClient findClient(Account account) {
        RootClient client = new RootClient();
        String urlAccount = "https://payg.angazadesign.com/data/clients/" + account.getClient_qids().get(0);
        List<ItemPayement> items = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String url = urlAccount;
        String plainCreds = "amdia@horus-solutions.net:payg12345";
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        if (response.getBody() != null && response.getStatusCodeValue() == 200) {
            Gson gson = new Gson();
            client = gson.fromJson(response.getBody(), RootClient.class);
        } else {
            System.out.println("NONES");
        }
        return client;
    }

    public Account findAccount(PaiAngaza item) {
        Account account = new Account();
        String urlAccount = "https://payg.angazadesign.com/data/accounts/" + item.getAccountQid();
        List<ItemPayement> items = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String url = urlAccount;
        String plainCreds = "amdia@horus-solutions.net:payg12345";
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        if (response.getBody() != null && response.getStatusCodeValue() == 200) {
            Gson gson = new Gson();
            account = gson.fromJson(response.getBody(), Account.class);
        } else {
            System.out.println("NONES");
        }
        return account;
    }

    /**
     * Delete the paiAngaza by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete PaiAngaza : {}", id);
        paiAngazaRepository.deleteById(id);
    }
}
