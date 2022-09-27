package com.thread;

public class ThreadDemo {
	public synchronized void m1() 
	{
		try 
		{
			System.out.println("In Method");
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadDemo o1=new ThreadDemo();
		o1.m1();
		ThreadDemo o2=new ThreadDemo();
		o2.m1();
	}
	 

}
