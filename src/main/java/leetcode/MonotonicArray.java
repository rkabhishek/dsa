package main.java.leetcode;

// leetcode 896
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums[nums.length - 1] >= nums[0]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
