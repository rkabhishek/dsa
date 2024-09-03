package main.java.leetcode;

// leetcode 2011
public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;

        for (String op: operations) {
            value += (op.charAt(1) == '-') ? -1 : 1;
        }

        return value;
    }
}
