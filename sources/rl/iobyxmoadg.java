package rl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import org.jose4j.lang.UncheckedJoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final byte[] f83021iobyxmoadg = new byte[0];

    public static boolean agtfadlqog(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = f83021iobyxmoadg;
        }
        if (bArr2 == null) {
            bArr2 = f83021iobyxmoadg;
        }
        int iMin = Math.min(bArr.length, bArr2.length);
        int iMax = Math.max(bArr.length, bArr2.length);
        int i13 = 0;
        for (int i14 = 0; i14 < iMin; i14++) {
            i13 |= bArr[i14] ^ bArr2[i14];
        }
        return i13 == 0 && iMin == iMax;
    }

    public static byte[] btonecajqb(int i13) {
        return gtknphoqwx(i13, null);
    }

    public static byte[] draadjrbmk(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            bArr2[(length - 1) - i13] = bArr[i13];
        }
        return bArr2;
    }

    public static byte[] dxjokdxxww(byte[] bArr) {
        return ojitshcjhn(bArr, 0, bArr.length / 2);
    }

    public static int[] eablkybsjg(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            iArr[i13] = nufgyqmvbu(bArr[i13]);
        }
        return iArr;
    }

    public static byte[] gtknphoqwx(int i13, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        byte[] bArr = new byte[i13];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static byte[] gxszxtbevo(int i13) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i13);
        return byteBufferAllocate.array();
    }

    public static int iobyxmoadg(int i13) {
        if (i13 <= 268435455 && i13 >= 0) {
            return i13 * 8;
        }
        throw new UncheckedJoseException("Invalid byte length (" + i13 + ") for converting to bit length");
    }

    public static byte[] lqeggnwhkg(long j13) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j13);
        return byteBufferAllocate.array();
    }

    public static int nufgyqmvbu(byte b13) {
        return b13 >= 0 ? b13 : 256 - (~(b13 - 1));
    }

    public static byte[] ojitshcjhn(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return bArr2;
    }

    public static int ppxfxbqfkf(int i13) {
        return i13 / 8;
    }

    public static String rgvfuqvkyq(byte[] bArr) {
        String strEablkybsjg = new el.zoijcleaow().eablkybsjg(bArr);
        int[] iArrEablkybsjg = eablkybsjg(bArr);
        return Arrays.toString(iArrEablkybsjg) + "(" + iArrEablkybsjg.length + "bytes/" + iobyxmoadg(iArrEablkybsjg.length) + "bits) | base64url encoded: " + strEablkybsjg;
    }

    public static byte[] wflxmlrfwp(byte[] bArr) {
        int length = bArr.length / 2;
        return ojitshcjhn(bArr, length, length);
    }

    public static byte[] wkgbmnqykc(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e13) {
            throw new IllegalStateException("IOEx from ByteArrayOutputStream?!", e13);
        }
    }

    public static int zoijcleaow(byte[] bArr) {
        return iobyxmoadg(bArr.length);
    }
}
