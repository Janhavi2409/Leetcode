package Math;

import java.math.BigInteger;

public class _67_AddBinary {
    public String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger add = a1.add(b1);
        return add.toString(2);
    }
}
