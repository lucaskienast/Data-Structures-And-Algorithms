package greedyAlgorithms.easy.classPhoto;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {

    // O(Nlog(N)) T
    // O(1) S

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        boolean redsFront = redShirtHeights.get(0) < blueShirtHeights.get(0);

        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (redsFront && redShirtHeights.get(i) >= blueShirtHeights.get(i))
                return false;
            if (!redsFront && redShirtHeights.get(i) <= blueShirtHeights.get(i))
                return false;
        }

        return true;
    }

}
