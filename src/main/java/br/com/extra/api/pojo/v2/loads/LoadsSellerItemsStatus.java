package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class LoadsSellerItemsStatus implements Serializable {

    private static final long serialVersionUID = 990875315700106233L;
    private String skuSellerId;
    private List<StatusLoadsSellerItemsStatus> status;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public List<StatusLoadsSellerItemsStatus> getStatus() {
        return status;
    }
}
