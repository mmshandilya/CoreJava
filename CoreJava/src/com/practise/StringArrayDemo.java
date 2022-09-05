package com.practise;

public class StringArrayDemo {
	
	
	public static void main(String[] args) {
	
		String str="Mahesh";
		char [] c=str.toCharArray();
		System.out.println(""+c);
		
		int count;
		for(int i=0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
				if(count>1)
				{
					System.out.println("Duplicate: "+c[i]);
				}
				
			}
			if(count==1)
			{
				System.out.println("Non-Duplicate: "+c[i]);
			}	
		}
		
	}
	

}
