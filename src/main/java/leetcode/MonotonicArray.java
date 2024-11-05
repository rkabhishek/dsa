package main.java.leetcode;

// leetcode 896
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                isIncreasing = true;
            } else if (nums[i] < nums[i - 1]) {
                isDecreasing = true;
            }
        }

        return !(isIncreasing && isDecreasing); // if both are true then array is not monotonic
    }
}
