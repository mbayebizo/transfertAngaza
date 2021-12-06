package net.msapi.transfertangaza.models.angaza.piaiement;

import java.util.List;

public class Embedded {
    public List<ItemPayement> item;

    public List<ItemPayement> getItem() {
        return item;
    }

    public void setItem(List<ItemPayement> item) {
        this.item = item;
    }
}
