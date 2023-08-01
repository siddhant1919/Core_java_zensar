package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties 
{
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try
		{
			fis = new FileInputStream(".//Resources//Data.properties");
			Properties p = new Properties();
			p.load(fis);
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			if(username.equals("java") && password.equals("java"))
			{
				System.out.println("Valid");
			}
			else
			{
				 System.out.println("InValid");
			}
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
