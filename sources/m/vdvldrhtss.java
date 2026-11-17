package m;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.uawqvzlxes;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss extends l.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final int f64748agtfadlqog = 8;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final uawqvzlxes f64749btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private androidx.compose.ui.graphics.wkgbmnqykc f64750draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final wflxmlrfwp f64751dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f64752gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final iwxlajgraz f64753lqeggnwhkg = c1.ppxfxbqfkf(g.gtknphoqwx.ppxfxbqfkf(g.gtknphoqwx.f35588zoijcleaow.zoijcleaow()), null, 2, null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iwxlajgraz f64754nufgyqmvbu = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f64755wflxmlrfwp;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            if (vdvldrhtss.this.f64755wflxmlrfwp == vdvldrhtss.this.ojitshcjhn()) {
                vdvldrhtss.this.kcexrzcfyt(vdvldrhtss.this.ojitshcjhn() + 1);
            }
        }
    }

    public vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar) {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(ppxfxbqfkfVar);
        wflxmlrfwpVar.ojitshcjhn(new iobyxmoadg());
        this.f64751dxjokdxxww = wflxmlrfwpVar;
        this.f64749btonecajqb = j0.iobyxmoadg(0);
        this.f64752gtknphoqwx = 1.0f;
        this.f64755wflxmlrfwp = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kcexrzcfyt(int i13) {
        this.f64749btonecajqb.btonecajqb(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int ojitshcjhn() {
        return this.f64749btonecajqb.gxszxtbevo();
    }

    public final boolean agtfadlqog() {
        return ((Boolean) this.f64754nufgyqmvbu.getValue()).booleanValue();
    }

    @Override // l.ppxfxbqfkf
    protected void btonecajqb(j.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar = this.f64751dxjokdxxww;
        androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = this.f64750draadjrbmk;
        if (wkgbmnqykcVarGtknphoqwx == null) {
            wkgbmnqykcVarGtknphoqwx = wflxmlrfwpVar.gtknphoqwx();
        }
        if (agtfadlqog() && gxszxtbevoVar.getLayoutDirection() == zdlpuopuiu.Rtl) {
            long jQ = gxszxtbevoVar.Q();
            j.wkgbmnqykc wkgbmnqykcVarK = gxszxtbevoVar.K();
            long jZoijcleaow = wkgbmnqykcVarK.zoijcleaow();
            wkgbmnqykcVarK.gxszxtbevo().jyumaefscl();
            try {
                wkgbmnqykcVarK.wkgbmnqykc().gxszxtbevo(-1.0f, 1.0f, jQ);
                wflxmlrfwpVar.dxjokdxxww(gxszxtbevoVar, this.f64752gtknphoqwx, wkgbmnqykcVarGtknphoqwx);
                wkgbmnqykcVarK.gxszxtbevo().agtfadlqog();
                wkgbmnqykcVarK.nufgyqmvbu(jZoijcleaow);
            } catch (Throwable th2) {
                wkgbmnqykcVarK.gxszxtbevo().agtfadlqog();
                wkgbmnqykcVarK.nufgyqmvbu(jZoijcleaow);
                throw th2;
            }
        } else {
            wflxmlrfwpVar.dxjokdxxww(gxszxtbevoVar, this.f64752gtknphoqwx, wkgbmnqykcVarGtknphoqwx);
        }
        this.f64755wflxmlrfwp = ojitshcjhn();
    }

    @Override // l.ppxfxbqfkf
    protected boolean iobyxmoadg(float f13) {
        this.f64752gtknphoqwx = f13;
        return true;
    }

    public final void jyumaefscl(long j13) {
        this.f64751dxjokdxxww.vdvldrhtss(j13);
    }

    @Override // l.ppxfxbqfkf
    public long nufgyqmvbu() {
        return rgvfuqvkyq();
    }

    public final void oxmwwwfdhm(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f64751dxjokdxxww.agtfadlqog(wkgbmnqykcVar);
    }

    public final long rgvfuqvkyq() {
        return ((g.gtknphoqwx) this.f64753lqeggnwhkg.getValue()).ojitshcjhn();
    }

    public final void vdvldrhtss(boolean z13) {
        this.f64754nufgyqmvbu.setValue(Boolean.valueOf(z13));
    }

    public final void yggfygwlhe(long j13) {
        this.f64753lqeggnwhkg.setValue(g.gtknphoqwx.ppxfxbqfkf(j13));
    }

    public final void zdlpuopuiu(String str) {
        this.f64751dxjokdxxww.rgvfuqvkyq(str);
    }

    @Override // l.ppxfxbqfkf
    protected boolean zoijcleaow(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f64750draadjrbmk = wkgbmnqykcVar;
        return true;
    }
}
