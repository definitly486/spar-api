package x6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class dxjokdxxww extends InputStream {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f121207yggfygwlhe = 1073741824;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final InputStream f121208zdlpuopuiu;

    public dxjokdxxww(InputStream inputStream) {
        this.f121208zdlpuopuiu = inputStream;
    }

    private final int iobyxmoadg(int i13) {
        if (i13 == -1) {
            this.f121207yggfygwlhe = 0;
        }
        return i13;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f121207yggfygwlhe;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f121208zdlpuopuiu.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return iobyxmoadg(this.f121208zdlpuopuiu.read());
    }

    @Override // java.io.InputStream
    public long skip(long j13) {
        return this.f121208zdlpuopuiu.skip(j13);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return iobyxmoadg(this.f121208zdlpuopuiu.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) {
        return iobyxmoadg(this.f121208zdlpuopuiu.read(bArr, i13, i14));
    }
}
