/*
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
*/

import java.util.LinkedList;

public class LongestSubstring {

    String getLongestSubstringBrute(int n, String s) {
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - i + 1; j++) {
                String subStr = s.substring(i, j);
                if (subStr.length() > longestSubstring.length()) {
                    LinkedList<Character> uniqueLetters = new LinkedList<Character>();
                    for (int k = 0; k < subStr.length(); k++) {
                        if (!uniqueLetters.contains(subStr.charAt(k))) {
                            uniqueLetters.push(subStr.charAt(k));
                        }
                    }
                    if (uniqueLetters.size() <= n) {
                        longestSubstring = subStr;
                    }
                }
            }
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        String s = "abcba";
        int n = 2;
        String longestSubstring = ls.getLongestSubstringBrute(n, s);
        System.out.println(longestSubstring);
        System.out.println(longestSubstring.length());
    }
}