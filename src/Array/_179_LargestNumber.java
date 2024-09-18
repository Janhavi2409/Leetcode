package Array;

import java.util.ArrayList;

public class _179_LargestNumber {
    public String largestNumber(int[] nums) {
        ArrayList<String> array = new ArrayList<>();
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            array.add(Integer.toString(nums[i]));
        }
        while (!array.isEmpty()) {
            String maxString = array.get(0);
            int maxIndex = 0;
            for (int i = 1; i < array.size(); i++) {
                String current = array.get(i);
                if ((current + maxString).compareTo(maxString + current) > 0) {
                    maxString = current;
                    maxIndex = i;
                }
            }
            result += maxString;
            array.remove(maxIndex);
        }
        if (result.charAt(0) == '0') {
            return "0";
        }
        return result;
    }
}
