package BitManipulation;

public class _1310_XORQueriesOfASubArray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int num = 0;
        for (int[] i : queries) {
            int xor = arr[i[0]];
            for (int j = i[0] + 1; j <= i[1]; j++) {
                xor ^= arr[j];
            }
            result[num] = xor;
            num++;
        }
        return result;
    }
}
