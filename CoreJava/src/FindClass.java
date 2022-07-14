
import java.util.Scanner;

public class FindClass {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your class name");
		String classname=sc.next();
		System.out.println(""+classname);
		try 
		{
			Class c=Class.forName(classname);
			do
			{
				System.out.println(""+c.getName());
				c=c.getSuperclass();
			}
			while(c !=null);
		}
		catch (Exception e)
		{
			System.out.println(""+e.getMessage());
		}
		
	}
}
