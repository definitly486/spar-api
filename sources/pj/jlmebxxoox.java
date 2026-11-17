package pj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class jlmebxxoox extends uj.esjtqupxsv {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76728cqumvgiudr = AtomicIntegerFieldUpdater.newUpdater(jlmebxxoox.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public jlmebxxoox(lg.btonecajqb btonecajqbVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(btonecajqbVar, gxszxtbevoVar);
    }

    private final boolean d() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76728cqumvgiudr;
        do {
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f76728cqumvgiudr.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean e() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76728cqumvgiudr;
        do {
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f76728cqumvgiudr.compareAndSet(this, 0, 1));
        return true;
    }

    public final Object b() {
        if (e()) {
            return mg.zoijcleaow.gxszxtbevo();
        }
        Object objNufgyqmvbu = wizcaqwiak.nufgyqmvbu(yfnezrywwk());
        if (objNufgyqmvbu instanceof istkbnxepw) {
            throw ((istkbnxepw) objNufgyqmvbu).f76725iobyxmoadg;
        }
        return objNufgyqmvbu;
    }

    @Override // uj.esjtqupxsv, pj.lxfrhoxuzk
    protected void yadqdtsiqt(Object obj) {
        yzdjzghtvl(obj);
    }

    @Override // uj.esjtqupxsv, pj.iobyxmoadg
    protected void yzdjzghtvl(Object obj) {
        if (d()) {
            return;
        }
        uj.nufgyqmvbu.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(this.f113643iwizpuwonk), cdpycssgdh.iobyxmoadg(obj, this.f113643iwizpuwonk));
    }
}
