package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Informações de embrulho para presente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class GiftWrap implements Serializable {

    private static final long serialVersionUID = -7557967868528529909L;
    private Boolean available;
    private Double value;
    private Boolean messageSupport;
    private GiftCard giftCard;

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean isMessageSupport() {
        return messageSupport;
    }

    public void setMessageSupport(Boolean messageSupport) {
        this.messageSupport = messageSupport;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }
}
