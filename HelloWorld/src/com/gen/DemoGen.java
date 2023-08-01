package com.gen;

public class DemoGen {

	Object val;
	
	
	public DemoGen (Object val)
	{
		this.val = val;
	}
	public Object getData()
	{
		return val;
	}
	
	public static void main(String[] args) 
	{
		
		DemoGen d1 = new DemoGen(100);
		int i = (Integer)d1.getData();          //downcasting    
		
		
		DemoGen d2 = new DemoGen("Java");
		String s = (String)d2.getData();        //downcasting
		
		DemoGen d3 = new DemoGen(1000f);
		float f = (Float)d2.getData();          //downcasting
		
		d1 = d3;                                //Type safety
		
		int x = (Integer)d1.getData();	
		
	}

}
