package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
		String str1 = "TestLeaf";
		char[] charArray1 = str1.toCharArray();
		int length1 = charArray1.length;
		
		System.out.println(length1);
	
		
		for (int i = length1-1; i>=0; i--)
		{
			System.out.print(charArray1[i]);
			}
	}

}
