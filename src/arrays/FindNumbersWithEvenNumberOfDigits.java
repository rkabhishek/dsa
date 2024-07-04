package arrays;

// leetcode 1295
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int countOfNumbersWithEvenDigits = 0;
        for (int num: nums) {
            if (hasEvenDigits(num)) {
                countOfNumbersWithEvenDigits++;
            }
        }

        return countOfNumbersWithEvenDigits;
    }

    private boolean hasEvenDigits(int num) {
        return String.valueOf(num).length() % 2 == 0;
    }
}
