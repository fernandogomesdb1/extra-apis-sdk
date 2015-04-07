package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Informações sobre o frete do produto.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class ItemFreight implements Serializable {

    private static final long serialVersionUID = -4804227631138688409L;
    private BigDecimal actualAmount;
    private BigDecimal chargedAmount;
    private Integer transitTime;
    private Integer crossDockingTime;
    private String additionalInfo;
    private String type;
    private Date scheduledAt;
    private String scheduledPeriod;

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public BigDecimal getChargedAmount() {
        return chargedAmount;
    }

    public Integer getTransitTime() {
        return transitTime;
    }

    public Integer getCrossDockingTime() {
        return crossDockingTime;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public String getType() {
        return type;
    }

    public Date getScheduledAt() {
        return scheduledAt;
    }

    public String getScheduledPeriod() {
        return scheduledPeriod;
    }
}
