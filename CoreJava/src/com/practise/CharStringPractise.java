package com.practise;

public class CharStringPractise {

	public static void main(String[] args) 
	{
		String str="character";
		char[] ch=str.toCharArray();
		int count=0;
		for(int c=0;c<ch.length;c++)
		{
			count=1;
			for(int d=c+1;d<ch.length;d++)
			{
				if(ch[c]==ch[d])
				{
					count++;
				}	
			}	
			if(count>1)
			{
				System.out.println("Duplicate: "+ch[c]+" Count: "+count);
			}	
		}	
		String newstr=String.copyValueOf(ch);
		System.out.println(""+newstr);
		StringBuilder sb=new StringBuilder();
		sb.append(newstr);
		sb.reverse();
		System.out.println(""+sb);
		
		char[] r=new char[str.length()];
		for(int c=str.length()-1,j=0;c>=0;c--,j++)
		{
			r[j]=ch[c];
		}	
		System.out.println(""+String.copyValueOf(r));
	}

}
