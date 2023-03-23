package week3.day1assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		String[] input = text.split(" ");
		Set<String> input_set = new LinkedHashSet<String>();
		
		for(int i=0; i<input.length; i++) {
			input_set.add(input[i]);
		}
		
		System.out.println(input_set);
	}

}
