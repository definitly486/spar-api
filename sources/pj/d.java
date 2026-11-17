package pj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
final class d extends igdgnonuha {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76681lereixgezr = AtomicIntegerFieldUpdater.newUpdater(d.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Thread f76682cqumvgiudr = Thread.currentThread();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private jztzpxfvev f76683esjtqupxsv;

    private final Void pmvmpeiblj(int i13) {
        throw new IllegalStateException(("Illegal state " + i13).toString());
    }

    public final void esjtqupxsv() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76681lereixgezr;
        while (true) {
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        pmvmpeiblj(i13);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f76681lereixgezr.compareAndSet(this, i13, 1)) {
                jztzpxfvev jztzpxfvevVar = this.f76683esjtqupxsv;
                if (jztzpxfvevVar != null) {
                    jztzpxfvevVar.iobyxmoadg();
                    return;
                }
                return;
            }
        }
    }

    @Override // pj.igdgnonuha
    public void iwizpuwonk(Throwable th2) {
        int i13;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76681lereixgezr;
        do {
            i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 == 1 || i13 == 2 || i13 == 3) {
                    return;
                }
                pmvmpeiblj(i13);
                throw new KotlinNothingValueException();
            }
        } while (!f76681lereixgezr.compareAndSet(this, i13, 2));
        this.f76682cqumvgiudr.interrupt();
        f76681lereixgezr.set(this, 3);
    }

    @Override // pj.igdgnonuha
    public boolean jyumaefscl() {
        return true;
    }

    public final void zynmafqrjb(auzgnhcxok auzgnhcxokVar) {
        int i13;
        this.f76683esjtqupxsv = skhdrjzrfn.wflxmlrfwp(auzgnhcxokVar, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76681lereixgezr;
        do {
            i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 == 2 || i13 == 3) {
                    return;
                }
                pmvmpeiblj(i13);
                throw new KotlinNothingValueException();
            }
        } while (!f76681lereixgezr.compareAndSet(this, i13, 0));
    }
}
