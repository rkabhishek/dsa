package main.java.leetcode;

import java.util.*;

// leetcode 448
public class FindAllDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		List<Integer> disappearedNumbers = new ArrayList<>();

		for (int num: nums) {
			numSet.add(num);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!numSet.contains(i)) {
				disappearedNumbers.add(i);
			}
		}

		return disappearedNumbers;
	}
}
