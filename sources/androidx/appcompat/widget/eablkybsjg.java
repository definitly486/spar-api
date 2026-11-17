package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg extends CheckedTextView {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private btonecajqb f3295iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zdlpuopuiu f3296jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wkgbmnqykc f3297yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f3298zdlpuopuiu;

    public eablkybsjg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.checkedTextViewStyle);
    }

    private btonecajqb getEmojiTextViewHelper() {
        if (this.f3295iwizpuwonk == null) {
            this.f3295iwizpuwonk = new btonecajqb(this);
        }
        return this.f3295iwizpuwonk;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        zdlpuopuiu zdlpuopuiuVar = this.f3296jyumaefscl;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zoijcleaow();
        }
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        gxszxtbevo gxszxtbevoVar = this.f3298zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.iobyxmoadg();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.dxjokdxxww.oxmwwwfdhm(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        gxszxtbevo gxszxtbevoVar = this.f3298zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar.zoijcleaow();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        gxszxtbevo gxszxtbevoVar = this.f3298zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar.ppxfxbqfkf();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3296jyumaefscl.btonecajqb();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3296jyumaefscl.gtknphoqwx();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return gtknphoqwx.iobyxmoadg(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        getEmojiTextViewHelper().wkgbmnqykc(z13);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        gxszxtbevo gxszxtbevoVar = this.f3298zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.eablkybsjg();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3296jyumaefscl;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3296jyumaefscl;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.dxjokdxxww.kcexrzcfyt(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        getEmojiTextViewHelper().eablkybsjg(z13);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wkgbmnqykc wkgbmnqykcVar = this.f3297yggfygwlhe;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        gxszxtbevo gxszxtbevoVar = this.f3298zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.gxszxtbevo(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        gxszxtbevo gxszxtbevoVar = this.f3298zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.lqeggnwhkg(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3296jyumaefscl.iwizpuwonk(colorStateList);
        this.f3296jyumaefscl.zoijcleaow();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3296jyumaefscl.cqumvgiudr(mode);
        this.f3296jyumaefscl.zoijcleaow();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        zdlpuopuiu zdlpuopuiuVar = this.f3296jyumaefscl;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.vdvldrhtss(context, i13);
        }
    }

    public eablkybsjg(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.f3296jyumaefscl = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        zdlpuopuiuVar.zoijcleaow();
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.f3297yggfygwlhe = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this);
        this.f3298zdlpuopuiu = gxszxtbevoVar;
        gxszxtbevoVar.wkgbmnqykc(attributeSet, i13);
        getEmojiTextViewHelper().ppxfxbqfkf(attributeSet, i13);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i13) {
        setCheckMarkDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }
}
