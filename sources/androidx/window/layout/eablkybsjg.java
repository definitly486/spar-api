package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f13820iobyxmoadg = new eablkybsjg();

    private eablkybsjg() {
    }

    public final Rect iobyxmoadg(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect zoijcleaow(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
