package hashing;

import java.util.HashSet;
import java.util.Set;

// leetcode 771
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel: jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int count = 0;
        for (char stone: stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}
