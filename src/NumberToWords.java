public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber = reverse(number);
        String word = "";
        do {
            int reversedLastDigit = reversedNumber % 10;
            reversedNumber /= 10;

            if (reversedLastDigit == 0) word = "Zero";
            if (reversedLastDigit == 1) word = "One";
            if (reversedLastDigit == 2) word = "Two";
            if (reversedLastDigit == 3) word = "Three";
            if (reversedLastDigit == 4) word = "Four";
            if (reversedLastDigit == 5) word = "Five";
            if (reversedLastDigit == 6) word = "Six";
            if (reversedLastDigit == 7) word = "Seven";
            if (reversedLastDigit == 8) word = "Eight";
            if (reversedLastDigit == 9) word = "Nine";

            System.out.println(word);
        }
        while (reversedNumber > 0);
        for (int i = 0; i < (getDigitCount(number) - getDigitCount(reverse(number))); i++)
            System.out.println("Zero");

    }


    public static int reverse(int number) {
        boolean isNegative = number < 0;
        int reversedNumber = 0;
        int absoluteNumber = Math.abs(number);
        while (absoluteNumber > 0) {
            reversedNumber = reversedNumber * 10 + absoluteNumber % 10;
            absoluteNumber /= 10;
        }
        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int digitCount = 1;
        while (number > 9) {
            digitCount += 1;
            number /= 10;
        }
        return digitCount;
    }
}
