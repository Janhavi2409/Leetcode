package Array;

public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxProduct) {
                maxProduct = nums[i];
            }
        }
        int curMax = 1;
        int curMin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                curMax = 1;
                curMin = 1;
            }
            int temp = curMax * nums[i];
            int curMax1 = Math.max(curMax * nums[i], curMin * nums[i]);
            curMax = Math.max(curMax1, nums[i]);
            int curMin1 = Math.min(temp, curMin * nums[i]);
            curMin = Math.min(curMin1, nums[i]);
            maxProduct = Math.max(maxProduct, curMax);
        }

        return maxProduct;
    }
}

