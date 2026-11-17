package lereixgezr;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public abstract class vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Rational f62443iobyxmoadg;

    public vipkmwdibw() {
        this(null);
    }

    public static float wkgbmnqykc() {
        return 0.15f;
    }

    protected void eablkybsjg(Rational rational) {
        this.f62443iobyxmoadg = rational;
    }

    protected abstract PointF iobyxmoadg(float f13, float f14);

    public final ribwqtqdhb ppxfxbqfkf(float f13, float f14, float f15) {
        PointF pointFIobyxmoadg = iobyxmoadg(f13, f14);
        return new ribwqtqdhb(pointFIobyxmoadg.x, pointFIobyxmoadg.y, f15, this.f62443iobyxmoadg);
    }

    public final ribwqtqdhb zoijcleaow(float f13, float f14) {
        return ppxfxbqfkf(f13, f14, wkgbmnqykc());
    }

    public vipkmwdibw(Rational rational) {
        this.f62443iobyxmoadg = rational;
    }
}
