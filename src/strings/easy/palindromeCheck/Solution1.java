package strings.easy.palindromeCheck;

public class Solution1 {

    // O(N) T
    // O(1) S

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1)
            return true;

        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf =
                str.substring((str.length() % 2 == 0) ? str.length()/2 : str.length()/2+1, str.length());

        for (int i = 0; i < firstHalf.length(); i++) {
            if (firstHalf.charAt(i) != secondHalf.charAt(secondHalf.length()-i-1))
                return false;
        }

        return true;
    }

}
