package package1;

public class Calculator {
	
	// factorial calculation
	public int factorial (int num) {
		int tempFact = 1;
		for (int i = 1; i <= num; i++) {
			tempFact *= i;
		}
		return tempFact;
	}
	
	// combinations calculation
	public int combinations (int n, int k) {
		return this.factorial(n) / (this.factorial(k) * this.factorial(n-k));
	}
	
	// permutations calculation
	public int permutations (int n, int k) {
		return this.factorial(n) / this.factorial(n-k);
	}
	
	// multiplication table
	public void multiTable (int n, int k) {
		for (int i = 1; i <= k; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}

}
