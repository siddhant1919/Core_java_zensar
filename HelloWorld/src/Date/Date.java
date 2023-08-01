package Date;

public class Date {
	
	private int DD;
	private int MM;
	private int YY;
	
	
//	Parameterized Constructor
	public Date(int DD, int MM, int YY) {
		this.DD = DD;
		this.MM = MM;
		this.YY = YY;
	}
	
	
//	Setters
	public void setDD(int DD) {
		this.DD = DD;
	}
	
	public void setMM(int MM) {
		this.MM = MM;
	}
	
	public void setYY(int YY) {
		this.YY = YY;
	}
	
	
	
//	Getters
	public int getDD() {
		return DD;
	}
	
	public int getMM(int MM) {
		return MM;
	}
	
	public int getYY(int YY) {
		return YY;
	}
	
// Display 
	public void display() {
		System.out.println("Displaying using display() The data is "+DD+"/"+MM+"/"+YY);
	}
	
	
// toString()

	public String toString() {
		return "Displaying using toString() The data is "+DD+"/"+MM+"/"+YY;
	}
	

	public void validate() {
		if(DD<=31 && MM<= 12 && YY<=2022) 
		{
			if(MM==2 && YY%4==0 && DD<=29)
			{
				System.out.println("Valid Date");
			}
			else if(MM==2 && YY%4==1 && DD<=28)
			{
				System.out.println("Valid Date");
			}
			else if(MM!=2 && YY%2==0 && DD<=30)
			{
				System.out.println("Valid Date");
			}
			else if(MM%2==1 && DD<=31)
			{
				System.out.println("Valid Date");
			}
			else {
				System.out.println("Invalid Date ");
			}
		}
		else {
			System.out.println("Invalid Date");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Date d1 = new Date(25,03,2019);
		Date d2 = new Date(23,07,2014);
		
		
		
		d1.display();
		
		d1.validate();
		

	}

}
