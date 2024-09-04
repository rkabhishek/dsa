package main.java.leetcode;

// leetcode 485
public class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;

        for (int num: nums) {
            if (num == 1) {
                currCount++;
            } else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }

        maxCount = Math.max(maxCount, currCount);

        return maxCount;
    }
}
