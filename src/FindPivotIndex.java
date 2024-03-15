// leetcode 724
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {

        int sum = 0, lsum = 0;

        for (int num: nums)
           sum += num;

        for (int i = 0; i < nums.length; i++) {
            if (lsum == sum - nums[i] - lsum) {
                return i;
            }
            lsum += nums[i];
        }

        return -1;
    }
}
