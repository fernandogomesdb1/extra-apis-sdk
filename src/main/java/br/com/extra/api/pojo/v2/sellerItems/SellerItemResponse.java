package br.com.extra.api.pojo.v2.sellerItems;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Usada para converter o retorno de métodos que retornam lista de SellerItem.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerItemResponse {

    @JsonProperty("sellerItems")
    private List<SellerItem> SellerItemList;

    @JsonProperty("metadata")
    private List<Object> metadataList;

    public List<SellerItem> getSellerItemList() {
        return SellerItemList;
    }

    public void setSellerItemList(List<SellerItem> sellerItemList) {
        this.SellerItemList = sellerItemList;
    }

    public List<Object> getMetadataList() {
        return metadataList;
    }

    public void setMetadataList(List<Object> metadataList) {
        this.metadataList = metadataList;
    }
}
