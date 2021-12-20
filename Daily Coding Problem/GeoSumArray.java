package geoSumPackage;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeoSumArray {
	
	public static void main (String[] args) {
		boolean keepRunning = true;
		while (keepRunning == true) {
			System.out.println("Please enter how many integers your array should have or press 0 to quit");
			try {
				Scanner sc = new Scanner(System.in);
				int arrayLength = sc.nextInt();
				switch (arrayLength) {
				case 0: 
					System.out.println("End program");
					keepRunning = false;
					sc.close();
					break;
				default:
					int[] inputArray = new int[arrayLength];
					int[] outputArray = new int[arrayLength];
					for (int i = 0; i < arrayLength; i ++) {
						System.out.println("Enter array integer #" + (i+1));
						inputArray[i] = sc.nextInt();
					}
					System.out.println(Arrays.toString(inputArray));
					for (int i = 0; i < inputArray.length; i++) {
						outputArray[i] = 1;
						for (int j = 0; j < inputArray.length; j++) {
							if (inputArray[i] != inputArray[j]) {
								outputArray[i] *= inputArray[j];
							}
						}
					}
					System.out.println(Arrays.toString(outputArray));
				}	
			} catch (InputMismatchException error) {
				System.out.println("That was not an integer");
			}
		}
	}
}
 
