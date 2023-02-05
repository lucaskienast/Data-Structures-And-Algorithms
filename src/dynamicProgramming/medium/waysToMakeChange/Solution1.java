package dynamicProgramming.medium.waysToMakeChange;

public class Solution1 {

    // O(nd) T
    // O(n) S

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n+1];
        ways[0] = 1;

        for (int denom : denoms) {
            for (int i = 1; i < ways.length; i++) {
                if (denom <= i) {
                    ways[i] += ways[i-denom];
                }
            }
        }

        return ways[ways.length-1];
    }

}
