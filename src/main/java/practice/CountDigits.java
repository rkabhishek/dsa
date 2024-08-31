package main.java.practice;

public class CountDigits {

    public int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        n = Math.abs(n);

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public int countDigits2(int n) {
        if (n == 0) {
            return 1;
        }

        n = Math.abs(n);

        return (int) Math.log10(n) + 1;
    }
}
