package arrays;

import java.util.ArrayList;
import java.util.List;

// leetcode 1431
public class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> willHaveMaxCandies = new ArrayList<>();
        int maxCandy = 0;

        for (int candy : candies) {
            if (candy > maxCandy) {
                maxCandy = candy;
            }
        }
        for (int candy : candies) {
            willHaveMaxCandies.add(candy + extraCandies >= maxCandy);
        }

        return willHaveMaxCandies;
    }
}
