package com.practise;

public class StringSwap {

	public static void main(String[] args) 
	{
			String str1="Mahesh";
			String str2="Shandilya";
			System.out.println("Original string: "+str1+" "+str2);
			
			str1=str1+str2;
			
			str2=str1.substring(0,str1.length()-str2.length());
			
			str1=str1.substring(str2.length());
			
			System.out.println("Swap String: "+str1+" "+str2);
	}

}
