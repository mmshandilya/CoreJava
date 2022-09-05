abstract class VMaster 
{
	String vname="";
	abstract String getVno(String location);
	double getExrate(double ex)
	{
		return ex;
	}
	VMaster()//Constructor , Default no need to define
	{
		System.out.println("In VMaster Constructor");
	}
}
interface VDetails
{
	int amount=0;
	public abstract String getLedgerName(String pgroup);
	String getCrDr(String crdr);
	double getAmount(double amt);	

//	VDetails()//Interfaces Can not have Constructor
//	{
//		System.out.println("In VDetails Constructor");
//	}
}
interface PostVoucher
{
	void addEntry();
	default void testFunctional()
	{
		System.out.println("In test");
	}
	default void testFunctional1()
	{
		System.out.println("In test");
	}
}
public class VoucherMaster extends VMaster implements VDetails,PostVoucher
{
	VoucherMaster()
	{
		System.out.println("In Vouhcer Master Constructor");
	}
	String getVno(String location)
	{
		System.out.println("In getVno: "+location);
		return location;
	}
	public String getLedgerName(String pgroup)
	{
		System.out.println("In Ledger Name: "+pgroup);
		return pgroup; 
	}
	public String getCrDr(String crdr)
	{
		System.out.println("In Crdr: "+crdr);
		return crdr;
	}
	public double getAmount(double amt)
	{
		System.out.println("In Amount: "+amt);
		return amt;
	}
	public void addEntry()
	{
		System.out.println("In Add Entry");
	}
	public static void main(String args[])
	{
		VoucherMaster vm=new VoucherMaster();
		vm.getVno("L27");
		vm.getLedgerName("DEBTORS");
		vm.getExrate(75);
		vm.getCrDr("Dr");
		vm.getAmount(1000);
		
		//vm.amount=100;// can not change interface variables as its by default final
		vm.vname="Invoice";//can access abstract variables 
		System.out.println(""+vm.vname);
		
		VMaster v=new VoucherMaster();
		v.getVno("O27");
		vm.addEntry();
		
		//VDetails vd=new VDetails(); Interface can not have constructors ,so can not create object
	}
}