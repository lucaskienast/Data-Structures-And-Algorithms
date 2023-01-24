package strings.easy.generateDocument;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    // O(N + M + n) T
    // O(n + m) S

    public boolean generateDocument(String characters, String document) {
        Map<Character, Integer> requiredChars = new HashMap<>();
        for (char c : document.toCharArray()) {
            requiredChars.put(c, requiredChars.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> providedChars = new HashMap<>();
        for (char c : characters.toCharArray()) {
            providedChars.put(c, providedChars.getOrDefault(c, 0) + 1);
        }

        for (Character key : requiredChars.keySet()) {
            Integer requiredNo = requiredChars.get(key);
            Integer providedNo = providedChars.get(key);

            if (providedNo == null || providedNo < requiredNo)
                return false;
        }

        return true;
    }

}
