public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0)
                sum += i + (number / i);
        }
        int root = (int) Math.pow(number, 0.5);
        return sum + (root * root == number ? root : 0) == number;
    }
}
