package main.java.leetcode;

// leetcode 1672
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] singleCustomerAccounts:  accounts) {
            int customerWealth = 0;

            for (int bankAccount: singleCustomerAccounts) {
                customerWealth += bankAccount;
            }

            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;
    }
}
