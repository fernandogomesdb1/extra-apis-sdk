package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Características do produto.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Attributes implements Serializable {

    private static final long serialVersionUID = 1182146053015823548L;
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
