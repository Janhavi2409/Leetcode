package Array;

public class _66_PlusOne {
    public int[] plusOne(int[] digits) {
        // long num = 0;
        // ArrayList<Integer> result = new ArrayList<>();
        // for (int i = 0; i < digits.length; i++) {
        // num = num * 10 + digits[i];
        // }
        // num++;
        // while (num > 0) {
        // int n = (int) (num % 10);
        // result.add(0, n);
        // num /= 10;
        // }
        // int[] resultArray = new int[result.size()];
        // for (int i = 0; i < result.size(); i++) {
        // resultArray[i] = result.get(i);
        // }
        // return resultArray;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
