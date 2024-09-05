package Array;

import java.util.Arrays;

public class _2028_FindMissingObservations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = mean * (n + m);
        int sumKnown = 0;

        for (int roll : rolls) {
            sumKnown += roll;
        }

        int missingSum = totalSum - sumKnown;

        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int[] result = new int[n];
        Arrays.fill(result, 1);
        missingSum -= n;

        for (int i = 0; i < n && missingSum > 0; i++) {
            int add = Math.min(5, missingSum);
            result[i] += add;
            missingSum -= add;
        }

        return result;
    }
}
