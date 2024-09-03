package main.java.leetcode;

// leetcode 3190
public class MinOperationsToMakeAllDivisibleBy3 {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }
}
