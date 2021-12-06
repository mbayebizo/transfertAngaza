package net.msapi.transfertangaza.models.cpt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cpt_ecritures_analytiques")
public class CptEcrituresAnalytique{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ecrana_id", nullable = false)
    private long id;

    @Column(name = "ecrana_id_origine")
    private long ecranaIdOrigine;

    @Column(name = "ecrana_type_origine", length = 2)
    private String ecranaTypeOrigine;

    @Column(name = "ecrana_axe")
    private int ecranaAxe;

    @Column(name = "ecrana_cle", length = 121)
    private String ecranaCle;

    @Column(name = "ecrana_ordre")
    private long ecranaOrdre;

    @Column(name = "ecrana_code", length = 6)
    private String ecranaCode;

    @Temporal(TemporalType.DATE)
    @Column(name = "ecrana_date_saisie")
    private Date ecranaDateSaisie;

    @Column(name = "ecrana_periode", length = 7)
    private String ecranaPeriode;

    @Column(name = "ecrana_nature")
    private int ecranaNature;

    @Column(name = "ecrana_compte", length = 20)
    private String ecranaCompte;

    @Column(name = "ecrana_cle1", length = 14)
    private String ecranaCle1;

    @Column(name = "ecrana_cle2", length = 17)
    private String ecranaCle2;

    @Column(name = "ecrana_classe", length = 1)
    private String ecranaClasse;

    @Column(name = "ecrana_montant_saisie")
    private double ecranaMontantSaisie;

    @Column(name = "ecrana_libelle", length = 100)
    private String ecranaLibelle;

    @Column(name = "ecrana_piece", length = 30)
    private String ecranaPiece;

    @Column(name = "ecrana_reference1", length = 30)
    private String ecranaReference1;

    @Column(name = "ecrana_reference2", length = 30)
    private String ecranaReference2;

    @Column(name = "ecrana_site", length = 20)
    private String ecranaSite;

    @Column(name = "ecrana_site_lib", length = 50)
    private String ecranaSiteLib;

    @Column(name = "ecrana_site_taux")
    private double ecranaSiteTaux;

    @Column(name = "ecrana_site_montant")
    private double ecranaSiteMontant;

    @Column(name = "ecrana_site_visible")
    private boolean ecranaSiteVisible;

    @Column(name = "ecrana_departement", length = 20)
    private String ecranaDepartement;

    @Column(name = "ecrana_departement_lib", length = 50)
    private String ecranaDepartementLib;

    @Column(name = "ecrana_departement_taux")
    private double ecranaDepartementTaux;

    @Column(name = "ecrana_departement_montant")
    private double ecranaDepartementMontant;

    @Column(name = "ecrana_departement_visible")
    private boolean ecranaDepartementVisible;

    @Column(name = "ecrana_service", length = 20)
    private String ecranaService;

    @Column(name = "ecrana_service_lib", length = 50)
    private String ecranaServiceLib;

    @Column(name = "ecrana_service_taux")
    private double ecranaServiceTaux;

    @Column(name = "ecrana_service_montant")
    private double ecranaServiceMontant;

    @Column(name = "ecrana_service_visible")
    private boolean ecranaServiceVisible;

    @Column(name = "ecrana_region", length = 20)
    private String ecranaRegion;

    @Column(name = "ecrana_region_lib", length = 50)
    private String ecranaRegionLib;

    @Column(name = "ecrana_region_taux")
    private double ecranaRegionTaux;

    @Column(name = "ecrana_Region_montant")
    private double ecranaRegionMontant;

    @Column(name = "ecrana_region_visible")
    private boolean ecranaRegionVisible;

    @Column(name = "ecrana_secteur", length = 20)
    private String ecranaSecteur;

    @Column(name = "ecrana_secteur_lib", length = 50)
    private String ecranaSecteurLib;

    @Column(name = "ecrana_secteur_taux")
    private double ecranaSecteurTaux;

    @Column(name = "ecrana_secteur_montant")
    private double ecranaSecteurMontant;

    @Column(name = "ecrana_secteur_visible")
    private boolean ecranaSecteurVisible;

    @Column(name = "ecrana_pdv", length = 20)
    private String ecranaPdv;

    @Column(name = "ecrana_pdv_lib", length = 50)
    private String ecranaPdvLib;

    @Column(name = "ecrana_pdv_taux")
    private double ecranaPdvTaux;

    @Column(name = "ecrana_pdv_montant")
    private double ecranaPdvMontant;

    @Column(name = "ecrana_pdv_visible")
    private boolean ecranaPdvVisible;

    @Column(name = "ecrana_ligne", length = 20)
    private String ecranaLigne;

    @Column(name = "ecrana_ligne_lib", length = 50)
    private String ecranaLigneLib;

    @Column(name = "ecrana_ligne_taux")
    private double ecranaLigneTaux;

    @Column(name = "ecrana_ligne_montant")
    private double ecranaLigneMontant;

    @Column(name = "ecrana_ligne_visible")
    private boolean ecranaLigneVisible;

    @Column(name = "ecrana_atelier", length = 20)
    private String ecranaAtelier;

    @Column(name = "ecrana_atelier_lib", length = 50)
    private String ecranaAtelierLib;

    @Column(name = "ecrana_atelier_taux")
    private double ecranaAtelierTaux;

    @Column(name = "ecrana_atelier_montant")
    private double ecranaAtelierMontant;

    @Column(name = "ecrana_atelier_visible")
    private boolean ecranaAtelierVisible;

    @Column(name = "ecrana_activite", length = 20)
    private String ecranaActivite;

    @Column(name = "ecrana_activite_lib", length = 50)
    private String ecranaActiviteLib;

    @Column(name = "ecrana_activite_taux")
    private double ecranaActiviteTaux;

    @Column(name = "ecrana_activite_montant")
    private double ecranaActiviteMontant;

    @Column(name = "ecrana_activite_visible")
    private boolean ecranaActiviteVisible;

    @Column(name = "ecrana_projet", length = 20)
    private String ecranaProjet;

    @Column(name = "ecrana_projet_lib", length = 50)
    private String ecranaProjetLib;

    @Column(name = "ecrana_projet_taux")
    private double ecranaProjetTaux;

    @Column(name = "ecrana_projet_montant")
    private double ecranaProjetMontant;

    @Column(name = "ecrana_projet_visible")
    private boolean ecranaProjetVisible;

    @Column(name = "ecrana_anal1", length = 20)
    private String ecranaAnal1;

    @Column(name = "ecrana_anal1_lib", length = 50)
    private String ecranaAnal1Lib;

    @Column(name = "ecrana_anal1_taux")
    private double ecranaAnal1Taux;

    @Column(name = "ecrana_anal1_montant")
    private double ecranaAnal1Montant;

    @Column(name = "ecrana_anal1_visible")
    private boolean ecranaAnal1Visible;

    @Column(name = "ecrana_anal2", length = 20)
    private String ecranaAnal2;

    @Column(name = "ecrana_anal2_lib", length = 50)
    private String ecranaAnal2Lib;

    @Column(name = "ecrana_anal2_taux")
    private double ecranaAnal2Taux;

    @Column(name = "ecrana_anal2_montant")
    private double ecranaAnal2Montant;

    @Column(name = "ecrana_anal2_visible")
    private boolean ecranaAnal2Visible;

    @Column(name = "ecrana_anal3", length = 20)
    private String ecranaAnal3;

    @Column(name = "ecrana_anal3_lib", length = 50)
    private String ecranaAnal3Lib;

    @Column(name = "ecrana_anal3_taux")
    private double ecranaAnal3Taux;

    @Column(name = "ecrana_anal3_montant")
    private double ecranaAnal3Montant;

    @Column(name = "ecrana_anal3_visible")
    private boolean ecranaAnal3Visible;

    @Column(name = "ecrana_anal4", length = 20)
    private String ecranaAnal4;

    @Column(name = "ecrana_anal4_lib", length = 50)
    private String ecranaAnal4Lib;

    @Column(name = "ecrana_anal4_taux")
    private double ecranaAnal4Taux;

    @Column(name = "ecrana_anal4_montant")
    private double ecranaAnal4Montant;

    @Column(name = "ecrana_anal4_visible")
    private boolean ecranaAnal4Visible;

    @Column(name = "ecrana_nature_jrx")
    private int ecranaNatureJrx;

    @Column(name = "ecrana_reserve")
    private int ecranaReserve;

    @Column(name = "ecrana_pourcentage")
    private double ecranaPourcentage;

    @Column(name = "ecrana_sens")
    private int ecranaSens;

    @Column(name = "ecrana_str", length = 20)
    private String ecranaStr;

    @Column(name = "ecrana_str_lib", length = 50)
    private String ecranaStrLib;

    @Column(name = "ecrana_agent", length = 20)
    private String ecranaAgent;

    @Column(name = "ecrana_agent_lib", length = 50)
    private String ecranaAgentLib;

    @Column(name = "ecrana_str_cle", length = 20)
    private String ecranaStrCle;

    @Column(name = "ecrana_rep_cle", length = 20)
    private String ecranaRepCle;

    @Column(name = "ecrana_type_cle")
    private int ecranaTypeCle;

    @Column(name = "ecrana_poste", length = 20)
    private String ecranaPoste;

    @Column(name = "ecrana_poste_lib", length = 50)
    private String ecranaPosteLib;

    @Column(name = "ecrana_entite", length = 20)
    private String ecranaEntite;

    @Column(name = "ecrana_entite_lib", length = 50)
    private String ecranaEntiteLib;

    @Column(name = "ecrana_anal1lib")
    private String ecranaAnal1lib;

    @Column(name = "ecrana_anal2lib")
    private String ecranaAnal2lib;

    @Column(name = "ecrana_anal3lib")
    private String ecranaAnal3lib;

    @Column(name = "ecrana_anal4lib")
    private String ecranaAnal4lib;

    @Column(name = "execpt_id")
    private long execptId;
    @Column(name = "ecr_id")
    private long ecrId;

    @Transient
    private String zoneSite;
    @Transient
    private String zoneDepartement;
    @Transient
    private String zoneService;
    @Transient
    private String zoneRegion;
    @Transient
    private String zoneSecteur;
    @Transient
    private String zonePdv;
    @Transient
    private String zoneSitePrd;
    @Transient
    private String zoneLigne;
    @Transient
    private String zoneAtelier;
    @Transient
    private double montantBudget;
    @Transient
    private String poste;
    @Transient
    private String libPoste;
    @Transient
    private String zoneActivite;
    @Transient
    private String zoneCol1;
    @Transient
    private String zoneCol2;
    @Transient
    private String zoneCol3;
    @Transient
    private String zoneProjet;
    @Transient
    private String zoneEntite;
    @Transient
    private String zonePoste;
    @Transient
    private List<String> mesSitesItems = new ArrayList();
    @Transient
    private List<String> mesDepartementsItems = new ArrayList();
    @Transient
    private List<String> mesServicesItems = new ArrayList();
    @Transient
    private List<String> mesRegionsItems = new ArrayList();
    @Transient
    private List<String> mesSecteursItems = new ArrayList();
    @Transient
    private List<String> mesPdvItems = new ArrayList();
    @Transient
    private List<String> mesSitesPrdItems = new ArrayList();
    @Transient
    private List<String> mesLignesItems = new ArrayList();
    @Transient
    private List<String> mesAteliersItems = new ArrayList();
    @Transient
    private List<String> mesColonnes1Items = new ArrayList();
    @Transient
    private List<String> mesColonnes2Items = new ArrayList();
    @Transient
    private List<String> mesColonnes3Items = new ArrayList();
    @Transient
    private List<String> mesProjetsItems = new ArrayList();
    @Transient
    private List<String> mesPostesItems = new ArrayList();
    @Transient
    private List<String> mesEntitesItems = new ArrayList();
    @Transient
    private boolean depVide;
    @Transient
    private boolean serVide;
    @Transient
    private boolean secVide;
    @Transient
    private boolean pdvVide;
    @Transient
    private boolean ligVide;
    @Transient
    private boolean ateVide;
    @Transient
    private boolean entVide;
    @Transient
    private boolean posVide;
    @Transient
    private String zoneAnal1;
    @Transient
    private String zoneAnal3;


    public boolean isDepVide() {
        if (this.mesDepartementsItems.size() == 0) {
            this.depVide = true;
            this.serVide = true;
        } else {
            this.depVide = false;
        }
        return this.depVide;
    }

    public boolean isSerVide() {
        this.serVide = this.mesServicesItems.size() == 0;
        return this.serVide;
    }

    public boolean isAteVide() {
        this.ateVide = this.mesAteliersItems.size() == 0;
        return this.ateVide;
    }

    public boolean isLigVide() {
        if (this.mesLignesItems.size() == 0) {
            this.ligVide = true;
            this.ateVide = true;
        } else {
            this.ligVide = false;
        }
        return this.ligVide;
    }

    public boolean isPdvVide() {
        this.pdvVide = this.mesPdvItems.size() == 0;
        return this.pdvVide;
    }

    public boolean isSecVide() {
        if (this.mesSecteursItems.size() == 0) {
            this.secVide = true;
            this.pdvVide = true;
        } else {
            this.secVide = false;
        }
        return this.secVide;
    }

    public boolean isPosVide() {
        this.posVide = this.mesPostesItems.size() == 0;
        return this.posVide;
    }

    public boolean isEntVide() {
        if (this.mesEntitesItems.size() == 0) {
            this.entVide = true;
            this.posVide = true;
        } else {
            this.entVide = false;
        }
        return this.entVide;
    }
}
