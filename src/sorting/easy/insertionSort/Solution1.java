package sorting.easy.insertionSort;

public class Solution1 {

    // O(N^2) T
    // O(1) S

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int k = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[k] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[k];
                    array[k] = tmp;
                    k--;
                } else break;
            }
        }
        return array;
    }

}
