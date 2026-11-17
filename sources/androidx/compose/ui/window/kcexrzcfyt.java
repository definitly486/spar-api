package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class kcexrzcfyt implements rgvfuqvkyq {
    @Override // androidx.compose.ui.window.rgvfuqvkyq
    public void iobyxmoadg(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.ui.window.rgvfuqvkyq
    public void ppxfxbqfkf(View view, int i13, int i14) {
    }

    @Override // androidx.compose.ui.window.rgvfuqvkyq
    public void zoijcleaow(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }
}
