
class Parent
{
	void show()
	{
		System.out.println("In Parent Show");
	}
	void show(String s)
	{
		System.out.println("In Parent Show: "+s);
	}
	void show(int i)
	{
		System.out.println("In Parent Int: "+i);
	}
	
}
public class PolyMDemo extends Parent 
{
	void show()
	{
		System.out.println("In Child Show");
	}
	void show(String s)
	{
		System.out.println("In Child Show: "+s);
	}
	void show(int i)
	{
		System.out.println("In Child Int: "+i);
	}
	public static void main(String[] args) {
		Parent p=new PolyMDemo();
		p.show();
		p.show("Mahesh");
		p.show(0);
	}
}
