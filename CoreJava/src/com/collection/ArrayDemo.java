package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String[] arr= {"10","11","2","34","9"};
		List<String> list = Arrays.asList(arr);  
		
		System.out.println("List: "+list);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(23);
		l.add(3);
		System.out.println("New List: "+l);
		
		Integer[] array=new Integer[l.size()];
		array=l.toArray(array);
		
		for (Integer x : array)
            System.out.print(x + " ");
		
		
	}
}

