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

    private static final long serialVersionUID = 3824305894838281505L;
    private BigDecimal defaultPrice;
    private BigDecimal offer;
    private String site;

    /**
     * Preço "de" do produto no Marketplace.
     */
    public BigDecimal getDefaultPrice() {
        return defaultPrice;
    }

    /**
     * {@link Price#getDefaultPrice()}
     */
    @JsonProperty("default")
    public void setDefaultPrice(BigDecimal defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    /**
     * Preço real de venda. Preço "por" do produto no Marketplace.
     */
    public BigDecimal getOffer() {
        return offer;
    }

    /**
     * {@link Price#getOffer()}
     */
    public void setOffer(BigDecimal offer) {
        this.offer = offer;
    }

    /**
     * Site no qual o produto ficará ou não disponível.
     */
    public String getSite() {
        return site;
    }

    /**
     * {@link Price#getSite()}
     */
    public void setSite(String site) {
        this.site = site;
    }
}
