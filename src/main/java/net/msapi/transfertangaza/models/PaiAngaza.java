package net.msapi.transfertangaza.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A PaiAngaza.
 */
@Entity
@Table(name = "pai_angaza")
public class PaiAngaza implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "account_qid")
    private String accountQid;

    @Column(name = "prix")
    private Double prix;

    @Column(name = "angaza_transaction_qid")
    private String angazaTransactionQid;

    @Column(name = "currency")
    private String currency;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    @Column(name = "external_xref")
    private String externalXref;

    @Column(name = "reversed")
    private Boolean reversed;

    @Column(name = "msisdn")
    private String msisdn;

    @Column(name = "qid")
    private String qid;

    @Column(name = "href")
    private String href;

    @Column(name = "etat")
    private Integer etat;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public PaiAngaza id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public PaiAngaza accountNumber(Integer accountNumber) {
        this.setAccountNumber(accountNumber);
        return this;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountQid() {
        return this.accountQid;
    }

    public PaiAngaza accountQid(String accountQid) {
        this.setAccountQid(accountQid);
        return this;
    }

    public void setAccountQid(String accountQid) {
        this.accountQid = accountQid;
    }

    public Double getPrix() {
        return this.prix;
    }

    public PaiAngaza prix(Double prix) {
        this.setPrix(prix);
        return this;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getAngazaTransactionQid() {
        return this.angazaTransactionQid;
    }

    public PaiAngaza angazaTransactionQid(String angazaTransactionQid) {
        this.setAngazaTransactionQid(angazaTransactionQid);
        return this;
    }

    public void setAngazaTransactionQid(String angazaTransactionQid) {
        this.angazaTransactionQid = angazaTransactionQid;
    }

    public String getCurrency() {
        return this.currency;
    }

    public PaiAngaza currency(String currency) {
        this.setCurrency(currency);
        return this;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getEffectiveDate() {
        return this.effectiveDate;
    }

    public PaiAngaza effectiveDate(LocalDate effectiveDate) {
        this.setEffectiveDate(effectiveDate);
        return this;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExternalXref() {
        return this.externalXref;
    }

    public PaiAngaza externalXref(String externalXref) {
        this.setExternalXref(externalXref);
        return this;
    }

    public void setExternalXref(String externalXref) {
        this.externalXref = externalXref;
    }

    public Boolean getReversed() {
        return this.reversed;
    }

    public PaiAngaza reversed(Boolean reversed) {
        this.setReversed(reversed);
        return this;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public PaiAngaza msisdn(String msisdn) {
        this.setMsisdn(msisdn);
        return this;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getQid() {
        return this.qid;
    }

    public PaiAngaza qid(String qid) {
        this.setQid(qid);
        return this;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getHref() {
        return this.href;
    }

    public PaiAngaza href(String href) {
        this.setHref(href);
        return this;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getEtat() {
        return this.etat;
    }

    public PaiAngaza etat(Integer etat) {
        this.setEtat(etat);
        return this;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaiAngaza)) {
            return false;
        }
        return id != null && id.equals(((PaiAngaza) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PaiAngaza{" +
            "id=" + getId() +
            ", accountNumber=" + getAccountNumber() +
            ", accountQid='" + getAccountQid() + "'" +
            ", prix=" + getPrix() +
            ", angazaTransactionQid='" + getAngazaTransactionQid() + "'" +
            ", currency='" + getCurrency() + "'" +
            ", effectiveDate='" + getEffectiveDate() + "'" +
            ", externalXref='" + getExternalXref() + "'" +
            ", reversed='" + getReversed() + "'" +
            ", msisdn='" + getMsisdn() + "'" +
            ", qid='" + getQid() + "'" +
            ", href='" + getHref() + "'" +
            ", etat=" + getEtat() +
            "}";
    }
}
