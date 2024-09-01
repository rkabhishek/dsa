package main.java.leetcode;

// leetcode 1134
public class ArmstrongNumber {
    public boolean isArmstrong(int n) {
        int digitCount = String.valueOf(n).length();

        return getSumOfKthPowerOfDigits(n, digitCount) == n;
    }

    private int getSumOfKthPowerOfDigits(int n, int digitCount) {
        int sum = 0;

        while (n > 0) {
            sum += Math.pow(n % 10, digitCount);
            n /= 10;
        }

        return sum;
    }
}
