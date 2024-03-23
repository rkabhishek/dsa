package arrays;

// leetcode 1929
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }
}
