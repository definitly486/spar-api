package s0;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.v0;
import h.a;
import h.bfopjjpdmp;
import h.c;
import h.dsvhmnatus;
import h.f;
import h.grlcpdaxtj;
import h.ipoelvxyzq;
import h.jztzpxfvev;
import h.oipsdeybqn;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends TextPaint {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private j.lqeggnwhkg f105110dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private oipsdeybqn f105111eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private jztzpxfvev f105112gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ipoelvxyzq f105113iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private i1 f105114lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private g.gtknphoqwx f105115nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f105116ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private c f105117wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private v0.gtknphoqwx f105118zoijcleaow;

    public dxjokdxxww(int i13, float f13) {
        super(i13);
        ((TextPaint) this).density = f13;
        this.f105118zoijcleaow = v0.gtknphoqwx.f114956zoijcleaow.ppxfxbqfkf();
        this.f105116ppxfxbqfkf = j.gxszxtbevo.f50103lqeggnwhkg.iobyxmoadg();
        this.f105117wkgbmnqykc = c.f38870wkgbmnqykc.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader lqeggnwhkg(jztzpxfvev jztzpxfvevVar, long j13) {
        return ((a) jztzpxfvevVar).zoijcleaow(j13);
    }

    private final ipoelvxyzq wkgbmnqykc() {
        ipoelvxyzq ipoelvxyzqVar = this.f105113iobyxmoadg;
        if (ipoelvxyzqVar != null) {
            return ipoelvxyzqVar;
        }
        ipoelvxyzq ipoelvxyzqVarZoijcleaow = dsvhmnatus.zoijcleaow(this);
        this.f105113iobyxmoadg = ipoelvxyzqVarZoijcleaow;
        return ipoelvxyzqVarZoijcleaow;
    }

    private final void zoijcleaow() {
        this.f105114lqeggnwhkg = null;
        this.f105112gxszxtbevo = null;
        this.f105115nufgyqmvbu = null;
        setShader(null);
    }

    public final void btonecajqb(c cVar) {
        if (cVar == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f105117wkgbmnqykc, cVar)) {
            return;
        }
        this.f105117wkgbmnqykc = cVar;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cVar, c.f38870wkgbmnqykc.iobyxmoadg())) {
            clearShadowLayer();
        } else {
            setShadowLayer(t0.eablkybsjg.zoijcleaow(this.f105117wkgbmnqykc.zoijcleaow()), Float.intBitsToFloat((int) (this.f105117wkgbmnqykc.wkgbmnqykc() >> 32)), Float.intBitsToFloat((int) (this.f105117wkgbmnqykc.wkgbmnqykc() & 4294967295L)), bfopjjpdmp.nufgyqmvbu(this.f105117wkgbmnqykc.ppxfxbqfkf()));
        }
    }

    public final void dxjokdxxww(j.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f105110dxjokdxxww, lqeggnwhkgVar)) {
            return;
        }
        this.f105110dxjokdxxww = lqeggnwhkgVar;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, j.btonecajqb.f50092iobyxmoadg)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(lqeggnwhkgVar instanceof j.gtknphoqwx)) {
            throw new NoWhenBranchMatchedException();
        }
        wkgbmnqykc().jyumaefscl(grlcpdaxtj.f38895iobyxmoadg.zoijcleaow());
        j.gtknphoqwx gtknphoqwxVar = (j.gtknphoqwx) lqeggnwhkgVar;
        wkgbmnqykc().setStrokeWidth(gtknphoqwxVar.gxszxtbevo());
        wkgbmnqykc().zdlpuopuiu(gtknphoqwxVar.wkgbmnqykc());
        wkgbmnqykc().draadjrbmk(gtknphoqwxVar.ppxfxbqfkf());
        wkgbmnqykc().dxjokdxxww(gtknphoqwxVar.zoijcleaow());
        wkgbmnqykc().iwizpuwonk(gtknphoqwxVar.eablkybsjg());
    }

    public final void eablkybsjg(int i13) {
        if (androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(i13, this.f105116ppxfxbqfkf)) {
            return;
        }
        wkgbmnqykc().ppxfxbqfkf(i13);
        this.f105116ppxfxbqfkf = i13;
    }

    public final void gtknphoqwx(v0.gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f105118zoijcleaow, gtknphoqwxVar)) {
            return;
        }
        this.f105118zoijcleaow = gtknphoqwxVar;
        v0.gtknphoqwx.iobyxmoadg iobyxmoadgVar = v0.gtknphoqwx.f114956zoijcleaow;
        setUnderlineText(gtknphoqwxVar.wkgbmnqykc(iobyxmoadgVar.wkgbmnqykc()));
        setStrikeThruText(this.f105118zoijcleaow.wkgbmnqykc(iobyxmoadgVar.zoijcleaow()));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    public final void gxszxtbevo(final jztzpxfvev jztzpxfvevVar, final long j13, float f13) {
        if (jztzpxfvevVar == null) {
            zoijcleaow();
            return;
        }
        if (jztzpxfvevVar instanceof f) {
            nufgyqmvbu(v0.wflxmlrfwp.ppxfxbqfkf(((f) jztzpxfvevVar).zoijcleaow(), f13));
            return;
        }
        if (!(jztzpxfvevVar instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f105112gxszxtbevo, jztzpxfvevVar)) {
            g.gtknphoqwx gtknphoqwxVar = this.f105115nufgyqmvbu;
            if (!(gtknphoqwxVar == null ? false : g.gtknphoqwx.nufgyqmvbu(gtknphoqwxVar.ojitshcjhn(), j13))) {
                if (j13 != 9205357640488583168L) {
                    this.f105112gxszxtbevo = jztzpxfvevVar;
                    this.f105115nufgyqmvbu = g.gtknphoqwx.ppxfxbqfkf(j13);
                    this.f105114lqeggnwhkg = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: s0.nufgyqmvbu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return dxjokdxxww.lqeggnwhkg(jztzpxfvevVar, j13);
                        }
                    });
                }
            }
        } else {
            if (j13 != 9205357640488583168L) {
                this.f105112gxszxtbevo = jztzpxfvevVar;
                this.f105115nufgyqmvbu = g.gtknphoqwx.ppxfxbqfkf(j13);
                this.f105114lqeggnwhkg = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: s0.nufgyqmvbu
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return dxjokdxxww.lqeggnwhkg(jztzpxfvevVar, j13);
                    }
                });
            }
        }
        ipoelvxyzq ipoelvxyzqVarWkgbmnqykc = wkgbmnqykc();
        i1 i1Var = this.f105114lqeggnwhkg;
        ipoelvxyzqVarWkgbmnqykc.oxmwwwfdhm(i1Var != null ? (Shader) i1Var.getValue() : null);
        this.f105111eablkybsjg = null;
        btonecajqb.iobyxmoadg(this, f13);
    }

    public final void nufgyqmvbu(long j13) {
        oipsdeybqn oipsdeybqnVar = this.f105111eablkybsjg;
        if (oipsdeybqnVar == null ? false : oipsdeybqn.ojitshcjhn(oipsdeybqnVar.iwizpuwonk(), j13)) {
            return;
        }
        if (j13 != 16) {
            this.f105111eablkybsjg = oipsdeybqn.dxjokdxxww(j13);
            setColor(bfopjjpdmp.nufgyqmvbu(j13));
            zoijcleaow();
        }
    }

    public final int ppxfxbqfkf() {
        return this.f105116ppxfxbqfkf;
    }
}
