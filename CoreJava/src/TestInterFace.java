@FunctionalInterface
public interface TestInterFace 
{
	void Test();
	//void TestInt(); functional interface can have only one abstract method
	
	//can have multiple default and static method
	default void Test1()
	{
		
	}
	default void Test2()
	{
		
	}
	public static String show()
	{
		return "In Show";
	}
}
abstract class TestAbst
{
	//with empty body
}
interface TestIntf
{
	//with empty body	
}
