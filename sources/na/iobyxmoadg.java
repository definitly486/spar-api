package na;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected final int f69389eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.activity.zoijcleaow f69390gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TimeInterpolator f69391iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected final int f69392ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected final int f69393wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final View f69394zoijcleaow;

    public iobyxmoadg(View view) {
        this.f69394zoijcleaow = view;
        Context context = view.getContext();
        this.f69391iobyxmoadg = nufgyqmvbu.lqeggnwhkg(context, da.zoijcleaow.motionEasingStandardDecelerateInterpolator, x1.iobyxmoadg.iobyxmoadg(0.0f, 0.0f, 0.0f, 1.0f));
        this.f69392ppxfxbqfkf = nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationMedium2, 300);
        this.f69393wkgbmnqykc = nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationShort3, 150);
        this.f69389eablkybsjg = nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationShort2, 100);
    }

    protected androidx.activity.zoijcleaow eablkybsjg(androidx.activity.zoijcleaow zoijcleaowVar) {
        if (this.f69390gxszxtbevo == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.zoijcleaow zoijcleaowVar2 = this.f69390gxszxtbevo;
        this.f69390gxszxtbevo = zoijcleaowVar;
        return zoijcleaowVar2;
    }

    public float iobyxmoadg(float f13) {
        return this.f69391iobyxmoadg.getInterpolation(f13);
    }

    public androidx.activity.zoijcleaow ppxfxbqfkf() {
        androidx.activity.zoijcleaow zoijcleaowVar = this.f69390gxszxtbevo;
        this.f69390gxszxtbevo = null;
        return zoijcleaowVar;
    }

    protected void wkgbmnqykc(androidx.activity.zoijcleaow zoijcleaowVar) {
        this.f69390gxszxtbevo = zoijcleaowVar;
    }

    protected androidx.activity.zoijcleaow zoijcleaow() {
        if (this.f69390gxszxtbevo == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.zoijcleaow zoijcleaowVar = this.f69390gxszxtbevo;
        this.f69390gxszxtbevo = null;
        return zoijcleaowVar;
    }
}
