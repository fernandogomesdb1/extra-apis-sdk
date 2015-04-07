package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class UpdatedStatusSituation implements Serializable {

    private static final long serialVersionUID = 8201799939025235211L;
    List<SkuSellerItemStatus> skus;
    Object metadata;

    public Object getMetadata() {
        return metadata;
    }

    public List<SkuSellerItemStatus> getSkus() {
        return skus;
    }
}
