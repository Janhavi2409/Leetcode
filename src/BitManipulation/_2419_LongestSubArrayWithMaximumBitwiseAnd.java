package BitManipulation;

import java.util.ArrayList;

public class _2419_LongestSubArrayWithMaximumBitwiseAnd {
    public int longestSubArray(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int bitAnd = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        int maxLength = 0, currentLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxVal) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }

        return maxLength;
    }

}
