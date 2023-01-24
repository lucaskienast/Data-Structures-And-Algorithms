package arrays.easy.sortedSquaredArray;

public class Solution2 {

    // O(N) Time
    // O(N) Space

    public int[] sortedSquaredArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int insertIdx = array.length - 1;
        int[] sortedSquares = new int[array.length];

        while (left <= right) {
            int absLeft = (array[left] >= 0) ? array[left] : array[left] * (-1);
            int absRight = (array[right] >= 0) ? array[right] : array[right] * (-1);

            if(absRight >= absLeft) {
                sortedSquares[insertIdx] = absRight * absRight;
                right--;
            } else if (absLeft > absRight) {
                sortedSquares[insertIdx] = absLeft * absLeft;
                left++;
            }

            insertIdx--;
        }

        return sortedSquares;
    }

}
