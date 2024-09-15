package HashMap;

import java.util.HashMap;

public class _1371_FindTheLongestSubstringContainingVowelsInEvenCounts {
    public int findTheLongestSubstring(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0,0,0,0,0", -1);

        int maxLength = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if (c == 'a') a++;
            else if (c == 'e') e++;
            else if (c == 'i') i++;
            else if (c == 'o') o++;
            else if (c == 'u') u++;
            String key = (a % 2) + "," + (e % 2) + "," + (i % 2) + "," + (o % 2) + "," + (u % 2);
            if (map.containsKey(key)) {
                maxLength = Math.max(maxLength, index - map.get(key));
            } else {
                map.put(key, index);
            }
        }

        return maxLength;

    }
}
