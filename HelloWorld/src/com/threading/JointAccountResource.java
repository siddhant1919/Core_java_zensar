package com.threading;

public class JointAccountResource
{
	
	private float accBal;
	
	public JointAccountResource(float accBal)
	{
		this.accBal = accBal;
	}
	
	public void withdraw(float amount)
	{
		synchronized(this)
		{
			accBal = accBal - amount;
			
			try
			{
				Thread.sleep(100);
			}
			
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			printBalance();

		}
				
	}
	
	public void printBalance()
	{
		System.out.println("Account balance post withdrawal is "+ accBal );
	}
	
}


class UserThreads extends Thread
{
	Thread t;
	float amount;
	private JointAccountResource j;	
	
	public UserThreads(JointAccountResource j, float amount)
	{
		this.j = j;
		this.amount = amount;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		j.withdraw(amount);
	}
}


class Transaction
{
	public static void main(String[] args)
	{
		JointAccountResource j = new JointAccountResource(10000.0f);
		
		UserThreads child = new UserThreads(j, 1000.0f);
		UserThreads parent = new UserThreads(j, 1000.0f);
		
	}
}

































