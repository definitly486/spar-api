package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.iobyxmoadg implements v1.zoijcleaow.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    wkgbmnqykc f3023cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f3024cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f3025dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f3026hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f3027hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f3028iozdgvuglv;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f3029jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    eablkybsjg f3030kegysxyocb;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f3031lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    ppxfxbqfkf f3032mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private zoijcleaow f3033ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f3034pkzmftpjix;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    int f3035sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final SparseBooleanArray f3036stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    iobyxmoadg f3037tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    final gxszxtbevo f3038ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f3039wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f3040wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Drawable f3041yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f3042ylkuphrtab;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public int f3043zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        SavedState(Parcel parcel) {
            this.f3043zdlpuopuiu = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f3043zdlpuopuiu);
        }
    }

    private class eablkybsjg extends androidx.appcompat.view.menu.dxjokdxxww {
        public eablkybsjg(Context context, androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, View view, boolean z13) {
            super(context, eablkybsjgVar, view, z13, lqeggnwhkg.iobyxmoadg.actionOverflowMenuStyle);
            nufgyqmvbu(8388613);
            btonecajqb(ActionMenuPresenter.this.f3038ulzqkzuiru);
        }

        @Override // androidx.appcompat.view.menu.dxjokdxxww
        protected void eablkybsjg() {
            if (((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2849jyumaefscl != null) {
                ((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2849jyumaefscl.close();
            }
            ActionMenuPresenter.this.f3030kegysxyocb = null;
            super.eablkybsjg();
        }
    }

    private class gxszxtbevo implements androidx.appcompat.view.menu.btonecajqb.iobyxmoadg {
        gxszxtbevo() {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
            if (eablkybsjgVar instanceof androidx.appcompat.view.menu.wflxmlrfwp) {
                eablkybsjgVar.cdpycssgdh().eablkybsjg(false);
            }
            androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVarWflxmlrfwp = ActionMenuPresenter.this.wflxmlrfwp();
            if (iobyxmoadgVarWflxmlrfwp != null) {
                iobyxmoadgVarWflxmlrfwp.ppxfxbqfkf(eablkybsjgVar, z13);
            }
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public boolean wkgbmnqykc(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar == ((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2849jyumaefscl) {
                return false;
            }
            ActionMenuPresenter.this.f3035sopmlzcsov = ((androidx.appcompat.view.menu.wflxmlrfwp) eablkybsjgVar).getItem().getItemId();
            androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVarWflxmlrfwp = ActionMenuPresenter.this.wflxmlrfwp();
            if (iobyxmoadgVarWflxmlrfwp != null) {
                return iobyxmoadgVarWflxmlrfwp.wkgbmnqykc(eablkybsjgVar);
            }
            return false;
        }
    }

    private class iobyxmoadg extends androidx.appcompat.view.menu.dxjokdxxww {
        public iobyxmoadg(Context context, androidx.appcompat.view.menu.wflxmlrfwp wflxmlrfwpVar, View view) {
            super(context, wflxmlrfwpVar, view, false, lqeggnwhkg.iobyxmoadg.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.lqeggnwhkg) wflxmlrfwpVar.getItem()).draadjrbmk()) {
                View view2 = ActionMenuPresenter.this.f3023cdpycssgdh;
                gxszxtbevo(view2 == null ? (View) ((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2854zynmafqrjb : view2);
            }
            btonecajqb(ActionMenuPresenter.this.f3038ulzqkzuiru);
        }

        @Override // androidx.appcompat.view.menu.dxjokdxxww
        protected void eablkybsjg() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f3037tzroggbefp = null;
            actionMenuPresenter.f3035sopmlzcsov = 0;
            super.eablkybsjg();
        }
    }

    private class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private eablkybsjg f3048zdlpuopuiu;

        public ppxfxbqfkf(eablkybsjg eablkybsjgVar) {
            this.f3048zdlpuopuiu = eablkybsjgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2849jyumaefscl != null) {
                ((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2849jyumaefscl.wkgbmnqykc();
            }
            View view = (View) ((androidx.appcompat.view.menu.iobyxmoadg) ActionMenuPresenter.this).f2854zynmafqrjb;
            if (view != null && view.getWindowToken() != null && this.f3048zdlpuopuiu.wflxmlrfwp()) {
                ActionMenuPresenter.this.f3030kegysxyocb = this.f3048zdlpuopuiu;
            }
            ActionMenuPresenter.this.f3032mbcevpiqjq = null;
        }
    }

    private class wkgbmnqykc extends AppCompatImageView implements ActionMenuView.iobyxmoadg {

        class iobyxmoadg extends wwaezpbzkn {

            /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f3051istkbnxepw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f3051istkbnxepw = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.wwaezpbzkn
            public boolean ppxfxbqfkf() {
                ActionMenuPresenter.this.hcddaimhww();
                return true;
            }

            @Override // androidx.appcompat.widget.wwaezpbzkn
            public boolean wkgbmnqykc() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f3032mbcevpiqjq != null) {
                    return false;
                }
                actionMenuPresenter.zynmafqrjb();
                return true;
            }

            @Override // androidx.appcompat.widget.wwaezpbzkn
            public draadjrbmk.eablkybsjg zoijcleaow() {
                eablkybsjg eablkybsjgVar = ActionMenuPresenter.this.f3030kegysxyocb;
                if (eablkybsjgVar == null) {
                    return null;
                }
                return eablkybsjgVar.ppxfxbqfkf();
            }
        }

        public wkgbmnqykc(Context context) {
            super(context, null, lqeggnwhkg.iobyxmoadg.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            jlmebxxoox.iobyxmoadg(this, getContentDescription());
            setOnTouchListener(new iobyxmoadg(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.iobyxmoadg
        public boolean iobyxmoadg() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.hcddaimhww();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i13, int i14, int i15, int i16) {
            boolean frame = super.setFrame(i13, i14, i15, i16);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                k1.iobyxmoadg.draadjrbmk(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.iobyxmoadg
        public boolean zoijcleaow() {
            return false;
        }
    }

    private class zoijcleaow extends ActionMenuItemView.zoijcleaow {
        zoijcleaow() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.zoijcleaow
        public draadjrbmk.eablkybsjg iobyxmoadg() {
            iobyxmoadg iobyxmoadgVar = ActionMenuPresenter.this.f3037tzroggbefp;
            if (iobyxmoadgVar != null) {
                return iobyxmoadgVar.ppxfxbqfkf();
            }
            return null;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, lqeggnwhkg.lqeggnwhkg.abc_action_menu_layout, lqeggnwhkg.lqeggnwhkg.abc_action_menu_item_layout);
        this.f3036stevsuqkhv = new SparseBooleanArray();
        this.f3038ulzqkzuiru = new gxszxtbevo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View lereixgezr(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2854zynmafqrjb;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if ((childAt instanceof androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg) && ((androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg
    public View agtfadlqog(androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar, View view, ViewGroup viewGroup) {
        View actionView = lqeggnwhkgVar.getActionView();
        if (actionView == null || lqeggnwhkgVar.btonecajqb()) {
            actionView = super.agtfadlqog(lqeggnwhkgVar, view, viewGroup);
        }
        actionView.setVisibility(lqeggnwhkgVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg, androidx.appcompat.view.menu.btonecajqb
    public void btonecajqb(Context context, androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
        super.btonecajqb(context, eablkybsjgVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.iobyxmoadg iobyxmoadgVarZoijcleaow = androidx.appcompat.view.iobyxmoadg.zoijcleaow(context);
        if (!this.f3039wwaezpbzkn) {
            this.f3031lmojexxdyd = iobyxmoadgVarZoijcleaow.gxszxtbevo();
        }
        if (!this.f3024cllcsxoeiz) {
            this.f3042ylkuphrtab = iobyxmoadgVarZoijcleaow.ppxfxbqfkf();
        }
        if (!this.f3029jpowsppfya) {
            this.f3026hcddaimhww = iobyxmoadgVarZoijcleaow.wkgbmnqykc();
        }
        int measuredWidth = this.f3042ylkuphrtab;
        if (this.f3031lmojexxdyd) {
            if (this.f3023cdpycssgdh == null) {
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f2853zdlpuopuiu);
                this.f3023cdpycssgdh = wkgbmnqykcVar;
                if (this.f3028iozdgvuglv) {
                    wkgbmnqykcVar.setImageDrawable(this.f3041yadqdtsiqt);
                    this.f3041yadqdtsiqt = null;
                    this.f3028iozdgvuglv = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3023cdpycssgdh.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f3023cdpycssgdh.getMeasuredWidth();
        } else {
            this.f3023cdpycssgdh = null;
        }
        this.f3034pkzmftpjix = measuredWidth;
        this.f3040wypolnanlu = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean cdpycssgdh() {
        return this.f3032mbcevpiqjq != null || yadqdtsiqt();
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg
    public boolean draadjrbmk(ViewGroup viewGroup, int i13) {
        if (viewGroup.getChildAt(i13) == this.f3023cdpycssgdh) {
            return false;
        }
        return super.draadjrbmk(viewGroup, i13);
    }

    public boolean esjtqupxsv() {
        return zynmafqrjb() | istkbnxepw();
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg, androidx.appcompat.view.menu.btonecajqb
    public boolean gxszxtbevo(androidx.appcompat.view.menu.wflxmlrfwp wflxmlrfwpVar) {
        boolean z13 = false;
        if (!wflxmlrfwpVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwpVar;
        while (wflxmlrfwpVar2.xrmfcynszj() != this.f2849jyumaefscl) {
            wflxmlrfwpVar2 = (androidx.appcompat.view.menu.wflxmlrfwp) wflxmlrfwpVar2.xrmfcynszj();
        }
        View viewLereixgezr = lereixgezr(wflxmlrfwpVar2.getItem());
        if (viewLereixgezr == null) {
            return false;
        }
        this.f3035sopmlzcsov = wflxmlrfwpVar.getItem().getItemId();
        int size = wflxmlrfwpVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = wflxmlrfwpVar.getItem(i13);
            if (item.isVisible() && item.getIcon() != null) {
                z13 = true;
                break;
            }
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f2852yggfygwlhe, wflxmlrfwpVar, viewLereixgezr);
        this.f3037tzroggbefp = iobyxmoadgVar;
        iobyxmoadgVar.lqeggnwhkg(z13);
        this.f3037tzroggbefp.gtknphoqwx();
        super.gxszxtbevo(wflxmlrfwpVar);
        return true;
    }

    public boolean hcddaimhww() {
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar;
        if (!this.f3031lmojexxdyd || yadqdtsiqt() || (eablkybsjgVar = this.f2849jyumaefscl) == null || this.f2854zynmafqrjb == null || this.f3032mbcevpiqjq != null || eablkybsjgVar.lereixgezr().isEmpty()) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(new eablkybsjg(this.f2852yggfygwlhe, this.f2849jyumaefscl, this.f3023cdpycssgdh, true));
        this.f3032mbcevpiqjq = ppxfxbqfkfVar;
        ((View) this.f2854zynmafqrjb).post(ppxfxbqfkfVar);
        return true;
    }

    public void iozdgvuglv(Configuration configuration) {
        if (!this.f3029jpowsppfya) {
            this.f3026hcddaimhww = androidx.appcompat.view.iobyxmoadg.zoijcleaow(this.f2852yggfygwlhe).wkgbmnqykc();
        }
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = this.f2849jyumaefscl;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.jpowsppfya(true);
        }
    }

    public boolean istkbnxepw() {
        iobyxmoadg iobyxmoadgVar = this.f3037tzroggbefp;
        if (iobyxmoadgVar == null) {
            return false;
        }
        iobyxmoadgVar.zoijcleaow();
        return true;
    }

    public void lmojexxdyd(boolean z13) {
        this.f3025dsvhmnatus = z13;
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg, androidx.appcompat.view.menu.btonecajqb
    public void lqeggnwhkg(boolean z13) {
        super.lqeggnwhkg(z13);
        ((View) this.f2854zynmafqrjb).requestLayout();
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = this.f2849jyumaefscl;
        boolean z14 = false;
        if (eablkybsjgVar != null) {
            ArrayList arrayListKcexrzcfyt = eablkybsjgVar.kcexrzcfyt();
            int size = arrayListKcexrzcfyt.size();
            for (int i13 = 0; i13 < size; i13++) {
                v1.zoijcleaow zoijcleaowVarZoijcleaow = ((androidx.appcompat.view.menu.lqeggnwhkg) arrayListKcexrzcfyt.get(i13)).zoijcleaow();
                if (zoijcleaowVarZoijcleaow != null) {
                    zoijcleaowVarZoijcleaow.nufgyqmvbu(this);
                }
            }
        }
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar2 = this.f2849jyumaefscl;
        ArrayList arrayListLereixgezr = eablkybsjgVar2 != null ? eablkybsjgVar2.lereixgezr() : null;
        if (this.f3031lmojexxdyd && arrayListLereixgezr != null) {
            int size2 = arrayListLereixgezr.size();
            if (size2 == 1) {
                z14 = !((androidx.appcompat.view.menu.lqeggnwhkg) arrayListLereixgezr.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z14 = true;
            }
        }
        if (z14) {
            if (this.f3023cdpycssgdh == null) {
                this.f3023cdpycssgdh = new wkgbmnqykc(this.f2853zdlpuopuiu);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3023cdpycssgdh.getParent();
            if (viewGroup != this.f2854zynmafqrjb) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3023cdpycssgdh);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2854zynmafqrjb;
                actionMenuView.addView(this.f3023cdpycssgdh, actionMenuView.agtfadlqog());
            }
        } else {
            wkgbmnqykc wkgbmnqykcVar = this.f3023cdpycssgdh;
            if (wkgbmnqykcVar != null) {
                Object parent = wkgbmnqykcVar.getParent();
                Object obj = this.f2854zynmafqrjb;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3023cdpycssgdh);
                }
            }
        }
        ((ActionMenuView) this.f2854zynmafqrjb).setOverflowReserved(this.f3031lmojexxdyd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.lqeggnwhkg] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean nufgyqmvbu() {
        ArrayList arrayListYadqdtsiqt;
        int size;
        int i13;
        int iZdlpuopuiu;
        ?? r13;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = actionMenuPresenter.f2849jyumaefscl;
        View view = null;
        ?? r14 = 0;
        if (eablkybsjgVar != null) {
            arrayListYadqdtsiqt = eablkybsjgVar.yadqdtsiqt();
            size = arrayListYadqdtsiqt.size();
        } else {
            arrayListYadqdtsiqt = null;
            size = 0;
        }
        int i14 = actionMenuPresenter.f3026hcddaimhww;
        int i15 = actionMenuPresenter.f3034pkzmftpjix;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2854zynmafqrjb;
        boolean z13 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar = (androidx.appcompat.view.menu.lqeggnwhkg) arrayListYadqdtsiqt.get(i18);
            if (lqeggnwhkgVar.ojitshcjhn()) {
                i16++;
            } else if (lqeggnwhkgVar.agtfadlqog()) {
                i17++;
            } else {
                z13 = true;
            }
            if (actionMenuPresenter.f3025dsvhmnatus && lqeggnwhkgVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (actionMenuPresenter.f3031lmojexxdyd && (z13 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f3036stevsuqkhv;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f3027hkdspvbjdz) {
            int i23 = actionMenuPresenter.f3040wypolnanlu;
            iZdlpuopuiu = i15 / i23;
            i13 = i23 + ((i15 % i23) / iZdlpuopuiu);
        } else {
            i13 = 0;
            iZdlpuopuiu = 0;
        }
        int i24 = 0;
        int i25 = 0;
        ?? r15 = actionMenuPresenter;
        while (i24 < size) {
            ?? r16 = (androidx.appcompat.view.menu.lqeggnwhkg) arrayListYadqdtsiqt.get(i24);
            if (r16.ojitshcjhn()) {
                View viewAgtfadlqog = r15.agtfadlqog(r16, view, viewGroup);
                if (r15.f3027hkdspvbjdz) {
                    iZdlpuopuiu -= ActionMenuView.zdlpuopuiu(viewAgtfadlqog, i13, iZdlpuopuiu, iMakeMeasureSpec, r14);
                } else {
                    viewAgtfadlqog.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewAgtfadlqog.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i25 == 0) {
                    i25 = measuredWidth;
                }
                int groupId = r16.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r16.yggfygwlhe(true);
                r13 = r14;
            } else if (r16.agtfadlqog()) {
                int groupId2 = r16.getGroupId();
                boolean z14 = sparseBooleanArray.get(groupId2);
                boolean z15 = (i19 > 0 || z14) && i15 > 0 && (!r15.f3027hkdspvbjdz || iZdlpuopuiu > 0);
                boolean z16 = z15;
                if (z15) {
                    View viewAgtfadlqog2 = r15.agtfadlqog(r16, null, viewGroup);
                    if (r15.f3027hkdspvbjdz) {
                        int iZdlpuopuiu2 = ActionMenuView.zdlpuopuiu(viewAgtfadlqog2, i13, iZdlpuopuiu, iMakeMeasureSpec, 0);
                        iZdlpuopuiu -= iZdlpuopuiu2;
                        if (iZdlpuopuiu2 == 0) {
                            z16 = false;
                        }
                    } else {
                        viewAgtfadlqog2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z17 = z16;
                    int measuredWidth2 = viewAgtfadlqog2.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i25 == 0) {
                        i25 = measuredWidth2;
                    }
                    z15 = z17 & (!r15.f3027hkdspvbjdz ? i15 + i25 <= 0 : i15 < 0);
                }
                if (z15 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z14) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i26 = 0; i26 < i24; i26++) {
                        androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar2 = (androidx.appcompat.view.menu.lqeggnwhkg) arrayListYadqdtsiqt.get(i26);
                        if (lqeggnwhkgVar2.getGroupId() == groupId2) {
                            if (lqeggnwhkgVar2.draadjrbmk()) {
                                i19++;
                            }
                            lqeggnwhkgVar2.yggfygwlhe(false);
                        }
                    }
                }
                if (z15) {
                    i19--;
                }
                r16.yggfygwlhe(z15);
                r13 = 0;
            } else {
                r13 = r14;
                r16.yggfygwlhe(r13);
            }
            i24++;
            r14 = r13;
            size = size;
            view = null;
            r15 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg
    public androidx.appcompat.view.menu.gtknphoqwx ojitshcjhn(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.gtknphoqwx gtknphoqwxVar = this.f2854zynmafqrjb;
        androidx.appcompat.view.menu.gtknphoqwx gtknphoqwxVarOjitshcjhn = super.ojitshcjhn(viewGroup);
        if (gtknphoqwxVar != gtknphoqwxVarOjitshcjhn) {
            ((ActionMenuView) gtknphoqwxVarOjitshcjhn).setPresenter(this);
        }
        return gtknphoqwxVarOjitshcjhn;
    }

    public void pkzmftpjix(boolean z13) {
        this.f3031lmojexxdyd = z13;
        this.f3039wwaezpbzkn = true;
    }

    public Drawable pmvmpeiblj() {
        wkgbmnqykc wkgbmnqykcVar = this.f3023cdpycssgdh;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.getDrawable();
        }
        if (this.f3028iozdgvuglv) {
            return this.f3041yadqdtsiqt;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg, androidx.appcompat.view.menu.btonecajqb
    public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
        esjtqupxsv();
        super.ppxfxbqfkf(eablkybsjgVar, z13);
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg
    public boolean vdvldrhtss(int i13, androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar.draadjrbmk();
    }

    public void wwaezpbzkn(ActionMenuView actionMenuView) {
        this.f2854zynmafqrjb = actionMenuView;
        actionMenuView.iobyxmoadg(this.f2849jyumaefscl);
    }

    public boolean yadqdtsiqt() {
        eablkybsjg eablkybsjgVar = this.f3030kegysxyocb;
        return eablkybsjgVar != null && eablkybsjgVar.wkgbmnqykc();
    }

    public void ylkuphrtab(Drawable drawable) {
        wkgbmnqykc wkgbmnqykcVar = this.f3023cdpycssgdh;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.setImageDrawable(drawable);
        } else {
            this.f3028iozdgvuglv = true;
            this.f3041yadqdtsiqt = drawable;
        }
    }

    @Override // androidx.appcompat.view.menu.iobyxmoadg
    public void zoijcleaow(androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar, androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.ppxfxbqfkf(lqeggnwhkgVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) iobyxmoadgVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2854zynmafqrjb);
        if (this.f3033ntlheqmsrt == null) {
            this.f3033ntlheqmsrt = new zoijcleaow();
        }
        actionMenuItemView.setPopupCallback(this.f3033ntlheqmsrt);
    }

    public boolean zynmafqrjb() {
        Object obj;
        ppxfxbqfkf ppxfxbqfkfVar = this.f3032mbcevpiqjq;
        if (ppxfxbqfkfVar != null && (obj = this.f2854zynmafqrjb) != null) {
            ((View) obj).removeCallbacks(ppxfxbqfkfVar);
            this.f3032mbcevpiqjq = null;
            return true;
        }
        eablkybsjg eablkybsjgVar = this.f3030kegysxyocb;
        if (eablkybsjgVar == null) {
            return false;
        }
        eablkybsjgVar.zoijcleaow();
        return true;
    }
}
