package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de embrulho para presente.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class GiftWrap implements Serializable {

    private static final long serialVersionUID = 4836912984239615880L;
    private Boolean available;
    private BigDecimal value;
    private Boolean messageSupport;

    /**
     * Flag que indica se existe embrulho para presente para o produto.
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * {@link GiftWrap#isAvailable()}
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * Valor cobrado pelo embrulho.
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * {@link GiftWrap#getValue()}
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Flag que indica se é possível incluir uma mensagem.
     */
    public Boolean isMessageSupport() {
        return messageSupport;
    }

    /**
     * {@link GiftWrap#isMessageSupport()}
     */
    public void setMessageSupport(Boolean messageSupport) {
        this.messageSupport = messageSupport;
    }
}
