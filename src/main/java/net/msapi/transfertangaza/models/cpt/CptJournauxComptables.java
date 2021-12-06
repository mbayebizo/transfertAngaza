package net.msapi.transfertangaza.models.cpt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cpt_journaux_comptables")
public class CptJournauxComptables  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pljId;
    private Timestamp pljDateCreat;
    private Timestamp pljDateModif;
    private Long pljUserCreat;
    private Long pljUserModif;
    private String pljCode;
    private String pljLibelleFr;
    private String pljLibelleUk;
    private String pljLibelleSp;
    private Integer pljNature;
    private Integer pljReserve;
    private Integer pljAnalytique;
    private String pljCompteTreso;
    private String pljCompteTresoNew;
    private Integer pljPiece;
    private Integer pljScenario;
    private Integer pljTypeDevise;
    private String pljChoixDevise;
    private String pljBudjet;
    private Integer pljInactif;
    private Integer pljFormatDevise;
    private Integer pljDvMbsp;
    private Integer pljDvAbsp;
    private Integer pljDvMbhp;
    private Integer pljDvAbhp;
    private Integer pljModeTreso;
    private String pljProjet;
    private String pljCodeBanque;
    private String pljCodeGuichet;
    private String pljNumeroCompte;
    private String pljCleRib;
    private String pljIban;
    private String pljSwift;
    private String pljCiviliteGestionnaire;
    private String pljNomGestionnaire;
    private String pljPrenomGestionnaire;
    private String pljTelephoneGestionnaire;
    private String pljMailGestionnaire;
    private Integer pljSaisieInterdite;
    private Long execptId;

}
