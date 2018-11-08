package com.geruisi.bean;

import java.util.Date;

public class User {
    private String uNumber;

    private Integer uId;

    private String uName;

    private Integer uGender;

    private String uPassword;

    private String uEmail;

    private Integer uUserNumber;

    private Date uBirthday;

    private String uPassPus;

    private Integer uMer;

    public String getuNumber() {
        return uNumber;
    }

    public void setuNumber(String uNumber) {
        this.uNumber = uNumber == null ? null : uNumber.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public Integer getuGender() {
        return uGender;
    }

    public void setuGender(Integer uGender) {
        this.uGender = uGender;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Integer getuUserNumber() {
        return uUserNumber;
    }

    public void setuUserNumber(Integer uUserNumber) {
        this.uUserNumber = uUserNumber;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuPassPus() {
        return uPassPus;
    }

    public void setuPassPus(String uPassPus) {
        this.uPassPus = uPassPus == null ? null : uPassPus.trim();
    }

    public Integer getuMer() {
        return uMer;
    }

    public void setuMer(Integer uMer) {
        this.uMer = uMer;
    }

	@Override
	public String toString() {
		return "User [uName=" + uName + "]";
	}


}