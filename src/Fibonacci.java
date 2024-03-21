// leetcode 509
public class Fibonacci {
    public int fib(int n) {
        if (n <= 1)
            return n;

        int secondToLast = 0;
        int last = 1;
        int curr = 0;

        for (int i = 2; i <=n ; i++) {
            curr = secondToLast + last;
            secondToLast = last;
            last = curr;
        }
        return curr;
    }
}
