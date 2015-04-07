package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Telefones do cliente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Telephone implements Serializable {

    private static final long serialVersionUID = 8233226865536387215L;
    private String number;
    private String type;

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
