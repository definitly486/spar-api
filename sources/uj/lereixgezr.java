package uj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pj.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lereixgezr extends zoijcleaow implements mhtqkkgtqm {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f113651iwizpuwonk = AtomicIntegerFieldUpdater.newUpdater(lereixgezr.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final long f113652jyumaefscl;

    public lereixgezr(long j13, lereixgezr lereixgezrVar, int i13) {
        super(lereixgezrVar);
        this.f113652jyumaefscl = j13;
        this.cleanedAndPointers$volatile = i13 << 16;
    }

    @Override // uj.zoijcleaow
    public boolean gtknphoqwx() {
        return f113651iwizpuwonk.get(this) == oxmwwwfdhm() && !draadjrbmk();
    }

    public abstract void kcexrzcfyt(int i13, Throwable th2, lg.btonecajqb btonecajqbVar);

    public abstract int oxmwwwfdhm();

    public final boolean rgvfuqvkyq() {
        return f113651iwizpuwonk.addAndGet(this, -65536) == oxmwwwfdhm() && !draadjrbmk();
    }

    public final boolean yggfygwlhe() {
        int i13;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f113651iwizpuwonk;
        do {
            i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 == oxmwwwfdhm() && !draadjrbmk()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, 65536 + i13));
        return true;
    }

    public final void zdlpuopuiu() {
        if (f113651iwizpuwonk.incrementAndGet(this) == oxmwwwfdhm()) {
            agtfadlqog();
        }
    }
}
