package Math;

public class _405_ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        return Integer.toHexString(num);
    }
}
