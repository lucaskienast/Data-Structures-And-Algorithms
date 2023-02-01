package arrays.medium.longestPeak;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static int longestPeak(int[] array) {
        int currentLength = 0;
        int maxLength = 0;
        boolean hasPeaked = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1] && !hasPeaked) {
                currentLength = currentLength == 0 ? 2 : currentLength+1;
            }
            else if (currentLength > 0 && array[i] < array[i-1]) {
                currentLength = currentLength+1;
                maxLength = Math.max(maxLength, currentLength);
                hasPeaked = true;
            }
            else if (array[i] > array[i-1] && hasPeaked) {
                currentLength = 2;
                hasPeaked = false;
            }
            else {
                currentLength = 0;
                hasPeaked = false;
            }
        }

        return maxLength;
    }

}
