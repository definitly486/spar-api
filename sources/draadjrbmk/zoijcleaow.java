package draadjrbmk;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Context f29402iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private jztzpxfvev f29403ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private jztzpxfvev f29404zoijcleaow;

    zoijcleaow(Context context) {
        this.f29402iobyxmoadg = context;
    }

    final void eablkybsjg() {
        jztzpxfvev jztzpxfvevVar = this.f29404zoijcleaow;
        if (jztzpxfvevVar != null) {
            jztzpxfvevVar.clear();
        }
        jztzpxfvev jztzpxfvevVar2 = this.f29403ppxfxbqfkf;
        if (jztzpxfvevVar2 != null) {
            jztzpxfvevVar2.clear();
        }
    }

    final void gxszxtbevo(int i13) {
        if (this.f29404zoijcleaow == null) {
            return;
        }
        int i14 = 0;
        while (i14 < this.f29404zoijcleaow.size()) {
            if (((m1.zoijcleaow) this.f29404zoijcleaow.gxszxtbevo(i14)).getGroupId() == i13) {
                this.f29404zoijcleaow.dxjokdxxww(i14);
                i14--;
            }
            i14++;
        }
    }

    final void lqeggnwhkg(int i13) {
        if (this.f29404zoijcleaow == null) {
            return;
        }
        for (int i14 = 0; i14 < this.f29404zoijcleaow.size(); i14++) {
            if (((m1.zoijcleaow) this.f29404zoijcleaow.gxszxtbevo(i14)).getItemId() == i13) {
                this.f29404zoijcleaow.dxjokdxxww(i14);
                return;
            }
        }
    }

    final MenuItem ppxfxbqfkf(MenuItem menuItem) {
        if (!(menuItem instanceof m1.zoijcleaow)) {
            return menuItem;
        }
        m1.zoijcleaow zoijcleaowVar = (m1.zoijcleaow) menuItem;
        if (this.f29404zoijcleaow == null) {
            this.f29404zoijcleaow = new jztzpxfvev();
        }
        MenuItem menuItem2 = (MenuItem) this.f29404zoijcleaow.get(zoijcleaowVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f29402iobyxmoadg, zoijcleaowVar);
        this.f29404zoijcleaow.put(zoijcleaowVar, ppxfxbqfkfVar);
        return ppxfxbqfkfVar;
    }

    final SubMenu wkgbmnqykc(SubMenu subMenu) {
        return subMenu;
    }
}
