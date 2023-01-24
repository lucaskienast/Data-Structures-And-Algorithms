package arrays.easy.validateSubSequence;

import java.util.List;

public class Solution2 {

    // O(N) Time
    // O(1) Space

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int idx = 0;
        for (int i = 0; i< array.size(); i++) {
            if (array.get(i) == sequence.get(idx))
                idx++;
            if (idx == sequence.size())
                return true;
        }
        return false;
    }

}
