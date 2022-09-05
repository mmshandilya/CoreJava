package net.design.pattern;


public class SingletonDemo {
	
	private static SingletonDemo instance;
    private SingletonDemo()
    {
            //Private Constructor
    }
    public synchronized static SingletonDemo getInstance()
    {
            if (instance==null)
            {
                    instance = new SingletonDemo();
                    System.out.println("AccountCreation Class Object created...!!!");
            }
            else
            {
                    System.out.println("AccountCreation Class Object not Created just returned Created one...!!!");
            }
            return instance;
    }
    public Object clone() throws CloneNotSupportedException
    {
            throw new CloneNotSupportedException();
    }
    public void create(int no)
    {
            System.out.println("Account Created Successfully, with Number:" +no);
    }


	public static void main(String[] args) {
		//Singleton class
		SingletonDemo tc = SingletonDemo.getInstance();
		SingletonDemo tc1 = SingletonDemo.getInstance();
        tc.create(12345);
        tc1.create(67891);

	}

}
