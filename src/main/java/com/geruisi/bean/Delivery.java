package com.geruisi.bean;

public class Delivery {
    private Integer dId;

    private String dName;

    private Integer dNumber;

    private String dDelivery;

    private String dDeliveryPus;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public Integer getdNumber() {
        return dNumber;
    }

    public void setdNumber(Integer dNumber) {
        this.dNumber = dNumber;
    }

    public String getdDelivery() {
        return dDelivery;
    }

    public void setdDelivery(String dDelivery) {
        this.dDelivery = dDelivery == null ? null : dDelivery.trim();
    }

    public String getdDeliveryPus() {
        return dDeliveryPus;
    }

    public void setdDeliveryPus(String dDeliveryPus) {
        this.dDeliveryPus = dDeliveryPus == null ? null : dDeliveryPus.trim();
    }
}