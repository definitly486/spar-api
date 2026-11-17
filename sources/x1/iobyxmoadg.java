package x1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: x1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static class C3047iobyxmoadg {
        static Interpolator iobyxmoadg(float f13, float f14, float f15, float f16) {
            return new PathInterpolator(f13, f14, f15, f16);
        }

        static Interpolator zoijcleaow(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator iobyxmoadg(float f13, float f14, float f15, float f16) {
        return C3047iobyxmoadg.iobyxmoadg(f13, f14, f15, f16);
    }

    public static Interpolator zoijcleaow(Path path) {
        return C3047iobyxmoadg.zoijcleaow(path);
    }
}
