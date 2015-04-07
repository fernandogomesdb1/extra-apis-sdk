package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class SkuSellerItemStock implements Serializable {

    private static final long serialVersionUID = -5716001637669051991L;
    private String warehouse;
    private String skuSellerId;
    private String status;
    private Date processedAt;
    private String updateValue;
    private String referer;
    private String skuSite;
    private List<String> siteList;
    private List<String> errors;

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(Date processedAt) {
        this.processedAt = processedAt;
    }

    public String getUpdateValue() {
        return updateValue;
    }

    public void setUpdateValue(String updateValue) {
        this.updateValue = updateValue;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getSkuSite() {
        return skuSite;
    }

    public void setSkuSite(String skuSite) {
        this.skuSite = skuSite;
    }

    public List<String> getSiteList() {
        return siteList;
    }

    public void setSiteList(List<String> siteList) {
        this.siteList = siteList;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
