package Array;

public class _1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int ptr1 = 0;
        int ptr2 = n;
        int ptr3 = 0;
        while (ptr1 < n && ptr2 < 2 * n) {
            ans[ptr3++] = nums[ptr1++];
            ans[ptr3++] = nums[ptr2++];
        }
        return ans;
    }
}
