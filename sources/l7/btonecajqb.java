package l7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb extends lqeggnwhkg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final float[] f61712btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final PathMeasure f61713draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final PointF f61714dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final float[] f61715gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private dxjokdxxww f61716wflxmlrfwp;

    public btonecajqb(List list) {
        super(list);
        this.f61714dxjokdxxww = new PointF();
        this.f61712btonecajqb = new float[2];
        this.f61715gtknphoqwx = new float[2];
        this.f61713draadjrbmk = new PathMeasure();
    }

    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public PointF dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        PointF pointF;
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar;
        Path pathGtknphoqwx = dxjokdxxwwVar.gtknphoqwx();
        if (pathGtknphoqwx == null) {
            return (PointF) iobyxmoadgVar.f118920zoijcleaow;
        }
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        if (ppxfxbqfkfVar != null && (pointF = (PointF) ppxfxbqfkfVar.zoijcleaow(dxjokdxxwwVar.f118913lqeggnwhkg, dxjokdxxwwVar.f118914nufgyqmvbu.floatValue(), (PointF) dxjokdxxwwVar.f118920zoijcleaow, (PointF) dxjokdxxwwVar.f118916ppxfxbqfkf, eablkybsjg(), f13, gxszxtbevo())) != null) {
            return pointF;
        }
        if (this.f61716wflxmlrfwp != dxjokdxxwwVar) {
            this.f61713draadjrbmk.setPath(pathGtknphoqwx, false);
            this.f61716wflxmlrfwp = dxjokdxxwwVar;
        }
        float length = this.f61713draadjrbmk.getLength();
        float f14 = f13 * length;
        this.f61713draadjrbmk.getPosTan(f14, this.f61712btonecajqb, this.f61715gtknphoqwx);
        PointF pointF2 = this.f61714dxjokdxxww;
        float[] fArr = this.f61712btonecajqb;
        pointF2.set(fArr[0], fArr[1]);
        if (f14 < 0.0f) {
            PointF pointF3 = this.f61714dxjokdxxww;
            float[] fArr2 = this.f61715gtknphoqwx;
            pointF3.offset(fArr2[0] * f14, fArr2[1] * f14);
        } else if (f14 > length) {
            PointF pointF4 = this.f61714dxjokdxxww;
            float[] fArr3 = this.f61715gtknphoqwx;
            float f15 = f14 - length;
            pointF4.offset(fArr3[0] * f15, fArr3[1] * f15);
        }
        return this.f61714dxjokdxxww;
    }
}
