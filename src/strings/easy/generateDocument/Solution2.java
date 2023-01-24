package strings.easy.generateDocument;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    // O(N + M) T
    // O(n) S

    public boolean generateDocument(String characters, String document) {
        Map<Character, Integer> providedChars = new HashMap<>();
        for (char c : characters.toCharArray()) {
            providedChars.put(c, providedChars.getOrDefault(c, 0) + 1);
        }

        for (char c : document.toCharArray()) {
            if (!providedChars.containsKey(c) || providedChars.get(c) == 0)
                return false;
            providedChars.put(c, providedChars.get(c) - 1);
        }

        return true;
    }

}
