package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Informações de estoque do produto.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock implements Serializable {

    private static final long serialVersionUID = 6336131872031912099L;
    private Integer quantity;
    private Integer crossDockingTime;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCrossDockingTime() {
        return crossDockingTime;
    }

    public void setCrossDockingTime(Integer crossDockingTime) {
        this.crossDockingTime = crossDockingTime;
    }
}
