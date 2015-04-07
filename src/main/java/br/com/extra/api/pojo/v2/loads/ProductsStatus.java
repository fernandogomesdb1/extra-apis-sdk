package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 07/04/2015.
 */
public class ProductsStatus implements Serializable {

    private static final long serialVersionUID = 5996692510969221445L;
    private List<Sku> skus;
    private Object metadata;

    public List<Sku> getSkus() {
        return skus;
    }

    public Object getMetadata() {
        return metadata;
    }
}
