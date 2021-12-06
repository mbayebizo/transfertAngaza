package net.msapi.transfertangaza.models.cai;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "cai_bon_entree")
public class CaiBonEntree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entr_id", nullable = false)
    private long entrId;

    @Column(name = "entr_cle")
    private String entrCle;

    @Column(name = "entr_date_creat")
    private Date entrDateCreat;

    @Column(name = "entr_user_creat")
    private long entrUserCreat;

    @Column(name = "entr_date_modif")
    private Date entrDateModif;

    @Column(name = "entr_user_modif")
    private long entrUserModif;

    @Column(name = "entr_nature")
    private int entrNature;

    @Column(name = "entr_date")
    private Date entrDate;

    @Column(name = "entr_num")
    private String entrNum;

    @Column(name = "entr_nom_responsable")
    private String entrNomResponsable;

    @Column(name = "entr_nom_tiers")
    private String entrNomTiers;

    @Column(name = "entr_id_tiers")
    private long entrIdTiers;

    @Column(name = "entr_type_tiers")
    private int entrTypeTiers;

    @Column(name = "entr_depot_tiers")
    private int entrDepotTiers;

    @Column(name = "entr_serie")
    private String entrSerie;

    @Column(name = "entr_libelle")
    private String entrLibelle;

    @Column(name = "entr_devise")
    private String entrDevise;

    @Column(name = "entr_montant")
    private double entrMontant;

    @Column(name = "entr_type_reg")
    private int entrTypeReg;

    @Column(name = "entr_activite")
    private String entrActivite;

    @Column(name = "entr_site")
    private String entrSite;

    @Column(name = "entr_departement")
    private String entrDepartement;

    @Column(name = "entr_service")
    private String entrService;

    @Column(name = "entr_region")
    private String entrRegion;

    @Column(name = "entr_secteur")
    private String entrSecteur;

    @Column(name = "entr_pdv")
    private String entrPdv;

    @Column(name = "entr_budget")
    private String entrBudget;

    @Column(name = "entr_budget_dispo")
    private double entrBudgetDispo;

    @Column(name = "entr_budget_treso")
    private double entrBudgetTreso;

    @Column(name = "entr_budget_dispo_mois")
    private double entrBudgetDispoMois;

    @Column(name = "entr_budget_treso_mois")
    private double entrBudgetTresoMois;

    @Column(name = "entr_dossier")
    private String entrDossier;

    @Column(name = "entr_parc")
    private String entrParc;

    @Column(name = "entrEtat")
    private int entrEtat;

    @Column(name = "entr_date_relance")
    private Date entrDateRelance;

    @Column(name = "entr_actif")
    private int entrActif;

    @Column(name = "entr_modele_imp")
    private String entrModeleImp;

    @Column(name = "entr_date_impression")
    private Date entrDateImpression;

    @Column(name = "entr_code_caiss")
    private String entrCodeCaiss;

    @Column(name = "entr_lib_caiss")
    private String entrLibCaiss;

    @Column(name = "entr_code_banq")
    private String entrCodeBanq;

    @Column(name = "entr_lib_banq")
    private String entrLibBanq;

    @Column(name = "entr_banque_tireur")
    private String entrBanqueTireur;

    @Column(name = "entr_num_chq_bdx")
    private String entrNumChqBdx;

    @Column(name = "entr_code_budget_treso")
    private String entrCodeBudgetTreso;

    @Column(name = "entr_code_poste_treso")
    private String entrCodePosteTreso;

    @Column(name = "entr_id_responsable")
    private long entrIdResponsable;

    @Column(name = "entr_activite_compte")
    private String entrActiviteCompte;

    @Column(name = "entr_activite_taux")
    private double entrActiviteTaux;

    @Column(name = "entr_activite_exo")
    private boolean entrActiviteExo;

    @Column(name = "entr_info1")
    private String entrInfo1;

    @Column(name = "entr_info2")
    private String entrInfo2;

    @Column(name = "entr_info3")
    private String entrInfo3;

    @Column(name = "entr_info4")
    private String entrInfo4;

    @Column(name = "entr_info5")
    private String entrInfo5;

    @Column(name = "entr_info6")
    private String entrInfo6;

    @Column(name = "entr_info7")
    private String entrInfo7;

    @Column(name = "entr_info8")
    private String entrInfo8;

    @Column(name = "entr_info9")
    private String entrInfo9;

    @Column(name = "entr_info10")
    private String entrInfo10;

    @Column(name = "entr_date_validation")
    private Date entrDateValidation;

    @Column(name = "entr_user_validation")
    private long entrUserValidation;

    @Column(name = "entr_grp")
    private String entrGrp;

    @Column(name = "entr_etat_val")
    private int entrEtatVal;

    @Column(name = "entr_date_valide")
    private Date entrDateValide;

    @Column(name = "entr_pos_signature")
    private int entrPosSignature;

    @Column(name = "entr_gele")
    private int entrGele;

    @Column(name = "entr_pj")
    private boolean entrPj;

    @Column(name = "entr_source")
    private String entrSource;
    @Column(name = "execai_id")
    private long execaiId;
    @Transient
    private String libelleTypeTiers;
    @Transient
    private String var_etat;

    public String getLibelleTypeTiers() {
        if (this.entrTypeTiers == 0) {
            this.libelleTypeTiers = "Client";
        } else if (this.entrTypeTiers == 1) {
            this.libelleTypeTiers = "Fournisseur";
        } else if (this.entrTypeTiers == 2) {
            this.libelleTypeTiers = "Agent";
        } else if (this.entrTypeTiers == 3) {
            this.libelleTypeTiers = "Plan Comptable";
        } else if (this.entrTypeTiers == 4) {
            this.libelleTypeTiers = "Patient";
        } else if (this.entrTypeTiers == 5) {
            this.libelleTypeTiers = "El\u00e8ve";
        }
        return this.libelleTypeTiers;
    }

    public String getVar_etat() {
        if (this.entrEtat == 0) {
            this.var_etat = "En cours";
        } else if (this.entrEtat == 1) {
            this.var_etat = "Valid\u00e9";
        } else if (this.entrEtat == 2) {
            this.var_etat = "Gel\u00e9";
        } else if (this.entrEtat == 3) {
            this.var_etat = "Annul\u00e9";
        } else if (this.entrEtat == 4) {
            this.var_etat = "Ex\u00e9cut\u00e9";
        }
        return this.var_etat;
    }

    public long getEntrId() {
        return entrId;
    }

    public void setEntrId(long entrId) {
        this.entrId = entrId;
    }

    public String getEntrCle() {
        return entrCle;
    }

    public void setEntrCle(String entrCle) {
        this.entrCle = entrCle;
    }

    public Date getEntrDateCreat() {
        return entrDateCreat;
    }

    public void setEntrDateCreat(Date entrDateCreat) {
        this.entrDateCreat = entrDateCreat;
    }

    public long getEntrUserCreat() {
        return entrUserCreat;
    }

    public void setEntrUserCreat(long entrUserCreat) {
        this.entrUserCreat = entrUserCreat;
    }

    public Date getEntrDateModif() {
        return entrDateModif;
    }

    public void setEntrDateModif(Date entrDateModif) {
        this.entrDateModif = entrDateModif;
    }

    public long getEntrUserModif() {
        return entrUserModif;
    }

    public void setEntrUserModif(long entrUserModif) {
        this.entrUserModif = entrUserModif;
    }

    public int getEntrNature() {
        return entrNature;
    }

    public void setEntrNature(int entrNature) {
        this.entrNature = entrNature;
    }

    public Date getEntrDate() {
        return entrDate;
    }

    public void setEntrDate(Date entrDate) {
        this.entrDate = entrDate;
    }

    public String getEntrNum() {
        return entrNum;
    }

    public void setEntrNum(String entrNum) {
        this.entrNum = entrNum;
    }

    public String getEntrNomResponsable() {
        return entrNomResponsable;
    }

    public void setEntrNomResponsable(String entrNomResponsable) {
        this.entrNomResponsable = entrNomResponsable;
    }

    public String getEntrNomTiers() {
        return entrNomTiers;
    }

    public void setEntrNomTiers(String entrNomTiers) {
        this.entrNomTiers = entrNomTiers;
    }

    public long getEntrIdTiers() {
        return entrIdTiers;
    }

    public void setEntrIdTiers(long entrIdTiers) {
        this.entrIdTiers = entrIdTiers;
    }

    public int getEntrTypeTiers() {
        return entrTypeTiers;
    }

    public void setEntrTypeTiers(int entrTypeTiers) {
        this.entrTypeTiers = entrTypeTiers;
    }

    public int getEntrDepotTiers() {
        return entrDepotTiers;
    }

    public void setEntrDepotTiers(int entrDepotTiers) {
        this.entrDepotTiers = entrDepotTiers;
    }

    public String getEntrSerie() {
        return entrSerie;
    }

    public void setEntrSerie(String entrSerie) {
        this.entrSerie = entrSerie;
    }

    public String getEntrLibelle() {
        return entrLibelle;
    }

    public void setEntrLibelle(String entrLibelle) {
        this.entrLibelle = entrLibelle;
    }

    public String getEntrDevise() {
        return entrDevise;
    }

    public void setEntrDevise(String entrDevise) {
        this.entrDevise = entrDevise;
    }

    public double getEntrMontant() {
        return entrMontant;
    }

    public void setEntrMontant(double entrMontant) {
        this.entrMontant = entrMontant;
    }

    public int getEntrTypeReg() {
        return entrTypeReg;
    }

    public void setEntrTypeReg(int entrTypeReg) {
        this.entrTypeReg = entrTypeReg;
    }

    public String getEntrActivite() {
        return entrActivite;
    }

    public void setEntrActivite(String entrActivite) {
        this.entrActivite = entrActivite;
    }

    public String getEntrSite() {
        return entrSite;
    }

    public void setEntrSite(String entrSite) {
        this.entrSite = entrSite;
    }

    public String getEntrDepartement() {
        return entrDepartement;
    }

    public void setEntrDepartement(String entrDepartement) {
        this.entrDepartement = entrDepartement;
    }

    public String getEntrService() {
        return entrService;
    }

    public void setEntrService(String entrService) {
        this.entrService = entrService;
    }

    public String getEntrRegion() {
        return entrRegion;
    }

    public void setEntrRegion(String entrRegion) {
        this.entrRegion = entrRegion;
    }

    public String getEntrSecteur() {
        return entrSecteur;
    }

    public void setEntrSecteur(String entrSecteur) {
        this.entrSecteur = entrSecteur;
    }

    public String getEntrPdv() {
        return entrPdv;
    }

    public void setEntrPdv(String entrPdv) {
        this.entrPdv = entrPdv;
    }

    public String getEntrBudget() {
        return entrBudget;
    }

    public void setEntrBudget(String entrBudget) {
        this.entrBudget = entrBudget;
    }

    public double getEntrBudgetDispo() {
        return entrBudgetDispo;
    }

    public void setEntrBudgetDispo(double entrBudgetDispo) {
        this.entrBudgetDispo = entrBudgetDispo;
    }

    public double getEntrBudgetTreso() {
        return entrBudgetTreso;
    }

    public void setEntrBudgetTreso(double entrBudgetTreso) {
        this.entrBudgetTreso = entrBudgetTreso;
    }

    public double getEntrBudgetDispoMois() {
        return entrBudgetDispoMois;
    }

    public void setEntrBudgetDispoMois(double entrBudgetDispoMois) {
        this.entrBudgetDispoMois = entrBudgetDispoMois;
    }

    public double getEntrBudgetTresoMois() {
        return entrBudgetTresoMois;
    }

    public void setEntrBudgetTresoMois(double entrBudgetTresoMois) {
        this.entrBudgetTresoMois = entrBudgetTresoMois;
    }

    public String getEntrDossier() {
        return entrDossier;
    }

    public void setEntrDossier(String entrDossier) {
        this.entrDossier = entrDossier;
    }

    public String getEntrParc() {
        return entrParc;
    }

    public void setEntrParc(String entrParc) {
        this.entrParc = entrParc;
    }

    public int getEntrEtat() {
        return entrEtat;
    }

    public void setEntrEtat(int entrEtat) {
        this.entrEtat = entrEtat;
    }

    public Date getEntrDateRelance() {
        return entrDateRelance;
    }

    public void setEntrDateRelance(Date entrDateRelance) {
        this.entrDateRelance = entrDateRelance;
    }

    public int getEntrActif() {
        return entrActif;
    }

    public void setEntrActif(int entrActif) {
        this.entrActif = entrActif;
    }

    public String getEntrModeleImp() {
        return entrModeleImp;
    }

    public void setEntrModeleImp(String entrModeleImp) {
        this.entrModeleImp = entrModeleImp;
    }

    public Date getEntrDateImpression() {
        return entrDateImpression;
    }

    public void setEntrDateImpression(Date entrDateImpression) {
        this.entrDateImpression = entrDateImpression;
    }

    public String getEntrCodeCaiss() {
        return entrCodeCaiss;
    }

    public void setEntrCodeCaiss(String entrCodeCaiss) {
        this.entrCodeCaiss = entrCodeCaiss;
    }

    public String getEntrLibCaiss() {
        return entrLibCaiss;
    }

    public void setEntrLibCaiss(String entrLibCaiss) {
        this.entrLibCaiss = entrLibCaiss;
    }

    public String getEntrCodeBanq() {
        return entrCodeBanq;
    }

    public void setEntrCodeBanq(String entrCodeBanq) {
        this.entrCodeBanq = entrCodeBanq;
    }

    public String getEntrLibBanq() {
        return entrLibBanq;
    }

    public void setEntrLibBanq(String entrLibBanq) {
        this.entrLibBanq = entrLibBanq;
    }

    public String getEntrBanqueTireur() {
        return entrBanqueTireur;
    }

    public void setEntrBanqueTireur(String entrBanqueTireur) {
        this.entrBanqueTireur = entrBanqueTireur;
    }

    public String getEntrNumChqBdx() {
        return entrNumChqBdx;
    }

    public void setEntrNumChqBdx(String entrNumChqBdx) {
        this.entrNumChqBdx = entrNumChqBdx;
    }

    public String getEntrCodeBudgetTreso() {
        return entrCodeBudgetTreso;
    }

    public void setEntrCodeBudgetTreso(String entrCodeBudgetTreso) {
        this.entrCodeBudgetTreso = entrCodeBudgetTreso;
    }

    public String getEntrCodePosteTreso() {
        return entrCodePosteTreso;
    }

    public void setEntrCodePosteTreso(String entrCodePosteTreso) {
        this.entrCodePosteTreso = entrCodePosteTreso;
    }

    public long getEntrIdResponsable() {
        return entrIdResponsable;
    }

    public void setEntrIdResponsable(long entrIdResponsable) {
        this.entrIdResponsable = entrIdResponsable;
    }

    public String getEntrActiviteCompte() {
        return entrActiviteCompte;
    }

    public void setEntrActiviteCompte(String entrActiviteCompte) {
        this.entrActiviteCompte = entrActiviteCompte;
    }

    public double getEntrActiviteTaux() {
        return entrActiviteTaux;
    }

    public void setEntrActiviteTaux(double entrActiviteTaux) {
        this.entrActiviteTaux = entrActiviteTaux;
    }

    public boolean isEntrActiviteExo() {
        return entrActiviteExo;
    }

    public void setEntrActiviteExo(boolean entrActiviteExo) {
        this.entrActiviteExo = entrActiviteExo;
    }

    public String getEntrInfo1() {
        return entrInfo1;
    }

    public void setEntrInfo1(String entrInfo1) {
        this.entrInfo1 = entrInfo1;
    }

    public String getEntrInfo2() {
        return entrInfo2;
    }

    public void setEntrInfo2(String entrInfo2) {
        this.entrInfo2 = entrInfo2;
    }

    public String getEntrInfo3() {
        return entrInfo3;
    }

    public void setEntrInfo3(String entrInfo3) {
        this.entrInfo3 = entrInfo3;
    }

    public String getEntrInfo4() {
        return entrInfo4;
    }

    public void setEntrInfo4(String entrInfo4) {
        this.entrInfo4 = entrInfo4;
    }

    public String getEntrInfo5() {
        return entrInfo5;
    }

    public void setEntrInfo5(String entrInfo5) {
        this.entrInfo5 = entrInfo5;
    }

    public String getEntrInfo6() {
        return entrInfo6;
    }

    public void setEntrInfo6(String entrInfo6) {
        this.entrInfo6 = entrInfo6;
    }

    public String getEntrInfo7() {
        return entrInfo7;
    }

    public void setEntrInfo7(String entrInfo7) {
        this.entrInfo7 = entrInfo7;
    }

    public String getEntrInfo8() {
        return entrInfo8;
    }

    public void setEntrInfo8(String entrInfo8) {
        this.entrInfo8 = entrInfo8;
    }

    public String getEntrInfo9() {
        return entrInfo9;
    }

    public void setEntrInfo9(String entrInfo9) {
        this.entrInfo9 = entrInfo9;
    }

    public String getEntrInfo10() {
        return entrInfo10;
    }

    public void setEntrInfo10(String entrInfo10) {
        this.entrInfo10 = entrInfo10;
    }

    public Date getEntrDateValidation() {
        return entrDateValidation;
    }

    public void setEntrDateValidation(Date entrDateValidation) {
        this.entrDateValidation = entrDateValidation;
    }

    public long getEntrUserValidation() {
        return entrUserValidation;
    }

    public void setEntrUserValidation(long entrUserValidation) {
        this.entrUserValidation = entrUserValidation;
    }

    public String getEntrGrp() {
        return entrGrp;
    }

    public void setEntrGrp(String entrGrp) {
        this.entrGrp = entrGrp;
    }

    public int getEntrEtatVal() {
        return entrEtatVal;
    }

    public void setEntrEtatVal(int entrEtatVal) {
        this.entrEtatVal = entrEtatVal;
    }

    public Date getEntrDateValide() {
        return entrDateValide;
    }

    public void setEntrDateValide(Date entrDateValide) {
        this.entrDateValide = entrDateValide;
    }

    public int getEntrPosSignature() {
        return entrPosSignature;
    }

    public void setEntrPosSignature(int entrPosSignature) {
        this.entrPosSignature = entrPosSignature;
    }

    public int getEntrGele() {
        return entrGele;
    }

    public void setEntrGele(int entrGele) {
        this.entrGele = entrGele;
    }

    public boolean isEntrPj() {
        return entrPj;
    }

    public void setEntrPj(boolean entrPj) {
        this.entrPj = entrPj;
    }

    public String getEntrSource() {
        return entrSource;
    }

    public void setEntrSource(String entrSource) {
        this.entrSource = entrSource;
    }

    public long getExecaiId() {
        return execaiId;
    }

    public void setExecaiId(long execaiId) {
        this.execaiId = execaiId;
    }
}
