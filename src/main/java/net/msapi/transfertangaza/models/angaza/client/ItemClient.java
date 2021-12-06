package net.msapi.transfertangaza.models.angaza.client;

import java.util.List;

public class ItemClient {
    public Links _links;
    public List<AttributeValue> attribute_values;
    public Object external_xref;
    public String name;
    public String primary_phone;
    public String qid;
    public String href;

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public List<AttributeValue> getAttribute_values() {
        return attribute_values;
    }

    public void setAttribute_values(List<AttributeValue> attribute_values) {
        this.attribute_values = attribute_values;
    }

    public Object getExternal_xref() {
        return external_xref;
    }

    public void setExternal_xref(Object external_xref) {
        this.external_xref = external_xref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimary_phone() {
        return primary_phone;
    }

    public void setPrimary_phone(String primary_phone) {
        this.primary_phone = primary_phone;
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
}
