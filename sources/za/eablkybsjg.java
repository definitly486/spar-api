package za;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg {
    static long eablkybsjg(String str, long j13) {
        if (j13 >= 0) {
            return j13;
        }
        throw new IllegalArgumentException(str + " (" + j13 + ") must be >= 0");
    }

    static void gxszxtbevo(boolean z13) {
        if (!z13) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void iobyxmoadg(boolean z13, double d13, RoundingMode roundingMode) {
        if (z13) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d13 + " and rounding mode " + roundingMode);
    }

    static void ppxfxbqfkf(boolean z13, String str, long j13, long j14) {
        if (z13) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j13 + ", " + j14 + ")");
    }

    static double wkgbmnqykc(String str, double d13) {
        if (d13 >= 0.0d) {
            return d13;
        }
        throw new IllegalArgumentException(str + " (" + d13 + ") must be >= 0");
    }

    static void zoijcleaow(boolean z13, String str, int i13, int i14) {
        if (z13) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i13 + ", " + i14 + ")");
    }
}
