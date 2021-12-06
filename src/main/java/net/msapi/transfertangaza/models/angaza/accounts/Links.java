package net.msapi.transfertangaza.models.angaza.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Links{
    public Self self;
    @JsonProperty("za:activations")
    public ZaActivations zaActivations;
    @JsonProperty("za:clients")
    public ZaClients zaClients;
    @JsonProperty("za:payments")
    public ZaPayments zaPayments;
    @JsonProperty("za:pricing_group")
    public ZaPricingGroup zaPricingGroup;
    @JsonProperty("za:prospective_account")
    public ZaProspectiveAccount zaProspectiveAccount;
    @JsonProperty("za:responsible_user")
    public ZaResponsibleUser zaResponsibleUser;
    @JsonProperty("za:responsible_users")
    public List<ZaResponsibleUser> zaResponsibleUsers;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public ZaActivations getZaActivations() {
        return zaActivations;
    }

    public void setZaActivations(ZaActivations zaActivations) {
        this.zaActivations = zaActivations;
    }

    public ZaClients getZaClients() {
        return zaClients;
    }

    public void setZaClients(ZaClients zaClients) {
        this.zaClients = zaClients;
    }

    public ZaPayments getZaPayments() {
        return zaPayments;
    }

    public void setZaPayments(ZaPayments zaPayments) {
        this.zaPayments = zaPayments;
    }

    public ZaPricingGroup getZaPricingGroup() {
        return zaPricingGroup;
    }

    public void setZaPricingGroup(ZaPricingGroup zaPricingGroup) {
        this.zaPricingGroup = zaPricingGroup;
    }

    public ZaProspectiveAccount getZaProspectiveAccount() {
        return zaProspectiveAccount;
    }

    public void setZaProspectiveAccount(ZaProspectiveAccount zaProspectiveAccount) {
        this.zaProspectiveAccount = zaProspectiveAccount;
    }

    public ZaResponsibleUser getZaResponsibleUser() {
        return zaResponsibleUser;
    }

    public void setZaResponsibleUser(ZaResponsibleUser zaResponsibleUser) {
        this.zaResponsibleUser = zaResponsibleUser;
    }

    public List<ZaResponsibleUser> getZaResponsibleUsers() {
        return zaResponsibleUsers;
    }

    public void setZaResponsibleUsers(List<ZaResponsibleUser> zaResponsibleUsers) {
        this.zaResponsibleUsers = zaResponsibleUsers;
    }
}
