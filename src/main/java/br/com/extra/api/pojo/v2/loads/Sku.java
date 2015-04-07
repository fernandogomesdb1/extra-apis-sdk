package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.v2.sellerItems.Link;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by marcos.tanaka on 07/04/2015.
 */
public class Sku implements Serializable {

    private static final long serialVersionUID = -6261646584878065888L;
    Link skuSeller;
    String status;
    Date createdAt;

    public Link getSkuSeller() {
        return skuSeller;
    }

    public void setSkuSeller(Link skuSeller) {
        this.skuSeller = skuSeller;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
