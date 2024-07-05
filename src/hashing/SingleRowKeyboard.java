package hashing;

// leetcode 1165
public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int[] keyboardIndices = new int[26];
        for (int i = 0; i < keyboard.length(); i++) {
            keyboardIndices[keyboard.charAt(i) - 'a'] = i;
        }

        int typingTime = 0;
        int prevIndex = 0;

        for (char c: word.toCharArray()) {
            int currIndex = keyboardIndices[c -'a'];
            typingTime += Math.abs(currIndex - prevIndex);
            prevIndex = currIndex;
        }

        return typingTime;
    }
}
