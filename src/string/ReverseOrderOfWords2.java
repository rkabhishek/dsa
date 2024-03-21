package string;// leetcode 186

public class ReverseOrderOfWords2 {
    public void reverseWords(char[] s) {
        reverseString(s, 0, s.length - 1);
        reverseEachWord(s);
    }

    private void reverseEachWord(char[] s) {
        int wordStart = 0;
        int spaceIndex = 0;

        while (wordStart < s.length) {
            while (spaceIndex < s.length && s[spaceIndex] != ' ')
                spaceIndex++;

            reverseString(s, wordStart, spaceIndex - 1);
            wordStart = spaceIndex + 1;
            spaceIndex = wordStart;
        }

    }

    private void reverseString(char[] s, int start, int end) {
        char temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
