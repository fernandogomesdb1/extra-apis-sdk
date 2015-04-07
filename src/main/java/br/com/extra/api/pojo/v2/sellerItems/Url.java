package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Url do produto para cada site no qual o mesmo está disponível.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Url implements Serializable {

    private static final long serialVersionUID = 2593293647127388768L;
    private String id;
    private String href;
    private String site;

    public String getId() {
        return id;
    }

    public String getHref() {
        return href;
    }

    public String getSite() {
        return site;
    }
}
