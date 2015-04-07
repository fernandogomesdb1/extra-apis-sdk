package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

public class CarrierTrackingCancel implements Serializable {

    private static final long serialVersionUID = 3271069599093205946L;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
