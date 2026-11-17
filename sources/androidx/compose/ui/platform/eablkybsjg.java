package androidx.compose.ui.platform;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends zoijcleaow {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static eablkybsjg f6872nufgyqmvbu;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Rect f6873eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private j0.f f6874ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private g0.zdlpuopuiu f6875wkgbmnqykc;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f6870gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f6871lqeggnwhkg = 8;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final v0.dxjokdxxww f6869dxjokdxxww = v0.dxjokdxxww.Rtl;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final v0.dxjokdxxww f6868btonecajqb = v0.dxjokdxxww.Ltr;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final eablkybsjg iobyxmoadg() {
            if (eablkybsjg.f6872nufgyqmvbu == null) {
                eablkybsjg.f6872nufgyqmvbu = new eablkybsjg(null);
            }
            eablkybsjg eablkybsjgVar = eablkybsjg.f6872nufgyqmvbu;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(eablkybsjgVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return eablkybsjgVar;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private final int dxjokdxxww(int i13, v0.dxjokdxxww dxjokdxxwwVar) {
        j0.f fVar = this.f6874ppxfxbqfkf;
        j0.f fVar2 = null;
        if (fVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar = null;
        }
        int iYggfygwlhe = fVar.yggfygwlhe(i13);
        j0.f fVar3 = this.f6874ppxfxbqfkf;
        if (fVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar3 = null;
        }
        if (dxjokdxxwwVar != fVar3.esjtqupxsv(iYggfygwlhe)) {
            j0.f fVar4 = this.f6874ppxfxbqfkf;
            if (fVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            } else {
                fVar2 = fVar4;
            }
            return fVar2.yggfygwlhe(i13);
        }
        j0.f fVar5 = this.f6874ppxfxbqfkf;
        if (fVar5 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar5 = null;
        }
        return j0.f.rgvfuqvkyq(fVar5, i13, false, 2, null) - 1;
    }

    public final void btonecajqb(String str, j0.f fVar, g0.zdlpuopuiu zdlpuopuiuVar) {
        gxszxtbevo(str);
        this.f6874ppxfxbqfkf = fVar;
        this.f6875wkgbmnqykc = zdlpuopuiuVar;
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] iobyxmoadg(int i13) {
        int iAgtfadlqog;
        j0.f fVar = null;
        if (wkgbmnqykc().length() <= 0 || i13 >= wkgbmnqykc().length()) {
            return null;
        }
        try {
            g0.zdlpuopuiu zdlpuopuiuVar = this.f6875wkgbmnqykc;
            if (zdlpuopuiuVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("node");
                zdlpuopuiuVar = null;
            }
            g.lqeggnwhkg lqeggnwhkgVarGtknphoqwx = zdlpuopuiuVar.gtknphoqwx();
            int iRound = Math.round(lqeggnwhkgVarGtknphoqwx.eablkybsjg() - lqeggnwhkgVarGtknphoqwx.gtknphoqwx());
            int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(0, i13);
            j0.f fVar2 = this.f6874ppxfxbqfkf;
            if (fVar2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar2 = null;
            }
            int iVdvldrhtss = fVar2.vdvldrhtss(iGxszxtbevo);
            j0.f fVar3 = this.f6874ppxfxbqfkf;
            if (fVar3 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar3 = null;
            }
            float fJyumaefscl = fVar3.jyumaefscl(iVdvldrhtss) + iRound;
            j0.f fVar4 = this.f6874ppxfxbqfkf;
            if (fVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar4 = null;
            }
            j0.f fVar5 = this.f6874ppxfxbqfkf;
            if (fVar5 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar5 = null;
            }
            if (fJyumaefscl < fVar4.jyumaefscl(fVar5.agtfadlqog() - 1)) {
                j0.f fVar6 = this.f6874ppxfxbqfkf;
                if (fVar6 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                } else {
                    fVar = fVar6;
                }
                iAgtfadlqog = fVar.oxmwwwfdhm(fJyumaefscl);
            } else {
                j0.f fVar7 = this.f6874ppxfxbqfkf;
                if (fVar7 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                } else {
                    fVar = fVar7;
                }
                iAgtfadlqog = fVar.agtfadlqog();
            }
            return ppxfxbqfkf(iGxszxtbevo, dxjokdxxww(iAgtfadlqog - 1, f6868btonecajqb) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] zoijcleaow(int i13) {
        int iOxmwwwfdhm;
        j0.f fVar = null;
        if (wkgbmnqykc().length() <= 0 || i13 <= 0) {
            return null;
        }
        try {
            g0.zdlpuopuiu zdlpuopuiuVar = this.f6875wkgbmnqykc;
            if (zdlpuopuiuVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("node");
                zdlpuopuiuVar = null;
            }
            g.lqeggnwhkg lqeggnwhkgVarGtknphoqwx = zdlpuopuiuVar.gtknphoqwx();
            int iRound = Math.round(lqeggnwhkgVarGtknphoqwx.eablkybsjg() - lqeggnwhkgVarGtknphoqwx.gtknphoqwx());
            int iBtonecajqb = zg.gtknphoqwx.btonecajqb(wkgbmnqykc().length(), i13);
            j0.f fVar2 = this.f6874ppxfxbqfkf;
            if (fVar2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar2 = null;
            }
            int iVdvldrhtss = fVar2.vdvldrhtss(iBtonecajqb);
            j0.f fVar3 = this.f6874ppxfxbqfkf;
            if (fVar3 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar3 = null;
            }
            float fJyumaefscl = fVar3.jyumaefscl(iVdvldrhtss) - iRound;
            if (fJyumaefscl > 0.0f) {
                j0.f fVar4 = this.f6874ppxfxbqfkf;
                if (fVar4 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                } else {
                    fVar = fVar4;
                }
                iOxmwwwfdhm = fVar.oxmwwwfdhm(fJyumaefscl);
            } else {
                iOxmwwwfdhm = 0;
            }
            if (iBtonecajqb == wkgbmnqykc().length() && iOxmwwwfdhm < iVdvldrhtss) {
                iOxmwwwfdhm++;
            }
            return ppxfxbqfkf(dxjokdxxww(iOxmwwwfdhm, f6869dxjokdxxww), iBtonecajqb);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private eablkybsjg() {
        this.f6873eablkybsjg = new Rect();
    }
}
