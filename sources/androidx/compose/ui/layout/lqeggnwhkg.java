package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements draadjrbmk, x.wflxmlrfwp {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final w0.zdlpuopuiu f6528yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final /* synthetic */ x.wflxmlrfwp f6529zdlpuopuiu;

    public static final class iobyxmoadg implements x.istkbnxepw {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f6530iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Map f6531ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6532wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f6533zoijcleaow;

        iobyxmoadg(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar) {
            this.f6530iobyxmoadg = i13;
            this.f6533zoijcleaow = i14;
            this.f6531ppxfxbqfkf = map;
            this.f6532wkgbmnqykc = draadjrbmkVar;
        }

        @Override // x.istkbnxepw
        public Map agtfadlqog() {
            return this.f6531ppxfxbqfkf;
        }

        @Override // x.istkbnxepw
        public int getHeight() {
            return this.f6533zoijcleaow;
        }

        @Override // x.istkbnxepw
        public int getWidth() {
            return this.f6530iobyxmoadg;
        }

        @Override // x.istkbnxepw
        public void ojitshcjhn() {
        }

        @Override // x.istkbnxepw
        public tg.draadjrbmk rgvfuqvkyq() {
            return this.f6532wkgbmnqykc;
        }
    }

    public lqeggnwhkg(x.wflxmlrfwp wflxmlrfwpVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        this.f6529zdlpuopuiu = wflxmlrfwpVar;
        this.f6528yggfygwlhe = zdlpuopuiuVar;
    }

    @Override // w0.wkgbmnqykc
    public float A(float f13) {
        return this.f6529zdlpuopuiu.A(f13);
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f6529zdlpuopuiu.F();
    }

    @Override // w0.wkgbmnqykc
    public float I(float f13) {
        return this.f6529zdlpuopuiu.I(f13);
    }

    @Override // w0.wkgbmnqykc
    public long V(long j13) {
        return this.f6529zdlpuopuiu.V(j13);
    }

    @Override // androidx.compose.ui.layout.draadjrbmk
    public x.istkbnxepw Z(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        boolean z13 = false;
        if (i13 < 0) {
            i13 = 0;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if ((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0) {
            z13 = true;
        }
        if (!z13) {
            w.iobyxmoadg.zoijcleaow("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new iobyxmoadg(i13, i14, map, draadjrbmkVar);
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f6529zdlpuopuiu.getDensity();
    }

    @Override // x.wflxmlrfwp
    public w0.zdlpuopuiu getLayoutDirection() {
        return this.f6528yggfygwlhe;
    }

    @Override // w0.wkgbmnqykc
    public int hszhottldk(float f13) {
        return this.f6529zdlpuopuiu.hszhottldk(f13);
    }

    @Override // w0.wkgbmnqykc
    public long mbcevpiqjq(long j13) {
        return this.f6529zdlpuopuiu.mbcevpiqjq(j13);
    }

    @Override // w0.wkgbmnqykc
    public float mhtqkkgtqm(long j13) {
        return this.f6529zdlpuopuiu.mhtqkkgtqm(j13);
    }

    @Override // w0.draadjrbmk
    public long tzroggbefp(float f13) {
        return this.f6529zdlpuopuiu.tzroggbefp(f13);
    }

    @Override // w0.wkgbmnqykc
    public long uwvvkdfqfp(float f13) {
        return this.f6529zdlpuopuiu.uwvvkdfqfp(f13);
    }

    @Override // w0.draadjrbmk
    public float vipkmwdibw(long j13) {
        return this.f6529zdlpuopuiu.vipkmwdibw(j13);
    }

    @Override // w0.wkgbmnqykc
    public float x(int i13) {
        return this.f6529zdlpuopuiu.x(i13);
    }

    @Override // x.wflxmlrfwp
    public boolean zeieaojujs() {
        return this.f6529zdlpuopuiu.zeieaojujs();
    }
}
