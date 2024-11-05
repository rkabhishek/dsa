package main.java.leetcode;

// leetcode 657
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);

            if (c == 'U') {
                y--;
            } else if (c == 'D') {
                y++;
            } else if (c == 'R') {
                x++;
            } else {
                x--;
            }
        }

        return (x == 0 && y == 0);
    }
}
