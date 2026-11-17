package pkzmftpjix;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LargeJpegImageQuirk f76886iobyxmoadg = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.iobyxmoadg.zoijcleaow(LargeJpegImageQuirk.class);

    public static int iobyxmoadg(byte[] bArr) {
        byte b13;
        int i13 = 2;
        while (i13 + 4 <= bArr.length && (b13 = bArr[i13]) == -1) {
            int i14 = i13 + 2;
            int i15 = ((bArr[i14] & 255) << 8) | (bArr[i13 + 3] & 255);
            if (b13 == -1 && bArr[i13 + 1] == -38) {
                while (true) {
                    int i16 = i14 + 2;
                    if (i16 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i14] == -1 && bArr[i14 + 1] == -39) {
                        return i16;
                    }
                    i14++;
                }
            } else {
                i13 += i15 + 2;
            }
        }
        return -1;
    }

    public int zoijcleaow(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f76886iobyxmoadg;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.lqeggnwhkg(bArr)) {
            return bArr.length;
        }
        int iIobyxmoadg = iobyxmoadg(bArr);
        return iIobyxmoadg != -1 ? iIobyxmoadg : bArr.length;
    }
}
