package wj;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.hkdspvbjdz;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReferenceArray f119930iobyxmoadg = new AtomicReferenceArray(UserVerificationMethods.USER_VERIFY_PATTERN);
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f119929zoijcleaow = AtomicReferenceFieldUpdater.newUpdater(draadjrbmk.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f119927ppxfxbqfkf = AtomicIntegerFieldUpdater.newUpdater(draadjrbmk.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f119928wkgbmnqykc = AtomicIntegerFieldUpdater.newUpdater(draadjrbmk.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f119926eablkybsjg = AtomicIntegerFieldUpdater.newUpdater(draadjrbmk.class, "blockingTasksInBuffer$volatile");

    private final boolean agtfadlqog(wkgbmnqykc wkgbmnqykcVar) {
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = wflxmlrfwp();
        if (nufgyqmvbuVarWflxmlrfwp == null) {
            return false;
        }
        wkgbmnqykcVar.iobyxmoadg(nufgyqmvbuVarWflxmlrfwp);
        return true;
    }

    private final int eablkybsjg() {
        return f119927ppxfxbqfkf.get(this) - f119928wkgbmnqykc.get(this);
    }

    private final long kcexrzcfyt(int i13, hkdspvbjdz hkdspvbjdzVar) {
        nufgyqmvbu nufgyqmvbuVar;
        do {
            nufgyqmvbuVar = (nufgyqmvbu) f119929zoijcleaow.get(this);
            if (nufgyqmvbuVar == null) {
                return -2L;
            }
            if (((nufgyqmvbuVar.f119968yggfygwlhe ? 1 : 2) & i13) == 0) {
                return -2L;
            }
            long jIobyxmoadg = btonecajqb.f119921gxszxtbevo.iobyxmoadg() - nufgyqmvbuVar.f119969zdlpuopuiu;
            long j13 = btonecajqb.f119925zoijcleaow;
            if (jIobyxmoadg < j13) {
                return j13 - jIobyxmoadg;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f119929zoijcleaow, this, nufgyqmvbuVar, null));
        hkdspvbjdzVar.f60015zdlpuopuiu = nufgyqmvbuVar;
        return -1L;
    }

    private final nufgyqmvbu ojitshcjhn(boolean z13) {
        nufgyqmvbu nufgyqmvbuVar;
        do {
            nufgyqmvbuVar = (nufgyqmvbu) f119929zoijcleaow.get(this);
            if (nufgyqmvbuVar == null || nufgyqmvbuVar.f119968yggfygwlhe != z13) {
                int i13 = f119928wkgbmnqykc.get(this);
                int i14 = f119927ppxfxbqfkf.get(this);
                while (i13 != i14) {
                    if (z13 && f119926eablkybsjg.get(this) == 0) {
                        return null;
                    }
                    i14--;
                    nufgyqmvbu nufgyqmvbuVarVdvldrhtss = vdvldrhtss(i14, z13);
                    if (nufgyqmvbuVarVdvldrhtss != null) {
                        return nufgyqmvbuVarVdvldrhtss;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f119929zoijcleaow, this, nufgyqmvbuVar, null));
        return nufgyqmvbuVar;
    }

    private final void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null || !nufgyqmvbuVar.f119968yggfygwlhe) {
            return;
        }
        f119926eablkybsjg.decrementAndGet(this);
    }

    private final nufgyqmvbu rgvfuqvkyq(int i13) {
        int i14 = f119928wkgbmnqykc.get(this);
        int i15 = f119927ppxfxbqfkf.get(this);
        boolean z13 = i13 == 1;
        while (i14 != i15) {
            if (z13 && f119926eablkybsjg.get(this) == 0) {
                return null;
            }
            int i16 = i14 + 1;
            nufgyqmvbu nufgyqmvbuVarVdvldrhtss = vdvldrhtss(i14, z13);
            if (nufgyqmvbuVarVdvldrhtss != null) {
                return nufgyqmvbuVarVdvldrhtss;
            }
            i14 = i16;
        }
        return null;
    }

    private final nufgyqmvbu vdvldrhtss(int i13, boolean z13) {
        int i14 = i13 & 127;
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f119930iobyxmoadg.get(i14);
        if (nufgyqmvbuVar == null || nufgyqmvbuVar.f119968yggfygwlhe != z13 || !rj.draadjrbmk.iobyxmoadg(this.f119930iobyxmoadg, i14, nufgyqmvbuVar, null)) {
            return null;
        }
        if (z13) {
            f119926eablkybsjg.decrementAndGet(this);
        }
        return nufgyqmvbuVar;
    }

    private final nufgyqmvbu wflxmlrfwp() {
        nufgyqmvbu nufgyqmvbuVar;
        while (true) {
            int i13 = f119928wkgbmnqykc.get(this);
            if (i13 - f119927ppxfxbqfkf.get(this) == 0) {
                return null;
            }
            int i14 = i13 & 127;
            if (f119928wkgbmnqykc.compareAndSet(this, i13, i13 + 1) && (nufgyqmvbuVar = (nufgyqmvbu) this.f119930iobyxmoadg.getAndSet(i14, null)) != null) {
                ppxfxbqfkf(nufgyqmvbuVar);
                return nufgyqmvbuVar;
            }
        }
    }

    private final nufgyqmvbu zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
        if (eablkybsjg() == 127) {
            return nufgyqmvbuVar;
        }
        if (nufgyqmvbuVar.f119968yggfygwlhe) {
            f119926eablkybsjg.incrementAndGet(this);
        }
        int i13 = f119927ppxfxbqfkf.get(this) & 127;
        while (this.f119930iobyxmoadg.get(i13) != null) {
            Thread.yield();
        }
        this.f119930iobyxmoadg.lazySet(i13, nufgyqmvbuVar);
        f119927ppxfxbqfkf.incrementAndGet(this);
        return null;
    }

    public final void btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) f119929zoijcleaow.getAndSet(this, null);
        if (nufgyqmvbuVar != null) {
            wkgbmnqykcVar.iobyxmoadg(nufgyqmvbuVar);
        }
        while (agtfadlqog(wkgbmnqykcVar)) {
        }
    }

    public final nufgyqmvbu draadjrbmk() {
        return ojitshcjhn(true);
    }

    public final int dxjokdxxww() {
        return f119929zoijcleaow.get(this) != null ? eablkybsjg() + 1 : eablkybsjg();
    }

    public final nufgyqmvbu gtknphoqwx() {
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) f119929zoijcleaow.getAndSet(this, null);
        return nufgyqmvbuVar == null ? wflxmlrfwp() : nufgyqmvbuVar;
    }

    public final nufgyqmvbu iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, boolean z13) {
        if (z13) {
            return zoijcleaow(nufgyqmvbuVar);
        }
        nufgyqmvbu nufgyqmvbuVar2 = (nufgyqmvbu) f119929zoijcleaow.getAndSet(this, nufgyqmvbuVar);
        if (nufgyqmvbuVar2 == null) {
            return null;
        }
        return zoijcleaow(nufgyqmvbuVar2);
    }

    public final long oxmwwwfdhm(int i13, hkdspvbjdz hkdspvbjdzVar) {
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = i13 == 3 ? wflxmlrfwp() : rgvfuqvkyq(i13);
        if (nufgyqmvbuVarWflxmlrfwp == null) {
            return kcexrzcfyt(i13, hkdspvbjdzVar);
        }
        hkdspvbjdzVar.f60015zdlpuopuiu = nufgyqmvbuVarWflxmlrfwp;
        return -1L;
    }
}
