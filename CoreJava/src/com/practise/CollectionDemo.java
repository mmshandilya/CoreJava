package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		List<String> str=new ArrayList<>();
		str.add("Java");
		str.add("Spring");
		str.add("Hibernate");
		str.add("Postgres");
		str.add("Ajax");
		
		
		//List<String> newlist=str.stream().filter(s->s.contains("Ajax")).collect(Collectors.toList());
		//System.out.println("NewList Str: "+newlist);
		//str.stream().forEach(s->System.out.println(s));
		List<String> newlist=str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("NewList Str: "+newlist);
		long start=0,end=0;
		//str.stream().filter(s->s.equals("Spring")).forEach(s->System.out.println(s));
		start=System.currentTimeMillis();
		IntStream.range(0, 100).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Seq Time: "+(end-start));
		
		System.out.println("================================");
		
		start=System.currentTimeMillis();
		IntStream.range(0, 100).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Parallel Time: "+(end-start));
		
		
	}

}
