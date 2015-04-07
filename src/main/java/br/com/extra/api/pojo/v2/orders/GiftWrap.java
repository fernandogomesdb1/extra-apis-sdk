package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de embrulho para presente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class GiftWrap implements Serializable {

    private static final long serialVersionUID = -1354633589075919422L;
    private Boolean available;
    private BigDecimal value;
    private Boolean messageSupport;
    private GiftCard giftCard;

    public Boolean isAvailable() {
        return available;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Boolean isMessageSupport() {
        return messageSupport;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }
}
