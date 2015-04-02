package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informações de dimensões do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Dimensions implements Serializable {

    private static final long serialVersionUID = 6091033523906789994L;
    private Integer weight;
    private Integer length;
    private Integer width;
    private Integer height;

    /**
     * Peso do produto, em quilos.
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * {@link Dimensions#getWeight()}
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Comprimento do produto, em metros.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * {@link Dimensions#getLength()}
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Largura do produto, em metros.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * {@link Dimensions#getWidth()}
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Altura do produto, em metros.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * {@link Dimensions#getHeight()}
     */
    public void setHeight(Integer height) {
        this.height = height;
    }
}
