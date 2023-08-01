
public class ClientCode {

	
	
	
	public static void main(String[] args) {
		AccountOperation acc = new AccountOperation();
		
		
		int accNo = acc.openAccount("Saving", 10000f);
		System.out.println("hello user your account is created with accNo "+ accNo);
		
		acc.deposite(accNo,	20000f);
		
		System.out.println("Available Balance is "+ acc.balEnquiry(900));
		
		System.out.println("Account details are "+ acc.printAccountDetails(900));
		
		acc.withdraw(900, 15000);
		
		System.out.println("Available Balance is "+ acc.balEnquiry(900));
		
		
	}

}
