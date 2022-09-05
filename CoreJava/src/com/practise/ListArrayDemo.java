package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListArrayDemo {
	private static final int List = 0;

	public static void main(String[] args) 
	{
		Integer[] i={10,3,5,77,34,6};
		List<Integer> l=Arrays.asList(i);
		System.out.println("Non-Sorted: "+l);
		Collections.sort(l);
		System.out.println("Sorted: "+l);
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(12);
		list.add(23);
		list.add(0);
		Collections.sort(list);
		
		Integer[] arr=new Integer[list.size()];
		arr=list.toArray(arr);
		
		for(Integer e:arr)
		{
			System.out.println(""+e);
		}	
		
	}

}
