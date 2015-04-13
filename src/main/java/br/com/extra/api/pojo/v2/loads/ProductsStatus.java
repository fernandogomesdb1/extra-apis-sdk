package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import br.com.extra.api.pojo.MetadataItem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 07/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsStatus implements Serializable {

    private static final long serialVersionUID = -4329778734473179513L;
    private List<Sku> skus;
    private List<MetadataItem> metadata;

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public List<MetadataItem> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
    }
}
