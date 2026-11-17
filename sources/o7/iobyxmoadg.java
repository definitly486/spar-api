package o7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PointF f72192iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final PointF f72193ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final PointF f72194zoijcleaow;

    public iobyxmoadg() {
        this.f72192iobyxmoadg = new PointF();
        this.f72194zoijcleaow = new PointF();
        this.f72193ppxfxbqfkf = new PointF();
    }

    public void eablkybsjg(float f13, float f14) {
        this.f72194zoijcleaow.set(f13, f14);
    }

    public void gxszxtbevo(float f13, float f14) {
        this.f72193ppxfxbqfkf.set(f13, f14);
    }

    public PointF iobyxmoadg() {
        return this.f72192iobyxmoadg;
    }

    public PointF ppxfxbqfkf() {
        return this.f72193ppxfxbqfkf;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f72193ppxfxbqfkf.x), Float.valueOf(this.f72193ppxfxbqfkf.y), Float.valueOf(this.f72192iobyxmoadg.x), Float.valueOf(this.f72192iobyxmoadg.y), Float.valueOf(this.f72194zoijcleaow.x), Float.valueOf(this.f72194zoijcleaow.y));
    }

    public void wkgbmnqykc(float f13, float f14) {
        this.f72192iobyxmoadg.set(f13, f14);
    }

    public PointF zoijcleaow() {
        return this.f72194zoijcleaow;
    }

    public iobyxmoadg(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f72192iobyxmoadg = pointF;
        this.f72194zoijcleaow = pointF2;
        this.f72193ppxfxbqfkf = pointF3;
    }
}
