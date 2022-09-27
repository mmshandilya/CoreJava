package com.practise;
import java.util.*;
public class SplitArray {
	

	
		public static void main(String[] args) {
			int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int splitSize = 3;
			/* expected Output 
			[0, 1, 2]
			[3, 4, 5]
			[6, 7, 8]
			[9]
			*/
			List<int[]> list = splitArray(original, splitSize);
			list.forEach(s -> System.out.println(Arrays.toString(s)));
		}
		
		public static List<int[]> splitArray(int[] array, int splitSize) 
		{
			System.out.println("Array Length: "+array.length);
			int numberOfArrays = array.length / splitSize;
			System.out.println("numberOfArrays: "+numberOfArrays);
			int remainder = array.length % splitSize;
			System.out.println("remainder: "+remainder);

			int start = 0;
			int end = 0;

			List<int[]> list = new ArrayList<>();
			for (int i = 0; i < numberOfArrays; i++) 
			{
				end = splitSize+end;
				System.out.println("i:"+i+" start:"+start+" end:"+end);
				list.add(Arrays.copyOfRange(array, start, end));
				start = end;
			}

			if(remainder > 0) 
			{
				list.add(Arrays.copyOfRange(array, start, (start + remainder)));
			}
			return list;
		}
	}

