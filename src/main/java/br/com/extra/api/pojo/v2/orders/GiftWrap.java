package br.com.extra.api.pojo.v2.orders;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de embrulho para presente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GiftWrap implements Serializable {

    private static final long serialVersionUID = -7557967868528529909L;
    private Boolean available;
    private BigDecimal value;
    private Boolean messageSupport;
    private GiftCard giftCard;

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
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
