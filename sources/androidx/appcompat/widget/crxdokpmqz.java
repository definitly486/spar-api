package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import v1.jhduphickx;
import v1.sflfametgt;
import v1.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
public class crxdokpmqz implements lereixgezr {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private ActionMenuPresenter f3266agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private CharSequence f3267btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    Window.Callback f3268draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    CharSequence f3269dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Drawable f3270eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private CharSequence f3271gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Drawable f3272gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    Toolbar f3273iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Drawable f3274lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f3275nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f3276ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private View f3277ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f3278rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private Drawable f3279vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    boolean f3280wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private View f3281wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f3282zoijcleaow;

    class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final draadjrbmk.iobyxmoadg f3284zdlpuopuiu;

        iobyxmoadg() {
            this.f3284zdlpuopuiu = new draadjrbmk.iobyxmoadg(crxdokpmqz.this.f3273iobyxmoadg.getContext(), 0, R.id.home, 0, 0, crxdokpmqz.this.f3269dxjokdxxww);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            crxdokpmqz crxdokpmqzVar = crxdokpmqz.this;
            Window.Callback callback = crxdokpmqzVar.f3268draadjrbmk;
            if (callback == null || !crxdokpmqzVar.f3280wflxmlrfwp) {
                return;
            }
            callback.onMenuItemSelected(0, this.f3284zdlpuopuiu);
        }
    }

    class zoijcleaow extends sflfametgt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f3285iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f3287zoijcleaow;

        zoijcleaow(int i13) {
            this.f3287zoijcleaow = i13;
        }

        @Override // v1.sflfametgt, v1.ydmasvzmpa
        public void iobyxmoadg(View view) {
            this.f3285iobyxmoadg = true;
        }

        @Override // v1.sflfametgt, v1.ydmasvzmpa
        public void ppxfxbqfkf(View view) {
            crxdokpmqz.this.f3273iobyxmoadg.setVisibility(0);
        }

        @Override // v1.ydmasvzmpa
        public void zoijcleaow(View view) {
            if (this.f3285iobyxmoadg) {
                return;
            }
            crxdokpmqz.this.f3273iobyxmoadg.setVisibility(this.f3287zoijcleaow);
        }
    }

    public crxdokpmqz(Toolbar toolbar, boolean z13) {
        this(toolbar, z13, lqeggnwhkg.nufgyqmvbu.abc_action_bar_up_description, lqeggnwhkg.eablkybsjg.abc_ic_ab_back_material);
    }

    private int cqumvgiudr() {
        if (this.f3273iobyxmoadg.getNavigationIcon() == null) {
            return 11;
        }
        this.f3279vdvldrhtss = this.f3273iobyxmoadg.getNavigationIcon();
        return 15;
    }

    private void lmojexxdyd(CharSequence charSequence) {
        this.f3269dxjokdxxww = charSequence;
        if ((this.f3282zoijcleaow & 8) != 0) {
            this.f3273iobyxmoadg.setTitle(charSequence);
            if (this.f3275nufgyqmvbu) {
                jhduphickx.iyctptxqzt(this.f3273iobyxmoadg.getRootView(), charSequence);
            }
        }
    }

    private void pkzmftpjix() {
        Drawable drawable;
        int i13 = this.f3282zoijcleaow;
        if ((i13 & 2) == 0) {
            drawable = null;
        } else if ((i13 & 1) == 0 || (drawable = this.f3272gxszxtbevo) == null) {
            drawable = this.f3270eablkybsjg;
        }
        this.f3273iobyxmoadg.setLogo(drawable);
    }

    private void wwaezpbzkn() {
        if ((this.f3282zoijcleaow & 4) != 0) {
            if (TextUtils.isEmpty(this.f3271gtknphoqwx)) {
                this.f3273iobyxmoadg.setNavigationContentDescription(this.f3278rgvfuqvkyq);
            } else {
                this.f3273iobyxmoadg.setNavigationContentDescription(this.f3271gtknphoqwx);
            }
        }
    }

    private void ylkuphrtab() {
        if ((this.f3282zoijcleaow & 4) == 0) {
            this.f3273iobyxmoadg.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f3273iobyxmoadg;
        Drawable drawable = this.f3274lqeggnwhkg;
        if (drawable == null) {
            drawable = this.f3279vdvldrhtss;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void agtfadlqog(boolean z13) {
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public Menu btonecajqb() {
        return this.f3273iobyxmoadg.getMenu();
    }

    public void cdpycssgdh(Drawable drawable) {
        this.f3274lqeggnwhkg = drawable;
        ylkuphrtab();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void collapseActionView() {
        this.f3273iobyxmoadg.eablkybsjg();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public yfnezrywwk draadjrbmk(int i13, long j13) {
        return jhduphickx.eablkybsjg(this.f3273iobyxmoadg).zoijcleaow(i13 == 0 ? 1.0f : 0.0f).gxszxtbevo(j13).nufgyqmvbu(new zoijcleaow(i13));
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void dxjokdxxww(int i13) {
        View view;
        int i14 = this.f3282zoijcleaow ^ i13;
        this.f3282zoijcleaow = i13;
        if (i14 != 0) {
            if ((i14 & 4) != 0) {
                if ((i13 & 4) != 0) {
                    wwaezpbzkn();
                }
                ylkuphrtab();
            }
            if ((i14 & 3) != 0) {
                pkzmftpjix();
            }
            if ((i14 & 8) != 0) {
                if ((i13 & 8) != 0) {
                    this.f3273iobyxmoadg.setTitle(this.f3269dxjokdxxww);
                    this.f3273iobyxmoadg.setSubtitle(this.f3267btonecajqb);
                } else {
                    this.f3273iobyxmoadg.setTitle((CharSequence) null);
                    this.f3273iobyxmoadg.setSubtitle((CharSequence) null);
                }
            }
            if ((i14 & 16) == 0 || (view = this.f3281wkgbmnqykc) == null) {
                return;
            }
            if ((i13 & 16) != 0) {
                this.f3273iobyxmoadg.addView(view);
            } else {
                this.f3273iobyxmoadg.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public boolean eablkybsjg() {
        return this.f3273iobyxmoadg.zynmafqrjb();
    }

    public void esjtqupxsv(View view) {
        View view2 = this.f3281wkgbmnqykc;
        if (view2 != null && (this.f3282zoijcleaow & 16) != 0) {
            this.f3273iobyxmoadg.removeView(view2);
        }
        this.f3281wkgbmnqykc = view;
        if (view == null || (this.f3282zoijcleaow & 16) == 0) {
            return;
        }
        this.f3273iobyxmoadg.addView(view);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public Context getContext() {
        return this.f3273iobyxmoadg.getContext();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public CharSequence getTitle() {
        return this.f3273iobyxmoadg.getTitle();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public int gtknphoqwx() {
        return this.f3276ojitshcjhn;
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void gxszxtbevo() {
        this.f3280wflxmlrfwp = true;
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public boolean iobyxmoadg() {
        return this.f3273iobyxmoadg.wkgbmnqykc();
    }

    public void iozdgvuglv(CharSequence charSequence) {
        this.f3275nufgyqmvbu = true;
        lmojexxdyd(charSequence);
    }

    public void istkbnxepw(CharSequence charSequence) {
        this.f3271gtknphoqwx = charSequence;
        wwaezpbzkn();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void iwizpuwonk() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public int jyumaefscl() {
        return this.f3282zoijcleaow;
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void kcexrzcfyt(int i13) {
        pmvmpeiblj(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    public void lereixgezr(int i13) {
        if (i13 == this.f3278rgvfuqvkyq) {
            return;
        }
        this.f3278rgvfuqvkyq = i13;
        if (TextUtils.isEmpty(this.f3273iobyxmoadg.getNavigationContentDescription())) {
            zynmafqrjb(this.f3278rgvfuqvkyq);
        }
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public boolean lqeggnwhkg() {
        return this.f3273iobyxmoadg.pmvmpeiblj();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public boolean nufgyqmvbu() {
        return this.f3273iobyxmoadg.jyumaefscl();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void ojitshcjhn() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void oxmwwwfdhm(dsvhmnatus dsvhmnatusVar) {
        View view = this.f3277ppxfxbqfkf;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f3273iobyxmoadg;
            if (parent == toolbar) {
                toolbar.removeView(this.f3277ppxfxbqfkf);
            }
        }
        this.f3277ppxfxbqfkf = dsvhmnatusVar;
    }

    public void pmvmpeiblj(Drawable drawable) {
        this.f3272gxszxtbevo = drawable;
        pkzmftpjix();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public boolean ppxfxbqfkf() {
        return this.f3273iobyxmoadg.stevsuqkhv();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void rgvfuqvkyq(boolean z13) {
        this.f3273iobyxmoadg.setCollapsible(z13);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void setIcon(int i13) {
        setIcon(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void setWindowCallback(Window.Callback callback) {
        this.f3268draadjrbmk = callback;
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f3275nufgyqmvbu) {
            return;
        }
        lmojexxdyd(charSequence);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void vdvldrhtss() {
        this.f3273iobyxmoadg.gxszxtbevo();
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public ViewGroup wflxmlrfwp() {
        return this.f3273iobyxmoadg;
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void wkgbmnqykc(Menu menu, androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVar) {
        if (this.f3266agtfadlqog == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f3273iobyxmoadg.getContext());
            this.f3266agtfadlqog = actionMenuPresenter;
            actionMenuPresenter.rgvfuqvkyq(lqeggnwhkg.gxszxtbevo.action_menu_presenter);
        }
        this.f3266agtfadlqog.eablkybsjg(iobyxmoadgVar);
        this.f3273iobyxmoadg.hcddaimhww((androidx.appcompat.view.menu.eablkybsjg) menu, this.f3266agtfadlqog);
    }

    public void yadqdtsiqt(CharSequence charSequence) {
        this.f3267btonecajqb = charSequence;
        if ((this.f3282zoijcleaow & 8) != 0) {
            this.f3273iobyxmoadg.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void yggfygwlhe(int i13) {
        this.f3273iobyxmoadg.setVisibility(i13);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void zdlpuopuiu(androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVar, androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        this.f3273iobyxmoadg.jpowsppfya(iobyxmoadgVar, iobyxmoadgVar2);
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public boolean zoijcleaow() {
        return this.f3273iobyxmoadg.iwizpuwonk();
    }

    public void zynmafqrjb(int i13) {
        istkbnxepw(i13 == 0 ? null : getContext().getString(i13));
    }

    public crxdokpmqz(Toolbar toolbar, boolean z13, int i13, int i14) {
        Drawable drawable;
        this.f3276ojitshcjhn = 0;
        this.f3278rgvfuqvkyq = 0;
        this.f3273iobyxmoadg = toolbar;
        this.f3269dxjokdxxww = toolbar.getTitle();
        this.f3267btonecajqb = toolbar.getSubtitle();
        this.f3275nufgyqmvbu = this.f3269dxjokdxxww != null;
        this.f3274lqeggnwhkg = toolbar.getNavigationIcon();
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(toolbar.getContext(), null, lqeggnwhkg.btonecajqb.ActionBar, lqeggnwhkg.iobyxmoadg.actionBarStyle, 0);
        this.f3279vdvldrhtss = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.ActionBar_homeAsUpIndicator);
        if (z13) {
            CharSequence charSequenceRgvfuqvkyq = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceRgvfuqvkyq)) {
                iozdgvuglv(charSequenceRgvfuqvkyq);
            }
            CharSequence charSequenceRgvfuqvkyq2 = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceRgvfuqvkyq2)) {
                yadqdtsiqt(charSequenceRgvfuqvkyq2);
            }
            Drawable drawableLqeggnwhkg = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.ActionBar_logo);
            if (drawableLqeggnwhkg != null) {
                pmvmpeiblj(drawableLqeggnwhkg);
            }
            Drawable drawableLqeggnwhkg2 = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.ActionBar_icon);
            if (drawableLqeggnwhkg2 != null) {
                setIcon(drawableLqeggnwhkg2);
            }
            if (this.f3274lqeggnwhkg == null && (drawable = this.f3279vdvldrhtss) != null) {
                cdpycssgdh(drawable);
            }
            dxjokdxxww(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.ActionBar_displayOptions, 0));
            int iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionBar_customNavigationLayout, 0);
            if (iAgtfadlqog != 0) {
                esjtqupxsv(LayoutInflater.from(this.f3273iobyxmoadg.getContext()).inflate(iAgtfadlqog, (ViewGroup) this.f3273iobyxmoadg, false));
                dxjokdxxww(this.f3282zoijcleaow | 16);
            }
            int iWflxmlrfwp = mbcevpiqjqVarJyumaefscl.wflxmlrfwp(lqeggnwhkg.btonecajqb.ActionBar_height, 0);
            if (iWflxmlrfwp > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3273iobyxmoadg.getLayoutParams();
                layoutParams.height = iWflxmlrfwp;
                this.f3273iobyxmoadg.setLayoutParams(layoutParams);
            }
            int iEablkybsjg = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.ActionBar_contentInsetStart, -1);
            int iEablkybsjg2 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.ActionBar_contentInsetEnd, -1);
            if (iEablkybsjg >= 0 || iEablkybsjg2 >= 0) {
                this.f3273iobyxmoadg.pkzmftpjix(Math.max(iEablkybsjg, 0), Math.max(iEablkybsjg2, 0));
            }
            int iAgtfadlqog2 = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionBar_titleTextStyle, 0);
            if (iAgtfadlqog2 != 0) {
                Toolbar toolbar2 = this.f3273iobyxmoadg;
                toolbar2.cllcsxoeiz(toolbar2.getContext(), iAgtfadlqog2);
            }
            int iAgtfadlqog3 = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionBar_subtitleTextStyle, 0);
            if (iAgtfadlqog3 != 0) {
                Toolbar toolbar3 = this.f3273iobyxmoadg;
                toolbar3.hkdspvbjdz(toolbar3.getContext(), iAgtfadlqog3);
            }
            int iAgtfadlqog4 = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionBar_popupTheme, 0);
            if (iAgtfadlqog4 != 0) {
                this.f3273iobyxmoadg.setPopupTheme(iAgtfadlqog4);
            }
        } else {
            this.f3282zoijcleaow = cqumvgiudr();
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        lereixgezr(i13);
        this.f3271gtknphoqwx = this.f3273iobyxmoadg.getNavigationContentDescription();
        this.f3273iobyxmoadg.setNavigationOnClickListener(new iobyxmoadg());
    }

    @Override // androidx.appcompat.widget.lereixgezr
    public void setIcon(Drawable drawable) {
        this.f3270eablkybsjg = drawable;
        pkzmftpjix();
    }
}
