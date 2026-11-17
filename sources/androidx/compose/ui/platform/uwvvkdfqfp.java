package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
final class uwvvkdfqfp implements xrmfcynszj {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final uwvvkdfqfp f7095zoijcleaow = new uwvvkdfqfp();

    private uwvvkdfqfp() {
    }

    @Override // androidx.compose.ui.platform.xrmfcynszj
    public Rect iobyxmoadg(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
