package week2.day2;

import java.util.Arrays;

public class FindSecondLargestInArray {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Second Largest : " + data[data.length-2]);
	}

}
