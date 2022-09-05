package net.design.pattern;

public class SingleInstance {
	private static SingleInstance instance;
	
	private SingleInstance()
	{
		
	}
	synchronized public static SingleInstance getInstance()
	{
		if(instance==null)
		{
			instance=new SingleInstance();
			System.out.println("Instance Created");
		}
		else
		{
			System.out.println("Same instance returned");
		}	
		return instance;
	}
	public static void main(String[] args) {
		SingleInstance i=SingleInstance.getInstance();
		SingleInstance i1=SingleInstance.getInstance();
		
		System.out.println(""+i.hashCode());
		System.out.println(""+i1.hashCode());
	}

}
