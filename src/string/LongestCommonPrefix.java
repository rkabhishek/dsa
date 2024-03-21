package string;

// leetcode 14
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] stringArray) {

        int minLen = stringArray[0].length();
        for (int i = 1; i < stringArray.length; i++) {
            minLen = Math.min(minLen, stringArray[i].length());
        }

        StringBuilder prefix = getPrefix(stringArray, minLen);
        return prefix.toString();
    }

    private StringBuilder getPrefix(String[] stringArray, int minLen) {

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char c = stringArray[0].charAt(i);
            for (int j = 1; j < stringArray.length; j++) {
                if (stringArray[j].charAt(i) != c) {
                    return prefix;
                }
            }
            prefix.append(c);
        }
        return prefix;
    }
}
