package main.java.leetcode;

import java.util.Arrays;

// leetcode 1502
public class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int expectedDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != expectedDiff) {
                return false;
            }
        }

        return true;
    }
}
