package br.com.extra.api.pojo.v2.sellerItems;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * Informa��es de pre�o do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Price implements Serializable {

    private static final long serialVersionUID = 3824305894838281505L;
    private Double defaultPrice;
    private Double offer;
    private String site;

    /**
     * Pre�o "de" do produto no Marketplace.
     */
    public Double getDefaultPrice() {
        return defaultPrice;
    }

    /**
     * {@link Price#getDefaultPrice()}
     */
    @JsonProperty("default")
    public void setDefaultPrice(Double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    /**
     * Pre�o real de venda. Pre�o "por" do produto no Marketplace.
     */
    public Double getOffer() {
        return offer;
    }

    /**
     * {@link Price#getOffer()}
     */
    public void setOffer(Double offer) {
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
