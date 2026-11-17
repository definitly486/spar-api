package k7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn implements l7.iobyxmoadg.zoijcleaow, gtknphoqwx, wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hcddaimhww f54048eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f54049gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final l7.iobyxmoadg f54050gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l7.iobyxmoadg f54052lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final l7.iobyxmoadg f54053nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f54054ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f54055wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f54051iobyxmoadg = new Path();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final RectF f54056zoijcleaow = new RectF();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final zoijcleaow f54047dxjokdxxww = new zoijcleaow();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private l7.iobyxmoadg f54046btonecajqb = null;

    public ojitshcjhn(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.draadjrbmk draadjrbmkVar) {
        this.f54054ppxfxbqfkf = draadjrbmkVar.ppxfxbqfkf();
        this.f54055wkgbmnqykc = draadjrbmkVar.gxszxtbevo();
        this.f54048eablkybsjg = hcddaimhwwVar;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = draadjrbmkVar.wkgbmnqykc().eablkybsjg();
        this.f54050gxszxtbevo = iobyxmoadgVarEablkybsjg;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = draadjrbmkVar.eablkybsjg().eablkybsjg();
        this.f54052lqeggnwhkg = iobyxmoadgVarEablkybsjg2;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg3 = draadjrbmkVar.zoijcleaow().eablkybsjg();
        this.f54053nufgyqmvbu = iobyxmoadgVarEablkybsjg3;
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg3);
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg3.iobyxmoadg(this);
    }

    private void lqeggnwhkg() {
        this.f54049gtknphoqwx = false;
        this.f54048eablkybsjg.invalidateSelf();
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54054ppxfxbqfkf;
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        l7.iobyxmoadg iobyxmoadgVar;
        if (this.f54049gtknphoqwx) {
            return this.f54051iobyxmoadg;
        }
        this.f54051iobyxmoadg.reset();
        if (this.f54055wkgbmnqykc) {
            this.f54049gtknphoqwx = true;
            return this.f54051iobyxmoadg;
        }
        PointF pointF = (PointF) this.f54052lqeggnwhkg.nufgyqmvbu();
        float f13 = pointF.x / 2.0f;
        float f14 = pointF.y / 2.0f;
        l7.iobyxmoadg iobyxmoadgVar2 = this.f54053nufgyqmvbu;
        float fVdvldrhtss = iobyxmoadgVar2 == null ? 0.0f : ((l7.wkgbmnqykc) iobyxmoadgVar2).vdvldrhtss();
        if (fVdvldrhtss == 0.0f && (iobyxmoadgVar = this.f54046btonecajqb) != null) {
            fVdvldrhtss = Math.min(((Float) iobyxmoadgVar.nufgyqmvbu()).floatValue(), Math.min(f13, f14));
        }
        float fMin = Math.min(f13, f14);
        if (fVdvldrhtss > fMin) {
            fVdvldrhtss = fMin;
        }
        PointF pointF2 = (PointF) this.f54050gxszxtbevo.nufgyqmvbu();
        this.f54051iobyxmoadg.moveTo(pointF2.x + f13, (pointF2.y - f14) + fVdvldrhtss);
        this.f54051iobyxmoadg.lineTo(pointF2.x + f13, (pointF2.y + f14) - fVdvldrhtss);
        if (fVdvldrhtss > 0.0f) {
            RectF rectF = this.f54056zoijcleaow;
            float f15 = pointF2.x;
            float f16 = fVdvldrhtss * 2.0f;
            float f17 = pointF2.y;
            rectF.set((f15 + f13) - f16, (f17 + f14) - f16, f15 + f13, f17 + f14);
            this.f54051iobyxmoadg.arcTo(this.f54056zoijcleaow, 0.0f, 90.0f, false);
        }
        this.f54051iobyxmoadg.lineTo((pointF2.x - f13) + fVdvldrhtss, pointF2.y + f14);
        if (fVdvldrhtss > 0.0f) {
            RectF rectF2 = this.f54056zoijcleaow;
            float f18 = pointF2.x;
            float f19 = pointF2.y;
            float f23 = fVdvldrhtss * 2.0f;
            rectF2.set(f18 - f13, (f19 + f14) - f23, (f18 - f13) + f23, f19 + f14);
            this.f54051iobyxmoadg.arcTo(this.f54056zoijcleaow, 90.0f, 90.0f, false);
        }
        this.f54051iobyxmoadg.lineTo(pointF2.x - f13, (pointF2.y - f14) + fVdvldrhtss);
        if (fVdvldrhtss > 0.0f) {
            RectF rectF3 = this.f54056zoijcleaow;
            float f24 = pointF2.x;
            float f25 = pointF2.y;
            float f26 = fVdvldrhtss * 2.0f;
            rectF3.set(f24 - f13, f25 - f14, (f24 - f13) + f26, (f25 - f14) + f26);
            this.f54051iobyxmoadg.arcTo(this.f54056zoijcleaow, 180.0f, 90.0f, false);
        }
        this.f54051iobyxmoadg.lineTo((pointF2.x + f13) - fVdvldrhtss, pointF2.y - f14);
        if (fVdvldrhtss > 0.0f) {
            RectF rectF4 = this.f54056zoijcleaow;
            float f27 = pointF2.x;
            float f28 = fVdvldrhtss * 2.0f;
            float f29 = pointF2.y;
            rectF4.set((f27 + f13) - f28, f29 - f14, f27 + f13, (f29 - f14) + f28);
            this.f54051iobyxmoadg.arcTo(this.f54056zoijcleaow, 270.0f, 90.0f, false);
        }
        this.f54051iobyxmoadg.close();
        this.f54047dxjokdxxww.zoijcleaow(this.f54051iobyxmoadg);
        this.f54049gtknphoqwx = true;
        return this.f54051iobyxmoadg;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        lqeggnwhkg();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        if (obj == dsvhmnatus.f20360draadjrbmk) {
            this.f54052lqeggnwhkg.ojitshcjhn(ppxfxbqfkfVar);
        } else if (obj == dsvhmnatus.f20355agtfadlqog) {
            this.f54050gxszxtbevo.ojitshcjhn(ppxfxbqfkfVar);
        } else if (obj == dsvhmnatus.f20387wflxmlrfwp) {
            this.f54053nufgyqmvbu.ojitshcjhn(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(i13);
            if (ppxfxbqfkfVar instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar = (yggfygwlhe) ppxfxbqfkfVar;
                if (yggfygwlheVar.gtknphoqwx() == q7.zdlpuopuiu.iobyxmoadg.SIMULTANEOUSLY) {
                    this.f54047dxjokdxxww.iobyxmoadg(yggfygwlheVar);
                    yggfygwlheVar.ppxfxbqfkf(this);
                } else if (ppxfxbqfkfVar instanceof vdvldrhtss) {
                    this.f54046btonecajqb = ((vdvldrhtss) ppxfxbqfkfVar).nufgyqmvbu();
                }
            } else if (ppxfxbqfkfVar instanceof vdvldrhtss) {
                this.f54046btonecajqb = ((vdvldrhtss) ppxfxbqfkfVar).nufgyqmvbu();
            }
        }
    }
}
