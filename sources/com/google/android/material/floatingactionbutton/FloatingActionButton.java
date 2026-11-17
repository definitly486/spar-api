package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.draadjrbmk;
import androidx.appcompat.widget.nufgyqmvbu;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ojitshcjhn;
import com.google.android.material.internal.rgvfuqvkyq;
import com.google.android.material.stateful.ExtendableSavedState;
import da.gtknphoqwx;
import da.wkgbmnqykc;
import ea.gxszxtbevo;
import java.util.List;
import ra.agtfadlqog;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends rgvfuqvkyq implements la.iobyxmoadg, agtfadlqog, CoordinatorLayout.zoijcleaow {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final int f22737hcddaimhww = gtknphoqwx.Widget_Design_FloatingActionButton;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f22738cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private PorterDuff.Mode f22739cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ColorStateList f22740esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    final Rect f22741iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f22742istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ColorStateList f22743iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private PorterDuff.Mode f22744jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f22745lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Rect f22746lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.zoijcleaow f22747pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22748pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final draadjrbmk f22749wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    boolean f22750yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ColorStateList f22751yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final la.zoijcleaow f22752ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f22753zynmafqrjb;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ void gtknphoqwx(CoordinatorLayout.gxszxtbevo gxszxtbevoVar) {
            super.gtknphoqwx(gxszxtbevoVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: hkdspvbjdz */
        public /* bridge */ /* synthetic */ boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i13) {
            return super.rgvfuqvkyq(coordinatorLayout, floatingActionButton, i13);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: jpowsppfya */
        public /* bridge */ /* synthetic */ boolean draadjrbmk(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.draadjrbmk(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: ylkuphrtab */
        public /* bridge */ /* synthetic */ boolean gxszxtbevo(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.gxszxtbevo(coordinatorLayout, floatingActionButton, rect);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class iobyxmoadg {
    }

    private class zoijcleaow implements qa.zoijcleaow {
        zoijcleaow() {
        }

        @Override // qa.zoijcleaow
        public void iobyxmoadg(int i13, int i14, int i15, int i16) {
            FloatingActionButton.this.f22741iozdgvuglv.set(i13, i14, i15, i16);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i13 + floatingActionButton.f22742istkbnxepw, i14 + FloatingActionButton.this.f22742istkbnxepw, i15 + FloatingActionButton.this.f22742istkbnxepw, i16 + FloatingActionButton.this.f22742istkbnxepw);
        }

        @Override // qa.zoijcleaow
        public void ppxfxbqfkf(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // qa.zoijcleaow
        public boolean zoijcleaow() {
            return FloatingActionButton.this.f22750yadqdtsiqt;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.floatingActionButtonStyle);
    }

    private void btonecajqb(Rect rect) {
        int i13 = rect.left;
        Rect rect2 = this.f22741iozdgvuglv;
        rect.left = i13 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private com.google.android.material.floatingactionbutton.zoijcleaow eablkybsjg() {
        return new ppxfxbqfkf(this, new zoijcleaow());
    }

    private com.google.android.material.floatingactionbutton.zoijcleaow getImpl() {
        if (this.f22747pkzmftpjix == null) {
            this.f22747pkzmftpjix = eablkybsjg();
        }
        return this.f22747pkzmftpjix;
    }

    private void gtknphoqwx() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f22743iwizpuwonk;
        if (colorStateList == null) {
            k1.iobyxmoadg.ppxfxbqfkf(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f22739cqumvgiudr;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(nufgyqmvbu.eablkybsjg(colorForState, mode));
    }

    private int lqeggnwhkg(int i13) {
        int i14 = this.f22753zynmafqrjb;
        if (i14 != 0) {
            return i14;
        }
        Resources resources = getResources();
        if (i13 != -1) {
            return i13 != 1 ? resources.getDimensionPixelSize(wkgbmnqykc.design_fab_size_normal) : resources.getDimensionPixelSize(wkgbmnqykc.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? lqeggnwhkg(1) : lqeggnwhkg(0);
    }

    private void nufgyqmvbu(Rect rect) {
        gxszxtbevo(rect);
        int i13 = -this.f22747pkzmftpjix.kcexrzcfyt();
        rect.inset(i13, i13);
    }

    private com.google.android.material.floatingactionbutton.zoijcleaow.gtknphoqwx wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
        return null;
    }

    void draadjrbmk(iobyxmoadg iobyxmoadgVar, boolean z13) {
        getImpl().ribwqtqdhb(wflxmlrfwp(iobyxmoadgVar), z13);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().zynmafqrjb(getDrawableState());
    }

    void dxjokdxxww(iobyxmoadg iobyxmoadgVar, boolean z13) {
        getImpl().zdlpuopuiu(wflxmlrfwp(iobyxmoadgVar), z13);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f22751yggfygwlhe;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f22744jyumaefscl;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zoijcleaow
    public CoordinatorLayout.ppxfxbqfkf getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().btonecajqb();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().wflxmlrfwp();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().rgvfuqvkyq();
    }

    public Drawable getContentBackground() {
        return getImpl().dxjokdxxww();
    }

    public int getCustomSize() {
        return this.f22753zynmafqrjb;
    }

    public int getExpandedComponentIdHint() {
        return this.f22752ylkuphrtab.zoijcleaow();
    }

    public gxszxtbevo getHideMotionSpec() {
        return getImpl().draadjrbmk();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f22740esjtqupxsv;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f22740esjtqupxsv;
    }

    public ra.gtknphoqwx getShapeAppearanceModel() {
        return (ra.gtknphoqwx) u1.nufgyqmvbu.gxszxtbevo(getImpl().vdvldrhtss());
    }

    public gxszxtbevo getShowMotionSpec() {
        return getImpl().oxmwwwfdhm();
    }

    public int getSize() {
        return this.f22748pmvmpeiblj;
    }

    int getSizeDimension() {
        return lqeggnwhkg(this.f22748pmvmpeiblj);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f22743iwizpuwonk;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f22739cqumvgiudr;
    }

    public boolean getUseCompatPadding() {
        return this.f22750yadqdtsiqt;
    }

    public void gxszxtbevo(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        btonecajqb(rect);
    }

    @Override // la.iobyxmoadg
    public boolean iobyxmoadg() {
        return this.f22752ylkuphrtab.ppxfxbqfkf();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().cqumvgiudr();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().esjtqupxsv();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().pmvmpeiblj();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i13, int i14) {
        int sizeDimension = getSizeDimension();
        this.f22742istkbnxepw = (sizeDimension - this.f22738cdpycssgdh) / 2;
        getImpl().ikoacuggdj();
        int iMin = Math.min(View.resolveSize(sizeDimension, i13), View.resolveSize(sizeDimension, i14));
        Rect rect = this.f22741iozdgvuglv;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.zoijcleaow());
        this.f22752ylkuphrtab.wkgbmnqykc((Bundle) u1.nufgyqmvbu.gxszxtbevo((Bundle) extendableSavedState.f23094jyumaefscl.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f23094jyumaefscl.put("expandableWidgetHelper", this.f22752ylkuphrtab.eablkybsjg());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            nufgyqmvbu(this.f22746lmojexxdyd);
            if (!this.f22746lmojexxdyd.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f22751yggfygwlhe != colorStateList) {
            this.f22751yggfygwlhe = colorStateList;
            getImpl().ylkuphrtab(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f22744jyumaefscl != mode) {
            this.f22744jyumaefscl = mode;
            getImpl().pkzmftpjix(mode);
        }
    }

    public void setCompatElevation(float f13) {
        getImpl().hcddaimhww(f13);
    }

    public void setCompatElevationResource(int i13) {
        setCompatElevation(getResources().getDimension(i13));
    }

    public void setCompatHoveredFocusedTranslationZ(float f13) {
        getImpl().cllcsxoeiz(f13);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i13) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i13));
    }

    public void setCompatPressedTranslationZ(float f13) {
        getImpl().kegysxyocb(f13);
    }

    public void setCompatPressedTranslationZResource(int i13) {
        setCompatPressedTranslationZ(getResources().getDimension(i13));
    }

    public void setCustomSize(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i13 != this.f22753zynmafqrjb) {
            this.f22753zynmafqrjb = i13;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        getImpl().okpsazkaxt(f13);
    }

    public void setEnsureMinTouchTargetSize(boolean z13) {
        if (z13 != getImpl().gtknphoqwx()) {
            getImpl().jpowsppfya(z13);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i13) {
        this.f22752ylkuphrtab.gxszxtbevo(i13);
    }

    public void setHideMotionSpec(gxszxtbevo gxszxtbevoVar) {
        getImpl().hkdspvbjdz(gxszxtbevoVar);
    }

    public void setHideMotionSpecResource(int i13) {
        setHideMotionSpec(gxszxtbevo.ppxfxbqfkf(getContext(), i13));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().jhduphickx();
            if (this.f22743iwizpuwonk != null) {
                gtknphoqwx();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        this.f22749wwaezpbzkn.dxjokdxxww(i13);
        gtknphoqwx();
    }

    public void setMaxImageSize(int i13) {
        this.f22738cdpycssgdh = i13;
        getImpl().wypolnanlu(i13);
    }

    public void setRippleColor(int i13) {
        setRippleColor(ColorStateList.valueOf(i13));
    }

    @Override // android.view.View
    public void setScaleX(float f13) {
        super.setScaleX(f13);
        getImpl().iozdgvuglv();
    }

    @Override // android.view.View
    public void setScaleY(float f13) {
        super.setScaleY(f13);
        getImpl().iozdgvuglv();
    }

    public void setShadowPaddingEnabled(boolean z13) {
        getImpl().mbcevpiqjq(z13);
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(ra.gtknphoqwx gtknphoqwxVar) {
        getImpl().ntlheqmsrt(gtknphoqwxVar);
    }

    public void setShowMotionSpec(gxszxtbevo gxszxtbevoVar) {
        getImpl().ulzqkzuiru(gxszxtbevoVar);
    }

    public void setShowMotionSpecResource(int i13) {
        setShowMotionSpec(gxszxtbevo.ppxfxbqfkf(getContext(), i13));
    }

    public void setSize(int i13) {
        this.f22753zynmafqrjb = 0;
        if (i13 != this.f22748pmvmpeiblj) {
            this.f22748pmvmpeiblj = i13;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f22743iwizpuwonk != colorStateList) {
            this.f22743iwizpuwonk = colorStateList;
            gtknphoqwx();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f22739cqumvgiudr != mode) {
            this.f22739cqumvgiudr = mode;
            gtknphoqwx();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f13) {
        super.setTranslationX(f13);
        getImpl().lmojexxdyd();
    }

    @Override // android.view.View
    public void setTranslationY(float f13) {
        super.setTranslationY(f13);
        getImpl().lmojexxdyd();
    }

    @Override // android.view.View
    public void setTranslationZ(float f13) {
        super.setTranslationZ(f13);
        getImpl().lmojexxdyd();
    }

    public void setUseCompatPadding(boolean z13) {
        if (this.f22750yadqdtsiqt != z13) {
            this.f22750yadqdtsiqt = z13;
            getImpl().lereixgezr();
        }
    }

    @Override // com.google.android.material.internal.rgvfuqvkyq, android.widget.ImageView, android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f22754yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Rect f22755zdlpuopuiu;

        public BaseBehavior() {
            this.f22754yggfygwlhe = true;
        }

        private boolean cllcsxoeiz(View view, FloatingActionButton floatingActionButton) {
            return this.f22754yggfygwlhe && ((CoordinatorLayout.gxszxtbevo) floatingActionButton.getLayoutParams()).eablkybsjg() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean dsvhmnatus(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!cllcsxoeiz(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f22755zdlpuopuiu == null) {
                this.f22755zdlpuopuiu = new Rect();
            }
            Rect rect = this.f22755zdlpuopuiu;
            com.google.android.material.internal.zoijcleaow.iobyxmoadg(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.dxjokdxxww(null, false);
                return true;
            }
            floatingActionButton.draadjrbmk(null, false);
            return true;
        }

        private void hcddaimhww(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i13;
            Rect rect = floatingActionButton.f22741iozdgvuglv;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.gxszxtbevo gxszxtbevoVar = (CoordinatorLayout.gxszxtbevo) floatingActionButton.getLayoutParams();
            int i14 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).rightMargin) {
                i13 = rect.right;
            } else {
                i13 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).bottomMargin) {
                i14 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).topMargin) {
                i14 = -rect.top;
            }
            if (i14 != 0) {
                jhduphickx.ribwqtqdhb(floatingActionButton, i14);
            }
            if (i13 != 0) {
                jhduphickx.jlmebxxoox(floatingActionButton, i13);
            }
        }

        private static boolean pkzmftpjix(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.gxszxtbevo) {
                return ((CoordinatorLayout.gxszxtbevo) layoutParams).gxszxtbevo() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean wypolnanlu(View view, FloatingActionButton floatingActionButton) {
            if (!cllcsxoeiz(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.gxszxtbevo) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.dxjokdxxww(null, false);
                return true;
            }
            floatingActionButton.draadjrbmk(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public void gtknphoqwx(CoordinatorLayout.gxszxtbevo gxszxtbevoVar) {
            if (gxszxtbevoVar.f8324nufgyqmvbu == 0) {
                gxszxtbevoVar.f8324nufgyqmvbu = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
        public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i13) {
            List listOxmwwwfdhm = coordinatorLayout.oxmwwwfdhm(floatingActionButton);
            int size = listOxmwwwfdhm.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = (View) listOxmwwwfdhm.get(i14);
                if (!(view instanceof AppBarLayout)) {
                    if (pkzmftpjix(view) && wypolnanlu(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (dsvhmnatus(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.ylkuphrtab(floatingActionButton, i13);
            hcddaimhww(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
        public boolean draadjrbmk(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                dsvhmnatus(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!pkzmftpjix(view)) {
                return false;
            }
            wypolnanlu(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        /* JADX INFO: renamed from: ylkuphrtab, reason: merged with bridge method [inline-methods] */
        public boolean gxszxtbevo(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f22741iozdgvuglv;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.FloatingActionButton_Behavior_Layout);
            this.f22754yggfygwlhe = typedArrayObtainStyledAttributes.getBoolean(da.draadjrbmk.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22737hcddaimhww;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f22741iozdgvuglv = new Rect();
        this.f22746lmojexxdyd = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayDxjokdxxww = com.google.android.material.internal.draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.FloatingActionButton, i13, i14, new int[0]);
        this.f22751yggfygwlhe = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.FloatingActionButton_backgroundTint);
        this.f22744jyumaefscl = ojitshcjhn.btonecajqb(typedArrayDxjokdxxww.getInt(da.draadjrbmk.FloatingActionButton_backgroundTintMode, -1), null);
        this.f22740esjtqupxsv = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.FloatingActionButton_rippleColor);
        this.f22748pmvmpeiblj = typedArrayDxjokdxxww.getInt(da.draadjrbmk.FloatingActionButton_fabSize, -1);
        this.f22753zynmafqrjb = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.FloatingActionButton_fabCustomSize, 0);
        this.f22745lereixgezr = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayDxjokdxxww.getDimension(da.draadjrbmk.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayDxjokdxxww.getDimension(da.draadjrbmk.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayDxjokdxxww.getDimension(da.draadjrbmk.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f22750yadqdtsiqt = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.FloatingActionButton_maxImageSize, 0));
        gxszxtbevo gxszxtbevoVarZoijcleaow = gxszxtbevo.zoijcleaow(context2, typedArrayDxjokdxxww, da.draadjrbmk.FloatingActionButton_showMotionSpec);
        gxszxtbevo gxszxtbevoVarZoijcleaow2 = gxszxtbevo.zoijcleaow(context2, typedArrayDxjokdxxww, da.draadjrbmk.FloatingActionButton_hideMotionSpec);
        ra.gtknphoqwx gtknphoqwxVarWflxmlrfwp = ra.gtknphoqwx.lqeggnwhkg(context2, attributeSet, i13, i14, ra.gtknphoqwx.f82293wflxmlrfwp).wflxmlrfwp();
        boolean z13 = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.FloatingActionButton_android_enabled, true));
        typedArrayDxjokdxxww.recycle();
        draadjrbmk draadjrbmkVar = new draadjrbmk(this);
        this.f22749wwaezpbzkn = draadjrbmkVar;
        draadjrbmkVar.lqeggnwhkg(attributeSet, i13);
        this.f22752ylkuphrtab = new la.zoijcleaow(this);
        getImpl().ntlheqmsrt(gtknphoqwxVarWflxmlrfwp);
        getImpl().yggfygwlhe(this.f22751yggfygwlhe, this.f22744jyumaefscl, this.f22740esjtqupxsv, this.f22745lereixgezr);
        getImpl().stevsuqkhv(dimensionPixelSize);
        getImpl().hcddaimhww(dimension);
        getImpl().cllcsxoeiz(dimension2);
        getImpl().kegysxyocb(dimension3);
        getImpl().ulzqkzuiru(gxszxtbevoVarZoijcleaow);
        getImpl().hkdspvbjdz(gxszxtbevoVarZoijcleaow2);
        getImpl().jpowsppfya(z13);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f22740esjtqupxsv != colorStateList) {
            this.f22740esjtqupxsv = colorStateList;
            getImpl().tzroggbefp(this.f22740esjtqupxsv);
        }
    }
}
