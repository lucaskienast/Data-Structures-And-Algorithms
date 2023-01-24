package sorting.medium.threeNumberSort;

import java.util.HashMap;

public class Solution1 {

    // O(N) T
    // O(1) S

    public int[] threeNumberSort(int[] array, int[] order) {
        if (array.length <= 1)
            return array;

        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int i : array) {
            frequencies.put(i, frequencies.containsKey(i) ? frequencies.get(i) + 1 : 1);
        }

        int insertIdx = 0;
        for (int o : order) {
            if (!frequencies.containsKey(o)) continue;
            int frequency = frequencies.get(o);
            for (int i = 0; i < frequency; i++) {
                array[insertIdx] = o;
                insertIdx++;
            }
        }

        return array;
    }

}
