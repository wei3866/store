package com.geruisi.bean;

public class Status {
    private Integer sId;

    private String sRState;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsRState() {
        return sRState;
    }

    public void setsRState(String sRState) {
        this.sRState = sRState == null ? null : sRState.trim();
    }

	@Override
	public String toString() {
		return "Status [sId=" + sId + ", sRState=" + sRState + "]";
	}


    
}