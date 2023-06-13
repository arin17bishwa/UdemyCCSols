public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(10);
        printNumberInWord(-5);
        printNumberInWord(5);
    }


    public static void printNumberInWord(int n) {
        String ans;
        if (n == 0)
            ans = "ZERO";
        else if (n == 1)
            ans = "ONE";
        else if (n == 2)
            ans = "TWO";
        else if (n == 3)
            ans = "THREE";
        else if (n == 4)
            ans = "FOUR";
        else if (n == 5)
            ans = "FIVE";
        else if (n == 6)
            ans = "SIX";
        else if (n == 7)
            ans = "SEVEN";
        else if (n == 8)
            ans = "EIGHT";
        else if (n == 9)
            ans = "NINE";
        else
            ans = "OTHER";
        System.out.println(ans);
    }
}
