package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(10,2,3,1,1,9,0,10);
		System.out.println("Array Element: "+arr);
		
		Collections.sort(arr);
		System.out.println("Collection Sort: "+arr);
		
		HashSet<String> hash=new HashSet<>();
		hash.add("ABC");
		hash.add("XYZ");
		hash.add("MNO");
		hash.add("EFG");
		
		System.out.println(""+hash);
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<>(arr);
		System.out.println("Linked Hash Set: "+lset);
		
		List<Integer> slist=arr.stream().distinct().collect(Collectors.toList());
		System.out.println("Stream Distinct List: "+slist);
		
		Set<String> set=new HashSet<>();
		set.add("Mahesh");
		set.add("Prshant");
		set.add("Anika");
		set.add("Shweta");
		
		System.out.println("Hash Set: "+set);
		
		Set<String> tset=new TreeSet<>();
		tset.add("Mahesh");
		tset.add("Prshant");
		tset.add("Anika");
		tset.add("Shweta");
		
		System.out.println("Tree Set: "+tset);
		

	}

}
