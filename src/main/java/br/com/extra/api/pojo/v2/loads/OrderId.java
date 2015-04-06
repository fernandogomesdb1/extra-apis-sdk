package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class OrderId implements Serializable {

    private static final long serialVersionUID = -7632661505693826161L;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
