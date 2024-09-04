package main.java.leetcode;

// leetcode 268
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumTillN = n * (n + 1) / 2;
        int sumOfArray = 0;

        for (int num : nums) {
            sumOfArray += num;
        }

        return sumTillN - sumOfArray;
    }
}
