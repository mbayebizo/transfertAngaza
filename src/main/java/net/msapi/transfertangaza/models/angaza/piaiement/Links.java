package net.msapi.transfertangaza.models.angaza.piaiement;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Links{
    public Self self;
    @JsonProperty("za:account")
    public ZaAccount zaAccount;
    @JsonProperty("za:activation")
    public ZaActivation zaActivation;
    @JsonProperty("za:recorder")
    public ZaRecorder zaRecorder;
    public List<ItemPayement> item;
    public Next next;
}
