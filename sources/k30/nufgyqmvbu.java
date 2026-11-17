package k30;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gg.gtknphoqwx f53683eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gg.gtknphoqwx f53684gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d60.iobyxmoadg f53685iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f53686ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f53687wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gg.gtknphoqwx f53688zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f53689iobyxmoadg;

        static {
            int[] iArr = new int[x30.iobyxmoadg.values().length];
            try {
                iArr[x30.iobyxmoadg.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x30.iobyxmoadg.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x30.iobyxmoadg.AMOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53689iobyxmoadg = iArr;
        }
    }

    public nufgyqmvbu(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f53685iobyxmoadg = resourcesManager;
        this.f53688zoijcleaow = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: k30.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.ojitshcjhn(this.f53690zdlpuopuiu);
            }
        });
        this.f53686ppxfxbqfkf = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: k30.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f53730zdlpuopuiu);
            }
        });
        this.f53687wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: k30.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.gxszxtbevo(this.f53675zdlpuopuiu);
            }
        });
        this.f53683eablkybsjg = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: k30.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.lqeggnwhkg(this.f53680zdlpuopuiu);
            }
        });
        this.f53684gxszxtbevo = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: k30.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.oxmwwwfdhm(this.f53682zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f53685iobyxmoadg.getString(h00.ppxfxbqfkf.measure_per_100_value);
    }

    private final String btonecajqb() {
        return (String) this.f53686ppxfxbqfkf.getValue();
    }

    private final String dxjokdxxww() {
        return (String) this.f53683eablkybsjg.getValue();
    }

    private final String gtknphoqwx() {
        return (String) this.f53688zoijcleaow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gxszxtbevo(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f53685iobyxmoadg.getString(x30.iobyxmoadg.AMOUNT.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f53685iobyxmoadg.getString(x30.iobyxmoadg.BOTH.wkgbmnqykc());
    }

    private final String nufgyqmvbu() {
        return (String) this.f53687wkgbmnqykc.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ojitshcjhn(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f53685iobyxmoadg.getString(x30.iobyxmoadg.WEIGHT.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String oxmwwwfdhm(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f53685iobyxmoadg.getString(x30.iobyxmoadg.UNDEFINED.wkgbmnqykc());
    }

    public static /* synthetic */ String vdvldrhtss(nufgyqmvbu nufgyqmvbuVar, x30.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return nufgyqmvbuVar.rgvfuqvkyq(iobyxmoadgVar, z13);
    }

    private final String wflxmlrfwp() {
        return (String) this.f53684gxszxtbevo.getValue();
    }

    public final x30.iobyxmoadg draadjrbmk(String str) {
        if (zdlpuopuiu.eablkybsjg(str, gtknphoqwx())) {
            return x30.iobyxmoadg.WEIGHT;
        }
        if (zdlpuopuiu.eablkybsjg(str, nufgyqmvbu())) {
            return x30.iobyxmoadg.AMOUNT;
        }
        return zdlpuopuiu.eablkybsjg(str, dxjokdxxww()) ? x30.iobyxmoadg.BOTH : x30.iobyxmoadg.UNDEFINED;
    }

    public final String rgvfuqvkyq(x30.iobyxmoadg measureType, boolean z13) {
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        int i13 = iobyxmoadg.f53689iobyxmoadg[measureType.ordinal()];
        if (i13 == 1) {
            return dxjokdxxww();
        }
        if (i13 != 2) {
            return i13 != 3 ? wflxmlrfwp() : nufgyqmvbu();
        }
        return z13 ? btonecajqb() : gtknphoqwx();
    }
}
