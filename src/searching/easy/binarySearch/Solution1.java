package searching.easy.binarySearch;

public class Solution1 {

    // O(log(N)) T
    // O(1) S

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;

            if (array[middle] > target) {
                right = middle - 1;
                continue;
            }

            if (array[middle] < target) {
                left = middle + 1;
                continue;
            }

            return middle;
        }

        return -1;
    }

}
