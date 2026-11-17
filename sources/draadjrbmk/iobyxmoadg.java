package draadjrbmk;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg implements m1.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private CharSequence f29371agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Context f29373draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private char f29374dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private CharSequence f29375eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Drawable f29376gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Intent f29377gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f29378iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private char f29380lqeggnwhkg;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private CharSequence f29382ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f29384ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f29387wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private CharSequence f29388wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f29390zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f29381nufgyqmvbu = 4096;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f29372btonecajqb = 4096;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private ColorStateList f29385rgvfuqvkyq = null;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private PorterDuff.Mode f29386vdvldrhtss = null;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f29383oxmwwwfdhm = false;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f29379kcexrzcfyt = false;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f29389zdlpuopuiu = 16;

    public iobyxmoadg(Context context, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        this.f29373draadjrbmk = context;
        this.f29378iobyxmoadg = i14;
        this.f29390zoijcleaow = i13;
        this.f29384ppxfxbqfkf = i16;
        this.f29388wkgbmnqykc = charSequence;
    }

    private void ppxfxbqfkf() {
        Drawable drawable = this.f29376gtknphoqwx;
        if (drawable != null) {
            if (this.f29383oxmwwwfdhm || this.f29379kcexrzcfyt) {
                Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(drawable);
                this.f29376gtknphoqwx = drawableOxmwwwfdhm;
                Drawable drawableMutate = drawableOxmwwwfdhm.mutate();
                this.f29376gtknphoqwx = drawableMutate;
                if (this.f29383oxmwwwfdhm) {
                    k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.f29385rgvfuqvkyq);
                }
                if (this.f29379kcexrzcfyt) {
                    k1.iobyxmoadg.rgvfuqvkyq(this.f29376gtknphoqwx, this.f29386vdvldrhtss);
                }
            }
        }
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public m1.zoijcleaow setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f29372btonecajqb;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f29374dxjokdxxww;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f29371agtfadlqog;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f29390zoijcleaow;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f29376gtknphoqwx;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f29385rgvfuqvkyq;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f29386vdvldrhtss;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f29377gxszxtbevo;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f29378iobyxmoadg;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f29381nufgyqmvbu;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f29380lqeggnwhkg;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f29384ppxfxbqfkf;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f29388wkgbmnqykc;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f29375eablkybsjg;
        return charSequence != null ? charSequence : this.f29388wkgbmnqykc;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f29382ojitshcjhn;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public m1.zoijcleaow setShowAsActionFlags(int i13) {
        setShowAsAction(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // m1.zoijcleaow
    public m1.zoijcleaow iobyxmoadg(v1.zoijcleaow zoijcleaowVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f29389zdlpuopuiu & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f29389zdlpuopuiu & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f29389zdlpuopuiu & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f29389zdlpuopuiu & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c13) {
        this.f29374dxjokdxxww = Character.toLowerCase(c13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z13) {
        this.f29389zdlpuopuiu = (z13 ? 1 : 0) | (this.f29389zdlpuopuiu & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z13) {
        this.f29389zdlpuopuiu = (z13 ? 2 : 0) | (this.f29389zdlpuopuiu & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z13) {
        this.f29389zdlpuopuiu = (z13 ? 16 : 0) | (this.f29389zdlpuopuiu & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f29376gtknphoqwx = drawable;
        ppxfxbqfkf();
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f29385rgvfuqvkyq = colorStateList;
        this.f29383oxmwwwfdhm = true;
        ppxfxbqfkf();
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f29386vdvldrhtss = mode;
        this.f29379kcexrzcfyt = true;
        ppxfxbqfkf();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f29377gxszxtbevo = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c13) {
        this.f29380lqeggnwhkg = c13;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f29387wflxmlrfwp = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c13, char c14) {
        this.f29380lqeggnwhkg = c13;
        this.f29374dxjokdxxww = Character.toLowerCase(c14);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public void setShowAsAction(int i13) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f29388wkgbmnqykc = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f29375eablkybsjg = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z13) {
        this.f29389zdlpuopuiu = (this.f29389zdlpuopuiu & 8) | (z13 ? 0 : 8);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public m1.zoijcleaow setActionView(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // m1.zoijcleaow
    public v1.zoijcleaow zoijcleaow() {
        return null;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c13, int i13) {
        this.f29374dxjokdxxww = Character.toLowerCase(c13);
        this.f29372btonecajqb = KeyEvent.normalizeMetaState(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public m1.zoijcleaow setContentDescription(CharSequence charSequence) {
        this.f29371agtfadlqog = charSequence;
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setNumericShortcut(char c13, int i13) {
        this.f29380lqeggnwhkg = c13;
        this.f29381nufgyqmvbu = KeyEvent.normalizeMetaState(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i13) {
        this.f29388wkgbmnqykc = this.f29373draadjrbmk.getResources().getString(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public m1.zoijcleaow setTooltipText(CharSequence charSequence) {
        this.f29382ojitshcjhn = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i13) {
        this.f29376gtknphoqwx = androidx.core.content.iobyxmoadg.getDrawable(this.f29373draadjrbmk, i13);
        ppxfxbqfkf();
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setShortcut(char c13, char c14, int i13, int i14) {
        this.f29380lqeggnwhkg = c13;
        this.f29381nufgyqmvbu = KeyEvent.normalizeMetaState(i13);
        this.f29374dxjokdxxww = Character.toLowerCase(c14);
        this.f29372btonecajqb = KeyEvent.normalizeMetaState(i14);
        return this;
    }
}
