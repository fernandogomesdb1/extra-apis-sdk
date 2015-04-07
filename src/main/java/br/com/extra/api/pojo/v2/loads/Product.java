package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.Pojos;
import br.com.extra.api.pojo.v2.sellerItems.Attributes;
import br.com.extra.api.pojo.v2.sellerItems.Dimensions;
import br.com.extra.api.pojo.v2.sellerItems.GiftWrap;

import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Product extends Pojos {

    private static final long serialVersionUID = -8278637193392507776L;
    private String skuSellerId;
    private String skuId;
    private String productSellerId;
    private String title;
    private String description;
    private String brand;
    private List<String> gtin;
    private List<String> categories;
    private List<String> images;
    private List<String> videos;
    private Price price;
    private Stock stock;
    private Dimensions dimensions;
    private GiftWrap giftWrap;
    private List<Attributes> attributes;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public String getSkuId() {
        return skuId;
    }

    public String getProductSellerId() {
        return productSellerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getGtin() {
        return gtin;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getImages() {
        return images;
    }

    public List<String> getVideos() {
        return videos;
    }

    public Price getPrice() {
        return price;
    }

    public Stock getStock() {
        return stock;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public GiftWrap getGiftWrap() {
        return giftWrap;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }
}
