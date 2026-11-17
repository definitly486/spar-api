package pj;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
final class lqeggnwhkg extends iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final czzsidtyhn f76734cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Thread f76735iwizpuwonk;

    public lqeggnwhkg(lg.btonecajqb btonecajqbVar, Thread thread, czzsidtyhn czzsidtyhnVar) {
        super(btonecajqbVar, true, true);
        this.f76735iwizpuwonk = thread;
        this.f76734cqumvgiudr = czzsidtyhnVar;
    }

    public final Object b() throws Throwable {
        ppxfxbqfkf.iobyxmoadg();
        try {
            czzsidtyhn czzsidtyhnVar = this.f76734cqumvgiudr;
            if (czzsidtyhnVar != null) {
                czzsidtyhn.iyctptxqzt(czzsidtyhnVar, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    czzsidtyhn czzsidtyhnVar2 = this.f76734cqumvgiudr;
                    long jTbqsvytpvh = czzsidtyhnVar2 != null ? czzsidtyhnVar2.tbqsvytpvh() : Long.MAX_VALUE;
                    if (agtfadlqog()) {
                        czzsidtyhn czzsidtyhnVar3 = this.f76734cqumvgiudr;
                        if (czzsidtyhnVar3 != null) {
                            czzsidtyhn.rlfsiqarku(czzsidtyhnVar3, false, 1, null);
                        }
                        ppxfxbqfkf.iobyxmoadg();
                        Object objNufgyqmvbu = wizcaqwiak.nufgyqmvbu(yfnezrywwk());
                        istkbnxepw istkbnxepwVar = objNufgyqmvbu instanceof istkbnxepw ? (istkbnxepw) objNufgyqmvbu : null;
                        if (istkbnxepwVar == null) {
                            return objNufgyqmvbu;
                        }
                        throw istkbnxepwVar.f76725iobyxmoadg;
                    }
                    ppxfxbqfkf.iobyxmoadg();
                    LockSupport.parkNanos(this, jTbqsvytpvh);
                } catch (Throwable th2) {
                    czzsidtyhn czzsidtyhnVar4 = this.f76734cqumvgiudr;
                    if (czzsidtyhnVar4 != null) {
                        czzsidtyhn.rlfsiqarku(czzsidtyhnVar4, false, 1, null);
                    }
                    throw th2;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            pkzmftpjix(interruptedException);
            throw interruptedException;
        } catch (Throwable th3) {
            ppxfxbqfkf.iobyxmoadg();
            throw th3;
        }
    }

    @Override // pj.lxfrhoxuzk
    protected boolean iyctptxqzt() {
        return true;
    }

    @Override // pj.lxfrhoxuzk
    protected void yadqdtsiqt(Object obj) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Thread.currentThread(), this.f76735iwizpuwonk)) {
            return;
        }
        Thread thread = this.f76735iwizpuwonk;
        ppxfxbqfkf.iobyxmoadg();
        LockSupport.unpark(thread);
    }
}
