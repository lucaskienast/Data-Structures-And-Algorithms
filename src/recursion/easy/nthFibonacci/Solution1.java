package recursion.easy.nthFibonacci;

public class Solution1 {

    // O(2^N) T
    // O(N) S

    public static int getNthFib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        int nMinus1 = getNthFib(n-1);
        int nMinus2 = getNthFib(n-2);

        return nMinus1 + nMinus2;
    }

}
