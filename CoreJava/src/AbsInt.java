abstract class GST 
{
	int ab=0;
	abstract void GSTReceivable();
	abstract void GSTPayable();
	String getStateName(String state)
	{
		return state;
	}
	int i;
	GST()//Constructor
	{
		System.out.println("In Abstract Constructor");
	}
}
//abstract interface PartyName
interface PartyName
{
	int abc=1;
	abstract void getGSTNO(String gst);
	void getStateName();
	default String EntityName(String s)
	{
		return s;
	}
	public static String show()
	{
		return "";
	}
}
interface BillingPartyName
{
	abstract void getGSTNO(String gst);
}
public class AbsInt extends GST implements PartyName,BillingPartyName
{
	void GSTReceivable()
	{
		System.out.println("IN Receivable");
	}
	void GSTPayable()
	{
		System.out.println("In Payable");
	}
	public void getGSTNO(String gst)
	{
		System.out.println("In GST NO: "+gst);
	}
	public void getStateName()
	{
		System.out.println("In State Name");
	}
	public static void main(String args[])
	{
		AbsInt a=new AbsInt();
		a.ab=5;
		a.GSTReceivable();
		//a.GSTPayable();
		a.getGSTNO("GSTIN27");
		a.getStateName();
		String s=a.EntityName("MH");
		
		//a.abc=10; can not assgin value for interface as its Final
		System.out.println(""+s+": "+abc);
		System.out.println("Ab Value :"+a.ab);
				
	}	
}