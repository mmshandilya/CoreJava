package net.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<>(); 
		//List <String> l=Arrays.asList("Mahesh","Praveen","Sharad");
		
		//l.add(null);
		l.add("Mahesh");
		l.add("Praveen");
		l.add("Sharad");
		
		System.out.println(""+l);
		List newlist=l.stream().filter(lt->lt.equals("Mahesh")).collect(Collectors.toList());
		List newlist1=l.stream().map(lt->lt.toUpperCase()).collect(Collectors.toList());
		System.out.println(""+newlist);
		System.out.println(""+newlist1);
		
		
	}

}
