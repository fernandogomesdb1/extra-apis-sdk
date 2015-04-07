package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Lista de videos do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Video implements Serializable {

    private static final long serialVersionUID = 8375469681660634328L;
    private String name;
    private String type;
    private String url;
    private String thumbnail;
    private String embedded;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getEmbedded() {
        return embedded;
    }
}
