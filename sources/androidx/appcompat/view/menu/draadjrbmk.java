package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.hcddaimhww;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk extends nufgyqmvbu implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, btonecajqb, View.OnKeyListener {

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private static final int f2778dsvhmnatus = lqeggnwhkg.lqeggnwhkg.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f2780cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f2781cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f2782esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f2783hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private View f2785iozdgvuglv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final wkgbmnqykc f2787iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f2788jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final eablkybsjg f2789jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f2790lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    View f2791lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f2792pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f2793pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private btonecajqb.iobyxmoadg f2794wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2795yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f2796yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    ViewTreeObserver f2797ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final hcddaimhww f2798zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2786istkbnxepw = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2779cdpycssgdh = new zoijcleaow();

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f2784hkdspvbjdz = 0;

    class iobyxmoadg implements ViewTreeObserver.OnGlobalLayoutListener {
        iobyxmoadg() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!draadjrbmk.this.zoijcleaow() || draadjrbmk.this.f2798zynmafqrjb.zynmafqrjb()) {
                return;
            }
            View view = draadjrbmk.this.f2791lmojexxdyd;
            if (view == null || !view.isShown()) {
                draadjrbmk.this.dismiss();
            } else {
                draadjrbmk.this.f2798zynmafqrjb.iobyxmoadg();
            }
        }
    }

    class zoijcleaow implements View.OnAttachStateChangeListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = draadjrbmk.this.f2797ylkuphrtab;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    draadjrbmk.this.f2797ylkuphrtab = view.getViewTreeObserver();
                }
                draadjrbmk draadjrbmkVar = draadjrbmk.this;
                draadjrbmkVar.f2797ylkuphrtab.removeGlobalOnLayoutListener(draadjrbmkVar.f2786istkbnxepw);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public draadjrbmk(Context context, eablkybsjg eablkybsjgVar, View view, int i13, int i14, boolean z13) {
        this.f2796yggfygwlhe = context;
        this.f2789jyumaefscl = eablkybsjgVar;
        this.f2781cqumvgiudr = z13;
        this.f2787iwizpuwonk = new wkgbmnqykc(eablkybsjgVar, LayoutInflater.from(context), z13, f2778dsvhmnatus);
        this.f2790lereixgezr = i13;
        this.f2793pmvmpeiblj = i14;
        Resources resources = context.getResources();
        this.f2782esjtqupxsv = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(lqeggnwhkg.wkgbmnqykc.abc_config_prefDialogWidth));
        this.f2785iozdgvuglv = view;
        this.f2798zynmafqrjb = new hcddaimhww(context, null, i13, i14);
        eablkybsjgVar.ppxfxbqfkf(this, context);
    }

    private boolean lereixgezr() {
        View view;
        if (zoijcleaow()) {
            return true;
        }
        if (this.f2792pkzmftpjix || (view = this.f2785iozdgvuglv) == null) {
            return false;
        }
        this.f2791lmojexxdyd = view;
        this.f2798zynmafqrjb.hcddaimhww(this);
        this.f2798zynmafqrjb.jpowsppfya(this);
        this.f2798zynmafqrjb.pkzmftpjix(true);
        View view2 = this.f2791lmojexxdyd;
        boolean z13 = this.f2797ylkuphrtab == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2797ylkuphrtab = viewTreeObserver;
        if (z13) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2786istkbnxepw);
        }
        view2.addOnAttachStateChangeListener(this.f2779cdpycssgdh);
        this.f2798zynmafqrjb.cdpycssgdh(view2);
        this.f2798zynmafqrjb.lmojexxdyd(this.f2784hkdspvbjdz);
        if (!this.f2783hcddaimhww) {
            this.f2788jpowsppfya = nufgyqmvbu.agtfadlqog(this.f2787iwizpuwonk, null, this.f2796yggfygwlhe, this.f2782esjtqupxsv);
            this.f2783hcddaimhww = true;
        }
        this.f2798zynmafqrjb.iozdgvuglv(this.f2788jpowsppfya);
        this.f2798zynmafqrjb.ylkuphrtab(2);
        this.f2798zynmafqrjb.wwaezpbzkn(wflxmlrfwp());
        this.f2798zynmafqrjb.iobyxmoadg();
        ListView listViewRgvfuqvkyq = this.f2798zynmafqrjb.rgvfuqvkyq();
        listViewRgvfuqvkyq.setOnKeyListener(this);
        if (this.f2780cllcsxoeiz && this.f2789jyumaefscl.cqumvgiudr() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2796yggfygwlhe).inflate(lqeggnwhkg.lqeggnwhkg.abc_popup_menu_header_item_layout, (ViewGroup) listViewRgvfuqvkyq, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f2789jyumaefscl.cqumvgiudr());
            }
            frameLayout.setEnabled(false);
            listViewRgvfuqvkyq.addHeaderView(frameLayout, null, false);
        }
        this.f2798zynmafqrjb.agtfadlqog(this.f2787iwizpuwonk);
        this.f2798zynmafqrjb.iobyxmoadg();
        return true;
    }

    @Override // draadjrbmk.eablkybsjg
    public void dismiss() {
        if (zoijcleaow()) {
            this.f2798zynmafqrjb.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void eablkybsjg(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        this.f2794wwaezpbzkn = iobyxmoadgVar;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void gtknphoqwx(eablkybsjg eablkybsjgVar) {
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean gxszxtbevo(wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar.hasVisibleItems()) {
            dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this.f2796yggfygwlhe, wflxmlrfwpVar, this.f2791lmojexxdyd, this.f2781cqumvgiudr, this.f2790lereixgezr, this.f2793pmvmpeiblj);
            dxjokdxxwwVar.btonecajqb(this.f2794wwaezpbzkn);
            dxjokdxxwwVar.lqeggnwhkg(nufgyqmvbu.cqumvgiudr(wflxmlrfwpVar));
            dxjokdxxwwVar.dxjokdxxww(this.f2795yadqdtsiqt);
            this.f2795yadqdtsiqt = null;
            this.f2789jyumaefscl.eablkybsjg(false);
            int iWkgbmnqykc = this.f2798zynmafqrjb.wkgbmnqykc();
            int iWflxmlrfwp = this.f2798zynmafqrjb.wflxmlrfwp();
            if ((Gravity.getAbsoluteGravity(this.f2784hkdspvbjdz, this.f2785iozdgvuglv.getLayoutDirection()) & 7) == 5) {
                iWkgbmnqykc += this.f2785iozdgvuglv.getWidth();
            }
            if (dxjokdxxwwVar.agtfadlqog(iWkgbmnqykc, iWflxmlrfwp)) {
                btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2794wwaezpbzkn;
                if (iobyxmoadgVar == null) {
                    return true;
                }
                iobyxmoadgVar.wkgbmnqykc(wflxmlrfwpVar);
                return true;
            }
        }
        return false;
    }

    @Override // draadjrbmk.eablkybsjg
    public void iobyxmoadg() {
        if (!lereixgezr()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void iwizpuwonk(int i13) {
        this.f2798zynmafqrjb.btonecajqb(i13);
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void jyumaefscl(boolean z13) {
        this.f2780cllcsxoeiz = z13;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void kcexrzcfyt(int i13) {
        this.f2784hkdspvbjdz = i13;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void lqeggnwhkg(boolean z13) {
        this.f2783hcddaimhww = false;
        wkgbmnqykc wkgbmnqykcVar = this.f2787iwizpuwonk;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean nufgyqmvbu() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void ojitshcjhn(View view) {
        this.f2785iozdgvuglv = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2792pkzmftpjix = true;
        this.f2789jyumaefscl.close();
        ViewTreeObserver viewTreeObserver = this.f2797ylkuphrtab;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2797ylkuphrtab = this.f2791lmojexxdyd.getViewTreeObserver();
            }
            this.f2797ylkuphrtab.removeGlobalOnLayoutListener(this.f2786istkbnxepw);
            this.f2797ylkuphrtab = null;
        }
        this.f2791lmojexxdyd.removeOnAttachStateChangeListener(this.f2779cdpycssgdh);
        PopupWindow.OnDismissListener onDismissListener = this.f2795yadqdtsiqt;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i13, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i13 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void oxmwwwfdhm(boolean z13) {
        this.f2787iwizpuwonk.wkgbmnqykc(z13);
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, boolean z13) {
        if (eablkybsjgVar != this.f2789jyumaefscl) {
            return;
        }
        dismiss();
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2794wwaezpbzkn;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar, z13);
        }
    }

    @Override // draadjrbmk.eablkybsjg
    public ListView rgvfuqvkyq() {
        return this.f2798zynmafqrjb.rgvfuqvkyq();
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void yggfygwlhe(PopupWindow.OnDismissListener onDismissListener) {
        this.f2795yadqdtsiqt = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void zdlpuopuiu(int i13) {
        this.f2798zynmafqrjb.gxszxtbevo(i13);
    }

    @Override // draadjrbmk.eablkybsjg
    public boolean zoijcleaow() {
        return !this.f2792pkzmftpjix && this.f2798zynmafqrjb.zoijcleaow();
    }
}
