package main.java.leetcode;

import java.util.Arrays;

// leetcode 88
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}

	    Arrays.sort(nums1);
	    System.out.println(Arrays.toString(nums1));
    }
}
