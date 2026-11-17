package androidx.profileinstaller;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc {
    static void agtfadlqog(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static int btonecajqb(InputStream inputStream) {
        return (int) lqeggnwhkg(inputStream, 1);
    }

    static void draadjrbmk(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_NONE];
        while (true) {
            int i13 = inputStream.read(bArr);
            if (i13 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i13);
            }
        }
    }

    static long dxjokdxxww(InputStream inputStream) {
        return lqeggnwhkg(inputStream, 4);
    }

    static byte[] eablkybsjg(InputStream inputStream, int i13, int i14) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i14];
            byte[] bArr2 = new byte[2048];
            int i15 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i15 < i13) {
                int i16 = inputStream.read(bArr2);
                if (i16 < 0) {
                    throw ppxfxbqfkf("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i13 + " bytes");
                }
                inflater.setInput(bArr2, 0, i16);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i14 - iInflate);
                    i15 += i16;
                } catch (DataFormatException e13) {
                    throw ppxfxbqfkf(e13.getMessage());
                }
            }
            if (i15 == i13) {
                if (!inflater.finished()) {
                    throw ppxfxbqfkf("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw ppxfxbqfkf("Didn't read enough bytes during decompression. expected=" + i13 + " actual=" + i15);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    static int gtknphoqwx(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static String gxszxtbevo(InputStream inputStream, int i13) {
        return new String(wkgbmnqykc(inputStream, i13), StandardCharsets.UTF_8);
    }

    static int iobyxmoadg(int i13) {
        return ((i13 + 7) & (-8)) / 8;
    }

    static long lqeggnwhkg(InputStream inputStream, int i13) throws IOException {
        byte[] bArrWkgbmnqykc = wkgbmnqykc(inputStream, i13);
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j13 += ((long) (bArrWkgbmnqykc[i14] & 255)) << (i14 * 8);
        }
        return j13;
    }

    static int nufgyqmvbu(InputStream inputStream) {
        return (int) lqeggnwhkg(inputStream, 2);
    }

    static void ojitshcjhn(OutputStream outputStream, long j13, int i13) throws IOException {
        byte[] bArr = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = (byte) ((j13 >> (i14 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void oxmwwwfdhm(OutputStream outputStream, int i13) throws IOException {
        ojitshcjhn(outputStream, i13, 1);
    }

    static RuntimeException ppxfxbqfkf(String str) {
        return new IllegalStateException(str);
    }

    static void rgvfuqvkyq(OutputStream outputStream, int i13) throws IOException {
        ojitshcjhn(outputStream, i13, 2);
    }

    static void vdvldrhtss(OutputStream outputStream, long j13) throws IOException {
        ojitshcjhn(outputStream, j13, 4);
    }

    static void wflxmlrfwp(OutputStream outputStream, byte[] bArr) throws IOException {
        vdvldrhtss(outputStream, bArr.length);
        byte[] bArrZoijcleaow = zoijcleaow(bArr);
        vdvldrhtss(outputStream, bArrZoijcleaow.length);
        outputStream.write(bArrZoijcleaow);
    }

    static byte[] wkgbmnqykc(InputStream inputStream, int i13) throws IOException {
        byte[] bArr = new byte[i13];
        int i14 = 0;
        while (i14 < i13) {
            int i15 = inputStream.read(bArr, i14, i13 - i14);
            if (i15 < 0) {
                throw ppxfxbqfkf("Not enough bytes to read: " + i13);
            }
            i14 += i15;
        }
        return bArr;
    }

    static byte[] zoijcleaow(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }
}
