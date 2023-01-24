package arrays.medium.smallestDifference;

import java.util.Arrays;

public class Solution1 {

    // O(nlog(n) + mlog(m)) T
    // O(1) S

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // [-1, 3, 5, 10, 20, 28]
        // [15, 17, 26, 134, 135]

        // [1, 5, 10, 40, 90]
        // [30]

        // [-5]
        // [1, 5, 10, 40, 90]

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int[] pair = new int[2];
        int smallestDiff = Integer.MAX_VALUE;

        int firstPointer = 0;
        int secondPointer = 0;

        while (firstPointer < arrayOne.length && secondPointer < arrayTwo.length) {

            int currentDiff = Math.abs(arrayOne[firstPointer] - arrayTwo[secondPointer]);

            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                pair[0] = arrayOne[firstPointer];
                pair[1] = arrayTwo[secondPointer];
            }

            if (currentDiff == 0)
                return pair;

            if (arrayOne[firstPointer] < arrayTwo[secondPointer]) {
                firstPointer++;
            } else {
                secondPointer++;
            }
        }

        return pair;
    }

}
