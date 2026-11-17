package draadjrbmk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc extends zoijcleaow implements Menu {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m1.iobyxmoadg f29401wkgbmnqykc;

    public wkgbmnqykc(Context context, m1.iobyxmoadg iobyxmoadgVar) {
        super(context);
        if (iobyxmoadgVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f29401wkgbmnqykc = iobyxmoadgVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return ppxfxbqfkf(this.f29401wkgbmnqykc.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i13, int i14, int i15, ComponentName componentName, Intent[] intentArr, Intent intent, int i16, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f29401wkgbmnqykc.addIntentOptions(i13, i14, i15, componentName, intentArr, intent, i16, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i17 = 0; i17 < length; i17++) {
                menuItemArr[i17] = ppxfxbqfkf(menuItemArr2[i17]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return wkgbmnqykc(this.f29401wkgbmnqykc.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        eablkybsjg();
        this.f29401wkgbmnqykc.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f29401wkgbmnqykc.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i13) {
        return ppxfxbqfkf(this.f29401wkgbmnqykc.findItem(i13));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i13) {
        return ppxfxbqfkf(this.f29401wkgbmnqykc.getItem(i13));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f29401wkgbmnqykc.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i13, KeyEvent keyEvent) {
        return this.f29401wkgbmnqykc.isShortcutKey(i13, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i13, int i14) {
        return this.f29401wkgbmnqykc.performIdentifierAction(i13, i14);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i13, KeyEvent keyEvent, int i14) {
        return this.f29401wkgbmnqykc.performShortcut(i13, keyEvent, i14);
    }

    @Override // android.view.Menu
    public void removeGroup(int i13) {
        gxszxtbevo(i13);
        this.f29401wkgbmnqykc.removeGroup(i13);
    }

    @Override // android.view.Menu
    public void removeItem(int i13) {
        lqeggnwhkg(i13);
        this.f29401wkgbmnqykc.removeItem(i13);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i13, boolean z13, boolean z14) {
        this.f29401wkgbmnqykc.setGroupCheckable(i13, z13, z14);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i13, boolean z13) {
        this.f29401wkgbmnqykc.setGroupEnabled(i13, z13);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i13, boolean z13) {
        this.f29401wkgbmnqykc.setGroupVisible(i13, z13);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z13) {
        this.f29401wkgbmnqykc.setQwertyMode(z13);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f29401wkgbmnqykc.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i13) {
        return ppxfxbqfkf(this.f29401wkgbmnqykc.add(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13) {
        return wkgbmnqykc(this.f29401wkgbmnqykc.addSubMenu(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i13, int i14, int i15, CharSequence charSequence) {
        return ppxfxbqfkf(this.f29401wkgbmnqykc.add(i13, i14, i15, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        return wkgbmnqykc(this.f29401wkgbmnqykc.addSubMenu(i13, i14, i15, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i13, int i14, int i15, int i16) {
        return ppxfxbqfkf(this.f29401wkgbmnqykc.add(i13, i14, i15, i16));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13, int i14, int i15, int i16) {
        return wkgbmnqykc(this.f29401wkgbmnqykc.addSubMenu(i13, i14, i15, i16));
    }
}
