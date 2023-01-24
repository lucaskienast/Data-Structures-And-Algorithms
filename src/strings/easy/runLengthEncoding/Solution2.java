package strings.easy.runLengthEncoding;

public class Solution2 {

    // O(N) T
    // O(N) S

    public String runLengthEncoding(String string) {
        StringBuilder sb = new StringBuilder();
        char prev = string.charAt(0);
        int count = 0;

        for (char c : string.toCharArray()) {
            if (count == 9 || prev != c) {
                sb.append(count);
                sb.append(prev);
                prev = c;
                count = 0;
            }
            count++;
        }

        if (count != 0) {
            sb.append(count);
            sb.append(prev);
        }

        return sb.toString();
    }

}
