package arrays.easy.sortedSquaredArray;

import java.util.Arrays;

public class Solution1 {

    // O(Nlog(N)) Time
    // O(N) Space

    public int[] sortedSquaredArray(int[] array) {
        int[] sortedSquares = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sortedSquares[i] = array[i] * array[i];
        }

        Arrays.sort(sortedSquares);
        return sortedSquares;
    }
}
