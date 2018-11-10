package com.geruisi.bean;

public class Money extends MoneyKey {
    private Integer mMoney;

    public Integer getmMoney() {
        return mMoney;
    }

    public void setmMoney(Integer mMoney) {
        this.mMoney = mMoney;
    }
    
    public Money() {
		// TODO Auto-generated constructor stub
	}

	public Money(Integer mMoney) {
		super();
		this.mMoney = mMoney;
	}
    
    
    
}