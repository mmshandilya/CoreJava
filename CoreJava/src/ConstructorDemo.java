class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In A Int");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("In B");
	}
	public B(int i)
	{
		//super();//default no need to type
		//super(i);
		System.out.println("In B Int");
	}
}
public class ConstructorDemo {
	
	public static void main(String args[])
	{
		A obj=new A();
		B obj1=new B(5);
	}

}
