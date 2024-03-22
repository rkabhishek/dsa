package hashing;

import java.util.HashMap;
import java.util.Map;

// leetcode 219
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
           if (indexMap.containsKey(nums[i]) && Math.abs(indexMap.get(nums[i]) - i) <= k ) {
               return true;
           } else
               indexMap.put(nums[i], i);
        }

        return false;
    }
}
