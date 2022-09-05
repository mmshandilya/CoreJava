package com.practise;
class OverlOverr1
{
	private void display() 
	{
		System.out.println("In Super class display");
	}
}

public class OverlOverr extends OverlOverr1
{
	public void display()
	{
		System.out.println("In Sub class display");
	}
	public static void main(String[] args) 
	{
		System.out.println("in Sub class");
		
		OverlOverr o=new OverlOverr();
		o.display();
	}
}
