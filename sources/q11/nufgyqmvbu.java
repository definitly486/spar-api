package q11;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f77706eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gtknphoqwx f77707gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q41.iobyxmoadg f77708iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f77709ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f77710wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f77711zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f77712iobyxmoadg;

        static {
            int[] iArr = new int[c21.iobyxmoadg.values().length];
            try {
                iArr[c21.iobyxmoadg.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c21.iobyxmoadg.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c21.iobyxmoadg.AMOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77712iobyxmoadg = iArr;
        }
    }

    public nufgyqmvbu(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f77708iobyxmoadg = resourcesManager;
        this.f77711zoijcleaow = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q11.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.ojitshcjhn(this.f77713zdlpuopuiu);
            }
        });
        this.f77709ppxfxbqfkf = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q11.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f77714zdlpuopuiu);
            }
        });
        this.f77710wkgbmnqykc = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q11.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.gxszxtbevo(this.f77702zdlpuopuiu);
            }
        });
        this.f77706eablkybsjg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q11.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.lqeggnwhkg(this.f77703zdlpuopuiu);
            }
        });
        this.f77707gxszxtbevo = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q11.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.oxmwwwfdhm(this.f77705zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f77708iobyxmoadg.getString(zy0.ppxfxbqfkf.proloyalty_measure_per_100_value);
    }

    private final String btonecajqb() {
        return (String) this.f77709ppxfxbqfkf.getValue();
    }

    private final String dxjokdxxww() {
        return (String) this.f77706eablkybsjg.getValue();
    }

    private final String gtknphoqwx() {
        return (String) this.f77711zoijcleaow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gxszxtbevo(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f77708iobyxmoadg.getString(c21.iobyxmoadg.AMOUNT.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f77708iobyxmoadg.getString(c21.iobyxmoadg.BOTH.wkgbmnqykc());
    }

    private final String nufgyqmvbu() {
        return (String) this.f77710wkgbmnqykc.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ojitshcjhn(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f77708iobyxmoadg.getString(c21.iobyxmoadg.WEIGHT.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String oxmwwwfdhm(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f77708iobyxmoadg.getString(c21.iobyxmoadg.UNDEFINED.wkgbmnqykc());
    }

    public static /* synthetic */ String vdvldrhtss(nufgyqmvbu nufgyqmvbuVar, c21.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return nufgyqmvbuVar.rgvfuqvkyq(iobyxmoadgVar, z13);
    }

    private final String wflxmlrfwp() {
        return (String) this.f77707gxszxtbevo.getValue();
    }

    public final c21.iobyxmoadg draadjrbmk(String str) {
        if (zdlpuopuiu.eablkybsjg(str, gtknphoqwx())) {
            return c21.iobyxmoadg.WEIGHT;
        }
        if (zdlpuopuiu.eablkybsjg(str, nufgyqmvbu())) {
            return c21.iobyxmoadg.AMOUNT;
        }
        return zdlpuopuiu.eablkybsjg(str, dxjokdxxww()) ? c21.iobyxmoadg.BOTH : c21.iobyxmoadg.UNDEFINED;
    }

    public final String rgvfuqvkyq(c21.iobyxmoadg measureType, boolean z13) {
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        int i13 = iobyxmoadg.f77712iobyxmoadg[measureType.ordinal()];
        if (i13 == 1) {
            return dxjokdxxww();
        }
        if (i13 != 2) {
            return i13 != 3 ? wflxmlrfwp() : nufgyqmvbu();
        }
        return z13 ? btonecajqb() : gtknphoqwx();
    }
}
