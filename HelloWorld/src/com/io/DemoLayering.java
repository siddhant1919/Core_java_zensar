package com.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoLayering {

	public static void main(String[] args) 
	{
		File f = null;
		FileInputStream fis = null;
		BufferedInputStream bos = null;
		
		try
		{
			//get properties of the files
			f = new File(".//Resources//data.txt");
			long length = f.length();
			String path = f.getAbsolutePath();
			boolean mode = f.canRead();
			
			System.out.println("File properties  are ....."+length+path+mode);
			
			fis = new FileInputStream(f);
			bos = new BufferedInputStream(fis);
			
			int i = 0;
			while((i = bos.read()) > -1)
			{
				System.out.print(i);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fis.close();
				bos.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			
		}
	}

}
