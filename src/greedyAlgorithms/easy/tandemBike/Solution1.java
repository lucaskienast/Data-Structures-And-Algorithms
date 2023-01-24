package greedyAlgorithms.easy.tandemBike;

import java.util.Arrays;

public class Solution1 {

    // O(Nlog(N)) T
    // O(1) S

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int result = 0;

        for (int i = 0; i < redShirtSpeeds.length; i++) {
            int red = redShirtSpeeds[i];
            int blue = fastest
                    ? blueShirtSpeeds[blueShirtSpeeds.length-i-1]
                    : blueShirtSpeeds[i];
            int max = red > blue
                    ? red
                    : blue;
            result += max;
        }

        return result;
    }
}
