package com.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionArrayPractise {

	public static void main(String[] args) 
	{
		Integer[] arr= {2,4,6,1,10,5,2,4,3,2};
		//List<Integer> list=Arrays.asList(2,4,6,1,10,5,2);
		List<Integer> list=Arrays.asList(arr);
		
		System.out.println(""+arr);
		Collections.sort(list);
		System.out.println(""+list);
		for(int i:list)
		{
			//System.out.println(""+i);
		}	
		int count=0;
		HashMap<Integer,String> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}	
			if(count>1)
			{
				System.out.println("Duplicate Elements: "+arr[i]);
				map.put(count, String.valueOf(arr[i]));
			}	
		}	
		//map.forEach((key,value)->System.out.println("Count: "+key+" Value: "+value));
		map.values().stream().forEach(s->System.out.println(s));
		
	}

}
