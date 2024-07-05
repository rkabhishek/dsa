package arrays;

import java.util.HashMap;
import java.util.Map;

// leetcode 1512
public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num: nums) {
            int numCount = counts.getOrDefault(num, 0);
            counts.put(num, numCount + 1);
        }

        for (Integer c: counts.values()) {
            count += (c * (c - 1)) / 2;
        }

        return count;
    }
}
