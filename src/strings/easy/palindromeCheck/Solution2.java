package strings.easy.palindromeCheck;

public class Solution2 {

    // O(N) T
    // O(1) S

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }

}
