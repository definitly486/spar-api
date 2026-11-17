package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ikoacuggdj f6973iobyxmoadg = new ikoacuggdj();

    private ikoacuggdj() {
    }

    public final int iobyxmoadg(AccessibilityManager accessibilityManager, int i13, int i14) {
        return accessibilityManager.getRecommendedTimeoutMillis(i13, i14);
    }
}
