package iwxlajgraz;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import j0.f;

/* JADX INFO: loaded from: classes.dex */
public final class wizcaqwiak {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private g.lqeggnwhkg f49935agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private p0.tzroggbefp f49936btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private p0.ylkuphrtab f49937draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f49938dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f49939eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private f f49940gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f49941gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f49942iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f49943lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f49944nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private g.lqeggnwhkg f49949wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f49950wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwxlajgraz f49951zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f49946ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f49945ojitshcjhn = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final float[] f49947rgvfuqvkyq = h.hszhottldk.ppxfxbqfkf(null, 1, null);

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final Matrix f49948vdvldrhtss = new Matrix();

    public wizcaqwiak(tg.draadjrbmk draadjrbmkVar, iwxlajgraz iwxlajgrazVar) {
        this.f49942iobyxmoadg = draadjrbmkVar;
        this.f49951zoijcleaow = iwxlajgrazVar;
    }

    private final void ppxfxbqfkf() {
        if (!this.f49951zoijcleaow.isActive() || this.f49936btonecajqb == null || this.f49937draadjrbmk == null || this.f49940gtknphoqwx == null || this.f49949wflxmlrfwp == null || this.f49935agtfadlqog == null) {
            return;
        }
        h.hszhottldk.nufgyqmvbu(this.f49947rgvfuqvkyq);
        this.f49942iobyxmoadg.invoke(h.hszhottldk.iobyxmoadg(this.f49947rgvfuqvkyq));
        float[] fArr = this.f49947rgvfuqvkyq;
        g.lqeggnwhkg lqeggnwhkgVar = this.f49935agtfadlqog;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVar);
        float f13 = -lqeggnwhkgVar.nufgyqmvbu();
        g.lqeggnwhkg lqeggnwhkgVar2 = this.f49935agtfadlqog;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVar2);
        h.hszhottldk.agtfadlqog(fArr, f13, -lqeggnwhkgVar2.gtknphoqwx(), 0.0f);
        h.cllcsxoeiz.iobyxmoadg(this.f49948vdvldrhtss, this.f49947rgvfuqvkyq);
        iwxlajgraz iwxlajgrazVar = this.f49951zoijcleaow;
        CursorAnchorInfo.Builder builder = this.f49945ojitshcjhn;
        p0.tzroggbefp tzroggbefpVar = this.f49936btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(tzroggbefpVar);
        p0.ylkuphrtab ylkuphrtabVar = this.f49937draadjrbmk;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ylkuphrtabVar);
        f fVar = this.f49940gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fVar);
        Matrix matrix = this.f49948vdvldrhtss;
        g.lqeggnwhkg lqeggnwhkgVar3 = this.f49949wflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVar3);
        g.lqeggnwhkg lqeggnwhkgVar4 = this.f49935agtfadlqog;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVar4);
        iwxlajgrazVar.wkgbmnqykc(lxfrhoxuzk.zoijcleaow(builder, tzroggbefpVar, ylkuphrtabVar, fVar, matrix, lqeggnwhkgVar3, lqeggnwhkgVar4, this.f49941gxszxtbevo, this.f49943lqeggnwhkg, this.f49944nufgyqmvbu, this.f49938dxjokdxxww));
        this.f49939eablkybsjg = false;
    }

    public final void iobyxmoadg() {
        synchronized (this.f49946ppxfxbqfkf) {
            this.f49936btonecajqb = null;
            this.f49937draadjrbmk = null;
            this.f49940gtknphoqwx = null;
            this.f49949wflxmlrfwp = null;
            this.f49935agtfadlqog = null;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final void wkgbmnqykc(p0.tzroggbefp tzroggbefpVar, p0.ylkuphrtab ylkuphrtabVar, f fVar, g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2) {
        synchronized (this.f49946ppxfxbqfkf) {
            try {
                this.f49936btonecajqb = tzroggbefpVar;
                this.f49937draadjrbmk = ylkuphrtabVar;
                this.f49940gtknphoqwx = fVar;
                this.f49949wflxmlrfwp = lqeggnwhkgVar;
                this.f49935agtfadlqog = lqeggnwhkgVar2;
                if (this.f49939eablkybsjg || this.f49950wkgbmnqykc) {
                    ppxfxbqfkf();
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zoijcleaow(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        synchronized (this.f49946ppxfxbqfkf) {
            try {
                this.f49941gxszxtbevo = z15;
                this.f49943lqeggnwhkg = z16;
                this.f49944nufgyqmvbu = z17;
                this.f49938dxjokdxxww = z18;
                if (z13) {
                    this.f49939eablkybsjg = true;
                    if (this.f49936btonecajqb != null) {
                        ppxfxbqfkf();
                    }
                }
                this.f49950wkgbmnqykc = z14;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
