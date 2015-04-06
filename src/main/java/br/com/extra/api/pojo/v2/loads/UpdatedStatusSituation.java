package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class UpdatedStatusSituation implements Serializable {

    private static final long serialVersionUID = 3246839777321697186L;
    List<SkuSellerItemStatus> skus;
    Object metadata;

    public List<SkuSellerItemStatus> getSkus() {
        return skus;
    }

    public void setSkus(List<SkuSellerItemStatus> skus) {
        this.skus = skus;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}
