package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    static class iobyxmoadg {
        static void iobyxmoadg(EdgeEffect edgeEffect, float f13, float f14) {
            edgeEffect.onPull(f13, f14);
        }
    }

    private static class zoijcleaow {
        public static EdgeEffect iobyxmoadg(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float ppxfxbqfkf(EdgeEffect edgeEffect, float f13, float f14) {
            try {
                return edgeEffect.onPullDistance(f13, f14);
            } catch (Throwable unused) {
                edgeEffect.onPull(f13, f14);
                return 0.0f;
            }
        }

        public static float zoijcleaow(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }
    }

    public static EdgeEffect iobyxmoadg(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? zoijcleaow.iobyxmoadg(context, attributeSet) : new EdgeEffect(context);
    }

    public static void ppxfxbqfkf(EdgeEffect edgeEffect, float f13, float f14) {
        iobyxmoadg.iobyxmoadg(edgeEffect, f13, f14);
    }

    public static float wkgbmnqykc(EdgeEffect edgeEffect, float f13, float f14) {
        if (Build.VERSION.SDK_INT >= 31) {
            return zoijcleaow.ppxfxbqfkf(edgeEffect, f13, f14);
        }
        ppxfxbqfkf(edgeEffect, f13, f14);
        return f13;
    }

    public static float zoijcleaow(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return zoijcleaow.zoijcleaow(edgeEffect);
        }
        return 0.0f;
    }
}
