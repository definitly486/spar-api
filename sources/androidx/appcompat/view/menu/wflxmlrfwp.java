package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp extends eablkybsjg implements SubMenu {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private lqeggnwhkg f2899istkbnxepw;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private eablkybsjg f2900zynmafqrjb;

    public wflxmlrfwp(Context context, eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        super(context);
        this.f2900zynmafqrjb = eablkybsjgVar;
        this.f2899istkbnxepw = lqeggnwhkgVar;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public eablkybsjg cdpycssgdh() {
        return this.f2900zynmafqrjb.cdpycssgdh();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f2899istkbnxepw;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public boolean gtknphoqwx(lqeggnwhkg lqeggnwhkgVar) {
        return this.f2900zynmafqrjb.gtknphoqwx(lqeggnwhkgVar);
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public boolean gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) {
        return this.f2900zynmafqrjb.gxszxtbevo(lqeggnwhkgVar);
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public boolean lmojexxdyd() {
        return this.f2900zynmafqrjb.lmojexxdyd();
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    boolean nufgyqmvbu(eablkybsjg eablkybsjgVar, MenuItem menuItem) {
        return super.nufgyqmvbu(eablkybsjgVar, menuItem) || this.f2900zynmafqrjb.nufgyqmvbu(eablkybsjgVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg, android.view.Menu
    public void setGroupDividerEnabled(boolean z13) {
        this.f2900zynmafqrjb.setGroupDividerEnabled(z13);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.sopmlzcsov(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.ribwqtqdhb(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.vipkmwdibw(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2899istkbnxepw.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg, android.view.Menu
    public void setQwertyMode(boolean z13) {
        this.f2900zynmafqrjb.setQwertyMode(z13);
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public void tzroggbefp(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        this.f2900zynmafqrjb.tzroggbefp(iobyxmoadgVar);
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public boolean wwaezpbzkn() {
        return this.f2900zynmafqrjb.wwaezpbzkn();
    }

    public Menu xrmfcynszj() {
        return this.f2900zynmafqrjb;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public boolean ylkuphrtab() {
        return this.f2900zynmafqrjb.ylkuphrtab();
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg
    public String zdlpuopuiu() {
        lqeggnwhkg lqeggnwhkgVar = this.f2899istkbnxepw;
        int itemId = lqeggnwhkgVar != null ? lqeggnwhkgVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.zdlpuopuiu() + StringUtils.PROCESS_POSTFIX_DELIMITER + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i13) {
        return (SubMenu) super.ulzqkzuiru(i13);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i13) {
        return (SubMenu) super.jlmebxxoox(i13);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i13) {
        this.f2899istkbnxepw.setIcon(i13);
        return this;
    }
}
