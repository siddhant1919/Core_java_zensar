package com.threading;

public class ThreadTable extends Thread {

	Thread t1, t2, t3;
	
	public ThreadTable()
	{
		t1 = new Thread(this);
		t1.start();
		
		t2 = new Thread(this);
		t2.start();
		
		t3 = new Thread(this);
		t3.start();
	
	}
	
	public void run()
	{
		if(Thread.currentThread() == t1)
		{
			for(int i = 1;i<=10;i++)
			{
				int no = 100;
				System.out.println(no+" x "+ i+ " = "+no*i);
				
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		if(Thread.currentThread() == t2)
		{
			for(int i = 1;i<=10;i++)
			{
				int no = 50;
				System.out.println(no+" x "+ i+ " = "+no*i);
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		if(Thread.currentThread() == t2)
		{
			for(int i = 1;i<=10;i++)
			{
				int no = 20;
				System.out.println(no+" x "+ i+ " = "+no*i);
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		ThreadTable d1 = new ThreadTable();
	}
	
	
}
