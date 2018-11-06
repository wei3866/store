package com.geruisi.bean;

import java.util.Date;

public class Record {
    private Integer rId;

    private String rOrderId;

    private String rUNumber;

    private Integer rCId;

    private Integer rMerId;

    private Integer rMonery;

    private String rDeliver;

    private String rReceiving;

    private Integer rState;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrOrderId() {
        return rOrderId;
    }

    public void setrOrderId(String rOrderId) {
        this.rOrderId = rOrderId == null ? null : rOrderId.trim();
    }

    public String getrUNumber() {
        return rUNumber;
    }

    public void setrUNumber(String rUNumber) {
        this.rUNumber = rUNumber == null ? null : rUNumber.trim();
    }

    public Integer getrCId() {
        return rCId;
    }

    public void setrCId(Integer rCId) {
        this.rCId = rCId;
    }

    public Integer getrMerId() {
        return rMerId;
    }

    public void setrMerId(Integer rMerId) {
        this.rMerId = rMerId;
    }

    public Integer getrMonery() {
        return rMonery;
    }

    public void setrMonery(Integer rMonery) {
        this.rMonery = rMonery;
    }

    public String getrDeliver() {
        return rDeliver;
    }

    public void setrDeliver(String rDeliver) {
        this.rDeliver = rDeliver;
    }

    public String getrReceiving() {
        return rReceiving;
    }

    public void setrReceiving(String rReceiving) {
        this.rReceiving = rReceiving;
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }
}