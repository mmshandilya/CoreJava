package com.practise;

public class StringDemo {

	public static void main(String[] args) 
	{
		String str="This is sample string string is sample";
		String[] sample=str.split(" ");
		for(String s:sample)
		{
			System.out.println(""+s);
		}
		int count=0;
		for(int s=0;s<sample.length;s++)
		{
			count=1;
			for(int c=s+1;c<sample.length;c++)
			{
				
				if(sample[s].equals(sample[c]))
				{
					count++;
					
				}
			}
			if(count>1)
			{
				System.out.println("Duplicate string: "+sample[s]);
			}	
		}
	}

}
