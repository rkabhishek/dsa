// leetcode 151
public class ReverseOrderOfWords {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        char[] sentence = s.toCharArray();

        reverseString(sentence, 0, sentence.length - 1);
        reverseEachWord(sentence);

        return new String(sentence);
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
