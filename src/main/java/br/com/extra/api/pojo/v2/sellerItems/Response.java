package br.com.extra.api.pojo.v2.sellerItems;

import br.com.extra.api.pojo.Pojos;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by marcos.tanaka on 01/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response extends Pojos {

    private List<SellerItem> sellerItems;
    private Object metadata;

    public List<SellerItem> getSellerItems() {
        return sellerItems;
    }

    public void setSellerItems(List<SellerItem> sellerItems) {
        this.sellerItems = sellerItems;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
