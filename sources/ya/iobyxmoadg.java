package ya;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import xa.draadjrbmk;
import za.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final OutputStream f124274iobyxmoadg = new C3142iobyxmoadg();

    /* JADX INFO: renamed from: ya.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C3142iobyxmoadg extends OutputStream {
        C3142iobyxmoadg() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i13) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            draadjrbmk.btonecajqb(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i13, int i14) {
            draadjrbmk.btonecajqb(bArr);
            draadjrbmk.agtfadlqog(i13, i14 + i13, bArr.length);
        }
    }

    private static byte[] iobyxmoadg(Queue queue, int i13) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i13) {
            return bArr;
        }
        int length = i13 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i13 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    private static byte[] ppxfxbqfkf(InputStream inputStream, Queue queue, int i13) throws IOException {
        int iMin = Math.min(8192, Math.max(UserVerificationMethods.USER_VERIFY_PATTERN, Integer.highestOneBit(i13) * 2));
        while (i13 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i13);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i14 = 0;
            while (i14 < iMin2) {
                int i15 = inputStream.read(bArr, i14, iMin2 - i14);
                if (i15 == -1) {
                    return iobyxmoadg(queue, i13);
                }
                i14 += i15;
                i13 += i15;
            }
            iMin = ppxfxbqfkf.ppxfxbqfkf(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return iobyxmoadg(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] zoijcleaow(InputStream inputStream) {
        draadjrbmk.btonecajqb(inputStream);
        return ppxfxbqfkf(inputStream, new ArrayDeque(20), 0);
    }
}
