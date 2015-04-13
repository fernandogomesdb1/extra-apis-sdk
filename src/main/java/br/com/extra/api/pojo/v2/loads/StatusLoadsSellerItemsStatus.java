package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusLoadsSellerItemsStatus implements Serializable {

    private static final long serialVersionUID = 2988826688887073797L;
    private Boolean active;
    private String site;

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
