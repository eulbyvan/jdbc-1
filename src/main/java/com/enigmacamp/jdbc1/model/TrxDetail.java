package com.enigmacamp.jdbc1.model;

public class TrxDetail {
    Integer id;
    Integer trxId;
    Integer productId;
    Integer qty;

    public TrxDetail() {}

    public TrxDetail(Integer id, Integer trxId, Integer productId, Integer qty) {
        this.id = id;
        this.trxId = trxId;
        this.productId = productId;
        this.qty = qty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrxId() {
        return trxId;
    }

    public void setTrxId(Integer trxId) {
        this.trxId = trxId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "TrxDetail{" +
                "id=" + id +
                ", trxId=" + trxId +
                ", productId=" + productId +
                ", qty=" + qty +
                '}';
    }
}
