package Math;

public class _29_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return (int) (dividend / divisor);
    }
}
