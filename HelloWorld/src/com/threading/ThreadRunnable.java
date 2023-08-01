package com.threading;

public class ThreadRunnable implements Runnable {
	
Thread t1, t2, t3;
	
	public ThreadRunnable()
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
			ThreadRunnable d1 = new ThreadRunnable();
		}
		
	
}
