package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class yggfygwlhe {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final RectF f3444draadjrbmk = new RectF();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static ConcurrentHashMap f3445wflxmlrfwp = new ConcurrentHashMap();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Context f3446btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final TextView f3447dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final wkgbmnqykc f3449gtknphoqwx;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private TextPaint f3453nufgyqmvbu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f3451iobyxmoadg = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f3456zoijcleaow = false;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f3454ppxfxbqfkf = -1.0f;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f3455wkgbmnqykc = -1.0f;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f3448eablkybsjg = -1.0f;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int[] f3450gxszxtbevo = new int[0];

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f3452lqeggnwhkg = false;

    private static final class iobyxmoadg {
        static StaticLayout iobyxmoadg(CharSequence charSequence, Layout.Alignment alignment, int i13, int i14, TextView textView, TextPaint textPaint, wkgbmnqykc wkgbmnqykcVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i13);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i14 == -1) {
                i14 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i14);
            try {
                wkgbmnqykcVar.iobyxmoadg(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class ppxfxbqfkf extends zoijcleaow {
        ppxfxbqfkf() {
        }

        @Override // androidx.appcompat.widget.yggfygwlhe.zoijcleaow, androidx.appcompat.widget.yggfygwlhe.wkgbmnqykc
        void iobyxmoadg(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.yggfygwlhe.wkgbmnqykc
        boolean zoijcleaow(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class wkgbmnqykc {
        wkgbmnqykc() {
        }

        abstract void iobyxmoadg(StaticLayout.Builder builder, TextView textView);

        boolean zoijcleaow(TextView textView) {
            return ((Boolean) yggfygwlhe.wflxmlrfwp(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    private static class zoijcleaow extends wkgbmnqykc {
        zoijcleaow() {
        }

        @Override // androidx.appcompat.widget.yggfygwlhe.wkgbmnqykc
        void iobyxmoadg(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) yggfygwlhe.wflxmlrfwp(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    yggfygwlhe(TextView textView) {
        this.f3447dxjokdxxww = textView;
        this.f3446btonecajqb = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3449gtknphoqwx = new ppxfxbqfkf();
        } else {
            this.f3449gtknphoqwx = new zoijcleaow();
        }
    }

    private boolean cqumvgiudr(int i13, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f3447dxjokdxxww.getText();
        TransformationMethod transformationMethod = this.f3447dxjokdxxww.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f3447dxjokdxxww)) != null) {
            text = transformation;
        }
        int maxLines = this.f3447dxjokdxxww.getMaxLines();
        draadjrbmk(i13);
        StaticLayout staticLayoutWkgbmnqykc = wkgbmnqykc(text, (Layout.Alignment) wflxmlrfwp(this.f3447dxjokdxxww, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutWkgbmnqykc.getLineCount() <= maxLines && staticLayoutWkgbmnqykc.getLineEnd(staticLayoutWkgbmnqykc.getLineCount() - 1) == text.length())) && ((float) staticLayoutWkgbmnqykc.getHeight()) <= rectF.bottom;
    }

    private int eablkybsjg(RectF rectF) {
        int length = this.f3450gxszxtbevo.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i13 = 1;
        int i14 = length - 1;
        int i15 = 0;
        while (i13 <= i14) {
            int i16 = (i13 + i14) / 2;
            if (cqumvgiudr(this.f3450gxszxtbevo[i16], rectF)) {
                int i17 = i16 + 1;
                i15 = i13;
                i13 = i17;
            } else {
                i15 = i16 - 1;
                i14 = i15;
            }
        }
        return this.f3450gxszxtbevo[i15];
    }

    private boolean esjtqupxsv() {
        return !(this.f3447dxjokdxxww instanceof AppCompatEditText);
    }

    private static Method gtknphoqwx(String str) {
        try {
            Method declaredMethod = (Method) f3445wflxmlrfwp.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f3445wflxmlrfwp.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e13) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e13);
            return null;
        }
    }

    private boolean iwizpuwonk() {
        int[] iArr = this.f3450gxszxtbevo;
        int length = iArr.length;
        boolean z13 = length > 0;
        this.f3452lqeggnwhkg = z13;
        if (z13) {
            this.f3451iobyxmoadg = 1;
            this.f3455wkgbmnqykc = iArr[0];
            this.f3448eablkybsjg = iArr[length - 1];
            this.f3454ppxfxbqfkf = -1.0f;
        }
        return z13;
    }

    private void jyumaefscl(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = typedArray.getDimensionPixelSize(i13, -1);
            }
            this.f3450gxszxtbevo = zoijcleaow(iArr);
            iwizpuwonk();
        }
    }

    private void kcexrzcfyt(float f13) {
        if (f13 != this.f3447dxjokdxxww.getPaint().getTextSize()) {
            this.f3447dxjokdxxww.getPaint().setTextSize(f13);
            boolean zIsInLayout = this.f3447dxjokdxxww.isInLayout();
            if (this.f3447dxjokdxxww.getLayout() != null) {
                this.f3456zoijcleaow = false;
                try {
                    Method methodGtknphoqwx = gtknphoqwx("nullLayouts");
                    if (methodGtknphoqwx != null) {
                        methodGtknphoqwx.invoke(this.f3447dxjokdxxww, null);
                    }
                } catch (Exception e13) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e13);
                }
                if (zIsInLayout) {
                    this.f3447dxjokdxxww.forceLayout();
                } else {
                    this.f3447dxjokdxxww.requestLayout();
                }
                this.f3447dxjokdxxww.invalidate();
            }
        }
    }

    private void lereixgezr(float f13, float f14, float f15) {
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f13 + "px) is less or equal to (0px)");
        }
        if (f14 <= f13) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f14 + "px) is less or equal to minimum auto-size text size (" + f13 + "px)");
        }
        if (f15 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f15 + "px) is less or equal to (0px)");
        }
        this.f3451iobyxmoadg = 1;
        this.f3455wkgbmnqykc = f13;
        this.f3448eablkybsjg = f14;
        this.f3454ppxfxbqfkf = f15;
        this.f3452lqeggnwhkg = false;
    }

    private void ppxfxbqfkf() {
        this.f3451iobyxmoadg = 0;
        this.f3455wkgbmnqykc = -1.0f;
        this.f3448eablkybsjg = -1.0f;
        this.f3454ppxfxbqfkf = -1.0f;
        this.f3450gxszxtbevo = new int[0];
        this.f3456zoijcleaow = false;
    }

    static Object wflxmlrfwp(Object obj, String str, Object obj2) {
        try {
            return gtknphoqwx(str).invoke(obj, null);
        } catch (Exception e13) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e13);
            return obj2;
        }
    }

    private boolean yggfygwlhe() {
        if (esjtqupxsv() && this.f3451iobyxmoadg == 1) {
            if (!this.f3452lqeggnwhkg || this.f3450gxszxtbevo.length == 0) {
                int iFloor = ((int) Math.floor((this.f3448eablkybsjg - this.f3455wkgbmnqykc) / this.f3454ppxfxbqfkf)) + 1;
                int[] iArr = new int[iFloor];
                for (int i13 = 0; i13 < iFloor; i13++) {
                    iArr[i13] = Math.round(this.f3455wkgbmnqykc + (i13 * this.f3454ppxfxbqfkf));
                }
                this.f3450gxszxtbevo = zoijcleaow(iArr);
            }
            this.f3456zoijcleaow = true;
        } else {
            this.f3456zoijcleaow = false;
        }
        return this.f3456zoijcleaow;
    }

    private int[] zoijcleaow(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i13 : iArr) {
            if (i13 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i13)) < 0) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr2[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        return iArr2;
    }

    boolean agtfadlqog() {
        return esjtqupxsv() && this.f3451iobyxmoadg != 0;
    }

    int btonecajqb() {
        return this.f3451iobyxmoadg;
    }

    void draadjrbmk(int i13) {
        TextPaint textPaint = this.f3453nufgyqmvbu;
        if (textPaint == null) {
            this.f3453nufgyqmvbu = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f3453nufgyqmvbu.set(this.f3447dxjokdxxww.getPaint());
        this.f3453nufgyqmvbu.setTextSize(i13);
    }

    int[] dxjokdxxww() {
        return this.f3450gxszxtbevo;
    }

    int gxszxtbevo() {
        return Math.round(this.f3448eablkybsjg);
    }

    void iobyxmoadg() {
        if (agtfadlqog()) {
            if (this.f3456zoijcleaow) {
                if (this.f3447dxjokdxxww.getMeasuredHeight() <= 0 || this.f3447dxjokdxxww.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3449gtknphoqwx.zoijcleaow(this.f3447dxjokdxxww) ? 1048576 : (this.f3447dxjokdxxww.getMeasuredWidth() - this.f3447dxjokdxxww.getTotalPaddingLeft()) - this.f3447dxjokdxxww.getTotalPaddingRight();
                int height = (this.f3447dxjokdxxww.getHeight() - this.f3447dxjokdxxww.getCompoundPaddingBottom()) - this.f3447dxjokdxxww.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3444draadjrbmk;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fEablkybsjg = eablkybsjg(rectF);
                        if (fEablkybsjg != this.f3447dxjokdxxww.getTextSize()) {
                            zdlpuopuiu(0, fEablkybsjg);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f3456zoijcleaow = true;
        }
    }

    int lqeggnwhkg() {
        return Math.round(this.f3455wkgbmnqykc);
    }

    int nufgyqmvbu() {
        return Math.round(this.f3454ppxfxbqfkf);
    }

    void ojitshcjhn(AttributeSet attributeSet, int i13) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f3446btonecajqb.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.AppCompatTextView, i13, 0);
        TextView textView = this.f3447dxjokdxxww;
        jhduphickx.sflfametgt(textView, textView.getContext(), lqeggnwhkg.btonecajqb.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i13, 0);
        if (typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeTextType)) {
            this.f3451iobyxmoadg = typedArrayObtainStyledAttributes.getInt(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            jyumaefscl(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!esjtqupxsv()) {
            this.f3451iobyxmoadg = 0;
            return;
        }
        if (this.f3451iobyxmoadg == 1) {
            if (!this.f3452lqeggnwhkg) {
                DisplayMetrics displayMetrics = this.f3446btonecajqb.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                lereixgezr(dimension2, dimension3, dimension);
            }
            yggfygwlhe();
        }
    }

    void oxmwwwfdhm(int i13) {
        if (esjtqupxsv()) {
            if (i13 == 0) {
                ppxfxbqfkf();
                return;
            }
            if (i13 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i13);
            }
            DisplayMetrics displayMetrics = this.f3446btonecajqb.getResources().getDisplayMetrics();
            lereixgezr(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (yggfygwlhe()) {
                iobyxmoadg();
            }
        }
    }

    void rgvfuqvkyq(int i13, int i14, int i15, int i16) {
        if (esjtqupxsv()) {
            DisplayMetrics displayMetrics = this.f3446btonecajqb.getResources().getDisplayMetrics();
            lereixgezr(TypedValue.applyDimension(i16, i13, displayMetrics), TypedValue.applyDimension(i16, i14, displayMetrics), TypedValue.applyDimension(i16, i15, displayMetrics));
            if (yggfygwlhe()) {
                iobyxmoadg();
            }
        }
    }

    void vdvldrhtss(int[] iArr, int i13) {
        if (esjtqupxsv()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i13 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3446btonecajqb.getResources().getDisplayMetrics();
                    for (int i14 = 0; i14 < length; i14++) {
                        iArrCopyOf[i14] = Math.round(TypedValue.applyDimension(i13, iArr[i14], displayMetrics));
                    }
                }
                this.f3450gxszxtbevo = zoijcleaow(iArrCopyOf);
                if (!iwizpuwonk()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f3452lqeggnwhkg = false;
            }
            if (yggfygwlhe()) {
                iobyxmoadg();
            }
        }
    }

    StaticLayout wkgbmnqykc(CharSequence charSequence, Layout.Alignment alignment, int i13, int i14) {
        return iobyxmoadg.iobyxmoadg(charSequence, alignment, i13, i14, this.f3447dxjokdxxww, this.f3453nufgyqmvbu, this.f3449gtknphoqwx);
    }

    void zdlpuopuiu(int i13, float f13) {
        Context context = this.f3446btonecajqb;
        kcexrzcfyt(TypedValue.applyDimension(i13, f13, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
