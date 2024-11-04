package main.java.leetcode;

// leetcode 389
public class FindDifference {
    public char findTheDifference(String s, String t) {
        int sumOfCharS = 0;
        int sumOfCharT = 0;

        for (int i = 0; i < s.length(); i++) {
            sumOfCharS += s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            sumOfCharT += t.charAt(i);
        }

        return (char)(sumOfCharT - sumOfCharS);
    }
}
