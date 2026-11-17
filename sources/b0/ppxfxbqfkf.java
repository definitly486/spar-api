package b0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import g.lqeggnwhkg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private tg.iobyxmoadg f14899eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private tg.iobyxmoadg f14900gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f14901iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private tg.iobyxmoadg f14902lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private tg.iobyxmoadg f14903ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private tg.iobyxmoadg f14904wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private lqeggnwhkg f14905zoijcleaow;

    public ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, tg.iobyxmoadg iobyxmoadgVar5, tg.iobyxmoadg iobyxmoadgVar6) {
        this.f14901iobyxmoadg = iobyxmoadgVar;
        this.f14905zoijcleaow = lqeggnwhkgVar;
        this.f14903ppxfxbqfkf = iobyxmoadgVar2;
        this.f14904wkgbmnqykc = iobyxmoadgVar3;
        this.f14899eablkybsjg = iobyxmoadgVar4;
        this.f14900gxszxtbevo = iobyxmoadgVar5;
        this.f14902lqeggnwhkg = iobyxmoadgVar6;
    }

    private final void zoijcleaow(Menu menu, zoijcleaow zoijcleaowVar, tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar != null && menu.findItem(zoijcleaowVar.wkgbmnqykc()) == null) {
            iobyxmoadg(menu, zoijcleaowVar);
        } else {
            if (iobyxmoadgVar != null || menu.findItem(zoijcleaowVar.wkgbmnqykc()) == null) {
                return;
            }
            menu.removeItem(zoijcleaowVar.wkgbmnqykc());
        }
    }

    public final void agtfadlqog(Menu menu) {
        zoijcleaow(menu, zoijcleaow.Copy, this.f14903ppxfxbqfkf);
        zoijcleaow(menu, zoijcleaow.Paste, this.f14904wkgbmnqykc);
        zoijcleaow(menu, zoijcleaow.Cut, this.f14899eablkybsjg);
        zoijcleaow(menu, zoijcleaow.SelectAll, this.f14900gxszxtbevo);
        zoijcleaow(menu, zoijcleaow.Autofill, this.f14902lqeggnwhkg);
    }

    public final void btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
        this.f14899eablkybsjg = iobyxmoadgVar;
    }

    public final void draadjrbmk(tg.iobyxmoadg iobyxmoadgVar) {
        this.f14900gxszxtbevo = iobyxmoadgVar;
    }

    public final void dxjokdxxww(tg.iobyxmoadg iobyxmoadgVar) {
        this.f14903ppxfxbqfkf = iobyxmoadgVar;
    }

    public final boolean eablkybsjg(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f14903ppxfxbqfkf != null) {
            iobyxmoadg(menu, zoijcleaow.Copy);
        }
        if (this.f14904wkgbmnqykc != null) {
            iobyxmoadg(menu, zoijcleaow.Paste);
        }
        if (this.f14899eablkybsjg != null) {
            iobyxmoadg(menu, zoijcleaow.Cut);
        }
        if (this.f14900gxszxtbevo != null) {
            iobyxmoadg(menu, zoijcleaow.SelectAll);
        }
        if (this.f14902lqeggnwhkg == null) {
            return true;
        }
        iobyxmoadg(menu, zoijcleaow.Autofill);
        return true;
    }

    public final void gtknphoqwx(tg.iobyxmoadg iobyxmoadgVar) {
        this.f14904wkgbmnqykc = iobyxmoadgVar;
    }

    public final void gxszxtbevo() {
        tg.iobyxmoadg iobyxmoadgVar = this.f14901iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public final void iobyxmoadg(Menu menu, zoijcleaow zoijcleaowVar) {
        menu.add(0, zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.lqeggnwhkg(), zoijcleaowVar.nufgyqmvbu()).setShowAsAction(1);
    }

    public final boolean lqeggnwhkg(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        agtfadlqog(menu);
        return true;
    }

    public final void nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar) {
        this.f14902lqeggnwhkg = iobyxmoadgVar;
    }

    public final lqeggnwhkg ppxfxbqfkf() {
        return this.f14905zoijcleaow;
    }

    public final void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar) {
        this.f14905zoijcleaow = lqeggnwhkgVar;
    }

    public final boolean wkgbmnqykc(ActionMode actionMode, MenuItem menuItem) {
        zdlpuopuiu.lqeggnwhkg(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == zoijcleaow.Copy.wkgbmnqykc()) {
            tg.iobyxmoadg iobyxmoadgVar = this.f14903ppxfxbqfkf;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        } else if (itemId == zoijcleaow.Paste.wkgbmnqykc()) {
            tg.iobyxmoadg iobyxmoadgVar2 = this.f14904wkgbmnqykc;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.invoke();
            }
        } else if (itemId == zoijcleaow.Cut.wkgbmnqykc()) {
            tg.iobyxmoadg iobyxmoadgVar3 = this.f14899eablkybsjg;
            if (iobyxmoadgVar3 != null) {
                iobyxmoadgVar3.invoke();
            }
        } else if (itemId == zoijcleaow.SelectAll.wkgbmnqykc()) {
            tg.iobyxmoadg iobyxmoadgVar4 = this.f14900gxszxtbevo;
            if (iobyxmoadgVar4 != null) {
                iobyxmoadgVar4.invoke();
            }
        } else {
            if (itemId != zoijcleaow.Autofill.wkgbmnqykc()) {
                return false;
            }
            tg.iobyxmoadg iobyxmoadgVar5 = this.f14902lqeggnwhkg;
            if (iobyxmoadgVar5 != null) {
                iobyxmoadgVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public /* synthetic */ ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, tg.iobyxmoadg iobyxmoadgVar5, tg.iobyxmoadg iobyxmoadgVar6, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : iobyxmoadgVar, (i13 & 2) != 0 ? lqeggnwhkg.f35592eablkybsjg.iobyxmoadg() : lqeggnwhkgVar, (i13 & 4) != 0 ? null : iobyxmoadgVar2, (i13 & 8) != 0 ? null : iobyxmoadgVar3, (i13 & 16) != 0 ? null : iobyxmoadgVar4, (i13 & 32) != 0 ? null : iobyxmoadgVar5, (i13 & 64) != 0 ? null : iobyxmoadgVar6);
    }
}
