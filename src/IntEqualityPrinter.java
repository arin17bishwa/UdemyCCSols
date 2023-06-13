public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int a, int b, int c) {
        String ans = "Neither all are equal or different";
        if (a < 0 || b < 0 || c < 0)
            ans = "Invalid Value";
        else if (a == b && b == c)
            ans = "All numbers are equal";
        else if (a != b && b != c && a != c)
            ans = "All numbers are different";
        System.out.println(ans);
    }
}
