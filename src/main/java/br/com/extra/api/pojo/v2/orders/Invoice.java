package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;

/**
 * Informações sobre a Nota Fiscal da compra.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Invoice implements Serializable {

    private static final long serialVersionUID = -2385451447033343222L;
    private String cnpj;
    private String number;
    private String serie;
    private Date issuedAt;
    private String accessKey;
    private String linkXML;
    private String linkDanfe;

    public String getCnpj() {
        return cnpj;
    }

    public String getNumber() {
        return number;
    }

    public String getSerie() {
        return serie;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getLinkXML() {
        return linkXML;
    }

    public String getLinkDanfe() {
        return linkDanfe;
    }
}
