package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Long f73832eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f73833gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f73834iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f73835ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f73836wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private iobyxmoadg f73837zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private iobyxmoadg f73838iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private p0.tzroggbefp f73839zoijcleaow;

        public iobyxmoadg(iobyxmoadg iobyxmoadgVar, p0.tzroggbefp tzroggbefpVar) {
            this.f73838iobyxmoadg = iobyxmoadgVar;
            this.f73839zoijcleaow = tzroggbefpVar;
        }

        public final iobyxmoadg iobyxmoadg() {
            return this.f73838iobyxmoadg;
        }

        public final void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
            this.f73838iobyxmoadg = iobyxmoadgVar;
        }

        public final void wkgbmnqykc(p0.tzroggbefp tzroggbefpVar) {
            this.f73839zoijcleaow = tzroggbefpVar;
        }

        public final p0.tzroggbefp zoijcleaow() {
            return this.f73839zoijcleaow;
        }
    }

    public n1(int i13) {
        this.f73834iobyxmoadg = i13;
    }

    public static /* synthetic */ void gxszxtbevo(n1 n1Var, p0.tzroggbefp tzroggbefpVar, long j13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j13 = p1.iobyxmoadg();
        }
        n1Var.eablkybsjg(tzroggbefpVar, j13);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private final void wkgbmnqykc() {
        iobyxmoadg iobyxmoadgVarIobyxmoadg;
        iobyxmoadg iobyxmoadgVarIobyxmoadg2 = this.f73837zoijcleaow;
        if ((iobyxmoadgVarIobyxmoadg2 != null ? iobyxmoadgVarIobyxmoadg2.iobyxmoadg() : null) == null) {
            return;
        }
        while (true) {
            if (iobyxmoadgVarIobyxmoadg2 == null) {
                iobyxmoadgVarIobyxmoadg = null;
            } else {
                iobyxmoadg iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVarIobyxmoadg2.iobyxmoadg();
                if (iobyxmoadgVarIobyxmoadg3 != null) {
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg3.iobyxmoadg();
                } else {
                    iobyxmoadgVarIobyxmoadg = null;
                }
            }
            if (iobyxmoadgVarIobyxmoadg == null) {
                break;
            } else {
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVarIobyxmoadg2.iobyxmoadg();
            }
        }
        if (iobyxmoadgVarIobyxmoadg2 != null) {
            iobyxmoadgVarIobyxmoadg2.ppxfxbqfkf(null);
        }
    }

    public final void eablkybsjg(p0.tzroggbefp tzroggbefpVar, long j13) {
        if (!this.f73833gxszxtbevo) {
            Long l13 = this.f73832eablkybsjg;
            if (j13 <= (l13 != null ? l13.longValue() : 0L) + ((long) o1.iobyxmoadg())) {
                return;
            }
        }
        this.f73832eablkybsjg = Long.valueOf(j13);
        zoijcleaow(tzroggbefpVar);
    }

    public final void iobyxmoadg() {
        this.f73833gxszxtbevo = true;
    }

    public final p0.tzroggbefp lqeggnwhkg() {
        iobyxmoadg iobyxmoadgVarIobyxmoadg;
        iobyxmoadg iobyxmoadgVar = this.f73837zoijcleaow;
        if (iobyxmoadgVar == null || (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg()) == null) {
            return null;
        }
        this.f73837zoijcleaow = iobyxmoadgVarIobyxmoadg;
        this.f73836wkgbmnqykc -= iobyxmoadgVar.zoijcleaow().draadjrbmk().length();
        this.f73835ppxfxbqfkf = new iobyxmoadg(this.f73835ppxfxbqfkf, iobyxmoadgVar.zoijcleaow());
        return iobyxmoadgVarIobyxmoadg.zoijcleaow();
    }

    public final p0.tzroggbefp ppxfxbqfkf() {
        iobyxmoadg iobyxmoadgVar = this.f73835ppxfxbqfkf;
        if (iobyxmoadgVar == null) {
            return null;
        }
        this.f73835ppxfxbqfkf = iobyxmoadgVar.iobyxmoadg();
        this.f73837zoijcleaow = new iobyxmoadg(this.f73837zoijcleaow, iobyxmoadgVar.zoijcleaow());
        this.f73836wkgbmnqykc += iobyxmoadgVar.zoijcleaow().draadjrbmk().length();
        return iobyxmoadgVar.zoijcleaow();
    }

    public final void zoijcleaow(p0.tzroggbefp tzroggbefpVar) {
        p0.tzroggbefp tzroggbefpVarZoijcleaow;
        this.f73833gxszxtbevo = false;
        iobyxmoadg iobyxmoadgVar = this.f73837zoijcleaow;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar, iobyxmoadgVar != null ? iobyxmoadgVar.zoijcleaow() : null)) {
            return;
        }
        String strDraadjrbmk = tzroggbefpVar.draadjrbmk();
        iobyxmoadg iobyxmoadgVar2 = this.f73837zoijcleaow;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strDraadjrbmk, (iobyxmoadgVar2 == null || (tzroggbefpVarZoijcleaow = iobyxmoadgVar2.zoijcleaow()) == null) ? null : tzroggbefpVarZoijcleaow.draadjrbmk())) {
            iobyxmoadg iobyxmoadgVar3 = this.f73837zoijcleaow;
            if (iobyxmoadgVar3 != null) {
                iobyxmoadgVar3.wkgbmnqykc(tzroggbefpVar);
                return;
            }
            return;
        }
        this.f73837zoijcleaow = new iobyxmoadg(this.f73837zoijcleaow, tzroggbefpVar);
        this.f73835ppxfxbqfkf = null;
        int length = this.f73836wkgbmnqykc + tzroggbefpVar.draadjrbmk().length();
        this.f73836wkgbmnqykc = length;
        if (length > this.f73834iobyxmoadg) {
            wkgbmnqykc();
        }
    }

    public /* synthetic */ n1(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 100000 : i13);
    }
}
