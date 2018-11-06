package com.geruisi.bean;



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
    //发货时间
    private String rDeliver;
    //收货时间
    private String rReceiving;
    //商品状态
    private Integer rState;
    
    public Record() {
		super();
	}
    
	public Record(Integer rId, String rOrderId, String rUNumber, Integer rCId, Integer rMerId, Integer rMonery,
			String rDeliver, String rReceiving, Integer rState) {
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