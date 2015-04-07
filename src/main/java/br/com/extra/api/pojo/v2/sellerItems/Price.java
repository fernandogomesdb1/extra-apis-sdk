package br.com.extra.api.pojo.v2.sellerItems;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informa��es de pre�o do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Price implements Serializable {

    private static final long serialVersionUID = 3824305894838281505L;
    private BigDecimal defaultPrice;
    private BigDecimal offer;
    private String site;

    /**
     * Pre�o "de" do produto no Marketplace.
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
     * Pre�o real de venda. Pre�o "por" do produto no Marketplace.
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
     * Site no qual o produto ficar� ou n�o dispon�vel.
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
