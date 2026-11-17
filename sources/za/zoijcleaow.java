package za;

import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
abstract class zoijcleaow {
    static long iobyxmoadg(double d13) {
        draadjrbmk.eablkybsjg(zoijcleaow(d13), "not a normal value");
        int exponent = Math.getExponent(d13);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d13) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean ppxfxbqfkf(double d13) {
        return Math.getExponent(d13) >= -1022;
    }

    static double wkgbmnqykc(double d13) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d13) & 4503599627370495L) | 4607182418800017408L);
    }

    static boolean zoijcleaow(double d13) {
        return Math.getExponent(d13) <= 1023;
    }
}
