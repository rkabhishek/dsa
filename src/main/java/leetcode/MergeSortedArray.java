package main.java.leetcode;

import java.util.Arrays;

// leetcode 88
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] temp = new int[m];
		int i = 0, j = 0, k = 0;

		while (i < m) {
			temp[i] = nums1[i];
			i++;
		}

		i = 0;
	    while (i < m && j < n) {
		    if (temp[i] <= nums2[j]) {
			    nums1[k++] = temp[i++];
		    } else {
			    nums1[k++] = nums2[j++];
		    }
	    }

	    if (i == m) {
		    while (j < n) {
				nums1[k++] = nums2[j++];
		    }
	    } else {
		    while (i < m) {
			    nums1[k++] = temp[i++];
		   }
	    }
	}
}
