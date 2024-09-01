package main.java.leetcode;

// leetcode 58
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        int p = s.length() - 1;

        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            lastWordLength++;
        }

        return lastWordLength;
    }
}
