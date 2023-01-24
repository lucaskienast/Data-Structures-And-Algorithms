package strings.easy.palindromePairs;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // O (N * M) T
    // O (N) S

    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        List<String> palindromes = new ArrayList<>();
        ArrayList<ArrayList<String>> palindromePairs = new ArrayList<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = word.length()-1; i >= 0; i--) {
                sb.append(""+word.charAt(i));
            }

            String palindrome = sb.toString();
            if (palindromes.contains(word)) {
                ArrayList<String> pair = new ArrayList<>();
                pair.add(palindrome);
                pair.add(word);
                palindromePairs.add(pair);
                continue;
            }

            palindromes.add(palindrome);
        }

        return palindromePairs;
    }

}
