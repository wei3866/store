package com.geruisi.bean;

public class Commodity {
    private Integer cId;

    private Integer cMerchantId;

    private String cName;

    private String cTypeA;

    private String cTypeB;

    private Integer cPrice;

    private String cPutaway;

    private Integer cInventory;

    private Integer cSales;

    private String cExpressage;
    
    private Merchant merchant;

    public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

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
    	if(cName == null)
    		cName = "%%";
		else 
			cName = "%"+ cName +"%";
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcTypeA() {
    	if(cTypeA == null)
    		cTypeA = "%%";
		else 
			cTypeA = "%"+ cTypeA +"%";
        return cTypeA;
    }

    public void setcTypeA(String cTypeA) {
        this.cTypeA = cTypeA == null ? null : cTypeA.trim();
    }

    public String getcTypeB() {
    	if(cTypeB == null)
    		cTypeB = "%%";
		else 
			cTypeB = "%"+ cTypeB +"%";
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

    public String getcPutaway() {
        return cPutaway;
    }

    public void setcPutaway(String cPutaway) {
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

	public Commodity() {
		super();
	}

	public Commodity(Integer cId, Integer cMerchantId, String cName, String cTypeA, String cTypeB) {
		super();
		this.cId = cId;
		this.cMerchantId = cMerchantId;
		this.cName = cName;
		this.cTypeA = cTypeA;
		this.cTypeB = cTypeB;
	}

	@Override
	public String toString() {
		return "Commodity [cId=" + cId + ", cMerchantId=" + cMerchantId + ", cName=" + cName + ", cTypeA=" + cTypeA
				+ ", cTypeB=" + cTypeB + "]";
	}

	public Commodity(Integer cId, Integer cMerchantId, String cName, String cTypeA, String cTypeB, Integer cPrice,
			String cPutaway, Integer cInventory, Integer cSales, String cExpressage) {
		super();
		this.cId = cId;
		this.cMerchantId = cMerchantId;
		this.cName = cName;
		this.cTypeA = cTypeA;
		this.cTypeB = cTypeB;
		this.cPrice = cPrice;
		this.cPutaway = cPutaway;
		this.cInventory = cInventory;
		this.cSales = cSales;
		this.cExpressage = cExpressage;
	}

	
}