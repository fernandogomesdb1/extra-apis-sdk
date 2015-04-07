package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class LoadsSellerItemsPrices implements Serializable {

    private static final long serialVersionUID = 2670953835259686403L;
    private String skuSellerId;
    private List<LoadsSellerItemsPrices> prices;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public List<LoadsSellerItemsPrices> getPrices() {
        return prices;
    }
}
