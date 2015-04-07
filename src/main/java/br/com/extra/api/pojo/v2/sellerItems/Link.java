package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informações do catálogo de produtos.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Link implements Serializable {

    private static final long serialVersionUID = -7676842500945245297L;
    private String id;
    private String href;

    public String getId() {
        return id;
    }

    public String getHref() {
        return href;
    }
}
