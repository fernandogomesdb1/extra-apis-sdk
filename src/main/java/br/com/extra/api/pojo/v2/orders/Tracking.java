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

    private static final long serialVersionUID = 8229185629708923379L;
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

    public String getControlPoint() {
        return controlPoint;
    }

    public String getDescription() {
        return description;
    }

    public Date getOccurredAt() {
        return occurredAt;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public String getUrl() {
        return url;
    }

    public String getNumber() {
        return number;
    }

    public String getSellerDeliveryId() {
        return sellerDeliveryId;
    }

    public String getCte() {
        return cte;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
