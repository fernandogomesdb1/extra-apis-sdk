package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;

/**
 * Informações sobre o frete do produto.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Freight implements Serializable {

    private static final long serialVersionUID = -178398835901779098L;
    private Double actualAmount;
    private Double chargedAmount;
    private String type;
    private Date scheduledAt;
    private String scheduledPeriod;

    public Double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(Double chargedAmount) {
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
