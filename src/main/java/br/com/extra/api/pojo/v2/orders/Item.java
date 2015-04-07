package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Item do pedido.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Item implements Serializable {

    private static final long serialVersionUID = 6414259091323453350L;
    private String id;
    private String skuSellerId;
    private String name;
    private BigDecimal salePrice;
    private Boolean sent;
    private ItemFreight freight;
    private GiftWrap giftWrap;

    public String getId() {
        return id;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public Boolean isSent() {
        return sent;
    }

    public ItemFreight getFreight() {
        return freight;
    }

    public GiftWrap getGiftWrap() {
        return giftWrap;
    }
}
