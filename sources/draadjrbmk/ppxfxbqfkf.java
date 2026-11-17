package draadjrbmk;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends draadjrbmk.zoijcleaow implements MenuItem {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Method f29391eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m1.zoijcleaow f29392wkgbmnqykc;

    private class iobyxmoadg extends v1.zoijcleaow implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final ActionProvider f29393eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private v1.zoijcleaow.InterfaceC2871zoijcleaow f29395wkgbmnqykc;

        iobyxmoadg(Context context, ActionProvider actionProvider) {
            super(context);
            this.f29393eablkybsjg = actionProvider;
        }

        @Override // v1.zoijcleaow
        public void dxjokdxxww(v1.zoijcleaow.InterfaceC2871zoijcleaow interfaceC2871zoijcleaow) {
            this.f29395wkgbmnqykc = interfaceC2871zoijcleaow;
            this.f29393eablkybsjg.setVisibilityListener(interfaceC2871zoijcleaow != null ? this : null);
        }

        @Override // v1.zoijcleaow
        public void eablkybsjg(SubMenu subMenu) {
            this.f29393eablkybsjg.onPrepareSubMenu(ppxfxbqfkf.this.wkgbmnqykc(subMenu));
        }

        @Override // v1.zoijcleaow
        public boolean gxszxtbevo() {
            return this.f29393eablkybsjg.overridesItemVisibility();
        }

        @Override // v1.zoijcleaow
        public boolean iobyxmoadg() {
            return this.f29393eablkybsjg.hasSubMenu();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z13) {
            v1.zoijcleaow.InterfaceC2871zoijcleaow interfaceC2871zoijcleaow = this.f29395wkgbmnqykc;
            if (interfaceC2871zoijcleaow != null) {
                interfaceC2871zoijcleaow.onActionProviderVisibilityChanged(z13);
            }
        }

        @Override // v1.zoijcleaow
        public View ppxfxbqfkf(MenuItem menuItem) {
            return this.f29393eablkybsjg.onCreateActionView(menuItem);
        }

        @Override // v1.zoijcleaow
        public boolean wkgbmnqykc() {
            return this.f29393eablkybsjg.onPerformDefaultAction();
        }

        @Override // v1.zoijcleaow
        public boolean zoijcleaow() {
            return this.f29393eablkybsjg.isVisible();
        }
    }

    /* JADX INFO: renamed from: draadjrbmk.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0597ppxfxbqfkf implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f29396iobyxmoadg;

        MenuItemOnActionExpandListenerC0597ppxfxbqfkf(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f29396iobyxmoadg = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f29396iobyxmoadg.onMenuItemActionCollapse(ppxfxbqfkf.this.ppxfxbqfkf(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f29396iobyxmoadg.onMenuItemActionExpand(ppxfxbqfkf.this.ppxfxbqfkf(menuItem));
        }
    }

    private class wkgbmnqykc implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f29399zdlpuopuiu;

        wkgbmnqykc(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f29399zdlpuopuiu = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f29399zdlpuopuiu.onMenuItemClick(ppxfxbqfkf.this.ppxfxbqfkf(menuItem));
        }
    }

    static class zoijcleaow extends FrameLayout implements androidx.appcompat.view.ppxfxbqfkf {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final CollapsibleActionView f29400zdlpuopuiu;

        /* JADX WARN: Multi-variable type inference failed */
        zoijcleaow(View view) {
            super(view.getContext());
            this.f29400zdlpuopuiu = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.ppxfxbqfkf
        public void gxszxtbevo() {
            this.f29400zdlpuopuiu.onActionViewCollapsed();
        }

        View iobyxmoadg() {
            return (View) this.f29400zdlpuopuiu;
        }

        @Override // androidx.appcompat.view.ppxfxbqfkf
        public void zoijcleaow() {
            this.f29400zdlpuopuiu.onActionViewExpanded();
        }
    }

    public ppxfxbqfkf(Context context, m1.zoijcleaow zoijcleaowVar) {
        super(context);
        if (zoijcleaowVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f29392wkgbmnqykc = zoijcleaowVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f29392wkgbmnqykc.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f29392wkgbmnqykc.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        v1.zoijcleaow zoijcleaowVarZoijcleaow = this.f29392wkgbmnqykc.zoijcleaow();
        if (zoijcleaowVarZoijcleaow instanceof iobyxmoadg) {
            return ((iobyxmoadg) zoijcleaowVarZoijcleaow).f29393eablkybsjg;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f29392wkgbmnqykc.getActionView();
        return actionView instanceof zoijcleaow ? ((zoijcleaow) actionView).iobyxmoadg() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f29392wkgbmnqykc.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f29392wkgbmnqykc.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f29392wkgbmnqykc.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f29392wkgbmnqykc.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f29392wkgbmnqykc.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f29392wkgbmnqykc.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f29392wkgbmnqykc.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f29392wkgbmnqykc.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f29392wkgbmnqykc.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f29392wkgbmnqykc.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f29392wkgbmnqykc.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f29392wkgbmnqykc.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f29392wkgbmnqykc.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return wkgbmnqykc(this.f29392wkgbmnqykc.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f29392wkgbmnqykc.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f29392wkgbmnqykc.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f29392wkgbmnqykc.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f29392wkgbmnqykc.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f29392wkgbmnqykc.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f29392wkgbmnqykc.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f29392wkgbmnqykc.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f29392wkgbmnqykc.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f29392wkgbmnqykc.isVisible();
    }

    public void nufgyqmvbu(boolean z13) {
        try {
            if (this.f29391eablkybsjg == null) {
                this.f29391eablkybsjg = this.f29392wkgbmnqykc.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f29391eablkybsjg.invoke(this.f29392wkgbmnqykc, Boolean.valueOf(z13));
        } catch (Exception e13) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e13);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f29402iobyxmoadg, actionProvider);
        m1.zoijcleaow zoijcleaowVar = this.f29392wkgbmnqykc;
        if (actionProvider == null) {
            iobyxmoadgVar = null;
        }
        zoijcleaowVar.iobyxmoadg(iobyxmoadgVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new zoijcleaow(view);
        }
        this.f29392wkgbmnqykc.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c13) {
        this.f29392wkgbmnqykc.setAlphabeticShortcut(c13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z13) {
        this.f29392wkgbmnqykc.setCheckable(z13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z13) {
        this.f29392wkgbmnqykc.setChecked(z13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f29392wkgbmnqykc.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z13) {
        this.f29392wkgbmnqykc.setEnabled(z13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f29392wkgbmnqykc.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f29392wkgbmnqykc.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f29392wkgbmnqykc.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f29392wkgbmnqykc.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c13) {
        this.f29392wkgbmnqykc.setNumericShortcut(c13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f29392wkgbmnqykc.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0597ppxfxbqfkf(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f29392wkgbmnqykc.setOnMenuItemClickListener(onMenuItemClickListener != null ? new wkgbmnqykc(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c13, char c14) {
        this.f29392wkgbmnqykc.setShortcut(c13, c14);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i13) {
        this.f29392wkgbmnqykc.setShowAsAction(i13);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i13) {
        this.f29392wkgbmnqykc.setShowAsActionFlags(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f29392wkgbmnqykc.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f29392wkgbmnqykc.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f29392wkgbmnqykc.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z13) {
        return this.f29392wkgbmnqykc.setVisible(z13);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c13, int i13) {
        this.f29392wkgbmnqykc.setAlphabeticShortcut(c13, i13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i13) {
        this.f29392wkgbmnqykc.setIcon(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c13, int i13) {
        this.f29392wkgbmnqykc.setNumericShortcut(c13, i13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c13, char c14, int i13, int i14) {
        this.f29392wkgbmnqykc.setShortcut(c13, c14, i13, i14);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i13) {
        this.f29392wkgbmnqykc.setTitle(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i13) {
        this.f29392wkgbmnqykc.setActionView(i13);
        View actionView = this.f29392wkgbmnqykc.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f29392wkgbmnqykc.setActionView(new zoijcleaow(actionView));
        }
        return this;
    }
}
