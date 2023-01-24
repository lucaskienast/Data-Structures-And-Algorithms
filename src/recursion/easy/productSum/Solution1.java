package recursion.easy.productSum;

import java.util.List;

public class Solution1 {

    // O(N^2) T
    // O(N) S

    private static int level = 1;

    public static int productSum(List<Object> array) {
        int prodSum = 0;

        for (Object obj : array) {
            if (obj instanceof Integer) {
                Integer i = (Integer) obj;
                prodSum += i;
            } else {
                List<Object> nestedArray = (List<Object>) obj;
                level++;
                int nestedSum = productSum(nestedArray);
                prodSum += level*nestedSum;
                level--;
            }
        }

        return prodSum;
    }

}
