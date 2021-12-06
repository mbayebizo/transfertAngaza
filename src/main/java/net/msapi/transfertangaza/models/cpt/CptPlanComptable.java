package net.msapi.transfertangaza.models.cpt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cpt_plan_comptable")
public class CptPlanComptable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long plcId;
    private Date plcDateCreat;
    private Date plcDateModif;
    private Long plcUserCreat;
    private Long plcUserModif;
    private String plcFiscalite;
    private String plcCompte;
    private String plcLibre;
    private String plcLibelleCpteFr;
    private String plcLibelleCpteUk;
    private String plcLibelleCpteSp;
    private String plcCodeRacine;
    private String plcLibelleRacineFr;
    private String plcLibelleRacineUk;
    private String plcLibelleRacineSp;
    private Integer plcNature;
    private Boolean plcRanDetaille;
    private Double plcTauxTaxe;
    private Integer plcInactif;
    private String plcLibelleNatureFr;
    private String plcLibelleNatureUk;
    private String plcLibelleNatureSp;
    private Integer plcSens;
    private String plcAnalCle1;
    private String plcAnalCle2;
    private String plcSage;
    private String plcCompteSyscohada;
    private String plcCompteAutre;
    private Long execptId;
}
