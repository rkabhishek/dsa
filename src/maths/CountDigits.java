package maths;

public class CountDigits {
    public int countDigits(int number) {
        if (number == 0)
            return 1;

        number = Math.abs(number);

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
