package l7;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww extends w7.iobyxmoadg {

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final w7.iobyxmoadg f61718oxmwwwfdhm;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private Path f61719vdvldrhtss;

    public dxjokdxxww(com.airbnb.lottie.btonecajqb btonecajqbVar, w7.iobyxmoadg iobyxmoadgVar) {
        super(btonecajqbVar, (PointF) iobyxmoadgVar.f118920zoijcleaow, (PointF) iobyxmoadgVar.f118916ppxfxbqfkf, iobyxmoadgVar.f118919wkgbmnqykc, iobyxmoadgVar.f118909eablkybsjg, iobyxmoadgVar.f118911gxszxtbevo, iobyxmoadgVar.f118913lqeggnwhkg, iobyxmoadgVar.f118914nufgyqmvbu);
        this.f61718oxmwwwfdhm = iobyxmoadgVar;
        btonecajqb();
    }

    public void btonecajqb() {
        Object obj;
        Object obj2;
        Object obj3 = this.f118916ppxfxbqfkf;
        boolean z13 = (obj3 == null || (obj2 = this.f118920zoijcleaow) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f118920zoijcleaow;
        if (obj4 == null || (obj = this.f118916ppxfxbqfkf) == null || z13) {
            return;
        }
        w7.iobyxmoadg iobyxmoadgVar = this.f61718oxmwwwfdhm;
        this.f61719vdvldrhtss = v7.btonecajqb.wkgbmnqykc((PointF) obj4, (PointF) obj, iobyxmoadgVar.f118915ojitshcjhn, iobyxmoadgVar.f118917rgvfuqvkyq);
    }

    Path gtknphoqwx() {
        return this.f61719vdvldrhtss;
    }
}
