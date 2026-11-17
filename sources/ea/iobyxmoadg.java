package ea;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final TimeInterpolator f31020iobyxmoadg = new LinearInterpolator();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final TimeInterpolator f31023zoijcleaow = new o2.zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final TimeInterpolator f31021ppxfxbqfkf = new o2.iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final TimeInterpolator f31022wkgbmnqykc = new o2.ppxfxbqfkf();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final TimeInterpolator f31019eablkybsjg = new DecelerateInterpolator();

    public static float iobyxmoadg(float f13, float f14, float f15) {
        return f13 + (f15 * (f14 - f13));
    }

    public static int ppxfxbqfkf(int i13, int i14, float f13) {
        return i13 + Math.round(f13 * (i14 - i13));
    }

    public static float zoijcleaow(float f13, float f14, float f15, float f16, float f17) {
        if (f17 <= f15) {
            return f13;
        }
        return f17 >= f16 ? f14 : iobyxmoadg(f13, f14, (f17 - f15) / (f16 - f15));
    }
}
