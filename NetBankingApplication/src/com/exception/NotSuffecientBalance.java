package com.exception;
public class NotSuffecientBalance extends Exception
{
	
	private String msg;
	
	public NotSuffecientBalance(String msg)
	{
		this.msg = msg;
	}
	
	public String toString()
	{
		return "Invalid Account no because..."+msg;
	}
}
