package Array;

public class _75_SortColors {
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        int low = start;
        int high = end;

        while (low <= high) {
            while (array[low] < array[mid]) {
                low++;
            }
            while (array[high] > array[mid]) {
                high--;
            }
            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }

        quickSort(array, start, high);
        quickSort(array, low, end);
    }

    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
}
