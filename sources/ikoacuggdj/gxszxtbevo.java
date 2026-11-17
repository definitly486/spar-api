package ikoacuggdj;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f44801iobyxmoadg = new gxszxtbevo();

    private gxszxtbevo() {
    }

    public final EdgeEffect iobyxmoadg(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float ppxfxbqfkf(EdgeEffect edgeEffect, float f13, float f14) {
        try {
            return edgeEffect.onPullDistance(f13, f14);
        } catch (Throwable unused) {
            edgeEffect.onPull(f13, f14);
            return 0.0f;
        }
    }

    public final float zoijcleaow(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
