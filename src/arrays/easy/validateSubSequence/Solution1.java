package arrays.easy.validateSubSequence;

import java.util.List;

public class Solution1 {

    // O(N) Time
    // O(1) Space

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;

        for (int arrIdx = 0; arrIdx < array.size(); arrIdx++) {
            if (seqIdx == sequence.size() - 1
                    && array.get(arrIdx) == sequence.get(seqIdx))
                return true;

            if (array.size() - (arrIdx + 1) < sequence.size() - (seqIdx + 1))
                return false;

            if (array.get(arrIdx) == sequence.get(seqIdx)) {
                seqIdx++;
                continue;
            }

            if (seqIdx >= sequence.size() - 1)
                continue;

            for (int checkInt = seqIdx + 1; checkInt < sequence.size(); checkInt++) {
                if (array.get(arrIdx) == sequence.get(checkInt)) {
                    seqIdx = 0;
                    break;
                }
            }
        }

        return false;
    }

}
