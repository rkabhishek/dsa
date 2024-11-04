package main.java.leetcode;

// leetcode 389
public class FindDifference {
    private static final int ALPHABET_SIZE = 26;
    private static final int ASCII_A = 97;

    public char findTheDifference(String s, String t) {
        int[] characterCountS = new int[ALPHABET_SIZE];
        int[] characterCountT = new int[ALPHABET_SIZE];

        for (int i = 0; i < s.length(); i++) {
            characterCountS[s.charAt(i) - ASCII_A]++;
        }

        for (int i = 0; i < t.length(); i++) {
            characterCountT[t.charAt(i) - ASCII_A]++;
        }

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (characterCountS[i] != characterCountT[i]) {
                return (char)(i + ASCII_A);
            }
        }

        throw new IllegalArgumentException("Invalid input: The second string must contain one additional character compared to the first string");
    }
}
