package com.google.common.primitives;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final byte[] f23774iobyxmoadg;

        static {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
            Arrays.fill(bArr, (byte) -1);
            for (int i13 = 0; i13 < 10; i13++) {
                bArr[i13 + 48] = (byte) i13;
            }
            for (int i14 = 0; i14 < 26; i14++) {
                byte b13 = (byte) (i14 + 10);
                bArr[i14 + 65] = b13;
                bArr[i14 + 97] = b13;
            }
            f23774iobyxmoadg = bArr;
        }

        static int iobyxmoadg(char c13) {
            if (c13 < 128) {
                return f23774iobyxmoadg[c13];
            }
            return -1;
        }
    }

    public static int iobyxmoadg(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }

    public static Long ppxfxbqfkf(String str, int i13) {
        if (((String) draadjrbmk.btonecajqb(str)).isEmpty()) {
            return null;
        }
        if (i13 < 2 || i13 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i13);
        }
        int i14 = str.charAt(0) == '-' ? 1 : 0;
        if (i14 == str.length()) {
            return null;
        }
        int i15 = i14 + 1;
        int iIobyxmoadg = iobyxmoadg.iobyxmoadg(str.charAt(i14));
        if (iIobyxmoadg < 0 || iIobyxmoadg >= i13) {
            return null;
        }
        long j13 = -iIobyxmoadg;
        long j14 = i13;
        long j15 = Long.MIN_VALUE / j14;
        while (i15 < str.length()) {
            int i16 = i15 + 1;
            int iIobyxmoadg2 = iobyxmoadg.iobyxmoadg(str.charAt(i15));
            if (iIobyxmoadg2 < 0 || iIobyxmoadg2 >= i13 || j13 < j15) {
                return null;
            }
            long j16 = j13 * j14;
            long j17 = iIobyxmoadg2;
            if (j16 < j17 - Long.MIN_VALUE) {
                return null;
            }
            j13 = j16 - j17;
            i15 = i16;
        }
        if (i14 != 0) {
            return Long.valueOf(j13);
        }
        if (j13 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j13);
    }

    public static long zoijcleaow(long... jArr) {
        draadjrbmk.wkgbmnqykc(jArr.length > 0);
        long j13 = jArr[0];
        for (int i13 = 1; i13 < jArr.length; i13++) {
            long j14 = jArr[i13];
            if (j14 > j13) {
                j13 = j14;
            }
        }
        return j13;
    }
}
