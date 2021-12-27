/**
 * Given a list of integers, write a function that returns the largest sum of
 * non-adjacent numbers. Numbers can be 0 or negative.
 */

public class BiggestNonAdjSum {
    int[] numArr = new int[] { 5, 1, 2, 1, 0 };

    int computeBiggestNonAdjSum(int[] inputArr) {
        int inc = inputArr[0];
        int exc = 0;
        int exc_new;

        for (int i = 1; i < inputArr.length; i++) {
            exc_new = (inc > exc) ? inc : exc;
            inc = exc + inputArr[i];
            exc = exc_new;
        }

        return (inc > exc) ? inc : exc;
    }

    public static void main(String[] args) {
        BiggestNonAdjSum maxSum = new BiggestNonAdjSum();
        int[] numArr = new int[] { 5, 5, 10, 100, 10, 5 };
        System.out.println(maxSum.computeBiggestNonAdjSum(numArr));
    }
}