package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vipkmwdibw.gtknphoqwx f42626iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f42627ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f42628zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f42625wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f42624eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b1 eablkybsjg(w0.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, vipkmwdibw.gtknphoqwx gtknphoqwxVar, boolean z13, c1 c1Var) {
            return new b1(c1Var, wkgbmnqykcVar, draadjrbmkVar, gtknphoqwxVar, z13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c1 wkgbmnqykc(rhgxfdycjh.lereixgezr lereixgezrVar, b1 b1Var) {
            return b1Var.dxjokdxxww();
        }

        public final rhgxfdycjh.jyumaefscl ppxfxbqfkf(final vipkmwdibw.gtknphoqwx gtknphoqwxVar, final tg.draadjrbmk draadjrbmkVar, final boolean z13, final w0.wkgbmnqykc wkgbmnqykcVar) {
            return rhgxfdycjh.esjtqupxsv.eablkybsjg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.z0
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return b1.iobyxmoadg.wkgbmnqykc((rhgxfdycjh.lereixgezr) obj, (b1) obj2);
                }
            }, new tg.draadjrbmk() { // from class: igdgnonuha.a1
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return b1.iobyxmoadg.eablkybsjg(wkgbmnqykcVar, draadjrbmkVar, gtknphoqwxVar, z13, (c1) obj);
                }
            });
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42629iobyxmoadg;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f42629iobyxmoadg = iArr;
        }
    }

    public b1(c1 c1Var, final w0.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, vipkmwdibw.gtknphoqwx gtknphoqwxVar, boolean z13) {
        this.f42626iobyxmoadg = gtknphoqwxVar;
        this.f42628zoijcleaow = z13;
        this.f42627ppxfxbqfkf = new lqeggnwhkg(c1Var, new tg.draadjrbmk() { // from class: igdgnonuha.x0
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Float.valueOf(b1.ppxfxbqfkf(wkgbmnqykcVar, ((Float) obj).floatValue()));
            }
        }, new tg.iobyxmoadg() { // from class: igdgnonuha.y0
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(b1.wkgbmnqykc(wkgbmnqykcVar));
            }
        }, gtknphoqwxVar, draadjrbmkVar);
        if (z13 && c1Var == c1.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object gxszxtbevo(b1 b1Var, c1 c1Var, float f13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = b1Var.f42627ppxfxbqfkf.esjtqupxsv();
        }
        return b1Var.eablkybsjg(c1Var, f13, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, float f13) {
        return wkgbmnqykcVar.I(v0.f43943iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.I(v0.f43945zoijcleaow);
    }

    public final boolean agtfadlqog() {
        return this.f42628zoijcleaow;
    }

    public final boolean btonecajqb() {
        return this.f42627ppxfxbqfkf.oxmwwwfdhm().ppxfxbqfkf(c1.HalfExpanded);
    }

    public final Object draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo;
        return (btonecajqb() && (objGxszxtbevo = gxszxtbevo(this, c1.HalfExpanded, 0.0f, gxszxtbevoVar, 2, null)) == mg.zoijcleaow.gxszxtbevo()) ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final c1 dxjokdxxww() {
        return (c1) this.f42627ppxfxbqfkf.jyumaefscl();
    }

    public final Object eablkybsjg(c1 c1Var, float f13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = androidx.compose.material.iobyxmoadg.gxszxtbevo(this.f42627ppxfxbqfkf, c1Var, f13, gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final c1 gtknphoqwx() {
        return (c1) this.f42627ppxfxbqfkf.pmvmpeiblj();
    }

    public final Object lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo;
        lrnfpwlwnk lrnfpwlwnkVarOxmwwwfdhm = this.f42627ppxfxbqfkf.oxmwwwfdhm();
        c1 c1Var = c1.Expanded;
        return (lrnfpwlwnkVarOxmwwwfdhm.ppxfxbqfkf(c1Var) && (objGxszxtbevo = gxszxtbevo(this, c1Var, 0.0f, gxszxtbevoVar, 2, null)) == mg.zoijcleaow.gxszxtbevo()) ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final lqeggnwhkg nufgyqmvbu() {
        return this.f42627ppxfxbqfkf;
    }

    public final boolean ojitshcjhn() {
        return this.f42627ppxfxbqfkf.jyumaefscl() != c1.Hidden;
    }

    public final Object rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
        lrnfpwlwnk lrnfpwlwnkVarOxmwwwfdhm = this.f42627ppxfxbqfkf.oxmwwwfdhm();
        c1 c1Var = c1.Expanded;
        boolean zPpxfxbqfkf = lrnfpwlwnkVarOxmwwwfdhm.ppxfxbqfkf(c1Var);
        if (zoijcleaow.f42629iobyxmoadg[dxjokdxxww().ordinal()] == 1) {
            if (btonecajqb()) {
                c1Var = c1.HalfExpanded;
            }
        } else if (!zPpxfxbqfkf) {
            c1Var = c1.Hidden;
        }
        Object objGxszxtbevo = gxszxtbevo(this, c1Var, 0.0f, gxszxtbevoVar, 2, null);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = gxszxtbevo(this, c1.Hidden, 0.0f, gxszxtbevoVar, 2, null);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
