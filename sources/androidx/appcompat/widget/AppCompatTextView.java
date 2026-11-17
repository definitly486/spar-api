package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f3118cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private iobyxmoadg f3119esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private btonecajqb f3120iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kcexrzcfyt f3121jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Future f3122lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu f3123yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.appcompat.widget.wkgbmnqykc f3124zdlpuopuiu;

    private interface iobyxmoadg {
        void btonecajqb(int i13, int i14, int i15, int i16);

        int draadjrbmk();

        void dxjokdxxww(TextClassifier textClassifier);

        void eablkybsjg(int i13, float f13);

        void gtknphoqwx(int i13);

        int[] gxszxtbevo();

        void iobyxmoadg(int[] iArr, int i13);

        TextClassifier lqeggnwhkg();

        int nufgyqmvbu();

        int ppxfxbqfkf();

        void wflxmlrfwp(int i13);

        int wkgbmnqykc();

        void zoijcleaow(int i13);
    }

    class ppxfxbqfkf extends zoijcleaow {
        ppxfxbqfkf() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.zoijcleaow, androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void gtknphoqwx(int i13) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.zoijcleaow, androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void zoijcleaow(int i13) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i13);
        }
    }

    class wkgbmnqykc extends ppxfxbqfkf {
        wkgbmnqykc() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.zoijcleaow, androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void eablkybsjg(int i13, float f13) {
            AppCompatTextView.super.setLineHeight(i13, f13);
        }
    }

    class zoijcleaow implements iobyxmoadg {
        zoijcleaow() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void btonecajqb(int i13, int i14, int i15, int i16) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public int draadjrbmk() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void dxjokdxxww(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void eablkybsjg(int i13, float f13) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void gtknphoqwx(int i13) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public int[] gxszxtbevo() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void iobyxmoadg(int[] iArr, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public TextClassifier lqeggnwhkg() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public int nufgyqmvbu() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public int ppxfxbqfkf() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void wflxmlrfwp(int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public int wkgbmnqykc() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.iobyxmoadg
        public void zoijcleaow(int i13) {
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private btonecajqb getEmojiTextViewHelper() {
        if (this.f3120iwizpuwonk == null) {
            this.f3120iwizpuwonk = new btonecajqb(this);
        }
        return this.f3120iwizpuwonk;
    }

    private void oxmwwwfdhm() {
        Future future = this.f3122lereixgezr;
        if (future != null) {
            try {
                this.f3122lereixgezr = null;
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(future.get());
                androidx.core.widget.dxjokdxxww.ojitshcjhn(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zoijcleaow();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return getSuperCaller().nufgyqmvbu();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.eablkybsjg();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return getSuperCaller().wkgbmnqykc();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.gxszxtbevo();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return getSuperCaller().draadjrbmk();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.lqeggnwhkg();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return getSuperCaller().gxszxtbevo();
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        return zdlpuopuiuVar != null ? zdlpuopuiuVar.nufgyqmvbu() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return getSuperCaller().ppxfxbqfkf() == 1 ? 1 : 0;
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar.dxjokdxxww();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.dxjokdxxww.oxmwwwfdhm(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.dxjokdxxww.zoijcleaow(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.dxjokdxxww.ppxfxbqfkf(this);
    }

    iobyxmoadg getSuperCaller() {
        if (this.f3119esjtqupxsv == null) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34) {
                this.f3119esjtqupxsv = new wkgbmnqykc();
            } else if (i13 >= 28) {
                this.f3119esjtqupxsv = new ppxfxbqfkf();
            } else {
                this.f3119esjtqupxsv = new zoijcleaow();
            }
        }
        return this.f3119esjtqupxsv;
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3123yggfygwlhe.btonecajqb();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3123yggfygwlhe.gtknphoqwx();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        oxmwwwfdhm();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        kcexrzcfyt kcexrzcfytVar;
        return (Build.VERSION.SDK_INT >= 28 || (kcexrzcfytVar = this.f3121jyumaefscl) == null) ? getSuperCaller().lqeggnwhkg() : kcexrzcfytVar.iobyxmoadg();
    }

    public t1.draadjrbmk.iobyxmoadg getTextMetricsParamsCompat() {
        return androidx.core.widget.dxjokdxxww.lqeggnwhkg(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3123yggfygwlhe.oxmwwwfdhm(this, inputConnectionOnCreateInputConnection, editorInfo);
        return gtknphoqwx.iobyxmoadg(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i13 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.ojitshcjhn(z13, i13, i14, i15, i16);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i13, int i14) {
        oxmwwwfdhm();
        super.onMeasure(i13, i14);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar == null || vipkmwdibw.f3402ppxfxbqfkf || !zdlpuopuiuVar.draadjrbmk()) {
            return;
        }
        this.f3123yggfygwlhe.ppxfxbqfkf();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        getEmojiTextViewHelper().wkgbmnqykc(z13);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            getSuperCaller().btonecajqb(i13, i14, i15, i16);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.zdlpuopuiu(i13, i14, i15, i16);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i13) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            getSuperCaller().iobyxmoadg(iArr, i13);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.yggfygwlhe(iArr, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i13) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            getSuperCaller().wflxmlrfwp(i13);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.jyumaefscl(i13);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().iobyxmoadg(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i13) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().gtknphoqwx(i13);
        } else {
            androidx.core.widget.dxjokdxxww.gtknphoqwx(this, i13);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i13) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().zoijcleaow(i13);
        } else {
            androidx.core.widget.dxjokdxxww.draadjrbmk(this, i13);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i13) {
        androidx.core.widget.dxjokdxxww.wflxmlrfwp(this, i13);
    }

    public void setPrecomputedText(t1.draadjrbmk draadjrbmkVar) {
        androidx.core.widget.dxjokdxxww.ojitshcjhn(this, draadjrbmkVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3124zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3123yggfygwlhe.iwizpuwonk(colorStateList);
        this.f3123yggfygwlhe.zoijcleaow();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3123yggfygwlhe.cqumvgiudr(mode);
        this.f3123yggfygwlhe.zoijcleaow();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.vdvldrhtss(context, i13);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        kcexrzcfyt kcexrzcfytVar;
        if (Build.VERSION.SDK_INT >= 28 || (kcexrzcfytVar = this.f3121jyumaefscl) == null) {
            getSuperCaller().dxjokdxxww(textClassifier);
        } else {
            kcexrzcfytVar.zoijcleaow(textClassifier);
        }
    }

    public void setTextFuture(Future<t1.draadjrbmk> future) {
        this.f3122lereixgezr = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(t1.draadjrbmk.iobyxmoadg iobyxmoadgVar) {
        androidx.core.widget.dxjokdxxww.vdvldrhtss(this, iobyxmoadgVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i13, float f13) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            super.setTextSize(i13, f13);
            return;
        }
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.pmvmpeiblj(i13, f13);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i13) {
        if (this.f3118cqumvgiudr) {
            return;
        }
        Typeface typefaceIobyxmoadg = (typeface == null || i13 <= 0) ? null : j1.dxjokdxxww.iobyxmoadg(getContext(), typeface, i13);
        this.f3118cqumvgiudr = true;
        if (typefaceIobyxmoadg != null) {
            typeface = typefaceIobyxmoadg;
        }
        try {
            super.setTypeface(typeface, i13);
        } finally {
            this.f3118cqumvgiudr = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i13, float f13) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().eablkybsjg(i13, f13);
        } else {
            androidx.core.widget.dxjokdxxww.agtfadlqog(this, i13, f13);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        this.f3118cqumvgiudr = false;
        this.f3119esjtqupxsv = null;
        wypolnanlu.iobyxmoadg(this, getContext());
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = new androidx.appcompat.widget.wkgbmnqykc(this);
        this.f3124zdlpuopuiu = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.f3123yggfygwlhe = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        zdlpuopuiuVar.zoijcleaow();
        this.f3121jyumaefscl = new kcexrzcfyt(this);
        getEmojiTextViewHelper().ppxfxbqfkf(attributeSet, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i13) : null, i14 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i14) : null, i15 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i15) : null, i16 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i16) : null);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i13) : null, i14 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i14) : null, i15 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i15) : null, i16 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i16) : null);
        zdlpuopuiu zdlpuopuiuVar = this.f3123yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            zdlpuopuiuVar.rgvfuqvkyq();
        }
    }
}
