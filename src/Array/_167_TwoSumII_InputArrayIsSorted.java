package Array;

public class _167_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int num1 = 0;
        int num2 = 1;
        int[] ans = new int[2];
        while (num1 < numbers.length) {
            num2 = num1 + 1;
            while (num2 < numbers.length) {
                if (numbers[num1] + numbers[num2] == target) {
                    ans[0] = num1 + 1;
                    ans[1] = num2 + 1;
                    return ans;
                }
                num2++;
            }
            num1++;
        }
        return ans;
    }
}
