package com.geruisi.bean;

public class MoneyKey {
    private Integer mId;

    private String mUserNumber;

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
}