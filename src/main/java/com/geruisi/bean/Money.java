package com.geruisi.bean;

public class Money {
    private Integer mId;

    private String mUserNumber;

    private Integer mMoney;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmUserNumber() {
        return mUserNumber;
    }

    public void setmUserNumber(String mUserNumber) {
        this.mUserNumber = mUserNumber == null ? null : mUserNumber.trim();
    }

    public Integer getmMoney() {
        return mMoney;
    }

    public void setmMoney(Integer mMoney) {
        this.mMoney = mMoney;
    }
}