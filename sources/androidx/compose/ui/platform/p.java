package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final p f7028iobyxmoadg = new p();

    private p() {
    }

    public final ActionMode iobyxmoadg(View view, ActionMode.Callback callback, int i13) {
        return view.startActionMode(callback, i13);
    }
}
