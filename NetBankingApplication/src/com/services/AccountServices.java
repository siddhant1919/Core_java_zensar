package com.services;

//menu card holding summary of business logic method
public interface AccountServices 
{
	int openAccount(String type, float amount);
	float deposit(int accNo, float amount);
	float withdraw(int accNo, float amount);
	float balEnquiry(int accNo);
	String printAccountDetails(int accNo);
	
}
