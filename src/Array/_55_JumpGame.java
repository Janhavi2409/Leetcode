package Array;

public class _55_JumpGame {
    public boolean canJump(int[] nums) {
        int jump = 0;
        int maxReach = 0;
        while (jump <= maxReach) {
            maxReach = Math.max(maxReach, jump + nums[jump]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
            jump++;
        }
        return false;
    }
}
