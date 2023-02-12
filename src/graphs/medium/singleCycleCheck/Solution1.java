package graphs.medium.singleCycleCheck;

public class Solution1 {

    // O(n^2) T
    // O(n) S

    public static boolean hasSingleCycle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean[] checks = new boolean[array.length];
            int currentIndex = i;
            for (int j = 0; j < array.length; j++) {
                checks[currentIndex] = true;
                int currentValue = array[currentIndex];
                int nextIndex = (currentIndex + currentValue) % array.length;
                if (nextIndex < 0)
                    currentIndex = array.length + nextIndex;
                else if (nextIndex > array.length - 1)
                    currentIndex = nextIndex - array.length;
                else
                    currentIndex = nextIndex;
            }
            if (currentIndex != i) return false;
            for (boolean check : checks)
                if (!check) return false;
        }
        return true;
    }

}
