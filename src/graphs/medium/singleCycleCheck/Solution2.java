package graphs.medium.singleCycleCheck;

public class Solution2 {

    // O(n) T
    // O(1) S

    public static boolean hasSingleCycle(int[] array) {
        int index = 0;
        int count = 0;

        while (count < array.length) {
            count++;
            index += array[index];
            index = index % array.length;

            if (index < 0)
                index += array.length;

            if ((index == 0 && count != array.length) || (index != 0 && count == array.length))
                return false;
        }

        return true;
    }

}
