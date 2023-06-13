public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2020));
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
}
