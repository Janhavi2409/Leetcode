package Strings;

public class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] array = newStr.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
