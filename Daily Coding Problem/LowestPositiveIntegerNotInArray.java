/*
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 */

import java.util.Arrays;

public class LowestPositiveIntegerNotInArray {
	
	public static void main (String[] args) {
		int[] inputArray = new int[] {3, 4, -1, 1};
		System.out.println(Arrays.toString(inputArray));
		
		int checkInt = 1;
		boolean foundSmallestPositiveIntegerNotInArray = false;
		
		while (foundSmallestPositiveIntegerNotInArray == false) {
			boolean isSmallestAndUnique = true;
			for (int element : inputArray) {
				if (element <= checkInt && element == checkInt) {
					isSmallestAndUnique = false;
				}
			}
			if (isSmallestAndUnique == true) {
				foundSmallestPositiveIntegerNotInArray = true;
			}
			else {
				checkInt++;
			}
		}
		System.out.println(checkInt);
	}

}
