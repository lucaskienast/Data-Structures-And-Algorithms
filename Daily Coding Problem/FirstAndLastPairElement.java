import java.util.Arrays;

public class FirstAndLastPairElement {
	
	public static int[] cons(int a, int b) {
		int[] pair = new int[] {a, b};
		return pair;
	}
	
	public static int car(int[] pair) {
		return pair[0];
	}
	
	public static int cdr(int[] pair) {
		return pair[1];
	}
	
	public static void main(String[] args) {
		int[] myPair = cons(3, 4);
		System.out.println(Arrays.toString(myPair));
		System.out.println(car(myPair));
		System.out.println(cdr(myPair));
	}

}
