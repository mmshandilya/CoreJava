
interface AAA
{
	default void show()
	{
		System.out.println("In A Show");
	}
	static void display()
	{
		System.out.println("In A Display");
	}
}
interface BBB
{
	default void show()
	{
		System.out.println("In B Show");
	}
	static void display()
	{
		System.out.println("In B Display");
	}
}

public class TestClass implements AAA,BBB
{

	
	public static void main(String[] args) 
	{
			TestClass t=new TestClass();
			t.show();
			BBB.display();
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		BBB.super.show();
	}

	

	
		
	

	
}
