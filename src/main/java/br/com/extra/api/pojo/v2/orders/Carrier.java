package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Informações sobre transportadora.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Carrier implements Serializable {

    private static final long serialVersionUID = -1296882291211916646L;
    private String name;
    private String cnpj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
