public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }


    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        boolean ans = false;
        if (year % 400 == 0)
            ans = true;
        else if (year % 100 != 0 && year % 4 == 0)
            ans = true;
        return ans;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;
        boolean isLeap = isLeapYear(year);
        if (isLeap && month == 2)
            return 29;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 2)
            return 28;
        return 30;
    }

}
