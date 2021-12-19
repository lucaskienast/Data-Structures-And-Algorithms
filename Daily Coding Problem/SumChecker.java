import java.util.InputMismatchException;
import java.util.Scanner;

public class SumChecker {
	
	public static void main (String[] args) {
		boolean validInput = false;
		while (validInput == false) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter an integer");
				int input = sc.nextInt();
				validInput = true;
				int[] integerArray = new int[] {1,2,3,4,5,6,7,8,9,10};
				boolean addUp = false;
				for (int i = 0; i < integerArray.length; i++) {
					for (int j = 0; j < integerArray.length; j++) {
						if (i != j && integerArray[i] + integerArray[j] == input) {
							addUp = true;
							break;
						}
					}
				}
				if (addUp == true) {
					System.out.println("Two numbers in the given array add up to the input.");

				} else {
					System.out.println("No two numbers in the given array add up to the input.");
				}
				sc.close();
			} catch (InputMismatchException error) {
				System.out.println("Input was not an integer..");
			}
		}
	}
}
