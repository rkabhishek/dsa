package arrays;

// leetcode 747
public class LargestNumberAtleastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                maxIndex = -1;
                break;
            }
        }

        return maxIndex;
    }
}
