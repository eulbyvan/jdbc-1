package com.enigmacamp.jdbc1.model;

import java.sql.Date;
import java.util.List;

public class Trx {
    Integer id;
    Date date;
    Boolean isActive;
    Boolean isDeleted;
    List<TrxDetail> trxDetails;

    public Trx() {}

    public Trx(Integer id, Date date, Boolean isActive, Boolean isDeleted) {
        this.id = id;
        this.date = date;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public List<TrxDetail> getTrxDetails() {
        return trxDetails;
    }

    public void setTrxDetails(List<TrxDetail> trxDetails) {
        this.trxDetails = trxDetails;
    }


}
