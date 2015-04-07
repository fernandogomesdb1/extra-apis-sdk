package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Características do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Attributes implements Serializable {

    private static final long serialVersionUID = -2652017168343674541L;
    private String name;
    private String value;

    /**
     * Nome do atributo.
     */
    public String getName() {
        return name;
    }

    /**
     * {@link Attributes#getName()}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Valor do atributo.
     */
    public String getValue() {
        return value;
    }

    /**
     * {@link Attributes#getValue()}
     */
    public void setValue(String value) {
        this.value = value;
    }
}
