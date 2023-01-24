package strings.easy.cipherDecryptor;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static String caesarCypherEncryptor(String str, int key) {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<String, Integer> alphabetIndexes = new HashMap<>();

        for (int i = 0; i < alphabet.length; i++) {
            alphabetIndexes.put(String.valueOf(alphabet[i]), i);
        }

        StringBuilder deciphered = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int charIdxInAlphabet = alphabetIndexes.get(String.valueOf(str.charAt(i)));
            int shift = key;
            if (key >= 26) {
                int multiplesOf26 = key / 26;
                shift = key - multiplesOf26*26;
            }
            if (charIdxInAlphabet + shift < alphabet.length)
                deciphered.append(alphabet[charIdxInAlphabet+shift]);
            else
                deciphered.append(alphabet[charIdxInAlphabet + shift - alphabet.length]);
        }

        return deciphered.toString();
    }

}
