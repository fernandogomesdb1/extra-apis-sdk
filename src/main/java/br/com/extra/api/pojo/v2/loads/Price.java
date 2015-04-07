package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de preço do produto.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Price implements Serializable {

    private static final long serialVersionUID = 5469778496695456145L;
    private BigDecimal defaultPrice;
    private BigDecimal offer;

    public BigDecimal getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(BigDecimal defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public BigDecimal getOffer() {
        return offer;
    }

    public void setOffer(BigDecimal offer) {
        this.offer = offer;
    }
}
