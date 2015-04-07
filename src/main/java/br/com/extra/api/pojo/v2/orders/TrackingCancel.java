package br.com.extra.api.pojo.v2.orders;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TrackingCancel implements Serializable {

    private static final long serialVersionUID = 5554347013778910531L;
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

    public String getInfo() {
        return info;
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

    public List<CarrierTrackingCancel> getCarrier() {
        return carrier;
    }
}
