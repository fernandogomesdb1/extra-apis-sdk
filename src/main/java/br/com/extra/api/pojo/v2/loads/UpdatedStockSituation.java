package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatedStockSituation implements Serializable {

    private static final long serialVersionUID = 3057965263003243343L;
    private List<SkuSellerItemStock> skus;
    private Object metadata;

    public List<SkuSellerItemStock> getSkus() {
        return skus;
    }

    public void setSkus(List<SkuSellerItemStock> skus) {
        this.skus = skus;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}
