package main.java.leetcode;

// leetcode 3173
public class BitwiseORAdjacentElements {

    public int[] orArray(int[] nums) {
        int[] bitArray = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            bitArray[i] = nums[i] | nums[i + 1];
        }

        return bitArray;
    }
}
