package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.dxjokdxxww;
import da.gtknphoqwx;
import na.nufgyqmvbu;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private static final int f21981jlmebxxoox = gtknphoqwx.Widget_Design_CollapsingToolbar;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    final com.google.android.material.internal.iobyxmoadg f21982cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final TimeInterpolator f21983cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private View f21984cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f21985crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final TimeInterpolator f21986dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f21987esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f21988hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private long f21989hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f21990iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Rect f21991istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private View f21992iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private ValueAnimator f21993jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ViewGroup f21994jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    int f21995kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f21996lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f21997lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    skhdrjzrfn f21998mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private int f21999ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f22000pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22001pmvmpeiblj;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private int f22002sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private AppBarLayout.gxszxtbevo f22003stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private int f22004tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f22005ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private Drawable f22006wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f22007wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    final ka.iobyxmoadg f22008yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f22009yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    Drawable f22010ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f22011zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f22012zynmafqrjb;

    public interface eablkybsjg extends dxjokdxxww {
    }

    class iobyxmoadg implements pkzmftpjix {
        iobyxmoadg() {
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            return CollapsingToolbarLayout.this.ojitshcjhn(skhdrjzrfnVar);
        }
    }

    private class wkgbmnqykc implements AppBarLayout.gxszxtbevo {
        wkgbmnqykc() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.zoijcleaow
        public void iobyxmoadg(AppBarLayout appBarLayout, int i13) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f21995kegysxyocb = i13;
            skhdrjzrfn skhdrjzrfnVar = collapsingToolbarLayout.f21998mbcevpiqjq;
            int iWflxmlrfwp = skhdrjzrfnVar != null ? skhdrjzrfnVar.wflxmlrfwp() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i14);
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) childAt.getLayoutParams();
                gxszxtbevo gxszxtbevoVarGtknphoqwx = CollapsingToolbarLayout.gtknphoqwx(childAt);
                int i15 = ppxfxbqfkfVar.f22014iobyxmoadg;
                if (i15 == 1) {
                    gxszxtbevoVarGtknphoqwx.gxszxtbevo(o1.iobyxmoadg.zoijcleaow(-i13, 0, CollapsingToolbarLayout.this.dxjokdxxww(childAt)));
                } else if (i15 == 2) {
                    gxszxtbevoVarGtknphoqwx.gxszxtbevo(Math.round((-i13) * ppxfxbqfkfVar.f22015zoijcleaow));
                }
            }
            CollapsingToolbarLayout.this.jyumaefscl();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f22010ylkuphrtab != null && iWflxmlrfwp > 0) {
                jhduphickx.xrmfcynszj(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int iPmvmpeiblj = (height - jhduphickx.pmvmpeiblj(CollapsingToolbarLayout.this)) - iWflxmlrfwp;
            float f13 = iPmvmpeiblj;
            CollapsingToolbarLayout.this.f21982cdpycssgdh.iwxlajgraz(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f13));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f21982cdpycssgdh.zfvoamnweg(collapsingToolbarLayout3.f21995kegysxyocb + iPmvmpeiblj);
            CollapsingToolbarLayout.this.f21982cdpycssgdh.uawqvzlxes(Math.abs(i13) / f13);
        }
    }

    class zoijcleaow implements ValueAnimator.AnimatorUpdateListener {
        zoijcleaow() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.collapsingToolbarLayoutStyle);
    }

    private boolean agtfadlqog(View view) {
        View view2 = this.f21992iwizpuwonk;
        if (view2 == null || view2 == this) {
            if (view != this.f21994jyumaefscl) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    private static CharSequence btonecajqb(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    private void cqumvgiudr() {
        if (this.f21994jyumaefscl != null && this.f21990iozdgvuglv && TextUtils.isEmpty(this.f21982cdpycssgdh.dsvhmnatus())) {
            setTitle(btonecajqb(this.f21994jyumaefscl));
        }
    }

    private boolean draadjrbmk() {
        return this.f22004tzroggbefp == 1;
    }

    private View eablkybsjg(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListLqeggnwhkg = ia.iobyxmoadg.lqeggnwhkg(getContext(), da.zoijcleaow.colorSurfaceContainer);
        if (colorStateListLqeggnwhkg != null) {
            return colorStateListLqeggnwhkg.getDefaultColor();
        }
        return this.f22008yadqdtsiqt.wkgbmnqykc(getResources().getDimension(da.wkgbmnqykc.design_appbar_elevation));
    }

    static gxszxtbevo gtknphoqwx(View view) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getTag(da.gxszxtbevo.view_offset_helper);
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(view);
        view.setTag(da.gxszxtbevo.view_offset_helper, gxszxtbevoVar2);
        return gxszxtbevoVar2;
    }

    private void iobyxmoadg(int i13) {
        wkgbmnqykc();
        ValueAnimator valueAnimator = this.f21993jpowsppfya;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f21993jpowsppfya = valueAnimator2;
            valueAnimator2.setInterpolator(i13 > this.f22000pkzmftpjix ? this.f21983cllcsxoeiz : this.f21986dsvhmnatus);
            this.f21993jpowsppfya.addUpdateListener(new zoijcleaow());
        } else if (valueAnimator.isRunning()) {
            this.f21993jpowsppfya.cancel();
        }
        this.f21993jpowsppfya.setDuration(this.f21989hkdspvbjdz);
        this.f21993jpowsppfya.setIntValues(this.f22000pkzmftpjix, i13);
        this.f21993jpowsppfya.start();
    }

    private void iwizpuwonk(int i13, int i14, int i15, int i16, boolean z13) {
        View view;
        if (!this.f21990iozdgvuglv || (view = this.f21984cqumvgiudr) == null) {
            return;
        }
        boolean z14 = jhduphickx.kegysxyocb(view) && this.f21984cqumvgiudr.getVisibility() == 0;
        this.f21997lmojexxdyd = z14;
        if (z14 || z13) {
            boolean z15 = jhduphickx.lereixgezr(this) == 1;
            vdvldrhtss(z15);
            this.f21982cdpycssgdh.oipsdeybqn(z15 ? this.f22001pmvmpeiblj : this.f21987esjtqupxsv, this.f21991istkbnxepw.top + this.f21996lereixgezr, (i15 - i13) - (z15 ? this.f21987esjtqupxsv : this.f22001pmvmpeiblj), (i16 - i14) - this.f22012zynmafqrjb);
            this.f21982cdpycssgdh.jhduphickx(z13);
        }
    }

    private void kcexrzcfyt(Drawable drawable, int i13, int i14) {
        zdlpuopuiu(drawable, this.f21994jyumaefscl, i13, i14);
    }

    private static int nufgyqmvbu(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void oxmwwwfdhm() {
        setContentDescription(getTitle());
    }

    private void ppxfxbqfkf(AppBarLayout appBarLayout) {
        if (draadjrbmk()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void vdvldrhtss(boolean z13) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f21992iwizpuwonk;
        if (view == null) {
            view = this.f21994jyumaefscl;
        }
        int iDxjokdxxww = dxjokdxxww(view);
        com.google.android.material.internal.zoijcleaow.iobyxmoadg(this, this.f21984cqumvgiudr, this.f21991istkbnxepw);
        ViewGroup viewGroup = this.f21994jyumaefscl;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        com.google.android.material.internal.iobyxmoadg iobyxmoadgVar = this.f21982cdpycssgdh;
        Rect rect = this.f21991istkbnxepw;
        int i13 = rect.left + (z13 ? titleMarginEnd : titleMarginStart);
        int i14 = rect.top + iDxjokdxxww + titleMarginTop;
        int i15 = rect.right;
        if (!z13) {
            titleMarginStart = titleMarginEnd;
        }
        iobyxmoadgVar.jztzpxfvev(i13, i14, i15 - titleMarginStart, (rect.bottom + iDxjokdxxww) - titleMarginBottom);
    }

    private static boolean wflxmlrfwp(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private void wkgbmnqykc() {
        if (this.f22011zdlpuopuiu) {
            ViewGroup viewGroup = null;
            this.f21994jyumaefscl = null;
            this.f21992iwizpuwonk = null;
            int i13 = this.f22009yggfygwlhe;
            if (i13 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i13);
                this.f21994jyumaefscl = viewGroup2;
                if (viewGroup2 != null) {
                    this.f21992iwizpuwonk = eablkybsjg(viewGroup2);
                }
            }
            if (this.f21994jyumaefscl == null) {
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (wflxmlrfwp(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f21994jyumaefscl = viewGroup;
            }
            yggfygwlhe();
            this.f22011zdlpuopuiu = false;
        }
    }

    private void yggfygwlhe() {
        View view;
        if (!this.f21990iozdgvuglv && (view = this.f21984cqumvgiudr) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f21984cqumvgiudr);
            }
        }
        if (!this.f21990iozdgvuglv || this.f21994jyumaefscl == null) {
            return;
        }
        if (this.f21984cqumvgiudr == null) {
            this.f21984cqumvgiudr = new View(getContext());
        }
        if (this.f21984cqumvgiudr.getParent() == null) {
            this.f21994jyumaefscl.addView(this.f21984cqumvgiudr, -1, -1);
        }
    }

    private void zdlpuopuiu(Drawable drawable, View view, int i13, int i14) {
        if (draadjrbmk() && view != null && this.f21990iozdgvuglv) {
            i14 = view.getBottom();
        }
        drawable.setBounds(0, 0, i13, i14);
    }

    private TextUtils.TruncateAt zoijcleaow(int i13) {
        if (i13 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i13 != 1) {
            return i13 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ppxfxbqfkf;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        wkgbmnqykc();
        if (this.f21994jyumaefscl == null && (drawable = this.f22006wwaezpbzkn) != null && this.f22000pkzmftpjix > 0) {
            drawable.mutate().setAlpha(this.f22000pkzmftpjix);
            this.f22006wwaezpbzkn.draw(canvas);
        }
        if (this.f21990iozdgvuglv && this.f21997lmojexxdyd) {
            if (this.f21994jyumaefscl == null || this.f22006wwaezpbzkn == null || this.f22000pkzmftpjix <= 0 || !draadjrbmk() || this.f21982cdpycssgdh.iozdgvuglv() >= this.f21982cdpycssgdh.lmojexxdyd()) {
                this.f21982cdpycssgdh.draadjrbmk(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f22006wwaezpbzkn.getBounds(), Region.Op.DIFFERENCE);
                this.f21982cdpycssgdh.draadjrbmk(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f22010ylkuphrtab == null || this.f22000pkzmftpjix <= 0) {
            return;
        }
        skhdrjzrfn skhdrjzrfnVar = this.f21998mbcevpiqjq;
        int iWflxmlrfwp = skhdrjzrfnVar != null ? skhdrjzrfnVar.wflxmlrfwp() : 0;
        if (iWflxmlrfwp > 0) {
            this.f22010ylkuphrtab.setBounds(0, -this.f21995kegysxyocb, getWidth(), iWflxmlrfwp - this.f21995kegysxyocb);
            this.f22010ylkuphrtab.mutate().setAlpha(this.f22000pkzmftpjix);
            this.f22010ylkuphrtab.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j13) {
        boolean z13;
        if (this.f22006wwaezpbzkn == null || this.f22000pkzmftpjix <= 0 || !agtfadlqog(view)) {
            z13 = false;
        } else {
            zdlpuopuiu(this.f22006wwaezpbzkn, view, getWidth(), getHeight());
            this.f22006wwaezpbzkn.mutate().setAlpha(this.f22000pkzmftpjix);
            this.f22006wwaezpbzkn.draw(canvas);
            z13 = true;
        }
        return super.drawChild(canvas, view, j13) || z13;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f22010ylkuphrtab;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f22006wwaezpbzkn;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.iobyxmoadg iobyxmoadgVar = this.f21982cdpycssgdh;
        if (iobyxmoadgVar != null) {
            state |= iobyxmoadgVar.ageimvtcrz(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    final int dxjokdxxww(View view) {
        return ((getHeight() - gtknphoqwx(view).zoijcleaow()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((ppxfxbqfkf) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.f21982cdpycssgdh.vdvldrhtss();
    }

    public float getCollapsedTitleTextSize() {
        return this.f21982cdpycssgdh.yggfygwlhe();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f21982cdpycssgdh.jyumaefscl();
    }

    public Drawable getContentScrim() {
        return this.f22006wwaezpbzkn;
    }

    public int getExpandedTitleGravity() {
        return this.f21982cdpycssgdh.zynmafqrjb();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f22012zynmafqrjb;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f22001pmvmpeiblj;
    }

    public int getExpandedTitleMarginStart() {
        return this.f21987esjtqupxsv;
    }

    public int getExpandedTitleMarginTop() {
        return this.f21996lereixgezr;
    }

    public float getExpandedTitleTextSize() {
        return this.f21982cdpycssgdh.cdpycssgdh();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f21982cdpycssgdh.yadqdtsiqt();
    }

    public int getHyphenationFrequency() {
        return this.f21982cdpycssgdh.wwaezpbzkn();
    }

    public int getLineCount() {
        return this.f21982cdpycssgdh.ylkuphrtab();
    }

    public float getLineSpacingAdd() {
        return this.f21982cdpycssgdh.pkzmftpjix();
    }

    public float getLineSpacingMultiplier() {
        return this.f21982cdpycssgdh.hcddaimhww();
    }

    public int getMaxLines() {
        return this.f21982cdpycssgdh.jpowsppfya();
    }

    int getScrimAlpha() {
        return this.f22000pkzmftpjix;
    }

    public long getScrimAnimationDuration() {
        return this.f21989hkdspvbjdz;
    }

    public int getScrimVisibleHeightTrigger() {
        int i13 = this.f22007wypolnanlu;
        if (i13 >= 0) {
            return i13 + this.f21999ntlheqmsrt + this.f22002sopmlzcsov;
        }
        skhdrjzrfn skhdrjzrfnVar = this.f21998mbcevpiqjq;
        int iWflxmlrfwp = skhdrjzrfnVar != null ? skhdrjzrfnVar.wflxmlrfwp() : 0;
        int iPmvmpeiblj = jhduphickx.pmvmpeiblj(this);
        return iPmvmpeiblj > 0 ? Math.min((iPmvmpeiblj * 2) + iWflxmlrfwp, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f22010ylkuphrtab;
    }

    public CharSequence getTitle() {
        if (this.f21990iozdgvuglv) {
            return this.f21982cdpycssgdh.dsvhmnatus();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f22004tzroggbefp;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f21982cdpycssgdh.cllcsxoeiz();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f21982cdpycssgdh.kegysxyocb();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf generateDefaultLayoutParams() {
        return new ppxfxbqfkf(-1, -1);
    }

    final void jyumaefscl() {
        if (this.f22006wwaezpbzkn == null && this.f22010ylkuphrtab == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f21995kegysxyocb < getScrimVisibleHeightTrigger());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ppxfxbqfkf(layoutParams);
    }

    skhdrjzrfn ojitshcjhn(skhdrjzrfn skhdrjzrfnVar) {
        skhdrjzrfn skhdrjzrfnVar2 = jhduphickx.iwizpuwonk(this) ? skhdrjzrfnVar : null;
        if (!u1.zoijcleaow.iobyxmoadg(this.f21998mbcevpiqjq, skhdrjzrfnVar2)) {
            this.f21998mbcevpiqjq = skhdrjzrfnVar2;
            requestLayout();
        }
        return skhdrjzrfnVar.ppxfxbqfkf();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            ppxfxbqfkf(appBarLayout);
            jhduphickx.roivzttewh(this, jhduphickx.iwizpuwonk(appBarLayout));
            if (this.f22003stevsuqkhv == null) {
                this.f22003stevsuqkhv = new wkgbmnqykc();
            }
            appBarLayout.wkgbmnqykc(this.f22003stevsuqkhv);
            jhduphickx.ydmasvzmpa(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21982cdpycssgdh.jlmebxxoox(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.gxszxtbevo gxszxtbevoVar = this.f22003stevsuqkhv;
        if (gxszxtbevoVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).cqumvgiudr(gxszxtbevoVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        skhdrjzrfn skhdrjzrfnVar = this.f21998mbcevpiqjq;
        if (skhdrjzrfnVar != null) {
            int iWflxmlrfwp = skhdrjzrfnVar.wflxmlrfwp();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                if (!jhduphickx.iwizpuwonk(childAt) && childAt.getTop() < iWflxmlrfwp) {
                    jhduphickx.ribwqtqdhb(childAt, iWflxmlrfwp);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            gtknphoqwx(getChildAt(i18)).wkgbmnqykc();
        }
        iwizpuwonk(i13, i14, i15, i16, false);
        cqumvgiudr();
        jyumaefscl();
        int childCount3 = getChildCount();
        for (int i19 = 0; i19 < childCount3; i19++) {
            gtknphoqwx(getChildAt(i19)).iobyxmoadg();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        wkgbmnqykc();
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        skhdrjzrfn skhdrjzrfnVar = this.f21998mbcevpiqjq;
        int iWflxmlrfwp = skhdrjzrfnVar != null ? skhdrjzrfnVar.wflxmlrfwp() : 0;
        if ((mode == 0 || this.f22005ulzqkzuiru) && iWflxmlrfwp > 0) {
            this.f21999ntlheqmsrt = iWflxmlrfwp;
            super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iWflxmlrfwp, 1073741824));
        }
        if (this.f21985crxdokpmqz && this.f21982cdpycssgdh.jpowsppfya() > 1) {
            cqumvgiudr();
            iwizpuwonk(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iLereixgezr = this.f21982cdpycssgdh.lereixgezr();
            if (iLereixgezr > 1) {
                this.f22002sopmlzcsov = Math.round(this.f21982cdpycssgdh.pmvmpeiblj()) * (iLereixgezr - 1);
                super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f22002sopmlzcsov, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f21994jyumaefscl;
        if (viewGroup != null) {
            View view = this.f21992iwizpuwonk;
            if (view == null || view == this) {
                setMinimumHeight(nufgyqmvbu(viewGroup));
            } else {
                setMinimumHeight(nufgyqmvbu(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        Drawable drawable = this.f22006wwaezpbzkn;
        if (drawable != null) {
            kcexrzcfyt(drawable, i13, i14);
        }
    }

    public void rgvfuqvkyq(boolean z13, boolean z14) {
        if (this.f21988hcddaimhww != z13) {
            if (z14) {
                iobyxmoadg(z13 ? 255 : 0);
            } else {
                setScrimAlpha(z13 ? 255 : 0);
            }
            this.f21988hcddaimhww = z13;
        }
    }

    public void setCollapsedTitleGravity(int i13) {
        this.f21982cdpycssgdh.uwvvkdfqfp(i13);
    }

    public void setCollapsedTitleTextAppearance(int i13) {
        this.f21982cdpycssgdh.metgxyhuhe(i13);
    }

    public void setCollapsedTitleTextColor(int i13) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i13));
    }

    public void setCollapsedTitleTextSize(float f13) {
        this.f21982cdpycssgdh.yfnezrywwk(f13);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f21982cdpycssgdh.ydmasvzmpa(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f22006wwaezpbzkn;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f22006wwaezpbzkn = drawableMutate;
            if (drawableMutate != null) {
                kcexrzcfyt(drawableMutate, getWidth(), getHeight());
                this.f22006wwaezpbzkn.setCallback(this);
                this.f22006wwaezpbzkn.setAlpha(this.f22000pkzmftpjix);
            }
            jhduphickx.xrmfcynszj(this);
        }
    }

    public void setContentScrimColor(int i13) {
        setContentScrim(new ColorDrawable(i13));
    }

    public void setContentScrimResource(int i13) {
        setContentScrim(androidx.core.content.iobyxmoadg.getDrawable(getContext(), i13));
    }

    public void setExpandedTitleColor(int i13) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i13));
    }

    public void setExpandedTitleGravity(int i13) {
        this.f21982cdpycssgdh.zeieaojujs(i13);
    }

    public void setExpandedTitleMarginBottom(int i13) {
        this.f22012zynmafqrjb = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i13) {
        this.f22001pmvmpeiblj = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i13) {
        this.f21987esjtqupxsv = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i13) {
        this.f21996lereixgezr = i13;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i13) {
        this.f21982cdpycssgdh.iyctptxqzt(i13);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f21982cdpycssgdh.lrnfpwlwnk(colorStateList);
    }

    public void setExpandedTitleTextSize(float f13) {
        this.f21982cdpycssgdh.nuxfzjnpeb(f13);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f21982cdpycssgdh.tbqsvytpvh(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z13) {
        this.f21985crxdokpmqz = z13;
    }

    public void setForceApplySystemWindowInsetTop(boolean z13) {
        this.f22005ulzqkzuiru = z13;
    }

    public void setHyphenationFrequency(int i13) {
        this.f21982cdpycssgdh.dvvnrvtcbc(i13);
    }

    public void setLineSpacingAdd(float f13) {
        this.f21982cdpycssgdh.igdgnonuha(f13);
    }

    public void setLineSpacingMultiplier(float f13) {
        this.f21982cdpycssgdh.lxfrhoxuzk(f13);
    }

    public void setMaxLines(int i13) {
        this.f21982cdpycssgdh.wizcaqwiak(i13);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z13) {
        this.f21982cdpycssgdh.fiwbwshyhd(z13);
    }

    void setScrimAlpha(int i13) {
        ViewGroup viewGroup;
        if (i13 != this.f22000pkzmftpjix) {
            if (this.f22006wwaezpbzkn != null && (viewGroup = this.f21994jyumaefscl) != null) {
                jhduphickx.xrmfcynszj(viewGroup);
            }
            this.f22000pkzmftpjix = i13;
            jhduphickx.xrmfcynszj(this);
        }
    }

    public void setScrimAnimationDuration(long j13) {
        this.f21989hkdspvbjdz = j13;
    }

    public void setScrimVisibleHeightTrigger(int i13) {
        if (this.f22007wypolnanlu != i13) {
            this.f22007wypolnanlu = i13;
            jyumaefscl();
        }
    }

    public void setScrimsShown(boolean z13) {
        rgvfuqvkyq(z13, jhduphickx.tzroggbefp(this) && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(eablkybsjg eablkybsjgVar) {
        this.f21982cdpycssgdh.fyldjkxazc(eablkybsjgVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f22010ylkuphrtab;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f22010ylkuphrtab = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f22010ylkuphrtab.setState(getDrawableState());
                }
                k1.iobyxmoadg.wflxmlrfwp(this.f22010ylkuphrtab, jhduphickx.lereixgezr(this));
                this.f22010ylkuphrtab.setVisible(getVisibility() == 0, false);
                this.f22010ylkuphrtab.setCallback(this);
                this.f22010ylkuphrtab.setAlpha(this.f22000pkzmftpjix);
            }
            jhduphickx.xrmfcynszj(this);
        }
    }

    public void setStatusBarScrimColor(int i13) {
        setStatusBarScrim(new ColorDrawable(i13));
    }

    public void setStatusBarScrimResource(int i13) {
        setStatusBarScrim(androidx.core.content.iobyxmoadg.getDrawable(getContext(), i13));
    }

    public void setTitle(CharSequence charSequence) {
        this.f21982cdpycssgdh.ipoelvxyzq(charSequence);
        oxmwwwfdhm();
    }

    public void setTitleCollapseMode(int i13) {
        this.f22004tzroggbefp = i13;
        boolean zDraadjrbmk = draadjrbmk();
        this.f21982cdpycssgdh.auzgnhcxok(zDraadjrbmk);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ppxfxbqfkf((AppBarLayout) parent);
        }
        if (zDraadjrbmk && this.f22006wwaezpbzkn == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f21982cdpycssgdh.mhtqkkgtqm(truncateAt);
    }

    public void setTitleEnabled(boolean z13) {
        if (z13 != this.f21990iozdgvuglv) {
            this.f21990iozdgvuglv = z13;
            oxmwwwfdhm();
            yggfygwlhe();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f21982cdpycssgdh.hszhottldk(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f22010ylkuphrtab;
        if (drawable != null && drawable.isVisible() != z13) {
            this.f22010ylkuphrtab.setVisible(z13, false);
        }
        Drawable drawable2 = this.f22006wwaezpbzkn;
        if (drawable2 == null || drawable2.isVisible() == z13) {
            return;
        }
        this.f22006wwaezpbzkn.setVisible(z13, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22006wwaezpbzkn || drawable == this.f22010ylkuphrtab;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f21981jlmebxxoox;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f22011zdlpuopuiu = true;
        this.f21991istkbnxepw = new Rect();
        this.f22007wypolnanlu = -1;
        this.f21999ntlheqmsrt = 0;
        this.f22002sopmlzcsov = 0;
        Context context2 = getContext();
        com.google.android.material.internal.iobyxmoadg iobyxmoadgVar = new com.google.android.material.internal.iobyxmoadg(this);
        this.f21982cdpycssgdh = iobyxmoadgVar;
        iobyxmoadgVar.grlcpdaxtj(ea.iobyxmoadg.f31019eablkybsjg);
        iobyxmoadgVar.fiwbwshyhd(false);
        this.f22008yadqdtsiqt = new ka.iobyxmoadg(context2);
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.CollapsingToolbarLayout, i13, i14, new int[0]);
        iobyxmoadgVar.zeieaojujs(typedArrayDxjokdxxww.getInt(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        iobyxmoadgVar.uwvvkdfqfp(typedArrayDxjokdxxww.getInt(da.draadjrbmk.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f22012zynmafqrjb = dimensionPixelSize;
        this.f22001pmvmpeiblj = dimensionPixelSize;
        this.f21996lereixgezr = dimensionPixelSize;
        this.f21987esjtqupxsv = dimensionPixelSize;
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f21987esjtqupxsv = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f22001pmvmpeiblj = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f21996lereixgezr = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f22012zynmafqrjb = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f21990iozdgvuglv = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayDxjokdxxww.getText(da.draadjrbmk.CollapsingToolbarLayout_title));
        iobyxmoadgVar.iyctptxqzt(gtknphoqwx.TextAppearance_Design_CollapsingToolbar_Expanded);
        iobyxmoadgVar.metgxyhuhe(lqeggnwhkg.dxjokdxxww.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            iobyxmoadgVar.iyctptxqzt(typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            iobyxmoadgVar.metgxyhuhe(typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(zoijcleaow(typedArrayDxjokdxxww.getInt(da.draadjrbmk.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_expandedTitleTextColor)) {
            iobyxmoadgVar.lrnfpwlwnk(oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            iobyxmoadgVar.czzsidtyhn(oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.f22007wypolnanlu = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_maxLines)) {
            iobyxmoadgVar.wizcaqwiak(typedArrayDxjokdxxww.getInt(da.draadjrbmk.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.CollapsingToolbarLayout_titlePositionInterpolator)) {
            iobyxmoadgVar.hszhottldk(AnimationUtils.loadInterpolator(context2, typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.f21989hkdspvbjdz = typedArrayDxjokdxxww.getInt(da.draadjrbmk.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.f21983cllcsxoeiz = nufgyqmvbu.lqeggnwhkg(context2, da.zoijcleaow.motionEasingStandardInterpolator, ea.iobyxmoadg.f31021ppxfxbqfkf);
        this.f21986dsvhmnatus = nufgyqmvbu.lqeggnwhkg(context2, da.zoijcleaow.motionEasingStandardInterpolator, ea.iobyxmoadg.f31022wkgbmnqykc);
        setContentScrim(typedArrayDxjokdxxww.getDrawable(da.draadjrbmk.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayDxjokdxxww.getDrawable(da.draadjrbmk.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayDxjokdxxww.getInt(da.draadjrbmk.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f22009yggfygwlhe = typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.CollapsingToolbarLayout_toolbarId, -1);
        this.f22005ulzqkzuiru = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.f21985crxdokpmqz = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayDxjokdxxww.recycle();
        setWillNotDraw(false);
        jhduphickx.igdgnonuha(this, new iobyxmoadg());
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f21982cdpycssgdh.czzsidtyhn(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ppxfxbqfkf(getContext(), attributeSet);
    }

    public static class ppxfxbqfkf extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f22014iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f22015zoijcleaow;

        public ppxfxbqfkf(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22014iobyxmoadg = 0;
            this.f22015zoijcleaow = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.CollapsingToolbarLayout_Layout);
            this.f22014iobyxmoadg = typedArrayObtainStyledAttributes.getInt(da.draadjrbmk.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            iobyxmoadg(typedArrayObtainStyledAttributes.getFloat(da.draadjrbmk.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public void iobyxmoadg(float f13) {
            this.f22015zoijcleaow = f13;
        }

        public ppxfxbqfkf(int i13, int i14) {
            super(i13, i14);
            this.f22014iobyxmoadg = 0;
            this.f22015zoijcleaow = 0.5f;
        }

        public ppxfxbqfkf(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22014iobyxmoadg = 0;
            this.f22015zoijcleaow = 0.5f;
        }
    }
}
