package br.com.extra.api.pojo.v2.sellerItems;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de embrulho para presente.
 *
 * Created by marcos.tanaka on 01/04/2015.
 */
public class GiftWrap implements Serializable {

    private static final long serialVersionUID = -6850663075355265352L;
    private Boolean available;
    private BigDecimal value;
    private Boolean messageSupport;

    public Boolean isAvailable() {
        return available;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Boolean isMessageSupport() {
        return messageSupport;
    }
}
