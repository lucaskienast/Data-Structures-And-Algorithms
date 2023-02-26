package arrays.medium.firstDuplicateValue;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // O(N) T
    // O(1) S

    public int firstDuplicateValue(int[] array) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            Integer curr = Integer.valueOf(array[i]);
            if (nums.contains(Integer.valueOf(curr))) {
                return curr;
            } else {
                nums.add(curr);
            }
        }

        return -1;
    }

}
