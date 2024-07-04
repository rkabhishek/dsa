package arrays;

// leetcode 2798
public class EmployeesWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour: hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }
}
