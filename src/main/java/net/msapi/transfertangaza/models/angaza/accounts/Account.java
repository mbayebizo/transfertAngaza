package net.msapi.transfertangaza.models.angaza.accounts;

import java.util.Date;
import java.util.List;

public class Account {
    public Links _links;
    public String billing_model;
    public List<String> client_qids;
    public int cumulative_days_disabled;
    public String currency;
    public String down_payment;
    public int down_payment_days_included;
    public String full_price;
    public boolean is_postpaid;
    public boolean is_testing;
    public String minimum_payment;
    public String num_installments;
    public int number;
    public String payment_amount_per_period;
    public Date payment_due_date;
    public int payment_period_in_days;
    public String qid;
    public Date registration_date;
    public Object repayment_risk;
    public String status;
    public String total_paid;

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public String getBilling_model() {
        return billing_model;
    }

    public void setBilling_model(String billing_model) {
        this.billing_model = billing_model;
    }

    public List<String> getClient_qids() {
        return client_qids;
    }

    public void setClient_qids(List<String> client_qids) {
        this.client_qids = client_qids;
    }

    public int getCumulative_days_disabled() {
        return cumulative_days_disabled;
    }

    public void setCumulative_days_disabled(int cumulative_days_disabled) {
        this.cumulative_days_disabled = cumulative_days_disabled;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDown_payment() {
        return down_payment;
    }

    public void setDown_payment(String down_payment) {
        this.down_payment = down_payment;
    }

    public int getDown_payment_days_included() {
        return down_payment_days_included;
    }

    public void setDown_payment_days_included(int down_payment_days_included) {
        this.down_payment_days_included = down_payment_days_included;
    }

    public String getFull_price() {
        return full_price;
    }

    public void setFull_price(String full_price) {
        this.full_price = full_price;
    }

    public boolean isIs_postpaid() {
        return is_postpaid;
    }

    public void setIs_postpaid(boolean is_postpaid) {
        this.is_postpaid = is_postpaid;
    }

    public boolean isIs_testing() {
        return is_testing;
    }

    public void setIs_testing(boolean is_testing) {
        this.is_testing = is_testing;
    }

    public String getMinimum_payment() {
        return minimum_payment;
    }

    public void setMinimum_payment(String minimum_payment) {
        this.minimum_payment = minimum_payment;
    }

    public String getNum_installments() {
        return num_installments;
    }

    public void setNum_installments(String num_installments) {
        this.num_installments = num_installments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPayment_amount_per_period() {
        return payment_amount_per_period;
    }

    public void setPayment_amount_per_period(String payment_amount_per_period) {
        this.payment_amount_per_period = payment_amount_per_period;
    }

    public Date getPayment_due_date() {
        return payment_due_date;
    }

    public void setPayment_due_date(Date payment_due_date) {
        this.payment_due_date = payment_due_date;
    }

    public int getPayment_period_in_days() {
        return payment_period_in_days;
    }

    public void setPayment_period_in_days(int payment_period_in_days) {
        this.payment_period_in_days = payment_period_in_days;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public Object getRepayment_risk() {
        return repayment_risk;
    }

    public void setRepayment_risk(Object repayment_risk) {
        this.repayment_risk = repayment_risk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal_paid() {
        return total_paid;
    }

    public void setTotal_paid(String total_paid) {
        this.total_paid = total_paid;
    }
}
