package b0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import g.lqeggnwhkg;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f14898iobyxmoadg;

    public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f14898iobyxmoadg = ppxfxbqfkfVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f14898iobyxmoadg.wkgbmnqykc(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f14898iobyxmoadg.eablkybsjg(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f14898iobyxmoadg.gxszxtbevo();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = this.f14898iobyxmoadg.ppxfxbqfkf();
        if (rect != null) {
            rect.set((int) lqeggnwhkgVarPpxfxbqfkf.nufgyqmvbu(), (int) lqeggnwhkgVarPpxfxbqfkf.gtknphoqwx(), (int) lqeggnwhkgVarPpxfxbqfkf.dxjokdxxww(), (int) lqeggnwhkgVarPpxfxbqfkf.eablkybsjg());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f14898iobyxmoadg.lqeggnwhkg(actionMode, menu);
    }
}
