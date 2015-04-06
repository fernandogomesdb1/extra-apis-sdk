package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;

/**
 * Informações sobre o frete do produto.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class ItemFreight implements Serializable {

    private static final long serialVersionUID = 700040245404662201L;
    private Double actualAmount;
    private Double chargedAmount;
    private Integer transitTime;
    private Integer crossDockingTime;
    private String additionalInfo;
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

    public Integer getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(Integer transitTime) {
        this.transitTime = transitTime;
    }

    public Integer getCrossDockingTime() {
        return crossDockingTime;
    }

    public void setCrossDockingTime(Integer crossDockingTime) {
        this.crossDockingTime = crossDockingTime;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
