package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Informações sobre o frete do produto.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Freight implements Serializable {

    private static final long serialVersionUID = -178398835901779098L;
    private BigDecimal actualAmount;
    private BigDecimal chargedAmount;
    private String type;
    private Date scheduledAt;
    private String scheduledPeriod;

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public BigDecimal getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(BigDecimal chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(Date scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public String getScheduledPeriod() {
        return scheduledPeriod;
    }

    public void setScheduledPeriod(String scheduledPeriod) {
        this.scheduledPeriod = scheduledPeriod;
    }
}
