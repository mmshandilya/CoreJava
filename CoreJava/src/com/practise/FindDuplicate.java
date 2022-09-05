package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) 
	{
		
		Integer[] arr= {12,45,3,4,12,0,1,4};
				
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate: "+arr[i]); 
				}	
				else
				{
					//System.out.println("Else: "+arr[i]);
				}
			}
			
		}
		
		List<Integer> list=Arrays.asList(arr);
		list.stream().forEach(l->System.out.println("Array to List Print: "+l));
		
		List<Integer> slist=list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distint List: "+slist);
				
		Set<Integer> set=list.stream().filter(l->Collections.frequency(list, l)>1).collect(Collectors.toSet());
		System.out.println("Duplicate: "+set);
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(1);
		list1.add(10);
		list1.add(3);
		
		Integer[] arr1=new Integer[list1.size()];
		arr1=list1.toArray(arr1);
		
		for(int a:arr1)
		{
			System.out.println("List to Array print: "+a);
		}
		
		

				
	}

}
