package za;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.math.RoundingMode;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final byte[] f129436iobyxmoadg = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final long[] f129440zoijcleaow = {1, 10, 100, 1000, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final long[] f129438ppxfxbqfkf = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final long[] f129439wkgbmnqykc = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final int[] f129434eablkybsjg = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, OrderServiceErrorHandlerImpl.PAYMENT_TOKEN_EXPIRED, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final int[] f129435gxszxtbevo = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final long[][] f129437lqeggnwhkg = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f129441iobyxmoadg;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f129441iobyxmoadg = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f129441iobyxmoadg[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long iobyxmoadg(long j13, long j14) {
        long j15 = j13 + j14;
        eablkybsjg.ppxfxbqfkf(((j13 ^ j14) < 0) | ((j13 ^ j15) >= 0), "checkedAdd", j13, j14);
        return j15;
    }

    public static long ppxfxbqfkf(long j13, long j14) {
        eablkybsjg.eablkybsjg("a", j13);
        eablkybsjg.eablkybsjg("b", j14);
        if (j13 == 0) {
            return j14;
        }
        if (j14 == 0) {
            return j13;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
        long jNumberOfTrailingZeros = j13 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j14);
        long j15 = j14 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j15) {
            long j16 = jNumberOfTrailingZeros - j15;
            long j17 = (j16 >> 63) & j16;
            long j18 = (j16 - j17) - j17;
            j15 += j17;
            jNumberOfTrailingZeros = j18 >> Long.numberOfTrailingZeros(j18);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long wkgbmnqykc(long j13, long j14) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j13) + Long.numberOfLeadingZeros(~j13) + Long.numberOfLeadingZeros(j14) + Long.numberOfLeadingZeros(~j14);
        if (iNumberOfLeadingZeros > 65) {
            return j13 * j14;
        }
        long j15 = ((j13 ^ j14) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j14 == Long.MIN_VALUE) & (j13 < 0))) {
            return j15;
        }
        long j16 = j13 * j14;
        return (j13 == 0 || j16 / j13 == j14) ? j16 : j15;
    }

    public static long zoijcleaow(long j13, long j14, RoundingMode roundingMode) {
        draadjrbmk.btonecajqb(roundingMode);
        long j15 = j13 / j14;
        long j16 = j13 - (j14 * j15);
        if (j16 == 0) {
            return j15;
        }
        int i13 = ((int) ((j13 ^ j14) >> 63)) | 1;
        switch (iobyxmoadg.f129441iobyxmoadg[roundingMode.ordinal()]) {
            case 1:
                eablkybsjg.gxszxtbevo(j16 == 0);
                return j15;
            case 2:
                return j15;
            case 3:
                if (i13 >= 0) {
                    return j15;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return j15;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j16);
                long jAbs2 = jAbs - (Math.abs(j14) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j15) == 0)) {
                        return j15;
                    }
                } else if (jAbs2 <= 0) {
                    return j15;
                }
            default:
                throw new AssertionError();
        }
        return j15 + ((long) i13);
    }
}
