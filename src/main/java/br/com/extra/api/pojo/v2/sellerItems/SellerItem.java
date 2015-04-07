package br.com.extra.api.pojo.v2.sellerItems;

import br.com.extra.api.pojo.Pojos;

import java.io.Serializable;
import java.util.List;

/**
 * Produto do Lojista que está disponível para venda.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class SellerItem extends Pojos {

    private static final long serialVersionUID = -729398157012932095L;
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

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getGtin() {
        return gtin;
    }

    public List<Status> getStatus() {
        return status;
    }

    public Link getProduct() {
        return product;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public List<Stock> getStocks() {
        return stocks;
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

    public List<Image> getImages() {
        return images;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public List<Url> getUrls() {
        return urls;
    }
}
