public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        int ans = Integer.MIN_VALUE;
        int num = number;
        for (int i = 2; i <= number; i++) {
            if (num % i == 0) {
                while (num % i == 0)
                    num /= i;
                ans = Math.max(ans, i);
            }
        }
        return ans;

    }

}
