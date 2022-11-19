package com.enigmacamp.jdbc1.model;

public class ProductDetail {
    Integer id;
    Integer productId;
    Double price;
    String description;
    Boolean isActive;
    Boolean isDeleted;

    public ProductDetail() {}

    public ProductDetail(Integer id, Integer productId, Double price, String description, Boolean isActive, Boolean isDeleted) {
        this.id = id;
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "id=" + id +
                ", productId=" + productId +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", isActive=" + isActive +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
