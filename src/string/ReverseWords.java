package string;// leetcode 557

public class ReverseWords {
    public String reverseWords(String s) {
        char[] sentence = s.toCharArray();

        int wordStart = 0;
        int spaceIndex = 0;

        while (wordStart < sentence.length) {

            while (spaceIndex < sentence.length && sentence[spaceIndex] != ' ')
                spaceIndex++;

            reverse(sentence, wordStart, spaceIndex - 1);
            wordStart = spaceIndex + 1;
            spaceIndex = wordStart;
        }

        return new String(sentence);
    }

    private void reverse(char[] s, int start, int end) {
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
