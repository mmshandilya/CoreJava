package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		Integer a[]=new Integer[] {10,34,56,5};
		List<Integer> l=Arrays.asList(a);
		//List<Integer> l=new ArrayList<Integer>();
		//List<Integer> l=Arrays.asList(10,3,21,5);
//		l.add(10);
//		l.add(3);
//		l.add(21);
//		l.add(5);
		System.out.println("List Elements"+l);
		//External loop
		for(int k:l)
		{
			System.out.println("Enhanced For Loop: "+k);
		}
		//Internal method so it's faster
		l.forEach(nl->System.out.println("For Each Method: "+nl));
		l.stream().forEach(nl->{if(nl>10)System.out.println("Simple Lambda Stream: "+nl);});
		l.forEach(f->System.out.println(f));
		l.stream().forEachOrdered(f2->{
			if(f2>30)
				System.out.println(""+f2);
			});
	}

}
