package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class LoadsSellerItemsStocks implements Serializable {

    private static final long serialVersionUID = -1924649719737619410L;
    private String skuSellerId;
    private List<LoadsSellerItemsStocks> stocks;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public List<LoadsSellerItemsStocks> getStocks() {
        return stocks;
    }
}
