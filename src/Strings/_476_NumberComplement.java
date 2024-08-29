package Strings;

public class _476_NumberComplement {
    public int findComplement(int num) {
        String binary = "";
        String complement = "";

        while (num > 0) {
            if (num % 2 == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
            num /= 2;
        }

        String correctBinary = new StringBuilder(binary).reverse().toString();

        for (int i = 0; i < correctBinary.length(); i++) {
            if (correctBinary.charAt(i) == '1') {
                complement += "0";
            } else {
                complement += "1";
            }
        }

        int compNum = Integer.parseInt(complement, 2);
        return compNum;
    }
}
