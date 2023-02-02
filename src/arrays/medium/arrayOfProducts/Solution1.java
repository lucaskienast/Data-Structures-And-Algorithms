package arrays.medium.arrayOfProducts;

public class Solution1 {

    // O(N) T
    // O(N) S

    public int[] arrayOfProducts(int[] array) {
        // [5, 1, 4, 2]
        // [8, 40, 10, 20]
        // [1, 5, 5, 20]
        // [8, 8, 2, 1]

        int[] result = new int[array.length];
        int[] leftProduct = new int[array.length];
        int[] rightProduct = new int[array.length];

        leftProduct[0] = 1;
        rightProduct[array.length-1] = 1;

        for (int i = 1; i < array.length; i++)
            leftProduct[i] = leftProduct[i-1] * array[i-1];

        for (int i = array.length-2; i >= 0; i--)
            rightProduct[i] = rightProduct[i+1] * array[i+1];

        for (int i = 0; i < array.length; i++)
            result[i] = leftProduct[i] * rightProduct[i];

        return result;
    }

}
