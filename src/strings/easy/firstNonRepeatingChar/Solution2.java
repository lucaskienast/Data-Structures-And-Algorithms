package strings.easy.firstNonRepeatingChar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {

    // O(N+M) T
    // O(1) S

    public int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> nonRepeatedChars = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!nonRepeatedChars.containsKey(c)) {
                nonRepeatedChars.put(c, i);
            } else {
                nonRepeatedChars.put(c, -1);
            }
        }

        for (Map.Entry<Character, Integer> entry : nonRepeatedChars.entrySet()) {
            if (!entry.getValue().equals(-1))
                return entry.getValue();
        }

        return -1;
    }


}
