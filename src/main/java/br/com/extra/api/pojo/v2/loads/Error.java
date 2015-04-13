package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Error implements Serializable {

    private static final long serialVersionUID = 8688333270253332179L;
    private String code;
    private String type;
    private String message;
    private String skuSellerId;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }
}
