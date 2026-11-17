package pj;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfnezrywwk extends czzsidtyhn {
    protected final void ageimvtcrz() {
        Thread threadWizcaqwiak = wizcaqwiak();
        if (Thread.currentThread() != threadWizcaqwiak) {
            ppxfxbqfkf.iobyxmoadg();
            LockSupport.unpark(threadWizcaqwiak);
        }
    }

    protected void hszhottldk(long j13, uwvvkdfqfp.ppxfxbqfkf ppxfxbqfkfVar) {
        tzroggbefp.f76776pmvmpeiblj.r(j13, ppxfxbqfkfVar);
    }

    protected abstract Thread wizcaqwiak();
}
