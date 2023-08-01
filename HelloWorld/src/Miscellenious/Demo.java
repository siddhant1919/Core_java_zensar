package Miscellenious;

public class Demo {
	
	protected int val = 10000;
	
//	static data belongs to class not to object, it can be accessed, directly without calling it through object.
	protected static String  ifscCode;
	
	
//	static block to initialize static data
	static
	{
		ifscCode = "BARB08978N";
		System.out.println("Static block called");
	}
	
	
	public void print()
	{
		System.out.println("Object method..."+ val);
		System.out.println("ifsc code is"+ ifscCode);
	}

	
//	static method
	public static void branchDetails()
	{
		System.out.println("static branchDetails method");
		System.out.println("Branch add: Pune.... pincode : 422003");
		System.out.println("IFSC code id "+ ifscCode);
//		System.out.println("accessing object data..."+ val);
		
	}
	
	public static void main(String[] args) {
		System.out.println(ifscCode);
		branchDetails();
		
		Demo d = new Demo();
		System.out.println("Object val"+ d.val);
		d.print();
		
//		System.out.println("Object val"+ d.ifscCode);
//		d.branchDetails();	
	}
}


//class Entry 
//{
//	public static void main(String[] args) {
//		System.out.println(Demo.ifscCode);
//		Demo.branchDetails();
//		
//		Demo d = new Demo();
//		System.out.println("Object val"+ d.val);
//		d.print();
//		
//	}
//	
//}
