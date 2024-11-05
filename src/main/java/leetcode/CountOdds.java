package main.java.leetcode;

// leetcode 1523
public class CountOdds {
    public int countOdds(int low, int high) {
        int numberOfElements = high - low + 1;
        if (low % 2 == 0) {
            return numberOfElements / 2;
        } else {
            return (numberOfElements + 1) / 2;
        }
    }
}
