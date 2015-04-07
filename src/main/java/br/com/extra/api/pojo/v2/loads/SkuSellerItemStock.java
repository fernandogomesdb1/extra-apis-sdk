package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class SkuSellerItemStock implements Serializable {

    private static final long serialVersionUID = -7238944578911705583L;
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

    public String getSkuSellerId() {
        return skuSellerId;
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

    public String getSkuSite() {
        return skuSite;
    }

    public List<String> getSiteList() {
        return siteList;
    }

    public List<String> getErrors() {
        return errors;
    }
}
