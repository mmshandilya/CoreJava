package com.practise;

public class FindChar {

	public static void main(String[] args) 
	{
		String str="manomilan";
		
		char [] ch=str.toCharArray();
		System.out.println("Char Array: "+ch);
		int count;
		for(int c=0;c<str.length();c++)
		{
			count=1;
			for(int d=c+1;d<str.length();d++)
			{
				if(ch[c]==ch[d])
				{
					count++;
				}	
			}
			if(count>1)
			{
				System.out.println("Duplicate: "+ch[c]);
			}
		}
	}

}
