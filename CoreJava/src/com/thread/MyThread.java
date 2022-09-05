package com.thread;

public class MyThread implements Runnable{
	public void run()
	{
		System.out.println("In Run Method");
		for(int i=0;i<=10;i++)
		{
			System.out.println("First Thread Value: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}	
	}

	public static void main(String[] args) 
	{
		System.out.println("Process Starts !!");
		MyThread t=new MyThread();
		Thread thr=new Thread(t);
		thr.start();
		MyAnotherThread t2=new MyAnotherThread();
		t2.start();
		//t2.start(); //can not start second thread
		String tname=t2.getName();
		System.out.println("Thread Name: "+tname);
			
		System.out.println("Process Ends !!");
	}

}
