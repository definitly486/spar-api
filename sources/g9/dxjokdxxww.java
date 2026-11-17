package g9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww extends FilterInputStream {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f36686zdlpuopuiu;

    public dxjokdxxww(InputStream inputStream) {
        super(inputStream);
        this.f36686zdlpuopuiu = Integer.MIN_VALUE;
    }

    private long iobyxmoadg(long j13) {
        int i13 = this.f36686zdlpuopuiu;
        if (i13 == 0) {
            return -1L;
        }
        return (i13 == Integer.MIN_VALUE || j13 <= ((long) i13)) ? j13 : i13;
    }

    private void wkgbmnqykc(long j13) {
        int i13 = this.f36686zdlpuopuiu;
        if (i13 == Integer.MIN_VALUE || j13 == -1) {
            return;
        }
        this.f36686zdlpuopuiu = (int) (((long) i13) - j13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i13 = this.f36686zdlpuopuiu;
        return i13 == Integer.MIN_VALUE ? super.available() : Math.min(i13, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i13) {
        super.mark(i13);
        this.f36686zdlpuopuiu = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (iobyxmoadg(1L) == -1) {
            return -1;
        }
        int i13 = super.read();
        wkgbmnqykc(1L);
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f36686zdlpuopuiu = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j13) throws IOException {
        long jIobyxmoadg = iobyxmoadg(j13);
        if (jIobyxmoadg == -1) {
            return 0L;
        }
        long jSkip = super.skip(jIobyxmoadg);
        wkgbmnqykc(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) throws IOException {
        int iIobyxmoadg = (int) iobyxmoadg(i14);
        if (iIobyxmoadg == -1) {
            return -1;
        }
        int i15 = super.read(bArr, i13, iIobyxmoadg);
        wkgbmnqykc(i15);
        return i15;
    }
}
