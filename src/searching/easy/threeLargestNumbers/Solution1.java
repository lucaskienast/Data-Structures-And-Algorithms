package searching.easy.threeLargestNumbers;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] largestNumbers = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for(int i = 0; i < array.length; i++) {
            if (array[i] > largestNumbers[2]) {
                largestNumbers[0] = largestNumbers[1];
                largestNumbers[1] = largestNumbers[2];
                largestNumbers[2] = array[i];
                continue;
            }

            if (array[i] > largestNumbers[1]) {
                largestNumbers[0] = largestNumbers[1];
                largestNumbers[1] = array[i];
                continue;
            }

            if (array[i] > largestNumbers[0]) {
                largestNumbers[0] = array[i];
                continue;
            }
        }

        return largestNumbers;
    }

}
