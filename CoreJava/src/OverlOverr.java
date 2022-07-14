class Charges
{
	void deleteCharges (String s) throws ArithmeticException
	{
		
		System.out.println("in Delete Charges");
	}
}
public class OverlOverr extends Charges 
{
	int addCharges(int i)
	{
		System.out.println("In sub class add charges");
		return i;
	}
	int addCharges(int i,int j)
	{
		System.out.println("in sub class add charges with 2 parameter");
		return i+j;
	}
	double addCharges(double i,double j)
	{
		System.out.println("in sub class add charges with 2 double parameter");
		return i+j;
	}

	/*
	 * public void deleteCharges(String s) throws ArithmeticException {
	 * System.out.println("in sub class delete charges"); }
	 */
	 
	public static void main(String args[])
	{
		OverlOverr o=new OverlOverr();
		o.addCharges(1);
		o.addCharges(1,2);
		o.addCharges(1.2,2.3);
		o.deleteCharges("OF");
	}
}
