package net.msapi.transfertangaza.models.angaza.piaiement;

public class RootPayement {
    public Embedded _embedded;
    public Links _links;
    public int limit;
    public int max_total_count;
    public int offset;
    public int total_count;

    public Embedded get_embedded() {
        return _embedded;
    }

    public void set_embedded(Embedded _embedded) {
        this._embedded = _embedded;
    }

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getMax_total_count() {
        return max_total_count;
    }

    public void setMax_total_count(int max_total_count) {
        this.max_total_count = max_total_count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }
}
