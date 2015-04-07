package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * IDs dos produtos comprados no pedido e que irão ser atualizados pela operação de tracking.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
public class ItemTrackingUpdate implements Serializable {

    private static final long serialVersionUID = -260662285721518148L;
    private String skuSellerId;
    private Integer quantity;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
