package dynamicProgramming.medium.numCoinsForChange;

import java.util.Arrays;

public class Solution1 {

    // O(nd) T
    // O(n) S

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] nums = new int[n+1];
        Arrays.fill(nums, Integer.MAX_VALUE);
        nums[0] = 0;

        for (int denom : denoms) {
            for (int i = 1; i <= n; i++) {
                if (denom <= i && nums[i-denom] < Integer.MAX_VALUE) {
                    nums[i] = Math.min(nums[i], 1+nums[i-denom]);
                }
            }
        }

        return nums[n] == Integer.MAX_VALUE ? -1 : nums[n];
    }

}
