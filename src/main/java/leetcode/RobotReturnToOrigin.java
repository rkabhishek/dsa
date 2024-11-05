package main.java.leetcode;

// leetcode 657
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int horizontalDisplacement = 0;
        int verticalDisplacement = 0;
        for (char c: moves.toCharArray()) {
            if (c == 'U') {
                verticalDisplacement++;
            } else if (c == 'D') {
                verticalDisplacement--;
            } else if (c == 'R') {
                horizontalDisplacement++;
            } else {
                horizontalDisplacement--;
            }
        }

        return (horizontalDisplacement == 0 && verticalDisplacement == 0);
    }
}
