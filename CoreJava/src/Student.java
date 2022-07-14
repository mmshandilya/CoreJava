
public class Student implements Comparable<Student> {
	
	private String name;
	private String address;
	private int stid;
	
	public Student(String name, String address, int stid) {
		super();
		this.name = name;
		this.address = address;
		this.stid = stid;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.stid-o.stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", stid=" + stid + "]";
	}
	
}
