package arrays.easy.twoNumberSum;

public class Solution1 {

    // O(N^2) Time
    // O(1) Space

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j)
                    continue;
                if (array[i] + array[j] == targetSum)
                    return new int[]{array[i], array[j]};
            }
        }
        return new int[]{};
    }

}
