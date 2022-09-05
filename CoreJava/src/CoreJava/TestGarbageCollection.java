package CoreJava;

public class TestGarbageCollection {
	public void finalize()
	{
		System.out.println("In Finalize method !!");
	}

	public static void main(String[] args) {
		TestGarbageCollection t1=new TestGarbageCollection();
		TestGarbageCollection t2=new TestGarbageCollection();
		System.out.println("Before Object Unreferenced ");
		t1=null;
		t2=null;
		
		System.gc();
		System.out.println("After System GC");
	}

}
