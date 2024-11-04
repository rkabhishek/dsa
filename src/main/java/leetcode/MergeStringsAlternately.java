package main.java.leetcode;

// leetcode 1768
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedSb = new StringBuilder();
        int i;
        for (i = 0; i < word1.length() && i < word2.length(); i++) {
            mergedSb.append(word1.charAt(i));
            mergedSb.append(word2.charAt(i));
        }

        if (i == word1.length()) {  // handles the case where word1 length is <= word2 length
            for (; i < word2.length(); i++) {
                mergedSb.append(word2.charAt(i));
            }
        } else { // handles the case where word2 length < word1 length
            for (; i < word1.length(); i++) {
                mergedSb.append(word1.charAt(i));
            }
        }

        return mergedSb.toString();
    }
}


