package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {
    private btonecajqb mAppCompatEmojiTextHelper;
    private final wkgbmnqykc mBackgroundTintHelper;
    private final zdlpuopuiu mTextHelper;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.buttonStyle);
    }

    private btonecajqb getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new btonecajqb(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zoijcleaow();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return super.getAutoSizeMaxTextSize();
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.eablkybsjg();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return super.getAutoSizeMinTextSize();
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.gxszxtbevo();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return super.getAutoSizeStepGranularity();
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.lqeggnwhkg();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return super.getAutoSizeTextAvailableSizes();
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        return zdlpuopuiuVar != null ? zdlpuopuiuVar.nufgyqmvbu() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.dxjokdxxww();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.dxjokdxxww.oxmwwwfdhm(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.btonecajqb();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.gtknphoqwx();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().zoijcleaow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.ojitshcjhn(z13, i13, i14, i15, i16);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar == null || vipkmwdibw.f3402ppxfxbqfkf || !zdlpuopuiuVar.draadjrbmk()) {
            return;
        }
        this.mTextHelper.ppxfxbqfkf();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        getEmojiTextViewHelper().wkgbmnqykc(z13);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zdlpuopuiu(i13, i14, i15, i16);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i13) throws IllegalArgumentException {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.yggfygwlhe(iArr, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i13) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            super.setAutoSizeTextTypeWithDefaults(i13);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.jyumaefscl(i13);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.dxjokdxxww.kcexrzcfyt(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        getEmojiTextViewHelper().eablkybsjg(z13);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().iobyxmoadg(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z13) {
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.kcexrzcfyt(z13);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wkgbmnqykc wkgbmnqykcVar = this.mBackgroundTintHelper;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.iwizpuwonk(colorStateList);
        this.mTextHelper.zoijcleaow();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.cqumvgiudr(mode);
        this.mTextHelper.zoijcleaow();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.vdvldrhtss(context, i13);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i13, float f13) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            super.setTextSize(i13, f13);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.pmvmpeiblj(i13, f13);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.mBackgroundTintHelper = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.mTextHelper = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        zdlpuopuiuVar.zoijcleaow();
        getEmojiTextViewHelper().ppxfxbqfkf(attributeSet, i13);
    }
}
