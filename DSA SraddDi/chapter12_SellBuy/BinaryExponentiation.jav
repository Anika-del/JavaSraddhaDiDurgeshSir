public class BinaryExponentiation {
    
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        long result = binPow(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }

    public static long binPow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        long half = binPow(base, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return half * half * base;
        }
    }
}
