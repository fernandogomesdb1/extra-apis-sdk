package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class LoadsSellerItemsStatus implements Serializable {

    private static final long serialVersionUID = 4721936867604306535L;
    private String skuSellerId;
    private List<StatusLoadsSellerItemsStatus> status;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public List<StatusLoadsSellerItemsStatus> getStatus() {
        return status;
    }

    public void setStatus(List<StatusLoadsSellerItemsStatus> status) {
        this.status = status;
    }
}
