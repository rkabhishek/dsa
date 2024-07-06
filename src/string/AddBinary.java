package string;

// leetcode 67
public class AddBinary {
    public String addBinary(String a, String b) {
        String[] ar = equalizeStrings(a, b);
        a = ar[0];
        b = ar[1];

        int len = a.length();
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = len - 1; i >= 0; i--) {
            int digitA =  a.charAt(i) - '0';
            int digitB = b.charAt(i) - '0';
            int digitSum = (digitA + digitB + carry) % 2;
            carry = (digitA + digitB + carry) / 2;
            result.insert(0, digitSum);
        }

        if (carry == 1) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    private String[] equalizeStrings(String a, String b) {
        int diff = a.length() - b.length();
        if (diff >= 0) {
            b = prependZeroes(b, diff);
        } else {
            a = prependZeroes(a, -diff);
        }
        return new String[]{a, b};
    }

    private String prependZeroes(String str, int count) {
        String leadingZeroes = "0".repeat(count);
        return new StringBuilder(str).insert(0, leadingZeroes).toString();
    }
}
