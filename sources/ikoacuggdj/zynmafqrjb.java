package ikoacuggdj;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zynmafqrjb f44967iobyxmoadg = new zynmafqrjb();

    private zynmafqrjb() {
    }

    public final float eablkybsjg(EdgeEffect edgeEffect, float f13, float f14) {
        if (Build.VERSION.SDK_INT >= 31) {
            return gxszxtbevo.f44801iobyxmoadg.ppxfxbqfkf(edgeEffect, f13, f14);
        }
        edgeEffect.onPull(f13, f14);
        return f13;
    }

    public final void gxszxtbevo(EdgeEffect edgeEffect, float f13) {
        if (edgeEffect instanceof ylkuphrtab) {
            ((ylkuphrtab) edgeEffect).iobyxmoadg(f13);
        } else {
            edgeEffect.onRelease();
        }
    }

    public final float iobyxmoadg(EdgeEffect edgeEffect, float f13, float f14, w0.wkgbmnqykc wkgbmnqykcVar) {
        if (istkbnxepw.zoijcleaow(wkgbmnqykcVar, f13) > ppxfxbqfkf(edgeEffect) * f14) {
            return 0.0f;
        }
        wkgbmnqykc(edgeEffect, vg.iobyxmoadg.wkgbmnqykc(f13));
        return f13;
    }

    public final float ppxfxbqfkf(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return gxszxtbevo.f44801iobyxmoadg.zoijcleaow(edgeEffect);
        }
        return 0.0f;
    }

    public final void wkgbmnqykc(EdgeEffect edgeEffect, int i13) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i13);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i13);
        }
    }

    public final EdgeEffect zoijcleaow(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? gxszxtbevo.f44801iobyxmoadg.iobyxmoadg(context, null) : new ylkuphrtab(context);
    }
}
