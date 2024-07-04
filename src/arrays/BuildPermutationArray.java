package arrays;

// leetcode 1920
public class BuildPermutationArray {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int newValue = (nums[nums[i]] % n);
            nums[i] = nums[i] + newValue * n;
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        
        return nums;
    }
}
