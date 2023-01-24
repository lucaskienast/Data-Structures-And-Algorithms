package arrays.easy.twoNumberSum;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    // O(N) Time
    // O(N) Space

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> visited = new HashSet<>();
        for (int x : array) {
            int y = targetSum - x;
            if (visited.contains(y))
                return new int[]{x, y};
            else
                visited.add(x);
        }
        return new int[0];

    }

}
