package net.msapi.transfertangaza.models.angaza.piaiement;

import java.util.Date;

public class ItemPayement {
    public int account_number;
    public String account_qid;
    public String amount;
    public String angaza_transaction_qid;
    public String currency;
    public Date effective_date;
    public String external_xref;
    public boolean is_reversed;
    public String msisdn;
    public String qid;
    public String href;
    private int etat;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_qid() {
        return account_qid;
    }

    public void setAccount_qid(String account_qid) {
        this.account_qid = account_qid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAngaza_transaction_qid() {
        return angaza_transaction_qid;
    }

    public void setAngaza_transaction_qid(String angaza_transaction_qid) {
        this.angaza_transaction_qid = angaza_transaction_qid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getEffective_date() {
        return effective_date;
    }

    public void setEffective_date(Date effective_date) {
        this.effective_date = effective_date;
    }

    public String getExternal_xref() {
        return external_xref;
    }

    public void setExternal_xref(String external_xref) {
        this.external_xref = external_xref;
    }

    public boolean isIs_reversed() {
        return is_reversed;
    }

    public void setIs_reversed(boolean is_reversed) {
        this.is_reversed = is_reversed;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
