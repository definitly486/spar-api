package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.draadjrbmk;
import da.gtknphoqwx;
import ra.agtfadlqog;
import ra.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, agtfadlqog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final int[] f22307cqumvgiudr = {R.attr.state_checkable};

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final int[] f22308esjtqupxsv = {R.attr.state_checked};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final int[] f22309lereixgezr = {da.zoijcleaow.state_dragged};

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int f22310pmvmpeiblj = gtknphoqwx.Widget_MaterialComponents_CardView;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f22311iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f22312jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f22313yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zoijcleaow f22314zdlpuopuiu;

    public interface iobyxmoadg {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.materialCardViewStyle);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f22314zdlpuopuiu.draadjrbmk().getBounds());
        return rectF;
    }

    private void zoijcleaow() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f22314zdlpuopuiu.gtknphoqwx();
        }
    }

    void eablkybsjg(int i13, int i14, int i15, int i16) {
        super.setContentPadding(i13, i14, i15, i16);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f22314zdlpuopuiu.wflxmlrfwp();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f22314zdlpuopuiu.agtfadlqog();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f22314zdlpuopuiu.ojitshcjhn();
    }

    public int getCheckedIconGravity() {
        return this.f22314zdlpuopuiu.rgvfuqvkyq();
    }

    public int getCheckedIconMargin() {
        return this.f22314zdlpuopuiu.vdvldrhtss();
    }

    public int getCheckedIconSize() {
        return this.f22314zdlpuopuiu.oxmwwwfdhm();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f22314zdlpuopuiu.kcexrzcfyt();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f22314zdlpuopuiu.istkbnxepw().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f22314zdlpuopuiu.istkbnxepw().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f22314zdlpuopuiu.istkbnxepw().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f22314zdlpuopuiu.istkbnxepw().top;
    }

    public float getProgress() {
        return this.f22314zdlpuopuiu.iwizpuwonk();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f22314zdlpuopuiu.yggfygwlhe();
    }

    public ColorStateList getRippleColor() {
        return this.f22314zdlpuopuiu.cqumvgiudr();
    }

    public ra.gtknphoqwx getShapeAppearanceModel() {
        return this.f22314zdlpuopuiu.esjtqupxsv();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f22314zdlpuopuiu.lereixgezr();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f22314zdlpuopuiu.pmvmpeiblj();
    }

    public int getStrokeWidth() {
        return this.f22314zdlpuopuiu.zynmafqrjb();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f22312jyumaefscl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22314zdlpuopuiu.metgxyhuhe();
        nufgyqmvbu.gxszxtbevo(this, this.f22314zdlpuopuiu.draadjrbmk());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 3);
        if (ppxfxbqfkf()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22307cqumvgiudr);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22308esjtqupxsv);
        }
        if (wkgbmnqykc()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22309lereixgezr);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(ppxfxbqfkf());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        this.f22314zdlpuopuiu.hcddaimhww(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean ppxfxbqfkf() {
        zoijcleaow zoijcleaowVar = this.f22314zdlpuopuiu;
        return zoijcleaowVar != null && zoijcleaowVar.iozdgvuglv();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f22313yggfygwlhe) {
            if (!this.f22314zdlpuopuiu.yadqdtsiqt()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f22314zdlpuopuiu.jpowsppfya(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i13) {
        this.f22314zdlpuopuiu.hkdspvbjdz(ColorStateList.valueOf(i13));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f13) {
        super.setCardElevation(f13);
        this.f22314zdlpuopuiu.czzsidtyhn();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f22314zdlpuopuiu.cllcsxoeiz(colorStateList);
    }

    public void setCheckable(boolean z13) {
        this.f22314zdlpuopuiu.dsvhmnatus(z13);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z13) {
        if (this.f22312jyumaefscl != z13) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f22314zdlpuopuiu.kegysxyocb(drawable);
    }

    public void setCheckedIconGravity(int i13) {
        if (this.f22314zdlpuopuiu.rgvfuqvkyq() != i13) {
            this.f22314zdlpuopuiu.tzroggbefp(i13);
        }
    }

    public void setCheckedIconMargin(int i13) {
        this.f22314zdlpuopuiu.mbcevpiqjq(i13);
    }

    public void setCheckedIconMarginResource(int i13) {
        if (i13 != -1) {
            this.f22314zdlpuopuiu.mbcevpiqjq(getResources().getDimensionPixelSize(i13));
        }
    }

    public void setCheckedIconResource(int i13) {
        this.f22314zdlpuopuiu.kegysxyocb(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setCheckedIconSize(int i13) {
        this.f22314zdlpuopuiu.ntlheqmsrt(i13);
    }

    public void setCheckedIconSizeResource(int i13) {
        if (i13 != 0) {
            this.f22314zdlpuopuiu.ntlheqmsrt(getResources().getDimensionPixelSize(i13));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f22314zdlpuopuiu.ulzqkzuiru(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z13) {
        super.setClickable(z13);
        zoijcleaow zoijcleaowVar = this.f22314zdlpuopuiu;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.metgxyhuhe();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i13, int i14, int i15, int i16) {
        this.f22314zdlpuopuiu.ikoacuggdj(i13, i14, i15, i16);
    }

    public void setDragged(boolean z13) {
        if (this.f22311iwizpuwonk != z13) {
            this.f22311iwizpuwonk = z13;
            refreshDrawableState();
            zoijcleaow();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f13) {
        super.setMaxCardElevation(f13);
        this.f22314zdlpuopuiu.yfnezrywwk();
    }

    public void setOnCheckedChangeListener(iobyxmoadg iobyxmoadgVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z13) {
        super.setPreventCornerOverlap(z13);
        this.f22314zdlpuopuiu.yfnezrywwk();
        this.f22314zdlpuopuiu.rlfsiqarku();
    }

    public void setProgress(float f13) {
        this.f22314zdlpuopuiu.crxdokpmqz(f13);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f13) {
        super.setRadius(f13);
        this.f22314zdlpuopuiu.sopmlzcsov(f13);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f22314zdlpuopuiu.jlmebxxoox(colorStateList);
    }

    public void setRippleColorResource(int i13) {
        this.f22314zdlpuopuiu.jlmebxxoox(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(ra.gtknphoqwx gtknphoqwxVar) {
        setClipToOutline(gtknphoqwxVar.yggfygwlhe(getBoundsAsRectF()));
        this.f22314zdlpuopuiu.ribwqtqdhb(gtknphoqwxVar);
    }

    public void setStrokeColor(int i13) {
        setStrokeColor(ColorStateList.valueOf(i13));
    }

    public void setStrokeWidth(int i13) {
        this.f22314zdlpuopuiu.jhduphickx(i13);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z13) {
        super.setUseCompatPadding(z13);
        this.f22314zdlpuopuiu.yfnezrywwk();
        this.f22314zdlpuopuiu.rlfsiqarku();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (ppxfxbqfkf() && isEnabled()) {
            this.f22312jyumaefscl = !this.f22312jyumaefscl;
            refreshDrawableState();
            zoijcleaow();
            this.f22314zdlpuopuiu.stevsuqkhv(this.f22312jyumaefscl, true);
        }
    }

    public boolean wkgbmnqykc() {
        return this.f22311iwizpuwonk;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22310pmvmpeiblj;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f22312jyumaefscl = false;
        this.f22311iwizpuwonk = false;
        this.f22313yggfygwlhe = true;
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(getContext(), attributeSet, da.draadjrbmk.MaterialCardView, i13, i14, new int[0]);
        zoijcleaow zoijcleaowVar = new zoijcleaow(this, attributeSet, i13, i14);
        this.f22314zdlpuopuiu = zoijcleaowVar;
        zoijcleaowVar.hkdspvbjdz(super.getCardBackgroundColor());
        zoijcleaowVar.ikoacuggdj(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        zoijcleaowVar.pkzmftpjix(typedArrayDxjokdxxww);
        typedArrayDxjokdxxww.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f22314zdlpuopuiu.hkdspvbjdz(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f22314zdlpuopuiu.vipkmwdibw(colorStateList);
        invalidate();
    }
}
