package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Url do produto para cada site no qual o mesmo está disponível.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Url implements Serializable {

    private static final long serialVersionUID = -1217126574585146484L;
    private String id;
    private String href;
    private String site;

    /**
     * ID do produto.
     */
    public String getId() {
        return id;
    }

    /**
     * {@link Url#getId()}
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Link do produto no site.
     */
    public String getHref() {
        return href;
    }

    /**
     * #{@link Url#getHref()}
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Site no qual o produto está disponível.
     */
    public String getSite() {
        return site;
    }

    /**
     * {@link Url#getSite()}
     */
    public void setSite(String site) {
        this.site = site;
    }
}
