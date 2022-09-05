package net.java8;

public class LambdaExample {

	public static void main(String[] args) {
	
//	MyInter inter=new MyInter(){
//		public int sum(int a,int b)
//		{
//			return a+b;
//		}
//		
//	};	
//	MyInter inter=(a,b)->{
//			return a+b;
//	};	
		
	MyInter inter=(a,b)->a+b;
	
	System.out.println(inter.sum(2, 3));
	
	String str="Hello";
	System.out.println((str.contains("i")));
	
	}

}
