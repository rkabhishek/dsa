package arrays;


// leetcode 2011
public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0 ;
        for (String op: operations) {
            if (op.charAt(1) == '+') {
                result++;
            } else if (op.charAt(1) == '-') {
                result--;
            }
        }

        return result;
    }
}
