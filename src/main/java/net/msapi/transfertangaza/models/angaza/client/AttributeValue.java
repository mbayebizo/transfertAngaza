package net.msapi.transfertangaza.models.angaza.client;

public class AttributeValue{
    public String attribute_qid;
    public String name;
    public String type;
    public Object value;

    public String getAttribute_qid() {
        return attribute_qid;
    }

    public void setAttribute_qid(String attribute_qid) {
        this.attribute_qid = attribute_qid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
