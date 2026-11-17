package l7;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx extends lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final PointF f61721dxjokdxxww;

    public gtknphoqwx(List list) {
        super(list);
        this.f61721dxjokdxxww = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public PointF btonecajqb(w7.iobyxmoadg iobyxmoadgVar, float f13, float f14, float f15) {
        Object obj;
        PointF pointF;
        Object obj2 = iobyxmoadgVar.f118920zoijcleaow;
        if (obj2 == null || (obj = iobyxmoadgVar.f118916ppxfxbqfkf) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        if (ppxfxbqfkfVar != null && (pointF = (PointF) ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar.f118913lqeggnwhkg, iobyxmoadgVar.f118914nufgyqmvbu.floatValue(), pointF2, pointF3, f13, eablkybsjg(), gxszxtbevo())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f61721dxjokdxxww;
        float f16 = pointF2.x;
        float f17 = f16 + (f14 * (pointF3.x - f16));
        float f18 = pointF2.y;
        pointF4.set(f17, f18 + (f15 * (pointF3.y - f18)));
        return this.f61721dxjokdxxww;
    }

    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public PointF dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        return btonecajqb(iobyxmoadgVar, f13, f13, f13);
    }
}
