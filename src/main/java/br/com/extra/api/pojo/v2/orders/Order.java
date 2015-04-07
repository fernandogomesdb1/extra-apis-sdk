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

    private static final long serialVersionUID = -3122967363109669416L;
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

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderMarketplaceId() {
        return orderMarketplaceId;
    }

    public void setOrderMarketplaceId(String orderMarketplaceId) {
        this.orderMarketplaceId = orderMarketplaceId;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPurchasedAt() {
        return purchasedAt;
    }

    public void setPurchasedAt(Date purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    public Date getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(Date approvedAt) {
        this.approvedAt = approvedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public Address getBilling() {
        return billing;
    }

    public void setBilling(Address billing) {
        this.billing = billing;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Freight getFreight() {
        return freight;
    }

    public void setFreight(Freight freight) {
        this.freight = freight;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Address getShipping() {
        return shipping;
    }

    public void setShipping(Address shipping) {
        this.shipping = shipping;
    }

    public List<Tracking> getTrackings() {
        return trackings;
    }

    public void setTrackings(List<Tracking> trackings) {
        this.trackings = trackings;
    }
}
