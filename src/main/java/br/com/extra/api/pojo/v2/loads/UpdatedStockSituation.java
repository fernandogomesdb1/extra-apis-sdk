package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class UpdatedStockSituation implements Serializable {

    private static final long serialVersionUID = -7308967692007966427L;
    private List<SkuSellerItemStock> skus;
    private Object metadata;

    public List<SkuSellerItemStock> getSkus() {
        return skus;
    }

    public Object getMetadata() {
        return metadata;
    }
}
