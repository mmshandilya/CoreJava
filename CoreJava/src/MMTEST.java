
class StaticClass {
	
	public static void show()
	{
		System.out.println("In Static method");
	}

}
public class MMTEST extends StaticClass
{
//	public static void show()
//	{
//		System.out.println("In subclass method");
//	}
	public static void main(String[] args) {
		StaticClass s=new StaticClass();
		s.show();
		MMTEST m=new MMTEST();
		m.show();
	}
	
}
