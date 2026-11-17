package g9;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc extends InputStream {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final Queue f36706jyumaefscl = draadjrbmk.gxszxtbevo(0);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private IOException f36707yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private InputStream f36708zdlpuopuiu;

    wkgbmnqykc() {
    }

    public static wkgbmnqykc wkgbmnqykc(InputStream inputStream) {
        wkgbmnqykc wkgbmnqykcVar;
        Queue queue = f36706jyumaefscl;
        synchronized (queue) {
            wkgbmnqykcVar = (wkgbmnqykc) queue.poll();
        }
        if (wkgbmnqykcVar == null) {
            wkgbmnqykcVar = new wkgbmnqykc();
        }
        wkgbmnqykcVar.lqeggnwhkg(inputStream);
        return wkgbmnqykcVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f36708zdlpuopuiu.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36708zdlpuopuiu.close();
    }

    public IOException iobyxmoadg() {
        return this.f36707yggfygwlhe;
    }

    void lqeggnwhkg(InputStream inputStream) {
        this.f36708zdlpuopuiu = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i13) {
        this.f36708zdlpuopuiu.mark(i13);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f36708zdlpuopuiu.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f36708zdlpuopuiu.read();
        } catch (IOException e13) {
            this.f36707yggfygwlhe = e13;
            throw e13;
        }
    }

    public void release() {
        this.f36707yggfygwlhe = null;
        this.f36708zdlpuopuiu = null;
        Queue queue = f36706jyumaefscl;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f36708zdlpuopuiu.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j13) throws IOException {
        try {
            return this.f36708zdlpuopuiu.skip(j13);
        } catch (IOException e13) {
            this.f36707yggfygwlhe = e13;
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f36708zdlpuopuiu.read(bArr);
        } catch (IOException e13) {
            this.f36707yggfygwlhe = e13;
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) throws IOException {
        try {
            return this.f36708zdlpuopuiu.read(bArr, i13, i14);
        } catch (IOException e13) {
            this.f36707yggfygwlhe = e13;
            throw e13;
        }
    }
}
