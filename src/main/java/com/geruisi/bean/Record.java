package com.geruisi.bean;

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

    private String rDel;

    private String rUser;

    private String rNumber;

    
    private Status status;
    
    public Record() {
		super();
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

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	private Commodity commodity;
    
    private User user; 
    
    private Merchant merchant;
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

    public String getrDel() {
        return rDel;
    }

    public void setrDel(String rDel) {
        this.rDel = rDel == null ? null : rDel.trim();
    }

    public String getrUser() {
        return rUser;
    }

    public void setrUser(String rUser) {
        this.rUser = rUser == null ? null : rUser.trim();
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

	public Record(Integer rId, String rOrderId, String rUNumber, Integer rCId, Integer rMerId, Integer rMonery,
			String rDeliver, String rReceiving, Integer rState, String rDel, String rUser, String rNumber) {
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
		this.rDel = rDel;
		this.rUser = rUser;
		this.rNumber = rNumber;
	}

    
    
    
}