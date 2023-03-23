package week3.day1assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 */
		
		String name = "Mahalakshmi";
		
		char[] nameArray  = name.toUpperCase().toCharArray();
		Set<Character> input_set = new HashSet<Character>();
		for (int i = 0; i < nameArray.length; i++) {
			input_set.add(nameArray[i]);
		}
		System.out.println(input_set);
	}
     

}


