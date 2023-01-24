package recursion.easy.nthFibonacci;

public class Solution2 {

    // O(N) T
    // O(1) S

    public static int getNthFib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 2; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }

}
