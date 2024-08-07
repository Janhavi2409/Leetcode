package Array;

public class _80_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[slow - 2]) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
