package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.yggfygwlhe;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import da.btonecajqb;
import da.draadjrbmk;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import na.lqeggnwhkg;
import ra.gtknphoqwx;
import v1.jhduphickx;
import w1.iwizpuwonk;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.ppxfxbqfkf implements na.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private b2.ppxfxbqfkf f23025cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private VelocityTracker f23026cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private gtknphoqwx f23027cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private lqeggnwhkg f23028dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ppxfxbqfkf f23029esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private WeakReference f23030hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f23031hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private float f23032iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f23033istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ColorStateList f23034iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private WeakReference f23035jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ra.lqeggnwhkg f23036jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf f23037kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f23038lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f23039lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f23040pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f23041pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final Set f23042stevsuqkhv;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f23043wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f23044wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f23045yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f23046yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f23047ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private com.google.android.material.sidesheet.ppxfxbqfkf f23048zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f23049zynmafqrjb;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final int f23024tzroggbefp = btonecajqb.side_sheet_accessibility_pane_title;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private static final int f23023mbcevpiqjq = da.gtknphoqwx.Widget_Material3_SideSheet;

    class iobyxmoadg extends b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void btonecajqb(int i13) {
            if (i13 == 1 && SideSheetBehavior.this.f23041pmvmpeiblj) {
                SideSheetBehavior.this.fyldjkxazc(1);
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void draadjrbmk(View view, float f13, float f14) {
            int iSopmlzcsov = SideSheetBehavior.this.sopmlzcsov(view, f13, f14);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.jrbgnlbqoe(view, iSopmlzcsov, sideSheetBehavior.ixidwrxhsl());
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void gtknphoqwx(View view, int i13, int i14, int i15, int i16) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewXrmfcynszj = SideSheetBehavior.this.xrmfcynszj();
            if (viewXrmfcynszj != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewXrmfcynszj.getLayoutParams()) != null) {
                SideSheetBehavior.this.f23048zdlpuopuiu.rgvfuqvkyq(marginLayoutParams, view.getLeft(), view.getRight());
                viewXrmfcynszj.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.vipkmwdibw(view, i13);
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int iobyxmoadg(View view, int i13, int i14) {
            return o1.iobyxmoadg.zoijcleaow(i13, SideSheetBehavior.this.f23048zdlpuopuiu.lqeggnwhkg(), SideSheetBehavior.this.f23048zdlpuopuiu.gxszxtbevo());
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public boolean wflxmlrfwp(View view, int i13) {
            return (SideSheetBehavior.this.f23049zynmafqrjb == 1 || SideSheetBehavior.this.f23030hcddaimhww == null || SideSheetBehavior.this.f23030hcddaimhww.get() != view) ? false : true;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int wkgbmnqykc(View view) {
            return SideSheetBehavior.this.f23039lmojexxdyd + SideSheetBehavior.this.yfnezrywwk();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int zoijcleaow(View view, int i13, int i14) {
            return view.getTop();
        }
    }

    class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f23052iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Runnable f23053ppxfxbqfkf = new Runnable() { // from class: com.google.android.material.sidesheet.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f23057zdlpuopuiu.ppxfxbqfkf();
            }
        };

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f23055zoijcleaow;

        ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ppxfxbqfkf() {
            this.f23055zoijcleaow = false;
            if (SideSheetBehavior.this.f23025cdpycssgdh != null && SideSheetBehavior.this.f23025cdpycssgdh.draadjrbmk(true)) {
                zoijcleaow(this.f23052iobyxmoadg);
            } else if (SideSheetBehavior.this.f23049zynmafqrjb == 2) {
                SideSheetBehavior.this.fyldjkxazc(this.f23052iobyxmoadg);
            }
        }

        void zoijcleaow(int i13) {
            if (SideSheetBehavior.this.f23030hcddaimhww == null || SideSheetBehavior.this.f23030hcddaimhww.get() == null) {
                return;
            }
            this.f23052iobyxmoadg = i13;
            if (this.f23055zoijcleaow) {
                return;
            }
            jhduphickx.metgxyhuhe((View) SideSheetBehavior.this.f23030hcddaimhww.get(), this.f23053ppxfxbqfkf);
            this.f23055zoijcleaow = true;
        }
    }

    class zoijcleaow extends AnimatorListenerAdapter {
        zoijcleaow() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.fyldjkxazc(5);
            if (SideSheetBehavior.this.f23030hcddaimhww == null || SideSheetBehavior.this.f23030hcddaimhww.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f23030hcddaimhww.get()).requestLayout();
        }
    }

    public SideSheetBehavior() {
        this.f23029esjtqupxsv = new ppxfxbqfkf();
        this.f23041pmvmpeiblj = true;
        this.f23049zynmafqrjb = 5;
        this.f23033istkbnxepw = 5;
        this.f23032iozdgvuglv = 0.1f;
        this.f23031hkdspvbjdz = -1;
        this.f23042stevsuqkhv = new LinkedHashSet();
        this.f23037kegysxyocb = new iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void auzgnhcxok(int i13) {
        View view = (View) this.f23030hcddaimhww.get();
        if (view != null) {
            jrbgnlbqoe(view, i13, false);
        }
    }

    private void crxdokpmqz() {
        WeakReference weakReference = this.f23035jpowsppfya;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23035jpowsppfya = null;
    }

    private void dvvnrvtcbc(View view, zdlpuopuiu.iobyxmoadg iobyxmoadgVar, int i13) {
        jhduphickx.yfnezrywwk(view, iobyxmoadgVar, null, jlmebxxoox(i13));
    }

    private void ezmngbhpjk() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f23030hcddaimhww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f23030hcddaimhww.get();
        View viewXrmfcynszj = xrmfcynszj();
        if (viewXrmfcynszj == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewXrmfcynszj.getLayoutParams()) == null) {
            return;
        }
        this.f23048zdlpuopuiu.ojitshcjhn(marginLayoutParams, (int) ((this.f23039lmojexxdyd * view.getScaleX()) + this.f23040pkzmftpjix));
        viewXrmfcynszj.requestLayout();
    }

    private void fiwbwshyhd(View view, int i13) {
        hszhottldk(v1.zdlpuopuiu.zoijcleaow(((CoordinatorLayout.gxszxtbevo) view.getLayoutParams()).f8327ppxfxbqfkf, i13) == 3 ? 1 : 0);
    }

    private void fmlbqenlif() {
        View view;
        WeakReference weakReference = this.f23030hcddaimhww;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        jhduphickx.czzsidtyhn(view, 262144);
        jhduphickx.czzsidtyhn(view, 1048576);
        if (this.f23049zynmafqrjb != 5) {
            dvvnrvtcbc(view, zdlpuopuiu.iobyxmoadg.f118519esjtqupxsv, 5);
        }
        if (this.f23049zynmafqrjb != 3) {
            dvvnrvtcbc(view, zdlpuopuiu.iobyxmoadg.f118526iwizpuwonk, 3);
        }
    }

    private void hszhottldk(int i13) {
        com.google.android.material.sidesheet.ppxfxbqfkf ppxfxbqfkfVar = this.f23048zdlpuopuiu;
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar.btonecajqb() != i13) {
            if (i13 == 0) {
                this.f23048zdlpuopuiu = new com.google.android.material.sidesheet.zoijcleaow(this);
                if (this.f23027cqumvgiudr == null || weqkydbzbr()) {
                    return;
                }
                gtknphoqwx.zoijcleaow zoijcleaowVarJyumaefscl = this.f23027cqumvgiudr.jyumaefscl();
                zoijcleaowVarJyumaefscl.lmojexxdyd(0.0f).esjtqupxsv(0.0f);
                rhgxfdycjh(zoijcleaowVarJyumaefscl.wflxmlrfwp());
                return;
            }
            if (i13 == 1) {
                this.f23048zdlpuopuiu = new com.google.android.material.sidesheet.iobyxmoadg(this);
                if (this.f23027cqumvgiudr == null || iyctptxqzt()) {
                    return;
                }
                gtknphoqwx.zoijcleaow zoijcleaowVarJyumaefscl2 = this.f23027cqumvgiudr.jyumaefscl();
                zoijcleaowVarJyumaefscl2.istkbnxepw(0.0f).yggfygwlhe(0.0f);
                rhgxfdycjh(zoijcleaowVarJyumaefscl2.wflxmlrfwp());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i13 + ". Must be 0 or 1.");
        }
    }

    private void igdgnonuha(View view, Runnable runnable) {
        if (nuxfzjnpeb(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int ikoacuggdj(int i13, int i14, int i15, int i16) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i14, i16);
        if (i15 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i15), 1073741824);
        }
        if (size != 0) {
            i15 = Math.min(size, i15);
        }
        return View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
    }

    private boolean ipoelvxyzq() {
        return this.f23025cdpycssgdh != null && (this.f23041pmvmpeiblj || this.f23049zynmafqrjb == 1);
    }

    private void iwxlajgraz(CoordinatorLayout coordinatorLayout) {
        int i13;
        View viewFindViewById;
        if (this.f23035jpowsppfya != null || (i13 = this.f23031hkdspvbjdz) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i13)) == null) {
            return;
        }
        this.f23035jpowsppfya = new WeakReference(viewFindViewById);
    }

    private boolean iyctptxqzt() {
        CoordinatorLayout.gxszxtbevo gxszxtbevoVarOpjhrmiecq = opjhrmiecq();
        return gxszxtbevoVarOpjhrmiecq != null && ((ViewGroup.MarginLayoutParams) gxszxtbevoVarOpjhrmiecq).leftMargin > 0;
    }

    private void jhduphickx(View view) {
        if (jhduphickx.ojitshcjhn(view) == null) {
            jhduphickx.iyctptxqzt(view, view.getResources().getString(f23024tzroggbefp));
        }
    }

    private iwizpuwonk jlmebxxoox(final int i13) {
        return new iwizpuwonk() { // from class: sa.iobyxmoadg
            @Override // w1.iwizpuwonk
            public final boolean iobyxmoadg(View view, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
                return this.f105849iobyxmoadg.roivzttewh(i13, view, iobyxmoadgVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jrbgnlbqoe(View view, int i13, boolean z13) {
        if (!tbqsvytpvh(view, i13, z13)) {
            fyldjkxazc(i13);
        } else {
            fyldjkxazc(2);
            this.f23029esjtqupxsv.zoijcleaow(i13);
        }
    }

    private ValueAnimator.AnimatorUpdateListener jztzpxfvev() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewXrmfcynszj = xrmfcynszj();
        if (viewXrmfcynszj == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewXrmfcynszj.getLayoutParams()) == null) {
            return null;
        }
        final int iPpxfxbqfkf = this.f23048zdlpuopuiu.ppxfxbqfkf(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: sa.ppxfxbqfkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f105851iobyxmoadg.uawqvzlxes(marginLayoutParams, iPpxfxbqfkf, viewXrmfcynszj, valueAnimator);
            }
        };
    }

    private boolean lrnfpwlwnk(MotionEvent motionEvent) {
        return ipoelvxyzq() && ulzqkzuiru((float) this.f23044wypolnanlu, motionEvent.getX()) > ((float) this.f23025cdpycssgdh.iwizpuwonk());
    }

    private boolean mhtqkkgtqm(View view) {
        return (view.isShown() || jhduphickx.ojitshcjhn(view) != null) && this.f23041pmvmpeiblj;
    }

    private int ntlheqmsrt(int i13, View view) {
        int i14 = this.f23049zynmafqrjb;
        if (i14 == 1 || i14 == 2) {
            return i13 - this.f23048zdlpuopuiu.nufgyqmvbu(view);
        }
        if (i14 == 3) {
            return 0;
        }
        if (i14 == 5) {
            return this.f23048zdlpuopuiu.eablkybsjg();
        }
        throw new IllegalStateException("Unexpected value: " + this.f23049zynmafqrjb);
    }

    private boolean nuxfzjnpeb(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && jhduphickx.kegysxyocb(view);
    }

    private CoordinatorLayout.gxszxtbevo opjhrmiecq() {
        View view;
        WeakReference weakReference = this.f23030hcddaimhww;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.gxszxtbevo)) {
            return null;
        }
        return (CoordinatorLayout.gxszxtbevo) view.getLayoutParams();
    }

    private void rhgxfdycjh(gtknphoqwx gtknphoqwxVar) {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f23036jyumaefscl;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.setShapeAppearanceModel(gtknphoqwxVar);
        }
    }

    private void ribwqtqdhb(Context context) {
        if (this.f23027cqumvgiudr == null) {
            return;
        }
        ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg(this.f23027cqumvgiudr);
        this.f23036jyumaefscl = lqeggnwhkgVar;
        lqeggnwhkgVar.hkdspvbjdz(context);
        ColorStateList colorStateList = this.f23034iwizpuwonk;
        if (colorStateList != null) {
            this.f23036jyumaefscl.crxdokpmqz(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f23036jyumaefscl.setTint(typedValue.data);
    }

    private int rlfsiqarku() {
        com.google.android.material.sidesheet.ppxfxbqfkf ppxfxbqfkfVar = this.f23048zdlpuopuiu;
        return (ppxfxbqfkfVar == null || ppxfxbqfkfVar.btonecajqb() == 0) ? 5 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean roivzttewh(int i13, View view, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
        ageimvtcrz(i13);
        return true;
    }

    private void skhdrjzrfn() {
        VelocityTracker velocityTracker = this.f23026cllcsxoeiz;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23026cllcsxoeiz = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sopmlzcsov(View view, float f13, float f14) {
        if (zeieaojujs(f13)) {
            return 3;
        }
        if (grlcpdaxtj(view, f13)) {
            if (!this.f23048zdlpuopuiu.wflxmlrfwp(f13, f14) && !this.f23048zdlpuopuiu.draadjrbmk(view)) {
                return 3;
            }
        } else if (f13 == 0.0f || !wkgbmnqykc.iobyxmoadg(f13, f14)) {
            int left = view.getLeft();
            if (Math.abs(left - metgxyhuhe()) < Math.abs(left - this.f23048zdlpuopuiu.eablkybsjg())) {
                return 3;
            }
        }
        return 5;
    }

    private boolean tbqsvytpvh(View view, int i13, boolean z13) {
        int iYdmasvzmpa = ydmasvzmpa(i13);
        b2.ppxfxbqfkf ppxfxbqfkfVarBfopjjpdmp = bfopjjpdmp();
        return ppxfxbqfkfVarBfopjjpdmp != null && (!z13 ? !ppxfxbqfkfVarBfopjjpdmp.cllcsxoeiz(view, iYdmasvzmpa, view.getTop()) : !ppxfxbqfkfVarBfopjjpdmp.jpowsppfya(iYdmasvzmpa, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uawqvzlxes(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, View view, ValueAnimator valueAnimator) {
        this.f23048zdlpuopuiu.ojitshcjhn(marginLayoutParams, ea.iobyxmoadg.ppxfxbqfkf(i13, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private float ulzqkzuiru(float f13, float f14) {
        return Math.abs(f13 - f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vipkmwdibw(View view, int i13) {
        if (this.f23042stevsuqkhv.isEmpty()) {
            return;
        }
        this.f23048zdlpuopuiu.zoijcleaow(i13);
        Iterator it = this.f23042stevsuqkhv.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
    }

    private boolean weqkydbzbr() {
        CoordinatorLayout.gxszxtbevo gxszxtbevoVarOpjhrmiecq = opjhrmiecq();
        return gxszxtbevoVarOpjhrmiecq != null && ((ViewGroup.MarginLayoutParams) gxszxtbevoVarOpjhrmiecq).rightMargin > 0;
    }

    private void yzdjzghtvl(View view) {
        int i13 = this.f23049zynmafqrjb == 5 ? 4 : 0;
        if (view.getVisibility() != i13) {
            view.setVisibility(i13);
        }
    }

    private boolean zeieaojujs(float f13) {
        return this.f23048zdlpuopuiu.gtknphoqwx(f13);
    }

    public void ageimvtcrz(final int i13) {
        if (i13 == 1 || i13 == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("STATE_");
            sb3.append(i13 == 1 ? "DRAGGING" : "SETTLING");
            sb3.append(" should not be set externally.");
            throw new IllegalArgumentException(sb3.toString());
        }
        WeakReference weakReference = this.f23030hcddaimhww;
        if (weakReference == null || weakReference.get() == null) {
            fyldjkxazc(i13);
        } else {
            igdgnonuha((View) this.f23030hcddaimhww.get(), new Runnable() { // from class: sa.zoijcleaow
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105856zdlpuopuiu.auzgnhcxok(i13);
                }
            });
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void agtfadlqog() {
        super.agtfadlqog();
        this.f23030hcddaimhww = null;
        this.f23025cdpycssgdh = null;
        this.f23028dsvhmnatus = null;
    }

    b2.ppxfxbqfkf bfopjjpdmp() {
        return this.f23025cdpycssgdh;
    }

    public float czzsidtyhn() {
        return this.f23032iozdgvuglv;
    }

    void fyldjkxazc(int i13) {
        View view;
        if (this.f23049zynmafqrjb == i13) {
            return;
        }
        this.f23049zynmafqrjb = i13;
        if (i13 == 3 || i13 == 5) {
            this.f23033istkbnxepw = i13;
        }
        WeakReference weakReference = this.f23030hcddaimhww;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        yzdjzghtvl(view);
        Iterator it = this.f23042stevsuqkhv.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
        fmlbqenlif();
    }

    boolean grlcpdaxtj(View view, float f13) {
        return this.f23048zdlpuopuiu.agtfadlqog(view, f13);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void gtknphoqwx(CoordinatorLayout.gxszxtbevo gxszxtbevoVar) {
        super.gtknphoqwx(gxszxtbevoVar);
        this.f23030hcddaimhww = null;
        this.f23025cdpycssgdh = null;
        this.f23028dsvhmnatus = null;
    }

    @Override // na.zoijcleaow
    public void iobyxmoadg() {
        lqeggnwhkg lqeggnwhkgVar = this.f23028dsvhmnatus;
        if (lqeggnwhkgVar == null) {
            return;
        }
        lqeggnwhkgVar.gxszxtbevo();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public Parcelable istkbnxepw(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.istkbnxepw(coordinatorLayout, view), this);
    }

    public boolean ixidwrxhsl() {
        return true;
    }

    public void lxfrhoxuzk(int i13) {
        this.f23031hkdspvbjdz = i13;
        crxdokpmqz();
        WeakReference weakReference = this.f23030hcddaimhww;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i13 == -1 || !jhduphickx.tzroggbefp(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public int metgxyhuhe() {
        return this.f23048zdlpuopuiu.wkgbmnqykc();
    }

    int oipsdeybqn() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b2.ppxfxbqfkf ppxfxbqfkfVar;
        if (!mhtqkkgtqm(view)) {
            this.f23045yadqdtsiqt = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            skhdrjzrfn();
        }
        if (this.f23026cllcsxoeiz == null) {
            this.f23026cllcsxoeiz = VelocityTracker.obtain();
        }
        this.f23026cllcsxoeiz.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f23044wypolnanlu = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f23045yadqdtsiqt) {
            this.f23045yadqdtsiqt = false;
            return false;
        }
        return (this.f23045yadqdtsiqt || (ppxfxbqfkfVar = this.f23025cdpycssgdh) == null || !ppxfxbqfkfVar.hkdspvbjdz(motionEvent)) ? false : true;
    }

    int okpsazkaxt() {
        return this.f23039lmojexxdyd;
    }

    @Override // na.zoijcleaow
    public void ppxfxbqfkf(androidx.activity.zoijcleaow zoijcleaowVar) {
        lqeggnwhkg lqeggnwhkgVar = this.f23028dsvhmnatus;
        if (lqeggnwhkgVar == null) {
            return;
        }
        lqeggnwhkgVar.draadjrbmk(zoijcleaowVar, rlfsiqarku());
        ezmngbhpjk();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        if (jhduphickx.iwizpuwonk(coordinatorLayout) && !jhduphickx.iwizpuwonk(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f23030hcddaimhww == null) {
            this.f23030hcddaimhww = new WeakReference(view);
            this.f23028dsvhmnatus = new lqeggnwhkg(view);
            ra.lqeggnwhkg lqeggnwhkgVar = this.f23036jyumaefscl;
            if (lqeggnwhkgVar != null) {
                jhduphickx.weqkydbzbr(view, lqeggnwhkgVar);
                ra.lqeggnwhkg lqeggnwhkgVar2 = this.f23036jyumaefscl;
                float fYggfygwlhe = this.f23038lereixgezr;
                if (fYggfygwlhe == -1.0f) {
                    fYggfygwlhe = jhduphickx.yggfygwlhe(view);
                }
                lqeggnwhkgVar2.sopmlzcsov(fYggfygwlhe);
            } else {
                ColorStateList colorStateList = this.f23034iwizpuwonk;
                if (colorStateList != null) {
                    jhduphickx.lrnfpwlwnk(view, colorStateList);
                }
            }
            yzdjzghtvl(view);
            fmlbqenlif();
            if (jhduphickx.cqumvgiudr(view) == 0) {
                jhduphickx.uawqvzlxes(view, 1);
            }
            jhduphickx(view);
        }
        fiwbwshyhd(view, i13);
        if (this.f23025cdpycssgdh == null) {
            this.f23025cdpycssgdh = b2.ppxfxbqfkf.agtfadlqog(coordinatorLayout, this.f23037kegysxyocb);
        }
        int iNufgyqmvbu = this.f23048zdlpuopuiu.nufgyqmvbu(view);
        coordinatorLayout.ylkuphrtab(view, i13);
        this.f23043wwaezpbzkn = coordinatorLayout.getWidth();
        this.f23047ylkuphrtab = this.f23048zdlpuopuiu.dxjokdxxww(coordinatorLayout);
        this.f23039lmojexxdyd = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f23040pkzmftpjix = marginLayoutParams != null ? this.f23048zdlpuopuiu.iobyxmoadg(marginLayoutParams) : 0;
        jhduphickx.jlmebxxoox(view, ntlheqmsrt(iNufgyqmvbu, view));
        iwxlajgraz(coordinatorLayout);
        Iterator it = this.f23042stevsuqkhv.iterator();
        while (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
        }
        return true;
    }

    int sflfametgt() {
        return this.f23047ylkuphrtab;
    }

    float uwvvkdfqfp() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ikoacuggdj(i13, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, -1, marginLayoutParams.width), ikoacuggdj(i15, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, -1, marginLayoutParams.height));
        return true;
    }

    public void wizcaqwiak(boolean z13) {
        this.f23041pmvmpeiblj = z13;
    }

    @Override // na.zoijcleaow
    public void wkgbmnqykc() {
        lqeggnwhkg lqeggnwhkgVar = this.f23028dsvhmnatus;
        if (lqeggnwhkgVar == null) {
            return;
        }
        androidx.activity.zoijcleaow zoijcleaowVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        if (zoijcleaowVarPpxfxbqfkf == null || Build.VERSION.SDK_INT < 34) {
            ageimvtcrz(5);
        } else {
            this.f23028dsvhmnatus.nufgyqmvbu(zoijcleaowVarPpxfxbqfkf, rlfsiqarku(), new zoijcleaow(), jztzpxfvev());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f23049zynmafqrjb == 1 && actionMasked == 0) {
            return true;
        }
        if (ipoelvxyzq()) {
            this.f23025cdpycssgdh.istkbnxepw(motionEvent);
        }
        if (actionMasked == 0) {
            skhdrjzrfn();
        }
        if (this.f23026cllcsxoeiz == null) {
            this.f23026cllcsxoeiz = VelocityTracker.obtain();
        }
        this.f23026cllcsxoeiz.addMovement(motionEvent);
        if (ipoelvxyzq() && actionMasked == 2 && !this.f23045yadqdtsiqt && lrnfpwlwnk(motionEvent)) {
            this.f23025cdpycssgdh.ppxfxbqfkf(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f23045yadqdtsiqt;
    }

    public View xrmfcynszj() {
        WeakReference weakReference = this.f23035jpowsppfya;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    int ydmasvzmpa(int i13) {
        if (i13 == 3) {
            return metgxyhuhe();
        }
        if (i13 == 5) {
            return this.f23048zdlpuopuiu.eablkybsjg();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i13);
    }

    int yfnezrywwk() {
        return this.f23040pkzmftpjix;
    }

    int zfvoamnweg() {
        return this.f23043wwaezpbzkn;
    }

    @Override // na.zoijcleaow
    public void zoijcleaow(androidx.activity.zoijcleaow zoijcleaowVar) {
        lqeggnwhkg lqeggnwhkgVar = this.f23028dsvhmnatus;
        if (lqeggnwhkgVar == null) {
            return;
        }
        lqeggnwhkgVar.btonecajqb(zoijcleaowVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void zynmafqrjb(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.zoijcleaow() != null) {
            super.zynmafqrjb(coordinatorLayout, view, savedState.zoijcleaow());
        }
        int i13 = savedState.f23050jyumaefscl;
        if (i13 == 1 || i13 == 2) {
            i13 = 5;
        }
        this.f23049zynmafqrjb = i13;
        this.f23033istkbnxepw = i13;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final int f23050jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f23050jyumaefscl = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f23050jyumaefscl);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f23050jyumaefscl = sideSheetBehavior.f23049zynmafqrjb;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23029esjtqupxsv = new ppxfxbqfkf();
        this.f23041pmvmpeiblj = true;
        this.f23049zynmafqrjb = 5;
        this.f23033istkbnxepw = 5;
        this.f23032iozdgvuglv = 0.1f;
        this.f23031hkdspvbjdz = -1;
        this.f23042stevsuqkhv = new LinkedHashSet();
        this.f23037kegysxyocb = new iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draadjrbmk.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.SideSheetBehavior_Layout_backgroundTint)) {
            this.f23034iwizpuwonk = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, draadjrbmk.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f23027cqumvgiudr = gtknphoqwx.eablkybsjg(context, attributeSet, 0, f23023mbcevpiqjq).wflxmlrfwp();
        }
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            lxfrhoxuzk(typedArrayObtainStyledAttributes.getResourceId(draadjrbmk.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        ribwqtqdhb(context);
        this.f23038lereixgezr = typedArrayObtainStyledAttributes.getDimension(draadjrbmk.SideSheetBehavior_Layout_android_elevation, -1.0f);
        wizcaqwiak(typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f23046yggfygwlhe = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
