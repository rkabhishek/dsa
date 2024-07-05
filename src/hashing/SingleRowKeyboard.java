package hashing;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int typingTime = 0;
        int prevIndex = 0;

        for (char c: word.toCharArray()) {
            int currentIndex = keyboard.indexOf(c);
            typingTime = typingTime + Math.abs(currentIndex - prevIndex);
            prevIndex = currentIndex;
        }

        return typingTime;
    }
}
