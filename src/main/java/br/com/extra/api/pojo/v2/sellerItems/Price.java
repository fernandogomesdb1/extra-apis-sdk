package br.com.extra.api.pojo.v2.sellerItems;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de preço do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Price implements Serializable {

    private static final long serialVersionUID = -2231394681920274088L;
    private BigDecimal defaultPrice;
    private BigDecimal offer;
    private String site;

    public BigDecimal getDefaultPrice() {
        return defaultPrice;
    }

    public BigDecimal getOffer() {
        return offer;
    }

    public String getSite() {
        return site;
    }
}
