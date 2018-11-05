package com.geruisi.bean;

import java.util.Date;

public class Merchant {
    private Integer merId;

    private String merName;

    private String merUserNumber;

    private Date merBegin;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getMerUserNumber() {
        return merUserNumber;
    }

    public void setMerUserNumber(String merUserNumber) {
        this.merUserNumber = merUserNumber == null ? null : merUserNumber.trim();
    }

    public Date getMerBegin() {
        return merBegin;
    }

    public void setMerBegin(Date merBegin) {
        this.merBegin = merBegin;
    }
}