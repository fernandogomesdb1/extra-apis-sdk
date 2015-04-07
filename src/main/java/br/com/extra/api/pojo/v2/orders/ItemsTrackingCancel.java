package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

public class ItemsTrackingCancel implements Serializable {

    private static final long serialVersionUID = 1630863631654764962L;
    private String skuSellerId;
    private String description;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public String getDescription() {
        return description;
    }
}
