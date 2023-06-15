import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0, numberCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inp = scanner.nextLine();
            try {
                int inputNumber = Integer.parseInt(inp);
                sum += inputNumber;
                numberCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        long average = numberCount > 0 ? Math.round((double) sum / numberCount) : 0;
        System.out.println("SUM = " + sum + " AVG = " + average);

    }
}
