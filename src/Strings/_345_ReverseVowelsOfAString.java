package Strings;

import java.util.ArrayList;

public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        ArrayList<Character> array = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                array.add(s.charAt(i));
            }
        }

        int j = array.size() - 1;
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                if (j >= 0) {
                    str += array.get(j);
                    j--;
                }
            } else {
                str += s.charAt(i);
            }
        }

        return str;
    }
}
