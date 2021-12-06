package net.msapi.transfertangaza.models.angaza.client.detail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{
    public Self self;
    @JsonProperty("za:accounts")
    public ZaAccounts zaAccounts;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public ZaAccounts getZaAccounts() {
        return zaAccounts;
    }

    public void setZaAccounts(ZaAccounts zaAccounts) {
        this.zaAccounts = zaAccounts;
    }
}
