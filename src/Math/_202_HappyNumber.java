package Math;

public class _202_HappyNumber {
    public boolean isHappy(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }
}
