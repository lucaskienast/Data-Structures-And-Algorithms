package arrays.medium.moveElementToEnd;

import java.util.List;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int swapIdx = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) != toMove) {
                int tmp = array.get(swapIdx);
                array.set(swapIdx, array.get(i));
                array.set(i, tmp);
                swapIdx++;
            }
        }
        return array;
    }

}
