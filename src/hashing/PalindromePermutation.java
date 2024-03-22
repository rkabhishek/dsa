package hashing;

import java.util.HashMap;
import java.util.Map;

// leetcode 266
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> letterCount = new HashMap<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            int count = letterCount.getOrDefault(ch, 0);
            letterCount.put(s.charAt(i), count + 1);
        }

        int charactersWithOddCount = 0;

        for (int val: letterCount.values()) {
            charactersWithOddCount += val % 2;
        }

        if (len % 2 == 0)
            return charactersWithOddCount == 0;
        else
            return charactersWithOddCount == 1;
    }
}
