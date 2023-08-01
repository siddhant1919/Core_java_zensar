package Inheritance;

public class Employee implements TaxCalculation{
	
	protected int eNo;
	protected String eName;
	protected float eSalary;
	
	public Employee()
	{
		eNo=20;
		eName="ABCD";
		eSalary=9000f;
		System.out.println("Parents default constructor");
	}

	public Employee(int eNo, String eName, float eSalary)
	{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
		System.out.println("In parent parameterized constructor");
	}
	
	public float calSal()
	{
		return 12*eSalary;
	}
	
	public float calTax()
	{
		float tax = 0f;
		if(calSal()>1000000)
		{
			tax = eSalary*25/100;
		}
		else {
			System.out.println("No tax");
		}
		return tax;
	}

	public void print()
	{
		System.out.println("Employee info "+ eNo+'/'+eName+"/"+eSalary);
	}

	@Override
	public float calculateTax() {
		// TODO Auto-generated method stub
		return 0;
	}
}


class Manager extends Employee 
{
	protected int incentives;
	
	public Manager() {
		incentives =10000;
		System.out.println("In Child default constructor");
	}
	
	public Manager(int eNo, String eName, float eSalary, int incentives)
	{
		super(eNo, eName, eSalary );
		this.incentives = incentives;
		
		System.out.println("In child parameterized constructor");
	}
	
	
	public float calSal()
	{
		return  (eSalary+incentives)*12;
	}
	
	public float calTax()
	{
		float tax = 0f;
		if(calSal()>1000000)
		{
			tax = eSalary*35/100;
		}
		else {
			System.out.println("No tax");
		}
		
		return tax;
	}
	
	public void print()
	{
		System.out.println("Net salary of mamage is "+ calSal());
		System.out.println("tax application on net salary is " + calTax());
	}
	
	
	
}



class TestClass
{
	public static void main(String args[]) 
	{
		Manager m = new Manager(111, "ABC", 89899f, 40000);
//		m.print();
		float salary = m.calSal();
//		m.print();
		
		TaxCalculation t = new Employee(111, "abc", 898980f);
		t.calculateTax();
		
		t = new Manager(111, "abc", 9898980f, 4000000);
		t.calculateTax();
		
		
		
	}
}
