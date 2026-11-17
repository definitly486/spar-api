package androidx.compose.foundation.lazy.layout;

import vipkmwdibw.ezmngbhpjk;
import vipkmwdibw.p;

/* JADX INFO: loaded from: classes.dex */
public final class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private pj.auzgnhcxok f5110iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private vipkmwdibw.wflxmlrfwp f5111zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5113zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ribwqtqdhb.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5113zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.wflxmlrfwp wflxmlrfwpVar = ribwqtqdhb.this.f5111zoijcleaow;
                Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(0.0f);
                vipkmwdibw.czzsidtyhn czzsidtyhnVarBtonecajqb = vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 400.0f, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(0.5f), 1, null);
                this.f5113zdlpuopuiu = 1;
                if (vipkmwdibw.tbqsvytpvh.esjtqupxsv(wflxmlrfwpVar, fPpxfxbqfkf, czzsidtyhnVarBtonecajqb, true, null, this, 8, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ribwqtqdhb() {
        ezmngbhpjk ezmngbhpjkVarDsvhmnatus = p.dsvhmnatus(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg);
        Float fValueOf = Float.valueOf(0.0f);
        this.f5111zoijcleaow = vipkmwdibw.agtfadlqog.zoijcleaow(ezmngbhpjkVarDsvhmnatus, fValueOf, fValueOf, (56 & 8) != 0 ? Long.MIN_VALUE : 0L, (56 & 16) != 0 ? Long.MIN_VALUE : 0L, (56 & 32) != 0 ? false : false);
    }

    public final void eablkybsjg(float f13, w0.wkgbmnqykc wkgbmnqykcVar, pj.cllcsxoeiz cllcsxoeizVar) {
        if (f13 <= wkgbmnqykcVar.I(vipkmwdibw.f5187iobyxmoadg)) {
            return;
        }
        androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
        try {
            float fFloatValue = ((Number) this.f5111zoijcleaow.getValue()).floatValue();
            pj.auzgnhcxok auzgnhcxokVar = this.f5110iobyxmoadg;
            if (auzgnhcxokVar != null) {
                pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
            }
            if (this.f5111zoijcleaow.rgvfuqvkyq()) {
                this.f5111zoijcleaow = vipkmwdibw.agtfadlqog.lqeggnwhkg(this.f5111zoijcleaow, fFloatValue - f13, 0.0f, 0L, 0L, false, 30, null);
            } else {
                this.f5111zoijcleaow = new vipkmwdibw.wflxmlrfwp(p.dsvhmnatus(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg), Float.valueOf(-f13), null, 0L, 0L, false, 60, null);
            }
            this.f5110iobyxmoadg = pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(null), 3, null);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
        }
    }

    public final boolean ppxfxbqfkf() {
        return !(((Number) this.f5111zoijcleaow.getValue()).floatValue() == 0.0f);
    }

    public final void wkgbmnqykc() {
        pj.auzgnhcxok auzgnhcxokVar = this.f5110iobyxmoadg;
        if (auzgnhcxokVar != null) {
            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f5111zoijcleaow = new vipkmwdibw.wflxmlrfwp(p.dsvhmnatus(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg), Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }

    public final float zoijcleaow() {
        return ((Number) this.f5111zoijcleaow.getValue()).floatValue();
    }
}
