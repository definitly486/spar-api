package androidx.media3.datasource.cache;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg extends BufferedOutputStream {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f9957zdlpuopuiu;

    public lqeggnwhkg(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f9957zdlpuopuiu = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            stevsuqkhv.i(th);
        }
    }

    public void iobyxmoadg(OutputStream outputStream) {
        y2.iobyxmoadg.lqeggnwhkg(this.f9957zdlpuopuiu);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f9957zdlpuopuiu = false;
    }

    public lqeggnwhkg(OutputStream outputStream, int i13) {
        super(outputStream, i13);
    }
}
