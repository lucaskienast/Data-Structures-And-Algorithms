package sorting.easy.bubbleSort;

public class Solution1 {

    // O(N^2) T
    // O(1) S

    public static int[] bubbleSort(int[] array) {
        boolean didSwap = true;
        int sortUntilIdx = array.length - 1;
        while (didSwap) {
            didSwap = false;
            for (int j = 0; j < sortUntilIdx; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    didSwap = true;
                }
            }
            sortUntilIdx--;
        }
        return array;
    }

}
