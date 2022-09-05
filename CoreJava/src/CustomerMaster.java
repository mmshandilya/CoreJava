
public class CustomerMaster {

	private String cutomername;
	private int custid;
	private String address;
	
	public String getCutomername() {
		return cutomername;
	}

	public void setCutomername(String cutomername) {
		this.cutomername = cutomername;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerMaster()
	{
		
	}
	public CustomerMaster(String name,int id)
	{
		
	}
	public static void main(String[] args) 
	{
		CustomerMaster c=new CustomerMaster();
		//c.setCutomername("Mahesh");
		System.out.println(""+c.getCutomername());
		
	}

}
