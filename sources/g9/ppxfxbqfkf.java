package g9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf extends FilterInputStream {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f36704yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f36705zdlpuopuiu;

    private ppxfxbqfkf(InputStream inputStream, long j13) {
        super(inputStream);
        this.f36705zdlpuopuiu = j13;
    }

    private int iobyxmoadg(int i13) throws IOException {
        if (i13 >= 0) {
            this.f36704yggfygwlhe += i13;
        } else if (this.f36705zdlpuopuiu - ((long) this.f36704yggfygwlhe) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f36705zdlpuopuiu + ", but read: " + this.f36704yggfygwlhe);
        }
        return i13;
    }

    public static InputStream wkgbmnqykc(InputStream inputStream, long j13) {
        return new ppxfxbqfkf(inputStream, j13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f36705zdlpuopuiu - ((long) this.f36704yggfygwlhe), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i13;
        i13 = super.read();
        iobyxmoadg(i13 >= 0 ? 1 : -1);
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i13, int i14) {
        return iobyxmoadg(super.read(bArr, i13, i14));
    }
}
