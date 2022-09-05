
public class StringChar {

	public static void main(String[] args) {
		

			String str="register";
			
			//char [] ch=new char[str.length()];
			char [] ch=str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        }
			for(char c:ch)
			{
				System.out.println(""+c);
			}	
			int count;	
			int result=0;
			System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <str.length(); i++) 
	        {  
	            count = 1;  
	            
	            for(int j = i+1; j <str.length(); j++) 
	            {  
	            	if(ch[i] == ch[j]) 
	                {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    //ch[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1) 
	            {	
	                System.out.println("Duplicate: "+ch[i]);
	            }
	            else
	            {
	            	System.out.println("Non-Duplicate: "+ch[i]);
	            		
//	            	result++;
//	            	if(result==2)
//	            	{	
//	            		System.out.println("Non-Duplicate: "+ch[i]);
//	            	}	
	            }	
	        }
	}
}
