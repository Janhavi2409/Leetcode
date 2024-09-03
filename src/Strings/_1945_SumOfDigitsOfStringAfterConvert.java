package Strings;

public class _1945_SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i) - 'a' + 1;
            numStr.append(position);
        }

        int num = 0;
        for (char c : numStr.toString().toCharArray()) {
            num += c - '0';
        }

        k--;
        while (k > 0) {
            int sum = 0;
            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }
            num = sum;
            k--;
        }

        return num;
    }
}
