package Array;

import java.util.Arrays;

public class _287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = slow + 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[slow] == nums[fast]) {
                return nums[slow];
            } else {
                slow++;
                fast++;
            }
        }
        return 0;
    }
}
