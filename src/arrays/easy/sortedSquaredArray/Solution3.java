package arrays.easy.sortedSquaredArray;

public class Solution3 {

    // O(N) Time
    // O(N) Space

    public int[] sortedSquaredArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int[] sortedSquares = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            if(Math.abs(array[right]) >= Math.abs(array[left])) {
                sortedSquares[i] = array[right] * array[right];
                right--;
            } else {
                sortedSquares[i] = array[left] * array[left];
                left++;
            }
        }

        return sortedSquares;
    }

}
