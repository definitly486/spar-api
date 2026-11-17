package nuxfzjnpeb;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
final class ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ikoacuggdj f71169iobyxmoadg = new ikoacuggdj();

    private ikoacuggdj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lqeggnwhkg(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        dsvhmnatus.f71143iobyxmoadg.zoijcleaow(remoteAction.getActionIntent());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        dsvhmnatus.f71143iobyxmoadg.iobyxmoadg(context, textClassification);
        return true;
    }

    public final void eablkybsjg(Menu menu, int i13, Context context, TextClassification textClassification, int i14) {
        if (i14 < 0) {
            ppxfxbqfkf(menu, i13, context, textClassification);
        } else {
            gxszxtbevo(menu, i13, context, i14 == 0, (RemoteAction) textClassification.getActions().get(i14));
        }
    }

    public final void gxszxtbevo(Menu menu, int i13, Context context, boolean z13, final RemoteAction remoteAction) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, z13 ? 16908353 : 0, i13, remoteAction.getTitle());
        menuItemAdd.setShowAsAction(z13 ? 2 : 0);
        if (z13 || remoteAction.shouldShowIcon()) {
            menuItemAdd.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: nuxfzjnpeb.jhduphickx
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ikoacuggdj.lqeggnwhkg(remoteAction, menuItem);
            }
        });
    }

    public final void ppxfxbqfkf(Menu menu, int i13, final Context context, final TextClassification textClassification) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i13, textClassification.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(textClassification.getIcon());
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: nuxfzjnpeb.vipkmwdibw
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ikoacuggdj.wkgbmnqykc(context, textClassification, menuItem);
            }
        });
    }
}
