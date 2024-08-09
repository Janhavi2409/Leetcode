package Array;

public class _209_MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int counter = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            counter++;
            while (sum >= target) {
                minLength = Math.min(minLength, counter);
                sum -= nums[i - counter + 1];
                counter--;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
