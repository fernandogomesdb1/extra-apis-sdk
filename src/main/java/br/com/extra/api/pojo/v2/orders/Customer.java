package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Informações do cliente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Customer implements Serializable {

    private static final long serialVersionUID = -3293049763314645051L;
    private String id;
    private String name;
    private String documentNumber;
    private String type;
    private Date createdAt;
    private String email;
    private List<Telephone> phones;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getType() {
        return type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getEmail() {
        return email;
    }

    public List<Telephone> getPhones() {
        return phones;
    }
}
