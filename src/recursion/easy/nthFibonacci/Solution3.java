package recursion.easy.nthFibonacci;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    // O(N) T
    // O(N) S

    public static int getNthFib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        Map<Integer, Integer> fibNums = new HashMap<>();
        fibNums.put(1, 0);
        fibNums.put(2, 1);

        for (int i = 3; i <= n; i++) {
            fibNums.put(i, fibNums.get(i-1) + fibNums.get(i-2));
        }

        return fibNums.get(n);
    }
}
