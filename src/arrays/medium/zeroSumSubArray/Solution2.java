package arrays.medium.zeroSumSubArray;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    // O(N) T
    // O(N) S

    public boolean zeroSumSubarray(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        int currentSum = 0;

        for (int i: nums) {
            currentSum += i;
            if (i == 0 || currentSum == 0 || !sums.add(currentSum)) {
                return true;
            }
        }

        return false;
    }

}
