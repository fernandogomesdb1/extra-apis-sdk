package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.v2.orders.Carrier;
import br.com.extra.api.pojo.v2.orders.Invoice;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Trackings implements Serializable {

    private static final long serialVersionUID = -1596471314634521001L;
    private OrderId order;
    List<ItemsTrackings> items;
    private String description;
    private Date occuredAt;
    private String url;
    private String number;
    private String sellerDeliveryId;
    private String cte;
    private Carrier carrier;
    private Invoice invoice;

    public OrderId getOrder() {

        return order;
    }

    public List<ItemsTrackings> getItems() {
        return items;
    }

    public String getDescription() {
        return description;
    }

    public Date getOccuredAt() {
        return occuredAt;
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
