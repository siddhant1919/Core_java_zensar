package Inheritance;

class A
{
	protected final int sal = 50000;
	
	public A(int sal)
	{
		this.sal = sal;
	}
	
	public void test()
	{
		System.out.println("parent class");
	}
}

class B extends A
{
	public void test()
	{
		System.out.println("child class");
	}
}


public class FinalDemo {

	public static void main(String[] args) {
		A a1 = new A(50000);
		a1.test();
		
		a1 = new B();
		a1.test();
	}

}
