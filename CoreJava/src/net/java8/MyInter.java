package net.java8;

@FunctionalInterface
public interface MyInter {
	int sum(int a ,int b);
	//int add(int a,int b); //allow only one abstract method in Functional Interface
	default int add(int a,int b)
	{
		return b ;
	}
	default int add1(int a,int b)
	{
		return b ;
	}
}
