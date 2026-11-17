package opjhrmiecq;

import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f73486iobyxmoadg;

        static {
            int[] iArr = new int[jztzpxfvev.jlmebxxoox.values().length];
            try {
                iArr[jztzpxfvev.jlmebxxoox.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jztzpxfvev.jlmebxxoox.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f73486iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f73487jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f73488yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ j0 f73489zdlpuopuiu;

        public static final class iobyxmoadg implements jztzpxfvev.opjhrmiecq {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final /* synthetic */ jztzpxfvev.opjhrmiecq f73490iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final androidx.compose.runtime.i1 f73491ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final androidx.compose.runtime.i1 f73492zoijcleaow;

            iobyxmoadg(jztzpxfvev.opjhrmiecq opjhrmiecqVar, final j0 j0Var) {
                this.f73490iobyxmoadg = opjhrmiecqVar;
                this.f73492zoijcleaow = androidx.compose.runtime.v0.eablkybsjg(new tg.iobyxmoadg() { // from class: opjhrmiecq.e0
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Boolean.valueOf(c0.ppxfxbqfkf.iobyxmoadg.btonecajqb(j0Var));
                    }
                });
                this.f73491ppxfxbqfkf = androidx.compose.runtime.v0.eablkybsjg(new tg.iobyxmoadg() { // from class: opjhrmiecq.f0
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Boolean.valueOf(c0.ppxfxbqfkf.iobyxmoadg.dxjokdxxww(j0Var));
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean btonecajqb(j0 j0Var) {
                return j0Var.nufgyqmvbu() < j0Var.lqeggnwhkg();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean dxjokdxxww(j0 j0Var) {
                return j0Var.nufgyqmvbu() > 0.0f;
            }

            @Override // jztzpxfvev.opjhrmiecq
            public boolean eablkybsjg() {
                return ((Boolean) this.f73492zoijcleaow.getValue()).booleanValue();
            }

            @Override // jztzpxfvev.opjhrmiecq
            public float gxszxtbevo(float f13) {
                return this.f73490iobyxmoadg.gxszxtbevo(f13);
            }

            @Override // jztzpxfvev.opjhrmiecq
            public boolean iobyxmoadg() {
                return this.f73490iobyxmoadg.iobyxmoadg();
            }

            @Override // jztzpxfvev.opjhrmiecq
            public boolean ppxfxbqfkf() {
                return ((Boolean) this.f73491ppxfxbqfkf.getValue()).booleanValue();
            }

            @Override // jztzpxfvev.opjhrmiecq
            public Object zoijcleaow(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                return this.f73490iobyxmoadg.zoijcleaow(ribwqtqdhbVar, rgvfuqvkyqVar, gxszxtbevoVar);
            }
        }

        ppxfxbqfkf(j0 j0Var, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar) {
            this.f73489zdlpuopuiu = j0Var;
            this.f73488yggfygwlhe = z13;
            this.f73487jyumaefscl = draadjrbmkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float ppxfxbqfkf(j0 j0Var, float f13) {
            float fNufgyqmvbu = j0Var.nufgyqmvbu() + f13;
            if (fNufgyqmvbu > j0Var.lqeggnwhkg()) {
                f13 = j0Var.lqeggnwhkg() - j0Var.nufgyqmvbu();
            } else if (fNufgyqmvbu < 0.0f) {
                f13 = -j0Var.nufgyqmvbu();
            }
            j0Var.draadjrbmk(j0Var.nufgyqmvbu() + f13);
            return f13;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return zoijcleaow((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(805428266);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(805428266, i13, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
            }
            boolean z13 = this.f73489zdlpuopuiu.btonecajqb() == jztzpxfvev.jlmebxxoox.Vertical || !(draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.draadjrbmk()) == w0.zdlpuopuiu.Rtl);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f73489zdlpuopuiu);
            final j0 j0Var = this.f73489zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: opjhrmiecq.d0
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Float.valueOf(c0.ppxfxbqfkf.ppxfxbqfkf(j0Var, ((Float) obj).floatValue()));
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            jztzpxfvev.opjhrmiecq opjhrmiecqVarPpxfxbqfkf = jztzpxfvev.weqkydbzbr.ppxfxbqfkf((tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar, 0);
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(opjhrmiecqVarPpxfxbqfkf) | draadjrbmkVar.ulzqkzuiru(this.f73489zdlpuopuiu);
            j0 j0Var2 = this.f73489zdlpuopuiu;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new iobyxmoadg(opjhrmiecqVarPpxfxbqfkf, j0Var2);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWflxmlrfwp = androidx.compose.foundation.gestures.iobyxmoadg.wflxmlrfwp(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, (iobyxmoadg) objYadqdtsiqt2, this.f73489zdlpuopuiu.btonecajqb(), this.f73488yggfygwlhe && this.f73489zdlpuopuiu.lqeggnwhkg() != 0.0f, z13, null, this.f73487jyumaefscl, 16, null);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarWflxmlrfwp;
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f73493jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f73494yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ j0 f73495zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(j0 j0Var, metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z13) {
            super(1);
            this.f73495zdlpuopuiu = j0Var;
            this.f73494yggfygwlhe = draadjrbmkVar;
            this.f73493jyumaefscl = z13;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.platform.ixidwrxhsl ixidwrxhslVar) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.lqeggnwhkg ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, p0.jhduphickx jhduphickxVar, j0.f fVar, boolean z13, int i14) {
        g.lqeggnwhkg lqeggnwhkgVarIobyxmoadg;
        if (fVar == null || (lqeggnwhkgVarIobyxmoadg = fVar.eablkybsjg(jhduphickxVar.iobyxmoadg().zoijcleaow(i13))) == null) {
            lqeggnwhkgVarIobyxmoadg = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
        }
        g.lqeggnwhkg lqeggnwhkgVar = lqeggnwhkgVarIobyxmoadg;
        int iHszhottldk = wkgbmnqykcVar.hszhottldk(f.iobyxmoadg());
        return g.lqeggnwhkg.wkgbmnqykc(lqeggnwhkgVar, z13 ? (i14 - lqeggnwhkgVar.nufgyqmvbu()) - iHszhottldk : lqeggnwhkgVar.nufgyqmvbu(), 0.0f, z13 ? i14 - lqeggnwhkgVar.nufgyqmvbu() : lqeggnwhkgVar.nufgyqmvbu() + iHszhottldk, 0.0f, 10, null);
    }

    public static final androidx.compose.ui.wkgbmnqykc wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, j0 j0Var, metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z13) {
        return androidx.compose.ui.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new zoijcleaow(j0Var, draadjrbmkVar, z13) : InspectableValueKt.getNoInspectorInfo(), new ppxfxbqfkf(j0Var, z13, draadjrbmkVar));
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, j0 j0Var, p0.tzroggbefp tzroggbefpVar, p0.okpsazkaxt okpsazkaxtVar, tg.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.wkgbmnqykc t1Var;
        jztzpxfvev.jlmebxxoox jlmebxxooxVarBtonecajqb = j0Var.btonecajqb();
        int iDxjokdxxww = j0Var.dxjokdxxww(tzroggbefpVar.gtknphoqwx());
        j0Var.wflxmlrfwp(tzroggbefpVar.gtknphoqwx());
        p0.jhduphickx jhduphickxVarPpxfxbqfkf = r1.ppxfxbqfkf(okpsazkaxtVar, tzroggbefpVar.dxjokdxxww());
        int i13 = iobyxmoadg.f73486iobyxmoadg[jlmebxxooxVarBtonecajqb.ordinal()];
        if (i13 == 1) {
            t1Var = new t1(j0Var, iDxjokdxxww, jhduphickxVarPpxfxbqfkf, iobyxmoadgVar);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            t1Var = new bfopjjpdmp(j0Var, iDxjokdxxww, jhduphickxVarPpxfxbqfkf, iobyxmoadgVar);
        }
        return e.eablkybsjg.zoijcleaow(wkgbmnqykcVar).eablkybsjg(t1Var);
    }
}
