package com.serviceProviders;

import com.serviceImpl.AccountOperations;
import com.services.AccountServices;

public class BusinessObjectProvider 
{
	
	
	public static AccountServices provideObject()
	{
		AccountServices obj = null;
		obj = new AccountOperations();
		return obj;
	}
}
