package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements v1.jpowsppfya {
    private final dxjokdxxww mAppCompatEmojiEditTextHelper;
    private final wkgbmnqykc mBackgroundTintHelper;
    private final androidx.core.widget.btonecajqb mDefaultOnReceiveContentListener;
    private iobyxmoadg mSuperCaller;
    private final kcexrzcfyt mTextClassifierHelper;
    private final zdlpuopuiu mTextHelper;

    class iobyxmoadg {
        iobyxmoadg() {
        }

        public TextClassifier iobyxmoadg() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void zoijcleaow(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private iobyxmoadg getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new iobyxmoadg();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        kcexrzcfyt kcexrzcfytVar;
        return (Build.VERSION.SDK_INT >= 28 || (kcexrzcfytVar = this.mTextClassifierHelper) == null) ? getSuperCaller().iobyxmoadg() : kcexrzcfytVar.iobyxmoadg();
    }

    void initEmojiKeyListener(dxjokdxxww dxjokdxxwwVar) {
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

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.ppxfxbqfkf();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrIstkbnxepw;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.oxmwwwfdhm(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionIobyxmoadg = gtknphoqwx.iobyxmoadg(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionIobyxmoadg != null && Build.VERSION.SDK_INT <= 30 && (strArrIstkbnxepw = jhduphickx.istkbnxepw(this)) != null) {
            y1.iobyxmoadg.ppxfxbqfkf(editorInfo, strArrIstkbnxepw);
            inputConnectionIobyxmoadg = y1.ppxfxbqfkf.ppxfxbqfkf(this, inputConnectionIobyxmoadg, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.eablkybsjg(inputConnectionIobyxmoadg, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i13 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (rgvfuqvkyq.iobyxmoadg(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // v1.jpowsppfya
    public v1.wkgbmnqykc onReceiveContent(v1.wkgbmnqykc wkgbmnqykcVar) {
        return this.mDefaultOnReceiveContentListener.iobyxmoadg(this, wkgbmnqykcVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i13) {
        if (rgvfuqvkyq.zoijcleaow(this, i13)) {
            return true;
        }
        return super.onTextContextMenuItem(i13);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.mTextHelper;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.dxjokdxxww.kcexrzcfyt(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        this.mAppCompatEmojiEditTextHelper.gxszxtbevo(z13);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.iobyxmoadg(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        kcexrzcfyt kcexrzcfytVar;
        if (Build.VERSION.SDK_INT >= 28 || (kcexrzcfytVar = this.mTextClassifierHelper) == null) {
            getSuperCaller().zoijcleaow(textClassifier);
        } else {
            kcexrzcfytVar.zoijcleaow(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.mBackgroundTintHelper = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.mTextHelper = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        zdlpuopuiuVar.zoijcleaow();
        this.mTextClassifierHelper = new kcexrzcfyt(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.btonecajqb();
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this);
        this.mAppCompatEmojiEditTextHelper = dxjokdxxwwVar;
        dxjokdxxwwVar.wkgbmnqykc(attributeSet, i13);
        initEmojiKeyListener(dxjokdxxwwVar);
    }
}
