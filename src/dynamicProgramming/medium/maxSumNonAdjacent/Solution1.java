package dynamicProgramming.medium.maxSumNonAdjacent;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        if (array.length == 2) return Math.max(array[0], array[1]);

        int maxSums[] = new int[3];
        maxSums[0] = array[0];
        maxSums[1] = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            maxSums[2] = Math.max(array[i] + maxSums[0], maxSums[1]);
            maxSums[0] = maxSums[1];
            maxSums[1] = maxSums[2];
        }

        return maxSums[1];
    }

}
