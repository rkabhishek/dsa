package maths;

public class Armstrong {
    public boolean isArmstrong(int n) {
        int digitCount = String.valueOf(n).length();

        return getSumOfKthPowerOfDigits(n, digitCount) == n;
    }

    private int getSumOfKthPowerOfDigits(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += (int)Math.pow(n % 10, k);
            n /= 10;
        }

        return sum;
    }
}
