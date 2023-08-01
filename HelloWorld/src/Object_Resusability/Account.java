package Object_Resusability;

public class Account {

//	Data Abstraction
	private int accNo;
	private String accType;
	private float accBal;
	private static int series = 1000;
	
	
//	has a relationship ------ content object--date
	private Date accOpeningDate;
	
	
//	Parameterized Constructor
	public Account ( String accType, float accBal, Date accOpeningDate)
	{
		this.accNo=series;
		series++;
		this.accType = accType;
		this.accBal = accBal;
		this.accOpeningDate = accOpeningDate;		
	}
	
	
//	Printing Account Details
	void printAccDetails() 
	{
		System.out.println("Account Details are:");
		System.out.println("Account No: "+accNo+"/ Account Type: "+accType+"/ Account Balance: "+accBal);
		
//		System.out.println("Account is opened on "+ accOpeningDate.getDd()+'/'+accOpeningDate.getMM()+'/'+accOpeningDate.getYy());
		
		System.out.println("Account is opened on..."+accOpeningDate);
	}
	
	
	
//	depositing money
	public float deposit(int accNo, float amount, Date d)
	{
		if(this.accNo==accNo)
		{
			accBal=accBal + amount;
		}
		else
		{
			System.out.println("Invalid account no please try agian...");
			return accBal;
		}	
		
		return accBal;
	}
	
	
	
//	Calculating Loyalty
	public float calLoyInt()
	{
		float year = accOpeningDate.getYy();
		float currentYear = 2022;
		
		if(currentYear - year >= 10) 
		{
			accBal = accBal + 10000;
		}
		else
		{
			System.out.println("its too early for loyalty");
			return accBal;
		}
		
		return accBal;
	}
	
	
	public static void main(String[] args) {
		Account a1 = new Account( "Saving", 5000f, new Date(1,1,2008));
		System.out.println("Account no is "+ a1.accNo);
		
		Account a2 = new Account( "Saving", 5000f, new Date(1,1,2008));
		System.out.println("Account no is "+ a2.accNo);
		
		Account a3 = new Account( "Saving", 5000f, new Date(1,1,2008));
		System.out.println("Account no is "+ a3.accNo);
		
		
//		a.printAccDetails();
//		
//		float currentBal = a.calLoyInt();
//		System.out.println("updated balance after loyalty " + currentBal);
//		
//		currentBal = a.deposit(12345, 5000, new Date(1,1,2022));
//		System.out.println("Updated after Deposite "+currentBal);

	}

}
