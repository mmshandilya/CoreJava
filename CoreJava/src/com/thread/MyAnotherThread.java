package com.thread;

public class MyAnotherThread extends Thread{

	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("Second Thread Value: "+i);
		
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
//	public static void main(String[] args) {
//		MyAnotherThread t2=new MyAnotherThread();
//		t2.start();
//	}
}
