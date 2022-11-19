package com.enigmacamp.jdbc1.model;

public class Product {
    Integer id;
    String name;
    Boolean isActive;
    Boolean isDeleted;

    public Product() {}

    public Product(Integer id, String name, Boolean isActive, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", is_active=" + isActive +
                ", is_deleted=" + isDeleted +
                '}';
    }
}
