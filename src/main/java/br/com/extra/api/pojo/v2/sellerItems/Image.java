package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Lista de imagens do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Image implements Serializable {

    private static final long serialVersionUID = 1091241665598536554L;
    private String type;
    private Boolean main;
    private String url;

    /**
     * Formato da imagem.
     */
    public String getType() {
        return type;
    }

    /**
     * {@link Image#getType()}
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Flag que indica se a imagem é a principal.
     */
    public Boolean isMain() {
        return main;
    }

    /**
     * {@link Image#isMain()}
     */
    public void setMain(Boolean main) {
        this.main = main;
    }

    /**
     * URL da imagem do produto.
     */
    public String getUrl() {
        return url;
    }

    /**
     * {@link Image#getUrl()}
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
