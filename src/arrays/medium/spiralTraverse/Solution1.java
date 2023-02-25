package arrays.medium.spiralTraverse;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // O(N) T
    // O(N) S

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();

        int sC = 0;
        int eC = array[0].length - 1;
        int sR = 0;
        int eR = array.length - 1;

        while (sC <= eC && sR <= eR) {

            if (sC <= eC) {
                for (int i = sC; i <= eC; i++)
                    result.add(array[sR][i]);
                sR++;
            } else break;

            if (sR <= eR) {
                for (int i = sR; i <= eR; i++)
                    result.add(array[i][eC]);
                eC--;
            } else break;

            if (sC <= eC) {
                for (int i = eC; i >= sC; i--)
                    result.add(array[eR][i]);
                eR--;
            } else break;

            if (sR <= eR) {
                for (int i = eR; i >= sR; i--)
                    result.add(array[i][sC]);
                sC++;
            } else break;
        }

        return result;
    }

}
