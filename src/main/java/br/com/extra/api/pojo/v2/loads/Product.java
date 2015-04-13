package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.Pojos;
import br.com.extra.api.pojo.v2.sellerItems.Attributes;
import br.com.extra.api.pojo.v2.sellerItems.Dimensions;
import br.com.extra.api.pojo.v2.sellerItems.GiftWrap;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product extends Pojos {

    private static final long serialVersionUID = -37333069095800520L;
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

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProductSellerId() {
        return productSellerId;
    }

    public void setProductSellerId(String productSellerId) {
        this.productSellerId = productSellerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getGtin() {
        return gtin;
    }

    public void setGtin(List<String> gtin) {
        this.gtin = gtin;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public GiftWrap getGiftWrap() {
        return giftWrap;
    }

    public void setGiftWrap(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }
}
