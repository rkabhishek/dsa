package main.java.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public boolean canMakeArithmeticProgression2(int[] arr) {
        Set<Integer> numSet = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num: arr) {
            numSet.add(num);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        if ((max - min) % (arr.length - 1) != 0) {
            return false;
        }
        int possibleDifference = (max - min) / (arr.length - 1);

        for (int i = 0; i <= arr.length - 1; i++) {
            int num = min + i * possibleDifference;
            if (!numSet.contains(num)) {
                return false;
            }
        }

        return true;
    }
}
