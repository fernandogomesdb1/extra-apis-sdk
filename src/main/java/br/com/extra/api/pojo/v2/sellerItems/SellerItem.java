package br.com.extra.api.pojo.v2.sellerItems;

import br.com.extra.api.pojo.Pojos;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Produto do Lojista que está disponível para venda.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerItem extends Pojos {

    private static final long serialVersionUID = -5336676250161957930L;
    private String skuSellerId;
    private String title;
    private String brand;
    private List<String> gtin;
    private List<Status> status;
    private Link product;
    private List<Price> prices;
    private List<Stock> stocks;
    private Dimensions dimensions;
    private GiftWrap giftWrap;
    private List<Attributes> attributes;
    private List<Image> images;
    private List<Video> videos;
    private List<Url> urls;

    /**
     * SKU ID do produto do Lojista.
     */
    public String getSkuSellerId() {
        return skuSellerId;
    }

    /**
     * {@link SellerItem#getSkuSellerId()}
     */
    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    /**
     * Nome no Marketplace. Ex Televisor de LCD Sony Bravia 40”...
     */
    public String getTitle() {
        return title;
    }

    /**
     * {@link SellerItem#getTitle()}
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Marca. Ex Sony.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * {@link SellerItem#getBrand()}
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Lista que pode conter tanto o código EAN do produto (código de barras) quanto códigos ISBN (geralmente utilizados para livros).
     */
    public List<String> getGtin() {
        return gtin;
    }

    /**
     * {@link SellerItem#getGtin()}
     */
    public void setGtin(List<String> gtin) {
        this.gtin = gtin;
    }

    /**
     * {@link Status}
     */
    public List<Status> getStatus() {
        return status;
    }

    /**
     * {@link Status}
     */
    public void setStatus(List<Status> status) {
        this.status = status;
    }

    /**
     * {@link Link}
     */
    public Link getProduct() {
        return product;
    }

    /**
     * {@link Link}
     */
    public void setProduct(Link product) {
        this.product = product;
    }

    /**
     * {@link Price}
     */
    public List<Price> getPrices() {
        return prices;
    }

    /**
     * {@link Price}
     */
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * {@link Stock}
     */
    public List<Stock> getStocks() {
        return stocks;
    }

    /**
     * {@link Stock}
     */
    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    /**
     * {@link Dimensions}
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * {@link Dimensions}
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * {@link GiftWrap}
     */
    public GiftWrap getGiftWrap() {
        return giftWrap;
    }

    /**
     * {@link GiftWrap}
     */
    public void setGiftWrap(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }

    /**
     * {@link Attributes}
     */
    public List<Attributes> getAttributes() {
        return attributes;
    }

    /**
     * {@link Attributes}
     */
    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    /**
     * {@link Image}
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * {@link Image}
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * {@link Video}
     */
    public List<Video> getVideos() {
        return videos;
    }

    /**
     * {@link Video}
     */
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    /**
     * {@link Url}
     */
    public List<Url> getUrls() {
        return urls;
    }

    /**
     * {@link Url}
     */
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }
}
