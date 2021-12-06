package net.msapi.transfertangaza.models.angaza.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Links{
    public Self self;
    @JsonProperty("za:accounts")
    public ZaAccounts zaAccounts;
    public List<ItemClient> item;
    public Next next;

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

    public List<ItemClient> getItem() {
        return item;
    }

    public void setItem(List<ItemClient> item) {
        this.item = item;
    }

    public Next getNext() {
        return next;
    }

    public void setNext(Next next) {
        this.next = next;
    }
}
