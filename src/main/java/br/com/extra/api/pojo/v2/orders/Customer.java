package br.com.extra.api.pojo.v2.orders;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Informações do cliente.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {

    private static final long serialVersionUID = -6581204424547716065L;
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

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telephone> getPhones() {
        return phones;
    }

    public void setPhones(List<Telephone> phones) {
        this.phones = phones;
    }
}
