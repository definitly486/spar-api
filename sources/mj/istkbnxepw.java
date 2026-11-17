package mj;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class istkbnxepw extends zynmafqrjb {
    public static Long kcexrzcfyt(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return zdlpuopuiu(str, 10);
    }

    public static final Integer oxmwwwfdhm(String str, int i13) {
        boolean z13;
        int i14;
        int i15;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        iobyxmoadg.iobyxmoadg(i13);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i16 = 0;
        char cCharAt = str.charAt(0);
        int i17 = -2147483647;
        if (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z13 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i17 = Integer.MIN_VALUE;
                z13 = true;
            }
        } else {
            z13 = false;
            i14 = 0;
        }
        int i18 = -59652323;
        while (i14 < length) {
            int iZoijcleaow = zoijcleaow.zoijcleaow(str.charAt(i14), i13);
            if (iZoijcleaow < 0) {
                return null;
            }
            if ((i16 < i18 && (i18 != -59652323 || i16 < (i18 = i17 / i13))) || (i15 = i16 * i13) < i17 + iZoijcleaow) {
                return null;
            }
            i16 = i15 - iZoijcleaow;
            i14++;
        }
        return z13 ? Integer.valueOf(i16) : Integer.valueOf(-i16);
    }

    public static final Void rgvfuqvkyq(String input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer vdvldrhtss(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return oxmwwwfdhm(str, 10);
    }

    public static final Long zdlpuopuiu(String str, int i13) {
        boolean z13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        iobyxmoadg.iobyxmoadg(i13);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char cCharAt = str.charAt(0);
        long j13 = -9223372036854775807L;
        if (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 48) < 0) {
            z13 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z13 = false;
                i14 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j13 = Long.MIN_VALUE;
                i14 = 1;
            }
        } else {
            z13 = false;
        }
        long j14 = -256204778801521550L;
        long j15 = 0;
        long j16 = -256204778801521550L;
        while (i14 < length) {
            int iZoijcleaow = zoijcleaow.zoijcleaow(str.charAt(i14), i13);
            if (iZoijcleaow < 0) {
                return null;
            }
            if (j15 < j16) {
                if (j16 == j14) {
                    j16 = j13 / ((long) i13);
                    if (j15 < j16) {
                    }
                }
                return null;
            }
            long j17 = j15 * ((long) i13);
            long j18 = iZoijcleaow;
            if (j17 < j13 + j18) {
                return null;
            }
            j15 = j17 - j18;
            i14++;
            j14 = -256204778801521550L;
        }
        return z13 ? Long.valueOf(j15) : Long.valueOf(-j15);
    }
}
