public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        short minutesInDay = 60 * 24;
        long days = minutes / minutesInDay;
        System.out.printf("%d min = %d y and %d d\n", minutes, (days / 365), days % 365);
    }
}
