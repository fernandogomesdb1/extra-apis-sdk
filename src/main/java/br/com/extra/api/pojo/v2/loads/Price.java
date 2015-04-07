package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Informações de preço do produto.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Price implements Serializable {

    private static final long serialVersionUID = -7132362331411130488L;
    private BigDecimal defaultPrice;
    private BigDecimal offer;

    public BigDecimal getDefaultPrice() {
        return defaultPrice;
    }

    public BigDecimal getOffer() {
        return offer;
    }
}
