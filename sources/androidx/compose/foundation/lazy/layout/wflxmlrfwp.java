package androidx.compose.foundation.lazy.layout;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements y.nufgyqmvbu, x.ppxfxbqfkf, z.yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f5193hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private jztzpxfvev.jlmebxxoox f5194jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private btonecajqb f5195pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private agtfadlqog f5196ylkuphrtab;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final zoijcleaow f5192hkdspvbjdz = new zoijcleaow(null);

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    public static final int f5190cllcsxoeiz = 8;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private static final iobyxmoadg f5191dsvhmnatus = new iobyxmoadg();

    public static final class iobyxmoadg implements x.ppxfxbqfkf.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f5197iobyxmoadg;

        iobyxmoadg() {
        }

        @Override // x.ppxfxbqfkf.iobyxmoadg
        public boolean iobyxmoadg() {
            return this.f5197iobyxmoadg;
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f5198iobyxmoadg;

        static {
            int[] iArr = new int[w0.zdlpuopuiu.values().length];
            try {
                iArr[w0.zdlpuopuiu.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w0.zdlpuopuiu.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5198iobyxmoadg = iArr;
        }
    }

    public static final class wkgbmnqykc implements x.ppxfxbqfkf.iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ int f5200ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f5201zoijcleaow;

        wkgbmnqykc(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, int i13) {
            this.f5201zoijcleaow = hkdspvbjdzVar;
            this.f5200ppxfxbqfkf = i13;
        }

        @Override // x.ppxfxbqfkf.iobyxmoadg
        public boolean iobyxmoadg() {
            return wflxmlrfwp.this.K0((btonecajqb.iobyxmoadg) this.f5201zoijcleaow.f60015zdlpuopuiu, this.f5200ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public wflxmlrfwp(agtfadlqog agtfadlqogVar, btonecajqb btonecajqbVar, boolean z13, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        this.f5196ylkuphrtab = agtfadlqogVar;
        this.f5195pkzmftpjix = btonecajqbVar;
        this.f5193hcddaimhww = z13;
        this.f5194jpowsppfya = jlmebxxooxVar;
    }

    private final btonecajqb.iobyxmoadg J0(btonecajqb.iobyxmoadg iobyxmoadgVar, int i13) {
        int iZoijcleaow = iobyxmoadgVar.zoijcleaow();
        int iIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (L0(i13)) {
            iIobyxmoadg++;
        } else {
            iZoijcleaow--;
        }
        return this.f5195pkzmftpjix.iobyxmoadg(iZoijcleaow, iIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K0(btonecajqb.iobyxmoadg iobyxmoadgVar, int i13) {
        if (M0(i13)) {
            return false;
        }
        if (L0(i13)) {
            if (iobyxmoadgVar.iobyxmoadg() >= this.f5196ylkuphrtab.iobyxmoadg() - 1) {
                return false;
            }
        } else if (iobyxmoadgVar.zoijcleaow() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean L0(int i13) {
        x.ppxfxbqfkf.zoijcleaow.iobyxmoadg iobyxmoadgVar = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg;
        if (x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return false;
        }
        if (!x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.zoijcleaow())) {
            if (x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.iobyxmoadg())) {
                return this.f5193hcddaimhww;
            }
            if (x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.wkgbmnqykc())) {
                if (this.f5193hcddaimhww) {
                    return false;
                }
            } else if (x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.eablkybsjg())) {
                int i14 = ppxfxbqfkf.f5198iobyxmoadg[z.gtknphoqwx.ojitshcjhn(this).ordinal()];
                if (i14 == 1) {
                    return this.f5193hcddaimhww;
                }
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f5193hcddaimhww) {
                    return false;
                }
            } else {
                if (!x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.gxszxtbevo())) {
                    gtknphoqwx.ppxfxbqfkf();
                    throw new KotlinNothingValueException();
                }
                int i15 = ppxfxbqfkf.f5198iobyxmoadg[z.gtknphoqwx.ojitshcjhn(this).ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        return this.f5193hcddaimhww;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f5193hcddaimhww) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean M0(int i13) {
        x.ppxfxbqfkf.zoijcleaow.iobyxmoadg iobyxmoadgVar = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg;
        if (x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.iobyxmoadg()) || x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.wkgbmnqykc())) {
            if (this.f5194jpowsppfya == jztzpxfvev.jlmebxxoox.Horizontal) {
                return true;
            }
        } else if (x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.eablkybsjg()) || x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.gxszxtbevo())) {
            if (this.f5194jpowsppfya == jztzpxfvev.jlmebxxoox.Vertical) {
                return true;
            }
        } else if (!x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.ppxfxbqfkf()) && !x.ppxfxbqfkf.zoijcleaow.nufgyqmvbu(i13, iobyxmoadgVar.zoijcleaow())) {
            gtknphoqwx.ppxfxbqfkf();
            throw new KotlinNothingValueException();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn N0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, 0, 0, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void O0(agtfadlqog agtfadlqogVar, btonecajqb btonecajqbVar, boolean z13, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        this.f5196ylkuphrtab = agtfadlqogVar;
        this.f5195pkzmftpjix = btonecajqbVar;
        this.f5193hcddaimhww = z13;
        this.f5194jpowsppfya = jlmebxxooxVar;
    }

    @Override // x.ppxfxbqfkf
    public Object T(int i13, tg.draadjrbmk draadjrbmkVar) {
        if (this.f5196ylkuphrtab.iobyxmoadg() <= 0 || !this.f5196ylkuphrtab.ppxfxbqfkf() || !n0()) {
            return draadjrbmkVar.invoke(f5191dsvhmnatus);
        }
        int iEablkybsjg = L0(i13) ? this.f5196ylkuphrtab.eablkybsjg() : this.f5196ylkuphrtab.wkgbmnqykc();
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = this.f5195pkzmftpjix.iobyxmoadg(iEablkybsjg, iEablkybsjg);
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(this.f5196ylkuphrtab.zoijcleaow() * 2, this.f5196ylkuphrtab.iobyxmoadg());
        Object objInvoke = null;
        int i14 = 0;
        while (objInvoke == null && K0((btonecajqb.iobyxmoadg) hkdspvbjdzVar.f60015zdlpuopuiu, i13) && i14 < iBtonecajqb) {
            btonecajqb.iobyxmoadg iobyxmoadgVarJ0 = J0((btonecajqb.iobyxmoadg) hkdspvbjdzVar.f60015zdlpuopuiu, i13);
            this.f5195pkzmftpjix.eablkybsjg((btonecajqb.iobyxmoadg) hkdspvbjdzVar.f60015zdlpuopuiu);
            hkdspvbjdzVar.f60015zdlpuopuiu = iobyxmoadgVarJ0;
            i14++;
            z.wwaezpbzkn.wkgbmnqykc(this);
            objInvoke = draadjrbmkVar.invoke(new wkgbmnqykc(hkdspvbjdzVar, i13));
        }
        this.f5195pkzmftpjix.eablkybsjg((btonecajqb.iobyxmoadg) hkdspvbjdzVar.f60015zdlpuopuiu);
        z.wwaezpbzkn.wkgbmnqykc(this);
        return objInvoke;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.N0(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // y.nufgyqmvbu
    public y.lqeggnwhkg opjhrmiecq() {
        return y.dxjokdxxww.zoijcleaow(gg.cqumvgiudr.iobyxmoadg(x.wkgbmnqykc.iobyxmoadg(), this));
    }
}
