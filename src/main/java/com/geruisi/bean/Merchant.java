package com.geruisi.bean;

public class Merchant {
    private Integer merId;

    private String merName;

    private String merUserNumber;

    private String merBegin;

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
        this.merUserNumber = merUserNumber;
    }

    public String getMerBegin() {
        return merBegin;
    }

    public void setMerBegin(String merBegin) {
        this.merBegin = merBegin;
    }

	public Merchant(Integer merId, String merName, String merUserNumber, String merBegin) {
		super();
		this.merId = merId;
		this.merName = merName;
		this.merUserNumber = merUserNumber;
		this.merBegin = merBegin;
	}

	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}