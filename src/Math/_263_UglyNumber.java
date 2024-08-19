package Math;

public class _263_UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        // for (int i = 2; i <= n; i++) {
        // while (n % i == 0) {
        // n = n / i;
        // if (i > 5)
        // return false;
        // }
        // }

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}
