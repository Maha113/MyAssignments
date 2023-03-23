package week3.day1assignments;

public class ChangeOddIndexToUpperCase {
	//Change the character in the odd index to upper case
	public static void main(String[] args) {
		String test = "changeme";
		char[] result = test.toCharArray();
		//int length = test.length();
		
		System.out.println("Length of String :" + test.length());
		
		for (int i = 0; i < test.length(); i++) {
			
			if (i%2 == 0)
			{
			    result[i] =  Character.toLowerCase(test.charAt(i));
		   //    System.out.println("Even Index " + result[i]); 	
			}
			else
			{
				result[i] =  Character.toUpperCase(test.charAt(i));
			//	System.out.println("Odd Index " + result[i]);
			}
		}
		  
		
		//To print Aray 
		for (int i = 0; i < test.length(); i++) 
		{
		System.out.print(result[i]);
		} 
	}

}
