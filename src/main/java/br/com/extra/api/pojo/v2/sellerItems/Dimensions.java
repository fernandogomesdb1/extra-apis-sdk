package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informações de dimensões do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Dimensions implements Serializable {

    private static final long serialVersionUID = -6097888662679164638L;
    private Integer weight;
    private Integer length;
    private Integer width;
    private Integer height;

    public Integer getWeight() {
        return weight;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }
}
