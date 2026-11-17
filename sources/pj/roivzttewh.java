package pj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class roivzttewh extends igdgnonuha {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76769esjtqupxsv = AtomicIntegerFieldUpdater.newUpdater(roivzttewh.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final tg.draadjrbmk f76770cqumvgiudr;

    public roivzttewh(tg.draadjrbmk draadjrbmkVar) {
        this.f76770cqumvgiudr = draadjrbmkVar;
    }

    @Override // pj.igdgnonuha
    public void iwizpuwonk(Throwable th2) {
        if (f76769esjtqupxsv.compareAndSet(this, 0, 1)) {
            this.f76770cqumvgiudr.invoke(th2);
        }
    }

    @Override // pj.igdgnonuha
    public boolean jyumaefscl() {
        return true;
    }
}
