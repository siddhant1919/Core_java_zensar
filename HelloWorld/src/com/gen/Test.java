package com.gen;

public class Test {
	
	
	Object val;
	
	
	public Test (Object val)
	{
		this.val = val;
	}
	public Object getData()
	{
		return val;
	}

	public static void main(String[] args) 
	{
		
		int i = 100;
//		Object val = i;
		Object val = new Integer(i);
		
		Integer ii = new Integer(500);
//		i=ii;
		i = ii.intValue();
		
		val = i;
		
		i = ii;
		
	}
}
