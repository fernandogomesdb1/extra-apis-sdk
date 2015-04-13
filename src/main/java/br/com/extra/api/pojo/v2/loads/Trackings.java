package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.v2.orders.Carrier;
import br.com.extra.api.pojo.v2.orders.Invoice;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trackings implements Serializable {

    private static final long serialVersionUID = 7832889795025352707L;
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

    public void setOrder(OrderId order) {
        this.order = order;
    }

    public List<ItemsTrackings> getItems() {
        return items;
    }

    public void setItems(List<ItemsTrackings> items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOccuredAt() {
        return occuredAt;
    }

    public void setOccuredAt(Date occuredAt) {
        this.occuredAt = occuredAt;
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
