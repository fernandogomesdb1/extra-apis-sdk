package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Lista de videos do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Video implements Serializable {

    private static final long serialVersionUID = -4285539845259161443L;
    private String name;
    private String type;
    private String url;
    private String thumbnail;
    private String embedded;

    /**
     * Nome do vídeo.
     */
    public String getName() {
        return name;
    }

    /**
     * {@link Video#getName()}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Formato do vídeo.
     */
    public String getType() {
        return type;
    }

    /**
     * {@link Video#getType()}
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * URL do vídeo do produto.
     */
    public String getUrl() {
        return url;
    }

    /**
     * {@link Video#getUrl()}
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * URL de thumbnail.
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * {@link Video#getThumbnail()}
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * URL embedded do vídeo.
     */
    public String getEmbedded() {
        return embedded;
    }

    /**
     * {@link Video#getEmbedded()}
     */
    public void setEmbedded(String embedded) {
        this.embedded = embedded;
    }
}
