package kb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {
    public static byte[] iobyxmoadg(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    public static byte[] zoijcleaow(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i13 = 0; i13 < 16; i13++) {
            byte b13 = (byte) ((bArr[i13] << 1) & 254);
            bArr2[i13] = b13;
            if (i13 < 15) {
                bArr2[i13] = (byte) (((byte) ((bArr[i13 + 1] >> 7) & 1)) | b13);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
