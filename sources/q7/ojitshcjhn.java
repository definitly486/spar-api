package q7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f78134iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f78135ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private PointF f78136zoijcleaow;

    public ojitshcjhn(PointF pointF, boolean z13, List list) {
        this.f78136zoijcleaow = pointF;
        this.f78135ppxfxbqfkf = z13;
        this.f78134iobyxmoadg = new ArrayList(list);
    }

    public void eablkybsjg(boolean z13) {
        this.f78135ppxfxbqfkf = z13;
    }

    public void gxszxtbevo(float f13, float f14) {
        if (this.f78136zoijcleaow == null) {
            this.f78136zoijcleaow = new PointF();
        }
        this.f78136zoijcleaow.set(f13, f14);
    }

    public List iobyxmoadg() {
        return this.f78134iobyxmoadg;
    }

    public void ppxfxbqfkf(ojitshcjhn ojitshcjhnVar, ojitshcjhn ojitshcjhnVar2, float f13) {
        if (this.f78136zoijcleaow == null) {
            this.f78136zoijcleaow = new PointF();
        }
        this.f78135ppxfxbqfkf = ojitshcjhnVar.wkgbmnqykc() || ojitshcjhnVar2.wkgbmnqykc();
        if (ojitshcjhnVar.iobyxmoadg().size() != ojitshcjhnVar2.iobyxmoadg().size()) {
            v7.wkgbmnqykc.ppxfxbqfkf("Curves must have the same number of control points. Shape 1: " + ojitshcjhnVar.iobyxmoadg().size() + "\tShape 2: " + ojitshcjhnVar2.iobyxmoadg().size());
        }
        int iMin = Math.min(ojitshcjhnVar.iobyxmoadg().size(), ojitshcjhnVar2.iobyxmoadg().size());
        if (this.f78134iobyxmoadg.size() < iMin) {
            for (int size = this.f78134iobyxmoadg.size(); size < iMin; size++) {
                this.f78134iobyxmoadg.add(new o7.iobyxmoadg());
            }
        } else if (this.f78134iobyxmoadg.size() > iMin) {
            for (int size2 = this.f78134iobyxmoadg.size() - 1; size2 >= iMin; size2--) {
                List list = this.f78134iobyxmoadg;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFZoijcleaow = ojitshcjhnVar.zoijcleaow();
        PointF pointFZoijcleaow2 = ojitshcjhnVar2.zoijcleaow();
        gxszxtbevo(v7.dxjokdxxww.dxjokdxxww(pointFZoijcleaow.x, pointFZoijcleaow2.x, f13), v7.dxjokdxxww.dxjokdxxww(pointFZoijcleaow.y, pointFZoijcleaow2.y, f13));
        for (int size3 = this.f78134iobyxmoadg.size() - 1; size3 >= 0; size3--) {
            o7.iobyxmoadg iobyxmoadgVar = (o7.iobyxmoadg) ojitshcjhnVar.iobyxmoadg().get(size3);
            o7.iobyxmoadg iobyxmoadgVar2 = (o7.iobyxmoadg) ojitshcjhnVar2.iobyxmoadg().get(size3);
            PointF pointFIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            PointF pointFZoijcleaow3 = iobyxmoadgVar.zoijcleaow();
            PointF pointFPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            PointF pointFIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
            PointF pointFZoijcleaow4 = iobyxmoadgVar2.zoijcleaow();
            PointF pointFPpxfxbqfkf2 = iobyxmoadgVar2.ppxfxbqfkf();
            ((o7.iobyxmoadg) this.f78134iobyxmoadg.get(size3)).wkgbmnqykc(v7.dxjokdxxww.dxjokdxxww(pointFIobyxmoadg.x, pointFIobyxmoadg2.x, f13), v7.dxjokdxxww.dxjokdxxww(pointFIobyxmoadg.y, pointFIobyxmoadg2.y, f13));
            ((o7.iobyxmoadg) this.f78134iobyxmoadg.get(size3)).eablkybsjg(v7.dxjokdxxww.dxjokdxxww(pointFZoijcleaow3.x, pointFZoijcleaow4.x, f13), v7.dxjokdxxww.dxjokdxxww(pointFZoijcleaow3.y, pointFZoijcleaow4.y, f13));
            ((o7.iobyxmoadg) this.f78134iobyxmoadg.get(size3)).gxszxtbevo(v7.dxjokdxxww.dxjokdxxww(pointFPpxfxbqfkf.x, pointFPpxfxbqfkf2.x, f13), v7.dxjokdxxww.dxjokdxxww(pointFPpxfxbqfkf.y, pointFPpxfxbqfkf2.y, f13));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f78134iobyxmoadg.size() + "closed=" + this.f78135ppxfxbqfkf + '}';
    }

    public boolean wkgbmnqykc() {
        return this.f78135ppxfxbqfkf;
    }

    public PointF zoijcleaow() {
        return this.f78136zoijcleaow;
    }

    public ojitshcjhn() {
        this.f78134iobyxmoadg = new ArrayList();
    }
}
