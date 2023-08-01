package com.exception;

public class InvalidAccountNoException extends Exception{
	
	private String msg;
	
	public InvalidAccountNoException(String msg)
	{
		this.msg = msg;
	}
	
	public String toString()
	{
		return "Invalid Account no because..."+msg;
	}
}


