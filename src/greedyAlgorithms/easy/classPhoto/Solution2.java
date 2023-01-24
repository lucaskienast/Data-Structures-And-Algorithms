package greedyAlgorithms.easy.classPhoto;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {

    // O(Nlog(N)) T
    // O(1) S

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        int diff = redShirtHeights.get(0) - blueShirtHeights.get(0);

        for (int i = 0; i < redShirtHeights.size(); i++) {
            if ((redShirtHeights.get(i) - blueShirtHeights.get(i)) * diff <= 0)
                return false;
        }

        return true;
    }

}
