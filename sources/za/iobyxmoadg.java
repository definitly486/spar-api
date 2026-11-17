package za;

import java.math.RoundingMode;
import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final double f129425iobyxmoadg = Math.log(2.0d);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final double[] f129426zoijcleaow = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: za.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static /* synthetic */ class C3290iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f129427iobyxmoadg;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f129427iobyxmoadg = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f129427iobyxmoadg[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static double eablkybsjg(double d13, RoundingMode roundingMode) {
        if (!zoijcleaow.zoijcleaow(d13)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C3290iobyxmoadg.f129427iobyxmoadg[roundingMode.ordinal()]) {
            case 1:
                eablkybsjg.gxszxtbevo(zoijcleaow(d13));
                return d13;
            case 2:
                return (d13 >= 0.0d || zoijcleaow(d13)) ? d13 : ((long) d13) - 1;
            case 3:
                return (d13 <= 0.0d || zoijcleaow(d13)) ? d13 : ((long) d13) + 1;
            case 4:
                return d13;
            case 5:
                if (zoijcleaow(d13)) {
                    return d13;
                }
                return ((long) d13) + ((long) (d13 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d13);
            case 7:
                double dRint = Math.rint(d13);
                return Math.abs(d13 - dRint) == 0.5d ? d13 + Math.copySign(0.5d, d13) : dRint;
            case 8:
                double dRint2 = Math.rint(d13);
                return Math.abs(d13 - dRint2) == 0.5d ? d13 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long gxszxtbevo(double d13, RoundingMode roundingMode) {
        double dEablkybsjg = eablkybsjg(d13, roundingMode);
        eablkybsjg.iobyxmoadg(((-9.223372036854776E18d) - dEablkybsjg < 1.0d) & (dEablkybsjg < 9.223372036854776E18d), d13, roundingMode);
        return (long) dEablkybsjg;
    }

    public static boolean iobyxmoadg(double d13, double d14, double d15) {
        eablkybsjg.wkgbmnqykc("tolerance", d15);
        return Math.copySign(d13 - d14, 1.0d) <= d15 || d13 == d14 || (Double.isNaN(d13) && Double.isNaN(d14));
    }

    public static boolean ppxfxbqfkf(double d13) {
        if (d13 <= 0.0d || !zoijcleaow.zoijcleaow(d13)) {
            return false;
        }
        long jIobyxmoadg = zoijcleaow.iobyxmoadg(d13);
        return (jIobyxmoadg & (jIobyxmoadg - 1)) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int wkgbmnqykc(double d13, RoundingMode roundingMode) {
        boolean zPpxfxbqfkf;
        boolean z13 = false;
        draadjrbmk.eablkybsjg(d13 > 0.0d && zoijcleaow.zoijcleaow(d13), "x must be positive and finite");
        int exponent = Math.getExponent(d13);
        if (!zoijcleaow.ppxfxbqfkf(d13)) {
            return wkgbmnqykc(d13 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C3290iobyxmoadg.f129427iobyxmoadg[roundingMode.ordinal()]) {
            case 1:
                eablkybsjg.gxszxtbevo(ppxfxbqfkf(d13));
                if (z13) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z13) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z13 = !ppxfxbqfkf(d13);
                if (z13) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z13 = exponent < 0;
                zPpxfxbqfkf = ppxfxbqfkf(d13);
                z13 &= !zPpxfxbqfkf;
                if (z13) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z13 = exponent >= 0;
                zPpxfxbqfkf = ppxfxbqfkf(d13);
                z13 &= !zPpxfxbqfkf;
                if (z13) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dWkgbmnqykc = zoijcleaow.wkgbmnqykc(d13);
                if (dWkgbmnqykc * dWkgbmnqykc > 2.0d) {
                    z13 = true;
                }
                if (z13) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zoijcleaow(double d13) {
        return zoijcleaow.zoijcleaow(d13) && (d13 == 0.0d || 52 - Long.numberOfTrailingZeros(zoijcleaow.iobyxmoadg(d13)) <= Math.getExponent(d13));
    }
}
