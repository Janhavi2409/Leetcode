package Strings;

public class _557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans = "";

        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                ans += str[i].charAt(j);
            }
            ans += " ";
        }

        return ans.trim();
    }
}
