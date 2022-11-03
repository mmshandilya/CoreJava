import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
	public static void main(String [] arr)
	{
		ArrayList<Student> std=new ArrayList<>();
		std.add(new Student("Mahesh","Mumbai",10));
		std.add(new Student("Atul","Pune",9));
		std.add(new Student("Shirpad","AKola",15));
		System.out.println(""+std);
		Collections.sort(std);//Comparable
		System.out.println("Comparable: "+std);
		Collections.sort(std,new IdComparator());//Comparator
		
		System.out.println("Comparator: "+std);
	}

}
