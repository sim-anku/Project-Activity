package com.ltts.movieticket.model;

public class Register {
	
	private String pname;
	private int pnum;
	private String address;
	
	public Register(String pname, int pnum, String address) {
		this.pname = pname;
		this.pnum = pnum;
		this.address = address;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
