package Polymorphism;

public class Polymorphism {

//	Addition
	public void add(int i, int j) {
		int sum = i + j;
		System.out.println("Addition of "+i+" and "+j+" is: " +sum);

	}
	
	public void add(float i, float j) {
		double sum = i + j;
		System.out.println("Addition of "+i+" and "+j+" is: " +sum);
	}
	
	public void add(int i, float j) {
		float sum = i + j;
		System.out.println("Addition of "+i+" and "+j+" is: " +sum);
	}
	
	
//	Multiplication
	public void multiply(int i, int j) {
		int sum = i * j;
		System.out.println("Multiplication of "+i+" and "+j+" is: " +sum);

	}
	
	public void multiply(float i, float j) {
		double sum = i * j;
		System.out.println("Multiplication of "+i+" and "+j+" is: " +sum);
	}
	
	public void multiply(int i, float j) {
		float sum = i * j;
		System.out.println("Multiplication of "+i+" and "+j+" is: " +sum);
	}

	
//	Subtraction
	public void subtract(int i, int j) {
		int sum = i - j;
		System.out.println("Subtraction of "+i+" and "+j+" is: " +sum);

	}
	
	public void subtract(float i, float j) {
		double sum = i - j;
		System.out.println("Subtraction of "+i+" and "+j+" is: " +sum);
	}
	
	public void subtract(int i, float j) {
		float sum = i - j;
		System.out.println("Subtraction of "+i+" and "+j+" is: " +sum);
	}
	
	
//	Division
	public void divide(int i, int j) {
		int sum = i / j;
		System.out.println("Division of "+i+" and "+j+" is: " +sum);

	}
	
	public void divide(float i, float j) {
		double sum = i / j;
		System.out.println("Division of "+i+" and "+j+" is: " +sum);	
		}
	
	public void divide(int i, float j) {
		float sum = i / j;
		System.out.println("Division of "+i+" and "+j+" is: " +sum);
	}
	
	
	
	public static void main(String[] args) {
	
		Polymorphism p = new Polymorphism();
		
		p.add(01, 05);
		p.add(10.5f, 15.5f);
		p.add(01, 16.5f);
		
		p.multiply(5, 5);
		p.multiply(10.5f, 10.5f);
		p.multiply(6, 2.5f);
		
		p.subtract(40, 20);
		p.subtract(10.5f,5.5f);
		p.subtract(20, 5.5f);
		
		p.divide(50, 5);
		p.divide(100.5f, 10.5f);
		p.divide(36, 6.5f);
	}

}
