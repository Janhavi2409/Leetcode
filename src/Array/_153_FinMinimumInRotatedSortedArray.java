package Array;

import java.util.Arrays;

public class _153_FinMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        return min;
    }
}

