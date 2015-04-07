package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;

/**
 * Endereço.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Address implements Serializable {

    private static final long serialVersionUID = 8924619580351292815L;
    private String address;
    private String number;
    private String complement;
    private String quarter;
    private String reference;
    private String city;
    private String state;
    private String countryId;
    private String zipCode;
    private String recipientName;

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getQuarter() {
        return quarter;
    }

    public String getReference() {
        return reference;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getRecipientName() {
        return recipientName;
    }
}
