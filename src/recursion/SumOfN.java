package recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int n){
        if (n < 0)
            throw new IllegalArgumentException(String.format("%d is not a natural number.", n));
        if (n == 0)
            return 0;
        return n + sum (n - 1);
    }
}
