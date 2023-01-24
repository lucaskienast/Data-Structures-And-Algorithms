package sorting.easy;

public class Solution1 {

    // O(N^2) T
    // O(1) S

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int newJIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    newJIdx = j;
                }
            }
            array[newJIdx] = array[i];
            array[i] = min;
        }

        return array;
    }

}
