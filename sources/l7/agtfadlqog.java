package l7;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog extends iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    protected w7.ppxfxbqfkf f61706agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final PointF f61707btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final iobyxmoadg f61708draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final PointF f61709dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final iobyxmoadg f61710gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    protected w7.ppxfxbqfkf f61711wflxmlrfwp;

    public agtfadlqog(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        super(Collections.emptyList());
        this.f61709dxjokdxxww = new PointF();
        this.f61707btonecajqb = new PointF();
        this.f61710gtknphoqwx = iobyxmoadgVar;
        this.f61708draadjrbmk = iobyxmoadgVar2;
        agtfadlqog(gxszxtbevo());
    }

    @Override // l7.iobyxmoadg
    public void agtfadlqog(float f13) {
        this.f61710gtknphoqwx.agtfadlqog(f13);
        this.f61708draadjrbmk.agtfadlqog(f13);
        this.f61709dxjokdxxww.set(((Float) this.f61710gtknphoqwx.nufgyqmvbu()).floatValue(), ((Float) this.f61708draadjrbmk.nufgyqmvbu()).floatValue());
        for (int i13 = 0; i13 < this.f61724iobyxmoadg.size(); i13++) {
            ((iobyxmoadg.zoijcleaow) this.f61724iobyxmoadg.get(i13)).iobyxmoadg();
        }
    }

    public void kcexrzcfyt(w7.ppxfxbqfkf ppxfxbqfkfVar) {
        w7.ppxfxbqfkf ppxfxbqfkfVar2 = this.f61711wflxmlrfwp;
        if (ppxfxbqfkfVar2 != null) {
            ppxfxbqfkfVar2.ppxfxbqfkf(null);
        }
        this.f61711wflxmlrfwp = ppxfxbqfkfVar;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.ppxfxbqfkf(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public PointF dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        Float f14;
        w7.iobyxmoadg iobyxmoadgVarZoijcleaow;
        w7.iobyxmoadg iobyxmoadgVarZoijcleaow2;
        Float f15 = null;
        if (this.f61711wflxmlrfwp == null || (iobyxmoadgVarZoijcleaow2 = this.f61710gtknphoqwx.zoijcleaow()) == null) {
            f14 = null;
        } else {
            float fWkgbmnqykc = this.f61710gtknphoqwx.wkgbmnqykc();
            Float f16 = iobyxmoadgVarZoijcleaow2.f118914nufgyqmvbu;
            w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61711wflxmlrfwp;
            float f17 = iobyxmoadgVarZoijcleaow2.f118913lqeggnwhkg;
            f14 = (Float) ppxfxbqfkfVar.zoijcleaow(f17, f16 == null ? f17 : f16.floatValue(), (Float) iobyxmoadgVarZoijcleaow2.f118920zoijcleaow, (Float) iobyxmoadgVarZoijcleaow2.f118916ppxfxbqfkf, f13, f13, fWkgbmnqykc);
        }
        if (this.f61706agtfadlqog != null && (iobyxmoadgVarZoijcleaow = this.f61708draadjrbmk.zoijcleaow()) != null) {
            float fWkgbmnqykc2 = this.f61708draadjrbmk.wkgbmnqykc();
            Float f18 = iobyxmoadgVarZoijcleaow.f118914nufgyqmvbu;
            w7.ppxfxbqfkf ppxfxbqfkfVar2 = this.f61706agtfadlqog;
            float f19 = iobyxmoadgVarZoijcleaow.f118913lqeggnwhkg;
            f15 = (Float) ppxfxbqfkfVar2.zoijcleaow(f19, f18 == null ? f19 : f18.floatValue(), (Float) iobyxmoadgVarZoijcleaow.f118920zoijcleaow, (Float) iobyxmoadgVarZoijcleaow.f118916ppxfxbqfkf, f13, f13, fWkgbmnqykc2);
        }
        if (f14 == null) {
            this.f61707btonecajqb.set(this.f61709dxjokdxxww.x, 0.0f);
        } else {
            this.f61707btonecajqb.set(f14.floatValue(), 0.0f);
        }
        if (f15 == null) {
            PointF pointF = this.f61707btonecajqb;
            pointF.set(pointF.x, this.f61709dxjokdxxww.y);
        } else {
            PointF pointF2 = this.f61707btonecajqb;
            pointF2.set(pointF2.x, f15.floatValue());
        }
        return this.f61707btonecajqb;
    }

    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public PointF nufgyqmvbu() {
        return dxjokdxxww(null, 0.0f);
    }

    public void zdlpuopuiu(w7.ppxfxbqfkf ppxfxbqfkfVar) {
        w7.ppxfxbqfkf ppxfxbqfkfVar2 = this.f61706agtfadlqog;
        if (ppxfxbqfkfVar2 != null) {
            ppxfxbqfkfVar2.ppxfxbqfkf(null);
        }
        this.f61706agtfadlqog = ppxfxbqfkfVar;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.ppxfxbqfkf(this);
        }
    }
}
