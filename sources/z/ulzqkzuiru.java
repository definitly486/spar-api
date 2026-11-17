package z;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ulzqkzuiru {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final stevsuqkhv f127292btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private w0.zoijcleaow f127293dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zfvoamnweg f127294eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f127295gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f127296iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f127297lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f127298nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f127299ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f127300wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f127301zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pkzmftpjix f127302iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f127303ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f127304zoijcleaow;

        public iobyxmoadg(pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14) {
            this.f127302iobyxmoadg = pkzmftpjixVar;
            this.f127304zoijcleaow = z13;
            this.f127303ppxfxbqfkf = z14;
        }

        public final pkzmftpjix iobyxmoadg() {
            return this.f127302iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f127304zoijcleaow;
        }

        public final boolean zoijcleaow() {
            return this.f127303ppxfxbqfkf;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f127305iobyxmoadg;

        static {
            int[] iArr = new int[pkzmftpjix.eablkybsjg.values().length];
            try {
                iArr[pkzmftpjix.eablkybsjg.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f127305iobyxmoadg = iArr;
        }
    }

    public ulzqkzuiru(pkzmftpjix pkzmftpjixVar) {
        this.f127296iobyxmoadg = pkzmftpjixVar;
        opjhrmiecq.iobyxmoadg iobyxmoadgVar = opjhrmiecq.f127131kcexrzcfyt;
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(iobyxmoadgVar.iobyxmoadg());
        this.f127301zoijcleaow = rgvfuqvkyqVar;
        this.f127294eablkybsjg = new zfvoamnweg();
        this.f127295gxszxtbevo = new ipoelvxyzq.ppxfxbqfkf(new opjhrmiecq.zoijcleaow[16], 0);
        this.f127297lqeggnwhkg = 1L;
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new iobyxmoadg[16], 0);
        this.f127298nufgyqmvbu = ppxfxbqfkfVar;
        this.f127292btonecajqb = iobyxmoadgVar.iobyxmoadg() ? new stevsuqkhv(pkzmftpjixVar, rgvfuqvkyqVar, ppxfxbqfkfVar.lqeggnwhkg()) : null;
    }

    private final boolean agtfadlqog(pkzmftpjix pkzmftpjixVar) {
        return pkzmftpjixVar.sflfametgt() && zdlpuopuiu(pkzmftpjixVar);
    }

    private final void btonecajqb(pkzmftpjix pkzmftpjixVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarFiwbwshyhd = pkzmftpjixVar.fiwbwshyhd();
        Object[] objArr = ppxfxbqfkfVarFiwbwshyhd.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVarFiwbwshyhd.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            pkzmftpjix pkzmftpjixVar2 = (pkzmftpjix) objArr[i13];
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar2.b(), Boolean.TRUE) && !pkzmftpjixVar2.istkbnxepw()) {
                if (this.f127301zoijcleaow.gxszxtbevo(pkzmftpjixVar2, true)) {
                    pkzmftpjixVar2.f();
                }
                btonecajqb(pkzmftpjixVar2);
            }
        }
    }

    private final void cdpycssgdh(pkzmftpjix pkzmftpjixVar, boolean z13) {
        w0.zoijcleaow zoijcleaowVar;
        if (pkzmftpjixVar.istkbnxepw()) {
            return;
        }
        if (pkzmftpjixVar == this.f127296iobyxmoadg) {
            zoijcleaowVar = this.f127293dxjokdxxww;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
        } else {
            zoijcleaowVar = null;
        }
        if (z13) {
            lqeggnwhkg(pkzmftpjixVar, zoijcleaowVar);
        } else {
            nufgyqmvbu(pkzmftpjixVar, zoijcleaowVar);
        }
    }

    private final void draadjrbmk(pkzmftpjix pkzmftpjixVar, boolean z13) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarFiwbwshyhd = pkzmftpjixVar.fiwbwshyhd();
        Object[] objArr = ppxfxbqfkfVarFiwbwshyhd.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVarFiwbwshyhd.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            pkzmftpjix pkzmftpjixVar2 = (pkzmftpjix) objArr[i13];
            if ((!z13 && yggfygwlhe(pkzmftpjixVar2)) || (z13 && oxmwwwfdhm(pkzmftpjixVar2))) {
                if (wypolnanlu.iobyxmoadg(pkzmftpjixVar2) && !z13) {
                    if (pkzmftpjixVar2.rlfsiqarku() && this.f127301zoijcleaow.gxszxtbevo(pkzmftpjixVar2, true)) {
                        zynmafqrjb(pkzmftpjixVar2, true, false);
                    } else {
                        gtknphoqwx(pkzmftpjixVar2, true);
                    }
                }
                pmvmpeiblj(pkzmftpjixVar2, z13);
                if (!esjtqupxsv(pkzmftpjixVar2, z13)) {
                    draadjrbmk(pkzmftpjixVar2, z13);
                }
            }
        }
        pmvmpeiblj(pkzmftpjixVar, z13);
    }

    private final void dxjokdxxww() {
        if (this.f127298nufgyqmvbu.draadjrbmk() != 0) {
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f127298nufgyqmvbu;
            Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
            int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objArr[i13];
                if (iobyxmoadgVar.iobyxmoadg().gxszxtbevo()) {
                    if (iobyxmoadgVar.ppxfxbqfkf()) {
                        pkzmftpjix.K(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), false, false, 2, null);
                    } else {
                        pkzmftpjix.O(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), false, false, 2, null);
                    }
                }
            }
            this.f127298nufgyqmvbu.nufgyqmvbu();
        }
    }

    private final boolean esjtqupxsv(pkzmftpjix pkzmftpjixVar, boolean z13) {
        return z13 ? pkzmftpjixVar.rlfsiqarku() : pkzmftpjixVar.sflfametgt();
    }

    public static /* synthetic */ void gxszxtbevo(ulzqkzuiru ulzqkzuiruVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        ulzqkzuiruVar.eablkybsjg(z13);
    }

    private final void istkbnxepw(pkzmftpjix pkzmftpjixVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarFiwbwshyhd = pkzmftpjixVar.fiwbwshyhd();
        Object[] objArr = ppxfxbqfkfVarFiwbwshyhd.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVarFiwbwshyhd.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            pkzmftpjix pkzmftpjixVar2 = (pkzmftpjix) objArr[i13];
            if (yggfygwlhe(pkzmftpjixVar2)) {
                if (wypolnanlu.iobyxmoadg(pkzmftpjixVar2)) {
                    cdpycssgdh(pkzmftpjixVar2, true);
                } else {
                    istkbnxepw(pkzmftpjixVar2);
                }
            }
        }
    }

    private final boolean lqeggnwhkg(pkzmftpjix pkzmftpjixVar, w0.zoijcleaow zoijcleaowVar) {
        if (pkzmftpjixVar.uwvvkdfqfp() == null) {
            return false;
        }
        boolean zD = zoijcleaowVar != null ? pkzmftpjixVar.d(zoijcleaowVar) : pkzmftpjix.e(pkzmftpjixVar, null, 1, null);
        pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
        if (zD && pkzmftpjixVarAuzgnhcxok != null) {
            if (pkzmftpjixVarAuzgnhcxok.uwvvkdfqfp() == null) {
                pkzmftpjix.O(pkzmftpjixVarAuzgnhcxok, false, false, false, 3, null);
            } else if (pkzmftpjixVar.bfopjjpdmp() == pkzmftpjix.lqeggnwhkg.InMeasureBlock) {
                pkzmftpjix.K(pkzmftpjixVarAuzgnhcxok, false, false, false, 3, null);
            } else if (pkzmftpjixVar.bfopjjpdmp() == pkzmftpjix.lqeggnwhkg.InLayoutBlock) {
                pkzmftpjix.I(pkzmftpjixVarAuzgnhcxok, false, 1, null);
            }
        }
        return zD;
    }

    private final boolean nufgyqmvbu(pkzmftpjix pkzmftpjixVar, w0.zoijcleaow zoijcleaowVar) {
        boolean zB = zoijcleaowVar != null ? pkzmftpjixVar.B(zoijcleaowVar) : pkzmftpjix.C(pkzmftpjixVar, null, 1, null);
        pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
        if (zB && pkzmftpjixVarAuzgnhcxok != null) {
            if (pkzmftpjixVar.oipsdeybqn() == pkzmftpjix.lqeggnwhkg.InMeasureBlock) {
                pkzmftpjix.O(pkzmftpjixVarAuzgnhcxok, false, false, false, 3, null);
            } else if (pkzmftpjixVar.oipsdeybqn() == pkzmftpjix.lqeggnwhkg.InLayoutBlock) {
                pkzmftpjix.M(pkzmftpjixVarAuzgnhcxok, false, 1, null);
            }
        }
        return zB;
    }

    private final boolean oxmwwwfdhm(pkzmftpjix pkzmftpjixVar) {
        z.iobyxmoadg iobyxmoadgVarAgtfadlqog;
        if (pkzmftpjixVar.bfopjjpdmp() == pkzmftpjix.lqeggnwhkg.InMeasureBlock) {
            return true;
        }
        z.zoijcleaow zoijcleaowVarOjitshcjhn = pkzmftpjixVar.okpsazkaxt().ojitshcjhn();
        return (zoijcleaowVarOjitshcjhn == null || (iobyxmoadgVarAgtfadlqog = zoijcleaowVarOjitshcjhn.agtfadlqog()) == null || !iobyxmoadgVarAgtfadlqog.gtknphoqwx()) ? false : true;
    }

    public static /* synthetic */ boolean pkzmftpjix(ulzqkzuiru ulzqkzuiruVar, pkzmftpjix pkzmftpjixVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return ulzqkzuiruVar.ylkuphrtab(pkzmftpjixVar, z13);
    }

    private final void pmvmpeiblj(pkzmftpjix pkzmftpjixVar, boolean z13) {
        if (esjtqupxsv(pkzmftpjixVar, z13)) {
            zynmafqrjb(pkzmftpjixVar, z13, false);
        }
    }

    private final boolean wflxmlrfwp(pkzmftpjix pkzmftpjixVar) {
        z.iobyxmoadg iobyxmoadgVarAgtfadlqog;
        if (pkzmftpjixVar.rlfsiqarku()) {
            if (pkzmftpjixVar.bfopjjpdmp() != pkzmftpjix.lqeggnwhkg.NotUsed) {
                return true;
            }
            z.zoijcleaow zoijcleaowVarOjitshcjhn = pkzmftpjixVar.okpsazkaxt().ojitshcjhn();
            if (zoijcleaowVarOjitshcjhn != null && (iobyxmoadgVarAgtfadlqog = zoijcleaowVarOjitshcjhn.agtfadlqog()) != null && iobyxmoadgVarAgtfadlqog.gtknphoqwx()) {
                return true;
            }
        }
        return false;
    }

    private final void wkgbmnqykc() {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f127295gxszxtbevo;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            ((opjhrmiecq.zoijcleaow) objArr[i13]).draadjrbmk();
        }
        this.f127295gxszxtbevo.nufgyqmvbu();
    }

    private final boolean yggfygwlhe(pkzmftpjix pkzmftpjixVar) {
        return pkzmftpjixVar.oipsdeybqn() == pkzmftpjix.lqeggnwhkg.InMeasureBlock || pkzmftpjixVar.okpsazkaxt().zoijcleaow().agtfadlqog().gtknphoqwx();
    }

    private final boolean zdlpuopuiu(pkzmftpjix pkzmftpjixVar) {
        do {
            if (pkzmftpjixVar.oipsdeybqn() == pkzmftpjix.lqeggnwhkg.NotUsed && !pkzmftpjixVar.okpsazkaxt().zoijcleaow().agtfadlqog().gtknphoqwx()) {
                pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
                if ((pkzmftpjixVarAuzgnhcxok != null ? pkzmftpjixVarAuzgnhcxok.xrmfcynszj() : null) != pkzmftpjix.eablkybsjg.Measuring) {
                    return false;
                }
            }
            pkzmftpjixVar = pkzmftpjixVar.auzgnhcxok();
            if (pkzmftpjixVar == null) {
                return false;
            }
        } while (!pkzmftpjixVar.gtknphoqwx());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zynmafqrjb(pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14) {
        w0.zoijcleaow zoijcleaowVar;
        pkzmftpjix pkzmftpjixVarAuzgnhcxok;
        boolean zLqeggnwhkg = false;
        if (pkzmftpjixVar.istkbnxepw()) {
            return false;
        }
        if (pkzmftpjixVar.gtknphoqwx() || pkzmftpjixVar.a() || agtfadlqog(pkzmftpjixVar) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.b(), Boolean.TRUE) || wflxmlrfwp(pkzmftpjixVar) || pkzmftpjixVar.hcddaimhww()) {
            if (pkzmftpjixVar == this.f127296iobyxmoadg) {
                zoijcleaowVar = this.f127293dxjokdxxww;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
            } else {
                zoijcleaowVar = null;
            }
            if (z13) {
                zLqeggnwhkg = pkzmftpjixVar.rlfsiqarku() ? lqeggnwhkg(pkzmftpjixVar, zoijcleaowVar) : false;
                if (z14 && ((zLqeggnwhkg || pkzmftpjixVar.metgxyhuhe()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.b(), Boolean.TRUE))) {
                    pkzmftpjixVar.f();
                }
            } else {
                boolean zNufgyqmvbu = pkzmftpjixVar.sflfametgt() ? nufgyqmvbu(pkzmftpjixVar, zoijcleaowVar) : false;
                if (z14 && pkzmftpjixVar.jztzpxfvev() && (pkzmftpjixVar == this.f127296iobyxmoadg || ((pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok()) != null && pkzmftpjixVarAuzgnhcxok.gtknphoqwx() && pkzmftpjixVar.a()))) {
                    if (pkzmftpjixVar == this.f127296iobyxmoadg) {
                        pkzmftpjixVar.z(0, 0);
                    } else {
                        pkzmftpjixVar.F();
                    }
                    this.f127294eablkybsjg.wkgbmnqykc(pkzmftpjixVar);
                    cllcsxoeiz.zoijcleaow(pkzmftpjixVar).getRectManager().btonecajqb(pkzmftpjixVar);
                    stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
                    if (stevsuqkhvVar != null) {
                        stevsuqkhvVar.iobyxmoadg();
                    }
                }
                zLqeggnwhkg = zNufgyqmvbu;
            }
            dxjokdxxww();
        }
        return zLqeggnwhkg;
    }

    public final void cqumvgiudr() {
        if (this.f127301zoijcleaow.dxjokdxxww()) {
            if (!this.f127296iobyxmoadg.gxszxtbevo()) {
                w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called with unattached root");
            }
            if (!this.f127296iobyxmoadg.gtknphoqwx()) {
                w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called with unplaced root");
            }
            if (this.f127299ppxfxbqfkf) {
                w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called during measure layout");
            }
            if (this.f127293dxjokdxxww != null) {
                this.f127299ppxfxbqfkf = true;
                this.f127300wkgbmnqykc = false;
                try {
                    if (this.f127301zoijcleaow.lqeggnwhkg()) {
                        if (this.f127296iobyxmoadg.uwvvkdfqfp() != null) {
                            cdpycssgdh(this.f127296iobyxmoadg, true);
                        } else {
                            istkbnxepw(this.f127296iobyxmoadg);
                        }
                    }
                    cdpycssgdh(this.f127296iobyxmoadg, false);
                    this.f127299ppxfxbqfkf = false;
                    this.f127300wkgbmnqykc = false;
                    stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
                    if (stevsuqkhvVar != null) {
                        stevsuqkhvVar.iobyxmoadg();
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        this.f127299ppxfxbqfkf = false;
                        this.f127300wkgbmnqykc = false;
                        throw th3;
                    }
                }
            }
        }
    }

    public final void eablkybsjg(boolean z13) {
        if (z13) {
            this.f127294eablkybsjg.eablkybsjg(this.f127296iobyxmoadg);
        }
        if (this.f127294eablkybsjg.ppxfxbqfkf()) {
            this.f127294eablkybsjg.iobyxmoadg();
        }
    }

    public final void gtknphoqwx(pkzmftpjix pkzmftpjixVar, boolean z13) {
        if (!this.f127299ppxfxbqfkf) {
            w.iobyxmoadg.zoijcleaow("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (esjtqupxsv(pkzmftpjixVar, z13)) {
            w.iobyxmoadg.iobyxmoadg("node not yet measured");
        }
        draadjrbmk(pkzmftpjixVar, z13);
    }

    public final void hcddaimhww(uawqvzlxes.iobyxmoadg iobyxmoadgVar) {
    }

    public final boolean iozdgvuglv(pkzmftpjix pkzmftpjixVar, boolean z13) {
        pkzmftpjix pkzmftpjixVarAuzgnhcxok;
        pkzmftpjix pkzmftpjixVarAuzgnhcxok2;
        if (!(pkzmftpjixVar.uwvvkdfqfp() != null)) {
            w.iobyxmoadg.zoijcleaow("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i13 = zoijcleaow.f127305iobyxmoadg[pkzmftpjixVar.xrmfcynszj().ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2 || i13 == 3 || i13 == 4) {
            this.f127298nufgyqmvbu.zoijcleaow(new iobyxmoadg(pkzmftpjixVar, true, z13));
            stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
            if (stevsuqkhvVar == null) {
                return false;
            }
            stevsuqkhvVar.iobyxmoadg();
            return false;
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (pkzmftpjixVar.rlfsiqarku() && !z13) {
            return false;
        }
        pkzmftpjixVar.i();
        pkzmftpjixVar.k();
        if (pkzmftpjixVar.istkbnxepw()) {
            return false;
        }
        if ((kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.b(), Boolean.TRUE) || wflxmlrfwp(pkzmftpjixVar)) && ((pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok()) == null || !pkzmftpjixVarAuzgnhcxok.rlfsiqarku())) {
            this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVar, zynmafqrjb.LookaheadMeasurement);
        } else if ((pkzmftpjixVar.gtknphoqwx() || agtfadlqog(pkzmftpjixVar)) && ((pkzmftpjixVarAuzgnhcxok2 = pkzmftpjixVar.auzgnhcxok()) == null || !pkzmftpjixVarAuzgnhcxok2.sflfametgt())) {
            this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVar, zynmafqrjb.Measurement);
        }
        return !this.f127300wkgbmnqykc;
    }

    public final void iwizpuwonk(pkzmftpjix pkzmftpjixVar, long j13) {
        if (pkzmftpjixVar.istkbnxepw()) {
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar, this.f127296iobyxmoadg)) {
            w.iobyxmoadg.iobyxmoadg("measureAndLayout called on root");
        }
        if (!this.f127296iobyxmoadg.gxszxtbevo()) {
            w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called with unattached root");
        }
        if (!this.f127296iobyxmoadg.gtknphoqwx()) {
            w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called with unplaced root");
        }
        if (this.f127299ppxfxbqfkf) {
            w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called during measure layout");
        }
        if (this.f127293dxjokdxxww != null) {
            this.f127299ppxfxbqfkf = true;
            this.f127300wkgbmnqykc = false;
            try {
                this.f127301zoijcleaow.btonecajqb(pkzmftpjixVar);
                if (lqeggnwhkg(pkzmftpjixVar, w0.zoijcleaow.iobyxmoadg(j13)) || pkzmftpjixVar.metgxyhuhe()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.b(), Boolean.TRUE)) {
                        pkzmftpjixVar.f();
                    }
                }
                btonecajqb(pkzmftpjixVar);
                nufgyqmvbu(pkzmftpjixVar, w0.zoijcleaow.iobyxmoadg(j13));
                if (pkzmftpjixVar.jztzpxfvev() && pkzmftpjixVar.gtknphoqwx()) {
                    pkzmftpjixVar.F();
                    this.f127294eablkybsjg.wkgbmnqykc(pkzmftpjixVar);
                }
                dxjokdxxww();
                this.f127299ppxfxbqfkf = false;
                this.f127300wkgbmnqykc = false;
                stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
                if (stevsuqkhvVar != null) {
                    stevsuqkhvVar.iobyxmoadg();
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    this.f127299ppxfxbqfkf = false;
                    this.f127300wkgbmnqykc = false;
                    throw th3;
                }
            }
        }
        wkgbmnqykc();
    }

    public final void jpowsppfya(long j13) {
        w0.zoijcleaow zoijcleaowVar = this.f127293dxjokdxxww;
        if (zoijcleaowVar == null ? false : w0.zoijcleaow.gxszxtbevo(zoijcleaowVar.vdvldrhtss(), j13)) {
            return;
        }
        if (this.f127299ppxfxbqfkf) {
            w.iobyxmoadg.iobyxmoadg("updateRootConstraints called while measuring");
        }
        this.f127293dxjokdxxww = w0.zoijcleaow.iobyxmoadg(j13);
        if (this.f127296iobyxmoadg.uwvvkdfqfp() != null) {
            this.f127296iobyxmoadg.i();
        }
        this.f127296iobyxmoadg.k();
        rgvfuqvkyq rgvfuqvkyqVar = this.f127301zoijcleaow;
        pkzmftpjix pkzmftpjixVar = this.f127296iobyxmoadg;
        rgvfuqvkyqVar.wkgbmnqykc(pkzmftpjixVar, pkzmftpjixVar.uwvvkdfqfp() != null ? zynmafqrjb.LookaheadMeasurement : zynmafqrjb.Measurement);
    }

    public final boolean jyumaefscl(tg.iobyxmoadg iobyxmoadgVar) {
        boolean z13;
        pkzmftpjix pkzmftpjixVarWkgbmnqykc;
        boolean z14;
        boolean z15;
        if (!this.f127296iobyxmoadg.gxszxtbevo()) {
            w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called with unattached root");
        }
        if (!this.f127296iobyxmoadg.gtknphoqwx()) {
            w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called with unplaced root");
        }
        if (this.f127299ppxfxbqfkf) {
            w.iobyxmoadg.iobyxmoadg("performMeasureAndLayout called during measure layout");
        }
        boolean z16 = false;
        if (this.f127293dxjokdxxww != null) {
            this.f127299ppxfxbqfkf = true;
            this.f127300wkgbmnqykc = true;
            try {
                if (this.f127301zoijcleaow.dxjokdxxww()) {
                    rgvfuqvkyq rgvfuqvkyqVar = this.f127301zoijcleaow;
                    z13 = false;
                    while (true) {
                        if (!rgvfuqvkyqVar.f127211iobyxmoadg.ppxfxbqfkf()) {
                            pkzmftpjixVarWkgbmnqykc = rgvfuqvkyqVar.f127211iobyxmoadg.wkgbmnqykc();
                            z15 = pkzmftpjixVarWkgbmnqykc.uwvvkdfqfp() != null;
                            z14 = false;
                        } else if (!rgvfuqvkyqVar.f127213zoijcleaow.ppxfxbqfkf()) {
                            pkzmftpjixVarWkgbmnqykc = rgvfuqvkyqVar.f127213zoijcleaow.wkgbmnqykc();
                            z15 = pkzmftpjixVarWkgbmnqykc.uwvvkdfqfp() != null;
                            z14 = true;
                        } else {
                            if (rgvfuqvkyqVar.f127212ppxfxbqfkf.ppxfxbqfkf()) {
                                break;
                            }
                            pkzmftpjixVarWkgbmnqykc = rgvfuqvkyqVar.f127212ppxfxbqfkf.wkgbmnqykc();
                            z14 = true;
                            z15 = false;
                        }
                        boolean zZynmafqrjb = zynmafqrjb(pkzmftpjixVarWkgbmnqykc, z15, z14);
                        if (!z14) {
                            if (pkzmftpjixVarWkgbmnqykc.metgxyhuhe()) {
                                this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVarWkgbmnqykc, zynmafqrjb.LookaheadPlacement);
                            }
                            if (pkzmftpjixVarWkgbmnqykc.jztzpxfvev()) {
                                this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVarWkgbmnqykc, zynmafqrjb.Placement);
                            }
                        }
                        if (pkzmftpjixVarWkgbmnqykc == this.f127296iobyxmoadg && zZynmafqrjb) {
                            z13 = true;
                        }
                    }
                    if (iobyxmoadgVar != null) {
                        iobyxmoadgVar.invoke();
                    }
                } else {
                    z13 = false;
                }
                this.f127299ppxfxbqfkf = false;
                this.f127300wkgbmnqykc = false;
                stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
                if (stevsuqkhvVar != null) {
                    stevsuqkhvVar.iobyxmoadg();
                }
                z16 = z13;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    this.f127299ppxfxbqfkf = false;
                    this.f127300wkgbmnqykc = false;
                    throw th3;
                }
            }
        }
        wkgbmnqykc();
        return z16;
    }

    public final long kcexrzcfyt() {
        if (!this.f127299ppxfxbqfkf) {
            w.iobyxmoadg.iobyxmoadg("measureIteration should be only used during the measure/layout pass");
        }
        return this.f127297lqeggnwhkg;
    }

    public final void lereixgezr(pkzmftpjix pkzmftpjixVar) {
        this.f127301zoijcleaow.btonecajqb(pkzmftpjixVar);
        this.f127294eablkybsjg.gxszxtbevo(pkzmftpjixVar);
    }

    public final void lmojexxdyd(pkzmftpjix pkzmftpjixVar) {
        this.f127294eablkybsjg.wkgbmnqykc(pkzmftpjixVar);
    }

    public final boolean ojitshcjhn() {
        return this.f127299ppxfxbqfkf;
    }

    public final boolean rgvfuqvkyq() {
        return this.f127301zoijcleaow.dxjokdxxww();
    }

    public final boolean vdvldrhtss() {
        return this.f127294eablkybsjg.ppxfxbqfkf();
    }

    public final boolean wwaezpbzkn(pkzmftpjix pkzmftpjixVar, boolean z13) {
        int i13 = zoijcleaow.f127305iobyxmoadg[pkzmftpjixVar.xrmfcynszj().ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
            if (stevsuqkhvVar != null) {
                stevsuqkhvVar.iobyxmoadg();
            }
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
            boolean z14 = pkzmftpjixVarAuzgnhcxok == null || pkzmftpjixVarAuzgnhcxok.gtknphoqwx();
            if (z13 || !(pkzmftpjixVar.sflfametgt() || (pkzmftpjixVar.jztzpxfvev() && pkzmftpjixVar.gtknphoqwx() == z14 && pkzmftpjixVar.gtknphoqwx() == pkzmftpjixVar.a()))) {
                pkzmftpjixVar.g();
                if (!pkzmftpjixVar.istkbnxepw() && pkzmftpjixVar.a() && z14) {
                    if ((pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.jztzpxfvev()) && (pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.sflfametgt())) {
                        this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVar, zynmafqrjb.Placement);
                    }
                    if (!this.f127300wkgbmnqykc) {
                        return true;
                    }
                }
            } else {
                stevsuqkhv stevsuqkhvVar2 = this.f127292btonecajqb;
                if (stevsuqkhvVar2 != null) {
                    stevsuqkhvVar2.iobyxmoadg();
                }
            }
        }
        return false;
    }

    public final boolean yadqdtsiqt(pkzmftpjix pkzmftpjixVar, boolean z13) {
        int i13 = zoijcleaow.f127305iobyxmoadg[pkzmftpjixVar.xrmfcynszj().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4 && i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((pkzmftpjixVar.rlfsiqarku() || pkzmftpjixVar.metgxyhuhe()) && !z13) {
                stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
                if (stevsuqkhvVar == null) {
                    return false;
                }
                stevsuqkhvVar.iobyxmoadg();
                return false;
            }
            pkzmftpjixVar.h();
            pkzmftpjixVar.g();
            if (pkzmftpjixVar.istkbnxepw()) {
                return false;
            }
            pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.b(), Boolean.TRUE) && ((pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.rlfsiqarku()) && (pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.metgxyhuhe()))) {
                this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVar, zynmafqrjb.LookaheadPlacement);
            } else if (pkzmftpjixVar.gtknphoqwx() && ((pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.jztzpxfvev()) && (pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.sflfametgt()))) {
                this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVar, zynmafqrjb.Placement);
            }
            return !this.f127300wkgbmnqykc;
        }
        stevsuqkhv stevsuqkhvVar2 = this.f127292btonecajqb;
        if (stevsuqkhvVar2 == null) {
            return false;
        }
        stevsuqkhvVar2.iobyxmoadg();
        return false;
    }

    public final boolean ylkuphrtab(pkzmftpjix pkzmftpjixVar, boolean z13) {
        int i13 = zoijcleaow.f127305iobyxmoadg[pkzmftpjixVar.xrmfcynszj().ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3 || i13 == 4) {
                this.f127298nufgyqmvbu.zoijcleaow(new iobyxmoadg(pkzmftpjixVar, false, z13));
                stevsuqkhv stevsuqkhvVar = this.f127292btonecajqb;
                if (stevsuqkhvVar != null) {
                    stevsuqkhvVar.iobyxmoadg();
                }
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!pkzmftpjixVar.sflfametgt() || z13) {
                    pkzmftpjixVar.k();
                    if (!pkzmftpjixVar.istkbnxepw() && (pkzmftpjixVar.gtknphoqwx() || agtfadlqog(pkzmftpjixVar))) {
                        pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
                        if (pkzmftpjixVarAuzgnhcxok == null || !pkzmftpjixVarAuzgnhcxok.sflfametgt()) {
                            this.f127301zoijcleaow.wkgbmnqykc(pkzmftpjixVar, zynmafqrjb.Measurement);
                        }
                        if (!this.f127300wkgbmnqykc) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
