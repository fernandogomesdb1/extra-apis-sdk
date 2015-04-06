package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;

/**
 * Informações sobre a Nota Fiscal da compra.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Invoice implements Serializable {

    private static final long serialVersionUID = 893851738922339125L;
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

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getLinkXML() {
        return linkXML;
    }

    public void setLinkXML(String linkXML) {
        this.linkXML = linkXML;
    }

    public String getLinkDanfe() {
        return linkDanfe;
    }

    public void setLinkDanfe(String linkDanfe) {
        this.linkDanfe = linkDanfe;
    }
}
