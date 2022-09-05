
public class StringDemo {

	public static void main(String[] args) 
	{
		
//		String str="abc"; 
//		System.out.println("String :"+str); 
//		StringBuffer sb=new	StringBuffer(); 
//		sb.append("Mahesh");
//		sb.append(" Shandilya");
//		System.out.println("StringBuffer :"+sb);
//		
//		StringBuilder sd=new StringBuilder();
//		sd.append("Thane");
//		System.out.println("StringBuilder :"+sd);
		
		String str1="ABC";
		String str2="ABC";
		String str3="EFG";
		
		String str4=new String("ABC");
		String str5=new String("ABC");
		String str6=new String("EFG");
		
		System.out.println(str1==str2);//true
		System.out.println(str1.equals(str2));//true
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//false
		
		System.out.println(str4==str5);//false
		System.out.println(str4.equals(str5));//true
		System.out.println(str1.equals(str4));//true
		System.out.println(str1==str4);//false
		System.out.println(str4.equals(str6));//false
	}

}
