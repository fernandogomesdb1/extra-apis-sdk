package br.com.extra.api.pojo.v2.sellerItems;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Status do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status implements Serializable {

    private static final long serialVersionUID = -957303418731078360L;
    private Boolean active;
    private String site;

    /**
     * Status do produto.
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * {@link Status#isActive()}
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Site para o qual o status é considerado.
     */
    public String getSite() {
        return site;
    }

    /**
     * {@link Status#getSite()}
     */
    public void setSite(String site) {
        this.site = site;
    }
}