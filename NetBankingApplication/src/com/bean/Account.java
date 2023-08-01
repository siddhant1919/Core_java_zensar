package com.bean;

public class Account {
	
	private int accNo;
	private String accType;
	private float accBal;
	private static int series = 900;
	
	public Account(String accType, float accBal)
	{
		accNo=series;
		series++;
		this.accType = accType;
		this.accBal = accBal;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccType() {
		return accType;
	}
	
	public float getAccBal() {
		return accBal;
	}
	
	
	public String toString()
	{
		return "AccNo: "+ accNo +" Acc Type: "+accType+" Acc Bal : "+accBal;
	}
}
