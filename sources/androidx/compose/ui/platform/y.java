package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface y {
    default iobyxmoadg getSubCompositionView() {
        return null;
    }

    default View getViewRoot() {
        return null;
    }
}
