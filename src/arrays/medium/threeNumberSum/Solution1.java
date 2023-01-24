package arrays.medium.threeNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

    // O(N^2) T
    // O (N) S

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // [-8, -6, 1, 2, 3, 5, 6, 12]
        Arrays.sort(array);
        List<Integer[]> list = new ArrayList<>();

        for (int k = 0; k <array.length; k++) {
            int lower = k+1;
            int upper = array.length-1;
            int current = array[k];

            while(lower < upper) {
                if (array[lower] + array[upper] > targetSum - current) {
                    upper--;
                    continue;
                }

                if (array[lower] + array[upper] < targetSum - current) {
                    lower++;
                    continue;
                }

                Integer[] arr = new Integer[]{current, array[lower], array[upper]};
                list.add(arr);
                lower++;
                upper--;
            }
        }

        return list;
    }

}
