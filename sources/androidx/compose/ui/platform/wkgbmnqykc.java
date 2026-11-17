package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static wkgbmnqykc f7124gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private j0.f f7128ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f7127wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f7123eablkybsjg = 8;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final v0.dxjokdxxww f7125lqeggnwhkg = v0.dxjokdxxww.Rtl;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final v0.dxjokdxxww f7126nufgyqmvbu = v0.dxjokdxxww.Ltr;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wkgbmnqykc iobyxmoadg() {
            if (wkgbmnqykc.f7124gxszxtbevo == null) {
                wkgbmnqykc.f7124gxszxtbevo = new wkgbmnqykc(null);
            }
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f7124gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return wkgbmnqykcVar;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private final int dxjokdxxww(int i13, v0.dxjokdxxww dxjokdxxwwVar) {
        j0.f fVar = this.f7128ppxfxbqfkf;
        j0.f fVar2 = null;
        if (fVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar = null;
        }
        int iYggfygwlhe = fVar.yggfygwlhe(i13);
        j0.f fVar3 = this.f7128ppxfxbqfkf;
        if (fVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar3 = null;
        }
        if (dxjokdxxwwVar != fVar3.esjtqupxsv(iYggfygwlhe)) {
            j0.f fVar4 = this.f7128ppxfxbqfkf;
            if (fVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            } else {
                fVar2 = fVar4;
            }
            return fVar2.yggfygwlhe(i13);
        }
        j0.f fVar5 = this.f7128ppxfxbqfkf;
        if (fVar5 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar5 = null;
        }
        return j0.f.rgvfuqvkyq(fVar5, i13, false, 2, null) - 1;
    }

    public final void btonecajqb(String str, j0.f fVar) {
        gxszxtbevo(str);
        this.f7128ppxfxbqfkf = fVar;
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] iobyxmoadg(int i13) {
        int iVdvldrhtss;
        if (wkgbmnqykc().length() <= 0 || i13 >= wkgbmnqykc().length()) {
            return null;
        }
        if (i13 < 0) {
            j0.f fVar = this.f7128ppxfxbqfkf;
            if (fVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar = null;
            }
            iVdvldrhtss = fVar.vdvldrhtss(0);
        } else {
            j0.f fVar2 = this.f7128ppxfxbqfkf;
            if (fVar2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar2 = null;
            }
            int iVdvldrhtss2 = fVar2.vdvldrhtss(i13);
            iVdvldrhtss = dxjokdxxww(iVdvldrhtss2, f7125lqeggnwhkg) == i13 ? iVdvldrhtss2 : iVdvldrhtss2 + 1;
        }
        j0.f fVar3 = this.f7128ppxfxbqfkf;
        if (fVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
            fVar3 = null;
        }
        if (iVdvldrhtss >= fVar3.agtfadlqog()) {
            return null;
        }
        return ppxfxbqfkf(dxjokdxxww(iVdvldrhtss, f7125lqeggnwhkg), dxjokdxxww(iVdvldrhtss, f7126nufgyqmvbu) + 1);
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] zoijcleaow(int i13) {
        int iVdvldrhtss;
        if (wkgbmnqykc().length() <= 0 || i13 <= 0) {
            return null;
        }
        if (i13 > wkgbmnqykc().length()) {
            j0.f fVar = this.f7128ppxfxbqfkf;
            if (fVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar = null;
            }
            iVdvldrhtss = fVar.vdvldrhtss(wkgbmnqykc().length());
        } else {
            j0.f fVar2 = this.f7128ppxfxbqfkf;
            if (fVar2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("layoutResult");
                fVar2 = null;
            }
            int iVdvldrhtss2 = fVar2.vdvldrhtss(i13);
            iVdvldrhtss = dxjokdxxww(iVdvldrhtss2, f7126nufgyqmvbu) + 1 == i13 ? iVdvldrhtss2 : iVdvldrhtss2 - 1;
        }
        if (iVdvldrhtss < 0) {
            return null;
        }
        return ppxfxbqfkf(dxjokdxxww(iVdvldrhtss, f7125lqeggnwhkg), dxjokdxxww(iVdvldrhtss, f7126nufgyqmvbu) + 1);
    }

    private wkgbmnqykc() {
    }
}
