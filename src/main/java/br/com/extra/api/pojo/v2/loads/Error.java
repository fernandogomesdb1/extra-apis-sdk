package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Error implements Serializable {

    private static final long serialVersionUID = 5608455427407756196L;
    private String code;
    private String type;
    private String message;
    private String skuSellerId;

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }
}
