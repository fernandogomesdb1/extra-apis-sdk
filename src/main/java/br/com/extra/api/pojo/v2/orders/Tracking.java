package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Informações de tracking do pedido.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Tracking implements Serializable {

    private static final long serialVersionUID = 2133310349285270776L;
    private List<ItemTracking> items;
    private String controlPoint;
    private String description;
    private Date occurredAt;
    private Carrier carrier;
    private String url;
    private String number;
    private String sellerDeliveryId;
    private String cte;
    private Invoice invoice;

    public List<ItemTracking> getItems() {
        return items;
    }

    public void setItems(List<ItemTracking> items) {
        this.items = items;
    }

    public String getControlPoint() {
        return controlPoint;
    }

    public void setControlPoint(String controlPoint) {
        this.controlPoint = controlPoint;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(Date occurredAt) {
        this.occurredAt = occurredAt;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
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

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
