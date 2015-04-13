package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoadsSellerItemsPrices implements Serializable {

    private static final long serialVersionUID = -5746410685698868344L;
    private String skuSellerId;
    private List<LoadsSellerItemsPrices> prices;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public List<LoadsSellerItemsPrices> getPrices() {
        return prices;
    }

    public void setPrices(List<LoadsSellerItemsPrices> prices) {
        this.prices = prices;
    }
}
