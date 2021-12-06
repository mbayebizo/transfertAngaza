package net.msapi.transfertangaza.models.cmm;


import javax.persistence.*;


@Entity
@Table(name = "cmm_devise")
public class CmmDevise{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int devId;
    private String devCode;
    private String devLibelle;
    private String devFormat;
    private Double devTaux1;
    private Double devTaux2;

    @Transient
    private double prixEuro;


    public double getPrixEuro() {
        return prixEuro;
    }

    public int getDevId() {
        return devId;
    }

    public void setDevId(int devId) {
        this.devId = devId;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevLibelle() {
        return devLibelle;
    }

    public void setDevLibelle(String devLibelle) {
        this.devLibelle = devLibelle;
    }

    public String getDevFormat() {
        return devFormat;
    }

    public void setDevFormat(String devFormat) {
        this.devFormat = devFormat;
    }

    public Double getDevTaux1() {
        return devTaux1;
    }

    public void setDevTaux1(Double devTaux1) {
        this.devTaux1 = devTaux1;
    }

    public Double getDevTaux2() {
        return devTaux2;
    }

    public void setDevTaux2(Double devTaux2) {
        this.devTaux2 = devTaux2;
    }
}
