package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;

/**
 * Informações de estoque do produto.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = -2532346537354902279L;
    private Integer quantity;
    private Integer crossDockingTime;

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getCrossDockingTime() {
        return crossDockingTime;
    }
}
