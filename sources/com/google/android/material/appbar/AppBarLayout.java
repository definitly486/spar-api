package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.yggfygwlhe;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import da.draadjrbmk;
import da.gtknphoqwx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ra.nufgyqmvbu;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;
import v1.yadqdtsiqt;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.zoijcleaow {

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final int f21933tzroggbefp = gtknphoqwx.Widget_Design_AppBarLayout;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f21934cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int[] f21935cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f21936cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private Drawable f21937dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f21938esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final List f21939hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final TimeInterpolator f21940hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f21941iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f21942istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f21943iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final long f21944jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f21945jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private Behavior f21946kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private skhdrjzrfn f21947lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private WeakReference f21948lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f21949pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private List f21950pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final float f21951stevsuqkhv;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final boolean f21952wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private Integer f21953wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f21954yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f21955yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private ValueAnimator f21956ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f21957zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f21958zynmafqrjb;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.ppxfxbqfkf {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private int f21959cdpycssgdh;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private ValueAnimator f21960iozdgvuglv;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private SavedState f21961lmojexxdyd;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private WeakReference f21962wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private int f21963yadqdtsiqt;

        class iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f21969iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f21971zoijcleaow;

            iobyxmoadg(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f21969iobyxmoadg = coordinatorLayout;
                this.f21971zoijcleaow = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mbcevpiqjq(this.f21969iobyxmoadg, this.f21971zoijcleaow, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class zoijcleaow extends v1.iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f21972eablkybsjg;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f21974wkgbmnqykc;

            zoijcleaow(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f21974wkgbmnqykc = appBarLayout;
                this.f21972eablkybsjg = coordinatorLayout;
            }

            @Override // v1.iobyxmoadg
            public boolean btonecajqb(View view, int i13, Bundle bundle) {
                if (i13 == 4096) {
                    this.f21974wkgbmnqykc.setExpanded(false);
                    return true;
                }
                if (i13 != 8192) {
                    return super.btonecajqb(view, i13, bundle);
                }
                if (BaseBehavior.this.stevsuqkhv() != 0) {
                    View viewUwvvkdfqfp = BaseBehavior.this.uwvvkdfqfp(this.f21972eablkybsjg);
                    if (!viewUwvvkdfqfp.canScrollVertically(-1)) {
                        this.f21974wkgbmnqykc.setExpanded(true);
                        return true;
                    }
                    int i14 = -this.f21974wkgbmnqykc.getDownNestedPreScrollRange();
                    if (i14 != 0) {
                        BaseBehavior.this.yggfygwlhe(this.f21972eablkybsjg, this.f21974wkgbmnqykc, viewUwvvkdfqfp, 0, i14, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }

            @Override // v1.iobyxmoadg
            public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
                View viewUwvvkdfqfp;
                super.lqeggnwhkg(view, zdlpuopuiuVar);
                zdlpuopuiuVar.uwvvkdfqfp(ScrollView.class.getName());
                if (this.f21974wkgbmnqykc.getTotalScrollRange() == 0 || (viewUwvvkdfqfp = BaseBehavior.this.uwvvkdfqfp(this.f21972eablkybsjg)) == null || !BaseBehavior.this.xrmfcynszj(this.f21974wkgbmnqykc)) {
                    return;
                }
                if (BaseBehavior.this.stevsuqkhv() != (-this.f21974wkgbmnqykc.getTotalScrollRange())) {
                    zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118545vdvldrhtss);
                    zdlpuopuiuVar.mhtqkkgtqm(true);
                }
                if (BaseBehavior.this.stevsuqkhv() != 0) {
                    if (!viewUwvvkdfqfp.canScrollVertically(-1)) {
                        zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
                        zdlpuopuiuVar.mhtqkkgtqm(true);
                    } else if ((-this.f21974wkgbmnqykc.getDownNestedPreScrollRange()) != 0) {
                        zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
                        zdlpuopuiuVar.mhtqkkgtqm(true);
                    }
                }
            }
        }

        public BaseBehavior() {
        }

        private boolean auzgnhcxok(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listKcexrzcfyt = coordinatorLayout.kcexrzcfyt(appBarLayout);
            int size = listKcexrzcfyt.size();
            for (int i13 = 0; i13 < size; i13++) {
                CoordinatorLayout.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((CoordinatorLayout.gxszxtbevo) ((View) listKcexrzcfyt.get(i13)).getLayoutParams()).gxszxtbevo();
                if (ppxfxbqfkfVarGxszxtbevo instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) ppxfxbqfkfVarGxszxtbevo).dsvhmnatus() != 0;
                }
            }
            return false;
        }

        private int czzsidtyhn(AppBarLayout appBarLayout, int i13) {
            int childCount = appBarLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = appBarLayout.getChildAt(i14);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                if (jztzpxfvev(eablkybsjgVar.ppxfxbqfkf(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eablkybsjgVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eablkybsjgVar).bottomMargin;
                }
                int i15 = -i13;
                if (top <= i15 && bottom >= i15) {
                    return i14;
                }
            }
            return -1;
        }

        private void dvvnrvtcbc(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14, boolean z13) {
            View viewRlfsiqarku = rlfsiqarku(appBarLayout, i13);
            boolean zIozdgvuglv = false;
            if (viewRlfsiqarku != null) {
                int iPpxfxbqfkf = ((eablkybsjg) viewRlfsiqarku.getLayoutParams()).ppxfxbqfkf();
                if ((iPpxfxbqfkf & 1) != 0) {
                    int iPmvmpeiblj = jhduphickx.pmvmpeiblj(viewRlfsiqarku);
                    if (i14 <= 0 || (iPpxfxbqfkf & 12) == 0 ? !((iPpxfxbqfkf & 2) == 0 || (-i13) < (viewRlfsiqarku.getBottom() - iPmvmpeiblj) - appBarLayout.getTopInset()) : (-i13) >= (viewRlfsiqarku.getBottom() - iPmvmpeiblj) - appBarLayout.getTopInset()) {
                        zIozdgvuglv = true;
                    }
                }
            }
            if (appBarLayout.vdvldrhtss()) {
                zIozdgvuglv = appBarLayout.iozdgvuglv(metgxyhuhe(coordinatorLayout));
            }
            boolean zIstkbnxepw = appBarLayout.istkbnxepw(zIozdgvuglv);
            if (z13 || (zIstkbnxepw && auzgnhcxok(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void iwxlajgraz(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iStevsuqkhv = stevsuqkhv() - topInset;
            int iCzzsidtyhn = czzsidtyhn(appBarLayout, iStevsuqkhv);
            if (iCzzsidtyhn >= 0) {
                View childAt = appBarLayout.getChildAt(iCzzsidtyhn);
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                int iPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
                if ((iPpxfxbqfkf & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iPmvmpeiblj = -childAt.getBottom();
                    if (iCzzsidtyhn == 0 && jhduphickx.iwizpuwonk(appBarLayout) && jhduphickx.iwizpuwonk(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (jztzpxfvev(iPpxfxbqfkf, 2)) {
                        iPmvmpeiblj += jhduphickx.pmvmpeiblj(childAt);
                    } else if (jztzpxfvev(iPpxfxbqfkf, 5)) {
                        int iPmvmpeiblj2 = jhduphickx.pmvmpeiblj(childAt) + iPmvmpeiblj;
                        if (iStevsuqkhv < iPmvmpeiblj2) {
                            topInset2 = iPmvmpeiblj2;
                        } else {
                            iPmvmpeiblj = iPmvmpeiblj2;
                        }
                    }
                    if (jztzpxfvev(iPpxfxbqfkf, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eablkybsjgVar).topMargin;
                        iPmvmpeiblj -= ((LinearLayout.LayoutParams) eablkybsjgVar).bottomMargin;
                    }
                    ribwqtqdhb(coordinatorLayout, appBarLayout, o1.iobyxmoadg.zoijcleaow(jhduphickx(iStevsuqkhv, iPmvmpeiblj, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private int jhduphickx(int i13, int i14, int i15) {
            return i13 < (i14 + i15) / 2 ? i14 : i15;
        }

        private void jlmebxxoox(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (jhduphickx.cllcsxoeiz(coordinatorLayout)) {
                return;
            }
            jhduphickx.oipsdeybqn(coordinatorLayout, new zoijcleaow(appBarLayout, coordinatorLayout));
        }

        private static boolean jztzpxfvev(int i13, int i14) {
            return (i13 & i14) == i14;
        }

        private View metgxyhuhe(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if ((childAt instanceof yadqdtsiqt) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private boolean okpsazkaxt(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.wflxmlrfwp() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private void ribwqtqdhb(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, float f13) {
            int iAbs = Math.abs(stevsuqkhv() - i13);
            float fAbs = Math.abs(f13);
            vipkmwdibw(coordinatorLayout, appBarLayout, i13, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private static View rlfsiqarku(AppBarLayout appBarLayout, int i13) {
            int iAbs = Math.abs(i13);
            int childCount = appBarLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = appBarLayout.getChildAt(i14);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int sflfametgt(AppBarLayout appBarLayout, int i13) {
            int iAbs = Math.abs(i13);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = appBarLayout.getChildAt(i14);
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                Interpolator interpolatorWkgbmnqykc = eablkybsjgVar.wkgbmnqykc();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorWkgbmnqykc == null) {
                        break;
                    }
                    int iPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
                    if ((iPpxfxbqfkf & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eablkybsjgVar).topMargin + ((LinearLayout.LayoutParams) eablkybsjgVar).bottomMargin;
                        if ((iPpxfxbqfkf & 2) != 0) {
                            topInset -= jhduphickx.pmvmpeiblj(childAt);
                        }
                    }
                    if (jhduphickx.iwizpuwonk(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f13 = topInset;
                    return Integer.signum(i13) * (childAt.getTop() + Math.round(f13 * interpolatorWkgbmnqykc.getInterpolation((iAbs - childAt.getTop()) / f13)));
                }
            }
            return i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View uwvvkdfqfp(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if (((CoordinatorLayout.gxszxtbevo) childAt.getLayoutParams()).gxszxtbevo() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private void vipkmwdibw(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14) {
            int iStevsuqkhv = stevsuqkhv();
            if (iStevsuqkhv == i13) {
                ValueAnimator valueAnimator = this.f21960iozdgvuglv;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f21960iozdgvuglv.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f21960iozdgvuglv;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f21960iozdgvuglv = valueAnimator3;
                valueAnimator3.setInterpolator(ea.iobyxmoadg.f31019eablkybsjg);
                this.f21960iozdgvuglv.addUpdateListener(new iobyxmoadg(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f21960iozdgvuglv.setDuration(Math.min(i14, 600));
            this.f21960iozdgvuglv.setIntValues(iStevsuqkhv, i13);
            this.f21960iozdgvuglv.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean xrmfcynszj(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (((eablkybsjg) appBarLayout.getChildAt(i13).getLayoutParams()).f21975iobyxmoadg != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
        public boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14, int i15, int i16) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.gxszxtbevo) appBarLayout.getLayoutParams())).height != -2) {
                return super.vdvldrhtss(coordinatorLayout, appBarLayout, i13, i14, i15, i16);
            }
            coordinatorLayout.pkzmftpjix(appBarLayout, i13, i14, View.MeasureSpec.makeMeasureSpec(0, 0), i16);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.ppxfxbqfkf
        /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
        public boolean jpowsppfya(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f21962wwaezpbzkn;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
        public void cqumvgiudr(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
            if (i16 < 0) {
                iArr[1] = tzroggbefp(coordinatorLayout, appBarLayout, i16, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i16 == 0) {
                jlmebxxoox(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: lrnfpwlwnk, reason: merged with bridge method [inline-methods] */
        public Parcelable istkbnxepw(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableIstkbnxepw = super.istkbnxepw(coordinatorLayout, appBarLayout);
            SavedState savedStateRoivzttewh = roivzttewh(parcelableIstkbnxepw, appBarLayout);
            return savedStateRoivzttewh == null ? parcelableIstkbnxepw : savedStateRoivzttewh;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
        public void lmojexxdyd(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13) {
            if (this.f21963yadqdtsiqt == 0 || i13 == 1) {
                iwxlajgraz(coordinatorLayout, appBarLayout);
                if (appBarLayout.vdvldrhtss()) {
                    appBarLayout.istkbnxepw(appBarLayout.iozdgvuglv(view));
                }
            }
            this.f21962wwaezpbzkn = new WeakReference(view);
        }

        @Override // com.google.android.material.appbar.eablkybsjg, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
        public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13) {
            boolean zRgvfuqvkyq = super.rgvfuqvkyq(coordinatorLayout, appBarLayout, i13);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f21961lmojexxdyd;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z13 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i14 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z13) {
                            ribwqtqdhb(coordinatorLayout, appBarLayout, i14, 0.0f);
                        } else {
                            mbcevpiqjq(coordinatorLayout, appBarLayout, i14);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z13) {
                            ribwqtqdhb(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            mbcevpiqjq(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f21967jyumaefscl) {
                mbcevpiqjq(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f21966iwizpuwonk) {
                mbcevpiqjq(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f21964cqumvgiudr);
                mbcevpiqjq(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f21961lmojexxdyd.f21968lereixgezr ? jhduphickx.pmvmpeiblj(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f21961lmojexxdyd.f21965esjtqupxsv)));
            }
            appBarLayout.esjtqupxsv();
            this.f21961lmojexxdyd = null;
            hcddaimhww(o1.iobyxmoadg.zoijcleaow(ylkuphrtab(), -appBarLayout.getTotalScrollRange(), 0));
            dvvnrvtcbc(coordinatorLayout, appBarLayout, ylkuphrtab(), 0, true);
            appBarLayout.yggfygwlhe(ylkuphrtab());
            jlmebxxoox(coordinatorLayout, appBarLayout);
            return zRgvfuqvkyq;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
        public void yggfygwlhe(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int[] iArr, int i15) {
            int i16;
            int downNestedPreScrollRange;
            if (i14 != 0) {
                if (i14 < 0) {
                    i16 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i16;
                } else {
                    i16 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i17 = i16;
                int i18 = downNestedPreScrollRange;
                if (i17 != i18) {
                    iArr[1] = tzroggbefp(coordinatorLayout, appBarLayout, i14, i17, i18);
                }
            }
            if (appBarLayout.vdvldrhtss()) {
                appBarLayout.istkbnxepw(appBarLayout.iozdgvuglv(view));
            }
        }

        SavedState roivzttewh(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iYlkuphrtab = ylkuphrtab();
            int childCount = appBarLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = appBarLayout.getChildAt(i13);
                int bottom = childAt.getBottom() + iYlkuphrtab;
                if (childAt.getTop() + iYlkuphrtab <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f8576yggfygwlhe;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z13 = iYlkuphrtab == 0;
                    savedState.f21966iwizpuwonk = z13;
                    savedState.f21967jyumaefscl = !z13 && (-iYlkuphrtab) >= appBarLayout.getTotalScrollRange();
                    savedState.f21964cqumvgiudr = i13;
                    savedState.f21968lereixgezr = bottom == jhduphickx.pmvmpeiblj(childAt) + appBarLayout.getTopInset();
                    savedState.f21965esjtqupxsv = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.ppxfxbqfkf
        int stevsuqkhv() {
            return ylkuphrtab() + this.f21959cdpycssgdh;
        }

        void tbqsvytpvh(SavedState savedState, boolean z13) {
            if (this.f21961lmojexxdyd == null || z13) {
                this.f21961lmojexxdyd = savedState;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.ppxfxbqfkf
        /* JADX INFO: renamed from: uawqvzlxes, reason: merged with bridge method [inline-methods] */
        public int ntlheqmsrt(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14, int i15) {
            int iStevsuqkhv = stevsuqkhv();
            int i16 = 0;
            if (i14 == 0 || iStevsuqkhv < i14 || iStevsuqkhv > i15) {
                this.f21959cdpycssgdh = 0;
            } else {
                int iZoijcleaow = o1.iobyxmoadg.zoijcleaow(i13, i14, i15);
                if (iStevsuqkhv != iZoijcleaow) {
                    int iSflfametgt = appBarLayout.gtknphoqwx() ? sflfametgt(appBarLayout, iZoijcleaow) : iZoijcleaow;
                    boolean zHcddaimhww = hcddaimhww(iSflfametgt);
                    int i17 = iStevsuqkhv - iZoijcleaow;
                    this.f21959cdpycssgdh = iZoijcleaow - iSflfametgt;
                    if (zHcddaimhww) {
                        while (i16 < appBarLayout.getChildCount()) {
                            eablkybsjg eablkybsjgVar = (eablkybsjg) appBarLayout.getChildAt(i16).getLayoutParams();
                            ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = eablkybsjgVar.zoijcleaow();
                            if (ppxfxbqfkfVarZoijcleaow != null && (eablkybsjgVar.ppxfxbqfkf() & 1) != 0) {
                                ppxfxbqfkfVarZoijcleaow.iobyxmoadg(appBarLayout, appBarLayout.getChildAt(i16), ylkuphrtab());
                            }
                            i16++;
                        }
                    }
                    if (!zHcddaimhww && appBarLayout.gtknphoqwx()) {
                        coordinatorLayout.gxszxtbevo(appBarLayout);
                    }
                    appBarLayout.yggfygwlhe(ylkuphrtab());
                    dvvnrvtcbc(coordinatorLayout, appBarLayout, iZoijcleaow, iZoijcleaow < iStevsuqkhv ? -1 : 1, false);
                    i16 = i17;
                }
            }
            jlmebxxoox(coordinatorLayout, appBarLayout);
            return i16;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
        public void zynmafqrjb(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                tbqsvytpvh((SavedState) parcelable, true);
                super.zynmafqrjb(coordinatorLayout, appBarLayout, this.f21961lmojexxdyd.zoijcleaow());
            } else {
                super.zynmafqrjb(coordinatorLayout, appBarLayout, parcelable);
                this.f21961lmojexxdyd = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.ppxfxbqfkf
        /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
        public int wypolnanlu(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.ppxfxbqfkf
        /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
        public int dsvhmnatus(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: zeieaojujs, reason: merged with bridge method [inline-methods] */
        public boolean yadqdtsiqt(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i13, int i14) {
            ValueAnimator valueAnimator;
            boolean z13 = (i13 & 2) != 0 && (appBarLayout.vdvldrhtss() || okpsazkaxt(coordinatorLayout, appBarLayout, view));
            if (z13 && (valueAnimator = this.f21960iozdgvuglv) != null) {
                valueAnimator.cancel();
            }
            this.f21962wwaezpbzkn = null;
            this.f21963yadqdtsiqt = i14;
            return z13;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.ppxfxbqfkf
        /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
        public void kegysxyocb(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            iwxlajgraz(coordinatorLayout, appBarLayout);
            if (appBarLayout.vdvldrhtss()) {
                appBarLayout.istkbnxepw(appBarLayout.iozdgvuglv(metgxyhuhe(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f21964cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            float f21965esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            boolean f21966iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            boolean f21967jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            boolean f21968lereixgezr;

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
                this.f21967jyumaefscl = parcel.readByte() != 0;
                this.f21966iwizpuwonk = parcel.readByte() != 0;
                this.f21964cqumvgiudr = parcel.readInt();
                this.f21965esjtqupxsv = parcel.readFloat();
                this.f21968lereixgezr = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i13) {
                super.writeToParcel(parcel, i13);
                parcel.writeByte(this.f21967jyumaefscl ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f21966iwizpuwonk ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f21964cqumvgiudr);
                parcel.writeFloat(this.f21965esjtqupxsv);
                parcel.writeByte(this.f21968lereixgezr ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: bfopjjpdmp */
        public /* bridge */ /* synthetic */ boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14, int i15, int i16) {
            return super.vdvldrhtss(coordinatorLayout, appBarLayout, i13, i14, i15, i16);
        }

        @Override // com.google.android.material.appbar.eablkybsjg
        public /* bridge */ /* synthetic */ boolean hcddaimhww(int i13) {
            return super.hcddaimhww(i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: iyctptxqzt */
        public /* bridge */ /* synthetic */ void cqumvgiudr(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
            super.cqumvgiudr(coordinatorLayout, appBarLayout, view, i13, i14, i15, i16, i17, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: lrnfpwlwnk */
        public /* bridge */ /* synthetic */ Parcelable istkbnxepw(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.istkbnxepw(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: nuxfzjnpeb */
        public /* bridge */ /* synthetic */ void lmojexxdyd(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13) {
            super.lmojexxdyd(coordinatorLayout, appBarLayout, view, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: oipsdeybqn */
        public /* bridge */ /* synthetic */ boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13) {
            return super.rgvfuqvkyq(coordinatorLayout, appBarLayout, i13);
        }

        @Override // com.google.android.material.appbar.ppxfxbqfkf, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.ojitshcjhn(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: opjhrmiecq */
        public /* bridge */ /* synthetic */ void yggfygwlhe(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int[] iArr, int i15) {
            super.yggfygwlhe(coordinatorLayout, appBarLayout, view, i13, i14, iArr, i15);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: weqkydbzbr */
        public /* bridge */ /* synthetic */ void zynmafqrjb(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.zynmafqrjb(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.ppxfxbqfkf, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.wwaezpbzkn(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.eablkybsjg
        public /* bridge */ /* synthetic */ int ylkuphrtab() {
            return super.ylkuphrtab();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: zeieaojujs */
        public /* bridge */ /* synthetic */ boolean yadqdtsiqt(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i13, int i14) {
            return super.yadqdtsiqt(coordinatorLayout, appBarLayout, view, view2, i13, i14);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.wkgbmnqykc {
        public ScrollingViewBehavior() {
        }

        private void crxdokpmqz(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.vdvldrhtss()) {
                    appBarLayout.istkbnxepw(appBarLayout.iozdgvuglv(view));
                }
            }
        }

        private void sopmlzcsov(View view, View view2) {
            CoordinatorLayout.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((CoordinatorLayout.gxszxtbevo) view2.getLayoutParams()).gxszxtbevo();
            if (ppxfxbqfkfVarGxszxtbevo instanceof BaseBehavior) {
                jhduphickx.ribwqtqdhb(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ppxfxbqfkfVarGxszxtbevo).f21959cdpycssgdh) + stevsuqkhv()) - hkdspvbjdz(view2));
            }
        }

        private static int ulzqkzuiru(AppBarLayout appBarLayout) {
            CoordinatorLayout.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((CoordinatorLayout.gxszxtbevo) appBarLayout.getLayoutParams()).gxszxtbevo();
            if (ppxfxbqfkfVarGxszxtbevo instanceof BaseBehavior) {
                return ((BaseBehavior) ppxfxbqfkfVarGxszxtbevo).stevsuqkhv();
            }
            return 0;
        }

        @Override // com.google.android.material.appbar.wkgbmnqykc
        float cllcsxoeiz(View view) {
            int i13;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iUlzqkzuiru = ulzqkzuiru(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iUlzqkzuiru > downNestedPreScrollRange) && (i13 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iUlzqkzuiru / i13) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public boolean draadjrbmk(CoordinatorLayout coordinatorLayout, View view, View view2) {
            sopmlzcsov(view, view2);
            crxdokpmqz(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public boolean dxjokdxxww(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.wkgbmnqykc
        /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
        public AppBarLayout jpowsppfya(List list) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) list.get(i13);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public boolean pmvmpeiblj(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z13) {
            AppBarLayout appBarLayoutJpowsppfya = jpowsppfya(coordinatorLayout.oxmwwwfdhm(view));
            if (appBarLayoutJpowsppfya != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f22053iwizpuwonk;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutJpowsppfya.lereixgezr(false, !z13);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.eablkybsjg, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
            return super.rgvfuqvkyq(coordinatorLayout, view, i13);
        }

        @Override // com.google.android.material.appbar.wkgbmnqykc, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
            return super.vdvldrhtss(coordinatorLayout, view, i13, i14, i15, i16);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public void wflxmlrfwp(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                jhduphickx.oipsdeybqn(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.wkgbmnqykc
        int wypolnanlu(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.wypolnanlu(view);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draadjrbmk.ScrollingViewBehavior_Layout);
            tzroggbefp(typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface gxszxtbevo extends zoijcleaow {
    }

    class iobyxmoadg implements pkzmftpjix {
        iobyxmoadg() {
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            return AppBarLayout.this.jyumaefscl(skhdrjzrfnVar);
        }
    }

    public static abstract class ppxfxbqfkf {
        public abstract void iobyxmoadg(AppBarLayout appBarLayout, View view, float f13);
    }

    public static class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Rect f21979iobyxmoadg = new Rect();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Rect f21980zoijcleaow = new Rect();

        private static void zoijcleaow(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ppxfxbqfkf
        public void iobyxmoadg(AppBarLayout appBarLayout, View view, float f13) {
            zoijcleaow(this.f21979iobyxmoadg, appBarLayout, view);
            float fAbs = this.f21979iobyxmoadg.top - Math.abs(f13);
            if (fAbs > 0.0f) {
                jhduphickx.nuxfzjnpeb(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fIobyxmoadg = 1.0f - o1.iobyxmoadg.iobyxmoadg(Math.abs(fAbs / this.f21979iobyxmoadg.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f21979iobyxmoadg.height() * 0.3f) * (1.0f - (fIobyxmoadg * fIobyxmoadg)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f21980zoijcleaow);
            this.f21980zoijcleaow.offset(0, (int) (-fHeight));
            if (fHeight >= this.f21980zoijcleaow.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            jhduphickx.nuxfzjnpeb(view, this.f21980zoijcleaow);
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(AppBarLayout appBarLayout, int i13);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.appBarLayoutStyle);
    }

    private void agtfadlqog(final ra.lqeggnwhkg lqeggnwhkgVar, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numGxszxtbevo = ia.iobyxmoadg.gxszxtbevo(getContext(), da.zoijcleaow.colorSurface);
        this.f21949pkzmftpjix = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.iobyxmoadg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22036iobyxmoadg.kcexrzcfyt(colorStateList, colorStateList2, lqeggnwhkgVar, numGxszxtbevo, valueAnimator);
            }
        };
        jhduphickx.weqkydbzbr(this, lqeggnwhkgVar);
    }

    private boolean draadjrbmk() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            if (((eablkybsjg) getChildAt(i13).getLayoutParams()).eablkybsjg()) {
                return true;
            }
        }
        return false;
    }

    private void eablkybsjg() {
        WeakReference weakReference = this.f21948lmojexxdyd;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21948lmojexxdyd = null;
    }

    private Integer gxszxtbevo() {
        Drawable drawable = this.f21937dsvhmnatus;
        if (drawable instanceof ra.lqeggnwhkg) {
            return Integer.valueOf(((ra.lqeggnwhkg) drawable).pmvmpeiblj());
        }
        ColorStateList colorStateListGxszxtbevo = com.google.android.material.drawable.wkgbmnqykc.gxszxtbevo(drawable);
        if (colorStateListGxszxtbevo != null) {
            return Integer.valueOf(colorStateListGxszxtbevo.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kcexrzcfyt(ColorStateList colorStateList, ColorStateList colorStateList2, ra.lqeggnwhkg lqeggnwhkgVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iBtonecajqb = ia.iobyxmoadg.btonecajqb(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        lqeggnwhkgVar.crxdokpmqz(ColorStateList.valueOf(iBtonecajqb));
        if (this.f21937dsvhmnatus != null && (num2 = this.f21953wypolnanlu) != null && num2.equals(num)) {
            k1.iobyxmoadg.agtfadlqog(this.f21937dsvhmnatus, iBtonecajqb);
        }
        if (this.f21939hcddaimhww.isEmpty()) {
            return;
        }
        Iterator it = this.f21939hcddaimhww.iterator();
        while (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            if (lqeggnwhkgVar.cqumvgiudr() != null) {
                throw null;
            }
        }
    }

    private boolean lmojexxdyd() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || jhduphickx.iwizpuwonk(childAt)) ? false : true;
    }

    private View lqeggnwhkg(View view) {
        int i13;
        if (this.f21948lmojexxdyd == null && (i13 = this.f21941iozdgvuglv) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i13) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f21941iozdgvuglv);
            }
            if (viewFindViewById != null) {
                this.f21948lmojexxdyd = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f21948lmojexxdyd;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private void ojitshcjhn(Context context, final ra.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.hkdspvbjdz(context);
        this.f21949pkzmftpjix = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.zoijcleaow
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22055iobyxmoadg.zdlpuopuiu(lqeggnwhkgVar, valueAnimator);
            }
        };
        jhduphickx.weqkydbzbr(this, lqeggnwhkgVar);
    }

    private boolean oxmwwwfdhm() {
        return getBackground() instanceof ra.lqeggnwhkg;
    }

    private void pmvmpeiblj(boolean z13, boolean z14, boolean z15) {
        this.f21938esjtqupxsv = (z13 ? 1 : 2) | (z14 ? 4 : 0) | (z15 ? 8 : 0);
        requestLayout();
    }

    private void rgvfuqvkyq() {
        Behavior behavior = this.f21946kegysxyocb;
        BaseBehavior.SavedState savedStateRoivzttewh = (behavior == null || this.f21955yggfygwlhe == -1 || this.f21938esjtqupxsv != 0) ? null : behavior.roivzttewh(AbsSavedState.f8576yggfygwlhe, this);
        this.f21955yggfygwlhe = -1;
        this.f21945jyumaefscl = -1;
        this.f21943iwizpuwonk = -1;
        if (savedStateRoivzttewh != null) {
            this.f21946kegysxyocb.tbqsvytpvh(savedStateRoivzttewh, false);
        }
    }

    private void wwaezpbzkn(float f13, float f14) {
        ValueAnimator valueAnimator = this.f21956ylkuphrtab;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13, f14);
        this.f21956ylkuphrtab = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f21944jpowsppfya);
        this.f21956ylkuphrtab.setInterpolator(this.f21940hkdspvbjdz);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f21949pkzmftpjix;
        if (animatorUpdateListener != null) {
            this.f21956ylkuphrtab.addUpdateListener(animatorUpdateListener);
        }
        this.f21956ylkuphrtab.start();
    }

    private boolean yadqdtsiqt() {
        return this.f21937dsvhmnatus != null && getTopInset() > 0;
    }

    private void ylkuphrtab() {
        setWillNotDraw(!yadqdtsiqt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zdlpuopuiu(ra.lqeggnwhkg lqeggnwhkgVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lqeggnwhkgVar.sopmlzcsov(fFloatValue);
        Drawable drawable = this.f21937dsvhmnatus;
        if (drawable instanceof ra.lqeggnwhkg) {
            ((ra.lqeggnwhkg) drawable).sopmlzcsov(fFloatValue);
        }
        Iterator it = this.f21939hcddaimhww.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            lqeggnwhkgVar.pmvmpeiblj();
            throw null;
        }
    }

    private boolean zynmafqrjb(boolean z13) {
        if (this.f21942istkbnxepw == z13) {
            return false;
        }
        this.f21942istkbnxepw = z13;
        refreshDrawableState();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public eablkybsjg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new eablkybsjg((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new eablkybsjg((ViewGroup.MarginLayoutParams) layoutParams) : new eablkybsjg(layoutParams);
    }

    boolean cdpycssgdh(boolean z13, boolean z14) {
        if (!z14 || this.f21934cdpycssgdh == z13) {
            return false;
        }
        this.f21934cdpycssgdh = z13;
        refreshDrawableState();
        if (!oxmwwwfdhm()) {
            return true;
        }
        if (this.f21952wwaezpbzkn) {
            wwaezpbzkn(z13 ? 0.0f : 1.0f, z13 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f21954yadqdtsiqt) {
            return true;
        }
        wwaezpbzkn(z13 ? 0.0f : this.f21951stevsuqkhv, z13 ? this.f21951stevsuqkhv : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eablkybsjg;
    }

    public void cqumvgiudr(gxszxtbevo gxszxtbevoVar) {
        iwizpuwonk(gxszxtbevoVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (yadqdtsiqt()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f21957zdlpuopuiu);
            this.f21937dsvhmnatus.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f21937dsvhmnatus;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public eablkybsjg generateLayoutParams(AttributeSet attributeSet) {
        return new eablkybsjg(getContext(), attributeSet);
    }

    void esjtqupxsv() {
        this.f21938esjtqupxsv = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zoijcleaow
    public CoordinatorLayout.ppxfxbqfkf getBehavior() {
        Behavior behavior = new Behavior();
        this.f21946kegysxyocb = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iPmvmpeiblj;
        int i13 = this.f21945jyumaefscl;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eablkybsjgVar.f21975iobyxmoadg;
                if ((i15 & 5) != 5) {
                    if (i14 > 0) {
                        break;
                    }
                } else {
                    int i16 = ((LinearLayout.LayoutParams) eablkybsjgVar).topMargin + ((LinearLayout.LayoutParams) eablkybsjgVar).bottomMargin;
                    if ((i15 & 8) != 0) {
                        iPmvmpeiblj = jhduphickx.pmvmpeiblj(childAt);
                    } else {
                        if ((i15 & 2) != 0) {
                            iPmvmpeiblj = measuredHeight - jhduphickx.pmvmpeiblj(childAt);
                        } else {
                            iMin = i16 + measuredHeight;
                        }
                        if (childCount == 0 && jhduphickx.iwizpuwonk(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i14 += iMin;
                    }
                    iMin = i16 + iPmvmpeiblj;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i14 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i14);
        this.f21945jyumaefscl = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i13 = this.f21943iwizpuwonk;
        if (i13 != -1) {
            return i13;
        }
        int childCount = getChildCount();
        int iPmvmpeiblj = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eablkybsjgVar).topMargin + ((LinearLayout.LayoutParams) eablkybsjgVar).bottomMargin;
                int i15 = eablkybsjgVar.f21975iobyxmoadg;
                if ((i15 & 1) == 0) {
                    break;
                }
                iPmvmpeiblj += measuredHeight;
                if ((i15 & 2) != 0) {
                    iPmvmpeiblj -= jhduphickx.pmvmpeiblj(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iPmvmpeiblj);
        this.f21943iwizpuwonk = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f21941iozdgvuglv;
    }

    public ra.lqeggnwhkg getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof ra.lqeggnwhkg) {
            return (ra.lqeggnwhkg) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iPmvmpeiblj = jhduphickx.pmvmpeiblj(this);
        if (iPmvmpeiblj == 0) {
            int childCount = getChildCount();
            iPmvmpeiblj = childCount >= 1 ? jhduphickx.pmvmpeiblj(getChildAt(childCount - 1)) : 0;
            if (iPmvmpeiblj == 0) {
                return getHeight() / 3;
            }
        }
        return (iPmvmpeiblj * 2) + topInset;
    }

    int getPendingAction() {
        return this.f21938esjtqupxsv;
    }

    public Drawable getStatusBarForeground() {
        return this.f21937dsvhmnatus;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        skhdrjzrfn skhdrjzrfnVar = this.f21947lereixgezr;
        if (skhdrjzrfnVar != null) {
            return skhdrjzrfnVar.wflxmlrfwp();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i13 = this.f21955yggfygwlhe;
        if (i13 != -1) {
            return i13;
        }
        int childCount = getChildCount();
        int iPmvmpeiblj = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eablkybsjgVar.f21975iobyxmoadg;
                if ((i15 & 1) == 0) {
                    break;
                }
                iPmvmpeiblj += measuredHeight + ((LinearLayout.LayoutParams) eablkybsjgVar).topMargin + ((LinearLayout.LayoutParams) eablkybsjgVar).bottomMargin;
                if (i14 == 0 && jhduphickx.iwizpuwonk(childAt)) {
                    iPmvmpeiblj -= getTopInset();
                }
                if ((i15 & 2) != 0) {
                    iPmvmpeiblj -= jhduphickx.pmvmpeiblj(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iPmvmpeiblj);
        this.f21955yggfygwlhe = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean gtknphoqwx() {
        return this.f21936cqumvgiudr;
    }

    boolean iozdgvuglv(View view) {
        View viewLqeggnwhkg = lqeggnwhkg(view);
        if (viewLqeggnwhkg != null) {
            view = viewLqeggnwhkg;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    boolean istkbnxepw(boolean z13) {
        return cdpycssgdh(z13, !this.f21958zynmafqrjb);
    }

    public void iwizpuwonk(zoijcleaow zoijcleaowVar) {
        List list = this.f21950pmvmpeiblj;
        if (list == null || zoijcleaowVar == null) {
            return;
        }
        list.remove(zoijcleaowVar);
    }

    skhdrjzrfn jyumaefscl(skhdrjzrfn skhdrjzrfnVar) {
        skhdrjzrfn skhdrjzrfnVar2 = jhduphickx.iwizpuwonk(this) ? skhdrjzrfnVar : null;
        if (!u1.zoijcleaow.iobyxmoadg(this.f21947lereixgezr, skhdrjzrfnVar2)) {
            this.f21947lereixgezr = skhdrjzrfnVar2;
            ylkuphrtab();
            requestLayout();
        }
        return skhdrjzrfnVar;
    }

    public void lereixgezr(boolean z13, boolean z14) {
        pmvmpeiblj(z13, z14, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public eablkybsjg generateDefaultLayoutParams() {
        return new eablkybsjg(-1, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        nufgyqmvbu.eablkybsjg(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        if (this.f21935cllcsxoeiz == null) {
            this.f21935cllcsxoeiz = new int[4];
        }
        int[] iArr = this.f21935cllcsxoeiz;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + iArr.length);
        boolean z13 = this.f21942istkbnxepw;
        int i14 = da.zoijcleaow.state_liftable;
        if (!z13) {
            i14 = -i14;
        }
        iArr[0] = i14;
        iArr[1] = (z13 && this.f21934cdpycssgdh) ? da.zoijcleaow.state_lifted : -da.zoijcleaow.state_lifted;
        int i15 = da.zoijcleaow.state_collapsible;
        if (!z13) {
            i15 = -i15;
        }
        iArr[2] = i15;
        iArr[3] = (z13 && this.f21934cdpycssgdh) ? da.zoijcleaow.state_collapsed : -da.zoijcleaow.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eablkybsjg();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        boolean z14 = true;
        if (jhduphickx.iwizpuwonk(this) && lmojexxdyd()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                jhduphickx.ribwqtqdhb(getChildAt(childCount), topInset);
            }
        }
        rgvfuqvkyq();
        this.f21936cqumvgiudr = false;
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            if (((eablkybsjg) getChildAt(i17).getLayoutParams()).wkgbmnqykc() != null) {
                this.f21936cqumvgiudr = true;
                break;
            }
        }
        Drawable drawable = this.f21937dsvhmnatus;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f21958zynmafqrjb) {
            return;
        }
        if (!this.f21954yadqdtsiqt && !draadjrbmk()) {
            z14 = false;
        }
        zynmafqrjb(z14);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        if (mode != 1073741824 && jhduphickx.iwizpuwonk(this) && lmojexxdyd()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = o1.iobyxmoadg.zoijcleaow(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i14));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        rgvfuqvkyq();
    }

    public void ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        if (this.f21950pmvmpeiblj == null) {
            this.f21950pmvmpeiblj = new ArrayList();
        }
        if (zoijcleaowVar == null || this.f21950pmvmpeiblj.contains(zoijcleaowVar)) {
            return;
        }
        this.f21950pmvmpeiblj.add(zoijcleaowVar);
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        nufgyqmvbu.wkgbmnqykc(this, f13);
    }

    public void setExpanded(boolean z13) {
        lereixgezr(z13, jhduphickx.tzroggbefp(this));
    }

    public void setLiftOnScroll(boolean z13) {
        this.f21954yadqdtsiqt = z13;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f21941iozdgvuglv = -1;
        if (view == null) {
            eablkybsjg();
        } else {
            this.f21948lmojexxdyd = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i13) {
        this.f21941iozdgvuglv = i13;
        eablkybsjg();
    }

    public void setLiftableOverrideEnabled(boolean z13) {
        this.f21958zynmafqrjb = z13;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i13) {
        if (i13 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i13);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f21937dsvhmnatus;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f21937dsvhmnatus = drawable != null ? drawable.mutate() : null;
            this.f21953wypolnanlu = gxszxtbevo();
            Drawable drawable3 = this.f21937dsvhmnatus;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f21937dsvhmnatus.setState(getDrawableState());
                }
                k1.iobyxmoadg.wflxmlrfwp(this.f21937dsvhmnatus, jhduphickx.lereixgezr(this));
                this.f21937dsvhmnatus.setVisible(getVisibility() == 0, false);
                this.f21937dsvhmnatus.setCallback(this);
            }
            ylkuphrtab();
            jhduphickx.xrmfcynszj(this);
        }
    }

    public void setStatusBarForegroundColor(int i13) {
        setStatusBarForeground(new ColorDrawable(i13));
    }

    public void setStatusBarForegroundResource(int i13) {
        setStatusBarForeground(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    @Deprecated
    public void setTargetElevation(float f13) {
        lqeggnwhkg.zoijcleaow(this, f13);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f21937dsvhmnatus;
        if (drawable != null) {
            drawable.setVisible(z13, false);
        }
    }

    public boolean vdvldrhtss() {
        return this.f21954yadqdtsiqt;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21937dsvhmnatus;
    }

    boolean wflxmlrfwp() {
        return getTotalScrollRange() != 0;
    }

    public void wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf(gxszxtbevoVar);
    }

    void yggfygwlhe(int i13) {
        this.f21957zdlpuopuiu = i13;
        if (!willNotDraw()) {
            jhduphickx.xrmfcynszj(this);
        }
        List list = this.f21950pmvmpeiblj;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) this.f21950pmvmpeiblj.get(i14);
                if (zoijcleaowVar != null) {
                    zoijcleaowVar.iobyxmoadg(this, i13);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f21933tzroggbefp;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f21955yggfygwlhe = -1;
        this.f21945jyumaefscl = -1;
        this.f21943iwizpuwonk = -1;
        this.f21938esjtqupxsv = 0;
        this.f21939hcddaimhww = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            lqeggnwhkg.iobyxmoadg(this);
        }
        lqeggnwhkg.ppxfxbqfkf(this, attributeSet, i13, i14);
        TypedArray typedArrayDxjokdxxww = com.google.android.material.internal.draadjrbmk.dxjokdxxww(context2, attributeSet, draadjrbmk.AppBarLayout, i13, i14, new int[0]);
        jhduphickx.weqkydbzbr(this, typedArrayDxjokdxxww.getDrawable(draadjrbmk.AppBarLayout_android_background));
        ColorStateList colorStateListIobyxmoadg = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, draadjrbmk.AppBarLayout_liftOnScrollColor);
        this.f21952wwaezpbzkn = colorStateListIobyxmoadg != null;
        ColorStateList colorStateListGxszxtbevo = com.google.android.material.drawable.wkgbmnqykc.gxszxtbevo(getBackground());
        if (colorStateListGxszxtbevo != null) {
            ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg();
            lqeggnwhkgVar.crxdokpmqz(colorStateListGxszxtbevo);
            if (colorStateListIobyxmoadg != null) {
                agtfadlqog(lqeggnwhkgVar, colorStateListGxszxtbevo, colorStateListIobyxmoadg);
            } else {
                ojitshcjhn(context2, lqeggnwhkgVar);
            }
        }
        this.f21944jpowsppfya = na.nufgyqmvbu.gxszxtbevo(context2, da.zoijcleaow.motionDurationMedium2, getResources().getInteger(da.lqeggnwhkg.app_bar_elevation_anim_duration));
        this.f21940hkdspvbjdz = na.nufgyqmvbu.lqeggnwhkg(context2, da.zoijcleaow.motionEasingStandardInterpolator, ea.iobyxmoadg.f31020iobyxmoadg);
        if (typedArrayDxjokdxxww.hasValue(draadjrbmk.AppBarLayout_expanded)) {
            pmvmpeiblj(typedArrayDxjokdxxww.getBoolean(draadjrbmk.AppBarLayout_expanded, false), false, false);
        }
        if (typedArrayDxjokdxxww.hasValue(draadjrbmk.AppBarLayout_elevation)) {
            lqeggnwhkg.zoijcleaow(this, typedArrayDxjokdxxww.getDimensionPixelSize(draadjrbmk.AppBarLayout_elevation, 0));
        }
        if (typedArrayDxjokdxxww.hasValue(draadjrbmk.AppBarLayout_android_keyboardNavigationCluster)) {
            setKeyboardNavigationCluster(typedArrayDxjokdxxww.getBoolean(draadjrbmk.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if (typedArrayDxjokdxxww.hasValue(draadjrbmk.AppBarLayout_android_touchscreenBlocksFocus)) {
            setTouchscreenBlocksFocus(typedArrayDxjokdxxww.getBoolean(draadjrbmk.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        this.f21951stevsuqkhv = getResources().getDimension(da.wkgbmnqykc.design_appbar_elevation);
        this.f21954yadqdtsiqt = typedArrayDxjokdxxww.getBoolean(draadjrbmk.AppBarLayout_liftOnScroll, false);
        this.f21941iozdgvuglv = typedArrayDxjokdxxww.getResourceId(draadjrbmk.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayDxjokdxxww.getDrawable(draadjrbmk.AppBarLayout_statusBarForeground));
        typedArrayDxjokdxxww.recycle();
        jhduphickx.igdgnonuha(this, new iobyxmoadg());
    }

    public static class eablkybsjg extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f21975iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        Interpolator f21976ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ppxfxbqfkf f21977zoijcleaow;

        public eablkybsjg(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21975iobyxmoadg = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draadjrbmk.AppBarLayout_Layout);
            this.f21975iobyxmoadg = typedArrayObtainStyledAttributes.getInt(draadjrbmk.AppBarLayout_Layout_layout_scrollFlags, 0);
            gxszxtbevo(typedArrayObtainStyledAttributes.getInt(draadjrbmk.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f21976ppxfxbqfkf = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(draadjrbmk.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private ppxfxbqfkf iobyxmoadg(int i13) {
            if (i13 != 1) {
                return null;
            }
            return new wkgbmnqykc();
        }

        boolean eablkybsjg() {
            int i13 = this.f21975iobyxmoadg;
            return (i13 & 1) == 1 && (i13 & 10) != 0;
        }

        public void gxszxtbevo(int i13) {
            this.f21977zoijcleaow = iobyxmoadg(i13);
        }

        public int ppxfxbqfkf() {
            return this.f21975iobyxmoadg;
        }

        public Interpolator wkgbmnqykc() {
            return this.f21976ppxfxbqfkf;
        }

        public ppxfxbqfkf zoijcleaow() {
            return this.f21977zoijcleaow;
        }

        public eablkybsjg(int i13, int i14) {
            super(i13, i14);
            this.f21975iobyxmoadg = 1;
        }

        public eablkybsjg(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21975iobyxmoadg = 1;
        }

        public eablkybsjg(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21975iobyxmoadg = 1;
        }

        public eablkybsjg(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21975iobyxmoadg = 1;
        }
    }
}
