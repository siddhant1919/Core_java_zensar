
public class AccountOperation {

	Account acc;
	
	public int openAccount(String accType, float amount)
	{
		acc = new Account(accType, amount);
		return acc.getAccNo();
	}
	
	public boolean accNoValidity(int accNo)
	{
		if(acc.getAccNo() == accNo)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void deposite(int accNo, float amount) 
	{
		if(accNoValidity(accNo))
		{
			float bal = acc.getAccBal();
			bal = bal + amount;
			acc.setAccBal(bal);
			
		}
		else {
			System.out.println("Invalid account NO");
		}
	}
	

	public void withdraw(int accNo, float amount)
	{
		
		if(accNoValidity(accNo) && amount <= acc.getAccBal())
		{
			float tempBal = acc.getAccBal() - amount;
			acc.setAccBal(tempBal);
			System.out.println("Transaction Successfull Avalaible Balance: "+acc.getAccBal());
		}
		else 
		{
			System.out.println("Invalid Acc No or Insufficient amount in acc");
		}
	}
	
	public float balEnquiry(int accNo)
	{
		if(accNoValidity(accNo)) 
		{
			return acc.getAccBal();
		}
		else {
			return 0;
		}
	}
	
	public String printAccountDetails(int accNo)
	{
		if(accNo == acc.getAccNo()) 
		{
			return acc.toString();
		}
		else {
			return "Enter valid Acc No";
		}
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
