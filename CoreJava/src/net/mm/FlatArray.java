package net.mm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatArray {
	public static void main(String[] args) throws Exception
	{
		Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
	    Integer[] flattenedArray = flatten(array);
        System.out.println(Arrays.toString(flattenedArray));
	}
	public static Integer[] flatten(Object[] inputArray) throws Exception 
	{
		if (inputArray == null) return null;
		List<Integer> list=new ArrayList<>();
		for(Object element : inputArray)
		{
			System.out.println(""+element);
			if(element instanceof Integer)
			{
				list.add((Integer) element);
			}
			if(element instanceof Object[])
			{
				list.addAll(Arrays.asList(flatten((Object[]) element)));
			}
			else
			{
				//System.out.println("Not integer");
				throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
			}
		}
		return list.toArray(new Integer[list.size()]);
		
	}
}
