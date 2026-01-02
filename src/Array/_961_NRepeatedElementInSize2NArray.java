package Array;

import java.util.HashSet;

public class _961_NRepeatedElementInSize2NArray {public int repeatedNTimes(int[] nums) {
    // Solution 1

    // int n = nums.length / 2;
    // HashMap<Integer, Integer> hashMap = new HashMap<>();
    // for (int i = 0; i < nums.length; i++) {
    //     if (hashMap.containsKey(nums[i])) {
    //         continue;
    //     }
    //     int count = 1;
    //     for (int j = i + 1; j < nums.length; j++) {
    //         if (nums[i] == nums[j]) {
    //             count++;
    //         }
    //     }
    //     hashMap.put(nums[i], count);
    // }
    // for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
    //     if (n == e.getValue()) {
    //         return e.getKey();
    //     }
    // }
    // return -1;
    //----------------------------------------------------------------------------

    // Solution 2

    HashSet<Integer> set =  new HashSet<>();
    for(int i : nums){
        if(!set.add(i)){
            return i;
        }
    }
    return -1;
}

}
