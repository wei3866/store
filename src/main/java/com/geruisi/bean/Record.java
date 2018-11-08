package com.geruisi.bean;

import org.apache.shiro.authz.aop.UserAnnotationHandler;

public class Record {
	
	//id
    private Integer rId;
    //订单号
    private String rOrderId;
    //客户手机号
    private String rUNumber;
    //商品id
    private Integer rCId;
    //商家id
    private Integer rMerId;
    //价格
    private Integer rMonery;
    //下单时间
    private String rDeliver;
    //收货时间
    private String rReceiving;
    //商品状态
    private String rState;
    
    private Status status;
    
    private Commodity commodity;
    
    private User user; 
    
	


    private String rDel;

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

    public String  getrState() {
        return rState;
    }

    public void setrState(String rState) {
        this.rState = rState;
    }

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Record(Integer rId, String rOrderId, String rUNumber, Integer rCId, Integer rMerId, Integer rMonery,
			String rDeliver, String rReceiving, String rState, Status status, Commodity commodity, User user) {
		super();
		this.rId = rId;
		this.rOrderId = rOrderId;
		this.rUNumber = rUNumber;
		this.rCId = rCId;
		this.rMerId = rMerId;
		this.rMonery = rMonery;
		this.rDeliver = rDeliver;
		this.rReceiving = rReceiving;
		this.rState = rState;
		this.status = status;
		this.commodity = commodity;
		this.user = user;
	}

	public Record() {
		super();
	}

	@Override
	public String toString() {
		return "Record [rId=" + rId + ", rOrderId=" + rOrderId + ", rUNumber=" + rUNumber + ", rCId=" + rCId
				+ ", rMerId=" + rMerId + ", rMonery=" + rMonery + ", rDeliver=" + rDeliver + ", rReceiving="
				+ rReceiving + ", rState=" + rState + ", status=" + status + ", commodity=" + commodity + ", user="
				+ user + "]";
	}

	public Record(Integer rId, String rOrderId, String rUNumber, Integer rCId, Integer rMerId, Integer rMonery,
			String rDeliver, String rReceiving, String rState) {
		super();
		this.rId = rId;
		this.rOrderId = rOrderId;
		this.rUNumber = rUNumber;
		this.rCId = rCId;
		this.rMerId = rMerId;
		this.rMonery = rMonery;
		this.rDeliver = rDeliver;
		this.rReceiving = rReceiving;
		this.rState = rState;
	}

	
    
    public String getrDel() {
        return rDel;
    }

    public void setrDel(String rDel) {
        this.rDel = rDel == null ? null : rDel.trim();
    }
}