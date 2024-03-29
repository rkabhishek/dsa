package hashing;

import java.util.*;

// leetcode 217
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }

        return false;
    }

    /* implementation using hashmap
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num: nums) {
            if (countMap.containsKey(num)) {
                return true;
            } else {
                countMap.put(num, 1);
            }
        }

        return false;
    }

     */


    /* another implementation using sorting
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }
    */
}
