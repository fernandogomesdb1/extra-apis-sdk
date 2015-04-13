package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 07/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsStatus implements Serializable {

    private static final long serialVersionUID = -4329778734473179513L;
    private List<Sku> skus;
    private Object metadata;

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}
