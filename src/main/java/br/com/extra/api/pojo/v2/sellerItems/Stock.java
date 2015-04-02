package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;

/**
 * Informa��es de estoque do produto para cada site.
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
     * Quantidade de produtos dispon�veis.
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
     * Quantidade de produtos que est�o reservados (com compras ainda n�o confirmadas).
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
     * Tempo de prepara��o/fabrica��o do produto. Esse tempo � inclu�do no c�lculo de frete.
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
     * ID do dep�sito no qual o estoque do produto est� sendo considerado.
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
