package string;

// leetcode 58
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        int len = 0;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            len++;
        }

        return len;
    }
}
