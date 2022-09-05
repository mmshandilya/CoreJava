package CoreJava;

public class CustomerMaster implements Comparable<CustomerMaster>{
	private int custid;
	private String customername;
	private String address;
	
	
	public CustomerMaster(int custid, String customername, String address) {
		super();
		this.custid = custid;
		this.customername = customername;
		this.address = address;
	}
	@Override
	public int compareTo(CustomerMaster o) {
		return this.custid-o.custid;
	}
	@Override
	public String toString() {
		return "CustomerMaster [custid=" + custid + ", customername=" + customername + ", address=" + address + "]";
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
