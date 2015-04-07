package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class StatusLoadsSellerItemsStatus implements Serializable {

    private static final long serialVersionUID = 5895247880592079763L;
    private Boolean active;
    private String site;

    public Boolean isActive() {
        return active;
    }

    public String getSite() {
        return site;
    }
}
