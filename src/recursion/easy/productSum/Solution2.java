package recursion.easy.productSum;

import java.util.List;

public class Solution2 {

    // O(N) T
    // O(D) S

    public static int productSum(List<Object> array) {
        int prodSum = 0;

        for (Object obj : array) {
            if (obj instanceof Integer) {
                Integer i = (Integer) obj;
                prodSum += i;
            } else {
                List<Object> nestedArray = (List<Object>) obj;
                int nestedSum = productSum(nestedArray, 2);
                prodSum += 2*nestedSum;
            }
        }

        return prodSum;
    }

    public static int productSum(List<Object> array, int depth) {
        int prodSum = 0;

        for (Object obj : array) {
            if (obj instanceof Integer) {
                Integer i = (Integer) obj;
                prodSum += i;
            } else {
                List<Object> nestedArray = (List<Object>) obj;
                int nestedSum = productSum(nestedArray, depth+1);
                prodSum += (depth+1)*nestedSum;
            }
        }

        return prodSum;
    }

}
