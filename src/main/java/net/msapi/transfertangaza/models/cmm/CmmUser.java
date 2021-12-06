package net.msapi.transfertangaza.models.cmm;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Table(name = "cmm_users")
@Entity
public class CmmUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id", nullable = false)
    private Long id;

    @Column(name = "usr_date_creat")
    private Instant usrDateCreat;

    @Column(name = "usr_date_modif")
    private Instant usrDateModif;

    @Column(name = "usr_user_creat")
    private Long usrUserCreat;

    @Column(name = "usr_user_modif")
    private Long usrUserModif;

    @Column(name = "usr_etat")
    private Integer usrEtat;

    @Column(name = "usr_civilite", length = 20)
    private String usrCivilite;

    @Column(name = "usr_nom", length = 100)
    private String usrNom;

    @Column(name = "usr_prenom", length = 50)
    private String usrPrenom;

    @Column(name = "usr_initiale", length = 10)
    private String usrInitiale;

    @Column(name = "usr_patronyme", length = 100)
    private String usrPatronyme;

    @Column(name = "usr_compte", length = 20)
    private String usrCompte;

    @Column(name = "usr_login", length = 100)
    private String usrLogin;

    @Column(name = "usr_pw", length = 50)
    private String usrPw;

    @Column(name = "usr_pw_espace_client", length = 50)
    private String usrPwEspaceClient;

    @Column(name = "usr_change")
    private Integer usrChange;

    @Column(name = "usr_code_secret", length = 50)
    private String usrCodeSecret;

    @Column(name = "usr_connexion")
    private Integer usrConnexion;

    @Column(name = "usr_systeme")
    private Integer usrSysteme;

    @Column(name = "usr_date_naissance")
    private LocalDate usrDateNaissance;

    @Column(name = "usr_anniversaire", length = 5)
    private String usrAnniversaire;

    @Column(name = "usr_langue", length = 20)
    private String usrLangue;

    @Column(name = "usr_templates", length = 50)
    private String usrTemplates;

    @Column(name = "usr_themes", length = 50)
    private String usrThemes;

    @Column(name = "usr_collaboration", length = 10)
    private String usrCollaboration;

    @Column(name = "usr_fonction", length = 50)
    private String usrFonction;

    @Column(name = "usr_metier", length = 50)
    private String usrMetier;

    @Column(name = "usr_adresse", length = 100)
    private String usrAdresse;

    @Column(name = "usr_bp", length = 20)
    private String usrBp;

    @Column(name = "usr_ville", length = 50)
    private String usrVille;

    @Column(name = "usr_nom_pays", length = 50)
    private String usrNomPays;

    @Column(name = "usr_tel_bureau", length = 50)
    private String usrTelBureau;

    @Column(name = "usr_tel_domicile", length = 50)
    private String usrTelDomicile;

    @Column(name = "usr_cel1", length = 50)
    private String usrCel1;

    @Column(name = "usr_cel2", length = 50)
    private String usrCel2;

    @Column(name = "usr_cel3", length = 50)
    private String usrCel3;

    @Column(name = "usr_acces_mail")
    private Integer usrAccesMail;

    @Column(name = "usr_mail", length = 100)
    private String usrMail;

    @Column(name = "usr_yahoo", length = 100)
    private String usrYahoo;

    @Column(name = "usr_msn", length = 100)
    private String usrMsn;

    @Column(name = "usr_skype", length = 100)
    private String usrSkype;

    @Column(name = "usr_aol", length = 100)
    private String usrAol;

    @Column(name = "usr_last_log")
    private Instant usrLastLog;

    @Column(name = "usr_first_log")
    private Instant usrFirstLog;

    @Column(name = "usr_nb_log")
    private Double usrNbLog;

    @Column(name = "usr_photo", length = 100)
    private String usrPhoto;

    @Column(name = "usr_signature", length = 100)
    private String usrSignature;

    @Column(name = "usr_depot_sel")
    private Integer usrDepotSel;

    @Column(name = "usr_service", length = 121)
    private String usrService;

    @Column(name = "usr_departement", length = 121)
    private String usrDepartement;

    @Column(name = "usr_site", length = 121)
    private String usrSite;

    @Column(name = "usr_service_secondaire", length = 121)
    private String usrServiceSecondaire;

    @Column(name = "usr_departement_secondaire", length = 121)
    private String usrDepartementSecondaire;

    @Column(name = "usr_site_secondaire", length = 121)
    private String usrSiteSecondaire;

    @Column(name = "usr_startup", length = 20)
    private String usrStartup;

    @Column(name = "usr_pr")
    private Double usrPr;

    @Column(name = "usr_pv")
    private Double usrPv;

    @Column(name = "usr_resp_caissier")
    private Integer usrRespCaissier;

    @Column(name = "usr_caissier")
    private Integer usrCaissier;

    @Column(name = "usr_depense")
    private Integer usrDepense;

    @Column(name = "usr_recette")
    private Integer usrRecette;

    @Column(name = "usr_transfert")
    private Integer usrTransfert;

    @Column(name = "usr_modif")
    private Integer usrModif;

    @Column(name = "usr_caissier_annule")
    private Integer usrCaissierAnnule;

    @Column(name = "usr_caissier_delete")
    private Integer usrCaissierDelete;

    @Column(name = "usr_caissier_service")
    private Integer usrCaissierService;

    @Column(name = "usr_recus")
    private Integer usrRecus;

    @Column(name = "usr_recus_jour")
    private Integer usrRecusJour;

    @Column(name = "usr_paye_alerte")
    private Integer usrPayeAlerte;

    @Column(name = "usr_paye")
    private Integer usrPaye;

    @Column(name = "usr_paye_service")
    private Integer usrPayeService;

    @Column(name = "usr_paye_bulletin")
    private Integer usrPayeBulletin;

    @Column(name = "usr_paye_contrat")
    private Integer usrPayeContrat;

    @Column(name = "usr_tiers")
    private Integer usrTiers;

    @Column(name = "usr_planning")
    private Integer usrPlanning;

    @Column(name = "usr_planning_service", length = 121)
    private String usrPlanningService;

    @Column(name = "usr_mail_copie")
    private Integer usrMailCopie;

    @Column(name = "usr_mail_parapheur")
    private Integer usrMailParapheur;

    @Column(name = "usr_achats")
    private Integer usrAchats;

    @Column(name = "usr_resp_achats")
    private Integer usrRespAchats;

    @Column(name = "usr_demandeur_achats")
    private Integer usrDemandeurAchats;

    @Column(name = "usr_facture_decaisse")
    private Integer usrFactureDecaisse;

    @Column(name = "usr_ventes")
    private Integer usrVentes;

    @Column(name = "usr_facture_caisse")
    private Integer usrFactureCaisse;

    @Column(name = "usr_comm_ventes")
    private Integer usrCommVentes;

    @Column(name = "usr_comm_achats")
    private Integer usrCommAchats;

    @Column(name = "usr_mf")
    private Integer usrMf;

    @Column(name = "usr_medical")
    private Integer usrMedical;

    @Column(name = "usr_medical_avoir")
    private Integer usrMedicalAvoir;

    @Lob
    @Column(name = "usr_jrx_interdit")
    private String usrJrxInterdit;

    @Lob
    @Column(name = "usr_cpt_interdit")
    private String usrCptInterdit;

    @Column(name = "usr_jrx_reserve")
    private Integer usrJrxReserve;

    @Column(name = "usr_acces_brouillard")
    private Integer usrAccesBrouillard;

    @Column(name = "usr_acces_correction")
    private Integer usrAccesCorrection;

    @Column(name = "usr_ach_trf_da")
    private Integer usrAchTrfDa;

    @Column(name = "usr_ach_trf_cot")
    private Integer usrAchTrfCot;

    @Column(name = "usr_ach_trf_cmd")
    private Integer usrAchTrfCmd;

    @Column(name = "usr_ach_trf_rec")
    private Integer usrAchTrfRec;

    @Column(name = "usr_ach_trf_ret")
    private Integer usrAchTrfRet;

    @Column(name = "usr_ach_trf_fac")
    private Integer usrAchTrfFac;

    @Column(name = "usr_ach_trf_avr")
    private Integer usrAchTrfAvr;

    @Column(name = "usr_ach_trf_ndd")
    private Integer usrAchTrfNdd;

    @Column(name = "usr_ach_trf_fra")
    private Integer usrAchTrfFra;

    @Column(name = "usr_ach_libelle")
    private Integer usrAchLibelle;

    @Column(name = "usr_vte_libelle")
    private Integer usrVteLibelle;

    @Column(name = "usr_vte_totaux")
    private Integer usrVteTotaux;

    @Column(name = "usr_ach_pump")
    private Integer usrAchPump;

    @Column(name = "usr_vte_trf_bes")
    private Integer usrVteTrfBes;

    @Column(name = "usr_vte_trf_dev")
    private Integer usrVteTrfDev;

    @Column(name = "usr_vte_trf_bc")
    private Integer usrVteTrfBc;

    @Column(name = "usr_vte_trf_bl")
    private Integer usrVteTrfBl;

    @Column(name = "usr_vte_trf_fac")
    private Integer usrVteTrfFac;

    @Column(name = "usr_vte_trf_ret")
    private Integer usrVteTrfRet;

    @Column(name = "usr_vte_trf_avr")
    private Integer usrVteTrfAvr;

    @Column(name = "usr_vte_trf_ndd")
    private Integer usrVteTrfNdd;

    @Column(name = "usr_aff_pump")
    private Integer usrAffPump;

    @Column(name = "usr_aff_pv_marche")
    private Integer usrAffPvMarche;

    @Column(name = "usr_aff_plancher")
    private Integer usrAffPlancher;

    @Column(name = "usr_ver_remise")
    private Integer usrVerRemise;

    @Column(name = "usr_ver_rabais")
    private Integer usrVerRabais;

    @Column(name = "usr_ver_pv")
    private Integer usrVerPv;

    @Column(name = "usr_prod_service")
    private Integer usrProdService;

    @Column(name = "usr_ver_remise_ach")
    private Integer usrVerRemiseAch;

    @Column(name = "usr_ver_rabais_ach")
    private Integer usrVerRabaisAch;

    @Column(name = "usr_ver_pa_ach")
    private Integer usrVerPaAch;

    @Column(name = "usr_prod_service_ach")
    private Integer usrProdServiceAch;

    @Column(name = "usr_date_debut_indisponibilite")
    private LocalDate usrDateDebutIndisponibilite;

    @Column(name = "usr_date_fin_indisponibilite")
    private LocalDate usrDateFinIndisponibilite;

    @Column(name = "usr_date_ach")
    private Integer usrDateAch;

    @Column(name = "usr_date_stk")
    private Integer usrDateStk;

    @Column(name = "usr_date_vte")
    private Integer usrDateVte;

    @Column(name = "usr_date_livre")
    private Integer usrDateLivre;

    @Column(name = "usr_date_cai")
    private Integer usrDateCai;

    @Column(name = "usr_date_med")
    private Integer usrDateMed;

    @Column(name = "usr_date_prc")
    private Integer usrDatePrc;

    @Column(name = "usr_imput_cai")
    private Integer usrImputCai;

    @Column(name = "usr_tiers_cai")
    private Integer usrTiersCai;

    @Column(name = "usr_montant_cai")
    private Integer usrMontantCai;

    @Column(name = "usr_libelle_cai")
    private Integer usrLibelleCai;

    @Column(name = "usr_modif_liasse")
    private Integer usrModifLiasse;

    @Column(name = "usr_signature_office")
    private Integer usrSignatureOffice;

    @Column(name = "usr_signature_compta")
    private Integer usrSignatureCompta;

    @Column(name = "usr_signature_paye")
    private Integer usrSignaturePaye;

    @Column(name = "usr_signature_parc")
    private Integer usrSignatureParc;

    @Column(name = "usr_signature_achats")
    private Integer usrSignatureAchats;

    @Column(name = "usr_signature_ventes")
    private Integer usrSignatureVentes;

    @Column(name = "usr_responsablr_ventes")
    private Long usrResponsablrVentes;

    @Column(name = "usr_signature_caisse")
    private Integer usrSignatureCaisse;

    @Column(name = "usr_signature_medical")
    private Integer usrSignatureMedical;

    @Column(name = "usr_signature_microfinance")
    private Integer usrSignatureMicrofinance;

    @Column(name = "usr_signature_education")
    private Integer usrSignatureEducation;

    @Column(name = "usr_vendeur")
    private Integer usrVendeur;

    @Column(name = "usr_acheteur")
    private Integer usrAcheteur;

    @Column(name = "usr_id_equipe")
    private Long usrIdEquipe;

    @Column(name = "usr_nom_equipe", length = 100)
    private String usrNomEquipe;

    @Lob
    @Column(name = "usr_feuille_interdite")
    private String usrFeuilleInterdite;

    @Column(name = "usr_comm_pourcentage")
    private Double usrCommPourcentage;

    @Column(name = "usr_comm_type")
    private Integer usrCommType;

    @Column(name = "usr_lissage")
    private Integer usrLissage;

    @Column(name = "usr_chg_dos_achat")
    private Integer usrChgDosAchat;

    @Column(name = "usr_creation_societe")
    private Integer usrCreationSociete;

    @Column(name = "usr_pay_pointage")
    private Integer usrPayPointage;

    @Column(name = "usr_id_tiers_guest")
    private Long usrIdTiersGuest;

    @Column(name = "usr_nom_tiers_guest", length = 100)
    private String usrNomTiersGuest;

    @Column(name = "usr_id_salarie_guest")
    private Long usrIdSalarieGuest;

    @Column(name = "usr_nom_salarie_guest", length = 100)
    private String usrNomSalarieGuest;

    @Column(name = "usr_modif_serie_vte")
    private Integer usrModifSerieVte;

    @Column(name = "usr_modif_serie_ach")
    private Integer usrModifSerieAch;

    @Column(name = "usr_parc_alerte")
    private Integer usrParcAlerte;

    @Column(name = "usr_base_copie")
    private Integer usrBaseCopie;

    @Column(name = "usr_nom_base_copie", length = 30)
    private String usrNomBaseCopie;

    @Column(name = "usr_spcialite", length = 50)
    private String usrSpcialite;

    @Column(name = "usr_vte_ctr_alerte")
    private Integer usrVteCtrAlerte;

    @Column(name = "usr_cpt_structure")
    private Boolean usrCptStructure;

    @Column(name = "usr_cpt_chantier")
    private Boolean usrCptChantier;

    @Column(name = "usr_cpt_mission")
    private Boolean usrCptMission;

    @Column(name = "usr_cpt_site")
    private Boolean usrCptSite;

    @Column(name = "usr_cpt_region")
    private Boolean usrCptRegion;

    @Column(name = "usr_cpt_usine")
    private Boolean usrCptUsine;

    @Column(name = "usr_cpt_activite")
    private Boolean usrCptActivite;

    @Column(name = "usr_cpt_parc")
    private Boolean usrCptParc;

    @Column(name = "usr_cpt_dossier")
    private Boolean usrCptDossier;

    @Column(name = "usr_cpt_agent")
    private Boolean usrCptAgent;

    @Column(name = "usr_cpt_cles")
    private Boolean usrCptCles;

    @Column(name = "usr_cpt_projet")
    private Boolean usrCptProjet;

    @Column(name = "usr_my_life_chat")
    private Boolean usrMyLifeChat;

    @Column(name = "usr_sans_habilitation")
    private Integer usrSansHabilitation;

    @Column(name = "usr_config_liste")
    private Integer usrConfigListe;

    @Column(name = "usr_assistant")
    private Integer usrAssistant;

    @Column(name = "usr_imei", length = 16)
    private String usrImei;

    @Column(name = "usr_permandroid", length = 50)
    private String usrPermandroid;

    @Column(name = "usr_num_stat", length = 50)
    private String usrNumStat;

    @ManyToOne(optional = false)
    @JoinColumn(name = "grp_id", nullable = false)
    private CmmGroupe grp;

    @Column(name = "usr_extrait_anal")
    private Integer usrExtraitAnal;

    @Column(name = "usr_paye_caisse")
    private Integer usrPayeCaisse;

    @Column(name = "usr_medical_alerte")
    private Integer usrMedicalAlerte;

    @Column(name = "usr_cabinet")
    private Integer usrCabinet;

    public Integer getUsrCabinet() {
        return usrCabinet;
    }

    public void setUsrCabinet(Integer usrCabinet) {
        this.usrCabinet = usrCabinet;
    }

    public Integer getUsrMedicalAlerte() {
        return usrMedicalAlerte;
    }

    public void setUsrMedicalAlerte(Integer usrMedicalAlerte) {
        this.usrMedicalAlerte = usrMedicalAlerte;
    }

    public Integer getUsrPayeCaisse() {
        return usrPayeCaisse;
    }

    public void setUsrPayeCaisse(Integer usrPayeCaisse) {
        this.usrPayeCaisse = usrPayeCaisse;
    }

    public Integer getUsrExtraitAnal() {
        return usrExtraitAnal;
    }

    public void setUsrExtraitAnal(Integer usrExtraitAnal) {
        this.usrExtraitAnal = usrExtraitAnal;
    }

    public CmmGroupe getGrp() {
        return grp;
    }

    public void setGrp(CmmGroupe grp) {
        this.grp = grp;
    }

    public String getUsrNumStat() {
        return usrNumStat;
    }

    public void setUsrNumStat(String usrNumStat) {
        this.usrNumStat = usrNumStat;
    }

    public String getUsrPermandroid() {
        return usrPermandroid;
    }

    public void setUsrPermandroid(String usrPermandroid) {
        this.usrPermandroid = usrPermandroid;
    }

    public String getUsrImei() {
        return usrImei;
    }

    public void setUsrImei(String usrImei) {
        this.usrImei = usrImei;
    }

    public Integer getUsrAssistant() {
        return usrAssistant;
    }

    public void setUsrAssistant(Integer usrAssistant) {
        this.usrAssistant = usrAssistant;
    }

    public Integer getUsrConfigListe() {
        return usrConfigListe;
    }

    public void setUsrConfigListe(Integer usrConfigListe) {
        this.usrConfigListe = usrConfigListe;
    }

    public Integer getUsrSansHabilitation() {
        return usrSansHabilitation;
    }

    public void setUsrSansHabilitation(Integer usrSansHabilitation) {
        this.usrSansHabilitation = usrSansHabilitation;
    }

    public Boolean getUsrMyLifeChat() {
        return usrMyLifeChat;
    }

    public void setUsrMyLifeChat(Boolean usrMyLifeChat) {
        this.usrMyLifeChat = usrMyLifeChat;
    }

    public Boolean getUsrCptProjet() {
        return usrCptProjet;
    }

    public void setUsrCptProjet(Boolean usrCptProjet) {
        this.usrCptProjet = usrCptProjet;
    }

    public Boolean getUsrCptCles() {
        return usrCptCles;
    }

    public void setUsrCptCles(Boolean usrCptCles) {
        this.usrCptCles = usrCptCles;
    }

    public Boolean getUsrCptAgent() {
        return usrCptAgent;
    }

    public void setUsrCptAgent(Boolean usrCptAgent) {
        this.usrCptAgent = usrCptAgent;
    }

    public Boolean getUsrCptDossier() {
        return usrCptDossier;
    }

    public void setUsrCptDossier(Boolean usrCptDossier) {
        this.usrCptDossier = usrCptDossier;
    }

    public Boolean getUsrCptParc() {
        return usrCptParc;
    }

    public void setUsrCptParc(Boolean usrCptParc) {
        this.usrCptParc = usrCptParc;
    }

    public Boolean getUsrCptActivite() {
        return usrCptActivite;
    }

    public void setUsrCptActivite(Boolean usrCptActivite) {
        this.usrCptActivite = usrCptActivite;
    }

    public Boolean getUsrCptUsine() {
        return usrCptUsine;
    }

    public void setUsrCptUsine(Boolean usrCptUsine) {
        this.usrCptUsine = usrCptUsine;
    }

    public Boolean getUsrCptRegion() {
        return usrCptRegion;
    }

    public void setUsrCptRegion(Boolean usrCptRegion) {
        this.usrCptRegion = usrCptRegion;
    }

    public Boolean getUsrCptSite() {
        return usrCptSite;
    }

    public void setUsrCptSite(Boolean usrCptSite) {
        this.usrCptSite = usrCptSite;
    }

    public Boolean getUsrCptMission() {
        return usrCptMission;
    }

    public void setUsrCptMission(Boolean usrCptMission) {
        this.usrCptMission = usrCptMission;
    }

    public Boolean getUsrCptChantier() {
        return usrCptChantier;
    }

    public void setUsrCptChantier(Boolean usrCptChantier) {
        this.usrCptChantier = usrCptChantier;
    }

    public Boolean getUsrCptStructure() {
        return usrCptStructure;
    }

    public void setUsrCptStructure(Boolean usrCptStructure) {
        this.usrCptStructure = usrCptStructure;
    }

    public Integer getUsrVteCtrAlerte() {
        return usrVteCtrAlerte;
    }

    public void setUsrVteCtrAlerte(Integer usrVteCtrAlerte) {
        this.usrVteCtrAlerte = usrVteCtrAlerte;
    }

    public String getUsrSpcialite() {
        return usrSpcialite;
    }

    public void setUsrSpcialite(String usrSpcialite) {
        this.usrSpcialite = usrSpcialite;
    }

    public String getUsrNomBaseCopie() {
        return usrNomBaseCopie;
    }

    public void setUsrNomBaseCopie(String usrNomBaseCopie) {
        this.usrNomBaseCopie = usrNomBaseCopie;
    }

    public Integer getUsrBaseCopie() {
        return usrBaseCopie;
    }

    public void setUsrBaseCopie(Integer usrBaseCopie) {
        this.usrBaseCopie = usrBaseCopie;
    }

    public Integer getUsrParcAlerte() {
        return usrParcAlerte;
    }

    public void setUsrParcAlerte(Integer usrParcAlerte) {
        this.usrParcAlerte = usrParcAlerte;
    }

    public Integer getUsrModifSerieAch() {
        return usrModifSerieAch;
    }

    public void setUsrModifSerieAch(Integer usrModifSerieAch) {
        this.usrModifSerieAch = usrModifSerieAch;
    }

    public Integer getUsrModifSerieVte() {
        return usrModifSerieVte;
    }

    public void setUsrModifSerieVte(Integer usrModifSerieVte) {
        this.usrModifSerieVte = usrModifSerieVte;
    }

    public String getUsrNomSalarieGuest() {
        return usrNomSalarieGuest;
    }

    public void setUsrNomSalarieGuest(String usrNomSalarieGuest) {
        this.usrNomSalarieGuest = usrNomSalarieGuest;
    }

    public Long getUsrIdSalarieGuest() {
        return usrIdSalarieGuest;
    }

    public void setUsrIdSalarieGuest(Long usrIdSalarieGuest) {
        this.usrIdSalarieGuest = usrIdSalarieGuest;
    }

    public String getUsrNomTiersGuest() {
        return usrNomTiersGuest;
    }

    public void setUsrNomTiersGuest(String usrNomTiersGuest) {
        this.usrNomTiersGuest = usrNomTiersGuest;
    }

    public Long getUsrIdTiersGuest() {
        return usrIdTiersGuest;
    }

    public void setUsrIdTiersGuest(Long usrIdTiersGuest) {
        this.usrIdTiersGuest = usrIdTiersGuest;
    }

    public Integer getUsrPayPointage() {
        return usrPayPointage;
    }

    public void setUsrPayPointage(Integer usrPayPointage) {
        this.usrPayPointage = usrPayPointage;
    }

    public Integer getUsrCreationSociete() {
        return usrCreationSociete;
    }

    public void setUsrCreationSociete(Integer usrCreationSociete) {
        this.usrCreationSociete = usrCreationSociete;
    }

    public Integer getUsrChgDosAchat() {
        return usrChgDosAchat;
    }

    public void setUsrChgDosAchat(Integer usrChgDosAchat) {
        this.usrChgDosAchat = usrChgDosAchat;
    }

    public Integer getUsrLissage() {
        return usrLissage;
    }

    public void setUsrLissage(Integer usrLissage) {
        this.usrLissage = usrLissage;
    }

    public Integer getUsrCommType() {
        return usrCommType;
    }

    public void setUsrCommType(Integer usrCommType) {
        this.usrCommType = usrCommType;
    }

    public Double getUsrCommPourcentage() {
        return usrCommPourcentage;
    }

    public void setUsrCommPourcentage(Double usrCommPourcentage) {
        this.usrCommPourcentage = usrCommPourcentage;
    }

    public String getUsrFeuilleInterdite() {
        return usrFeuilleInterdite;
    }

    public void setUsrFeuilleInterdite(String usrFeuilleInterdite) {
        this.usrFeuilleInterdite = usrFeuilleInterdite;
    }

    public String getUsrNomEquipe() {
        return usrNomEquipe;
    }

    public void setUsrNomEquipe(String usrNomEquipe) {
        this.usrNomEquipe = usrNomEquipe;
    }

    public Long getUsrIdEquipe() {
        return usrIdEquipe;
    }

    public void setUsrIdEquipe(Long usrIdEquipe) {
        this.usrIdEquipe = usrIdEquipe;
    }

    public Integer getUsrAcheteur() {
        return usrAcheteur;
    }

    public void setUsrAcheteur(Integer usrAcheteur) {
        this.usrAcheteur = usrAcheteur;
    }

    public Integer getUsrVendeur() {
        return usrVendeur;
    }

    public void setUsrVendeur(Integer usrVendeur) {
        this.usrVendeur = usrVendeur;
    }

    public Integer getUsrSignatureEducation() {
        return usrSignatureEducation;
    }

    public void setUsrSignatureEducation(Integer usrSignatureEducation) {
        this.usrSignatureEducation = usrSignatureEducation;
    }

    public Integer getUsrSignatureMicrofinance() {
        return usrSignatureMicrofinance;
    }

    public void setUsrSignatureMicrofinance(Integer usrSignatureMicrofinance) {
        this.usrSignatureMicrofinance = usrSignatureMicrofinance;
    }

    public Integer getUsrSignatureMedical() {
        return usrSignatureMedical;
    }

    public void setUsrSignatureMedical(Integer usrSignatureMedical) {
        this.usrSignatureMedical = usrSignatureMedical;
    }

    public Integer getUsrSignatureCaisse() {
        return usrSignatureCaisse;
    }

    public void setUsrSignatureCaisse(Integer usrSignatureCaisse) {
        this.usrSignatureCaisse = usrSignatureCaisse;
    }

    public Long getUsrResponsablrVentes() {
        return usrResponsablrVentes;
    }

    public void setUsrResponsablrVentes(Long usrResponsablrVentes) {
        this.usrResponsablrVentes = usrResponsablrVentes;
    }

    public Integer getUsrSignatureVentes() {
        return usrSignatureVentes;
    }

    public void setUsrSignatureVentes(Integer usrSignatureVentes) {
        this.usrSignatureVentes = usrSignatureVentes;
    }

    public Integer getUsrSignatureAchats() {
        return usrSignatureAchats;
    }

    public void setUsrSignatureAchats(Integer usrSignatureAchats) {
        this.usrSignatureAchats = usrSignatureAchats;
    }

    public Integer getUsrSignatureParc() {
        return usrSignatureParc;
    }

    public void setUsrSignatureParc(Integer usrSignatureParc) {
        this.usrSignatureParc = usrSignatureParc;
    }

    public Integer getUsrSignaturePaye() {
        return usrSignaturePaye;
    }

    public void setUsrSignaturePaye(Integer usrSignaturePaye) {
        this.usrSignaturePaye = usrSignaturePaye;
    }

    public Integer getUsrSignatureCompta() {
        return usrSignatureCompta;
    }

    public void setUsrSignatureCompta(Integer usrSignatureCompta) {
        this.usrSignatureCompta = usrSignatureCompta;
    }

    public Integer getUsrSignatureOffice() {
        return usrSignatureOffice;
    }

    public void setUsrSignatureOffice(Integer usrSignatureOffice) {
        this.usrSignatureOffice = usrSignatureOffice;
    }

    public Integer getUsrModifLiasse() {
        return usrModifLiasse;
    }

    public void setUsrModifLiasse(Integer usrModifLiasse) {
        this.usrModifLiasse = usrModifLiasse;
    }

    public Integer getUsrLibelleCai() {
        return usrLibelleCai;
    }

    public void setUsrLibelleCai(Integer usrLibelleCai) {
        this.usrLibelleCai = usrLibelleCai;
    }

    public Integer getUsrMontantCai() {
        return usrMontantCai;
    }

    public void setUsrMontantCai(Integer usrMontantCai) {
        this.usrMontantCai = usrMontantCai;
    }

    public Integer getUsrTiersCai() {
        return usrTiersCai;
    }

    public void setUsrTiersCai(Integer usrTiersCai) {
        this.usrTiersCai = usrTiersCai;
    }

    public Integer getUsrImputCai() {
        return usrImputCai;
    }

    public void setUsrImputCai(Integer usrImputCai) {
        this.usrImputCai = usrImputCai;
    }

    public Integer getUsrDatePrc() {
        return usrDatePrc;
    }

    public void setUsrDatePrc(Integer usrDatePrc) {
        this.usrDatePrc = usrDatePrc;
    }

    public Integer getUsrDateMed() {
        return usrDateMed;
    }

    public void setUsrDateMed(Integer usrDateMed) {
        this.usrDateMed = usrDateMed;
    }

    public Integer getUsrDateCai() {
        return usrDateCai;
    }

    public void setUsrDateCai(Integer usrDateCai) {
        this.usrDateCai = usrDateCai;
    }

    public Integer getUsrDateLivre() {
        return usrDateLivre;
    }

    public void setUsrDateLivre(Integer usrDateLivre) {
        this.usrDateLivre = usrDateLivre;
    }

    public Integer getUsrDateVte() {
        return usrDateVte;
    }

    public void setUsrDateVte(Integer usrDateVte) {
        this.usrDateVte = usrDateVte;
    }

    public Integer getUsrDateStk() {
        return usrDateStk;
    }

    public void setUsrDateStk(Integer usrDateStk) {
        this.usrDateStk = usrDateStk;
    }

    public Integer getUsrDateAch() {
        return usrDateAch;
    }

    public void setUsrDateAch(Integer usrDateAch) {
        this.usrDateAch = usrDateAch;
    }

    public LocalDate getUsrDateFinIndisponibilite() {
        return usrDateFinIndisponibilite;
    }

    public void setUsrDateFinIndisponibilite(LocalDate usrDateFinIndisponibilite) {
        this.usrDateFinIndisponibilite = usrDateFinIndisponibilite;
    }

    public LocalDate getUsrDateDebutIndisponibilite() {
        return usrDateDebutIndisponibilite;
    }

    public void setUsrDateDebutIndisponibilite(LocalDate usrDateDebutIndisponibilite) {
        this.usrDateDebutIndisponibilite = usrDateDebutIndisponibilite;
    }

    public Integer getUsrProdServiceAch() {
        return usrProdServiceAch;
    }

    public void setUsrProdServiceAch(Integer usrProdServiceAch) {
        this.usrProdServiceAch = usrProdServiceAch;
    }

    public Integer getUsrVerPaAch() {
        return usrVerPaAch;
    }

    public void setUsrVerPaAch(Integer usrVerPaAch) {
        this.usrVerPaAch = usrVerPaAch;
    }

    public Integer getUsrVerRabaisAch() {
        return usrVerRabaisAch;
    }

    public void setUsrVerRabaisAch(Integer usrVerRabaisAch) {
        this.usrVerRabaisAch = usrVerRabaisAch;
    }

    public Integer getUsrVerRemiseAch() {
        return usrVerRemiseAch;
    }

    public void setUsrVerRemiseAch(Integer usrVerRemiseAch) {
        this.usrVerRemiseAch = usrVerRemiseAch;
    }

    public Integer getUsrProdService() {
        return usrProdService;
    }

    public void setUsrProdService(Integer usrProdService) {
        this.usrProdService = usrProdService;
    }

    public Integer getUsrVerPv() {
        return usrVerPv;
    }

    public void setUsrVerPv(Integer usrVerPv) {
        this.usrVerPv = usrVerPv;
    }

    public Integer getUsrVerRabais() {
        return usrVerRabais;
    }

    public void setUsrVerRabais(Integer usrVerRabais) {
        this.usrVerRabais = usrVerRabais;
    }

    public Integer getUsrVerRemise() {
        return usrVerRemise;
    }

    public void setUsrVerRemise(Integer usrVerRemise) {
        this.usrVerRemise = usrVerRemise;
    }

    public Integer getUsrAffPlancher() {
        return usrAffPlancher;
    }

    public void setUsrAffPlancher(Integer usrAffPlancher) {
        this.usrAffPlancher = usrAffPlancher;
    }

    public Integer getUsrAffPvMarche() {
        return usrAffPvMarche;
    }

    public void setUsrAffPvMarche(Integer usrAffPvMarche) {
        this.usrAffPvMarche = usrAffPvMarche;
    }

    public Integer getUsrAffPump() {
        return usrAffPump;
    }

    public void setUsrAffPump(Integer usrAffPump) {
        this.usrAffPump = usrAffPump;
    }

    public Integer getUsrVteTrfNdd() {
        return usrVteTrfNdd;
    }

    public void setUsrVteTrfNdd(Integer usrVteTrfNdd) {
        this.usrVteTrfNdd = usrVteTrfNdd;
    }

    public Integer getUsrVteTrfAvr() {
        return usrVteTrfAvr;
    }

    public void setUsrVteTrfAvr(Integer usrVteTrfAvr) {
        this.usrVteTrfAvr = usrVteTrfAvr;
    }

    public Integer getUsrVteTrfRet() {
        return usrVteTrfRet;
    }

    public void setUsrVteTrfRet(Integer usrVteTrfRet) {
        this.usrVteTrfRet = usrVteTrfRet;
    }

    public Integer getUsrVteTrfFac() {
        return usrVteTrfFac;
    }

    public void setUsrVteTrfFac(Integer usrVteTrfFac) {
        this.usrVteTrfFac = usrVteTrfFac;
    }

    public Integer getUsrVteTrfBl() {
        return usrVteTrfBl;
    }

    public void setUsrVteTrfBl(Integer usrVteTrfBl) {
        this.usrVteTrfBl = usrVteTrfBl;
    }

    public Integer getUsrVteTrfBc() {
        return usrVteTrfBc;
    }

    public void setUsrVteTrfBc(Integer usrVteTrfBc) {
        this.usrVteTrfBc = usrVteTrfBc;
    }

    public Integer getUsrVteTrfDev() {
        return usrVteTrfDev;
    }

    public void setUsrVteTrfDev(Integer usrVteTrfDev) {
        this.usrVteTrfDev = usrVteTrfDev;
    }

    public Integer getUsrVteTrfBes() {
        return usrVteTrfBes;
    }

    public void setUsrVteTrfBes(Integer usrVteTrfBes) {
        this.usrVteTrfBes = usrVteTrfBes;
    }

    public Integer getUsrAchPump() {
        return usrAchPump;
    }

    public void setUsrAchPump(Integer usrAchPump) {
        this.usrAchPump = usrAchPump;
    }

    public Integer getUsrVteTotaux() {
        return usrVteTotaux;
    }

    public void setUsrVteTotaux(Integer usrVteTotaux) {
        this.usrVteTotaux = usrVteTotaux;
    }

    public Integer getUsrVteLibelle() {
        return usrVteLibelle;
    }

    public void setUsrVteLibelle(Integer usrVteLibelle) {
        this.usrVteLibelle = usrVteLibelle;
    }

    public Integer getUsrAchLibelle() {
        return usrAchLibelle;
    }

    public void setUsrAchLibelle(Integer usrAchLibelle) {
        this.usrAchLibelle = usrAchLibelle;
    }

    public Integer getUsrAchTrfFra() {
        return usrAchTrfFra;
    }

    public void setUsrAchTrfFra(Integer usrAchTrfFra) {
        this.usrAchTrfFra = usrAchTrfFra;
    }

    public Integer getUsrAchTrfNdd() {
        return usrAchTrfNdd;
    }

    public void setUsrAchTrfNdd(Integer usrAchTrfNdd) {
        this.usrAchTrfNdd = usrAchTrfNdd;
    }

    public Integer getUsrAchTrfAvr() {
        return usrAchTrfAvr;
    }

    public void setUsrAchTrfAvr(Integer usrAchTrfAvr) {
        this.usrAchTrfAvr = usrAchTrfAvr;
    }

    public Integer getUsrAchTrfFac() {
        return usrAchTrfFac;
    }

    public void setUsrAchTrfFac(Integer usrAchTrfFac) {
        this.usrAchTrfFac = usrAchTrfFac;
    }

    public Integer getUsrAchTrfRet() {
        return usrAchTrfRet;
    }

    public void setUsrAchTrfRet(Integer usrAchTrfRet) {
        this.usrAchTrfRet = usrAchTrfRet;
    }

    public Integer getUsrAchTrfRec() {
        return usrAchTrfRec;
    }

    public void setUsrAchTrfRec(Integer usrAchTrfRec) {
        this.usrAchTrfRec = usrAchTrfRec;
    }

    public Integer getUsrAchTrfCmd() {
        return usrAchTrfCmd;
    }

    public void setUsrAchTrfCmd(Integer usrAchTrfCmd) {
        this.usrAchTrfCmd = usrAchTrfCmd;
    }

    public Integer getUsrAchTrfCot() {
        return usrAchTrfCot;
    }

    public void setUsrAchTrfCot(Integer usrAchTrfCot) {
        this.usrAchTrfCot = usrAchTrfCot;
    }

    public Integer getUsrAchTrfDa() {
        return usrAchTrfDa;
    }

    public void setUsrAchTrfDa(Integer usrAchTrfDa) {
        this.usrAchTrfDa = usrAchTrfDa;
    }

    public Integer getUsrAccesCorrection() {
        return usrAccesCorrection;
    }

    public void setUsrAccesCorrection(Integer usrAccesCorrection) {
        this.usrAccesCorrection = usrAccesCorrection;
    }

    public Integer getUsrAccesBrouillard() {
        return usrAccesBrouillard;
    }

    public void setUsrAccesBrouillard(Integer usrAccesBrouillard) {
        this.usrAccesBrouillard = usrAccesBrouillard;
    }

    public Integer getUsrJrxReserve() {
        return usrJrxReserve;
    }

    public void setUsrJrxReserve(Integer usrJrxReserve) {
        this.usrJrxReserve = usrJrxReserve;
    }

    public String getUsrCptInterdit() {
        return usrCptInterdit;
    }

    public void setUsrCptInterdit(String usrCptInterdit) {
        this.usrCptInterdit = usrCptInterdit;
    }

    public String getUsrJrxInterdit() {
        return usrJrxInterdit;
    }

    public void setUsrJrxInterdit(String usrJrxInterdit) {
        this.usrJrxInterdit = usrJrxInterdit;
    }

    public Integer getUsrMedicalAvoir() {
        return usrMedicalAvoir;
    }

    public void setUsrMedicalAvoir(Integer usrMedicalAvoir) {
        this.usrMedicalAvoir = usrMedicalAvoir;
    }

    public Integer getUsrMedical() {
        return usrMedical;
    }

    public void setUsrMedical(Integer usrMedical) {
        this.usrMedical = usrMedical;
    }

    public Integer getUsrMf() {
        return usrMf;
    }

    public void setUsrMf(Integer usrMf) {
        this.usrMf = usrMf;
    }

    public Integer getUsrCommAchats() {
        return usrCommAchats;
    }

    public void setUsrCommAchats(Integer usrCommAchats) {
        this.usrCommAchats = usrCommAchats;
    }

    public Integer getUsrCommVentes() {
        return usrCommVentes;
    }

    public void setUsrCommVentes(Integer usrCommVentes) {
        this.usrCommVentes = usrCommVentes;
    }

    public Integer getUsrFactureCaisse() {
        return usrFactureCaisse;
    }

    public void setUsrFactureCaisse(Integer usrFactureCaisse) {
        this.usrFactureCaisse = usrFactureCaisse;
    }

    public Integer getUsrVentes() {
        return usrVentes;
    }

    public void setUsrVentes(Integer usrVentes) {
        this.usrVentes = usrVentes;
    }

    public Integer getUsrFactureDecaisse() {
        return usrFactureDecaisse;
    }

    public void setUsrFactureDecaisse(Integer usrFactureDecaisse) {
        this.usrFactureDecaisse = usrFactureDecaisse;
    }

    public Integer getUsrDemandeurAchats() {
        return usrDemandeurAchats;
    }

    public void setUsrDemandeurAchats(Integer usrDemandeurAchats) {
        this.usrDemandeurAchats = usrDemandeurAchats;
    }

    public Integer getUsrRespAchats() {
        return usrRespAchats;
    }

    public void setUsrRespAchats(Integer usrRespAchats) {
        this.usrRespAchats = usrRespAchats;
    }

    public Integer getUsrAchats() {
        return usrAchats;
    }

    public void setUsrAchats(Integer usrAchats) {
        this.usrAchats = usrAchats;
    }

    public Integer getUsrMailParapheur() {
        return usrMailParapheur;
    }

    public void setUsrMailParapheur(Integer usrMailParapheur) {
        this.usrMailParapheur = usrMailParapheur;
    }

    public Integer getUsrMailCopie() {
        return usrMailCopie;
    }

    public void setUsrMailCopie(Integer usrMailCopie) {
        this.usrMailCopie = usrMailCopie;
    }

    public String getUsrPlanningService() {
        return usrPlanningService;
    }

    public void setUsrPlanningService(String usrPlanningService) {
        this.usrPlanningService = usrPlanningService;
    }

    public Integer getUsrPlanning() {
        return usrPlanning;
    }

    public void setUsrPlanning(Integer usrPlanning) {
        this.usrPlanning = usrPlanning;
    }

    public Integer getUsrTiers() {
        return usrTiers;
    }

    public void setUsrTiers(Integer usrTiers) {
        this.usrTiers = usrTiers;
    }

    public Integer getUsrPayeContrat() {
        return usrPayeContrat;
    }

    public void setUsrPayeContrat(Integer usrPayeContrat) {
        this.usrPayeContrat = usrPayeContrat;
    }

    public Integer getUsrPayeBulletin() {
        return usrPayeBulletin;
    }

    public void setUsrPayeBulletin(Integer usrPayeBulletin) {
        this.usrPayeBulletin = usrPayeBulletin;
    }

    public Integer getUsrPayeService() {
        return usrPayeService;
    }

    public void setUsrPayeService(Integer usrPayeService) {
        this.usrPayeService = usrPayeService;
    }

    public Integer getUsrPaye() {
        return usrPaye;
    }

    public void setUsrPaye(Integer usrPaye) {
        this.usrPaye = usrPaye;
    }

    public Integer getUsrPayeAlerte() {
        return usrPayeAlerte;
    }

    public void setUsrPayeAlerte(Integer usrPayeAlerte) {
        this.usrPayeAlerte = usrPayeAlerte;
    }

    public Integer getUsrRecusJour() {
        return usrRecusJour;
    }

    public void setUsrRecusJour(Integer usrRecusJour) {
        this.usrRecusJour = usrRecusJour;
    }

    public Integer getUsrRecus() {
        return usrRecus;
    }

    public void setUsrRecus(Integer usrRecus) {
        this.usrRecus = usrRecus;
    }

    public Integer getUsrCaissierService() {
        return usrCaissierService;
    }

    public void setUsrCaissierService(Integer usrCaissierService) {
        this.usrCaissierService = usrCaissierService;
    }

    public Integer getUsrCaissierDelete() {
        return usrCaissierDelete;
    }

    public void setUsrCaissierDelete(Integer usrCaissierDelete) {
        this.usrCaissierDelete = usrCaissierDelete;
    }

    public Integer getUsrCaissierAnnule() {
        return usrCaissierAnnule;
    }

    public void setUsrCaissierAnnule(Integer usrCaissierAnnule) {
        this.usrCaissierAnnule = usrCaissierAnnule;
    }

    public Integer getUsrModif() {
        return usrModif;
    }

    public void setUsrModif(Integer usrModif) {
        this.usrModif = usrModif;
    }

    public Integer getUsrTransfert() {
        return usrTransfert;
    }

    public void setUsrTransfert(Integer usrTransfert) {
        this.usrTransfert = usrTransfert;
    }

    public Integer getUsrRecette() {
        return usrRecette;
    }

    public void setUsrRecette(Integer usrRecette) {
        this.usrRecette = usrRecette;
    }

    public Integer getUsrDepense() {
        return usrDepense;
    }

    public void setUsrDepense(Integer usrDepense) {
        this.usrDepense = usrDepense;
    }

    public Integer getUsrCaissier() {
        return usrCaissier;
    }

    public void setUsrCaissier(Integer usrCaissier) {
        this.usrCaissier = usrCaissier;
    }

    public Integer getUsrRespCaissier() {
        return usrRespCaissier;
    }

    public void setUsrRespCaissier(Integer usrRespCaissier) {
        this.usrRespCaissier = usrRespCaissier;
    }

    public Double getUsrPv() {
        return usrPv;
    }

    public void setUsrPv(Double usrPv) {
        this.usrPv = usrPv;
    }

    public Double getUsrPr() {
        return usrPr;
    }

    public void setUsrPr(Double usrPr) {
        this.usrPr = usrPr;
    }

    public String getUsrStartup() {
        return usrStartup;
    }

    public void setUsrStartup(String usrStartup) {
        this.usrStartup = usrStartup;
    }

    public String getUsrSiteSecondaire() {
        return usrSiteSecondaire;
    }

    public void setUsrSiteSecondaire(String usrSiteSecondaire) {
        this.usrSiteSecondaire = usrSiteSecondaire;
    }

    public String getUsrDepartementSecondaire() {
        return usrDepartementSecondaire;
    }

    public void setUsrDepartementSecondaire(String usrDepartementSecondaire) {
        this.usrDepartementSecondaire = usrDepartementSecondaire;
    }

    public String getUsrServiceSecondaire() {
        return usrServiceSecondaire;
    }

    public void setUsrServiceSecondaire(String usrServiceSecondaire) {
        this.usrServiceSecondaire = usrServiceSecondaire;
    }

    public String getUsrSite() {
        return usrSite;
    }

    public void setUsrSite(String usrSite) {
        this.usrSite = usrSite;
    }

    public String getUsrDepartement() {
        return usrDepartement;
    }

    public void setUsrDepartement(String usrDepartement) {
        this.usrDepartement = usrDepartement;
    }

    public String getUsrService() {
        return usrService;
    }

    public void setUsrService(String usrService) {
        this.usrService = usrService;
    }

    public Integer getUsrDepotSel() {
        return usrDepotSel;
    }

    public void setUsrDepotSel(Integer usrDepotSel) {
        this.usrDepotSel = usrDepotSel;
    }

    public String getUsrSignature() {
        return usrSignature;
    }

    public void setUsrSignature(String usrSignature) {
        this.usrSignature = usrSignature;
    }

    public String getUsrPhoto() {
        return usrPhoto;
    }

    public void setUsrPhoto(String usrPhoto) {
        this.usrPhoto = usrPhoto;
    }

    public Double getUsrNbLog() {
        return usrNbLog;
    }

    public void setUsrNbLog(Double usrNbLog) {
        this.usrNbLog = usrNbLog;
    }

    public Instant getUsrFirstLog() {
        return usrFirstLog;
    }

    public void setUsrFirstLog(Instant usrFirstLog) {
        this.usrFirstLog = usrFirstLog;
    }

    public Instant getUsrLastLog() {
        return usrLastLog;
    }

    public void setUsrLastLog(Instant usrLastLog) {
        this.usrLastLog = usrLastLog;
    }

    public String getUsrAol() {
        return usrAol;
    }

    public void setUsrAol(String usrAol) {
        this.usrAol = usrAol;
    }

    public String getUsrSkype() {
        return usrSkype;
    }

    public void setUsrSkype(String usrSkype) {
        this.usrSkype = usrSkype;
    }

    public String getUsrMsn() {
        return usrMsn;
    }

    public void setUsrMsn(String usrMsn) {
        this.usrMsn = usrMsn;
    }

    public String getUsrYahoo() {
        return usrYahoo;
    }

    public void setUsrYahoo(String usrYahoo) {
        this.usrYahoo = usrYahoo;
    }

    public String getUsrMail() {
        return usrMail;
    }

    public void setUsrMail(String usrMail) {
        this.usrMail = usrMail;
    }

    public Integer getUsrAccesMail() {
        return usrAccesMail;
    }

    public void setUsrAccesMail(Integer usrAccesMail) {
        this.usrAccesMail = usrAccesMail;
    }

    public String getUsrCel3() {
        return usrCel3;
    }

    public void setUsrCel3(String usrCel3) {
        this.usrCel3 = usrCel3;
    }

    public String getUsrCel2() {
        return usrCel2;
    }

    public void setUsrCel2(String usrCel2) {
        this.usrCel2 = usrCel2;
    }

    public String getUsrCel1() {
        return usrCel1;
    }

    public void setUsrCel1(String usrCel1) {
        this.usrCel1 = usrCel1;
    }

    public String getUsrTelDomicile() {
        return usrTelDomicile;
    }

    public void setUsrTelDomicile(String usrTelDomicile) {
        this.usrTelDomicile = usrTelDomicile;
    }

    public String getUsrTelBureau() {
        return usrTelBureau;
    }

    public void setUsrTelBureau(String usrTelBureau) {
        this.usrTelBureau = usrTelBureau;
    }

    public String getUsrNomPays() {
        return usrNomPays;
    }

    public void setUsrNomPays(String usrNomPays) {
        this.usrNomPays = usrNomPays;
    }

    public String getUsrVille() {
        return usrVille;
    }

    public void setUsrVille(String usrVille) {
        this.usrVille = usrVille;
    }

    public String getUsrBp() {
        return usrBp;
    }

    public void setUsrBp(String usrBp) {
        this.usrBp = usrBp;
    }

    public String getUsrAdresse() {
        return usrAdresse;
    }

    public void setUsrAdresse(String usrAdresse) {
        this.usrAdresse = usrAdresse;
    }

    public String getUsrMetier() {
        return usrMetier;
    }

    public void setUsrMetier(String usrMetier) {
        this.usrMetier = usrMetier;
    }

    public String getUsrFonction() {
        return usrFonction;
    }

    public void setUsrFonction(String usrFonction) {
        this.usrFonction = usrFonction;
    }

    public String getUsrCollaboration() {
        return usrCollaboration;
    }

    public void setUsrCollaboration(String usrCollaboration) {
        this.usrCollaboration = usrCollaboration;
    }

    public String getUsrThemes() {
        return usrThemes;
    }

    public void setUsrThemes(String usrThemes) {
        this.usrThemes = usrThemes;
    }

    public String getUsrTemplates() {
        return usrTemplates;
    }

    public void setUsrTemplates(String usrTemplates) {
        this.usrTemplates = usrTemplates;
    }

    public String getUsrLangue() {
        return usrLangue;
    }

    public void setUsrLangue(String usrLangue) {
        this.usrLangue = usrLangue;
    }

    public String getUsrAnniversaire() {
        return usrAnniversaire;
    }

    public void setUsrAnniversaire(String usrAnniversaire) {
        this.usrAnniversaire = usrAnniversaire;
    }

    public LocalDate getUsrDateNaissance() {
        return usrDateNaissance;
    }

    public void setUsrDateNaissance(LocalDate usrDateNaissance) {
        this.usrDateNaissance = usrDateNaissance;
    }

    public Integer getUsrSysteme() {
        return usrSysteme;
    }

    public void setUsrSysteme(Integer usrSysteme) {
        this.usrSysteme = usrSysteme;
    }

    public Integer getUsrConnexion() {
        return usrConnexion;
    }

    public void setUsrConnexion(Integer usrConnexion) {
        this.usrConnexion = usrConnexion;
    }

    public String getUsrCodeSecret() {
        return usrCodeSecret;
    }

    public void setUsrCodeSecret(String usrCodeSecret) {
        this.usrCodeSecret = usrCodeSecret;
    }

    public Integer getUsrChange() {
        return usrChange;
    }

    public void setUsrChange(Integer usrChange) {
        this.usrChange = usrChange;
    }

    public String getUsrPwEspaceClient() {
        return usrPwEspaceClient;
    }

    public void setUsrPwEspaceClient(String usrPwEspaceClient) {
        this.usrPwEspaceClient = usrPwEspaceClient;
    }

    public String getUsrPw() {
        return usrPw;
    }

    public void setUsrPw(String usrPw) {
        this.usrPw = usrPw;
    }

    public String getUsrLogin() {
        return usrLogin;
    }

    public void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getUsrCompte() {
        return usrCompte;
    }

    public void setUsrCompte(String usrCompte) {
        this.usrCompte = usrCompte;
    }

    public String getUsrPatronyme() {
        return usrPatronyme;
    }

    public void setUsrPatronyme(String usrPatronyme) {
        this.usrPatronyme = usrPatronyme;
    }

    public String getUsrInitiale() {
        return usrInitiale;
    }

    public void setUsrInitiale(String usrInitiale) {
        this.usrInitiale = usrInitiale;
    }

    public String getUsrPrenom() {
        return usrPrenom;
    }

    public void setUsrPrenom(String usrPrenom) {
        this.usrPrenom = usrPrenom;
    }

    public String getUsrNom() {
        return usrNom;
    }

    public void setUsrNom(String usrNom) {
        this.usrNom = usrNom;
    }

    public String getUsrCivilite() {
        return usrCivilite;
    }

    public void setUsrCivilite(String usrCivilite) {
        this.usrCivilite = usrCivilite;
    }

    public Integer getUsrEtat() {
        return usrEtat;
    }

    public void setUsrEtat(Integer usrEtat) {
        this.usrEtat = usrEtat;
    }

    public Long getUsrUserModif() {
        return usrUserModif;
    }

    public void setUsrUserModif(Long usrUserModif) {
        this.usrUserModif = usrUserModif;
    }

    public Long getUsrUserCreat() {
        return usrUserCreat;
    }

    public void setUsrUserCreat(Long usrUserCreat) {
        this.usrUserCreat = usrUserCreat;
    }

    public Instant getUsrDateModif() {
        return usrDateModif;
    }

    public void setUsrDateModif(Instant usrDateModif) {
        this.usrDateModif = usrDateModif;
    }

    public Instant getUsrDateCreat() {
        return usrDateCreat;
    }

    public void setUsrDateCreat(Instant usrDateCreat) {
        this.usrDateCreat = usrDateCreat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
