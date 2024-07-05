package arrays;

import java.util.HashMap;
import java.util.Map;

// leetcode 1512
public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int identicalPairCount = 0;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num: nums) {
            int numCount = counts.getOrDefault(num, 0);
            identicalPairCount += numCount;
            counts.put(num, numCount + 1);
        }

        return identicalPairCount;
    }
}
