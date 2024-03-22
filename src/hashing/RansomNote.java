package hashing;

// leetcode 383
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;

        int[] letterCount = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            letterCount[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            letterCount[ransomNote.charAt(i) - 'a']--;
            if (letterCount[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }

        return true;
    }
}
