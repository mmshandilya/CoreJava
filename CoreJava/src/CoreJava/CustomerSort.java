package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerSort {

	public static void main(String[] args) 
	{
		List <CustomerMaster> list=new ArrayList<>();
		list.add(new CustomerMaster(10,"Global Logistics","Mumbai"));
		list.add(new CustomerMaster(15,"CTL Logistics","Vashi"));
		list.add(new CustomerMaster(9,"Alonso Logistics","Turbhe"));
		
		System.out.println(""+list);
		Collections.sort(list);
		System.out.println("Comparable: "+list);
		Collections.sort(list,new CustComparator());//Comparator
		
		System.out.println("Comparator: "+list);
	}

}
