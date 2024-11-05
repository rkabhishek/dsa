package main.java.leetcode;

// leetcode 682
public class BaseballGame {
    public int calPoints(String[] operations) {
        int[] scores = new int[1000];
        int sum = 0;
        int currentIndex = -1;

        for (String op: operations) {
            if ("C".equals(op)) {
                scores[currentIndex] = 0;
                currentIndex--;
            } else if ("D".equals(op)) {
                currentIndex++;
                scores[currentIndex] = 2 * scores[currentIndex - 1];
            } else if ("+".equals(op)) {
                currentIndex++;
                scores[currentIndex] = scores[currentIndex - 1] + scores[currentIndex - 2];
            } else {
                currentIndex++;
                scores[currentIndex] = Integer.parseInt(op);
            }
        }

        for (int i = 0; i <= currentIndex; i++) {
            System.out.println(scores[i]);
            sum += scores[i];
        }

        return sum;
    }
}
