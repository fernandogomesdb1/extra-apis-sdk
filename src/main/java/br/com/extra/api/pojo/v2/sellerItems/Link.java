package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informações do catálogo de produtos.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Link implements Serializable {

    private static final long serialVersionUID = 8852615836241333619L;
    private String id;
    private String href;

    /**
     * ID do recurso.
     */
    public String getId() {
        return id;
    }

    /**
     * {@link Link#getId()}
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Link para acesso ao recurso.
     */
    public String getHref() {
        return href;
    }

    /**
     * {@link Link#getHref()}
     */
    public void setHref(String href) {
        this.href = href;
    }
}
