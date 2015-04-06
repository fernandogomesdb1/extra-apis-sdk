package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Item do pedido.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Item implements Serializable {

    private static final long serialVersionUID = 6540047499116766757L;
    private String id;
    private String skuSellerId;
    private String name;
    private Double salePrice;
    private Boolean sent;
    private ItemFreight freight;
    private GiftWrap giftWrap;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }

    public ItemFreight getFreight() {
        return freight;
    }

    public void setFreight(ItemFreight freight) {
        this.freight = freight;
    }

    public GiftWrap getGiftWrap() {
        return giftWrap;
    }

    public void setGiftWrap(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }
}
