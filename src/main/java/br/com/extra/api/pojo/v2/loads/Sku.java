package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.v2.sellerItems.Link;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by marcos.tanaka on 07/04/2015.
 */
public class Sku implements Serializable {

    private static final long serialVersionUID = -1517870331087150703L;
    Link skuSeller;
    String status;
    Date createdAt;

    public Link getSkuSeller() {
        return skuSeller;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
