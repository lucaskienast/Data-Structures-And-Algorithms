package arrays.medium.monotonicArray;

public class Solution2 {

    // O(N) T
    // O(1) S

    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1)
            return true;

        int prev = array[0];
        boolean nonInc = true;
        boolean nonDec = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > prev)
                nonDec = false;
            if (array[i] < prev)
                nonInc = false;
            if (!nonDec && !nonInc)
                return false;
            prev = array[i];
        }

        return nonDec || nonInc;
    }

}
