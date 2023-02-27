package arrays.medium.mergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

    // O(Nlog(N)) T
    // O(N) S

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int[] prevInterval = intervals[0];
        List<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            int[] currInterval = intervals[i];

            if (prevInterval[1] >= currInterval[0]) {
                prevInterval[1] = Math.max(currInterval[1], prevInterval[1]);
            } else {
                mergedIntervals.add(prevInterval);
                prevInterval = currInterval;
            }

            if (i == intervals.length - 1) {
                mergedIntervals.add(prevInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

}
