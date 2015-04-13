package br.com.extra.api.pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by tiago.bono on 08/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetadataItem implements Serializable {

    private static final long serialVersionUID = -6261646584878065888L;

    public MetadataItem() {
    }

    public MetadataItem(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /* Chave */
    private String key;
    /* Valor */
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
