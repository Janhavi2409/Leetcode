package Strings;

public class _151_ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String ans = "";
        for (int i = str.length - 1; i > 0; i--) {
            ans += str[i] + " ";
        }
        ans += str[0];
        return ans;
    }
}
