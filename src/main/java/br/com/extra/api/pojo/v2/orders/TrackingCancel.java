package br.com.extra.api.pojo.v2.orders;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingCancel implements Serializable {

    private static final long serialVersionUID = -6448914189276282624L;
    private List<ItemsTrackingCancel> items;
    private String info;
    private Date occurredAt;
    private String url;
    private String number;
    private String sellerDeliveryId;
    private String cte;
    private List<CarrierTrackingCancel> carrier;

    public List<ItemsTrackingCancel> getItems() {
        return items;
    }

    public void setItems(List<ItemsTrackingCancel> items) {
        this.items = items;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(Date occurredAt) {
        this.occurredAt = occurredAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSellerDeliveryId() {
        return sellerDeliveryId;
    }

    public void setSellerDeliveryId(String sellerDeliveryId) {
        this.sellerDeliveryId = sellerDeliveryId;
    }

    public String getCte() {
        return cte;
    }

    public void setCte(String cte) {
        this.cte = cte;
    }

    public List<CarrierTrackingCancel> getCarrier() {
        return carrier;
    }

    public void setCarrier(List<CarrierTrackingCancel> carrier) {
        this.carrier = carrier;
    }
}
