package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char[][] table = new char[10][5];
		System.out.println(table[1].length);
		
		// initialize scanner & calculator
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		// keep program running until user wants to exit
		boolean userActive = true;
		while (userActive) {
			// initialize option and input
			int option;
			int n, k;
			// ask for user input
			System.out.println("\nPlease choose your program:\n1: Factorial\n2: Multiplication Table\n3: Combinations\n4: Permutations\n5: Exit");
			option = sc.nextInt();
			System.out.println(option);
			// choose program depending on user choice
			switch (option) {
			case 1:
				System.out.println("\nFactorial:\n");
				System.out.println("Please enter an integer...");
				n = sc.nextInt();
				System.out.println(n + "! = " + calc.factorial(n));
				break;
			case 2:
				System.out.println("\nMultiplication Table:\n");
				System.out.println("Please enter the integer to be multiplied (starting at 1)...");
				n = sc.nextInt();
				System.out.println("Please enter up to which integer you want to multiply...");
				k = sc.nextInt();
				calc.multiTable(n, k);
				break;
			case 3:
				System.out.println("\nCombinations:\n");
				System.out.println("Please enter the number of objects (n)...");
				n = sc.nextInt();
				System.out.println("Please enter the number of choices (k)...");
				k = sc.nextInt();
				System.out.println("nCr = " + calc.combinations(n, k));
				break;
			case 4:
				System.out.println("\nPermutations:\n");
				System.out.println("Please enter the number of objects (n)...");
				n = sc.nextInt();
				System.out.println("Please enter the number of choices (k)...");
				k = sc.nextInt();
				System.out.println("nCr = " + calc.permutations(n, k));
				break;
			case 5:
				System.out.println("\nExit\n");
				userActive = false;
				sc.close();
				break;
			default:
				System.out.println("\nInvalid choice. Please choose again.\n");
			}
		}
		
		
	}

}
