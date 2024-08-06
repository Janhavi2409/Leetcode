package Array;

public class _189_RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;

        if (k == 0) {
            return;
        }

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[length - k + i];
        }

        for (int i = length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
