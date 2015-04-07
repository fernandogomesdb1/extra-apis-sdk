package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TrackingUpdateSend implements Serializable {

    private static final long serialVersionUID = 5040041872801794687L;
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

    public Date getOccurredAt() {
        return occurredAt;
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

    public Carrier getCarrier() {
        return carrier;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
