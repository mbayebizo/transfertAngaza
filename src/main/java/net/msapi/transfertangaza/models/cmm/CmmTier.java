package net.msapi.transfertangaza.models.cmm;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Table(name = "cmm_tiers")
@Entity
public class CmmTier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tie_id", nullable = false)
    private Long id;

    @Column(name = "tie_date_creat")
    private Instant tieDateCreat;

    @Column(name = "tie_date_modif")
    private Instant tieDateModif;

    @Column(name = "tie_user_creat")
    private Long tieUserCreat;

    @Column(name = "tie_user_modif")
    private Long tieUserModif;

    @Column(name = "tie_etat")
    private Integer tieEtat;

    @Column(name = "tie_raison_sociale_nom", length = 100)
    private String tieRaisonSocialeNom;

    @Column(name = "tie_sigle", length = 100)
    private String tieSigle;

    @Column(name = "tie_id_structure")
    private Long tieIdStructure;

    @Column(name = "tie_type", length = 4)
    private String tieType;

    @Column(name = "tie_genre", length = 3)
    private String tieGenre;

    @Column(name = "tie_categorie", length = 40)
    private String tieCategorie;

    @Column(name = "tie_civilite", length = 20)
    private String tieCivilite;

    @Column(name = "tie_nom_pays", length = 50)
    private String tieNomPays;

    @Column(name = "tie_code_pays", length = 4)
    private String tieCodePays;

    @Column(name = "tie_devise", length = 3)
    private String tieDevise;

    @Column(name = "tie_format_devise")
    private Integer tieFormatDevise;

    @Column(name = "tie_langue", length = 20)
    private String tieLangue;

    @Column(name = "tie_type_adresse")
    private Integer tieTypeAdresse;

    @Column(name = "tie_tel_dom", length = 50)
    private String tieTelDom;

    @Column(name = "tie_cel1", length = 50)
    private String tieCel1;

    @Column(name = "tie_cel2", length = 50)
    private String tieCel2;

    @Column(name = "tie_cel3", length = 50)
    private String tieCel3;

    @Column(name = "tie_tel_voiture", length = 20)
    private String tieTelVoiture;

    @Column(name = "tie_prenom", length = 100)
    private String tiePrenom;

    @Column(name = "tie_nom_jf", length = 100)
    private String tieNomJf;

    @Column(name = "tie_surnom", length = 50)
    private String tieSurnom;

    @Column(name = "tie_sexe")
    private Integer tieSexe;

    @Column(name = "tie_date_naissance")
    private LocalDate tieDateNaissance;

    @Column(name = "tie_lieu_naissance", length = 100)
    private String tieLieuNaissance;

    @Column(name = "tie_anniversaire", length = 5)
    private String tieAnniversaire;

    @Column(name = "tie_date_mariage")
    private LocalDate tieDateMariage;

    @Column(name = "tie_anniversaire_mariage", length = 5)
    private String tieAnniversaireMariage;

    @Column(name = "tie_date_deces")
    private LocalDate tieDateDeces;

    @Column(name = "tie_anniversaire_deces", length = 5)
    private String tieAnniversaireDeces;

    @Column(name = "tie_observations", length = 100)
    private String tieObservations;

    @Column(name = "tie_activite1", length = 100)
    private String tieActivite1;

    @Column(name = "tie_activite2", length = 100)
    private String tieActivite2;

    @Column(name = "tie_source", length = 50)
    private String tieSource;

    @Column(name = "tie_visibilite")
    private Integer tieVisibilite;

    @Column(name = "tie_visibilite_grp", length = 10)
    private String tieVisibiliteGrp;

    @Column(name = "tie_visibilite_user")
    private Long tieVisibiliteUser;

    @Column(name = "tie_adresse", length = 100)
    private String tieAdresse;

    @Column(name = "tie_rue", length = 50)
    private String tieRue;

    @Column(name = "tie_lot", length = 50)
    private String tieLot;

    @Column(name = "tie_ilot", length = 50)
    private String tieIlot;

    @Column(name = "tie_batiment", length = 50)
    private String tieBatiment;

    @Column(name = "tie_porte", length = 10)
    private String tiePorte;

    @Column(name = "tie_etage", length = 10)
    private String tieEtage;

    @Column(name = "tie_ascensseur", length = 10)
    private String tieAscensseur;

    @Column(name = "tie_quartier", length = 50)
    private String tieQuartier;

    @Column(name = "tie_commune", length = 50)
    private String tieCommune;

    @Column(name = "tie_depart", length = 50)
    private String tieDepart;

    @Column(name = "tie_zone", length = 50)
    private String tieZone;

    @Column(name = "tie_bp", length = 20)
    private String tieBp;

    @Column(name = "tie_cedex", length = 30)
    private String tieCedex;

    @Column(name = "tie_ville", length = 50)
    private String tieVille;

    @Column(name = "tie_bur_tel1", length = 50)
    private String tieBurTel1;

    @Column(name = "tie_bur_tel2", length = 50)
    private String tieBurTel2;

    @Column(name = "tie_bur_tel3", length = 50)
    private String tieBurTel3;

    @Column(name = "tie_bur_fax", length = 50)
    private String tieBurFax;

    @Column(name = "tie_telex", length = 20)
    private String tieTelex;

    @Column(name = "tie_yahoo", length = 100)
    private String tieYahoo;

    @Column(name = "tie_msn", length = 100)
    private String tieMsn;

    @Column(name = "tie_skype", length = 100)
    private String tieSkype;

    @Column(name = "tie_aol", length = 100)
    private String tieAol;

    @Column(name = "tie_mail1", length = 100)
    private String tieMail1;

    @Column(name = "tie_mail2", length = 100)
    private String tieMail2;

    @Column(name = "tie_mail3", length = 100)
    private String tieMail3;

    @Column(name = "tie_mail4", length = 100)
    private String tieMail4;

    @Column(name = "tie_mail5", length = 100)
    private String tieMail5;

    @Column(name = "tie_web", length = 100)
    private String tieWeb;

    @Column(name = "tie_mode_reg", length = 100)
    private String tieModeReg;

    @Column(name = "tie_type_reg")
    private Integer tieTypeReg;

    @Column(name = "tie_nb_echeance")
    private Integer tieNbEcheance;

    @Column(name = "tie_nb_arrondi")
    private Integer tieNbArrondi;

    @Column(name = "tie_journal_reg", length = 10)
    private String tieJournalReg;

    @Column(name = "tie_condition_reg", length = 100)
    private String tieConditionReg;

    @Column(name = "tie_plafond")
    private Double tiePlafond;

    @Column(name = "tie_depotavance")
    private Double tieDepotavance;

    @Column(name = "tie_capatente")
    private Double tieCapatente;

    @Column(name = "tie_plaf_patente")
    private Double tiePlafPatente;

    @Column(name = "tie_compte_bloque")
    private Integer tieCompteBloque;

    @Column(name = "tie_cheque_interdit")
    private Integer tieChequeInterdit;

    @Column(name = "tie_surveille")
    private Integer tieSurveille;

    @Column(name = "tie_nb_incident")
    private Integer tieNbIncident;

    @Column(name = "tie_nom_famille", length = 50)
    private String tieNomFamille;

    @Column(name = "tie_serie", length = 4)
    private String tieSerie;

    @Column(name = "tie_exo_douane")
    private Integer tieExoDouane;

    @Column(name = "tie_exo_tva")
    private Integer tieExoTva;

    @Column(name = "tie_transfert_cpte")
    private Integer tieTransfertCpte;

    @Column(name = "tie_depot", length = 121)
    private String tieDepot;

    @Column(name = "tie_escompte")
    private Double tieEscompte;

    @Column(name = "tie_fac_pr")
    private Integer tieFacPr;

    @Column(name = "tie_nom_banque", length = 50)
    private String tieNomBanque;

    @Column(name = "tie_adresse_banque", length = 200)
    private String tieAdresseBanque;

    @Column(name = "tie_num_banque", length = 6)
    private String tieNumBanque;

    @Column(name = "tie_guichet_banque", length = 6)
    private String tieGuichetBanque;

    @Column(name = "tie_compte_banque", length = 20)
    private String tieCompteBanque;

    @Column(name = "tie_cle_banque", length = 2)
    private String tieCleBanque;

    @Column(name = "tie_iban", length = 35)
    private String tieIban;

    @Column(name = "tie_swift", length = 20)
    private String tieSwift;

    @Column(name = "tie_compte_0", length = 20)
    private String tieCompte0;

    @Column(name = "tie_compte_1", length = 20)
    private String tieCompte1;

    @Column(name = "tie_compte_2", length = 20)
    private String tieCompte2;

    @Column(name = "tie_compte_3", length = 20)
    private String tieCompte3;

    @Column(name = "tie_compte_4", length = 20)
    private String tieCompte4;

    @Column(name = "tie_compte_sage", length = 20)
    private String tieCompteSage;

    @Column(name = "tie_compte_etat", length = 20)
    private String tieCompteEtat;

    @Column(name = "tie_note_auto")
    private Integer tieNoteAuto;

    @Column(name = "tie_note_man", length = 20)
    private String tieNoteMan;

    @Column(name = "tie_no_use_1", length = 20)
    private String tieNoUse1;

    @Column(name = "tie_no_use_2", length = 20)
    private String tieNoUse2;

    @Column(name = "tie_epoux", length = 50)
    private String tieEpoux;

    @Column(name = "tie_nom_pere", length = 50)
    private String tieNomPere;

    @Column(name = "tie_nom_mere", length = 50)
    private String tieNomMere;

    @Column(name = "tie_ci_num", length = 20)
    private String tieCiNum;

    @Column(name = "tie_ci_date", length = 50)
    private String tieCiDate;

    @Column(name = "tie_ci_lieu", length = 50)
    private String tieCiLieu;

    @Column(name = "tie_profession", length = 50)
    private String tieProfession;

    @Column(name = "tie_niveau_etude", length = 20)
    private String tieNiveauEtude;

    @Column(name = "tie_employeur", length = 50)
    private String tieEmployeur;

    @Column(name = "tie_adresse_employeur", length = 50)
    private String tieAdresseEmployeur;

    @Column(name = "tie_bp_employeur", length = 20)
    private String tieBpEmployeur;

    @Column(name = "tie_ville_employeur", length = 50)
    private String tieVilleEmployeur;

    @Column(name = "tie_tel_employeur", length = 50)
    private String tieTelEmployeur;

    @Column(name = "tie_num1", length = 20)
    private String tieNum1;

    @Column(name = "tie_num2", length = 20)
    private String tieNum2;

    @Column(name = "tie_num3", length = 20)
    private String tieNum3;

    @Column(name = "tie_num4", length = 20)
    private String tieNum4;

    @Column(name = "tie_num5", length = 20)
    private String tieNum5;

    @Column(name = "tie_num6", length = 20)
    private String tieNum6;

    @Column(name = "tie_num7", length = 20)
    private String tieNum7;

    @Column(name = "tie_num8", length = 20)
    private String tieNum8;

    @Column(name = "tie_num9", length = 20)
    private String tieNum9;

    @Column(name = "tie_num10", length = 20)
    private String tieNum10;

    @Column(name = "tie_num11", length = 20)
    private String tieNum11;

    @Column(name = "tie_num12", length = 20)
    private String tieNum12;

    @Column(name = "tie_num13", length = 20)
    private String tieNum13;

    @Column(name = "tie_num14", length = 20)
    private String tieNum14;

    @Column(name = "tie_num15", length = 20)
    private String tieNum15;

    @Column(name = "tie_num16", length = 20)
    private String tieNum16;

    @Column(name = "tie_num17", length = 20)
    private String tieNum17;

    @Column(name = "tie_num18", length = 20)
    private String tieNum18;

    @Column(name = "tie_num19", length = 20)
    private String tieNum19;

    @Column(name = "tie_num20", length = 20)
    private String tieNum20;

    @Column(name = "tie_pdv", length = 20)
    private String tiePdv;

    @Column(name = "tie_secteur", length = 20)
    private String tieSecteur;

    @Column(name = "tie_region", length = 20)
    private String tieRegion;

    @Column(name = "tie_assurt1")
    private Double tieAssurt1;

    @Column(name = "tie_assurt2")
    private Double tieAssurt2;

    @Column(name = "tie_assurt3")
    private Double tieAssurt3;

    @Column(name = "tie_bnq1")
    private Double tieBnq1;

    @Column(name = "tie_bnq2")
    private Double tieBnq2;

    @Column(name = "tie_bnq3")
    private Double tieBnq3;

    @Column(name = "tie_bnq4")
    private Double tieBnq4;

    @Column(name = "tie_bnq5")
    private Double tieBnq5;

    @Column(name = "tie_bnq6")
    private Double tieBnq6;

    @Column(name = "tie_bnq7")
    private Double tieBnq7;

    @Column(name = "tie_photo", length = 50)
    private String tiePhoto;

    @Column(name = "tie_assujettissement")
    private Integer tieAssujettissement;

    @Column(name = "tie_declaration_tva")
    private Integer tieDeclarationTva;

    @Column(name = "tie_fiscal", length = 50)
    private String tieFiscal;

    @Column(name = "tie_taux_com")
    private Double tieTauxCom;

    @Column(name = "tie_mode_com")
    private Integer tieModeCom;

    @Column(name = "tie_dte_reglement")
    private LocalDate tieDteReglement;

    @Column(name = "tie_dte_document1")
    private Instant tieDteDocument1;

    @Column(name = "tie_dte_document2")
    private Instant tieDteDocument2;

    @Column(name = "tie_dte_document3")
    private Instant tieDteDocument3;

    @Column(name = "tie_dte_document4")
    private Instant tieDteDocument4;

    @Column(name = "tie_dte_document5")
    private Instant tieDteDocument5;

    @Column(name = "tie_dte_document6")
    private Instant tieDteDocument6;

    @Column(name = "tie_dte_document7")
    private Instant tieDteDocument7;

    @Column(name = "tie_coef_pv_medical")
    private Double tieCoefPvMedical;

    @Column(name = "tie_convention_gele")
    private Boolean tieConventionGele;

    @Column(name = "tie_motif_gele", length = 50)
    private String tieMotifGele;

    @Column(name = "tie_lettre_garantie")
    private Boolean tieLettreGarantie;

    @Column(name = "tie_id_groupe")
    private Long tieIdGroupe;

    @Column(name = "tie_id_old")
    private Long tieIdOld;

    @Column(name = "tie_sit_fam")
    private Integer tieSitFam;

    @Column(name = "tie_nb_charge")
    private Integer tieNbCharge;

    @Column(name = "tie_nb_enf")
    private Integer tieNbEnf;

    @Column(name = "tie_habitation")
    private Integer tieHabitation;

    @Column(name = "tie_date_demande_ouverture")
    private LocalDate tieDateDemandeOuverture;

    @Column(name = "tie_date_demande_reponse")
    private LocalDate tieDateDemandeReponse;

    @Column(name = "tie_date_demande_etat")
    private Integer tieDateDemandeEtat;

    @Column(name = "tie_date_demande_type")
    private Integer tieDateDemandeType;

    @Column(name = "tie_date_demande_refus", length = 50)
    private String tieDateDemandeRefus;

    @Column(name = "tie_date_demande_signature", length = 50)
    private String tieDateDemandeSignature;

    @Lob
    @Column(name = "tie_prod_exo_tva")
    private String tieProdExoTva;

    @Column(name = "tie_x")
    private Long tieX;

    @Column(name = "tie_y")
    private Long tieY;

    @Column(name = "tie_montant_mini")
    private Double tieMontantMini;

    @Column(name = "tie_css")
    private Integer tieCss;

    @Column(name = "tie_origine")
    private Integer tieOrigine;

    @Column(name = "tie_vehicule")
    private Integer tieVehicule;

    @Column(name = "tie_sit_bnq")
    private Integer tieSitBnq;

    @Column(name = "tie_sit_epg")
    private Integer tieSitEpg;

    @Column(name = "tie_revenu")
    private Integer tieRevenu;

    @Column(name = "tie_interet", length = 100)
    private String tieInteret;

    @Column(name = "tie_mode_fin", length = 50)
    private String tieModeFin;

    @Column(name = "tie_usage")
    private Integer tieUsage;

    @Column(name = "tie_date_contact")
    private LocalDate tieDateContact;

    public LocalDate getTieDateContact() {
        return tieDateContact;
    }

    public void setTieDateContact(LocalDate tieDateContact) {
        this.tieDateContact = tieDateContact;
    }

    public Integer getTieUsage() {
        return tieUsage;
    }

    public void setTieUsage(Integer tieUsage) {
        this.tieUsage = tieUsage;
    }

    public String getTieModeFin() {
        return tieModeFin;
    }

    public void setTieModeFin(String tieModeFin) {
        this.tieModeFin = tieModeFin;
    }

    public String getTieInteret() {
        return tieInteret;
    }

    public void setTieInteret(String tieInteret) {
        this.tieInteret = tieInteret;
    }

    public Integer getTieRevenu() {
        return tieRevenu;
    }

    public void setTieRevenu(Integer tieRevenu) {
        this.tieRevenu = tieRevenu;
    }

    public Integer getTieSitEpg() {
        return tieSitEpg;
    }

    public void setTieSitEpg(Integer tieSitEpg) {
        this.tieSitEpg = tieSitEpg;
    }

    public Integer getTieSitBnq() {
        return tieSitBnq;
    }

    public void setTieSitBnq(Integer tieSitBnq) {
        this.tieSitBnq = tieSitBnq;
    }

    public Integer getTieVehicule() {
        return tieVehicule;
    }

    public void setTieVehicule(Integer tieVehicule) {
        this.tieVehicule = tieVehicule;
    }

    public Integer getTieOrigine() {
        return tieOrigine;
    }

    public void setTieOrigine(Integer tieOrigine) {
        this.tieOrigine = tieOrigine;
    }

    public Integer getTieCss() {
        return tieCss;
    }

    public void setTieCss(Integer tieCss) {
        this.tieCss = tieCss;
    }

    public Double getTieMontantMini() {
        return tieMontantMini;
    }

    public void setTieMontantMini(Double tieMontantMini) {
        this.tieMontantMini = tieMontantMini;
    }

    public Long getTieY() {
        return tieY;
    }

    public void setTieY(Long tieY) {
        this.tieY = tieY;
    }

    public Long getTieX() {
        return tieX;
    }

    public void setTieX(Long tieX) {
        this.tieX = tieX;
    }

    public String getTieProdExoTva() {
        return tieProdExoTva;
    }

    public void setTieProdExoTva(String tieProdExoTva) {
        this.tieProdExoTva = tieProdExoTva;
    }

    public String getTieDateDemandeSignature() {
        return tieDateDemandeSignature;
    }

    public void setTieDateDemandeSignature(String tieDateDemandeSignature) {
        this.tieDateDemandeSignature = tieDateDemandeSignature;
    }

    public String getTieDateDemandeRefus() {
        return tieDateDemandeRefus;
    }

    public void setTieDateDemandeRefus(String tieDateDemandeRefus) {
        this.tieDateDemandeRefus = tieDateDemandeRefus;
    }

    public Integer getTieDateDemandeType() {
        return tieDateDemandeType;
    }

    public void setTieDateDemandeType(Integer tieDateDemandeType) {
        this.tieDateDemandeType = tieDateDemandeType;
    }

    public Integer getTieDateDemandeEtat() {
        return tieDateDemandeEtat;
    }

    public void setTieDateDemandeEtat(Integer tieDateDemandeEtat) {
        this.tieDateDemandeEtat = tieDateDemandeEtat;
    }

    public LocalDate getTieDateDemandeReponse() {
        return tieDateDemandeReponse;
    }

    public void setTieDateDemandeReponse(LocalDate tieDateDemandeReponse) {
        this.tieDateDemandeReponse = tieDateDemandeReponse;
    }

    public LocalDate getTieDateDemandeOuverture() {
        return tieDateDemandeOuverture;
    }

    public void setTieDateDemandeOuverture(LocalDate tieDateDemandeOuverture) {
        this.tieDateDemandeOuverture = tieDateDemandeOuverture;
    }

    public Integer getTieHabitation() {
        return tieHabitation;
    }

    public void setTieHabitation(Integer tieHabitation) {
        this.tieHabitation = tieHabitation;
    }

    public Integer getTieNbEnf() {
        return tieNbEnf;
    }

    public void setTieNbEnf(Integer tieNbEnf) {
        this.tieNbEnf = tieNbEnf;
    }

    public Integer getTieNbCharge() {
        return tieNbCharge;
    }

    public void setTieNbCharge(Integer tieNbCharge) {
        this.tieNbCharge = tieNbCharge;
    }

    public Integer getTieSitFam() {
        return tieSitFam;
    }

    public void setTieSitFam(Integer tieSitFam) {
        this.tieSitFam = tieSitFam;
    }

    public Long getTieIdOld() {
        return tieIdOld;
    }

    public void setTieIdOld(Long tieIdOld) {
        this.tieIdOld = tieIdOld;
    }

    public Long getTieIdGroupe() {
        return tieIdGroupe;
    }

    public void setTieIdGroupe(Long tieIdGroupe) {
        this.tieIdGroupe = tieIdGroupe;
    }

    public Boolean getTieLettreGarantie() {
        return tieLettreGarantie;
    }

    public void setTieLettreGarantie(Boolean tieLettreGarantie) {
        this.tieLettreGarantie = tieLettreGarantie;
    }

    public String getTieMotifGele() {
        return tieMotifGele;
    }

    public void setTieMotifGele(String tieMotifGele) {
        this.tieMotifGele = tieMotifGele;
    }

    public Boolean getTieConventionGele() {
        return tieConventionGele;
    }

    public void setTieConventionGele(Boolean tieConventionGele) {
        this.tieConventionGele = tieConventionGele;
    }

    public Double getTieCoefPvMedical() {
        return tieCoefPvMedical;
    }

    public void setTieCoefPvMedical(Double tieCoefPvMedical) {
        this.tieCoefPvMedical = tieCoefPvMedical;
    }

    public Instant getTieDteDocument7() {
        return tieDteDocument7;
    }

    public void setTieDteDocument7(Instant tieDteDocument7) {
        this.tieDteDocument7 = tieDteDocument7;
    }

    public Instant getTieDteDocument6() {
        return tieDteDocument6;
    }

    public void setTieDteDocument6(Instant tieDteDocument6) {
        this.tieDteDocument6 = tieDteDocument6;
    }

    public Instant getTieDteDocument5() {
        return tieDteDocument5;
    }

    public void setTieDteDocument5(Instant tieDteDocument5) {
        this.tieDteDocument5 = tieDteDocument5;
    }

    public Instant getTieDteDocument4() {
        return tieDteDocument4;
    }

    public void setTieDteDocument4(Instant tieDteDocument4) {
        this.tieDteDocument4 = tieDteDocument4;
    }

    public Instant getTieDteDocument3() {
        return tieDteDocument3;
    }

    public void setTieDteDocument3(Instant tieDteDocument3) {
        this.tieDteDocument3 = tieDteDocument3;
    }

    public Instant getTieDteDocument2() {
        return tieDteDocument2;
    }

    public void setTieDteDocument2(Instant tieDteDocument2) {
        this.tieDteDocument2 = tieDteDocument2;
    }

    public Instant getTieDteDocument1() {
        return tieDteDocument1;
    }

    public void setTieDteDocument1(Instant tieDteDocument1) {
        this.tieDteDocument1 = tieDteDocument1;
    }

    public LocalDate getTieDteReglement() {
        return tieDteReglement;
    }

    public void setTieDteReglement(LocalDate tieDteReglement) {
        this.tieDteReglement = tieDteReglement;
    }

    public Integer getTieModeCom() {
        return tieModeCom;
    }

    public void setTieModeCom(Integer tieModeCom) {
        this.tieModeCom = tieModeCom;
    }

    public Double getTieTauxCom() {
        return tieTauxCom;
    }

    public void setTieTauxCom(Double tieTauxCom) {
        this.tieTauxCom = tieTauxCom;
    }

    public String getTieFiscal() {
        return tieFiscal;
    }

    public void setTieFiscal(String tieFiscal) {
        this.tieFiscal = tieFiscal;
    }

    public Integer getTieDeclarationTva() {
        return tieDeclarationTva;
    }

    public void setTieDeclarationTva(Integer tieDeclarationTva) {
        this.tieDeclarationTva = tieDeclarationTva;
    }

    public Integer getTieAssujettissement() {
        return tieAssujettissement;
    }

    public void setTieAssujettissement(Integer tieAssujettissement) {
        this.tieAssujettissement = tieAssujettissement;
    }

    public String getTiePhoto() {
        return tiePhoto;
    }

    public void setTiePhoto(String tiePhoto) {
        this.tiePhoto = tiePhoto;
    }

    public Double getTieBnq7() {
        return tieBnq7;
    }

    public void setTieBnq7(Double tieBnq7) {
        this.tieBnq7 = tieBnq7;
    }

    public Double getTieBnq6() {
        return tieBnq6;
    }

    public void setTieBnq6(Double tieBnq6) {
        this.tieBnq6 = tieBnq6;
    }

    public Double getTieBnq5() {
        return tieBnq5;
    }

    public void setTieBnq5(Double tieBnq5) {
        this.tieBnq5 = tieBnq5;
    }

    public Double getTieBnq4() {
        return tieBnq4;
    }

    public void setTieBnq4(Double tieBnq4) {
        this.tieBnq4 = tieBnq4;
    }

    public Double getTieBnq3() {
        return tieBnq3;
    }

    public void setTieBnq3(Double tieBnq3) {
        this.tieBnq3 = tieBnq3;
    }

    public Double getTieBnq2() {
        return tieBnq2;
    }

    public void setTieBnq2(Double tieBnq2) {
        this.tieBnq2 = tieBnq2;
    }

    public Double getTieBnq1() {
        return tieBnq1;
    }

    public void setTieBnq1(Double tieBnq1) {
        this.tieBnq1 = tieBnq1;
    }

    public Double getTieAssurt3() {
        return tieAssurt3;
    }

    public void setTieAssurt3(Double tieAssurt3) {
        this.tieAssurt3 = tieAssurt3;
    }

    public Double getTieAssurt2() {
        return tieAssurt2;
    }

    public void setTieAssurt2(Double tieAssurt2) {
        this.tieAssurt2 = tieAssurt2;
    }

    public Double getTieAssurt1() {
        return tieAssurt1;
    }

    public void setTieAssurt1(Double tieAssurt1) {
        this.tieAssurt1 = tieAssurt1;
    }

    public String getTieRegion() {
        return tieRegion;
    }

    public void setTieRegion(String tieRegion) {
        this.tieRegion = tieRegion;
    }

    public String getTieSecteur() {
        return tieSecteur;
    }

    public void setTieSecteur(String tieSecteur) {
        this.tieSecteur = tieSecteur;
    }

    public String getTiePdv() {
        return tiePdv;
    }

    public void setTiePdv(String tiePdv) {
        this.tiePdv = tiePdv;
    }

    public String getTieNum20() {
        return tieNum20;
    }

    public void setTieNum20(String tieNum20) {
        this.tieNum20 = tieNum20;
    }

    public String getTieNum19() {
        return tieNum19;
    }

    public void setTieNum19(String tieNum19) {
        this.tieNum19 = tieNum19;
    }

    public String getTieNum18() {
        return tieNum18;
    }

    public void setTieNum18(String tieNum18) {
        this.tieNum18 = tieNum18;
    }

    public String getTieNum17() {
        return tieNum17;
    }

    public void setTieNum17(String tieNum17) {
        this.tieNum17 = tieNum17;
    }

    public String getTieNum16() {
        return tieNum16;
    }

    public void setTieNum16(String tieNum16) {
        this.tieNum16 = tieNum16;
    }

    public String getTieNum15() {
        return tieNum15;
    }

    public void setTieNum15(String tieNum15) {
        this.tieNum15 = tieNum15;
    }

    public String getTieNum14() {
        return tieNum14;
    }

    public void setTieNum14(String tieNum14) {
        this.tieNum14 = tieNum14;
    }

    public String getTieNum13() {
        return tieNum13;
    }

    public void setTieNum13(String tieNum13) {
        this.tieNum13 = tieNum13;
    }

    public String getTieNum12() {
        return tieNum12;
    }

    public void setTieNum12(String tieNum12) {
        this.tieNum12 = tieNum12;
    }

    public String getTieNum11() {
        return tieNum11;
    }

    public void setTieNum11(String tieNum11) {
        this.tieNum11 = tieNum11;
    }

    public String getTieNum10() {
        return tieNum10;
    }

    public void setTieNum10(String tieNum10) {
        this.tieNum10 = tieNum10;
    }

    public String getTieNum9() {
        return tieNum9;
    }

    public void setTieNum9(String tieNum9) {
        this.tieNum9 = tieNum9;
    }

    public String getTieNum8() {
        return tieNum8;
    }

    public void setTieNum8(String tieNum8) {
        this.tieNum8 = tieNum8;
    }

    public String getTieNum7() {
        return tieNum7;
    }

    public void setTieNum7(String tieNum7) {
        this.tieNum7 = tieNum7;
    }

    public String getTieNum6() {
        return tieNum6;
    }

    public void setTieNum6(String tieNum6) {
        this.tieNum6 = tieNum6;
    }

    public String getTieNum5() {
        return tieNum5;
    }

    public void setTieNum5(String tieNum5) {
        this.tieNum5 = tieNum5;
    }

    public String getTieNum4() {
        return tieNum4;
    }

    public void setTieNum4(String tieNum4) {
        this.tieNum4 = tieNum4;
    }

    public String getTieNum3() {
        return tieNum3;
    }

    public void setTieNum3(String tieNum3) {
        this.tieNum3 = tieNum3;
    }

    public String getTieNum2() {
        return tieNum2;
    }

    public void setTieNum2(String tieNum2) {
        this.tieNum2 = tieNum2;
    }

    public String getTieNum1() {
        return tieNum1;
    }

    public void setTieNum1(String tieNum1) {
        this.tieNum1 = tieNum1;
    }

    public String getTieTelEmployeur() {
        return tieTelEmployeur;
    }

    public void setTieTelEmployeur(String tieTelEmployeur) {
        this.tieTelEmployeur = tieTelEmployeur;
    }

    public String getTieVilleEmployeur() {
        return tieVilleEmployeur;
    }

    public void setTieVilleEmployeur(String tieVilleEmployeur) {
        this.tieVilleEmployeur = tieVilleEmployeur;
    }

    public String getTieBpEmployeur() {
        return tieBpEmployeur;
    }

    public void setTieBpEmployeur(String tieBpEmployeur) {
        this.tieBpEmployeur = tieBpEmployeur;
    }

    public String getTieAdresseEmployeur() {
        return tieAdresseEmployeur;
    }

    public void setTieAdresseEmployeur(String tieAdresseEmployeur) {
        this.tieAdresseEmployeur = tieAdresseEmployeur;
    }

    public String getTieEmployeur() {
        return tieEmployeur;
    }

    public void setTieEmployeur(String tieEmployeur) {
        this.tieEmployeur = tieEmployeur;
    }

    public String getTieNiveauEtude() {
        return tieNiveauEtude;
    }

    public void setTieNiveauEtude(String tieNiveauEtude) {
        this.tieNiveauEtude = tieNiveauEtude;
    }

    public String getTieProfession() {
        return tieProfession;
    }

    public void setTieProfession(String tieProfession) {
        this.tieProfession = tieProfession;
    }

    public String getTieCiLieu() {
        return tieCiLieu;
    }

    public void setTieCiLieu(String tieCiLieu) {
        this.tieCiLieu = tieCiLieu;
    }

    public String getTieCiDate() {
        return tieCiDate;
    }

    public void setTieCiDate(String tieCiDate) {
        this.tieCiDate = tieCiDate;
    }

    public String getTieCiNum() {
        return tieCiNum;
    }

    public void setTieCiNum(String tieCiNum) {
        this.tieCiNum = tieCiNum;
    }

    public String getTieNomMere() {
        return tieNomMere;
    }

    public void setTieNomMere(String tieNomMere) {
        this.tieNomMere = tieNomMere;
    }

    public String getTieNomPere() {
        return tieNomPere;
    }

    public void setTieNomPere(String tieNomPere) {
        this.tieNomPere = tieNomPere;
    }

    public String getTieEpoux() {
        return tieEpoux;
    }

    public void setTieEpoux(String tieEpoux) {
        this.tieEpoux = tieEpoux;
    }

    public String getTieNoUse2() {
        return tieNoUse2;
    }

    public void setTieNoUse2(String tieNoUse2) {
        this.tieNoUse2 = tieNoUse2;
    }

    public String getTieNoUse1() {
        return tieNoUse1;
    }

    public void setTieNoUse1(String tieNoUse1) {
        this.tieNoUse1 = tieNoUse1;
    }

    public String getTieNoteMan() {
        return tieNoteMan;
    }

    public void setTieNoteMan(String tieNoteMan) {
        this.tieNoteMan = tieNoteMan;
    }

    public Integer getTieNoteAuto() {
        return tieNoteAuto;
    }

    public void setTieNoteAuto(Integer tieNoteAuto) {
        this.tieNoteAuto = tieNoteAuto;
    }

    public String getTieCompteEtat() {
        return tieCompteEtat;
    }

    public void setTieCompteEtat(String tieCompteEtat) {
        this.tieCompteEtat = tieCompteEtat;
    }

    public String getTieCompteSage() {
        return tieCompteSage;
    }

    public void setTieCompteSage(String tieCompteSage) {
        this.tieCompteSage = tieCompteSage;
    }

    public String getTieCompte4() {
        return tieCompte4;
    }

    public void setTieCompte4(String tieCompte4) {
        this.tieCompte4 = tieCompte4;
    }

    public String getTieCompte3() {
        return tieCompte3;
    }

    public void setTieCompte3(String tieCompte3) {
        this.tieCompte3 = tieCompte3;
    }

    public String getTieCompte2() {
        return tieCompte2;
    }

    public void setTieCompte2(String tieCompte2) {
        this.tieCompte2 = tieCompte2;
    }

    public String getTieCompte1() {
        return tieCompte1;
    }

    public void setTieCompte1(String tieCompte1) {
        this.tieCompte1 = tieCompte1;
    }

    public String getTieCompte0() {
        return tieCompte0;
    }

    public void setTieCompte0(String tieCompte0) {
        this.tieCompte0 = tieCompte0;
    }

    public String getTieSwift() {
        return tieSwift;
    }

    public void setTieSwift(String tieSwift) {
        this.tieSwift = tieSwift;
    }

    public String getTieIban() {
        return tieIban;
    }

    public void setTieIban(String tieIban) {
        this.tieIban = tieIban;
    }

    public String getTieCleBanque() {
        return tieCleBanque;
    }

    public void setTieCleBanque(String tieCleBanque) {
        this.tieCleBanque = tieCleBanque;
    }

    public String getTieCompteBanque() {
        return tieCompteBanque;
    }

    public void setTieCompteBanque(String tieCompteBanque) {
        this.tieCompteBanque = tieCompteBanque;
    }

    public String getTieGuichetBanque() {
        return tieGuichetBanque;
    }

    public void setTieGuichetBanque(String tieGuichetBanque) {
        this.tieGuichetBanque = tieGuichetBanque;
    }

    public String getTieNumBanque() {
        return tieNumBanque;
    }

    public void setTieNumBanque(String tieNumBanque) {
        this.tieNumBanque = tieNumBanque;
    }

    public String getTieAdresseBanque() {
        return tieAdresseBanque;
    }

    public void setTieAdresseBanque(String tieAdresseBanque) {
        this.tieAdresseBanque = tieAdresseBanque;
    }

    public String getTieNomBanque() {
        return tieNomBanque;
    }

    public void setTieNomBanque(String tieNomBanque) {
        this.tieNomBanque = tieNomBanque;
    }

    public Integer getTieFacPr() {
        return tieFacPr;
    }

    public void setTieFacPr(Integer tieFacPr) {
        this.tieFacPr = tieFacPr;
    }

    public Double getTieEscompte() {
        return tieEscompte;
    }

    public void setTieEscompte(Double tieEscompte) {
        this.tieEscompte = tieEscompte;
    }

    public String getTieDepot() {
        return tieDepot;
    }

    public void setTieDepot(String tieDepot) {
        this.tieDepot = tieDepot;
    }

    public Integer getTieTransfertCpte() {
        return tieTransfertCpte;
    }

    public void setTieTransfertCpte(Integer tieTransfertCpte) {
        this.tieTransfertCpte = tieTransfertCpte;
    }

    public Integer getTieExoTva() {
        return tieExoTva;
    }

    public void setTieExoTva(Integer tieExoTva) {
        this.tieExoTva = tieExoTva;
    }

    public Integer getTieExoDouane() {
        return tieExoDouane;
    }

    public void setTieExoDouane(Integer tieExoDouane) {
        this.tieExoDouane = tieExoDouane;
    }

    public String getTieSerie() {
        return tieSerie;
    }

    public void setTieSerie(String tieSerie) {
        this.tieSerie = tieSerie;
    }

    public String getTieNomFamille() {
        return tieNomFamille;
    }

    public void setTieNomFamille(String tieNomFamille) {
        this.tieNomFamille = tieNomFamille;
    }

    public Integer getTieNbIncident() {
        return tieNbIncident;
    }

    public void setTieNbIncident(Integer tieNbIncident) {
        this.tieNbIncident = tieNbIncident;
    }

    public Integer getTieSurveille() {
        return tieSurveille;
    }

    public void setTieSurveille(Integer tieSurveille) {
        this.tieSurveille = tieSurveille;
    }

    public Integer getTieChequeInterdit() {
        return tieChequeInterdit;
    }

    public void setTieChequeInterdit(Integer tieChequeInterdit) {
        this.tieChequeInterdit = tieChequeInterdit;
    }

    public Integer getTieCompteBloque() {
        return tieCompteBloque;
    }

    public void setTieCompteBloque(Integer tieCompteBloque) {
        this.tieCompteBloque = tieCompteBloque;
    }

    public Double getTiePlafPatente() {
        return tiePlafPatente;
    }

    public void setTiePlafPatente(Double tiePlafPatente) {
        this.tiePlafPatente = tiePlafPatente;
    }

    public Double getTieCapatente() {
        return tieCapatente;
    }

    public void setTieCapatente(Double tieCapatente) {
        this.tieCapatente = tieCapatente;
    }

    public Double getTieDepotavance() {
        return tieDepotavance;
    }

    public void setTieDepotavance(Double tieDepotavance) {
        this.tieDepotavance = tieDepotavance;
    }

    public Double getTiePlafond() {
        return tiePlafond;
    }

    public void setTiePlafond(Double tiePlafond) {
        this.tiePlafond = tiePlafond;
    }

    public String getTieConditionReg() {
        return tieConditionReg;
    }

    public void setTieConditionReg(String tieConditionReg) {
        this.tieConditionReg = tieConditionReg;
    }

    public String getTieJournalReg() {
        return tieJournalReg;
    }

    public void setTieJournalReg(String tieJournalReg) {
        this.tieJournalReg = tieJournalReg;
    }

    public Integer getTieNbArrondi() {
        return tieNbArrondi;
    }

    public void setTieNbArrondi(Integer tieNbArrondi) {
        this.tieNbArrondi = tieNbArrondi;
    }

    public Integer getTieNbEcheance() {
        return tieNbEcheance;
    }

    public void setTieNbEcheance(Integer tieNbEcheance) {
        this.tieNbEcheance = tieNbEcheance;
    }

    public Integer getTieTypeReg() {
        return tieTypeReg;
    }

    public void setTieTypeReg(Integer tieTypeReg) {
        this.tieTypeReg = tieTypeReg;
    }

    public String getTieModeReg() {
        return tieModeReg;
    }

    public void setTieModeReg(String tieModeReg) {
        this.tieModeReg = tieModeReg;
    }

    public String getTieWeb() {
        return tieWeb;
    }

    public void setTieWeb(String tieWeb) {
        this.tieWeb = tieWeb;
    }

    public String getTieMail5() {
        return tieMail5;
    }

    public void setTieMail5(String tieMail5) {
        this.tieMail5 = tieMail5;
    }

    public String getTieMail4() {
        return tieMail4;
    }

    public void setTieMail4(String tieMail4) {
        this.tieMail4 = tieMail4;
    }

    public String getTieMail3() {
        return tieMail3;
    }

    public void setTieMail3(String tieMail3) {
        this.tieMail3 = tieMail3;
    }

    public String getTieMail2() {
        return tieMail2;
    }

    public void setTieMail2(String tieMail2) {
        this.tieMail2 = tieMail2;
    }

    public String getTieMail1() {
        return tieMail1;
    }

    public void setTieMail1(String tieMail1) {
        this.tieMail1 = tieMail1;
    }

    public String getTieAol() {
        return tieAol;
    }

    public void setTieAol(String tieAol) {
        this.tieAol = tieAol;
    }

    public String getTieSkype() {
        return tieSkype;
    }

    public void setTieSkype(String tieSkype) {
        this.tieSkype = tieSkype;
    }

    public String getTieMsn() {
        return tieMsn;
    }

    public void setTieMsn(String tieMsn) {
        this.tieMsn = tieMsn;
    }

    public String getTieYahoo() {
        return tieYahoo;
    }

    public void setTieYahoo(String tieYahoo) {
        this.tieYahoo = tieYahoo;
    }

    public String getTieTelex() {
        return tieTelex;
    }

    public void setTieTelex(String tieTelex) {
        this.tieTelex = tieTelex;
    }

    public String getTieBurFax() {
        return tieBurFax;
    }

    public void setTieBurFax(String tieBurFax) {
        this.tieBurFax = tieBurFax;
    }

    public String getTieBurTel3() {
        return tieBurTel3;
    }

    public void setTieBurTel3(String tieBurTel3) {
        this.tieBurTel3 = tieBurTel3;
    }

    public String getTieBurTel2() {
        return tieBurTel2;
    }

    public void setTieBurTel2(String tieBurTel2) {
        this.tieBurTel2 = tieBurTel2;
    }

    public String getTieBurTel1() {
        return tieBurTel1;
    }

    public void setTieBurTel1(String tieBurTel1) {
        this.tieBurTel1 = tieBurTel1;
    }

    public String getTieVille() {
        return tieVille;
    }

    public void setTieVille(String tieVille) {
        this.tieVille = tieVille;
    }

    public String getTieCedex() {
        return tieCedex;
    }

    public void setTieCedex(String tieCedex) {
        this.tieCedex = tieCedex;
    }

    public String getTieBp() {
        return tieBp;
    }

    public void setTieBp(String tieBp) {
        this.tieBp = tieBp;
    }

    public String getTieZone() {
        return tieZone;
    }

    public void setTieZone(String tieZone) {
        this.tieZone = tieZone;
    }

    public String getTieDepart() {
        return tieDepart;
    }

    public void setTieDepart(String tieDepart) {
        this.tieDepart = tieDepart;
    }

    public String getTieCommune() {
        return tieCommune;
    }

    public void setTieCommune(String tieCommune) {
        this.tieCommune = tieCommune;
    }

    public String getTieQuartier() {
        return tieQuartier;
    }

    public void setTieQuartier(String tieQuartier) {
        this.tieQuartier = tieQuartier;
    }

    public String getTieAscensseur() {
        return tieAscensseur;
    }

    public void setTieAscensseur(String tieAscensseur) {
        this.tieAscensseur = tieAscensseur;
    }

    public String getTieEtage() {
        return tieEtage;
    }

    public void setTieEtage(String tieEtage) {
        this.tieEtage = tieEtage;
    }

    public String getTiePorte() {
        return tiePorte;
    }

    public void setTiePorte(String tiePorte) {
        this.tiePorte = tiePorte;
    }

    public String getTieBatiment() {
        return tieBatiment;
    }

    public void setTieBatiment(String tieBatiment) {
        this.tieBatiment = tieBatiment;
    }

    public String getTieIlot() {
        return tieIlot;
    }

    public void setTieIlot(String tieIlot) {
        this.tieIlot = tieIlot;
    }

    public String getTieLot() {
        return tieLot;
    }

    public void setTieLot(String tieLot) {
        this.tieLot = tieLot;
    }

    public String getTieRue() {
        return tieRue;
    }

    public void setTieRue(String tieRue) {
        this.tieRue = tieRue;
    }

    public String getTieAdresse() {
        return tieAdresse;
    }

    public void setTieAdresse(String tieAdresse) {
        this.tieAdresse = tieAdresse;
    }

    public Long getTieVisibiliteUser() {
        return tieVisibiliteUser;
    }

    public void setTieVisibiliteUser(Long tieVisibiliteUser) {
        this.tieVisibiliteUser = tieVisibiliteUser;
    }

    public String getTieVisibiliteGrp() {
        return tieVisibiliteGrp;
    }

    public void setTieVisibiliteGrp(String tieVisibiliteGrp) {
        this.tieVisibiliteGrp = tieVisibiliteGrp;
    }

    public Integer getTieVisibilite() {
        return tieVisibilite;
    }

    public void setTieVisibilite(Integer tieVisibilite) {
        this.tieVisibilite = tieVisibilite;
    }

    public String getTieSource() {
        return tieSource;
    }

    public void setTieSource(String tieSource) {
        this.tieSource = tieSource;
    }

    public String getTieActivite2() {
        return tieActivite2;
    }

    public void setTieActivite2(String tieActivite2) {
        this.tieActivite2 = tieActivite2;
    }

    public String getTieActivite1() {
        return tieActivite1;
    }

    public void setTieActivite1(String tieActivite1) {
        this.tieActivite1 = tieActivite1;
    }

    public String getTieObservations() {
        return tieObservations;
    }

    public void setTieObservations(String tieObservations) {
        this.tieObservations = tieObservations;
    }

    public String getTieAnniversaireDeces() {
        return tieAnniversaireDeces;
    }

    public void setTieAnniversaireDeces(String tieAnniversaireDeces) {
        this.tieAnniversaireDeces = tieAnniversaireDeces;
    }

    public LocalDate getTieDateDeces() {
        return tieDateDeces;
    }

    public void setTieDateDeces(LocalDate tieDateDeces) {
        this.tieDateDeces = tieDateDeces;
    }

    public String getTieAnniversaireMariage() {
        return tieAnniversaireMariage;
    }

    public void setTieAnniversaireMariage(String tieAnniversaireMariage) {
        this.tieAnniversaireMariage = tieAnniversaireMariage;
    }

    public LocalDate getTieDateMariage() {
        return tieDateMariage;
    }

    public void setTieDateMariage(LocalDate tieDateMariage) {
        this.tieDateMariage = tieDateMariage;
    }

    public String getTieAnniversaire() {
        return tieAnniversaire;
    }

    public void setTieAnniversaire(String tieAnniversaire) {
        this.tieAnniversaire = tieAnniversaire;
    }

    public String getTieLieuNaissance() {
        return tieLieuNaissance;
    }

    public void setTieLieuNaissance(String tieLieuNaissance) {
        this.tieLieuNaissance = tieLieuNaissance;
    }

    public LocalDate getTieDateNaissance() {
        return tieDateNaissance;
    }

    public void setTieDateNaissance(LocalDate tieDateNaissance) {
        this.tieDateNaissance = tieDateNaissance;
    }

    public Integer getTieSexe() {
        return tieSexe;
    }

    public void setTieSexe(Integer tieSexe) {
        this.tieSexe = tieSexe;
    }

    public String getTieSurnom() {
        return tieSurnom;
    }

    public void setTieSurnom(String tieSurnom) {
        this.tieSurnom = tieSurnom;
    }

    public String getTieNomJf() {
        return tieNomJf;
    }

    public void setTieNomJf(String tieNomJf) {
        this.tieNomJf = tieNomJf;
    }

    public String getTiePrenom() {
        return tiePrenom;
    }

    public void setTiePrenom(String tiePrenom) {
        this.tiePrenom = tiePrenom;
    }

    public String getTieTelVoiture() {
        return tieTelVoiture;
    }

    public void setTieTelVoiture(String tieTelVoiture) {
        this.tieTelVoiture = tieTelVoiture;
    }

    public String getTieCel3() {
        return tieCel3;
    }

    public void setTieCel3(String tieCel3) {
        this.tieCel3 = tieCel3;
    }

    public String getTieCel2() {
        return tieCel2;
    }

    public void setTieCel2(String tieCel2) {
        this.tieCel2 = tieCel2;
    }

    public String getTieCel1() {
        return tieCel1;
    }

    public void setTieCel1(String tieCel1) {
        this.tieCel1 = tieCel1;
    }

    public String getTieTelDom() {
        return tieTelDom;
    }

    public void setTieTelDom(String tieTelDom) {
        this.tieTelDom = tieTelDom;
    }

    public Integer getTieTypeAdresse() {
        return tieTypeAdresse;
    }

    public void setTieTypeAdresse(Integer tieTypeAdresse) {
        this.tieTypeAdresse = tieTypeAdresse;
    }

    public String getTieLangue() {
        return tieLangue;
    }

    public void setTieLangue(String tieLangue) {
        this.tieLangue = tieLangue;
    }

    public Integer getTieFormatDevise() {
        return tieFormatDevise;
    }

    public void setTieFormatDevise(Integer tieFormatDevise) {
        this.tieFormatDevise = tieFormatDevise;
    }

    public String getTieDevise() {
        return tieDevise;
    }

    public void setTieDevise(String tieDevise) {
        this.tieDevise = tieDevise;
    }

    public String getTieCodePays() {
        return tieCodePays;
    }

    public void setTieCodePays(String tieCodePays) {
        this.tieCodePays = tieCodePays;
    }

    public String getTieNomPays() {
        return tieNomPays;
    }

    public void setTieNomPays(String tieNomPays) {
        this.tieNomPays = tieNomPays;
    }

    public String getTieCivilite() {
        return tieCivilite;
    }

    public void setTieCivilite(String tieCivilite) {
        this.tieCivilite = tieCivilite;
    }

    public String getTieCategorie() {
        return tieCategorie;
    }

    public void setTieCategorie(String tieCategorie) {
        this.tieCategorie = tieCategorie;
    }

    public String getTieGenre() {
        return tieGenre;
    }

    public void setTieGenre(String tieGenre) {
        this.tieGenre = tieGenre;
    }

    public String getTieType() {
        return tieType;
    }

    public void setTieType(String tieType) {
        this.tieType = tieType;
    }

    public Long getTieIdStructure() {
        return tieIdStructure;
    }

    public void setTieIdStructure(Long tieIdStructure) {
        this.tieIdStructure = tieIdStructure;
    }

    public String getTieSigle() {
        return tieSigle;
    }

    public void setTieSigle(String tieSigle) {
        this.tieSigle = tieSigle;
    }

    public String getTieRaisonSocialeNom() {
        return tieRaisonSocialeNom;
    }

    public void setTieRaisonSocialeNom(String tieRaisonSocialeNom) {
        this.tieRaisonSocialeNom = tieRaisonSocialeNom;
    }

    public Integer getTieEtat() {
        return tieEtat;
    }

    public void setTieEtat(Integer tieEtat) {
        this.tieEtat = tieEtat;
    }

    public Long getTieUserModif() {
        return tieUserModif;
    }

    public void setTieUserModif(Long tieUserModif) {
        this.tieUserModif = tieUserModif;
    }

    public Long getTieUserCreat() {
        return tieUserCreat;
    }

    public void setTieUserCreat(Long tieUserCreat) {
        this.tieUserCreat = tieUserCreat;
    }

    public Instant getTieDateModif() {
        return tieDateModif;
    }

    public void setTieDateModif(Instant tieDateModif) {
        this.tieDateModif = tieDateModif;
    }

    public Instant getTieDateCreat() {
        return tieDateCreat;
    }

    public void setTieDateCreat(Instant tieDateCreat) {
        this.tieDateCreat = tieDateCreat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
