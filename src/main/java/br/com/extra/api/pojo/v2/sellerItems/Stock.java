package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informações de estoque do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = -8683735686516965078L;
    private Integer quantity;
    private Integer reserved;
    private Integer crossDockingTime;
    private Integer warehouse;

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getReserved() {
        return reserved;
    }

    public Integer getCrossDockingTime() {
        return crossDockingTime;
    }

    public Integer getWarehouse() {
        return warehouse;
    }
}
