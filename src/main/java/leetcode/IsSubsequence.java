package main.java.leetcode;

// leetcode 392
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            char sChar = s.charAt(sIndex);
            char tChar = t.charAt(tIndex);

            if (sChar == tChar) {
                sIndex++;
            }

            tIndex++;
        }

        return sIndex == s.length();
    }
}
