package ob;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {
    public static final byte[] eablkybsjg(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return wkgbmnqykc(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] gxszxtbevo(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = bArr.length - bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i13 = 0; i13 < bArr2.length; i13++) {
            int i14 = length + i13;
            bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ bArr2[i13]);
        }
        return bArrCopyOf;
    }

    public static byte[] iobyxmoadg(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void ppxfxbqfkf(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i13) {
        if (i13 < 0 || byteBuffer2.remaining() < i13 || byteBuffer3.remaining() < i13 || byteBuffer.remaining() < i13) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] wkgbmnqykc(byte[] bArr, int i13, byte[] bArr2, int i14, int i15) {
        if (i15 < 0 || bArr.length - i15 < i13 || bArr2.length - i15 < i14) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            bArr3[i16] = (byte) (bArr[i16 + i13] ^ bArr2[i16 + i14]);
        }
        return bArr3;
    }

    public static final boolean zoijcleaow(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }
}
