package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Informações sobre transportadora.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Carrier implements Serializable {

    private static final long serialVersionUID = 3706244858250161667L;
    private String name;
    private String cnpj;

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }
}
