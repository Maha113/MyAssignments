package week3.day1assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;
				/* Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 */
				 
				Set<Integer> input = new TreeSet<Integer>();
				List<Integer> input_list = new  ArrayList<Integer>();
				for (int i = 0; i < data.length; i++) {
					input.add(data[i]);
					
				}
				input_list.addAll(input);
				System.out.println("Print Set " + input);
				System.out.println("Print List " + input_list);
				int size = input_list.size();
				System.out.println("Size of the List " + size);
				System.out.println("second Last Element from List " + input_list.get(size-2));
	}

}
