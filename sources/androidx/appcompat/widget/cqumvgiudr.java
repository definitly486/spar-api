package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class cqumvgiudr extends ToggleButton {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private btonecajqb f3263jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu f3264yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f3265zdlpuopuiu;

    public cqumvgiudr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private btonecajqb getEmojiTextViewHelper() {
        if (this.f3263jyumaefscl == null) {
            this.f3263jyumaefscl = new btonecajqb(this);
        }
        return this.f3263jyumaefscl;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3264yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zoijcleaow();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3264yggfygwlhe.btonecajqb();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3264yggfygwlhe.gtknphoqwx();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        getEmojiTextViewHelper().wkgbmnqykc(z13);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3264yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3264yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    public void setEmojiCompatEnabled(boolean z13) {
        getEmojiTextViewHelper().eablkybsjg(z13);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().iobyxmoadg(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wkgbmnqykc wkgbmnqykcVar = this.f3265zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3264yggfygwlhe.iwizpuwonk(colorStateList);
        this.f3264yggfygwlhe.zoijcleaow();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3264yggfygwlhe.cqumvgiudr(mode);
        this.f3264yggfygwlhe.zoijcleaow();
    }

    public cqumvgiudr(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.f3265zdlpuopuiu = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.f3264yggfygwlhe = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        getEmojiTextViewHelper().ppxfxbqfkf(attributeSet, i13);
    }
}
