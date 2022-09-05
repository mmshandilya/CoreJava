package com.practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {

	public static void main(String[] args) {
		String str="Mahesh";
		
		char[] ch=str.toCharArray();
		
		char[] r=new char[str.length()];
		for(int c=str.length()-1,j=0;c>=0;c--,j++)
		{
			r[j]=ch[c];
		}	
		String strnew = String.copyValueOf(r);
		System.out.println("With Char Array: "+strnew);
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("With SringBuilder: "+sb);
		
		String reverse=Arrays.asList(str).stream().map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.toList()).get(0);
		System.out.println("With Lambda: "+reverse);
		
	}

}
