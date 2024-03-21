package string;// leetcode 125

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char start;
        char end;
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            start = s.charAt(i);
            end = s.charAt(len - i - 1);
            if (start != end)
                return false;
        }

        return true;
    }
}
