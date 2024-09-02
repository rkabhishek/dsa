package main.java.leetcode;

// leetcode 1894
public class FindStudentThatWillReplaceChalk {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalks = 0;

        for (int j : chalk) {
            totalChalks += j;
        }

        long chalksLeftInLastTurn = k % totalChalks;

        for (int i = 0; i < chalk.length; i++) {
            if (chalksLeftInLastTurn < chalk[i]) {
                return i;
            } else {
                chalksLeftInLastTurn -= chalk[i];
            }
        }

        return -1; // just to satisfy the compiler; this statement will never be reached
    }
}
