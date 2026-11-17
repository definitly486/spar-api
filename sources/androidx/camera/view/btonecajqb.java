package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import lereixgezr.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
class btonecajqb extends vipkmwdibw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final PointF f4140eablkybsjg = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Rect f4141ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Matrix f4142wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f4143zoijcleaow;

    btonecajqb(eablkybsjg eablkybsjgVar) {
        this.f4143zoijcleaow = eablkybsjgVar;
    }

    void gxszxtbevo(Size size, int i13) {
        Rect rect;
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f4141ppxfxbqfkf) != null) {
                    this.f4142wkgbmnqykc = this.f4143zoijcleaow.ppxfxbqfkf(size, i13, rect);
                    return;
                }
                this.f4142wkgbmnqykc = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lereixgezr.vipkmwdibw
    protected PointF iobyxmoadg(float f13, float f14) {
        float[] fArr = {f13, f14};
        synchronized (this) {
            try {
                Matrix matrix = this.f4142wkgbmnqykc;
                if (matrix == null) {
                    return f4140eablkybsjg;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void lqeggnwhkg(Rect rect) {
        eablkybsjg(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f4141ppxfxbqfkf = rect;
        }
    }
}
