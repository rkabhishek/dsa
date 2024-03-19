package recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(10);
    }

    static void printName(int n) {
        if (n <= 0)
            return;
        System.out.println("Abhishek");
        printName(--n);
    }
}
