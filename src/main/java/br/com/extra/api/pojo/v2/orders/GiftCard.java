package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Mensagem que deverá ser enviada juntamente com o embrulho de presente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class GiftCard implements Serializable {

    private static final long serialVersionUID = 4033380625427577167L;
    private String from;
    private String to;
    private String message;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }
}
