package strings.easy.cipherDecryptor;

public class Solution2 {

    // O(N) T
    // O(1) S

    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder deciphered = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int ascii_value = str.charAt(i) + (key % 26);
            if (ascii_value > 'z')
                ascii_value -= 26;
            deciphered.append((char) ascii_value);
        }

        return deciphered.toString();
    }

}
