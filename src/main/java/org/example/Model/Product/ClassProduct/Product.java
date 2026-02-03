package org.example.Model.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Product {

    //Attributes
    private int productId;
    private String name;
    private ProductCategory category;
    private Double price;
    private String description;
    private LocalDateTime createdAt;
    private List<ProductSubscription> subscriptions = new ArrayList<>();


    //Constructors
    public Product() {
        this.createdAt = LocalDateTime.now();
    }

    public Product(int productId, String name, ProductCategory category, String description) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.description = description;
    }


    //Getters & Setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<ProductSubscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<ProductSubscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
    //Methods


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", subscriptions=" + subscriptions +
                '}';
    }
}
