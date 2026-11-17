package androidx.compose.ui.layout;

import java.util.Map;
import z.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements x.wflxmlrfwp, draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final z.iozdgvuglv f6565zdlpuopuiu;

    public static final class iobyxmoadg implements x.istkbnxepw {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6566eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f6567gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f6568iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f6569ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final tg.draadjrbmk f6570wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f6571zoijcleaow;

        iobyxmoadg(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, zoijcleaow zoijcleaowVar) {
            this.f6566eablkybsjg = draadjrbmkVar2;
            this.f6567gxszxtbevo = zoijcleaowVar;
            this.f6568iobyxmoadg = i13;
            this.f6571zoijcleaow = i14;
            this.f6569ppxfxbqfkf = map;
            this.f6570wkgbmnqykc = draadjrbmkVar;
        }

        @Override // x.istkbnxepw
        public Map agtfadlqog() {
            return this.f6569ppxfxbqfkf;
        }

        @Override // x.istkbnxepw
        public int getHeight() {
            return this.f6571zoijcleaow;
        }

        @Override // x.istkbnxepw
        public int getWidth() {
            return this.f6568iobyxmoadg;
        }

        @Override // x.istkbnxepw
        public void ojitshcjhn() {
            this.f6566eablkybsjg.invoke(this.f6567gxszxtbevo.lqeggnwhkg().M());
        }

        @Override // x.istkbnxepw
        public tg.draadjrbmk rgvfuqvkyq() {
            return this.f6570wkgbmnqykc;
        }
    }

    public zoijcleaow(z.iozdgvuglv iozdgvuglvVar, androidx.compose.ui.layout.iobyxmoadg iobyxmoadgVar) {
        this.f6565zdlpuopuiu = iozdgvuglvVar;
    }

    @Override // w0.wkgbmnqykc
    public float A(float f13) {
        return this.f6565zdlpuopuiu.A(f13);
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f6565zdlpuopuiu.F();
    }

    @Override // w0.wkgbmnqykc
    public float I(float f13) {
        return this.f6565zdlpuopuiu.I(f13);
    }

    @Override // w0.wkgbmnqykc
    public long V(long j13) {
        return this.f6565zdlpuopuiu.V(j13);
    }

    @Override // androidx.compose.ui.layout.draadjrbmk
    public x.istkbnxepw Z(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        if (!((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0)) {
            w.iobyxmoadg.zoijcleaow("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new iobyxmoadg(i13, i14, map, draadjrbmkVar, draadjrbmkVar2, this);
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f6565zdlpuopuiu.getDensity();
    }

    @Override // x.wflxmlrfwp
    public w0.zdlpuopuiu getLayoutDirection() {
        return this.f6565zdlpuopuiu.getLayoutDirection();
    }

    public long gtknphoqwx() {
        mbcevpiqjq mbcevpiqjqVarQ0 = this.f6565zdlpuopuiu.Q0();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(mbcevpiqjqVarQ0);
        x.istkbnxepw istkbnxepwVarE = mbcevpiqjqVarQ0.E();
        return w0.oxmwwwfdhm.ppxfxbqfkf((((long) istkbnxepwVarE.getWidth()) << 32) | (((long) istkbnxepwVarE.getHeight()) & 4294967295L));
    }

    public final androidx.compose.ui.layout.iobyxmoadg gxszxtbevo() {
        return null;
    }

    @Override // w0.wkgbmnqykc
    public int hszhottldk(float f13) {
        return this.f6565zdlpuopuiu.hszhottldk(f13);
    }

    public final z.iozdgvuglv lqeggnwhkg() {
        return this.f6565zdlpuopuiu;
    }

    @Override // w0.wkgbmnqykc
    public long mbcevpiqjq(long j13) {
        return this.f6565zdlpuopuiu.mbcevpiqjq(j13);
    }

    @Override // w0.wkgbmnqykc
    public float mhtqkkgtqm(long j13) {
        return this.f6565zdlpuopuiu.mhtqkkgtqm(j13);
    }

    @Override // androidx.compose.ui.layout.draadjrbmk
    public x.istkbnxepw nuxfzjnpeb(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar) {
        return this.f6565zdlpuopuiu.nuxfzjnpeb(i13, i14, map, draadjrbmkVar);
    }

    @Override // w0.draadjrbmk
    public long tzroggbefp(float f13) {
        return this.f6565zdlpuopuiu.tzroggbefp(f13);
    }

    @Override // w0.wkgbmnqykc
    public long uwvvkdfqfp(float f13) {
        return this.f6565zdlpuopuiu.uwvvkdfqfp(f13);
    }

    @Override // w0.draadjrbmk
    public float vipkmwdibw(long j13) {
        return this.f6565zdlpuopuiu.vipkmwdibw(j13);
    }

    public final void wflxmlrfwp(androidx.compose.ui.layout.iobyxmoadg iobyxmoadgVar) {
    }

    @Override // w0.wkgbmnqykc
    public float x(int i13) {
        return this.f6565zdlpuopuiu.x(i13);
    }

    @Override // x.wflxmlrfwp
    public boolean zeieaojujs() {
        return false;
    }
}
