package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends AutoCompleteTextView {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final int[] f3387iwizpuwonk = {R.attr.popupBackground};

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dxjokdxxww f3388jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu f3389yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f3390zdlpuopuiu;

    public ppxfxbqfkf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3389yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zoijcleaow();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.dxjokdxxww.oxmwwwfdhm(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3389yggfygwlhe.btonecajqb();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3389yggfygwlhe.gtknphoqwx();
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
        return this.f3388jyumaefscl.eablkybsjg(gtknphoqwx.iobyxmoadg(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3389yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3389yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.dxjokdxxww.kcexrzcfyt(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i13) {
        setDropDownBackgroundDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        this.f3388jyumaefscl.gxszxtbevo(z13);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3388jyumaefscl.iobyxmoadg(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wkgbmnqykc wkgbmnqykcVar = this.f3390zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3389yggfygwlhe.iwizpuwonk(colorStateList);
        this.f3389yggfygwlhe.zoijcleaow();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3389yggfygwlhe.cqumvgiudr(mode);
        this.f3389yggfygwlhe.zoijcleaow();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        zdlpuopuiu zdlpuopuiuVar = this.f3389yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.vdvldrhtss(context, i13);
        }
    }

    public ppxfxbqfkf(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(getContext(), attributeSet, f3387iwizpuwonk, i13, 0);
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(0)) {
            setDropDownBackgroundDrawable(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(0));
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.f3390zdlpuopuiu = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.f3389yggfygwlhe = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        zdlpuopuiuVar.zoijcleaow();
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this);
        this.f3388jyumaefscl = dxjokdxxwwVar;
        dxjokdxxwwVar.wkgbmnqykc(attributeSet, i13);
        iobyxmoadg(dxjokdxxwwVar);
    }
}
