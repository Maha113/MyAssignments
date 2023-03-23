package week3.day1assignments;

import java.util.Iterator;

public class ReverseEvenWords {

	// Build a logic to reverse the even position words (Input : I am a software
	// tester" & output: I ma a erawtfos tester)
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] output = test.split(" ");
		String[] reverse = new String[test.length()];
		//System.out.println("Length "+ output.length);
		//System.out.println("length() of  " + test + " : "  + test.length());
		
		for (int i = 0; i < output.length; i++) {
		
			// As index starts with 0,odd index means even position words
			if (i % 2 != 0) {
				char[] charArray = output[i].toCharArray();
				String temp = "";
				for (int j = charArray.length - 1; j >= 0; j--) {
					for (int k = 0; k <= charArray.length - 1; k++) {
						temp = temp + String.valueOf(charArray[j]);
						break;
					}
					reverse[i] = temp + " ";
					output[i]=reverse[i];
				}

			} else {
				reverse[i] = output[i]+ " ";
				output[i]=reverse[i];
				
			}
		}


		for (int i = 0; i < output.length; i++) { 
			System.out.print( output[i]);
		}
	}
}