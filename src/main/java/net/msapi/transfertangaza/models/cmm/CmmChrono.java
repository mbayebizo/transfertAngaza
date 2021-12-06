package net.msapi.transfertangaza.models.cmm;



import javax.persistence.*;


@Entity
@Table(name = "cmm_chrono")
public class CmmChrono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long chrId;
    private int chrNature;
    private String chrSerie;
    private String chrNom;
    private int chrPrive;
    private String chrService;
    private int chrNbCar;
    private int chrMode;
    private int chrFormat;
    private String chrPrefixe;
    private long chrNum;
    private long chrNumAn;
    private long chrNum01;
    private long chrNum02;
    private long chrNum03;
    private long chrNum04;
    private long chrNum05;
    private long chrNum06;
    private long chrNum07;
    private long chrNum08;
    private long chrNum09;
    private long chrNum10;
    private long chrNum11;
    private long chrNum12;
    private String chrSufixe;
    private String chrJournal;
    private String chrJournalOd;
    private String chrCodeCaisse;
    private int chrModeCaisse;
    private String chrPeriode;
    private long chrNum1;
    private long chrNumAn1;
    private long chrNum011;
    private long chrNum021;
    private long chrNum031;
    private long chrNum041;
    private long chrNum051;
    private long chrNum061;
    private long chrNum071;
    private long chrNum081;
    private long chrNum091;
    private long chrNum101;
    private long chrNum111;
    private long chrNum121;
    private String chrPrefixe1;
    private String chrSufixe1;
    private long chrNum2;
    private long chrNumAn2;
    private long chrNum012;
    private long chrNum022;
    private long chrNum032;
    private long chrNum042;
    private long chrNum052;
    private long chrNum062;
    private long chrNum072;
    private long chrNum082;
    private long chrNum092;
    private long chrNum102;
    private long chrNum112;
    private long chrNum122;
    private String chrPrefixe2;
    private String chrSufixe2;
    private long chrNum3;
    private long chrNumAn3;
    private long chrNum013;
    private long chrNum023;
    private long chrNum033;
    private long chrNum043;
    private long chrNum053;
    private long chrNum063;
    private long chrNum073;
    private long chrNum083;
    private long chrNum093;
    private long chrNum103;
    private long chrNum113;
    private long chrNum123;
    private String chrPrefixe3;
    private String chrSufixe3;
    private long chrNum4;
    private long chrNumAn4;
    private long chrNum014;
    private long chrNum024;
    private long chrNum034;
    private long chrNum044;
    private long chrNum054;
    private long chrNum064;
    private long chrNum074;
    private long chrNum084;
    private long chrNum094;
    private long chrNum104;
    private long chrNum114;
    private long chrNum124;
    private String chrPrefixe4;
    private String chrSufixe4;
    private long chrNum5;
    private long chrNumAn5;
    private long chrNum015;
    private long chrNum025;
    private long chrNum035;
    private long chrNum045;
    private long chrNum055;
    private long chrNum065;
    private long chrNum075;
    private long chrNum085;
    private long chrNum095;
    private long chrNum105;
    private long chrNum115;
    private long chrNum125;
    private String chrPrefixe5;
    private String chrSufixe5;
    private long chrNum6;
    private long chrNumAn6;

    private String chrPrefixe6;
    private String chrSufixe6;
    private long chrNum7;
    private long chrNumAn7;

    private String chrPrefixe7;
    private String chrSufixe7;
    private long chrNum8;
    private long chrNumAn8;

    private String chrPrefixe8;
    private String chrSufixe8;
    private long chrNum9;
    private long chrNumAn9;

    private String chrPrefixe9;
    private String chrSufixe9;
    private long chrNumA;
    private long chrNumAnA;

    private String chrPrefixeA;
    private String chrSufixeA;
    private long chrIdStr;
    @Transient
    private String libnature;
    @Transient
    private String libmode;
    @Transient
    private String libformat;
    @Transient
    private String lib_num;


    public String getLibmode() {
        if (this.chrMode == 0) {
            this.libmode = "Chrono annuel";
        } else if (this.chrMode == 1) {
            this.libmode = "Chrono mensuel";
        } else if (this.chrMode == 2) {
            this.libmode = "Chrono continu";
        }
        return this.libmode;
    }

    public String getLibnature() {
        if (this.chrNature == 2) {
            this.libnature = "Messagerie envoy\u00e9e";
        } else if (this.chrNature == 3) {
            this.libnature = "Messagerie re\u00e7ue";
        } else if (this.chrNature == 4) {
            this.libnature = "Messagerie autre";
        } else if (this.chrNature == 5) {
            this.libnature = "R\u00e9union interne";
        } else if (this.chrNature == 6) {
            this.libnature = "Ticket";
        } else if (this.chrNature == 7) {
            this.libnature = "Commission";
        } else if (this.chrNature == 8) {
            this.libnature = "Simultation";
        } else if (this.chrNature == 9) {
            this.libnature = "Contrat LASA";
        } else if (this.chrNature == 10) {
            this.libnature = "Demande Achat";
        } else if (this.chrNature == 11) {
            this.libnature = "Cotation";
        } else if (this.chrNature == 12) {
            this.libnature = "Commande fournisseur";
        } else if (this.chrNature == 13) {
            this.libnature = "R\u00e9ception";
        } else if (this.chrNature == 14) {
            this.libnature = "Retour fournisseur";
        } else if (this.chrNature == 15) {
            this.libnature = "Facture fournisseur";
        } else if (this.chrNature == 16) {
            this.libnature = "Avoir fournisseur";
        } else if (this.chrNature == 17) {
            this.libnature = "Note d\u00e9bit fournisseur";
        } else if (this.chrNature == 18) {
            this.libnature = "Frais";
        } else if (this.chrNature == 19) {
            this.libnature = "Bon d\u00e9caissement";
        } else if (this.chrNature == 150) {
            this.libnature = "R\u00e9acheminement";
        } else if (this.chrNature == 20) {
            this.libnature = "Besoin";
        } else if (this.chrNature == 21) {
            this.libnature = "Devis";
        } else if (this.chrNature == 22) {
            this.libnature = "Bon commande client";
        } else if (this.chrNature == 23) {
            this.libnature = "Bon livraison client";
        } else if (this.chrNature == 24) {
            this.libnature = "Bon retour client";
        } else if (this.chrNature == 25) {
            this.libnature = "Facture client";
        } else if (this.chrNature == 26) {
            this.libnature = "Avoir client";
        } else if (this.chrNature == 27) {
            this.libnature = "Note d\u00e9bit client";
        } else if (this.chrNature == 28) {
            this.libnature = "Chargement";
        } else if (this.chrNature == 29) {
            this.libnature = "Bon encaissement";
        } else if (this.chrNature == 140) {
            this.libnature = "Contrat";
        } else if (this.chrNature == 141) {
            this.libnature = "Campagne";
        } else if (this.chrNature == 142) {
            this.libnature = "Facture Interne";
        } else if (this.chrNature == 30) {
            this.libnature = "Inventaire";
        } else if (this.chrNature == 31) {
            this.libnature = "Bon entr\u00e9e (stk)";
        } else if (this.chrNature == 32) {
            this.libnature = "Bon sortie (stk)";
        } else if (this.chrNature == 33) {
            this.libnature = "Cession";
        } else if (this.chrNature == 34) {
            this.libnature = "Production";
        } else if (this.chrNature == 35) {
            this.libnature = "Valorisation";
        } else if (this.chrNature == 36) {
            this.libnature = "Sommier";
        } else if (this.chrNature == 37) {
            this.libnature = "S\u00e9rialisation";
        } else if (this.chrNature == 38) {
            this.libnature = "Lot";
        } else if (this.chrNature == 40) {
            this.libnature = "Transport Personnel";
        } else if (this.chrNature == 41) {
            this.libnature = "Transport Mat\u00e9riel";
        } else if (this.chrNature == 42) {
            this.libnature = "R\u00e9clamations";
        } else if (this.chrNature == 43) {
            this.libnature = "Location";
        } else if (this.chrNature == 44) {
            this.libnature = "Localisation";
        } else if (this.chrNature == 45) {
            this.libnature = "Consommation";
        } else if (this.chrNature == 46) {
            this.libnature = "O.R.";
        } else if (this.chrNature == 47) {
            this.libnature = "Manifest + LV";
        } else if (this.chrNature == 48) {
            this.libnature = "Collecte";
        } else if (this.chrNature == 49) {
            this.libnature = "Chargement";
        } else if (this.chrNature == 50) {
            this.libnature = "Loyer";
        } else if (this.chrNature == 51) {
            this.libnature = "Amortissement";
        } else if (this.chrNature == 52) {
            this.libnature = "Budget";
        } else if (this.chrNature == 53) {
            this.libnature = "Journaux";
        } else if (this.chrNature == 531) {
            this.libnature = "Brouillard jour";
        } else if (this.chrNature == 532) {
            this.libnature = "Brouillard mois";
        } else if (this.chrNature == 534) {
            this.libnature = "Extrait compte";
        } else if (this.chrNature == 533) {
            this.libnature = "Impressions";
        } else if (this.chrNature == 535) {
            this.libnature = "Extrait analytique";
        } else if (this.chrNature == 536) {
            this.libnature = "Extrait budget";
        } else if (this.chrNature == 537) {
            this.libnature = "Etats Financiers";
        } else if (this.chrNature == 538) {
            this.libnature = "Extrait classe";
        } else if (this.chrNature == 539) {
            this.libnature = "Extrait projet";
        } else if (this.chrNature == 54) {
            this.libnature = "Budget Tr\u00e9so.";
        } else if (this.chrNature == 55) {
            this.libnature = "Transfert";
        } else if (this.chrNature == 56) {
            this.libnature = "Rapprochement";
        } else if (this.chrNature == 57) {
            this.libnature = "Notes Externes";
        } else if (this.chrNature == 60) {
            this.libnature = "Caisse";
        } else if (this.chrNature == 61) {
            this.libnature = "Re\u00e7u";
        } else if (this.chrNature == 62) {
            this.libnature = "Bon sortie (cais)";
        } else if (this.chrNature == 63) {
            this.libnature = "Bon entr\u00e9e (cais)";
        } else if (this.chrNature == 64) {
            this.libnature = "Virement interne";
        } else if (this.chrNature == 65) {
            this.libnature = "Traite domicili\u00e9e";
        } else if (this.chrNature == 66) {
            this.libnature = "Traite simplifi\u00e9e";
        } else if (this.chrNature == 67) {
            this.libnature = "Traite entreprise";
        } else if (this.chrNature == 68) {
            this.libnature = "Inventaire caisse";
        } else if (this.chrNature == 69) {
            this.libnature = "Pr\u00e9visionnel";
        } else if (this.chrNature == 70) {
            this.libnature = "Patient";
        } else if (this.chrNature == 71) {
            this.libnature = "Consultation G\u00e9n\u00e9.";
        } else if (this.chrNature == 72) {
            this.libnature = "Consultation Sp\u00e9c.";
        } else if (this.chrNature == 73) {
            this.libnature = "Pharmacie";
        } else if (this.chrNature == 74) {
            this.libnature = "Laboratoire";
        } else if (this.chrNature == 75) {
            this.libnature = "Lettre de garantie";
        } else if (this.chrNature == 76) {
            this.libnature = "Hospitalisation";
        } else if (this.chrNature == 77) {
            this.libnature = "Devis";
        } else if (this.chrNature == 78) {
            this.libnature = "Refacturation";
        } else if (this.chrNature == 79) {
            this.libnature = "Bon encaissement";
        } else if (this.chrNature == 180) {
            this.libnature = "Rapport m\u00e9dical";
        } else if (this.chrNature == 181) {
            this.libnature = "Facturation externe";
        } else if (this.chrNature == 182) {
            this.libnature = "R\u00e9capitulatif refacturation";
        } else if (this.chrNature == 80) {
            this.libnature = "R.H";
        } else if (this.chrNature == 81) {
            this.libnature = "Matricule";
        } else if (this.chrNature == 82) {
            this.libnature = "Contrat";
        } else if (this.chrNature == 83) {
            this.libnature = "Attestation";
        } else if (this.chrNature == 84) {
            this.libnature = "Cursus";
        } else if (this.chrNature == 85) {
            this.libnature = "Certificat";
        } else if (this.chrNature == 86) {
            this.libnature = "Correspondance";
        } else if (this.chrNature == 87) {
            this.libnature = "Pr\u00eat (interne/externe/manuel)";
        } else if (this.chrNature == 88) {
            this.libnature = "Cong\u00e9s";
        } else if (this.chrNature == 89) {
            this.libnature = "Absence";
        } else if (this.chrNature == 90) {
            this.libnature = "Bulletin";
        } else if (this.chrNature == 91) {
            this.libnature = "Mission";
        } else if (this.chrNature == 92) {
            this.libnature = "Pointage";
        } else if (this.chrNature == 93) {
            this.libnature = "RH";
        } else if (this.chrNature == 94) {
            this.libnature = "Temps";
        } else if (this.chrNature == 99) {
            this.libnature = "CV";
        } else if (this.chrNature == 100) {
            this.libnature = "Eleves";
        } else if (this.chrNature == 101) {
            this.libnature = "M\u00e9diatheque";
        } else if (this.chrNature == 102) {
            this.libnature = "Inscription/Facturation";
        } else if (this.chrNature == 103) {
            this.libnature = "Appels";
        } else if (this.chrNature == 104) {
            this.libnature = "Note";
        } else if (this.chrNature == 105) {
            this.libnature = "Violences";
        } else if (this.chrNature == 109) {
            this.libnature = "Bon encaissement";
        } else if (this.chrNature == 120) {
            this.libnature = "R\u00e9union Tiers";
        } else if (this.chrNature == 121) {
            this.libnature = "R\u00e9union Commericale";
        } else if (this.chrNature == 122) {
            this.libnature = "SMS";
        } else if (this.chrNature == 123) {
            this.libnature = "VisioConference";
        } else if (this.chrNature == 124) {
            this.libnature = "Certification";
        } else if (this.chrNature == 125) {
            this.libnature = "Messagerie interne envoy\u00e9e";
        } else if (this.chrNature == 126) {
            this.libnature = "Messagerie interne re\u00e7ue";
        } else if (this.chrNature == 127) {
            this.libnature = "Porte feuille affaire";
        } else if (this.chrNature == 128) {
            this.libnature = "Imputation analytique affaire";
        } else if (this.chrNature == 300) {
            this.libnature = "Fournisseur";
        } else if (this.chrNature == 301) {
            this.libnature = "Suspect";
        } else if (this.chrNature == 302) {
            this.libnature = "Prospect";
        } else if (this.chrNature == 303) {
            this.libnature = "Client";
        } else if (this.chrNature == 304) {
            this.libnature = "Proprietaire";
        } else if (this.chrNature == 305) {
            this.libnature = "Copropri\u00e9t\u00e9";
        } else if (this.chrNature == 306) {
            this.libnature = "Locataire";
        } else if (this.chrNature == 160) {
            this.libnature = "Bien";
        } else if (this.chrNature == 161) {
            this.libnature = "Contrat G\u00e9rance";
        } else if (this.chrNature == 162) {
            this.libnature = "Bail Location";
        } else if (this.chrNature == 163) {
            this.libnature = "Travaux";
        } else if (this.chrNature == 164) {
            this.libnature = "Facture Charges";
        } else if (this.chrNature == 165) {
            this.libnature = "Locations";
        } else if (this.chrNature == 171) {
            this.libnature = "Contrat Syndic";
        } else if (this.chrNature == 172) {
            this.libnature = "Budget";
        } else if (this.chrNature == 173) {
            this.libnature = "Appel de Charges";
        } else if (this.chrNature == 175) {
            this.libnature = "Pr\u00e9paration PV";
        } else if (this.chrNature == 176) {
            this.libnature = "D\u00e9cisions AG";
        } else if (this.chrNature == 200) {
            this.libnature = "";
        } else if (this.chrNature == 220) {
            this.libnature = "Demande";
        } else if (this.chrNature == 250) {
            this.libnature = "Inventaire";
        } else if (this.chrNature == 251) {
            this.libnature = "Carnet Chantier";
        } else if (this.chrNature == 252) {
            this.libnature = "B. rupture";
        } else if (this.chrNature == 253) {
            this.libnature = "B. route";
        } else if (this.chrNature == 254) {
            this.libnature = "B. exp\u00e9dition";
        } else if (this.chrNature == 255) {
            this.libnature = "Note Cr\u00e9dit";
        } else if (this.chrNature == 256) {
            this.libnature = "Sp\u00e9cification";
        } else if (this.chrNature == 257) {
            this.libnature = "Taxe martelage";
        } else if (this.chrNature == 258) {
            this.libnature = "Redevance attibution";
        } else if (this.chrNature == 259) {
            this.libnature = "Releve SNBG";
        } else if (this.chrNature == 260) {
            this.libnature = "Fermage et Pr\u00e9compte";
        }
        return this.libnature;
    }

    public String getLib_num() {
        if (this.chrMode == 0) {
            this.lib_num = "" + this.chrNumAn;
        } else if (this.chrMode == 1) {
            this.lib_num = "(lst/mois)";
        } else if (this.chrMode == 2) {
            this.lib_num = "" + this.chrNum;
        }
        return this.lib_num;
    }

    public String getLibformat() {
        if (this.chrFormat == 0) {
            this.libformat = "Chrono simple";
        } else if (this.chrFormat == 1) {
            this.libformat = "MM+Chrono";
        } else if (this.chrFormat == 2) {
            this.libformat = "AA+MM+Chrono";
        } else if (this.chrFormat == 3) {
            this.libformat = "Chrono/AA";
        } else if (this.chrFormat == 4) {
            this.libformat = "Chrono/AAMM";
        } else if (this.chrFormat == 5) {
            this.libformat = "Chrono/JR";
        } else if (this.chrFormat == 6) {
            this.libformat = "Chrono/MM/JR";
        } else if (this.chrFormat == 7) {
            this.libformat = "AAAAMMJJChrono";
        } else if (this.chrFormat == 8) {
            this.libformat = "AA-Chrono";
        } else if (this.chrFormat == 9) {
            this.libformat = "Chrono/MM";
        } else if (this.chrFormat == 10) {
            this.libformat = "AAChrono";
        }
        return this.libformat;
    }

    public long getChrId() {
        return chrId;
    }

    public void setChrId(long chrId) {
        this.chrId = chrId;
    }

    public int getChrNature() {
        return chrNature;
    }

    public void setChrNature(int chrNature) {
        this.chrNature = chrNature;
    }

    public String getChrSerie() {
        return chrSerie;
    }

    public void setChrSerie(String chrSerie) {
        this.chrSerie = chrSerie;
    }

    public String getChrNom() {
        return chrNom;
    }

    public void setChrNom(String chrNom) {
        this.chrNom = chrNom;
    }

    public int getChrPrive() {
        return chrPrive;
    }

    public void setChrPrive(int chrPrive) {
        this.chrPrive = chrPrive;
    }

    public String getChrService() {
        return chrService;
    }

    public void setChrService(String chrService) {
        this.chrService = chrService;
    }

    public int getChrNbCar() {
        return chrNbCar;
    }

    public void setChrNbCar(int chrNbCar) {
        this.chrNbCar = chrNbCar;
    }

    public int getChrMode() {
        return chrMode;
    }

    public void setChrMode(int chrMode) {
        this.chrMode = chrMode;
    }

    public int getChrFormat() {
        return chrFormat;
    }

    public void setChrFormat(int chrFormat) {
        this.chrFormat = chrFormat;
    }

    public String getChrPrefixe() {
        return chrPrefixe;
    }

    public void setChrPrefixe(String chrPrefixe) {
        this.chrPrefixe = chrPrefixe;
    }

    public long getChrNum() {
        return chrNum;
    }

    public void setChrNum(long chrNum) {
        this.chrNum = chrNum;
    }

    public long getChrNumAn() {
        return chrNumAn;
    }

    public void setChrNumAn(long chrNumAn) {
        this.chrNumAn = chrNumAn;
    }

    public long getChrNum01() {
        return chrNum01;
    }

    public void setChrNum01(long chrNum01) {
        this.chrNum01 = chrNum01;
    }

    public long getChrNum02() {
        return chrNum02;
    }

    public void setChrNum02(long chrNum02) {
        this.chrNum02 = chrNum02;
    }

    public long getChrNum03() {
        return chrNum03;
    }

    public void setChrNum03(long chrNum03) {
        this.chrNum03 = chrNum03;
    }

    public long getChrNum04() {
        return chrNum04;
    }

    public void setChrNum04(long chrNum04) {
        this.chrNum04 = chrNum04;
    }

    public long getChrNum05() {
        return chrNum05;
    }

    public void setChrNum05(long chrNum05) {
        this.chrNum05 = chrNum05;
    }

    public long getChrNum06() {
        return chrNum06;
    }

    public void setChrNum06(long chrNum06) {
        this.chrNum06 = chrNum06;
    }

    public long getChrNum07() {
        return chrNum07;
    }

    public void setChrNum07(long chrNum07) {
        this.chrNum07 = chrNum07;
    }

    public long getChrNum08() {
        return chrNum08;
    }

    public void setChrNum08(long chrNum08) {
        this.chrNum08 = chrNum08;
    }

    public long getChrNum09() {
        return chrNum09;
    }

    public void setChrNum09(long chrNum09) {
        this.chrNum09 = chrNum09;
    }

    public long getChrNum10() {
        return chrNum10;
    }

    public void setChrNum10(long chrNum10) {
        this.chrNum10 = chrNum10;
    }

    public long getChrNum11() {
        return chrNum11;
    }

    public void setChrNum11(long chrNum11) {
        this.chrNum11 = chrNum11;
    }

    public long getChrNum12() {
        return chrNum12;
    }

    public void setChrNum12(long chrNum12) {
        this.chrNum12 = chrNum12;
    }

    public String getChrSufixe() {
        return chrSufixe;
    }

    public void setChrSufixe(String chrSufixe) {
        this.chrSufixe = chrSufixe;
    }

    public String getChrJournal() {
        return chrJournal;
    }

    public void setChrJournal(String chrJournal) {
        this.chrJournal = chrJournal;
    }

    public String getChrJournalOd() {
        return chrJournalOd;
    }

    public void setChrJournalOd(String chrJournalOd) {
        this.chrJournalOd = chrJournalOd;
    }

    public String getChrCodeCaisse() {
        return chrCodeCaisse;
    }

    public void setChrCodeCaisse(String chrCodeCaisse) {
        this.chrCodeCaisse = chrCodeCaisse;
    }

    public int getChrModeCaisse() {
        return chrModeCaisse;
    }

    public void setChrModeCaisse(int chrModeCaisse) {
        this.chrModeCaisse = chrModeCaisse;
    }

    public String getChrPeriode() {
        return chrPeriode;
    }

    public void setChrPeriode(String chrPeriode) {
        this.chrPeriode = chrPeriode;
    }

    public long getChrNum1() {
        return chrNum1;
    }

    public void setChrNum1(long chrNum1) {
        this.chrNum1 = chrNum1;
    }

    public long getChrNumAn1() {
        return chrNumAn1;
    }

    public void setChrNumAn1(long chrNumAn1) {
        this.chrNumAn1 = chrNumAn1;
    }

    public long getChrNum011() {
        return chrNum011;
    }

    public void setChrNum011(long chrNum011) {
        this.chrNum011 = chrNum011;
    }

    public long getChrNum021() {
        return chrNum021;
    }

    public void setChrNum021(long chrNum021) {
        this.chrNum021 = chrNum021;
    }

    public long getChrNum031() {
        return chrNum031;
    }

    public void setChrNum031(long chrNum031) {
        this.chrNum031 = chrNum031;
    }

    public long getChrNum041() {
        return chrNum041;
    }

    public void setChrNum041(long chrNum041) {
        this.chrNum041 = chrNum041;
    }

    public long getChrNum051() {
        return chrNum051;
    }

    public void setChrNum051(long chrNum051) {
        this.chrNum051 = chrNum051;
    }

    public long getChrNum061() {
        return chrNum061;
    }

    public void setChrNum061(long chrNum061) {
        this.chrNum061 = chrNum061;
    }

    public long getChrNum071() {
        return chrNum071;
    }

    public void setChrNum071(long chrNum071) {
        this.chrNum071 = chrNum071;
    }

    public long getChrNum081() {
        return chrNum081;
    }

    public void setChrNum081(long chrNum081) {
        this.chrNum081 = chrNum081;
    }

    public long getChrNum091() {
        return chrNum091;
    }

    public void setChrNum091(long chrNum091) {
        this.chrNum091 = chrNum091;
    }

    public long getChrNum101() {
        return chrNum101;
    }

    public void setChrNum101(long chrNum101) {
        this.chrNum101 = chrNum101;
    }

    public long getChrNum111() {
        return chrNum111;
    }

    public void setChrNum111(long chrNum111) {
        this.chrNum111 = chrNum111;
    }

    public long getChrNum121() {
        return chrNum121;
    }

    public void setChrNum121(long chrNum121) {
        this.chrNum121 = chrNum121;
    }

    public String getChrPrefixe1() {
        return chrPrefixe1;
    }

    public void setChrPrefixe1(String chrPrefixe1) {
        this.chrPrefixe1 = chrPrefixe1;
    }

    public String getChrSufixe1() {
        return chrSufixe1;
    }

    public void setChrSufixe1(String chrSufixe1) {
        this.chrSufixe1 = chrSufixe1;
    }

    public long getChrNum2() {
        return chrNum2;
    }

    public void setChrNum2(long chrNum2) {
        this.chrNum2 = chrNum2;
    }

    public long getChrNumAn2() {
        return chrNumAn2;
    }

    public void setChrNumAn2(long chrNumAn2) {
        this.chrNumAn2 = chrNumAn2;
    }

    public long getChrNum012() {
        return chrNum012;
    }

    public void setChrNum012(long chrNum012) {
        this.chrNum012 = chrNum012;
    }

    public long getChrNum022() {
        return chrNum022;
    }

    public void setChrNum022(long chrNum022) {
        this.chrNum022 = chrNum022;
    }

    public long getChrNum032() {
        return chrNum032;
    }

    public void setChrNum032(long chrNum032) {
        this.chrNum032 = chrNum032;
    }

    public long getChrNum042() {
        return chrNum042;
    }

    public void setChrNum042(long chrNum042) {
        this.chrNum042 = chrNum042;
    }

    public long getChrNum052() {
        return chrNum052;
    }

    public void setChrNum052(long chrNum052) {
        this.chrNum052 = chrNum052;
    }

    public long getChrNum062() {
        return chrNum062;
    }

    public void setChrNum062(long chrNum062) {
        this.chrNum062 = chrNum062;
    }

    public long getChrNum072() {
        return chrNum072;
    }

    public void setChrNum072(long chrNum072) {
        this.chrNum072 = chrNum072;
    }

    public long getChrNum082() {
        return chrNum082;
    }

    public void setChrNum082(long chrNum082) {
        this.chrNum082 = chrNum082;
    }

    public long getChrNum092() {
        return chrNum092;
    }

    public void setChrNum092(long chrNum092) {
        this.chrNum092 = chrNum092;
    }

    public long getChrNum102() {
        return chrNum102;
    }

    public void setChrNum102(long chrNum102) {
        this.chrNum102 = chrNum102;
    }

    public long getChrNum112() {
        return chrNum112;
    }

    public void setChrNum112(long chrNum112) {
        this.chrNum112 = chrNum112;
    }

    public long getChrNum122() {
        return chrNum122;
    }

    public void setChrNum122(long chrNum122) {
        this.chrNum122 = chrNum122;
    }

    public String getChrPrefixe2() {
        return chrPrefixe2;
    }

    public void setChrPrefixe2(String chrPrefixe2) {
        this.chrPrefixe2 = chrPrefixe2;
    }

    public String getChrSufixe2() {
        return chrSufixe2;
    }

    public void setChrSufixe2(String chrSufixe2) {
        this.chrSufixe2 = chrSufixe2;
    }

    public long getChrNum3() {
        return chrNum3;
    }

    public void setChrNum3(long chrNum3) {
        this.chrNum3 = chrNum3;
    }

    public long getChrNumAn3() {
        return chrNumAn3;
    }

    public void setChrNumAn3(long chrNumAn3) {
        this.chrNumAn3 = chrNumAn3;
    }

    public long getChrNum013() {
        return chrNum013;
    }

    public void setChrNum013(long chrNum013) {
        this.chrNum013 = chrNum013;
    }

    public long getChrNum023() {
        return chrNum023;
    }

    public void setChrNum023(long chrNum023) {
        this.chrNum023 = chrNum023;
    }

    public long getChrNum033() {
        return chrNum033;
    }

    public void setChrNum033(long chrNum033) {
        this.chrNum033 = chrNum033;
    }

    public long getChrNum043() {
        return chrNum043;
    }

    public void setChrNum043(long chrNum043) {
        this.chrNum043 = chrNum043;
    }

    public long getChrNum053() {
        return chrNum053;
    }

    public void setChrNum053(long chrNum053) {
        this.chrNum053 = chrNum053;
    }

    public long getChrNum063() {
        return chrNum063;
    }

    public void setChrNum063(long chrNum063) {
        this.chrNum063 = chrNum063;
    }

    public long getChrNum073() {
        return chrNum073;
    }

    public void setChrNum073(long chrNum073) {
        this.chrNum073 = chrNum073;
    }

    public long getChrNum083() {
        return chrNum083;
    }

    public void setChrNum083(long chrNum083) {
        this.chrNum083 = chrNum083;
    }

    public long getChrNum093() {
        return chrNum093;
    }

    public void setChrNum093(long chrNum093) {
        this.chrNum093 = chrNum093;
    }

    public long getChrNum103() {
        return chrNum103;
    }

    public void setChrNum103(long chrNum103) {
        this.chrNum103 = chrNum103;
    }

    public long getChrNum113() {
        return chrNum113;
    }

    public void setChrNum113(long chrNum113) {
        this.chrNum113 = chrNum113;
    }

    public long getChrNum123() {
        return chrNum123;
    }

    public void setChrNum123(long chrNum123) {
        this.chrNum123 = chrNum123;
    }

    public String getChrPrefixe3() {
        return chrPrefixe3;
    }

    public void setChrPrefixe3(String chrPrefixe3) {
        this.chrPrefixe3 = chrPrefixe3;
    }

    public String getChrSufixe3() {
        return chrSufixe3;
    }

    public void setChrSufixe3(String chrSufixe3) {
        this.chrSufixe3 = chrSufixe3;
    }

    public long getChrNum4() {
        return chrNum4;
    }

    public void setChrNum4(long chrNum4) {
        this.chrNum4 = chrNum4;
    }

    public long getChrNumAn4() {
        return chrNumAn4;
    }

    public void setChrNumAn4(long chrNumAn4) {
        this.chrNumAn4 = chrNumAn4;
    }

    public long getChrNum014() {
        return chrNum014;
    }

    public void setChrNum014(long chrNum014) {
        this.chrNum014 = chrNum014;
    }

    public long getChrNum024() {
        return chrNum024;
    }

    public void setChrNum024(long chrNum024) {
        this.chrNum024 = chrNum024;
    }

    public long getChrNum034() {
        return chrNum034;
    }

    public void setChrNum034(long chrNum034) {
        this.chrNum034 = chrNum034;
    }

    public long getChrNum044() {
        return chrNum044;
    }

    public void setChrNum044(long chrNum044) {
        this.chrNum044 = chrNum044;
    }

    public long getChrNum054() {
        return chrNum054;
    }

    public void setChrNum054(long chrNum054) {
        this.chrNum054 = chrNum054;
    }

    public long getChrNum064() {
        return chrNum064;
    }

    public void setChrNum064(long chrNum064) {
        this.chrNum064 = chrNum064;
    }

    public long getChrNum074() {
        return chrNum074;
    }

    public void setChrNum074(long chrNum074) {
        this.chrNum074 = chrNum074;
    }

    public long getChrNum084() {
        return chrNum084;
    }

    public void setChrNum084(long chrNum084) {
        this.chrNum084 = chrNum084;
    }

    public long getChrNum094() {
        return chrNum094;
    }

    public void setChrNum094(long chrNum094) {
        this.chrNum094 = chrNum094;
    }

    public long getChrNum104() {
        return chrNum104;
    }

    public void setChrNum104(long chrNum104) {
        this.chrNum104 = chrNum104;
    }

    public long getChrNum114() {
        return chrNum114;
    }

    public void setChrNum114(long chrNum114) {
        this.chrNum114 = chrNum114;
    }

    public long getChrNum124() {
        return chrNum124;
    }

    public void setChrNum124(long chrNum124) {
        this.chrNum124 = chrNum124;
    }

    public String getChrPrefixe4() {
        return chrPrefixe4;
    }

    public void setChrPrefixe4(String chrPrefixe4) {
        this.chrPrefixe4 = chrPrefixe4;
    }

    public String getChrSufixe4() {
        return chrSufixe4;
    }

    public void setChrSufixe4(String chrSufixe4) {
        this.chrSufixe4 = chrSufixe4;
    }

    public long getChrNum5() {
        return chrNum5;
    }

    public void setChrNum5(long chrNum5) {
        this.chrNum5 = chrNum5;
    }

    public long getChrNumAn5() {
        return chrNumAn5;
    }

    public void setChrNumAn5(long chrNumAn5) {
        this.chrNumAn5 = chrNumAn5;
    }

    public long getChrNum015() {
        return chrNum015;
    }

    public void setChrNum015(long chrNum015) {
        this.chrNum015 = chrNum015;
    }

    public long getChrNum025() {
        return chrNum025;
    }

    public void setChrNum025(long chrNum025) {
        this.chrNum025 = chrNum025;
    }

    public long getChrNum035() {
        return chrNum035;
    }

    public void setChrNum035(long chrNum035) {
        this.chrNum035 = chrNum035;
    }

    public long getChrNum045() {
        return chrNum045;
    }

    public void setChrNum045(long chrNum045) {
        this.chrNum045 = chrNum045;
    }

    public long getChrNum055() {
        return chrNum055;
    }

    public void setChrNum055(long chrNum055) {
        this.chrNum055 = chrNum055;
    }

    public long getChrNum065() {
        return chrNum065;
    }

    public void setChrNum065(long chrNum065) {
        this.chrNum065 = chrNum065;
    }

    public long getChrNum075() {
        return chrNum075;
    }

    public void setChrNum075(long chrNum075) {
        this.chrNum075 = chrNum075;
    }

    public long getChrNum085() {
        return chrNum085;
    }

    public void setChrNum085(long chrNum085) {
        this.chrNum085 = chrNum085;
    }

    public long getChrNum095() {
        return chrNum095;
    }

    public void setChrNum095(long chrNum095) {
        this.chrNum095 = chrNum095;
    }

    public long getChrNum105() {
        return chrNum105;
    }

    public void setChrNum105(long chrNum105) {
        this.chrNum105 = chrNum105;
    }

    public long getChrNum115() {
        return chrNum115;
    }

    public void setChrNum115(long chrNum115) {
        this.chrNum115 = chrNum115;
    }

    public long getChrNum125() {
        return chrNum125;
    }

    public void setChrNum125(long chrNum125) {
        this.chrNum125 = chrNum125;
    }

    public String getChrPrefixe5() {
        return chrPrefixe5;
    }

    public void setChrPrefixe5(String chrPrefixe5) {
        this.chrPrefixe5 = chrPrefixe5;
    }

    public String getChrSufixe5() {
        return chrSufixe5;
    }

    public void setChrSufixe5(String chrSufixe5) {
        this.chrSufixe5 = chrSufixe5;
    }

    public long getChrNum6() {
        return chrNum6;
    }

    public void setChrNum6(long chrNum6) {
        this.chrNum6 = chrNum6;
    }

    public long getChrNumAn6() {
        return chrNumAn6;
    }

    public void setChrNumAn6(long chrNumAn6) {
        this.chrNumAn6 = chrNumAn6;
    }

    public String getChrPrefixe6() {
        return chrPrefixe6;
    }

    public void setChrPrefixe6(String chrPrefixe6) {
        this.chrPrefixe6 = chrPrefixe6;
    }

    public String getChrSufixe6() {
        return chrSufixe6;
    }

    public void setChrSufixe6(String chrSufixe6) {
        this.chrSufixe6 = chrSufixe6;
    }

    public long getChrNum7() {
        return chrNum7;
    }

    public void setChrNum7(long chrNum7) {
        this.chrNum7 = chrNum7;
    }

    public long getChrNumAn7() {
        return chrNumAn7;
    }

    public void setChrNumAn7(long chrNumAn7) {
        this.chrNumAn7 = chrNumAn7;
    }

    public String getChrPrefixe7() {
        return chrPrefixe7;
    }

    public void setChrPrefixe7(String chrPrefixe7) {
        this.chrPrefixe7 = chrPrefixe7;
    }

    public String getChrSufixe7() {
        return chrSufixe7;
    }

    public void setChrSufixe7(String chrSufixe7) {
        this.chrSufixe7 = chrSufixe7;
    }

    public long getChrNum8() {
        return chrNum8;
    }

    public void setChrNum8(long chrNum8) {
        this.chrNum8 = chrNum8;
    }

    public long getChrNumAn8() {
        return chrNumAn8;
    }

    public void setChrNumAn8(long chrNumAn8) {
        this.chrNumAn8 = chrNumAn8;
    }

    public String getChrPrefixe8() {
        return chrPrefixe8;
    }

    public void setChrPrefixe8(String chrPrefixe8) {
        this.chrPrefixe8 = chrPrefixe8;
    }

    public String getChrSufixe8() {
        return chrSufixe8;
    }

    public void setChrSufixe8(String chrSufixe8) {
        this.chrSufixe8 = chrSufixe8;
    }

    public long getChrNum9() {
        return chrNum9;
    }

    public void setChrNum9(long chrNum9) {
        this.chrNum9 = chrNum9;
    }

    public long getChrNumAn9() {
        return chrNumAn9;
    }

    public void setChrNumAn9(long chrNumAn9) {
        this.chrNumAn9 = chrNumAn9;
    }

    public String getChrPrefixe9() {
        return chrPrefixe9;
    }

    public void setChrPrefixe9(String chrPrefixe9) {
        this.chrPrefixe9 = chrPrefixe9;
    }

    public String getChrSufixe9() {
        return chrSufixe9;
    }

    public void setChrSufixe9(String chrSufixe9) {
        this.chrSufixe9 = chrSufixe9;
    }

    public long getChrNumA() {
        return chrNumA;
    }

    public void setChrNumA(long chrNumA) {
        this.chrNumA = chrNumA;
    }

    public long getChrNumAnA() {
        return chrNumAnA;
    }

    public void setChrNumAnA(long chrNumAnA) {
        this.chrNumAnA = chrNumAnA;
    }

    public String getChrPrefixeA() {
        return chrPrefixeA;
    }

    public void setChrPrefixeA(String chrPrefixeA) {
        this.chrPrefixeA = chrPrefixeA;
    }

    public String getChrSufixeA() {
        return chrSufixeA;
    }

    public void setChrSufixeA(String chrSufixeA) {
        this.chrSufixeA = chrSufixeA;
    }

    public long getChrIdStr() {
        return chrIdStr;
    }

    public void setChrIdStr(long chrIdStr) {
        this.chrIdStr = chrIdStr;
    }
}
