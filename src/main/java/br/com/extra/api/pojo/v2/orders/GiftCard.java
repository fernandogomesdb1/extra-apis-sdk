package br.com.extra.api.pojo.v2.orders;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Mensagem que deverá ser enviada juntamente com o embrulho de presente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GiftCard implements Serializable {

    private static final long serialVersionUID = 8113581074568231809L;
    private String from;
    private String to;
    private String message;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
