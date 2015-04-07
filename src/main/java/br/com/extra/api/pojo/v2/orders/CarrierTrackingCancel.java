package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

public class CarrierTrackingCancel implements Serializable {

    private static final long serialVersionUID = -1166929625697797326L;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
