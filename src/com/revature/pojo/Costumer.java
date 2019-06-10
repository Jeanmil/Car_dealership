package com.revature.pojo;

public class Costumer {
	
	private String CostumerID;
	private String Fname;
	private String Lname;
	private String Address;
	private Double Deposit;
	private Double DownPayment;

	public String getCostumerID() {
		return CostumerID;
	}
	public void setCostumerID(String costumerID) {
		CostumerID = costumerID;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Double getDeposit() {
		return Deposit;
	}
	public void setDeposit(Double deposit) {
		Deposit = deposit;
	}
	public Double getDownPayment() {
		return DownPayment;
	}
	public void setDownPayment(Double downPayment) {
		DownPayment = downPayment;
	}
	
	
	
}
