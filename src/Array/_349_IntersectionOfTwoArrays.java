package Array;

import java.util.ArrayList;

public class _349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] array = new int[1001];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums1) {
            array[num] = 1;
        }
        for (int num : nums2) {
            if (array[num] == 1) {
                array[num] = 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                arrayList.add(i);
            }
        }
        int[] ans = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            ans[i] = arrayList.get(i);
        }
        return ans;
    }
}
