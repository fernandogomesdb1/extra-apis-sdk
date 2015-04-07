package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class SkuSellerItemStatus implements Serializable {

    private static final long serialVersionUID = 5025990871868548994L;
    private String skuSellerId;
    private String site;
    private String status;
    private Date processedAt;
    private String updateValue;
    private String referer;
    private String siteName;
    private String skuSite;
    private List<String> errors;

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSkuSite() {
        return skuSite;
    }

    public void setSkuSite(String skuSite) {
        this.skuSite = skuSite;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
