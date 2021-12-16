package package1;

public class PrePostIncDec {
	
	public static void main (String[] args) {
		// pre-increment example
		System.out.println("Pre-increment b += ++a");
		int a = 5;
		int b = 3;
		System.out.println("Initially: a = " + a + ", b = " + b);
		b += ++a;
		System.out.println("Afterwards: a = " + a + ", b = " + b);
		
		// post-increment example
		System.out.println("\nPre-increment b += a++");
		int a1 = 5;
		int b1 = 3;
		System.out.println("Initially: a = " + a1 + ", b = " + b1);
		b1 += a1++;
		System.out.println("Afterwards: a = " + a1 + ", b = " + b1);
		
		// pre-decrement example
		System.out.println("\nPre-increment b += --a");
		int a2 = 5;
		int b2 = 3;
		System.out.println("Initially: a = " + a2 + ", b = " + b2);
		b2 += --a2;
		System.out.println("Afterwards: a = " + a2 + ", b = " + b2);
				
		// post-decrement example
		System.out.println("\nPre-increment b += a--");
		int a3 = 5;
		int b3 = 3;
		System.out.println("Initially: a = " + a3 + ", b = " + b3);
		b3 += a3--;
		System.out.println("Afterwards: a = " + a3 + ", b = " + b3);
	}
}
