package greedyAlgorithms.easy.minimumWaitTime;

import java.util.Arrays;

public class Solution2 {

    // O(Nlog(N)) T
    // O(1) S

    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int totalWait = 0;
        for (int i = 0; i < queries.length - 1; i++) {
            totalWait += queries[i] * (queries.length-(i+1));
        }
        return totalWait;
    }

}
