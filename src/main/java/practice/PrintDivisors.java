package main.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisors {
    public void printDivisors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (n / i != i) {
                    System.out.print(n / i + " ");
                }
            }
        }
        System.out.println();
    }

    public void printDivisors2(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);
        System.out.println(divisors);
    }
}
