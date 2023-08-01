package Student;

import Date;

public class Student {
	
//	Data Abstraction
	private int rollNo;
	private String name;
	private float marks;
	private Date bDay;
	
//	roll no series
	private static int RolNoseries = 0;
	
	
//	Default constructor
	public Student (){
		name = "ABCD";
		marks = 70f;
		bDay = new Date(9,9,2001);
		
	}
	
	
//	Parameterized constructor
	public Student(String name, float marks, Date bDay) {
		this.rollNo = RolNoseries;
		RolNoseries++;
		this.name = name;
		this.marks = marks;
		this.bDay = bDay;
		
		
	}
	
	
//	Wishing Birthday
	public void bDayWish()
	{
		int currentDay = 9;
		int currentMonth = 9;
		if(currentDay == bDay.getDd() && currentMonth == bDay.getMm())
		{
			System.out.println("Happy Birthday "+name);
		}
	}
	
	
	
// Voting Eligibility
	public void vEligible()
	{
		int currentYear = 2022;
		int age = currentYear - bDay.getYy();
		
		if(age >= 18)
		{
			System.out.println("You can Vote");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}
	
	
//	counting the number  of students
	public static int count() 
	{
		return RolNoseries; 
	}
	
	
//	displaying the college details
	public static void clgDetails()
	{
		if(count()>30)
		{
			System.out.println("Display college details");
		}
		else 
		{
			System.out.println("students count should be greater than 30");
		}
	}
	
	
//	Swap dates
	public void swapDates(Date date1, Date date2)
	{
		Date temp = date1;
		date1 = date2;
		date2 = temp;
	}
	
	
	
	
//	Getters
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public float getMarks() {
		return marks;
	}
	

//	Setters
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {

		this.name = name;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}

	
//	Display Method	
	public void display() {
		System.out.println("Using display(): Roll no: "+rollNo+" name: "+ name + " marks: " + marks);
		System.out.println("Your birth date is "+ bDay);
	}
	
//	toString
	public String toString() {
		return "Using toString(): "+ "Roll no: "+rollNo+" name: "+ name + " marks: " + marks;
	}
	
	
//	Grading
//	public void getGrade(float marks) {
//		
//		if(getMarks() > 95 && getMarks() < 100) {
//			System.out.println("Grade of "+this.name +" is " +"A+");
//		}
//		else if(getMarks() > 80 && getMarks() < 95) {
//			System.out.println("Grade of "+ this.name+" is "+"A");
//		}
//		else if(getMarks() > 60 && getMarks() < 80) {
//			System.out.println("Grade of "+ this.name+" is "+"B");
//		}
//		else if(getMarks() > 35 && getMarks() < 60) {
//			System.out.println("Grade of "+ this.name+" is "+"C");
//		}
//		else if(getMarks() < 35) {
//			System.out.println("Grade of "+ this.name+" is "+"F");
//		}
//	}

	
	public static void main(String[] args) {
		Student s1 = new Student("ABCD", 66.00f, new Date(9,9,2001));
		
		Student s2 = new Student("EFJG", 80.00f, new Date(16,4,2001));
		
		Student s3 = new Student("HIJK", 70.00f, new Date(19,8,2001));
		
		
		System.out.println("Number of students "+ count());
		clgDetails();
		
		
		
//		s1.setRollNo(20);
//		
//		Student s2 = new Student();
//		s2.setName("EFGH");
//		s2.setMarks(40.50f);
		
		
		
//		getting Grade
//		s1.getGrade(70.50f);
//		s2.getGrade(70.50f);
		
		
//		Printing object using toString
//		System.out.println(s1);

//		displaying 	
//		s1.display();
//		s1.bDayWish();
//		s1.vEligible();
		

	}

}
