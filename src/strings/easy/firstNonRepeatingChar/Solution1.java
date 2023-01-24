package strings.easy.firstNonRepeatingChar;

import java.util.*;

public class Solution1 {

    // O(N^M) T
    // O(N + M) S

    public int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> nonRepeatedChars = new LinkedHashMap<>();
        List<Character> repeatedChars = new ArrayList<>(string.length());

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!nonRepeatedChars.containsKey(c) && !repeatedChars.contains(c)) {
                nonRepeatedChars.put(c, i);
            } else {
                nonRepeatedChars.remove(c);
                repeatedChars.add(c);
            }
        }

        if (nonRepeatedChars.isEmpty())
            return -1;

        Iterator<Map.Entry<Character, Integer>> iterator = nonRepeatedChars.entrySet().iterator();
        return iterator.next().getValue();
    }

}
