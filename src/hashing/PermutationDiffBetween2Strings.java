package hashing;

// leetcode 3146
public class PermutationDiffBetween2Strings {
    public int findPermutationDifference(String s, String t) {
        int permutationDiff = 0;
        // to keep track of the index difference between 2 strings for each alphabet
        int[] diffCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            diffCount[c - 'a'] = i;
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            diffCount[c - 'a'] -= j;
        }

        for (int k : diffCount) {
            permutationDiff += Math.abs(k);
        }

        return permutationDiff;
    }
}
