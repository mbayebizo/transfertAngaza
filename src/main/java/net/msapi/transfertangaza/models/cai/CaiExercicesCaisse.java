package net.msapi.transfertangaza.models.cai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Table(name = "cai_exercices_caisse")
@Entity
public class CaiExercicesCaisse {
    @Id
    @Column(name = "execai_id", nullable = false)
    private Long id;

    @Column(name = "execai_date_creat")
    private Instant execaiDateCreat;

    @Column(name = "execai_date_modif")
    private Instant execaiDateModif;

    @Column(name = "execai_date_cloture")
    private Instant execaiDateCloture;

    @Column(name = "execai_user_creat")
    private Long execaiUserCreat;

    @Column(name = "execai_user_cloture")
    private Long execaiUserCloture;

    @Column(name = "execai_user_modif")
    private Long execaiUserModif;

    @Column(name = "execai_date_debut")
    private LocalDate execaiDateDebut;

    @Column(name = "execai_date_fin")
    private LocalDate execaiDateFin;

    @Column(name = "execai_etat")
    private Integer execaiEtat;

    public Integer getExecaiEtat() {
        return execaiEtat;
    }

    public void setExecaiEtat(Integer execaiEtat) {
        this.execaiEtat = execaiEtat;
    }

    public LocalDate getExecaiDateFin() {
        return execaiDateFin;
    }

    public void setExecaiDateFin(LocalDate execaiDateFin) {
        this.execaiDateFin = execaiDateFin;
    }

    public LocalDate getExecaiDateDebut() {
        return execaiDateDebut;
    }

    public void setExecaiDateDebut(LocalDate execaiDateDebut) {
        this.execaiDateDebut = execaiDateDebut;
    }

    public Long getExecaiUserModif() {
        return execaiUserModif;
    }

    public void setExecaiUserModif(Long execaiUserModif) {
        this.execaiUserModif = execaiUserModif;
    }

    public Long getExecaiUserCloture() {
        return execaiUserCloture;
    }

    public void setExecaiUserCloture(Long execaiUserCloture) {
        this.execaiUserCloture = execaiUserCloture;
    }

    public Long getExecaiUserCreat() {
        return execaiUserCreat;
    }

    public void setExecaiUserCreat(Long execaiUserCreat) {
        this.execaiUserCreat = execaiUserCreat;
    }

    public Instant getExecaiDateCloture() {
        return execaiDateCloture;
    }

    public void setExecaiDateCloture(Instant execaiDateCloture) {
        this.execaiDateCloture = execaiDateCloture;
    }

    public Instant getExecaiDateModif() {
        return execaiDateModif;
    }

    public void setExecaiDateModif(Instant execaiDateModif) {
        this.execaiDateModif = execaiDateModif;
    }

    public Instant getExecaiDateCreat() {
        return execaiDateCreat;
    }

    public void setExecaiDateCreat(Instant execaiDateCreat) {
        this.execaiDateCreat = execaiDateCreat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
