package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class ItemsTrackings implements Serializable {

    private static final long serialVersionUID = -5573254512892200727L;
    private String skuSellerId;
    private Integer quantity;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
