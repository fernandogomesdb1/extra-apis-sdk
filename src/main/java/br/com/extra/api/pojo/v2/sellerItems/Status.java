package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Status do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Status implements Serializable {

    private static final long serialVersionUID = 5350034438318835427L;
    private Boolean active;
    private String site;

    public Boolean isActive() {
        return active;
    }

    public String getSite() {
        return site;
    }
}