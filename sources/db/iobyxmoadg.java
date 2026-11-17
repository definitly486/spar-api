package db;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f27371iobyxmoadg = eablkybsjg(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static int[] eablkybsjg(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    static void iobyxmoadg(int[] iArr, int i13, int i14, int i15, int i16) {
        int i17 = iArr[i13] + iArr[i14];
        iArr[i13] = i17;
        int iZoijcleaow = zoijcleaow(i17 ^ iArr[i16], 16);
        iArr[i16] = iZoijcleaow;
        int i18 = iArr[i15] + iZoijcleaow;
        iArr[i15] = i18;
        int iZoijcleaow2 = zoijcleaow(iArr[i14] ^ i18, 12);
        iArr[i14] = iZoijcleaow2;
        int i19 = iArr[i13] + iZoijcleaow2;
        iArr[i13] = i19;
        int iZoijcleaow3 = zoijcleaow(iArr[i16] ^ i19, 8);
        iArr[i16] = iZoijcleaow3;
        int i23 = iArr[i15] + iZoijcleaow3;
        iArr[i15] = i23;
        iArr[i14] = zoijcleaow(iArr[i14] ^ i23, 7);
    }

    static void ppxfxbqfkf(int[] iArr, int[] iArr2) {
        int[] iArr3 = f27371iobyxmoadg;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void wkgbmnqykc(int[] iArr) {
        for (int i13 = 0; i13 < 10; i13++) {
            iobyxmoadg(iArr, 0, 4, 8, 12);
            iobyxmoadg(iArr, 1, 5, 9, 13);
            iobyxmoadg(iArr, 2, 6, 10, 14);
            iobyxmoadg(iArr, 3, 7, 11, 15);
            iobyxmoadg(iArr, 0, 5, 10, 15);
            iobyxmoadg(iArr, 1, 6, 11, 12);
            iobyxmoadg(iArr, 2, 7, 8, 13);
            iobyxmoadg(iArr, 3, 4, 9, 14);
        }
    }

    private static int zoijcleaow(int i13, int i14) {
        return (i13 >>> (-i14)) | (i13 << i14);
    }
}
