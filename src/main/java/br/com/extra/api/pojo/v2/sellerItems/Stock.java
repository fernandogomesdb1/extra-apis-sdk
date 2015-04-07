package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informações de estoque do produto para cada site.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = -6505101955814304155L;
    private Integer quantity;
    private Integer reserved;
    private Integer crossDockingTime;
    private Integer warehouse;

    /**
     * Quantidade de produtos disponíveis.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * {@link Stock#getQuantity()}
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Quantidade de produtos que estão reservados (com compras ainda não confirmadas).
     */
    public Integer getReserved() {
        return reserved;
    }

    /**
     * {@link Stock#getReserved()}
     */
    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    /**
     * Tempo de preparação/fabricação do produto. Esse tempo é incluído no cálculo de frete.
     */
    public Integer getCrossDockingTime() {
        return crossDockingTime;
    }

    /**
     * {@link Stock#getCrossDockingTime()}
     */
    public void setCrossDockingTime(Integer crossDockingTime) {
        this.crossDockingTime = crossDockingTime;
    }

    /**
     * ID do depósito no qual o estoque do produto está sendo considerado.
     */
    public Integer getWarehouse() {
        return warehouse;
    }

    /**
     * {@link Stock#getWarehouse()}
     */
    public void setWarehouse(Integer warehouse) {
        this.warehouse = warehouse;
    }
}
