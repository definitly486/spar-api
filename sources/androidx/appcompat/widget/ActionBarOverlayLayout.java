package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import v1.jhduphickx;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements esjtqupxsv, v1.lmojexxdyd, v1.wwaezpbzkn {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f2988cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private skhdrjzrfn f2989cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private lereixgezr f2990cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final v1.ylkuphrtab f2991crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private skhdrjzrfn f2992dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Drawable f2993esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final Rect f2994hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final Rect f2995hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final Rect f2996iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    boolean f2997istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    ActionBarContainer f2998iwizpuwonk;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final gxszxtbevo f2999jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final Rect f3000jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ContentFrameLayout f3001jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private wkgbmnqykc f3002kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f3003lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Rect f3004lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    ViewPropertyAnimator f3005mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    final AnimatorListenerAdapter f3006ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final Rect f3007pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f3008pmvmpeiblj;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final Runnable f3009sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private skhdrjzrfn f3010stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private OverScroller f3011tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final Runnable f3012ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Rect f3013wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private skhdrjzrfn f3014wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f3015yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f3016yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final Rect f3017ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f3018zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f3019zynmafqrjb;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    static final int[] f2986ribwqtqdhb = {lqeggnwhkg.iobyxmoadg.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private static final skhdrjzrfn f2987vipkmwdibw = new skhdrjzrfn.iobyxmoadg().wkgbmnqykc(j1.wkgbmnqykc.zoijcleaow(0, 1, 0, 1)).iobyxmoadg();

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private static final Rect f2985jhduphickx = new Rect();

    public static class eablkybsjg extends ViewGroup.MarginLayoutParams {
        public eablkybsjg(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public eablkybsjg(int i13, int i14) {
            super(i13, i14);
        }

        public eablkybsjg(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class gxszxtbevo extends View {
        gxszxtbevo(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3005mbcevpiqjq = null;
            actionBarOverlayLayout.f2997istkbnxepw = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3005mbcevpiqjq = null;
            actionBarOverlayLayout.f2997istkbnxepw = false;
        }
    }

    class ppxfxbqfkf implements Runnable {
        ppxfxbqfkf() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.jyumaefscl();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3005mbcevpiqjq = actionBarOverlayLayout.f2998iwizpuwonk.animate().translationY(-ActionBarOverlayLayout.this.f2998iwizpuwonk.getHeight()).setListener(ActionBarOverlayLayout.this.f3006ntlheqmsrt);
        }
    }

    public interface wkgbmnqykc {
        void eablkybsjg();

        void gxszxtbevo();

        void iobyxmoadg();

        void ppxfxbqfkf();

        void wkgbmnqykc(boolean z13);

        void zoijcleaow(int i13);
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.jyumaefscl();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3005mbcevpiqjq = actionBarOverlayLayout.f2998iwizpuwonk.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f3006ntlheqmsrt);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3016yggfygwlhe = 0;
        this.f2996iozdgvuglv = new Rect();
        this.f3004lmojexxdyd = new Rect();
        this.f3013wwaezpbzkn = new Rect();
        this.f3017ylkuphrtab = new Rect();
        this.f3007pkzmftpjix = new Rect();
        this.f2994hcddaimhww = new Rect();
        this.f3000jpowsppfya = new Rect();
        this.f2995hkdspvbjdz = new Rect();
        skhdrjzrfn skhdrjzrfnVar = skhdrjzrfn.f115192zoijcleaow;
        this.f2989cllcsxoeiz = skhdrjzrfnVar;
        this.f2992dsvhmnatus = skhdrjzrfnVar;
        this.f3014wypolnanlu = skhdrjzrfnVar;
        this.f3010stevsuqkhv = skhdrjzrfnVar;
        this.f3006ntlheqmsrt = new iobyxmoadg();
        this.f3012ulzqkzuiru = new zoijcleaow();
        this.f3009sopmlzcsov = new ppxfxbqfkf();
        iwizpuwonk(context);
        this.f2991crxdokpmqz = new v1.ylkuphrtab(this);
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(context);
        this.f2999jlmebxxoox = gxszxtbevoVar;
        addView(gxszxtbevoVar);
    }

    private void esjtqupxsv() {
        jyumaefscl();
        postDelayed(this.f3009sopmlzcsov, 600L);
    }

    private boolean istkbnxepw(float f13) {
        this.f3011tzroggbefp.fling(0, 0, 0, (int) f13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f3011tzroggbefp.getFinalY() > this.f2998iwizpuwonk.getHeight();
    }

    private void iwizpuwonk(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2986ribwqtqdhb);
        this.f3018zdlpuopuiu = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2993esjtqupxsv = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3011tzroggbefp = new OverScroller(context);
    }

    private void lereixgezr() {
        jyumaefscl();
        postDelayed(this.f3012ulzqkzuiru, 600L);
    }

    private void ojitshcjhn() {
        jyumaefscl();
        this.f3009sopmlzcsov.run();
    }

    private boolean oxmwwwfdhm() {
        jhduphickx.gxszxtbevo(this.f2999jlmebxxoox, f2987vipkmwdibw, this.f3017ylkuphrtab);
        return !this.f3017ylkuphrtab.equals(f2985jhduphickx);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean vdvldrhtss(View view, Rect rect, boolean z13, boolean z14, boolean z15, boolean z16) {
        boolean z17;
        eablkybsjg eablkybsjgVar = (eablkybsjg) view.getLayoutParams();
        if (z13) {
            int i13 = ((ViewGroup.MarginLayoutParams) eablkybsjgVar).leftMargin;
            int i14 = rect.left;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) eablkybsjgVar).leftMargin = i14;
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            z17 = false;
        }
        if (z14) {
            int i15 = ((ViewGroup.MarginLayoutParams) eablkybsjgVar).topMargin;
            int i16 = rect.top;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eablkybsjgVar).topMargin = i16;
                z17 = true;
            }
        }
        if (z16) {
            int i17 = ((ViewGroup.MarginLayoutParams) eablkybsjgVar).rightMargin;
            int i18 = rect.right;
            if (i17 != i18) {
                ((ViewGroup.MarginLayoutParams) eablkybsjgVar).rightMargin = i18;
                z17 = true;
            }
        }
        if (z15) {
            int i19 = ((ViewGroup.MarginLayoutParams) eablkybsjgVar).bottomMargin;
            int i23 = rect.bottom;
            if (i19 != i23) {
                ((ViewGroup.MarginLayoutParams) eablkybsjgVar).bottomMargin = i23;
                return true;
            }
        }
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lereixgezr yggfygwlhe(View view) {
        if (view instanceof lereixgezr) {
            return (lereixgezr) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void zynmafqrjb() {
        jyumaefscl();
        this.f3012ulzqkzuiru.run();
    }

    @Override // v1.lmojexxdyd
    public void agtfadlqog(View view, int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            onNestedScroll(view, i13, i14, i15, i16);
        }
    }

    @Override // v1.lmojexxdyd
    public void btonecajqb(View view, int i13) {
        if (i13 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eablkybsjg;
    }

    public boolean cqumvgiudr() {
        return this.f3003lereixgezr;
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public void draadjrbmk() {
        pmvmpeiblj();
        this.f2990cqumvgiudr.vdvldrhtss();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2993esjtqupxsv != null) {
            int bottom = this.f2998iwizpuwonk.getVisibility() == 0 ? (int) (this.f2998iwizpuwonk.getBottom() + this.f2998iwizpuwonk.getTranslationY() + 0.5f) : 0;
            this.f2993esjtqupxsv.setBounds(0, bottom, getWidth(), this.f2993esjtqupxsv.getIntrinsicHeight() + bottom);
            this.f2993esjtqupxsv.draw(canvas);
        }
    }

    @Override // v1.lmojexxdyd
    public void dxjokdxxww(View view, View view2, int i13, int i14) {
        if (i14 == 0) {
            onNestedScrollAccepted(view, view2, i13);
        }
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public boolean eablkybsjg() {
        pmvmpeiblj();
        return this.f2990cqumvgiudr.eablkybsjg();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2998iwizpuwonk;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2991crxdokpmqz.iobyxmoadg();
    }

    public CharSequence getTitle() {
        pmvmpeiblj();
        return this.f2990cqumvgiudr.getTitle();
    }

    @Override // v1.lmojexxdyd
    public void gtknphoqwx(View view, int i13, int i14, int[] iArr, int i15) {
        if (i15 == 0) {
            onNestedPreScroll(view, i13, i14, iArr);
        }
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public void gxszxtbevo() {
        pmvmpeiblj();
        this.f2990cqumvgiudr.gxszxtbevo();
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public boolean iobyxmoadg() {
        pmvmpeiblj();
        return this.f2990cqumvgiudr.iobyxmoadg();
    }

    void jyumaefscl() {
        removeCallbacks(this.f3012ulzqkzuiru);
        removeCallbacks(this.f3009sopmlzcsov);
        ViewPropertyAnimator viewPropertyAnimator = this.f3005mbcevpiqjq;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public eablkybsjg generateDefaultLayoutParams() {
        return new eablkybsjg(-1, -1);
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public boolean lqeggnwhkg() {
        pmvmpeiblj();
        return this.f2990cqumvgiudr.lqeggnwhkg();
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public void nufgyqmvbu(int i13) {
        pmvmpeiblj();
        if (i13 == 2) {
            this.f2990cqumvgiudr.ojitshcjhn();
        } else if (i13 == 5) {
            this.f2990cqumvgiudr.iwizpuwonk();
        } else {
            if (i13 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        pmvmpeiblj();
        skhdrjzrfn skhdrjzrfnVarLereixgezr = skhdrjzrfn.lereixgezr(windowInsets, this);
        boolean zVdvldrhtss = vdvldrhtss(this.f2998iwizpuwonk, new Rect(skhdrjzrfnVarLereixgezr.gtknphoqwx(), skhdrjzrfnVarLereixgezr.wflxmlrfwp(), skhdrjzrfnVarLereixgezr.draadjrbmk(), skhdrjzrfnVarLereixgezr.btonecajqb()), true, true, false, true);
        jhduphickx.gxszxtbevo(this, skhdrjzrfnVarLereixgezr, this.f2996iozdgvuglv);
        Rect rect = this.f2996iozdgvuglv;
        skhdrjzrfn skhdrjzrfnVarOjitshcjhn = skhdrjzrfnVarLereixgezr.ojitshcjhn(rect.left, rect.top, rect.right, rect.bottom);
        this.f2989cllcsxoeiz = skhdrjzrfnVarOjitshcjhn;
        boolean z13 = true;
        if (!this.f2992dsvhmnatus.equals(skhdrjzrfnVarOjitshcjhn)) {
            this.f2992dsvhmnatus = this.f2989cllcsxoeiz;
            zVdvldrhtss = true;
        }
        if (this.f3004lmojexxdyd.equals(this.f2996iozdgvuglv)) {
            z13 = zVdvldrhtss;
        } else {
            this.f3004lmojexxdyd.set(this.f2996iozdgvuglv);
        }
        if (z13) {
            requestLayout();
        }
        return skhdrjzrfnVarLereixgezr.iobyxmoadg().ppxfxbqfkf().zoijcleaow().cqumvgiudr();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        iwizpuwonk(getContext());
        jhduphickx.ydmasvzmpa(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jyumaefscl();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i18 = ((ViewGroup.MarginLayoutParams) eablkybsjgVar).leftMargin + paddingLeft;
                int i19 = ((ViewGroup.MarginLayoutParams) eablkybsjgVar).topMargin + paddingTop;
                childAt.layout(i18, i19, measuredWidth + i18, measuredHeight + i19);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        int measuredHeight;
        pmvmpeiblj();
        measureChildWithMargins(this.f2998iwizpuwonk, i13, 0, i14, 0);
        eablkybsjg eablkybsjgVar = (eablkybsjg) this.f2998iwizpuwonk.getLayoutParams();
        int iMax = Math.max(0, this.f2998iwizpuwonk.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eablkybsjgVar).leftMargin + ((ViewGroup.MarginLayoutParams) eablkybsjgVar).rightMargin);
        int iMax2 = Math.max(0, this.f2998iwizpuwonk.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eablkybsjgVar).topMargin + ((ViewGroup.MarginLayoutParams) eablkybsjgVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2998iwizpuwonk.getMeasuredState());
        boolean z13 = (jhduphickx.jpowsppfya(this) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        if (z13) {
            measuredHeight = this.f3018zdlpuopuiu;
            if (this.f3008pmvmpeiblj && this.f2998iwizpuwonk.getTabContainer() != null) {
                measuredHeight += this.f3018zdlpuopuiu;
            }
        } else {
            measuredHeight = this.f2998iwizpuwonk.getVisibility() != 8 ? this.f2998iwizpuwonk.getMeasuredHeight() : 0;
        }
        this.f3013wwaezpbzkn.set(this.f2996iozdgvuglv);
        this.f3014wypolnanlu = this.f2989cllcsxoeiz;
        if (this.f3003lereixgezr || z13 || !oxmwwwfdhm()) {
            this.f3014wypolnanlu = new skhdrjzrfn.iobyxmoadg(this.f3014wypolnanlu).wkgbmnqykc(j1.wkgbmnqykc.zoijcleaow(this.f3014wypolnanlu.gtknphoqwx(), this.f3014wypolnanlu.wflxmlrfwp() + measuredHeight, this.f3014wypolnanlu.draadjrbmk(), this.f3014wypolnanlu.btonecajqb())).iobyxmoadg();
        } else {
            Rect rect = this.f3013wwaezpbzkn;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f3014wypolnanlu = this.f3014wypolnanlu.ojitshcjhn(0, measuredHeight, 0, 0);
        }
        vdvldrhtss(this.f3001jyumaefscl, this.f3013wwaezpbzkn, true, true, true, true);
        if (!this.f3010stevsuqkhv.equals(this.f3014wypolnanlu)) {
            skhdrjzrfn skhdrjzrfnVar = this.f3014wypolnanlu;
            this.f3010stevsuqkhv = skhdrjzrfnVar;
            jhduphickx.lqeggnwhkg(this.f3001jyumaefscl, skhdrjzrfnVar);
        }
        measureChildWithMargins(this.f3001jyumaefscl, i13, 0, i14, 0);
        eablkybsjg eablkybsjgVar2 = (eablkybsjg) this.f3001jyumaefscl.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3001jyumaefscl.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eablkybsjgVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eablkybsjgVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3001jyumaefscl.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eablkybsjgVar2).topMargin + ((ViewGroup.MarginLayoutParams) eablkybsjgVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3001jyumaefscl.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i13, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i14, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        if (!this.f3019zynmafqrjb || !z13) {
            return false;
        }
        if (istkbnxepw(f14)) {
            ojitshcjhn();
        } else {
            zynmafqrjb();
        }
        this.f2997istkbnxepw = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        int i17 = this.f2988cdpycssgdh + i14;
        this.f2988cdpycssgdh = i17;
        setActionBarHideOffset(i17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i13) {
        this.f2991crxdokpmqz.zoijcleaow(view, view2, i13);
        this.f2988cdpycssgdh = getActionBarHideOffset();
        jyumaefscl();
        wkgbmnqykc wkgbmnqykcVar = this.f3002kegysxyocb;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        if ((i13 & 2) == 0 || this.f2998iwizpuwonk.getVisibility() != 0) {
            return false;
        }
        return this.f3019zynmafqrjb;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f3019zynmafqrjb && !this.f2997istkbnxepw) {
            if (this.f2988cdpycssgdh <= this.f2998iwizpuwonk.getHeight()) {
                lereixgezr();
            } else {
                esjtqupxsv();
            }
        }
        wkgbmnqykc wkgbmnqykcVar = this.f3002kegysxyocb;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.ppxfxbqfkf();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i13) {
        super.onWindowSystemUiVisibilityChanged(i13);
        pmvmpeiblj();
        int i14 = this.f3015yadqdtsiqt ^ i13;
        this.f3015yadqdtsiqt = i13;
        boolean z13 = (i13 & 4) == 0;
        boolean z14 = (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        wkgbmnqykc wkgbmnqykcVar = this.f3002kegysxyocb;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.wkgbmnqykc(!z14);
            if (z13 || !z14) {
                this.f3002kegysxyocb.iobyxmoadg();
            } else {
                this.f3002kegysxyocb.eablkybsjg();
            }
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || this.f3002kegysxyocb == null) {
            return;
        }
        jhduphickx.ydmasvzmpa(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
        this.f3016yggfygwlhe = i13;
        wkgbmnqykc wkgbmnqykcVar = this.f3002kegysxyocb;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow(i13);
        }
    }

    void pmvmpeiblj() {
        if (this.f3001jyumaefscl == null) {
            this.f3001jyumaefscl = (ContentFrameLayout) findViewById(lqeggnwhkg.gxszxtbevo.action_bar_activity_content);
            this.f2998iwizpuwonk = (ActionBarContainer) findViewById(lqeggnwhkg.gxszxtbevo.action_bar_container);
            this.f2990cqumvgiudr = yggfygwlhe(findViewById(lqeggnwhkg.gxszxtbevo.action_bar));
        }
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public boolean ppxfxbqfkf() {
        pmvmpeiblj();
        return this.f2990cqumvgiudr.ppxfxbqfkf();
    }

    @Override // v1.lmojexxdyd
    public boolean rgvfuqvkyq(View view, View view2, int i13, int i14) {
        return i14 == 0 && onStartNestedScroll(view, view2, i13);
    }

    public void setActionBarHideOffset(int i13) {
        jyumaefscl();
        this.f2998iwizpuwonk.setTranslationY(-Math.max(0, Math.min(i13, this.f2998iwizpuwonk.getHeight())));
    }

    public void setActionBarVisibilityCallback(wkgbmnqykc wkgbmnqykcVar) {
        this.f3002kegysxyocb = wkgbmnqykcVar;
        if (getWindowToken() != null) {
            this.f3002kegysxyocb.zoijcleaow(this.f3016yggfygwlhe);
            int i13 = this.f3015yadqdtsiqt;
            if (i13 != 0) {
                onWindowSystemUiVisibilityChanged(i13);
                jhduphickx.ydmasvzmpa(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z13) {
        this.f3008pmvmpeiblj = z13;
    }

    public void setHideOnContentScrollEnabled(boolean z13) {
        if (z13 != this.f3019zynmafqrjb) {
            this.f3019zynmafqrjb = z13;
            if (z13) {
                return;
            }
            jyumaefscl();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i13) {
        pmvmpeiblj();
        this.f2990cqumvgiudr.setIcon(i13);
    }

    public void setLogo(int i13) {
        pmvmpeiblj();
        this.f2990cqumvgiudr.kcexrzcfyt(i13);
    }

    public void setOverlayMode(boolean z13) {
        this.f3003lereixgezr = z13;
    }

    public void setShowingForActionMode(boolean z13) {
    }

    public void setUiOptions(int i13) {
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public void setWindowCallback(Window.Callback callback) {
        pmvmpeiblj();
        this.f2990cqumvgiudr.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public void setWindowTitle(CharSequence charSequence) {
        pmvmpeiblj();
        this.f2990cqumvgiudr.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // v1.wwaezpbzkn
    public void wflxmlrfwp(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        agtfadlqog(view, i13, i14, i15, i16, i17);
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public void wkgbmnqykc(Menu menu, androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVar) {
        pmvmpeiblj();
        this.f2990cqumvgiudr.wkgbmnqykc(menu, iobyxmoadgVar);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public eablkybsjg generateLayoutParams(AttributeSet attributeSet) {
        return new eablkybsjg(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.esjtqupxsv
    public boolean zoijcleaow() {
        pmvmpeiblj();
        return this.f2990cqumvgiudr.zoijcleaow();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new eablkybsjg(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        pmvmpeiblj();
        this.f2990cqumvgiudr.setIcon(drawable);
    }
}
