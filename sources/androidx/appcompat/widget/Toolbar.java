package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements v1.cqumvgiudr {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f3191cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f3192cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private ImageView f3193cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final ArrayList f3194crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f3195czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f3196dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Drawable f3197esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f3198hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private cllcsxoeiz f3199hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private final ActionMenuView.eablkybsjg f3200ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f3201iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Context f3202istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ImageButton f3203iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    nufgyqmvbu f3204jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final int[] f3205jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f3206jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private TextView f3207jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private ActionMenuPresenter f3208jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private CharSequence f3209kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private CharSequence f3210lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    int f3211lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private ColorStateList f3212mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private androidx.appcompat.view.menu.btonecajqb.iobyxmoadg f3213metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private boolean f3214ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private crxdokpmqz f3215okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f3216pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    ImageButton f3217pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    final v1.pmvmpeiblj f3218ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg f3219rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private final Runnable f3220sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final ArrayList f3221sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private CharSequence f3222stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private ColorStateList f3223tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f3224ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private OnBackInvokedCallback f3225uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private ArrayList f3226vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f3227wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f3228wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private gxszxtbevo f3229xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f3230yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private boolean f3231ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private OnBackInvokedDispatcher f3232yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private TextView f3233yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f3234ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    ActionMenuView f3235zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    View f3236zynmafqrjb;

    static class eablkybsjg {
        static OnBackInvokedDispatcher iobyxmoadg(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static void ppxfxbqfkf(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void wkgbmnqykc(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        static OnBackInvokedCallback zoijcleaow(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.sopmlzcsov
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }
    }

    private class gxszxtbevo implements androidx.appcompat.view.menu.btonecajqb {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        androidx.appcompat.view.menu.lqeggnwhkg f3240yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        androidx.appcompat.view.menu.eablkybsjg f3241zdlpuopuiu;

        gxszxtbevo() {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public void btonecajqb(Context context, androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar;
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar2 = this.f3241zdlpuopuiu;
            if (eablkybsjgVar2 != null && (lqeggnwhkgVar = this.f3240yggfygwlhe) != null) {
                eablkybsjgVar2.gxszxtbevo(lqeggnwhkgVar);
            }
            this.f3241zdlpuopuiu = eablkybsjgVar;
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public boolean dxjokdxxww(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar) {
            KeyEvent.Callback callback = Toolbar.this.f3236zynmafqrjb;
            if (callback instanceof androidx.appcompat.view.ppxfxbqfkf) {
                ((androidx.appcompat.view.ppxfxbqfkf) callback).gxszxtbevo();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f3236zynmafqrjb);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f3217pmvmpeiblj);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f3236zynmafqrjb = null;
            toolbar3.iobyxmoadg();
            this.f3240yggfygwlhe = null;
            Toolbar.this.requestLayout();
            lqeggnwhkgVar.oxmwwwfdhm(false);
            Toolbar.this.kegysxyocb();
            return true;
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public boolean gxszxtbevo(androidx.appcompat.view.menu.wflxmlrfwp wflxmlrfwpVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public void lqeggnwhkg(boolean z13) {
            if (this.f3240yggfygwlhe != null) {
                androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = this.f3241zdlpuopuiu;
                if (eablkybsjgVar != null) {
                    int size = eablkybsjgVar.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        if (this.f3241zdlpuopuiu.getItem(i13) == this.f3240yggfygwlhe) {
                            return;
                        }
                    }
                }
                dxjokdxxww(this.f3241zdlpuopuiu, this.f3240yggfygwlhe);
            }
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public boolean nufgyqmvbu() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb
        public boolean wkgbmnqykc(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar) {
            Toolbar.this.lqeggnwhkg();
            ViewParent parent = Toolbar.this.f3217pmvmpeiblj.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f3217pmvmpeiblj);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f3217pmvmpeiblj);
            }
            Toolbar.this.f3236zynmafqrjb = lqeggnwhkgVar.getActionView();
            this.f3240yggfygwlhe = lqeggnwhkgVar;
            ViewParent parent2 = Toolbar.this.f3236zynmafqrjb.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f3236zynmafqrjb);
                }
                lqeggnwhkg lqeggnwhkgVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                lqeggnwhkgVarGenerateDefaultLayoutParams.f2634iobyxmoadg = (toolbar4.f3211lmojexxdyd & 112) | 8388611;
                lqeggnwhkgVarGenerateDefaultLayoutParams.f3243zoijcleaow = 2;
                toolbar4.f3236zynmafqrjb.setLayoutParams(lqeggnwhkgVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f3236zynmafqrjb);
            }
            Toolbar.this.ylkuphrtab();
            Toolbar.this.requestLayout();
            lqeggnwhkgVar.oxmwwwfdhm(true);
            KeyEvent.Callback callback = Toolbar.this.f3236zynmafqrjb;
            if (callback instanceof androidx.appcompat.view.ppxfxbqfkf) {
                ((androidx.appcompat.view.ppxfxbqfkf) callback).zoijcleaow();
            }
            Toolbar.this.kegysxyocb();
            return true;
        }
    }

    class iobyxmoadg implements ActionMenuView.eablkybsjg {
        iobyxmoadg() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.eablkybsjg
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f3218ribwqtqdhb.btonecajqb(menuItem)) {
                return true;
            }
            nufgyqmvbu nufgyqmvbuVar = Toolbar.this.f3204jhduphickx;
            if (nufgyqmvbuVar != null) {
                return nufgyqmvbuVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public interface nufgyqmvbu {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class ppxfxbqfkf implements androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public boolean iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg iobyxmoadgVar = Toolbar.this.f3219rlfsiqarku;
            return iobyxmoadgVar != null && iobyxmoadgVar.iobyxmoadg(eablkybsjgVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public void zoijcleaow(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            if (!Toolbar.this.f3235zdlpuopuiu.oxmwwwfdhm()) {
                Toolbar.this.f3218ribwqtqdhb.gtknphoqwx(eablkybsjgVar);
            }
            androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg iobyxmoadgVar = Toolbar.this.f3219rlfsiqarku;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.zoijcleaow(eablkybsjgVar);
            }
        }
    }

    class wkgbmnqykc implements View.OnClickListener {
        wkgbmnqykc() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.eablkybsjg();
        }
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.stevsuqkhv();
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.toolbarStyle);
    }

    private void btonecajqb() {
        gtknphoqwx();
        if (this.f3235zdlpuopuiu.jyumaefscl() == null) {
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = (androidx.appcompat.view.menu.eablkybsjg) this.f3235zdlpuopuiu.getMenu();
            if (this.f3229xrmfcynszj == null) {
                this.f3229xrmfcynszj = new gxszxtbevo();
            }
            this.f3235zdlpuopuiu.setExpandedActionViewsExclusive(true);
            eablkybsjgVar.ppxfxbqfkf(this.f3229xrmfcynszj, this.f3202istkbnxepw);
            kegysxyocb();
        }
    }

    private int cdpycssgdh(View view, int i13, int[] iArr, int i14) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).rightMargin - iArr[1];
        int iMax = i13 - Math.max(0, i15);
        iArr[1] = Math.max(0, -i15);
        int iVdvldrhtss = vdvldrhtss(view, i14);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iVdvldrhtss, iMax, view.getMeasuredHeight() + iVdvldrhtss);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).leftMargin);
    }

    private void draadjrbmk() {
        if (this.f3203iwizpuwonk == null) {
            this.f3203iwizpuwonk = new AppCompatImageButton(getContext(), null, lqeggnwhkg.iobyxmoadg.toolbarNavigationButtonStyle);
            lqeggnwhkg lqeggnwhkgVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            lqeggnwhkgVarGenerateDefaultLayoutParams.f2634iobyxmoadg = (this.f3211lmojexxdyd & 112) | 8388611;
            this.f3203iwizpuwonk.setLayoutParams(lqeggnwhkgVarGenerateDefaultLayoutParams);
        }
    }

    private boolean dsvhmnatus() {
        if (!this.f3195czzsidtyhn) {
            return false;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (wypolnanlu(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private void dxjokdxxww() {
        if (this.f3193cqumvgiudr == null) {
            this.f3193cqumvgiudr = new AppCompatImageView(getContext());
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i13 = 0; i13 < menu.size(); i13++) {
            arrayList.add(menu.getItem(i13));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.lqeggnwhkg(getContext());
    }

    private void gtknphoqwx() {
        if (this.f3235zdlpuopuiu == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f3235zdlpuopuiu = actionMenuView;
            actionMenuView.setPopupTheme(this.f3191cdpycssgdh);
            this.f3235zdlpuopuiu.setOnMenuItemClickListener(this.f3200ikoacuggdj);
            this.f3235zdlpuopuiu.iwizpuwonk(this.f3213metgxyhuhe, new ppxfxbqfkf());
            lqeggnwhkg lqeggnwhkgVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            lqeggnwhkgVarGenerateDefaultLayoutParams.f2634iobyxmoadg = (this.f3211lmojexxdyd & 112) | 8388613;
            this.f3235zdlpuopuiu.setLayoutParams(lqeggnwhkgVarGenerateDefaultLayoutParams);
            ppxfxbqfkf(this.f3235zdlpuopuiu, false);
        }
    }

    private void iozdgvuglv(View view, int i13, int i14, int i15, int i16, int i17) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i17 >= 0) {
            if (mode != 0) {
                i17 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i17);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int istkbnxepw(View view, int i13, int[] iArr, int i14) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).leftMargin - iArr[0];
        int iMax = i13 + Math.max(0, i15);
        iArr[0] = Math.max(0, -i15);
        int iVdvldrhtss = vdvldrhtss(view, i14);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iVdvldrhtss, iMax + measuredWidth, view.getMeasuredHeight() + iVdvldrhtss);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).rightMargin;
    }

    private int kcexrzcfyt(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private boolean lereixgezr(View view) {
        return view.getParent() == this || this.f3194crxdokpmqz.contains(view);
    }

    private void lmojexxdyd() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f3218ribwqtqdhb.nufgyqmvbu(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3226vipkmwdibw = currentMenuItems2;
    }

    private void nufgyqmvbu() {
        if (this.f3199hkdspvbjdz == null) {
            this.f3199hkdspvbjdz = new cllcsxoeiz();
        }
    }

    private int oxmwwwfdhm(int i13) {
        int i14 = i13 & 112;
        return (i14 == 16 || i14 == 48 || i14 == 80) ? i14 : this.f3228wypolnanlu & 112;
    }

    private void ppxfxbqfkf(View view, boolean z13) {
        lqeggnwhkg lqeggnwhkgVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            lqeggnwhkgVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            lqeggnwhkgVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (lqeggnwhkg) layoutParams;
        }
        lqeggnwhkgVarGenerateLayoutParams.f3243zoijcleaow = 1;
        if (!z13 || this.f3236zynmafqrjb == null) {
            addView(view, lqeggnwhkgVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(lqeggnwhkgVarGenerateLayoutParams);
            this.f3194crxdokpmqz.add(view);
        }
    }

    private int rgvfuqvkyq(int i13) {
        int layoutDirection = getLayoutDirection();
        int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(i13, layoutDirection) & 7;
        if (iZoijcleaow == 1 || iZoijcleaow == 3 || iZoijcleaow == 5) {
            return iZoijcleaow;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int vdvldrhtss(View view, int i13) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i13 > 0 ? (measuredHeight - i13) / 2 : 0;
        int iOxmwwwfdhm = oxmwwwfdhm(lqeggnwhkgVar.f2634iobyxmoadg);
        if (iOxmwwwfdhm == 48) {
            return getPaddingTop() - i14;
        }
        if (iOxmwwwfdhm == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).bottomMargin) - i14;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i15 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin;
        if (iMax < i15) {
            iMax = i15;
        } else {
            int i16 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i17 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).bottomMargin;
            if (i16 < i17) {
                iMax = Math.max(0, iMax - (i17 - i16));
            }
        }
        return paddingTop + iMax;
    }

    private void wwaezpbzkn() {
        removeCallbacks(this.f3220sflfametgt);
        post(this.f3220sflfametgt);
    }

    private boolean wypolnanlu(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int yadqdtsiqt(View view, int i13, int i14, int i15, int i16, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i17 = marginLayoutParams.leftMargin - iArr[0];
        int i18 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i17) + Math.max(0, i18);
        iArr[0] = Math.max(0, -i17);
        iArr[1] = Math.max(0, -i18);
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingLeft() + getPaddingRight() + iMax + i14, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i15, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private int yggfygwlhe(List list, int[] iArr) {
        int i13 = iArr[0];
        int i14 = iArr[1];
        int size = list.size();
        int i15 = 0;
        int measuredWidth = 0;
        while (i15 < size) {
            View view = (View) list.get(i15);
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) view.getLayoutParams();
            int i16 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).leftMargin - i13;
            int i17 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).rightMargin - i14;
            int iMax = Math.max(0, i16);
            int iMax2 = Math.max(0, i17);
            int iMax3 = Math.max(0, -i16);
            int iMax4 = Math.max(0, -i17);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i15++;
            i14 = iMax4;
            i13 = iMax3;
        }
        return measuredWidth;
    }

    private int zdlpuopuiu(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void zoijcleaow(List list, int i13) {
        boolean z13 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(i13, getLayoutDirection());
        list.clear();
        if (!z13) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) childAt.getLayoutParams();
                if (lqeggnwhkgVar.f3243zoijcleaow == 0 && wypolnanlu(childAt) && rgvfuqvkyq(lqeggnwhkgVar.f2634iobyxmoadg) == iZoijcleaow) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i15 = childCount - 1; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) childAt2.getLayoutParams();
            if (lqeggnwhkgVar2.f3243zoijcleaow == 0 && wypolnanlu(childAt2) && rgvfuqvkyq(lqeggnwhkgVar2.f2634iobyxmoadg) == iZoijcleaow) {
                list.add(childAt2);
            }
        }
    }

    @Override // v1.cqumvgiudr
    public void addMenuProvider(v1.istkbnxepw istkbnxepwVar) {
        this.f3218ribwqtqdhb.ppxfxbqfkf(istkbnxepwVar);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg generateLayoutParams(AttributeSet attributeSet) {
        return new lqeggnwhkg(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof lqeggnwhkg);
    }

    public void cllcsxoeiz(Context context, int i13) {
        this.f3230yadqdtsiqt = i13;
        TextView textView = this.f3233yggfygwlhe;
        if (textView != null) {
            textView.setTextAppearance(context, i13);
        }
    }

    public void cqumvgiudr(int i13) {
        getMenuInflater().inflate(i13, getMenu());
    }

    public void eablkybsjg() {
        gxszxtbevo gxszxtbevoVar = this.f3229xrmfcynszj;
        androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar = gxszxtbevoVar == null ? null : gxszxtbevoVar.f3240yggfygwlhe;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.collapseActionView();
        }
    }

    public void esjtqupxsv() {
        Iterator it = this.f3226vipkmwdibw.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        lmojexxdyd();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f3217pmvmpeiblj;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f3217pmvmpeiblj;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        cllcsxoeiz cllcsxoeizVar = this.f3199hkdspvbjdz;
        if (cllcsxoeizVar != null) {
            return cllcsxoeizVar.iobyxmoadg();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i13 = this.f3196dsvhmnatus;
        return i13 != Integer.MIN_VALUE ? i13 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        cllcsxoeiz cllcsxoeizVar = this.f3199hkdspvbjdz;
        if (cllcsxoeizVar != null) {
            return cllcsxoeizVar.zoijcleaow();
        }
        return 0;
    }

    public int getContentInsetRight() {
        cllcsxoeiz cllcsxoeizVar = this.f3199hkdspvbjdz;
        if (cllcsxoeizVar != null) {
            return cllcsxoeizVar.ppxfxbqfkf();
        }
        return 0;
    }

    public int getContentInsetStart() {
        cllcsxoeiz cllcsxoeizVar = this.f3199hkdspvbjdz;
        if (cllcsxoeizVar != null) {
            return cllcsxoeizVar.wkgbmnqykc();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i13 = this.f3192cllcsxoeiz;
        return i13 != Integer.MIN_VALUE ? i13 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarJyumaefscl;
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        return (actionMenuView == null || (eablkybsjgVarJyumaefscl = actionMenuView.jyumaefscl()) == null || !eablkybsjgVarJyumaefscl.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3196dsvhmnatus, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3192cllcsxoeiz, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f3193cqumvgiudr;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f3193cqumvgiudr;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        btonecajqb();
        return this.f3235zdlpuopuiu.getMenu();
    }

    View getNavButtonView() {
        return this.f3203iwizpuwonk;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f3203iwizpuwonk;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f3203iwizpuwonk;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f3208jztzpxfvev;
    }

    public Drawable getOverflowIcon() {
        btonecajqb();
        return this.f3235zdlpuopuiu.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f3202istkbnxepw;
    }

    public int getPopupTheme() {
        return this.f3191cdpycssgdh;
    }

    public CharSequence getSubtitle() {
        return this.f3209kegysxyocb;
    }

    final TextView getSubtitleTextView() {
        return this.f3207jyumaefscl;
    }

    public CharSequence getTitle() {
        return this.f3222stevsuqkhv;
    }

    public int getTitleMarginBottom() {
        return this.f3206jpowsppfya;
    }

    public int getTitleMarginEnd() {
        return this.f3216pkzmftpjix;
    }

    public int getTitleMarginStart() {
        return this.f3234ylkuphrtab;
    }

    public int getTitleMarginTop() {
        return this.f3198hcddaimhww;
    }

    final TextView getTitleTextView() {
        return this.f3233yggfygwlhe;
    }

    public lereixgezr getWrapper() {
        if (this.f3215okpsazkaxt == null) {
            this.f3215okpsazkaxt = new crxdokpmqz(this, true);
        }
        return this.f3215okpsazkaxt;
    }

    public void gxszxtbevo() {
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        if (actionMenuView != null) {
            actionMenuView.btonecajqb();
        }
    }

    public void hcddaimhww(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, ActionMenuPresenter actionMenuPresenter) {
        if (eablkybsjgVar == null && this.f3235zdlpuopuiu == null) {
            return;
        }
        gtknphoqwx();
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarJyumaefscl = this.f3235zdlpuopuiu.jyumaefscl();
        if (eablkybsjgVarJyumaefscl == eablkybsjgVar) {
            return;
        }
        if (eablkybsjgVarJyumaefscl != null) {
            eablkybsjgVarJyumaefscl.wypolnanlu(this.f3208jztzpxfvev);
            eablkybsjgVarJyumaefscl.wypolnanlu(this.f3229xrmfcynszj);
        }
        if (this.f3229xrmfcynszj == null) {
            this.f3229xrmfcynszj = new gxszxtbevo();
        }
        actionMenuPresenter.lmojexxdyd(true);
        if (eablkybsjgVar != null) {
            eablkybsjgVar.ppxfxbqfkf(actionMenuPresenter, this.f3202istkbnxepw);
            eablkybsjgVar.ppxfxbqfkf(this.f3229xrmfcynszj, this.f3202istkbnxepw);
        } else {
            actionMenuPresenter.btonecajqb(this.f3202istkbnxepw, null);
            this.f3229xrmfcynszj.btonecajqb(this.f3202istkbnxepw, null);
            actionMenuPresenter.lqeggnwhkg(true);
            this.f3229xrmfcynszj.lqeggnwhkg(true);
        }
        this.f3235zdlpuopuiu.setPopupTheme(this.f3191cdpycssgdh);
        this.f3235zdlpuopuiu.setPresenter(actionMenuPresenter);
        this.f3208jztzpxfvev = actionMenuPresenter;
        kegysxyocb();
    }

    public void hkdspvbjdz(Context context, int i13) {
        this.f3201iozdgvuglv = i13;
        TextView textView = this.f3207jyumaefscl;
        if (textView != null) {
            textView.setTextAppearance(context, i13);
        }
    }

    void iobyxmoadg() {
        for (int size = this.f3194crxdokpmqz.size() - 1; size >= 0; size--) {
            addView((View) this.f3194crxdokpmqz.get(size));
        }
        this.f3194crxdokpmqz.clear();
    }

    public boolean iwizpuwonk() {
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        return actionMenuView != null && actionMenuView.rgvfuqvkyq();
    }

    public void jpowsppfya(androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVar, androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        this.f3213metgxyhuhe = iobyxmoadgVar;
        this.f3219rlfsiqarku = iobyxmoadgVar2;
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        if (actionMenuView != null) {
            actionMenuView.iwizpuwonk(iobyxmoadgVar, iobyxmoadgVar2);
        }
    }

    public boolean jyumaefscl() {
        gxszxtbevo gxszxtbevoVar = this.f3229xrmfcynszj;
        return (gxszxtbevoVar == null || gxszxtbevoVar.f3240yggfygwlhe == null) ? false : true;
    }

    void kegysxyocb() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherIobyxmoadg = eablkybsjg.iobyxmoadg(this);
            boolean z13 = jyumaefscl() && onBackInvokedDispatcherIobyxmoadg != null && isAttachedToWindow() && this.f3231ydmasvzmpa;
            if (z13 && this.f3232yfnezrywwk == null) {
                if (this.f3225uwvvkdfqfp == null) {
                    this.f3225uwvvkdfqfp = eablkybsjg.zoijcleaow(new Runnable() { // from class: androidx.appcompat.widget.ntlheqmsrt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3368zdlpuopuiu.eablkybsjg();
                        }
                    });
                }
                eablkybsjg.ppxfxbqfkf(onBackInvokedDispatcherIobyxmoadg, this.f3225uwvvkdfqfp);
                this.f3232yfnezrywwk = onBackInvokedDispatcherIobyxmoadg;
                return;
            }
            if (z13 || (onBackInvokedDispatcher = this.f3232yfnezrywwk) == null) {
                return;
            }
            eablkybsjg.wkgbmnqykc(onBackInvokedDispatcher, this.f3225uwvvkdfqfp);
            this.f3232yfnezrywwk = null;
        }
    }

    void lqeggnwhkg() {
        if (this.f3217pmvmpeiblj == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, lqeggnwhkg.iobyxmoadg.toolbarNavigationButtonStyle);
            this.f3217pmvmpeiblj = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f3197esjtqupxsv);
            this.f3217pmvmpeiblj.setContentDescription(this.f3210lereixgezr);
            lqeggnwhkg lqeggnwhkgVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            lqeggnwhkgVarGenerateDefaultLayoutParams.f2634iobyxmoadg = (this.f3211lmojexxdyd & 112) | 8388611;
            lqeggnwhkgVarGenerateDefaultLayoutParams.f3243zoijcleaow = 2;
            this.f3217pmvmpeiblj.setLayoutParams(lqeggnwhkgVarGenerateDefaultLayoutParams);
            this.f3217pmvmpeiblj.setOnClickListener(new wkgbmnqykc());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof lqeggnwhkg) {
            return new lqeggnwhkg((lqeggnwhkg) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.iobyxmoadg.C0067iobyxmoadg) {
            return new lqeggnwhkg((androidx.appcompat.app.iobyxmoadg.C0067iobyxmoadg) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new lqeggnwhkg((ViewGroup.MarginLayoutParams) layoutParams) : new lqeggnwhkg(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        kegysxyocb();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3220sflfametgt);
        kegysxyocb();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3224ulzqkzuiru = false;
        }
        if (!this.f3224ulzqkzuiru) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3224ulzqkzuiru = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3224ulzqkzuiru = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:102:0x028a  */
    /* JADX WARN: Code duplicated, block: B:104:0x028d  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0180  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x022e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int iIstkbnxepw;
        int iCdpycssgdh;
        int iMax;
        int iMin;
        boolean zWypolnanlu;
        boolean zWypolnanlu2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        lqeggnwhkg lqeggnwhkgVar;
        lqeggnwhkg lqeggnwhkgVar2;
        boolean z14;
        int i17;
        int i18;
        int paddingTop;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iMax2;
        int i29;
        int i33;
        int i34;
        int i35;
        int i36;
        int size;
        int iIstkbnxepw2;
        int i37;
        int i38;
        int size2;
        int i39;
        int i43;
        int i44;
        int size3;
        boolean z15 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i45 = width - paddingRight;
        int[] iArr = this.f3205jlmebxxoox;
        iArr[1] = 0;
        iArr[0] = 0;
        int iPmvmpeiblj = jhduphickx.pmvmpeiblj(this);
        int iMin2 = iPmvmpeiblj >= 0 ? Math.min(iPmvmpeiblj, i16 - i14) : 0;
        if (wypolnanlu(this.f3203iwizpuwonk)) {
            if (z15) {
                iCdpycssgdh = cdpycssgdh(this.f3203iwizpuwonk, i45, iArr, iMin2);
                iIstkbnxepw = paddingLeft;
            } else {
                iIstkbnxepw = istkbnxepw(this.f3203iwizpuwonk, paddingLeft, iArr, iMin2);
            }
            if (wypolnanlu(this.f3217pmvmpeiblj)) {
                if (z15) {
                    iCdpycssgdh = cdpycssgdh(this.f3217pmvmpeiblj, iCdpycssgdh, iArr, iMin2);
                } else {
                    iIstkbnxepw = istkbnxepw(this.f3217pmvmpeiblj, iIstkbnxepw, iArr, iMin2);
                }
            }
            if (wypolnanlu(this.f3235zdlpuopuiu)) {
                if (z15) {
                    iIstkbnxepw = istkbnxepw(this.f3235zdlpuopuiu, iIstkbnxepw, iArr, iMin2);
                } else {
                    iCdpycssgdh = cdpycssgdh(this.f3235zdlpuopuiu, iCdpycssgdh, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iIstkbnxepw);
            iArr[1] = Math.max(0, currentContentInsetRight - (i45 - iCdpycssgdh));
            iMax = Math.max(iIstkbnxepw, currentContentInsetLeft);
            iMin = Math.min(iCdpycssgdh, i45 - currentContentInsetRight);
            if (wypolnanlu(this.f3236zynmafqrjb)) {
                if (z15) {
                    iMin = cdpycssgdh(this.f3236zynmafqrjb, iMin, iArr, iMin2);
                } else {
                    iMax = istkbnxepw(this.f3236zynmafqrjb, iMax, iArr, iMin2);
                }
            }
            if (wypolnanlu(this.f3193cqumvgiudr)) {
                if (z15) {
                    iMin = cdpycssgdh(this.f3193cqumvgiudr, iMin, iArr, iMin2);
                } else {
                    iMax = istkbnxepw(this.f3193cqumvgiudr, iMax, iArr, iMin2);
                }
            }
            zWypolnanlu = wypolnanlu(this.f3233yggfygwlhe);
            zWypolnanlu2 = wypolnanlu(this.f3207jyumaefscl);
            if (zWypolnanlu) {
                lqeggnwhkg lqeggnwhkgVar3 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar3).topMargin + this.f3233yggfygwlhe.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zWypolnanlu2) {
                lqeggnwhkg lqeggnwhkgVar4 = (lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar4).topMargin + this.f3207jyumaefscl.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar4).bottomMargin;
            }
            if (!zWypolnanlu || zWypolnanlu2) {
                if (zWypolnanlu) {
                    textView = this.f3233yggfygwlhe;
                } else {
                    textView = this.f3207jyumaefscl;
                }
                if (zWypolnanlu2) {
                    textView2 = this.f3207jyumaefscl;
                } else {
                    textView2 = this.f3233yggfygwlhe;
                }
                lqeggnwhkgVar = (lqeggnwhkg) textView.getLayoutParams();
                lqeggnwhkgVar2 = (lqeggnwhkg) textView2.getLayoutParams();
                z14 = (!zWypolnanlu && this.f3233yggfygwlhe.getMeasuredWidth() > 0) || (zWypolnanlu2 && this.f3207jyumaefscl.getMeasuredWidth() > 0);
                i17 = this.f3228wypolnanlu & 112;
                i18 = paddingLeft;
                if (i17 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin + this.f3198hcddaimhww;
                } else if (i17 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i29 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin;
                    i33 = this.f3198hcddaimhww;
                    if (iMax2 < i29 + i33) {
                        iMax2 = i29 + i33;
                    } else {
                        i34 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i35 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).bottomMargin;
                        i36 = this.f3206jpowsppfya;
                        if (i34 < i35 + i36) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) lqeggnwhkgVar2).bottomMargin + i36) - i34));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar2).bottomMargin) - this.f3206jpowsppfya) - measuredHeight;
                }
                if (z15) {
                    if (z14) {
                        i26 = this.f3234ylkuphrtab;
                    } else {
                        i26 = 0;
                    }
                    int i46 = i26 - iArr[1];
                    iMin -= Math.max(0, i46);
                    iArr[1] = Math.max(0, -i46);
                    if (zWypolnanlu) {
                        lqeggnwhkg lqeggnwhkgVar5 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                        int measuredWidth = iMin - this.f3233yggfygwlhe.getMeasuredWidth();
                        int measuredHeight2 = this.f3233yggfygwlhe.getMeasuredHeight() + paddingTop;
                        this.f3233yggfygwlhe.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i27 = measuredWidth - this.f3216pkzmftpjix;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar5).bottomMargin;
                    } else {
                        i27 = iMin;
                    }
                    if (zWypolnanlu2) {
                        int i47 = paddingTop + ((ViewGroup.MarginLayoutParams) ((lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams())).topMargin;
                        this.f3207jyumaefscl.layout(iMin - this.f3207jyumaefscl.getMeasuredWidth(), i47, iMin, this.f3207jyumaefscl.getMeasuredHeight() + i47);
                        i28 = iMin - this.f3216pkzmftpjix;
                    } else {
                        i28 = iMin;
                    }
                    if (z14) {
                        iMin = Math.min(i27, i28);
                    }
                    iMax = iMax;
                } else {
                    if (z14) {
                        i19 = this.f3234ylkuphrtab;
                    } else {
                        i19 = 0;
                    }
                    i23 = 0;
                    int i48 = i19 - iArr[0];
                    iMax += Math.max(0, i48);
                    iArr[0] = Math.max(0, -i48);
                    if (zWypolnanlu) {
                        lqeggnwhkg lqeggnwhkgVar6 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                        int measuredWidth2 = this.f3233yggfygwlhe.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f3233yggfygwlhe.getMeasuredHeight() + paddingTop;
                        this.f3233yggfygwlhe.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i24 = measuredWidth2 + this.f3216pkzmftpjix;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar6).bottomMargin;
                    } else {
                        i24 = iMax;
                    }
                    if (zWypolnanlu2) {
                        int i49 = paddingTop + ((ViewGroup.MarginLayoutParams) ((lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f3207jyumaefscl.getMeasuredWidth() + iMax;
                        this.f3207jyumaefscl.layout(iMax, i49, measuredWidth3, this.f3207jyumaefscl.getMeasuredHeight() + i49);
                        i25 = measuredWidth3 + this.f3216pkzmftpjix;
                    } else {
                        i25 = iMax;
                    }
                    if (z14) {
                        iMax = Math.max(i24, i25);
                    }
                }
                zoijcleaow(this.f3221sopmlzcsov, 3);
                size = this.f3221sopmlzcsov.size();
                iIstkbnxepw2 = iMax;
                for (i37 = i23; i37 < size; i37++) {
                    iIstkbnxepw2 = istkbnxepw((View) this.f3221sopmlzcsov.get(i37), iIstkbnxepw2, iArr, iMin2);
                }
                i38 = iMin2;
                zoijcleaow(this.f3221sopmlzcsov, 5);
                size2 = this.f3221sopmlzcsov.size();
                for (i39 = i23; i39 < size2; i39++) {
                    iMin = cdpycssgdh((View) this.f3221sopmlzcsov.get(i39), iMin, iArr, i38);
                }
                zoijcleaow(this.f3221sopmlzcsov, 1);
                int iYggfygwlhe = yggfygwlhe(this.f3221sopmlzcsov, iArr);
                i43 = (i18 + (((width - i18) - paddingRight) / 2)) - (iYggfygwlhe / 2);
                i44 = iYggfygwlhe + i43;
                if (i43 >= iIstkbnxepw2) {
                    if (i44 > iMin) {
                        iIstkbnxepw2 = i43 - (i44 - iMin);
                    } else {
                        iIstkbnxepw2 = i43;
                    }
                }
                size3 = this.f3221sopmlzcsov.size();
                while (i23 < size3) {
                    iIstkbnxepw2 = istkbnxepw((View) this.f3221sopmlzcsov.get(i23), iIstkbnxepw2, iArr, i38);
                    i23++;
                }
                this.f3221sopmlzcsov.clear();
            }
            i18 = paddingLeft;
            iMin2 = iMin2;
            i23 = 0;
            zoijcleaow(this.f3221sopmlzcsov, 3);
            size = this.f3221sopmlzcsov.size();
            iIstkbnxepw2 = iMax;
            while (i37 < size) {
                iIstkbnxepw2 = istkbnxepw((View) this.f3221sopmlzcsov.get(i37), iIstkbnxepw2, iArr, iMin2);
            }
            i38 = iMin2;
            zoijcleaow(this.f3221sopmlzcsov, 5);
            size2 = this.f3221sopmlzcsov.size();
            while (i39 < size2) {
                iMin = cdpycssgdh((View) this.f3221sopmlzcsov.get(i39), iMin, iArr, i38);
            }
            zoijcleaow(this.f3221sopmlzcsov, 1);
            int iYggfygwlhe2 = yggfygwlhe(this.f3221sopmlzcsov, iArr);
            i43 = (i18 + (((width - i18) - paddingRight) / 2)) - (iYggfygwlhe2 / 2);
            i44 = iYggfygwlhe2 + i43;
            if (i43 >= iIstkbnxepw2) {
                if (i44 > iMin) {
                    iIstkbnxepw2 = i43 - (i44 - iMin);
                } else {
                    iIstkbnxepw2 = i43;
                }
            }
            size3 = this.f3221sopmlzcsov.size();
            while (i23 < size3) {
                iIstkbnxepw2 = istkbnxepw((View) this.f3221sopmlzcsov.get(i23), iIstkbnxepw2, iArr, i38);
                i23++;
            }
            this.f3221sopmlzcsov.clear();
        }
        iIstkbnxepw = paddingLeft;
        iCdpycssgdh = i45;
        if (wypolnanlu(this.f3217pmvmpeiblj)) {
            if (z15) {
                iCdpycssgdh = cdpycssgdh(this.f3217pmvmpeiblj, iCdpycssgdh, iArr, iMin2);
            } else {
                iIstkbnxepw = istkbnxepw(this.f3217pmvmpeiblj, iIstkbnxepw, iArr, iMin2);
            }
        }
        if (wypolnanlu(this.f3235zdlpuopuiu)) {
            if (z15) {
                iIstkbnxepw = istkbnxepw(this.f3235zdlpuopuiu, iIstkbnxepw, iArr, iMin2);
            } else {
                iCdpycssgdh = cdpycssgdh(this.f3235zdlpuopuiu, iCdpycssgdh, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iIstkbnxepw);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i45 - iCdpycssgdh));
        iMax = Math.max(iIstkbnxepw, currentContentInsetLeft2);
        iMin = Math.min(iCdpycssgdh, i45 - currentContentInsetRight2);
        if (wypolnanlu(this.f3236zynmafqrjb)) {
            if (z15) {
                iMin = cdpycssgdh(this.f3236zynmafqrjb, iMin, iArr, iMin2);
            } else {
                iMax = istkbnxepw(this.f3236zynmafqrjb, iMax, iArr, iMin2);
            }
        }
        if (wypolnanlu(this.f3193cqumvgiudr)) {
            if (z15) {
                iMin = cdpycssgdh(this.f3193cqumvgiudr, iMin, iArr, iMin2);
            } else {
                iMax = istkbnxepw(this.f3193cqumvgiudr, iMax, iArr, iMin2);
            }
        }
        zWypolnanlu = wypolnanlu(this.f3233yggfygwlhe);
        zWypolnanlu2 = wypolnanlu(this.f3207jyumaefscl);
        if (zWypolnanlu) {
            lqeggnwhkg lqeggnwhkgVar7 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar7).topMargin + this.f3233yggfygwlhe.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar7).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zWypolnanlu2) {
            lqeggnwhkg lqeggnwhkgVar8 = (lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar8).topMargin + this.f3207jyumaefscl.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar8).bottomMargin;
        }
        if (zWypolnanlu) {
            if (zWypolnanlu) {
                textView = this.f3233yggfygwlhe;
            } else {
                textView = this.f3207jyumaefscl;
            }
            if (zWypolnanlu2) {
                textView2 = this.f3207jyumaefscl;
            } else {
                textView2 = this.f3233yggfygwlhe;
            }
            lqeggnwhkgVar = (lqeggnwhkg) textView.getLayoutParams();
            lqeggnwhkgVar2 = (lqeggnwhkg) textView2.getLayoutParams();
            if (zWypolnanlu) {
            }
            i17 = this.f3228wypolnanlu & 112;
            i18 = paddingLeft;
            if (i17 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin + this.f3198hcddaimhww;
            } else if (i17 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i29 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin;
                i33 = this.f3198hcddaimhww;
                if (iMax2 < i29 + i33) {
                    iMax2 = i29 + i33;
                } else {
                    i34 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i35 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).bottomMargin;
                    i36 = this.f3206jpowsppfya;
                    if (i34 < i35 + i36) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) lqeggnwhkgVar2).bottomMargin + i36) - i34));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar2).bottomMargin) - this.f3206jpowsppfya) - measuredHeight;
            }
            if (z15) {
                if (z14) {
                    i26 = this.f3234ylkuphrtab;
                } else {
                    i26 = 0;
                }
                int i410 = i26 - iArr[1];
                iMin -= Math.max(0, i410);
                iArr[1] = Math.max(0, -i410);
                if (zWypolnanlu) {
                    lqeggnwhkg lqeggnwhkgVar9 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                    int measuredWidth4 = iMin - this.f3233yggfygwlhe.getMeasuredWidth();
                    int measuredHeight4 = this.f3233yggfygwlhe.getMeasuredHeight() + paddingTop;
                    this.f3233yggfygwlhe.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i27 = measuredWidth4 - this.f3216pkzmftpjix;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar9).bottomMargin;
                } else {
                    i27 = iMin;
                }
                if (zWypolnanlu2) {
                    int i411 = paddingTop + ((ViewGroup.MarginLayoutParams) ((lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams())).topMargin;
                    this.f3207jyumaefscl.layout(iMin - this.f3207jyumaefscl.getMeasuredWidth(), i411, iMin, this.f3207jyumaefscl.getMeasuredHeight() + i411);
                    i28 = iMin - this.f3216pkzmftpjix;
                } else {
                    i28 = iMin;
                }
                if (z14) {
                    iMin = Math.min(i27, i28);
                }
                iMax = iMax;
                i23 = 0;
            } else {
                if (z14) {
                    i19 = this.f3234ylkuphrtab;
                } else {
                    i19 = 0;
                }
                i23 = 0;
                int i412 = i19 - iArr[0];
                iMax += Math.max(0, i412);
                iArr[0] = Math.max(0, -i412);
                if (zWypolnanlu) {
                    lqeggnwhkg lqeggnwhkgVar10 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                    int measuredWidth5 = this.f3233yggfygwlhe.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f3233yggfygwlhe.getMeasuredHeight() + paddingTop;
                    this.f3233yggfygwlhe.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i24 = measuredWidth5 + this.f3216pkzmftpjix;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar10).bottomMargin;
                } else {
                    i24 = iMax;
                }
                if (zWypolnanlu2) {
                    int i413 = paddingTop + ((ViewGroup.MarginLayoutParams) ((lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f3207jyumaefscl.getMeasuredWidth() + iMax;
                    this.f3207jyumaefscl.layout(iMax, i413, measuredWidth6, this.f3207jyumaefscl.getMeasuredHeight() + i413);
                    i25 = measuredWidth6 + this.f3216pkzmftpjix;
                } else {
                    i25 = iMax;
                }
                if (z14) {
                    iMax = Math.max(i24, i25);
                }
            }
        } else {
            if (zWypolnanlu) {
                textView = this.f3233yggfygwlhe;
            } else {
                textView = this.f3207jyumaefscl;
            }
            if (zWypolnanlu2) {
                textView2 = this.f3207jyumaefscl;
            } else {
                textView2 = this.f3233yggfygwlhe;
            }
            lqeggnwhkgVar = (lqeggnwhkg) textView.getLayoutParams();
            lqeggnwhkgVar2 = (lqeggnwhkg) textView2.getLayoutParams();
            if (zWypolnanlu) {
            }
            i17 = this.f3228wypolnanlu & 112;
            i18 = paddingLeft;
            if (i17 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin + this.f3198hcddaimhww;
            } else if (i17 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i29 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).topMargin;
                i33 = this.f3198hcddaimhww;
                if (iMax2 < i29 + i33) {
                    iMax2 = i29 + i33;
                } else {
                    i34 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i35 = ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar).bottomMargin;
                    i36 = this.f3206jpowsppfya;
                    if (i34 < i35 + i36) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) lqeggnwhkgVar2).bottomMargin + i36) - i34));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar2).bottomMargin) - this.f3206jpowsppfya) - measuredHeight;
            }
            if (z15) {
                if (z14) {
                    i26 = this.f3234ylkuphrtab;
                } else {
                    i26 = 0;
                }
                int i414 = i26 - iArr[1];
                iMin -= Math.max(0, i414);
                iArr[1] = Math.max(0, -i414);
                if (zWypolnanlu) {
                    lqeggnwhkg lqeggnwhkgVar11 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                    int measuredWidth7 = iMin - this.f3233yggfygwlhe.getMeasuredWidth();
                    int measuredHeight6 = this.f3233yggfygwlhe.getMeasuredHeight() + paddingTop;
                    this.f3233yggfygwlhe.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i27 = measuredWidth7 - this.f3216pkzmftpjix;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar11).bottomMargin;
                } else {
                    i27 = iMin;
                }
                if (zWypolnanlu2) {
                    int i415 = paddingTop + ((ViewGroup.MarginLayoutParams) ((lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams())).topMargin;
                    this.f3207jyumaefscl.layout(iMin - this.f3207jyumaefscl.getMeasuredWidth(), i415, iMin, this.f3207jyumaefscl.getMeasuredHeight() + i415);
                    i28 = iMin - this.f3216pkzmftpjix;
                } else {
                    i28 = iMin;
                }
                if (z14) {
                    iMin = Math.min(i27, i28);
                }
                iMax = iMax;
                i23 = 0;
            } else {
                if (z14) {
                    i19 = this.f3234ylkuphrtab;
                } else {
                    i19 = 0;
                }
                i23 = 0;
                int i416 = i19 - iArr[0];
                iMax += Math.max(0, i416);
                iArr[0] = Math.max(0, -i416);
                if (zWypolnanlu) {
                    lqeggnwhkg lqeggnwhkgVar12 = (lqeggnwhkg) this.f3233yggfygwlhe.getLayoutParams();
                    int measuredWidth8 = this.f3233yggfygwlhe.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f3233yggfygwlhe.getMeasuredHeight() + paddingTop;
                    this.f3233yggfygwlhe.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i24 = measuredWidth8 + this.f3216pkzmftpjix;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) lqeggnwhkgVar12).bottomMargin;
                } else {
                    i24 = iMax;
                }
                if (zWypolnanlu2) {
                    int i417 = paddingTop + ((ViewGroup.MarginLayoutParams) ((lqeggnwhkg) this.f3207jyumaefscl.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f3207jyumaefscl.getMeasuredWidth() + iMax;
                    this.f3207jyumaefscl.layout(iMax, i417, measuredWidth9, this.f3207jyumaefscl.getMeasuredHeight() + i417);
                    i25 = measuredWidth9 + this.f3216pkzmftpjix;
                } else {
                    i25 = iMax;
                }
                if (z14) {
                    iMax = Math.max(i24, i25);
                }
            }
        }
        zoijcleaow(this.f3221sopmlzcsov, 3);
        size = this.f3221sopmlzcsov.size();
        iIstkbnxepw2 = iMax;
        while (i37 < size) {
            iIstkbnxepw2 = istkbnxepw((View) this.f3221sopmlzcsov.get(i37), iIstkbnxepw2, iArr, iMin2);
        }
        i38 = iMin2;
        zoijcleaow(this.f3221sopmlzcsov, 5);
        size2 = this.f3221sopmlzcsov.size();
        while (i39 < size2) {
            iMin = cdpycssgdh((View) this.f3221sopmlzcsov.get(i39), iMin, iArr, i38);
        }
        zoijcleaow(this.f3221sopmlzcsov, 1);
        int iYggfygwlhe3 = yggfygwlhe(this.f3221sopmlzcsov, iArr);
        i43 = (i18 + (((width - i18) - paddingRight) / 2)) - (iYggfygwlhe3 / 2);
        i44 = iYggfygwlhe3 + i43;
        if (i43 >= iIstkbnxepw2) {
            if (i44 > iMin) {
                iIstkbnxepw2 = i43 - (i44 - iMin);
            } else {
                iIstkbnxepw2 = i43;
            }
        }
        size3 = this.f3221sopmlzcsov.size();
        while (i23 < size3) {
            iIstkbnxepw2 = istkbnxepw((View) this.f3221sopmlzcsov.get(i23), iIstkbnxepw2, iArr, i38);
            i23++;
        }
        this.f3221sopmlzcsov.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f3205jlmebxxoox;
        boolean zZoijcleaow = vipkmwdibw.zoijcleaow(this);
        int i15 = !zZoijcleaow ? 1 : 0;
        if (wypolnanlu(this.f3203iwizpuwonk)) {
            iozdgvuglv(this.f3203iwizpuwonk, i13, 0, i14, 0, this.f3227wwaezpbzkn);
            measuredWidth = this.f3203iwizpuwonk.getMeasuredWidth() + kcexrzcfyt(this.f3203iwizpuwonk);
            iMax = Math.max(0, this.f3203iwizpuwonk.getMeasuredHeight() + zdlpuopuiu(this.f3203iwizpuwonk));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3203iwizpuwonk.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (wypolnanlu(this.f3217pmvmpeiblj)) {
            iozdgvuglv(this.f3217pmvmpeiblj, i13, 0, i14, 0, this.f3227wwaezpbzkn);
            measuredWidth = this.f3217pmvmpeiblj.getMeasuredWidth() + kcexrzcfyt(this.f3217pmvmpeiblj);
            iMax = Math.max(iMax, this.f3217pmvmpeiblj.getMeasuredHeight() + zdlpuopuiu(this.f3217pmvmpeiblj));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3217pmvmpeiblj.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zZoijcleaow ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (wypolnanlu(this.f3235zdlpuopuiu)) {
            iozdgvuglv(this.f3235zdlpuopuiu, i13, iMax3, i14, 0, this.f3227wwaezpbzkn);
            measuredWidth2 = this.f3235zdlpuopuiu.getMeasuredWidth() + kcexrzcfyt(this.f3235zdlpuopuiu);
            iMax = Math.max(iMax, this.f3235zdlpuopuiu.getMeasuredHeight() + zdlpuopuiu(this.f3235zdlpuopuiu));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3235zdlpuopuiu.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i15] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (wypolnanlu(this.f3236zynmafqrjb)) {
            iMax4 += yadqdtsiqt(this.f3236zynmafqrjb, i13, iMax4, i14, 0, iArr);
            iMax = Math.max(iMax, this.f3236zynmafqrjb.getMeasuredHeight() + zdlpuopuiu(this.f3236zynmafqrjb));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3236zynmafqrjb.getMeasuredState());
        }
        if (wypolnanlu(this.f3193cqumvgiudr)) {
            iMax4 += yadqdtsiqt(this.f3193cqumvgiudr, i13, iMax4, i14, 0, iArr);
            iMax = Math.max(iMax, this.f3193cqumvgiudr.getMeasuredHeight() + zdlpuopuiu(this.f3193cqumvgiudr));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3193cqumvgiudr.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((lqeggnwhkg) childAt.getLayoutParams()).f3243zoijcleaow == 0 && wypolnanlu(childAt)) {
                iMax4 += yadqdtsiqt(childAt, i13, iMax4, i14, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + zdlpuopuiu(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i17 = this.f3198hcddaimhww + this.f3206jpowsppfya;
        int i18 = this.f3234ylkuphrtab + this.f3216pkzmftpjix;
        if (wypolnanlu(this.f3233yggfygwlhe)) {
            yadqdtsiqt(this.f3233yggfygwlhe, i13, iMax4 + i18, i14, i17, iArr);
            int measuredWidth3 = this.f3233yggfygwlhe.getMeasuredWidth() + kcexrzcfyt(this.f3233yggfygwlhe);
            measuredHeight = this.f3233yggfygwlhe.getMeasuredHeight() + zdlpuopuiu(this.f3233yggfygwlhe);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3233yggfygwlhe.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (wypolnanlu(this.f3207jyumaefscl)) {
            iMax2 = Math.max(iMax2, yadqdtsiqt(this.f3207jyumaefscl, i13, iMax4 + i18, i14, measuredHeight + i17, iArr));
            measuredHeight += this.f3207jyumaefscl.getMeasuredHeight() + zdlpuopuiu(this.f3207jyumaefscl);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3207jyumaefscl.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i13, (-16777216) & iCombineMeasuredStates2), dsvhmnatus() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i14, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarJyumaefscl = actionMenuView != null ? actionMenuView.jyumaefscl() : null;
        int i13 = savedState.f3238jyumaefscl;
        if (i13 != 0 && this.f3229xrmfcynszj != null && eablkybsjgVarJyumaefscl != null && (menuItemFindItem = eablkybsjgVarJyumaefscl.findItem(i13)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f3237iwizpuwonk) {
            wwaezpbzkn();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        nufgyqmvbu();
        this.f3199hkdspvbjdz.gxszxtbevo(i13 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        gxszxtbevo gxszxtbevoVar = this.f3229xrmfcynszj;
        if (gxszxtbevoVar != null && (lqeggnwhkgVar = gxszxtbevoVar.f3240yggfygwlhe) != null) {
            savedState.f3238jyumaefscl = lqeggnwhkgVar.getItemId();
        }
        savedState.f3237iwizpuwonk = zynmafqrjb();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3214ntlheqmsrt = false;
        }
        if (!this.f3214ntlheqmsrt) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3214ntlheqmsrt = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3214ntlheqmsrt = false;
        }
        return true;
    }

    public void pkzmftpjix(int i13, int i14) {
        nufgyqmvbu();
        this.f3199hkdspvbjdz.lqeggnwhkg(i13, i14);
    }

    public boolean pmvmpeiblj() {
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        return actionMenuView != null && actionMenuView.vdvldrhtss();
    }

    @Override // v1.cqumvgiudr
    public void removeMenuProvider(v1.istkbnxepw istkbnxepwVar) {
        this.f3218ribwqtqdhb.draadjrbmk(istkbnxepwVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z13) {
        if (this.f3231ydmasvzmpa != z13) {
            this.f3231ydmasvzmpa = z13;
            kegysxyocb();
        }
    }

    public void setCollapseContentDescription(int i13) {
        setCollapseContentDescription(i13 != 0 ? getContext().getText(i13) : null);
    }

    public void setCollapseIcon(int i13) {
        setCollapseIcon(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setCollapsible(boolean z13) {
        this.f3195czzsidtyhn = z13;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i13) {
        if (i13 < 0) {
            i13 = Integer.MIN_VALUE;
        }
        if (i13 != this.f3196dsvhmnatus) {
            this.f3196dsvhmnatus = i13;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i13) {
        if (i13 < 0) {
            i13 = Integer.MIN_VALUE;
        }
        if (i13 != this.f3192cllcsxoeiz) {
            this.f3192cllcsxoeiz = i13;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i13) {
        setLogo(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setLogoDescription(int i13) {
        setLogoDescription(getContext().getText(i13));
    }

    public void setNavigationContentDescription(int i13) {
        setNavigationContentDescription(i13 != 0 ? getContext().getText(i13) : null);
    }

    public void setNavigationIcon(int i13) {
        setNavigationIcon(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        draadjrbmk();
        this.f3203iwizpuwonk.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(nufgyqmvbu nufgyqmvbuVar) {
        this.f3204jhduphickx = nufgyqmvbuVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        btonecajqb();
        this.f3235zdlpuopuiu.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i13) {
        if (this.f3191cdpycssgdh != i13) {
            this.f3191cdpycssgdh = i13;
            if (i13 == 0) {
                this.f3202istkbnxepw = getContext();
            } else {
                this.f3202istkbnxepw = new ContextThemeWrapper(getContext(), i13);
            }
        }
    }

    public void setSubtitle(int i13) {
        setSubtitle(getContext().getText(i13));
    }

    public void setSubtitleTextColor(int i13) {
        setSubtitleTextColor(ColorStateList.valueOf(i13));
    }

    public void setTitle(int i13) {
        setTitle(getContext().getText(i13));
    }

    public void setTitleMarginBottom(int i13) {
        this.f3206jpowsppfya = i13;
        requestLayout();
    }

    public void setTitleMarginEnd(int i13) {
        this.f3216pkzmftpjix = i13;
        requestLayout();
    }

    public void setTitleMarginStart(int i13) {
        this.f3234ylkuphrtab = i13;
        requestLayout();
    }

    public void setTitleMarginTop(int i13) {
        this.f3198hcddaimhww = i13;
        requestLayout();
    }

    public void setTitleTextColor(int i13) {
        setTitleTextColor(ColorStateList.valueOf(i13));
    }

    public boolean stevsuqkhv() {
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        return actionMenuView != null && actionMenuView.cqumvgiudr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg generateDefaultLayoutParams() {
        return new lqeggnwhkg(-2, -2);
    }

    public boolean wkgbmnqykc() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f3235zdlpuopuiu) != null && actionMenuView.kcexrzcfyt();
    }

    void ylkuphrtab() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((lqeggnwhkg) childAt.getLayoutParams()).f3243zoijcleaow != 2 && childAt != this.f3235zdlpuopuiu) {
                removeViewAt(childCount);
                this.f3194crxdokpmqz.add(childAt);
            }
        }
    }

    public boolean zynmafqrjb() {
        ActionMenuView actionMenuView = this.f3235zdlpuopuiu;
        return actionMenuView != null && actionMenuView.oxmwwwfdhm();
    }

    public static class lqeggnwhkg extends androidx.appcompat.app.iobyxmoadg.C0067iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f3243zoijcleaow;

        public lqeggnwhkg(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3243zoijcleaow = 0;
        }

        void iobyxmoadg(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public lqeggnwhkg(int i13, int i14) {
            super(i13, i14);
            this.f3243zoijcleaow = 0;
            this.f2634iobyxmoadg = 8388627;
        }

        public lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar) {
            super((androidx.appcompat.app.iobyxmoadg.C0067iobyxmoadg) lqeggnwhkgVar);
            this.f3243zoijcleaow = 0;
            this.f3243zoijcleaow = lqeggnwhkgVar.f3243zoijcleaow;
        }

        public lqeggnwhkg(androidx.appcompat.app.iobyxmoadg.C0067iobyxmoadg c0067iobyxmoadg) {
            super(c0067iobyxmoadg);
            this.f3243zoijcleaow = 0;
        }

        public lqeggnwhkg(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3243zoijcleaow = 0;
            iobyxmoadg(marginLayoutParams);
        }

        public lqeggnwhkg(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3243zoijcleaow = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f3228wypolnanlu = 8388627;
        this.f3221sopmlzcsov = new ArrayList();
        this.f3194crxdokpmqz = new ArrayList();
        this.f3205jlmebxxoox = new int[2];
        this.f3218ribwqtqdhb = new v1.pmvmpeiblj(new Runnable() { // from class: androidx.appcompat.widget.ulzqkzuiru
            @Override // java.lang.Runnable
            public final void run() {
                this.f3399zdlpuopuiu.esjtqupxsv();
            }
        });
        this.f3226vipkmwdibw = new ArrayList();
        this.f3200ikoacuggdj = new iobyxmoadg();
        this.f3220sflfametgt = new zoijcleaow();
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(getContext(), attributeSet, lqeggnwhkg.btonecajqb.Toolbar, i13, 0);
        jhduphickx.sflfametgt(this, context, lqeggnwhkg.btonecajqb.Toolbar, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        this.f3230yadqdtsiqt = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.Toolbar_titleTextAppearance, 0);
        this.f3201iozdgvuglv = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.Toolbar_subtitleTextAppearance, 0);
        this.f3228wypolnanlu = mbcevpiqjqVarJyumaefscl.draadjrbmk(lqeggnwhkg.btonecajqb.Toolbar_android_gravity, this.f3228wypolnanlu);
        this.f3211lmojexxdyd = mbcevpiqjqVarJyumaefscl.draadjrbmk(lqeggnwhkg.btonecajqb.Toolbar_buttonGravity, 48);
        int iEablkybsjg = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_titleMargin, 0);
        iEablkybsjg = mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.Toolbar_titleMargins) ? mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_titleMargins, iEablkybsjg) : iEablkybsjg;
        this.f3206jpowsppfya = iEablkybsjg;
        this.f3198hcddaimhww = iEablkybsjg;
        this.f3216pkzmftpjix = iEablkybsjg;
        this.f3234ylkuphrtab = iEablkybsjg;
        int iEablkybsjg2 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_titleMarginStart, -1);
        if (iEablkybsjg2 >= 0) {
            this.f3234ylkuphrtab = iEablkybsjg2;
        }
        int iEablkybsjg3 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_titleMarginEnd, -1);
        if (iEablkybsjg3 >= 0) {
            this.f3216pkzmftpjix = iEablkybsjg3;
        }
        int iEablkybsjg4 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_titleMarginTop, -1);
        if (iEablkybsjg4 >= 0) {
            this.f3198hcddaimhww = iEablkybsjg4;
        }
        int iEablkybsjg5 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_titleMarginBottom, -1);
        if (iEablkybsjg5 >= 0) {
            this.f3206jpowsppfya = iEablkybsjg5;
        }
        this.f3227wwaezpbzkn = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.Toolbar_maxButtonHeight, -1);
        int iEablkybsjg6 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iEablkybsjg7 = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iGxszxtbevo = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.Toolbar_contentInsetLeft, 0);
        int iGxszxtbevo2 = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.Toolbar_contentInsetRight, 0);
        nufgyqmvbu();
        this.f3199hkdspvbjdz.eablkybsjg(iGxszxtbevo, iGxszxtbevo2);
        if (iEablkybsjg6 != Integer.MIN_VALUE || iEablkybsjg7 != Integer.MIN_VALUE) {
            this.f3199hkdspvbjdz.lqeggnwhkg(iEablkybsjg6, iEablkybsjg7);
        }
        this.f3192cllcsxoeiz = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f3196dsvhmnatus = mbcevpiqjqVarJyumaefscl.eablkybsjg(lqeggnwhkg.btonecajqb.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f3197esjtqupxsv = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.Toolbar_collapseIcon);
        this.f3210lereixgezr = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.Toolbar_collapseContentDescription);
        CharSequence charSequenceRgvfuqvkyq = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceRgvfuqvkyq)) {
            setTitle(charSequenceRgvfuqvkyq);
        }
        CharSequence charSequenceRgvfuqvkyq2 = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceRgvfuqvkyq2)) {
            setSubtitle(charSequenceRgvfuqvkyq2);
        }
        this.f3202istkbnxepw = getContext();
        setPopupTheme(mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.Toolbar_popupTheme, 0));
        Drawable drawableLqeggnwhkg = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.Toolbar_navigationIcon);
        if (drawableLqeggnwhkg != null) {
            setNavigationIcon(drawableLqeggnwhkg);
        }
        CharSequence charSequenceRgvfuqvkyq3 = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceRgvfuqvkyq3)) {
            setNavigationContentDescription(charSequenceRgvfuqvkyq3);
        }
        Drawable drawableLqeggnwhkg2 = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.Toolbar_logo);
        if (drawableLqeggnwhkg2 != null) {
            setLogo(drawableLqeggnwhkg2);
        }
        CharSequence charSequenceRgvfuqvkyq4 = mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceRgvfuqvkyq4)) {
            setLogoDescription(charSequenceRgvfuqvkyq4);
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.Toolbar_titleTextColor)) {
            setTitleTextColor(mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.Toolbar_titleTextColor));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.Toolbar_subtitleTextColor));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.Toolbar_menu)) {
            cqumvgiudr(mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.Toolbar_menu, 0));
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            lqeggnwhkg();
        }
        ImageButton imageButton = this.f3217pmvmpeiblj;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            lqeggnwhkg();
            this.f3217pmvmpeiblj.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f3217pmvmpeiblj;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f3197esjtqupxsv);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            dxjokdxxww();
            if (!lereixgezr(this.f3193cqumvgiudr)) {
                ppxfxbqfkf(this.f3193cqumvgiudr, true);
            }
        } else {
            ImageView imageView = this.f3193cqumvgiudr;
            if (imageView != null && lereixgezr(imageView)) {
                removeView(this.f3193cqumvgiudr);
                this.f3194crxdokpmqz.remove(this.f3193cqumvgiudr);
            }
        }
        ImageView imageView2 = this.f3193cqumvgiudr;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            dxjokdxxww();
        }
        ImageView imageView = this.f3193cqumvgiudr;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            draadjrbmk();
        }
        ImageButton imageButton = this.f3203iwizpuwonk;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            jlmebxxoox.iobyxmoadg(this.f3203iwizpuwonk, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            draadjrbmk();
            if (!lereixgezr(this.f3203iwizpuwonk)) {
                ppxfxbqfkf(this.f3203iwizpuwonk, true);
            }
        } else {
            ImageButton imageButton = this.f3203iwizpuwonk;
            if (imageButton != null && lereixgezr(imageButton)) {
                removeView(this.f3203iwizpuwonk);
                this.f3194crxdokpmqz.remove(this.f3203iwizpuwonk);
            }
        }
        ImageButton imageButton2 = this.f3203iwizpuwonk;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f3207jyumaefscl;
            if (textView != null && lereixgezr(textView)) {
                removeView(this.f3207jyumaefscl);
                this.f3194crxdokpmqz.remove(this.f3207jyumaefscl);
            }
        } else {
            if (this.f3207jyumaefscl == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f3207jyumaefscl = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f3207jyumaefscl.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f3201iozdgvuglv;
                if (i13 != 0) {
                    this.f3207jyumaefscl.setTextAppearance(context, i13);
                }
                ColorStateList colorStateList = this.f3212mbcevpiqjq;
                if (colorStateList != null) {
                    this.f3207jyumaefscl.setTextColor(colorStateList);
                }
            }
            if (!lereixgezr(this.f3207jyumaefscl)) {
                ppxfxbqfkf(this.f3207jyumaefscl, true);
            }
        }
        TextView textView2 = this.f3207jyumaefscl;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3209kegysxyocb = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3212mbcevpiqjq = colorStateList;
        TextView textView = this.f3207jyumaefscl;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f3233yggfygwlhe;
            if (textView != null && lereixgezr(textView)) {
                removeView(this.f3233yggfygwlhe);
                this.f3194crxdokpmqz.remove(this.f3233yggfygwlhe);
            }
        } else {
            if (this.f3233yggfygwlhe == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f3233yggfygwlhe = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f3233yggfygwlhe.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f3230yadqdtsiqt;
                if (i13 != 0) {
                    this.f3233yggfygwlhe.setTextAppearance(context, i13);
                }
                ColorStateList colorStateList = this.f3223tzroggbefp;
                if (colorStateList != null) {
                    this.f3233yggfygwlhe.setTextColor(colorStateList);
                }
            }
            if (!lereixgezr(this.f3233yggfygwlhe)) {
                ppxfxbqfkf(this.f3233yggfygwlhe, true);
            }
        }
        TextView textView2 = this.f3233yggfygwlhe;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3222stevsuqkhv = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3223tzroggbefp = colorStateList;
        TextView textView = this.f3233yggfygwlhe;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f3237iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f3238jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3238jyumaefscl = parcel.readInt();
            this.f3237iwizpuwonk = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f3238jyumaefscl);
            parcel.writeInt(this.f3237iwizpuwonk ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
