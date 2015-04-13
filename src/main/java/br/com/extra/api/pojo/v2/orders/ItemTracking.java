package br.com.extra.api.pojo.v2.orders;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Lista de itens alterados pela operação de tracking.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemTracking implements Serializable {

    private static final long serialVersionUID = 8064763065989614588L;
    private String skuSellerId;
    private Integer quantity;
    private String href;

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

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
