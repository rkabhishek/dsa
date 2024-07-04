package arrays;

// leetcode 1470
public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }

        return result;
    }
}
