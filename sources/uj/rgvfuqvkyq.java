package uj;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f113667eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113668gxszxtbevo = AtomicReferenceFieldUpdater.newUpdater(rgvfuqvkyq.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f113669lqeggnwhkg = AtomicLongFieldUpdater.newUpdater(rgvfuqvkyq.class, "_state$volatile");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final istkbnxepw f113670nufgyqmvbu = new istkbnxepw("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f113671iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f113672ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f113673wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f113674zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg(long j13) {
            return (j13 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long ppxfxbqfkf(long j13, int i13) {
            return wkgbmnqykc(j13, 1152921503533105152L) | (((long) i13) << 30);
        }

        public final long wkgbmnqykc(long j13, long j14) {
            return j13 & (~j14);
        }

        public final long zoijcleaow(long j13, int i13) {
            return wkgbmnqykc(j13, 1073741823L) | ((long) i13);
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f113675iobyxmoadg;

        public zoijcleaow(int i13) {
            this.f113675iobyxmoadg = i13;
        }
    }

    public rgvfuqvkyq(int i13, boolean z13) {
        this.f113671iobyxmoadg = i13;
        this.f113674zoijcleaow = z13;
        int i14 = i13 - 1;
        this.f113672ppxfxbqfkf = i14;
        this.f113673wkgbmnqykc = new AtomicReferenceArray(i13);
        if (i14 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i13 & i14) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final rgvfuqvkyq agtfadlqog(int i13, int i14) {
        long j13;
        int i15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f113669lqeggnwhkg;
        do {
            j13 = atomicLongFieldUpdater.get(this);
            i15 = (int) (1073741823 & j13);
            if ((1152921504606846976L & j13) != 0) {
                return draadjrbmk();
            }
        } while (!f113669lqeggnwhkg.compareAndSet(this, j13, f113667eablkybsjg.zoijcleaow(j13, i14)));
        gxszxtbevo().set(this.f113672ppxfxbqfkf & i15, null);
        return null;
    }

    private final rgvfuqvkyq eablkybsjg(int i13, Object obj) {
        Object obj2 = gxszxtbevo().get(this.f113672ppxfxbqfkf & i13);
        if (!(obj2 instanceof zoijcleaow) || ((zoijcleaow) obj2).f113675iobyxmoadg != i13) {
            return null;
        }
        gxszxtbevo().set(i13 & this.f113672ppxfxbqfkf, obj);
        return this;
    }

    private final long gtknphoqwx() {
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f113669lqeggnwhkg;
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if ((j13 & 1152921504606846976L) != 0) {
                return j13;
            }
            j14 = j13 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, j14));
        return j14;
    }

    private final /* synthetic */ AtomicReferenceArray gxszxtbevo() {
        return this.f113673wkgbmnqykc;
    }

    private final rgvfuqvkyq ppxfxbqfkf(long j13) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113668gxszxtbevo;
        while (true) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) atomicReferenceFieldUpdater.get(this);
            if (rgvfuqvkyqVar != null) {
                return rgvfuqvkyqVar;
            }
            androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113668gxszxtbevo, this, null, zoijcleaow(j13));
        }
    }

    private final rgvfuqvkyq zoijcleaow(long j13) {
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(this.f113671iobyxmoadg * 2, this.f113674zoijcleaow);
        int i13 = (int) (1073741823 & j13);
        int i14 = (int) ((1152921503533105152L & j13) >> 30);
        while (true) {
            int i15 = this.f113672ppxfxbqfkf;
            if ((i13 & i15) == (i15 & i14)) {
                f113669lqeggnwhkg.set(rgvfuqvkyqVar, f113667eablkybsjg.wkgbmnqykc(j13, 1152921504606846976L));
                return rgvfuqvkyqVar;
            }
            Object zoijcleaowVar = gxszxtbevo().get(this.f113672ppxfxbqfkf & i13);
            if (zoijcleaowVar == null) {
                zoijcleaowVar = new zoijcleaow(i13);
            }
            rgvfuqvkyqVar.gxszxtbevo().set(rgvfuqvkyqVar.f113672ppxfxbqfkf & i13, zoijcleaowVar);
            i13++;
        }
    }

    public final boolean btonecajqb() {
        long j13 = f113669lqeggnwhkg.get(this);
        return ((int) (1073741823 & j13)) == ((int) ((j13 & 1152921503533105152L) >> 30));
    }

    public final rgvfuqvkyq draadjrbmk() {
        return ppxfxbqfkf(gtknphoqwx());
    }

    public final int iobyxmoadg(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f113669lqeggnwhkg;
        while (true) {
            long j13 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j13) != 0) {
                return f113667eablkybsjg.iobyxmoadg(j13);
            }
            int i13 = (int) (1073741823 & j13);
            int i14 = (int) ((1152921503533105152L & j13) >> 30);
            int i15 = this.f113672ppxfxbqfkf;
            if (((i14 + 2) & i15) == (i13 & i15)) {
                return 1;
            }
            if (!this.f113674zoijcleaow && gxszxtbevo().get(i14 & i15) != null) {
                int i16 = this.f113671iobyxmoadg;
                if (i16 < 1024 || ((i14 - i13) & 1073741823) > (i16 >> 1)) {
                    return 1;
                }
            } else if (f113669lqeggnwhkg.compareAndSet(this, j13, f113667eablkybsjg.ppxfxbqfkf(j13, (i14 + 1) & 1073741823))) {
                gxszxtbevo().set(i14 & i15, obj);
                rgvfuqvkyq rgvfuqvkyqVarEablkybsjg = this;
                while ((f113669lqeggnwhkg.get(rgvfuqvkyqVarEablkybsjg) & 1152921504606846976L) != 0 && (rgvfuqvkyqVarEablkybsjg = rgvfuqvkyqVarEablkybsjg.draadjrbmk().eablkybsjg(i14, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final int lqeggnwhkg() {
        long j13 = f113669lqeggnwhkg.get(this);
        return (((int) ((j13 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j13))) & 1073741823;
    }

    public final Object wflxmlrfwp() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f113669lqeggnwhkg;
        while (true) {
            long j13 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j13) != 0) {
                return f113670nufgyqmvbu;
            }
            int i13 = (int) (1073741823 & j13);
            int i14 = this.f113672ppxfxbqfkf;
            if ((((int) ((1152921503533105152L & j13) >> 30)) & i14) == (i14 & i13)) {
                return null;
            }
            Object obj = gxszxtbevo().get(this.f113672ppxfxbqfkf & i13);
            if (obj == null) {
                if (this.f113674zoijcleaow) {
                    return null;
                }
            } else {
                if (obj instanceof zoijcleaow) {
                    return null;
                }
                int i15 = (i13 + 1) & 1073741823;
                if (f113669lqeggnwhkg.compareAndSet(this, j13, f113667eablkybsjg.zoijcleaow(j13, i15))) {
                    gxszxtbevo().set(this.f113672ppxfxbqfkf & i13, null);
                    return obj;
                }
                if (this.f113674zoijcleaow) {
                    rgvfuqvkyq rgvfuqvkyqVarAgtfadlqog = this;
                    do {
                        rgvfuqvkyqVarAgtfadlqog = rgvfuqvkyqVarAgtfadlqog.agtfadlqog(i13, i15);
                    } while (rgvfuqvkyqVarAgtfadlqog != null);
                    return obj;
                }
            }
        }
    }

    public final boolean wkgbmnqykc() {
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f113669lqeggnwhkg;
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if ((j13 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j13) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, j13 | 2305843009213693952L));
        return true;
    }
}
