package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};

        reverse(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
    }
    static void reverse(int[] ar, int start, int end) {
        if (start >= end )
            return;
        int temp = ar[start];
        ar[start] = ar[end];
        ar[end] = temp;
        reverse(ar, start + 1, end - 1);
    }
}
