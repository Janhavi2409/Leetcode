package BitManipulation;

public class _2220_MinimumBitFlipsToConvertANumber {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        int xor = start ^ goal;

        while (xor != 0) {
            ans += xor & 1;
            xor >>= 1;
        }
        return ans;
    }
}
