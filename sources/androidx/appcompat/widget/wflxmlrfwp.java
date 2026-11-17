package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final int[] f3404iwizpuwonk = {R.attr.popupBackground};

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dxjokdxxww f3405jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu f3406yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f3407zdlpuopuiu;

    public wflxmlrfwp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3406yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zoijcleaow();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3406yggfygwlhe.btonecajqb();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3406yggfygwlhe.gtknphoqwx();
    }

    void iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
        KeyListener keyListener = getKeyListener();
        if (dxjokdxxwwVar.zoijcleaow(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerIobyxmoadg = dxjokdxxwwVar.iobyxmoadg(keyListener);
            if (keyListenerIobyxmoadg == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerIobyxmoadg);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f3405jyumaefscl.eablkybsjg(gtknphoqwx.iobyxmoadg(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3406yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3406yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i13) {
        setDropDownBackgroundDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        this.f3405jyumaefscl.gxszxtbevo(z13);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3405jyumaefscl.iobyxmoadg(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wkgbmnqykc wkgbmnqykcVar = this.f3407zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3406yggfygwlhe.iwizpuwonk(colorStateList);
        this.f3406yggfygwlhe.zoijcleaow();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3406yggfygwlhe.cqumvgiudr(mode);
        this.f3406yggfygwlhe.zoijcleaow();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        zdlpuopuiu zdlpuopuiuVar = this.f3406yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.vdvldrhtss(context, i13);
        }
    }

    public wflxmlrfwp(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(getContext(), attributeSet, f3404iwizpuwonk, i13, 0);
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(0)) {
            setDropDownBackgroundDrawable(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(0));
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.f3407zdlpuopuiu = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.f3406yggfygwlhe = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        zdlpuopuiuVar.zoijcleaow();
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this);
        this.f3405jyumaefscl = dxjokdxxwwVar;
        dxjokdxxwwVar.wkgbmnqykc(attributeSet, i13);
        iobyxmoadg(dxjokdxxwwVar);
    }
}
