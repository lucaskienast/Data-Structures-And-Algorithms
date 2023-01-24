package arrays.easy.twoNumberSum;

import java.util.Arrays;

public class Solution3 {

    // O(Nlog(N)) Time
    // O(1) Space

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex < rightIndex) {
            int sum = array[leftIndex] + array[rightIndex];

            if (sum < targetSum) {
                leftIndex++;
                continue;
            }

            if (sum > targetSum) {
                rightIndex--;
                continue;
            }

            return new int[]{array[leftIndex], array[rightIndex]};
        }

        return new int[0];
    }

}
