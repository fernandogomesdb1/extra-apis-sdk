package br.com.extra.api.pojo.v2.orders;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * IDs dos produtos comprados no pedido e que irão ser atualizados pela operação de tracking.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemTrackingUpdate implements Serializable {

    private static final long serialVersionUID = 9102595632000607237L;
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
