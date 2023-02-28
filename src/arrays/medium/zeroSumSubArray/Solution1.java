package arrays.medium.zeroSumSubArray;

public class Solution1 {

    // O(N^2) T
    // O(N) S

    public boolean zeroSumSubarray(int[] nums) {
        int[] runningSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                runningSums[j] += nums[i];
                if (runningSums[j] == 0) return true;
            }
        }

        return false;
    }

}
