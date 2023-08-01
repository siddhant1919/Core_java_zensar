package Inheritance;

public class DemoObject {
	private int val;
	public DemoObject(int val)
	{
		this.val = val;
	}
	
	public String toString()
	{
		return "prnting content of an object ..." + val;
	}
	
	public boolean equals(Object obj)
	{
		DemoObject data =(DemoObject)obj;
		if(data.val == val)
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static void main(String args[])
	{
		DemoObject d1 = new DemoObject(100);
		DemoObject d2 = new DemoObject(100);
		
		System.out.println("hascode d1"+ d1.hashCode());
		System.out.println("hascode d2"+ d2.hashCode());
		
		if(d1 == d2)
		{
			System.out.println("Same");
		}
		else {
			System.out.println("diff");
		}
		
		
		if(d1.equals(d2))
		{
			System.out.println("Same");
		}
		else {
			System.out.println("diff");
		}
		
	}
	
}
