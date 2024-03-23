package arrays;

import java.util.HashMap;
import java.util.Map;

// leetcode 169
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: counts.entrySet()) {
            if (entry.getValue() > nums.length / 2)
                return entry.getKey();
        }

        return -1;
    }
}
