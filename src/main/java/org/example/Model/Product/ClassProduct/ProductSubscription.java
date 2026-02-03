package org.example.Model.Product.ClassProduct;

import org.example.Model.Product.EnumProduct.SubscriptionStatus;
import org.example.Model.Product.EnumProduct.SubscriptionType;
import org.example.Model.User.Client;

import java.time.LocalDate;

public class ProductSubscription {

    // Attribute
    private int subscriptionId;
    private Client client;
    private Product product;
    private SubscriptionType type;
    private LocalDate subscriptionDate;
    private LocalDate expirationDate;
    private SubscriptionStatus status;

    //Constructors
    public ProductSubscription() {
        this.subscriptionDate = LocalDate.now();
        this.status = SubscriptionStatus.ACTIVE;
    }

    public ProductSubscription(Client client, Product product, SubscriptionType type) {
        this.client = client;
        this.product = product;
        this.type = type;
        this.subscriptionDate = LocalDate.now();
        this.status = SubscriptionStatus.ACTIVE;
    }

    // ===== Getters & Setters =====


    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDate subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SubscriptionStatus getStatus() {
        return status;
    }

    public void setStatus(SubscriptionStatus status) {
        this.status = status;
    }

    //Methods

    @Override
    public String toString() {
        return "ProductSubscription{" +
                "subscriptionId=" + subscriptionId +
                ", client=" + client +
                ", product=" + product +
                ", type=" + type +
                ", subscriptionDate=" + subscriptionDate +
                ", expirationDate=" + expirationDate +
                ", status=" + status +
                '}';
    }


}
