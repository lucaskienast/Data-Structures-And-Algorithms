package strings.easy.runLengthEncoding;

public class Solution1 {

    // O(N) T
    // O(N) S

    public String runLengthEncoding(String string) {
        if (string.length() == 1)
            return "1" + string.charAt(0);

        StringBuilder sb = new StringBuilder();
        char prev = string.charAt(0);
        int counter = 1;

        for (int i = 1; i < string.length(); i++) {
            char current = string.charAt(i);

            if (current == prev)
                counter++;

            if (current != prev || (current == prev && i == string.length() - 1)) {
                int multiplesOf9 = counter / 9;
                for (int j = 0; j < multiplesOf9; j++) {
                    sb.append(9);
                    sb.append(prev);
                }
                if (counter % 9 > 0) {
                    sb.append(counter % 9);
                    sb.append(prev);
                }
                counter = 1;
            }

            if (current != prev && i == string.length() - 1) {
                sb.append(1);
                sb.append(current);
                counter = 1;
            }

            prev = current;
        }

        return sb.toString();
    }

}
