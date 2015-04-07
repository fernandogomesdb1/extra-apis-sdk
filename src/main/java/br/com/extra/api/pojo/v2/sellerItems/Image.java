package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Lista de imagens do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Image implements Serializable {

    private static final long serialVersionUID = 1747499114752056423L;
    private String type;
    private Boolean main;
    private String url;

    public String getType() {
        return type;
    }

    public Boolean isMain() {
        return main;
    }

    public String getUrl() {
        return url;
    }
}
