package com.collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FailFastDemo {

		
	public static void main(String[] args) 
	{
		Map<String,Integer> map=new HashMap<>();
		map.put("Mahesh",100);
		map.put("Atul",200);
		map.put("Praveen",90);
		
		
		//Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
		Iterator itr=map.keySet().iterator();
		System.out.println(""+map.keySet());
		System.out.println(""+map.entrySet());
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			System.out.println("Key: "+key);
			System.out.println("Value: "+map.get(key));
			map.put("ABC", 10);	
			
		}
		
	}

}
