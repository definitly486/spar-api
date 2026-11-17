package nuxfzjnpeb;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class cdpycssgdh extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hcddaimhww f71130iobyxmoadg;

    public cdpycssgdh(hcddaimhww hcddaimhwwVar) {
        this.f71130iobyxmoadg = hcddaimhwwVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f71130iobyxmoadg.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f71130iobyxmoadg.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f71130iobyxmoadg.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        g.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = this.f71130iobyxmoadg.iobyxmoadg(actionMode, view);
        rect.set(Math.round(lqeggnwhkgVarIobyxmoadg.nufgyqmvbu()), Math.round(lqeggnwhkgVarIobyxmoadg.gtknphoqwx()), Math.round(lqeggnwhkgVarIobyxmoadg.dxjokdxxww()), Math.round(lqeggnwhkgVarIobyxmoadg.eablkybsjg()));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f71130iobyxmoadg.onPrepareActionMode(actionMode, menu);
    }
}
