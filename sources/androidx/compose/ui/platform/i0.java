package androidx.compose.ui.platform;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final i0 f6969iobyxmoadg = new i0();

    private i0() {
    }

    public final void iobyxmoadg(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
