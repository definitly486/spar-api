package nuxfzjnpeb;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ribwqtqdhb f71233iobyxmoadg = new ribwqtqdhb();

    private ribwqtqdhb() {
    }

    public final void iobyxmoadg(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode zoijcleaow(View view, ActionMode.Callback callback, int i13) {
        return view.startActionMode(callback, i13);
    }
}
