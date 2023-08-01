package com.client;

import java.util.Scanner;

import com.serviceProviders.BusinessObjectProvider;
import com.services.AccountServices;

public class ClientCode {

	public static void main(String[] args) 
	{
//		BusinessObjectProvider b= new BusinessObjectProvider();
		
		AccountServices bank = BusinessObjectProvider.provideObject();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("PlAEASE ENTER ACC TYPE");
		String type = sc.next();
		
		System.out.println("PLEASE ENTER AMOUNT");
		float amount = sc.nextFloat();
		
		
		int accNo = bank.openAccount(type, amount);
		System.out.println("Account opened with accNO"+ accNo);
		
		String accDetails = bank.printAccountDetails(accNo);
		System.out.println(accDetails);

	}

}
