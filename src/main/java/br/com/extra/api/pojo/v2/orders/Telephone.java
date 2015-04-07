package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Telefones do cliente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Telephone implements Serializable {

    private static final long serialVersionUID = -3418302493910143076L;
    private String number;
    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
