package com.gen;

import java.lang.reflect.Array;

public class Account {

	int array[];
	
	public Account(int array[])
	{
		for(int i = 0; i<array.length; i++)
		{
			this.array[i] = array[i];
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int array[] = {10,12,13,14,15,16,17,18,19,20};
		Account a = new Account(array);
		
		

	}

}
