package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Lista de itens alterados pela operação de tracking.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class ItemTracking implements Serializable {

    private static final long serialVersionUID = -4433733356146252942L;
    private String skuSellerId;
    private Integer quantity;
    private String href;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getHref() {
        return href;
    }
}
