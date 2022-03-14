package net.java8;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName()
	{
		String name="Method";
		
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		
		String str=null;
		String str1="Mahesh";
		Optional<String> op=Optional.ofNullable(str);
		Optional<String> op1=Optional.of(str1);
		System.out.println(""+op.isPresent());
		System.out.println(""+op1.get());
		
		String result=op.orElse("No Value");
		System.out.println(""+result);
	
		Optional<String> op2=getName();
		System.out.println(""+op2.orElse("No Value In Method"));
	}

}
