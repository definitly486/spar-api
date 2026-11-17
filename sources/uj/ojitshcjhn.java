package uj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113660iobyxmoadg = AtomicReferenceFieldUpdater.newUpdater(ojitshcjhn.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public ojitshcjhn(boolean z13) {
        this._cur$volatile = new rgvfuqvkyq(8, z13);
    }

    public final Object eablkybsjg() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113660iobyxmoadg;
        while (true) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) atomicReferenceFieldUpdater.get(this);
            Object objWflxmlrfwp = rgvfuqvkyqVar.wflxmlrfwp();
            if (objWflxmlrfwp != rgvfuqvkyq.f113670nufgyqmvbu) {
                return objWflxmlrfwp;
            }
            androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113660iobyxmoadg, this, rgvfuqvkyqVar, rgvfuqvkyqVar.draadjrbmk());
        }
    }

    public final boolean iobyxmoadg(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113660iobyxmoadg;
        while (true) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) atomicReferenceFieldUpdater.get(this);
            int iIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg(obj);
            if (iIobyxmoadg == 0) {
                return true;
            }
            if (iIobyxmoadg == 1) {
                androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113660iobyxmoadg, this, rgvfuqvkyqVar, rgvfuqvkyqVar.draadjrbmk());
            } else if (iIobyxmoadg == 2) {
                return false;
            }
        }
    }

    public final int ppxfxbqfkf() {
        return ((rgvfuqvkyq) f113660iobyxmoadg.get(this)).lqeggnwhkg();
    }

    public final void zoijcleaow() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113660iobyxmoadg;
        while (true) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) atomicReferenceFieldUpdater.get(this);
            if (rgvfuqvkyqVar.wkgbmnqykc()) {
                return;
            } else {
                androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113660iobyxmoadg, this, rgvfuqvkyqVar, rgvfuqvkyqVar.draadjrbmk());
            }
        }
    }
}
