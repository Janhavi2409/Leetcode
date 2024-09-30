package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class _819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] array = paragraph.split("\\W+");
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < banned.length; i++) {
            al.add(banned[i]);
        }
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        int max = 0;
        String maxWord = "";
        for (String word : map.keySet()) {
            if (map.get(word) > max && !al.contains(word)) {
                max = map.get(word);
                maxWord = word;
            }
        }
        return maxWord;
    }
}
