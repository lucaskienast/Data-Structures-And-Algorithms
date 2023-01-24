package greedyAlgorithms.easy.minimumWaitTime;

import java.util.Arrays;

public class Solution1 {

    // O(Nlog(N)) T
    // O(1) S

    public int minimumWaitingTime(int[] queries) {
        // 1, 2, 3, 3, 6
        // 0, 1, 3, 5, 8
        // 0, 1, 4, 9, 17

        Arrays.sort(queries);
        int minTotalWait = 0;
        int currentWait = 0;

        for (int i = 1; i < queries.length; i++) {
            currentWait += queries[i-1];
            minTotalWait += currentWait;
        }

        return minTotalWait;
    }

}
