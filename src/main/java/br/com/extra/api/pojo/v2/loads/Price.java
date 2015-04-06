package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;

/**
 * Informações de preço do produto.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Price implements Serializable {

    private static final long serialVersionUID = 5469778496695456145L;
    private Double defaultPrice;
    private Double offer;

    public Double getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(Double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }
}
