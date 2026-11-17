package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements m1.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    eablkybsjg f2855agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private char f2856btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Drawable f2859draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private CharSequence f2861eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private CharSequence f2864gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f2865iobyxmoadg;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f2866istkbnxepw;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private CharSequence f2869kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f2870lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Intent f2871lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private char f2872nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private wflxmlrfwp f2873ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private CharSequence f2874oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private View f2875pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f2876ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private Runnable f2877rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2878vdvldrhtss;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f2880wkgbmnqykc;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f2881yadqdtsiqt;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f2884zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private v1.zoijcleaow f2885zynmafqrjb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f2860dxjokdxxww = 4096;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f2863gtknphoqwx = 4096;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f2879wflxmlrfwp = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ColorStateList f2883zdlpuopuiu = null;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private PorterDuff.Mode f2882yggfygwlhe = null;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f2868jyumaefscl = false;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f2867iwizpuwonk = false;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f2858cqumvgiudr = false;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f2862esjtqupxsv = 16;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f2857cdpycssgdh = false;

    class iobyxmoadg implements v1.zoijcleaow.InterfaceC2871zoijcleaow {
        iobyxmoadg() {
        }

        @Override // v1.zoijcleaow.InterfaceC2871zoijcleaow
        public void onActionProviderVisibilityChanged(boolean z13) {
            lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
            lqeggnwhkgVar.f2855agtfadlqog.hcddaimhww(lqeggnwhkgVar);
        }
    }

    lqeggnwhkg(eablkybsjg eablkybsjgVar, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17) {
        this.f2855agtfadlqog = eablkybsjgVar;
        this.f2865iobyxmoadg = i14;
        this.f2884zoijcleaow = i13;
        this.f2876ppxfxbqfkf = i15;
        this.f2880wkgbmnqykc = i16;
        this.f2861eablkybsjg = charSequence;
        this.f2870lereixgezr = i17;
    }

    private Drawable eablkybsjg(Drawable drawable) {
        if (drawable != null && this.f2858cqumvgiudr && (this.f2868jyumaefscl || this.f2867iwizpuwonk)) {
            drawable = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
            if (this.f2868jyumaefscl) {
                k1.iobyxmoadg.ojitshcjhn(drawable, this.f2883zdlpuopuiu);
            }
            if (this.f2867iwizpuwonk) {
                k1.iobyxmoadg.rgvfuqvkyq(drawable, this.f2882yggfygwlhe);
            }
            this.f2858cqumvgiudr = false;
        }
        return drawable;
    }

    private static void wkgbmnqykc(StringBuilder sb3, int i13, int i14, String str) {
        if ((i13 & i14) == i14) {
            sb3.append(str);
        }
    }

    public boolean agtfadlqog() {
        return (this.f2870lereixgezr & 1) == 1;
    }

    public boolean btonecajqb() {
        v1.zoijcleaow zoijcleaowVar;
        if ((this.f2870lereixgezr & 8) == 0) {
            return false;
        }
        if (this.f2875pmvmpeiblj == null && (zoijcleaowVar = this.f2885zynmafqrjb) != null) {
            this.f2875pmvmpeiblj = zoijcleaowVar.ppxfxbqfkf(this);
        }
        return this.f2875pmvmpeiblj != null;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2870lereixgezr & 8) == 0) {
            return false;
        }
        if (this.f2875pmvmpeiblj == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2866istkbnxepw;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2855agtfadlqog.gxszxtbevo(this);
        }
        return false;
    }

    public void cqumvgiudr(wflxmlrfwp wflxmlrfwpVar) {
        this.f2873ojitshcjhn = wflxmlrfwpVar;
        wflxmlrfwpVar.setHeaderTitle(getTitle());
    }

    public boolean draadjrbmk() {
        return (this.f2862esjtqupxsv & 32) == 32;
    }

    CharSequence dxjokdxxww(gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        return (iobyxmoadgVar == null || !iobyxmoadgVar.eablkybsjg()) ? getTitle() : getTitleCondensed();
    }

    boolean esjtqupxsv(boolean z13) {
        int i13 = this.f2862esjtqupxsv;
        int i14 = (z13 ? 0 : 8) | (i13 & (-9));
        this.f2862esjtqupxsv = i14;
        return i13 != i14;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public boolean expandActionView() {
        if (!btonecajqb()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2866istkbnxepw;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2855agtfadlqog.gtknphoqwx(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public View getActionView() {
        View view = this.f2875pmvmpeiblj;
        if (view != null) {
            return view;
        }
        v1.zoijcleaow zoijcleaowVar = this.f2885zynmafqrjb;
        if (zoijcleaowVar == null) {
            return null;
        }
        View viewPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(this);
        this.f2875pmvmpeiblj = viewPpxfxbqfkf;
        return viewPpxfxbqfkf;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2863gtknphoqwx;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2856btonecajqb;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2874oxmwwwfdhm;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2884zoijcleaow;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f2859draadjrbmk;
        if (drawable != null) {
            return eablkybsjg(drawable);
        }
        if (this.f2879wflxmlrfwp == 0) {
            return null;
        }
        Drawable drawableZoijcleaow = nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f2855agtfadlqog.yggfygwlhe(), this.f2879wflxmlrfwp);
        this.f2879wflxmlrfwp = 0;
        this.f2859draadjrbmk = drawableZoijcleaow;
        return eablkybsjg(drawableZoijcleaow);
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2883zdlpuopuiu;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2882yggfygwlhe;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2871lqeggnwhkg;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2865iobyxmoadg;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2881yadqdtsiqt;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2860dxjokdxxww;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2872nufgyqmvbu;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2876ppxfxbqfkf;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2873ojitshcjhn;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2861eablkybsjg;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2864gxszxtbevo;
        return charSequence != null ? charSequence : this.f2861eablkybsjg;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2869kcexrzcfyt;
    }

    public boolean gtknphoqwx() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2878vdvldrhtss;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        eablkybsjg eablkybsjgVar = this.f2855agtfadlqog;
        if (eablkybsjgVar.nufgyqmvbu(eablkybsjgVar, this)) {
            return true;
        }
        Runnable runnable = this.f2877rgvfuqvkyq;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2871lqeggnwhkg != null) {
            try {
                this.f2855agtfadlqog.yggfygwlhe().startActivity(this.f2871lqeggnwhkg);
                return true;
            } catch (ActivityNotFoundException e13) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e13);
            }
        }
        v1.zoijcleaow zoijcleaowVar = this.f2885zynmafqrjb;
        return zoijcleaowVar != null && zoijcleaowVar.wkgbmnqykc();
    }

    public int gxszxtbevo() {
        return this.f2880wkgbmnqykc;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2873ojitshcjhn != null;
    }

    @Override // m1.zoijcleaow
    public m1.zoijcleaow iobyxmoadg(v1.zoijcleaow zoijcleaowVar) {
        v1.zoijcleaow zoijcleaowVar2 = this.f2885zynmafqrjb;
        if (zoijcleaowVar2 != null) {
            zoijcleaowVar2.lqeggnwhkg();
        }
        this.f2875pmvmpeiblj = null;
        this.f2885zynmafqrjb = zoijcleaowVar;
        this.f2855agtfadlqog.jpowsppfya(true);
        v1.zoijcleaow zoijcleaowVar3 = this.f2885zynmafqrjb;
        if (zoijcleaowVar3 != null) {
            zoijcleaowVar3.dxjokdxxww(new iobyxmoadg());
        }
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2857cdpycssgdh;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2862esjtqupxsv & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2862esjtqupxsv & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2862esjtqupxsv & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        v1.zoijcleaow zoijcleaowVar = this.f2885zynmafqrjb;
        if (zoijcleaowVar == null || !zoijcleaowVar.gxszxtbevo()) {
            return (this.f2862esjtqupxsv & 8) == 0;
        }
        return (this.f2862esjtqupxsv & 8) == 0 && this.f2885zynmafqrjb.zoijcleaow();
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public m1.zoijcleaow setShowAsActionFlags(int i13) {
        setShowAsAction(i13);
        return this;
    }

    void jyumaefscl(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2881yadqdtsiqt = contextMenuInfo;
    }

    void kcexrzcfyt(boolean z13) {
        int i13 = this.f2862esjtqupxsv;
        int i14 = (z13 ? 2 : 0) | (i13 & (-3));
        this.f2862esjtqupxsv = i14;
        if (i13 != i14) {
            this.f2855agtfadlqog.jpowsppfya(false);
        }
    }

    public boolean lereixgezr() {
        return this.f2855agtfadlqog.pmvmpeiblj();
    }

    char lqeggnwhkg() {
        return this.f2855agtfadlqog.wwaezpbzkn() ? this.f2856btonecajqb : this.f2872nufgyqmvbu;
    }

    String nufgyqmvbu() {
        char cLqeggnwhkg = lqeggnwhkg();
        if (cLqeggnwhkg == 0) {
            return "";
        }
        Resources resources = this.f2855agtfadlqog.yggfygwlhe().getResources();
        StringBuilder sb3 = new StringBuilder();
        if (ViewConfiguration.get(this.f2855agtfadlqog.yggfygwlhe()).hasPermanentMenuKey()) {
            sb3.append(resources.getString(lqeggnwhkg.nufgyqmvbu.abc_prepend_shortcut_label));
        }
        int i13 = this.f2855agtfadlqog.wwaezpbzkn() ? this.f2863gtknphoqwx : this.f2860dxjokdxxww;
        wkgbmnqykc(sb3, i13, 65536, resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_meta_shortcut_label));
        wkgbmnqykc(sb3, i13, 4096, resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_ctrl_shortcut_label));
        wkgbmnqykc(sb3, i13, 2, resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_alt_shortcut_label));
        wkgbmnqykc(sb3, i13, 1, resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_shift_shortcut_label));
        wkgbmnqykc(sb3, i13, 4, resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_sym_shortcut_label));
        wkgbmnqykc(sb3, i13, 8, resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_function_shortcut_label));
        if (cLqeggnwhkg == '\b') {
            sb3.append(resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_delete_shortcut_label));
        } else if (cLqeggnwhkg == '\n') {
            sb3.append(resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_enter_shortcut_label));
        } else if (cLqeggnwhkg != ' ') {
            sb3.append(cLqeggnwhkg);
        } else {
            sb3.append(resources.getString(lqeggnwhkg.nufgyqmvbu.abc_menu_space_shortcut_label));
        }
        return sb3.toString();
    }

    public boolean ojitshcjhn() {
        return (this.f2870lereixgezr & 2) == 2;
    }

    public void oxmwwwfdhm(boolean z13) {
        this.f2857cdpycssgdh = z13;
        this.f2855agtfadlqog.jpowsppfya(false);
    }

    boolean pmvmpeiblj() {
        return this.f2855agtfadlqog.ylkuphrtab() && lqeggnwhkg() != 0;
    }

    public void ppxfxbqfkf() {
        this.f2855agtfadlqog.pkzmftpjix(this);
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public m1.zoijcleaow setActionView(int i13) {
        Context contextYggfygwlhe = this.f2855agtfadlqog.yggfygwlhe();
        setActionView(LayoutInflater.from(contextYggfygwlhe).inflate(i13, (ViewGroup) new LinearLayout(contextYggfygwlhe), false));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c13) {
        if (this.f2856btonecajqb == c13) {
            return this;
        }
        this.f2856btonecajqb = Character.toLowerCase(c13);
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z13) {
        int i13 = this.f2862esjtqupxsv;
        int i14 = (z13 ? 1 : 0) | (i13 & (-2));
        this.f2862esjtqupxsv = i14;
        if (i13 != i14) {
            this.f2855agtfadlqog.jpowsppfya(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z13) {
        if ((this.f2862esjtqupxsv & 4) != 0) {
            this.f2855agtfadlqog.ntlheqmsrt(this);
        } else {
            kcexrzcfyt(z13);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z13) {
        if (z13) {
            this.f2862esjtqupxsv |= 16;
        } else {
            this.f2862esjtqupxsv &= -17;
        }
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2879wflxmlrfwp = 0;
        this.f2859draadjrbmk = drawable;
        this.f2858cqumvgiudr = true;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2883zdlpuopuiu = colorStateList;
        this.f2868jyumaefscl = true;
        this.f2858cqumvgiudr = true;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2882yggfygwlhe = mode;
        this.f2867iwizpuwonk = true;
        this.f2858cqumvgiudr = true;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2871lqeggnwhkg = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c13) {
        if (this.f2872nufgyqmvbu == c13) {
            return this;
        }
        this.f2872nufgyqmvbu = c13;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2866istkbnxepw = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2878vdvldrhtss = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c13, char c14) {
        this.f2872nufgyqmvbu = c13;
        this.f2856btonecajqb = Character.toLowerCase(c14);
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public void setShowAsAction(int i13) {
        int i14 = i13 & 3;
        if (i14 != 0 && i14 != 1 && i14 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2870lereixgezr = i13;
        this.f2855agtfadlqog.pkzmftpjix(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2861eablkybsjg = charSequence;
        this.f2855agtfadlqog.jpowsppfya(false);
        wflxmlrfwp wflxmlrfwpVar = this.f2873ojitshcjhn;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2864gxszxtbevo = charSequence;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z13) {
        if (esjtqupxsv(z13)) {
            this.f2855agtfadlqog.hcddaimhww(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f2861eablkybsjg;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public m1.zoijcleaow setActionView(View view) {
        int i13;
        this.f2875pmvmpeiblj = view;
        this.f2885zynmafqrjb = null;
        if (view != null && view.getId() == -1 && (i13 = this.f2865iobyxmoadg) > 0) {
            view.setId(i13);
        }
        this.f2855agtfadlqog.pkzmftpjix(this);
        return this;
    }

    public boolean wflxmlrfwp() {
        return (this.f2862esjtqupxsv & 4) != 0;
    }

    public void yggfygwlhe(boolean z13) {
        if (z13) {
            this.f2862esjtqupxsv |= 32;
        } else {
            this.f2862esjtqupxsv &= -33;
        }
    }

    public void zdlpuopuiu(boolean z13) {
        this.f2862esjtqupxsv = (z13 ? 4 : 0) | (this.f2862esjtqupxsv & (-5));
    }

    @Override // m1.zoijcleaow
    public v1.zoijcleaow zoijcleaow() {
        return this.f2885zynmafqrjb;
    }

    public boolean zynmafqrjb() {
        return (this.f2870lereixgezr & 4) == 4;
    }

    @Override // android.view.MenuItem
    public m1.zoijcleaow setContentDescription(CharSequence charSequence) {
        this.f2874oxmwwwfdhm = charSequence;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public m1.zoijcleaow setTooltipText(CharSequence charSequence) {
        this.f2869kcexrzcfyt = charSequence;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c13, int i13) {
        if (this.f2856btonecajqb == c13 && this.f2863gtknphoqwx == i13) {
            return this;
        }
        this.f2856btonecajqb = Character.toLowerCase(c13);
        this.f2863gtknphoqwx = KeyEvent.normalizeMetaState(i13);
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setNumericShortcut(char c13, int i13) {
        if (this.f2872nufgyqmvbu == c13 && this.f2860dxjokdxxww == i13) {
            return this;
        }
        this.f2872nufgyqmvbu = c13;
        this.f2860dxjokdxxww = KeyEvent.normalizeMetaState(i13);
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // m1.zoijcleaow, android.view.MenuItem
    public MenuItem setShortcut(char c13, char c14, int i13, int i14) {
        this.f2872nufgyqmvbu = c13;
        this.f2860dxjokdxxww = KeyEvent.normalizeMetaState(i13);
        this.f2856btonecajqb = Character.toLowerCase(c14);
        this.f2863gtknphoqwx = KeyEvent.normalizeMetaState(i14);
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i13) {
        this.f2859draadjrbmk = null;
        this.f2879wflxmlrfwp = i13;
        this.f2858cqumvgiudr = true;
        this.f2855agtfadlqog.jpowsppfya(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i13) {
        return setTitle(this.f2855agtfadlqog.yggfygwlhe().getString(i13));
    }
}
