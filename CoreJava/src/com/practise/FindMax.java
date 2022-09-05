package com.practise;

import java.util.Arrays;
import java.util.List;

public class FindMax {
	public static void main(String[] args) {
	
		List<Integer> arr=Arrays.asList(10,3,4,6,88,3,5);
		
		Integer max=arr.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(""+max);
		Integer min=arr.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println(""+min);
		
		arr.stream().max((i,j)->i.compareTo(j)).get();	
	}

}
