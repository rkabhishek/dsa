package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException(String.format("Factorial is valid only for non-negative numbers."));
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
