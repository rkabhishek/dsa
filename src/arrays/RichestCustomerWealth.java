package arrays;

// leetcode 1672
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customerAccount: accounts) {
            int customerWealth = 0;
            for (int wealth: customerAccount) {
                customerWealth += wealth;
            }

            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }

        return maxWealth;
    }
}
