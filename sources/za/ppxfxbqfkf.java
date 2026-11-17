package za;

import com.google.common.primitives.gxszxtbevo;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.math.RoundingMode;
import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final byte[] f129429iobyxmoadg = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final int[] f129432zoijcleaow = {1, 10, 100, 1000, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final int[] f129430ppxfxbqfkf = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f129431wkgbmnqykc = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static int[] f129428eablkybsjg = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f129433iobyxmoadg;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f129433iobyxmoadg = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f129433iobyxmoadg[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int iobyxmoadg(int i13, int i14) {
        long j13 = ((long) i13) + ((long) i14);
        int i15 = (int) j13;
        eablkybsjg.zoijcleaow(j13 == ((long) i15), "checkedAdd", i13, i14);
        return i15;
    }

    public static int ppxfxbqfkf(int i13, int i14) {
        return gxszxtbevo.gtknphoqwx(((long) i13) * ((long) i14));
    }

    public static int zoijcleaow(int i13, int i14, RoundingMode roundingMode) {
        draadjrbmk.btonecajqb(roundingMode);
        if (i14 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i15 = i13 / i14;
        int i16 = i13 - (i14 * i15);
        if (i16 == 0) {
            return i15;
        }
        int i17 = ((i13 ^ i14) >> 31) | 1;
        switch (iobyxmoadg.f129433iobyxmoadg[roundingMode.ordinal()]) {
            case 1:
                eablkybsjg.gxszxtbevo(i16 == 0);
                return i15;
            case 2:
                return i15;
            case 3:
                if (i17 >= 0) {
                    return i15;
                }
                break;
            case 4:
                break;
            case 5:
                if (i17 <= 0) {
                    return i15;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i16);
                int iAbs2 = iAbs - (Math.abs(i14) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i15 & 1) != 0))) {
                            return i15;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i15;
                }
            default:
                throw new AssertionError();
        }
        return i15 + i17;
    }
}
