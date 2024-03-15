// leetcode 747
public class FindDominantIndex {

    public int dominantIndex(int[] nums) {
        int length = nums.length;
        int largest = -1;
        int maxIndex = -1;

        for (int i = 0; i < length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                maxIndex = i;
            }
        }
        
        for (int i = 0; i < length; i++) {
            if (i == maxIndex) {
                continue;
            }

            if (largest < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
