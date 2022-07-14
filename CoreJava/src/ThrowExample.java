
public class ThrowExample 
{
	public void getMethod(int a,int b) throws ArithmeticException
	{
		System.out.println("In Method");
		int t=a/b;	
	}	
	public static void main(String[] args) 
	{
		ThrowExample tm=new ThrowExample();
		try
		{
			tm.getMethod(4,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero not allowed !!");
		}
	}

}
