package CoreJava;

public class TestException {

	public static void main(String[] args) 
	{
		getDivison(6,2);
	}
	public static void getDivison(int i,int j)
	{
		try
		{
			int k=i/j;
			System.out.println("Division Result: "+k);
			throw new MyException("Not allowed");
		}
		catch (MyException e) 
		{
				System.out.println("In My Exception: "+e.getMessage());
		}
		catch (ArithmeticException e) 
		{
			System.out.println("In Arithmetic Catch Block: "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("In Exception: "+e.getMessage());
		}
		finally {
			System.out.println("In Finally Block");
		}
	}
}
