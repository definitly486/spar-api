package o2;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
abstract class wkgbmnqykc implements Interpolator {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f71565iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f71566zoijcleaow;

    protected wkgbmnqykc(float[] fArr) {
        this.f71565iobyxmoadg = fArr;
        this.f71566zoijcleaow = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f13) {
        if (f13 >= 1.0f) {
            return 1.0f;
        }
        if (f13 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f71565iobyxmoadg;
        int iMin = Math.min((int) ((fArr.length - 1) * f13), fArr.length - 2);
        float f14 = this.f71566zoijcleaow;
        float f15 = (f13 - (iMin * f14)) / f14;
        float[] fArr2 = this.f71565iobyxmoadg;
        float f16 = fArr2[iMin];
        return f16 + (f15 * (fArr2[iMin + 1] - f16));
    }
}
