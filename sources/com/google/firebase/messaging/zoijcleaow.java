package com.google.firebase.messaging;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
abstract class zoijcleaow {
    private static byte[] eablkybsjg(InputStream inputStream, Queue queue, int i13) throws IOException {
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
            iMin = ppxfxbqfkf(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return iobyxmoadg(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
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

    private static int ppxfxbqfkf(long j13) {
        if (j13 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j13 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j13;
    }

    public static byte[] wkgbmnqykc(InputStream inputStream) {
        return eablkybsjg(inputStream, new ArrayDeque(20), 0);
    }

    public static InputStream zoijcleaow(InputStream inputStream, long j13) {
        return new iobyxmoadg(inputStream, j13);
    }

    private static final class iobyxmoadg extends FilterInputStream {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private long f24523yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private long f24524zdlpuopuiu;

        iobyxmoadg(InputStream inputStream, long j13) {
            super(inputStream);
            this.f24523yggfygwlhe = -1L;
            this.f24524zdlpuopuiu = j13;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f24524zdlpuopuiu);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i13) {
            ((FilterInputStream) this).in.mark(i13);
            this.f24523yggfygwlhe = this.f24524zdlpuopuiu;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f24524zdlpuopuiu == 0) {
                return -1;
            }
            int i13 = ((FilterInputStream) this).in.read();
            if (i13 != -1) {
                this.f24524zdlpuopuiu--;
            }
            return i13;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f24523yggfygwlhe == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f24524zdlpuopuiu = this.f24523yggfygwlhe;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j13) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j13, this.f24524zdlpuopuiu));
            this.f24524zdlpuopuiu -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i13, int i14) throws IOException {
            long j13 = this.f24524zdlpuopuiu;
            if (j13 == 0) {
                return -1;
            }
            int i15 = ((FilterInputStream) this).in.read(bArr, i13, (int) Math.min(i14, j13));
            if (i15 != -1) {
                this.f24524zdlpuopuiu -= (long) i15;
            }
            return i15;
        }
    }
}
