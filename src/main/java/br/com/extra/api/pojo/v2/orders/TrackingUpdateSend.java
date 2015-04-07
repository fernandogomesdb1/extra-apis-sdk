package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TrackingUpdateSend implements Serializable {

    private static final long serialVersionUID = -179386303440856709L;
    private List<ItemTrackingUpdate> items;
    private Date occurredAt;
    private String url;
    private String number;
    private String sellerDeliveryId;
    private String cte;
    private Carrier carrier;
    private Invoice invoice;

    public List<ItemTrackingUpdate> getItems() {
        return items;
    }

    public void setItems(List<ItemTrackingUpdate> items) {
        this.items = items;
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

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
