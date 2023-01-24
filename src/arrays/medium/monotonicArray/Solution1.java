package arrays.medium.monotonicArray;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1)
            return true;

        boolean isDec = array[0] > array[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            if (isDec && array[i] > array[i-1])
                return false;
            if (!isDec && array[i] < array[i-1])
                return false;
        }

        return true;
    }

}
