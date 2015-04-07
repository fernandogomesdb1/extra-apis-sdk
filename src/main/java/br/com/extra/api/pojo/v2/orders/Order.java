package br.com.extra.api.pojo.v2.orders;

import br.com.extra.api.pojo.Pojos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Pedidos.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Order extends Pojos {

    private static final long serialVersionUID = -1667270477325397389L;
    private String id;
    private String orderMarketplaceId;
    private Integer paymentType;
    private Date purchasedAt;
    private Date approvedAt;
    private Date updatedAt;
    private String status;
    private BigDecimal totalAmount;
    private BigDecimal totalDiscountAmount;
    private Address billing;
    private Customer customer;
    private Freight freight;
    private List<Item> items;
    private Address shipping;
    private List<Tracking> trackings;

    public String getId() {
        return id;
    }

    public String getOrderMarketplaceId() {
        return orderMarketplaceId;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public Date getPurchasedAt() {
        return purchasedAt;
    }

    public Date getApprovedAt() {
        return approvedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public Address getBilling() {
        return billing;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Freight getFreight() {
        return freight;
    }

    public List<Item> getItems() {
        return items;
    }

    public Address getShipping() {
        return shipping;
    }

    public List<Tracking> getTrackings() {
        return trackings;
    }
}
