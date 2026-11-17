package t3;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wwaezpbzkn {
    public static int btonecajqb(ByteBuffer byteBuffer) {
        return (int) ((wkgbmnqykc(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static int dxjokdxxww(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b13 = byteBuffer.get(26);
        int i13 = 28;
        int i14 = 28;
        for (int i15 = 0; i15 < b13; i15++) {
            i14 += byteBuffer.get(i15 + 27);
        }
        byte b14 = byteBuffer.get(i14 + 26);
        for (int i16 = 0; i16 < b14; i16++) {
            i13 += byteBuffer.get(i14 + 27 + i16);
        }
        return i14 + i13;
    }

    public static long eablkybsjg(byte[] bArr) {
        return wkgbmnqykc(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    private static long gtknphoqwx(long j13) {
        return (j13 * 1000000000) / 48000;
    }

    public static int gxszxtbevo(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static List iobyxmoadg(byte[] bArr) {
        long jGtknphoqwx = gtknphoqwx(gxszxtbevo(bArr));
        long jGtknphoqwx2 = gtknphoqwx(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zoijcleaow(jGtknphoqwx));
        arrayList.add(zoijcleaow(jGtknphoqwx2));
        return arrayList;
    }

    public static boolean lqeggnwhkg(long j13, long j14) {
        return j13 - j14 <= gtknphoqwx(3840L) / 1000;
    }

    public static int nufgyqmvbu(ByteBuffer byteBuffer) {
        int iDxjokdxxww = dxjokdxxww(byteBuffer);
        int i13 = byteBuffer.get(iDxjokdxxww + 26) + 27 + iDxjokdxxww;
        return (int) ((wkgbmnqykc(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int ppxfxbqfkf(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long wkgbmnqykc(byte b13, byte b14) {
        int i13;
        int i14;
        int i15 = b13 & 255;
        int i16 = b13 & 3;
        if (i16 != 0) {
            i13 = 2;
            if (i16 != 1 && i16 != 2) {
                i13 = b14 & 63;
            }
        } else {
            i13 = 1;
        }
        int i17 = i15 >> 3;
        int i18 = i17 & 3;
        if (i17 >= 16) {
            i14 = 2500 << i18;
        } else if (i17 >= 12) {
            i14 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << (i17 & 1);
        } else {
            i14 = i18 == 3 ? 60000 : AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << i18;
        }
        return ((long) i13) * ((long) i14);
    }

    private static byte[] zoijcleaow(long j13) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j13).array();
    }
}
