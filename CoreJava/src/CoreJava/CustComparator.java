package CoreJava;

import java.util.Comparator;

public class CustComparator implements Comparator<CustomerMaster>
{

	@Override
	public int compare(CustomerMaster o1, CustomerMaster o2) {
		
		//return o1.getCustid()-o2.getCustid();
		return o1.getAddress().compareTo(o2.getAddress());
	}
	
}
