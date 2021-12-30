/*
There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
*/

public class StairClimb {
    // Recursive
    static int countWaysRec(int n, int m) {
        if (n <= 1) {
            return n;
        }
        int res = 0;
        for (int i = 1; i <= m && i <= n; i++) {
            res += countWaysRec(n - i, m);
        }
        return res;
    }

    // Dynamic
    static int countWaysDyn(int n, int m) {
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= m && j <= i; j++) {
                res[i] += res[i - j];
            }
        }
        return res[n - 1];
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int waysRec = countWaysRec(n + 1, m);
        int waysDyn = countWaysDyn(n + 1, m);
        System.out.println(waysRec);
        System.out.println(waysDyn);
    }
}
