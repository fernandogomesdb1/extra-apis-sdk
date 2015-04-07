package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class SkuSellerItemStatus implements Serializable {

    private static final long serialVersionUID = -6101620593979383341L;
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

    public String getSite() {
        return site;
    }

    public String getStatus() {
        return status;
    }

    public Date getProcessedAt() {
        return processedAt;
    }

    public String getUpdateValue() {
        return updateValue;
    }

    public String getReferer() {
        return referer;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSkuSite() {
        return skuSite;
    }

    public List<String> getErrors() {
        return errors;
    }
}
