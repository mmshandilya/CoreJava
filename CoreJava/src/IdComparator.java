import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//return o1.getStid()-o2.getStid();
		System.out.println(""+o1.getAddress());
		return o1.getAddress().compareTo(o2.getAddress());
	}

	
	

}
