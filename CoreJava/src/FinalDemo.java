
final class FinalDemo {
	// a final variable
    // direct initialize
    final int THRESHOLD = 5;
      
    // a blank final variable
    final int CAPACITY;
      
    // another blank final variable
    final int  MINIMUM;
      
    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;
      
    // a  blank final static  variable
    static final double EULERCONSTANT;
      
    // instance initializer block for 
    // initializing CAPACITY
    {
        CAPACITY = 25;
    }
      
    // static initializer block for 
    // initializing EULERCONSTANT
    static{
        EULERCONSTANT = 2.3;
    }
      
    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public FinalDemo() 
    {
        MINIMUM = -1;
    }

    public static void main(String[] args) {
		final StringBuffer sb=new StringBuffer("Mahesh");
		// changing internal state of object reference by
        //  final reference variable sb
		//This property of final is called non-transitivity
		sb.append(" Shandilya");
		System.out.println(""+sb);
		
		//Since the “i” variable goes out of scope with each iteration of the loop,
		//it is actually re-declaration each iteration, allowing the same token (i.e. i) to be 
		//used to represent multiple variables.
		
		int arr[] = { 1, 2, 3 };
		for(final int i: arr)
			System.out.println(""+i);
	}
}
//can not extend final class
//class final_new extends FinalDemo 
//{
//	
//}

class AA
{
	final void m1()
	{}
}
class BB extends AA
{
	//can not override final method 
//	void m1()
//	{
//		
//	}
}

