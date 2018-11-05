package com.geruisi.bean;

import java.util.Date;

public class Commodity {
    private Integer cId;

    private Integer cMerchantId;

    private String cName;

    private String cTypeA;

    private String cTypeB;

    private Integer cPrice;

    private Date cPutaway;

    private Integer cInventory;

    private Integer cSales;

    private String cExpressage;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcMerchantId() {
        return cMerchantId;
    }

    public void setcMerchantId(Integer cMerchantId) {
        this.cMerchantId = cMerchantId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcTypeA() {
        return cTypeA;
    }

    public void setcTypeA(String cTypeA) {
        this.cTypeA = cTypeA == null ? null : cTypeA.trim();
    }

    public String getcTypeB() {
        return cTypeB;
    }

    public void setcTypeB(String cTypeB) {
        this.cTypeB = cTypeB == null ? null : cTypeB.trim();
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public Date getcPutaway() {
        return cPutaway;
    }

    public void setcPutaway(Date cPutaway) {
        this.cPutaway = cPutaway;
    }

    public Integer getcInventory() {
        return cInventory;
    }

    public void setcInventory(Integer cInventory) {
        this.cInventory = cInventory;
    }

    public Integer getcSales() {
        return cSales;
    }

    public void setcSales(Integer cSales) {
        this.cSales = cSales;
    }

    public String getcExpressage() {
        return cExpressage;
    }

    public void setcExpressage(String cExpressage) {
        this.cExpressage = cExpressage == null ? null : cExpressage.trim();
    }
}