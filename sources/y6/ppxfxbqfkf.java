package y6;

import bl.gtknphoqwx;
import bl.iozdgvuglv;
import java.io.EOFException;
import java.io.IOException;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf extends gtknphoqwx {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f123952jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final draadjrbmk f123953yggfygwlhe;

    public ppxfxbqfkf(iozdgvuglv iozdgvuglvVar, draadjrbmk draadjrbmkVar) {
        super(iozdgvuglvVar);
        this.f123953yggfygwlhe = draadjrbmkVar;
    }

    @Override // bl.gtknphoqwx, bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e13) {
            this.f123952jyumaefscl = true;
            this.f123953yggfygwlhe.invoke(e13);
        }
    }

    @Override // bl.gtknphoqwx, bl.iozdgvuglv, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e13) {
            this.f123952jyumaefscl = true;
            this.f123953yggfygwlhe.invoke(e13);
        }
    }

    @Override // bl.gtknphoqwx, bl.iozdgvuglv
    public void zeieaojujs(bl.ppxfxbqfkf ppxfxbqfkfVar, long j13) throws EOFException {
        if (this.f123952jyumaefscl) {
            ppxfxbqfkfVar.wflxmlrfwp(j13);
            return;
        }
        try {
            super.zeieaojujs(ppxfxbqfkfVar, j13);
        } catch (IOException e13) {
            this.f123952jyumaefscl = true;
            this.f123953yggfygwlhe.invoke(e13);
        }
    }
}
