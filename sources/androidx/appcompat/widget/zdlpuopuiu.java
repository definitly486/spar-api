package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class zdlpuopuiu {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Typeface f3499draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final yggfygwlhe f3500dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private kegysxyocb f3501eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private kegysxyocb f3503gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f3504iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private kegysxyocb f3505lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private kegysxyocb f3506nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private kegysxyocb f3507ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f3508wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private kegysxyocb f3509wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private kegysxyocb f3510zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f3498btonecajqb = 0;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f3502gtknphoqwx = -1;

    static class eablkybsjg {
        static Typeface iobyxmoadg(Typeface typeface, int i13, boolean z13) {
            return Typeface.create(typeface, i13, z13);
        }
    }

    class iobyxmoadg extends i1.nufgyqmvbu.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f3511iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ WeakReference f3512ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f3514zoijcleaow;

        iobyxmoadg(int i13, int i14, WeakReference weakReference) {
            this.f3511iobyxmoadg = i13;
            this.f3514zoijcleaow = i14;
            this.f3512ppxfxbqfkf = weakReference;
        }

        @Override // i1.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww */
        public void lqeggnwhkg(Typeface typeface) {
            int i13;
            if (Build.VERSION.SDK_INT >= 28 && (i13 = this.f3511iobyxmoadg) != -1) {
                typeface = eablkybsjg.iobyxmoadg(typeface, i13, (this.f3514zoijcleaow & 2) != 0);
            }
            zdlpuopuiu.this.agtfadlqog(this.f3512ppxfxbqfkf, typeface);
        }

        @Override // i1.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu */
        public void gxszxtbevo(int i13) {
        }
    }

    static class ppxfxbqfkf {
        static LocaleList iobyxmoadg(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void zoijcleaow(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class wkgbmnqykc {
        static int iobyxmoadg(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void ppxfxbqfkf(TextView textView, int[] iArr, int i13) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
        }

        static boolean wkgbmnqykc(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }

        static void zoijcleaow(TextView textView, int i13, int i14, int i15, int i16) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
        }
    }

    class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f3516jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Typeface f3517yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ TextView f3518zdlpuopuiu;

        zoijcleaow(TextView textView, Typeface typeface, int i13) {
            this.f3518zdlpuopuiu = textView;
            this.f3517yggfygwlhe = typeface;
            this.f3516jyumaefscl = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3518zdlpuopuiu.setTypeface(this.f3517yggfygwlhe, this.f3516jyumaefscl);
        }
    }

    zdlpuopuiu(TextView textView) {
        this.f3504iobyxmoadg = textView;
        this.f3500dxjokdxxww = new yggfygwlhe(textView);
    }

    private void esjtqupxsv(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f3504iobyxmoadg.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f3504iobyxmoadg;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f3504iobyxmoadg.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f3504iobyxmoadg.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f3504iobyxmoadg.getCompoundDrawables();
        TextView textView2 = this.f3504iobyxmoadg;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void iobyxmoadg(Drawable drawable, kegysxyocb kegysxyocbVar) {
        if (drawable == null || kegysxyocbVar == null) {
            return;
        }
        nufgyqmvbu.dxjokdxxww(drawable, kegysxyocbVar, this.f3504iobyxmoadg.getDrawableState());
    }

    private void istkbnxepw(Context context, mbcevpiqjq mbcevpiqjqVar) {
        String strOjitshcjhn;
        this.f3498btonecajqb = mbcevpiqjqVar.gtknphoqwx(lqeggnwhkg.btonecajqb.TextAppearance_android_textStyle, this.f3498btonecajqb);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            int iGtknphoqwx = mbcevpiqjqVar.gtknphoqwx(lqeggnwhkg.btonecajqb.TextAppearance_android_textFontWeight, -1);
            this.f3502gtknphoqwx = iGtknphoqwx;
            if (iGtknphoqwx != -1) {
                this.f3498btonecajqb &= 2;
            }
        }
        if (!mbcevpiqjqVar.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_android_fontFamily) && !mbcevpiqjqVar.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_fontFamily)) {
            if (mbcevpiqjqVar.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_android_typeface)) {
                this.f3508wflxmlrfwp = false;
                int iGtknphoqwx2 = mbcevpiqjqVar.gtknphoqwx(lqeggnwhkg.btonecajqb.TextAppearance_android_typeface, 1);
                if (iGtknphoqwx2 == 1) {
                    this.f3499draadjrbmk = Typeface.SANS_SERIF;
                    return;
                } else if (iGtknphoqwx2 == 2) {
                    this.f3499draadjrbmk = Typeface.SERIF;
                    return;
                } else {
                    if (iGtknphoqwx2 != 3) {
                        return;
                    }
                    this.f3499draadjrbmk = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3499draadjrbmk = null;
        int i14 = mbcevpiqjqVar.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_fontFamily) ? lqeggnwhkg.btonecajqb.TextAppearance_fontFamily : lqeggnwhkg.btonecajqb.TextAppearance_android_fontFamily;
        int i15 = this.f3502gtknphoqwx;
        int i16 = this.f3498btonecajqb;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceBtonecajqb = mbcevpiqjqVar.btonecajqb(i14, this.f3498btonecajqb, new iobyxmoadg(i15, i16, new WeakReference(this.f3504iobyxmoadg)));
                if (typefaceBtonecajqb != null) {
                    if (i13 < 28 || this.f3502gtknphoqwx == -1) {
                        this.f3499draadjrbmk = typefaceBtonecajqb;
                    } else {
                        this.f3499draadjrbmk = eablkybsjg.iobyxmoadg(Typeface.create(typefaceBtonecajqb, 0), this.f3502gtknphoqwx, (this.f3498btonecajqb & 2) != 0);
                    }
                }
                this.f3508wflxmlrfwp = this.f3499draadjrbmk == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3499draadjrbmk != null || (strOjitshcjhn = mbcevpiqjqVar.ojitshcjhn(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3502gtknphoqwx == -1) {
            this.f3499draadjrbmk = Typeface.create(strOjitshcjhn, this.f3498btonecajqb);
        } else {
            this.f3499draadjrbmk = eablkybsjg.iobyxmoadg(Typeface.create(strOjitshcjhn, 0), this.f3502gtknphoqwx, (this.f3498btonecajqb & 2) != 0);
        }
    }

    private void lereixgezr() {
        kegysxyocb kegysxyocbVar = this.f3506nufgyqmvbu;
        this.f3510zoijcleaow = kegysxyocbVar;
        this.f3507ppxfxbqfkf = kegysxyocbVar;
        this.f3509wkgbmnqykc = kegysxyocbVar;
        this.f3501eablkybsjg = kegysxyocbVar;
        this.f3503gxszxtbevo = kegysxyocbVar;
        this.f3505lqeggnwhkg = kegysxyocbVar;
    }

    private static kegysxyocb wkgbmnqykc(Context context, nufgyqmvbu nufgyqmvbuVar, int i13) {
        ColorStateList colorStateListGxszxtbevo = nufgyqmvbuVar.gxszxtbevo(context, i13);
        if (colorStateListGxszxtbevo == null) {
            return null;
        }
        kegysxyocb kegysxyocbVar = new kegysxyocb();
        kegysxyocbVar.f3357wkgbmnqykc = true;
        kegysxyocbVar.f3355iobyxmoadg = colorStateListGxszxtbevo;
        return kegysxyocbVar;
    }

    private void zynmafqrjb(int i13, float f13) {
        this.f3500dxjokdxxww.zdlpuopuiu(i13, f13);
    }

    void agtfadlqog(WeakReference weakReference, Typeface typeface) {
        if (this.f3508wflxmlrfwp) {
            this.f3499draadjrbmk = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new zoijcleaow(textView, typeface, this.f3498btonecajqb));
                } else {
                    textView.setTypeface(typeface, this.f3498btonecajqb);
                }
            }
        }
    }

    ColorStateList btonecajqb() {
        kegysxyocb kegysxyocbVar = this.f3506nufgyqmvbu;
        if (kegysxyocbVar != null) {
            return kegysxyocbVar.f3355iobyxmoadg;
        }
        return null;
    }

    void cqumvgiudr(PorterDuff.Mode mode) {
        if (this.f3506nufgyqmvbu == null) {
            this.f3506nufgyqmvbu = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3506nufgyqmvbu;
        kegysxyocbVar.f3358zoijcleaow = mode;
        kegysxyocbVar.f3356ppxfxbqfkf = mode != null;
        lereixgezr();
    }

    boolean draadjrbmk() {
        return this.f3500dxjokdxxww.agtfadlqog();
    }

    int dxjokdxxww() {
        return this.f3500dxjokdxxww.btonecajqb();
    }

    int eablkybsjg() {
        return this.f3500dxjokdxxww.gxszxtbevo();
    }

    PorterDuff.Mode gtknphoqwx() {
        kegysxyocb kegysxyocbVar = this.f3506nufgyqmvbu;
        if (kegysxyocbVar != null) {
            return kegysxyocbVar.f3358zoijcleaow;
        }
        return null;
    }

    int gxszxtbevo() {
        return this.f3500dxjokdxxww.lqeggnwhkg();
    }

    void iwizpuwonk(ColorStateList colorStateList) {
        if (this.f3506nufgyqmvbu == null) {
            this.f3506nufgyqmvbu = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3506nufgyqmvbu;
        kegysxyocbVar.f3355iobyxmoadg = colorStateList;
        kegysxyocbVar.f3357wkgbmnqykc = colorStateList != null;
        lereixgezr();
    }

    void jyumaefscl(int i13) {
        this.f3500dxjokdxxww.oxmwwwfdhm(i13);
    }

    void kcexrzcfyt(boolean z13) {
        this.f3504iobyxmoadg.setAllCaps(z13);
    }

    int lqeggnwhkg() {
        return this.f3500dxjokdxxww.nufgyqmvbu();
    }

    int[] nufgyqmvbu() {
        return this.f3500dxjokdxxww.dxjokdxxww();
    }

    void ojitshcjhn(boolean z13, int i13, int i14, int i15, int i16) {
        if (vipkmwdibw.f3402ppxfxbqfkf) {
            return;
        }
        ppxfxbqfkf();
    }

    void oxmwwwfdhm(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        y1.iobyxmoadg.eablkybsjg(editorInfo, textView.getText());
    }

    void pmvmpeiblj(int i13, float f13) {
        if (vipkmwdibw.f3402ppxfxbqfkf || draadjrbmk()) {
            return;
        }
        zynmafqrjb(i13, f13);
    }

    void ppxfxbqfkf() {
        this.f3500dxjokdxxww.iobyxmoadg();
    }

    void rgvfuqvkyq() {
        zoijcleaow();
    }

    void vdvldrhtss(Context context, int i13) {
        String strOjitshcjhn;
        mbcevpiqjq mbcevpiqjqVarZdlpuopuiu = mbcevpiqjq.zdlpuopuiu(context, i13, lqeggnwhkg.btonecajqb.TextAppearance);
        if (mbcevpiqjqVarZdlpuopuiu.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps)) {
            kcexrzcfyt(mbcevpiqjqVarZdlpuopuiu.iobyxmoadg(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps, false));
        }
        if (mbcevpiqjqVarZdlpuopuiu.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize) && mbcevpiqjqVarZdlpuopuiu.gxszxtbevo(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize, -1) == 0) {
            this.f3504iobyxmoadg.setTextSize(0, 0.0f);
        }
        istkbnxepw(context, mbcevpiqjqVarZdlpuopuiu);
        if (mbcevpiqjqVarZdlpuopuiu.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_fontVariationSettings) && (strOjitshcjhn = mbcevpiqjqVarZdlpuopuiu.ojitshcjhn(lqeggnwhkg.btonecajqb.TextAppearance_fontVariationSettings)) != null) {
            wkgbmnqykc.wkgbmnqykc(this.f3504iobyxmoadg, strOjitshcjhn);
        }
        mbcevpiqjqVarZdlpuopuiu.cqumvgiudr();
        Typeface typeface = this.f3499draadjrbmk;
        if (typeface != null) {
            this.f3504iobyxmoadg.setTypeface(typeface, this.f3498btonecajqb);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0293  */
    /* JADX WARN: Code duplicated, block: B:125:0x029a  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    void wflxmlrfwp(AttributeSet attributeSet, int i13) {
        boolean zIobyxmoadg;
        boolean z13;
        String strOjitshcjhn;
        String strOjitshcjhn2;
        float fGxszxtbevo;
        int iIobyxmoadg;
        Context context = this.f3504iobyxmoadg.getContext();
        nufgyqmvbu nufgyqmvbuVarZoijcleaow = nufgyqmvbu.zoijcleaow();
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.AppCompatTextHelper, i13, 0);
        TextView textView = this.f3504iobyxmoadg;
        jhduphickx.sflfametgt(textView, textView.getContext(), lqeggnwhkg.btonecajqb.AppCompatTextHelper, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        int iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_textAppearance, -1);
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableLeft)) {
            this.f3510zoijcleaow = wkgbmnqykc(context, nufgyqmvbuVarZoijcleaow, mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableTop)) {
            this.f3507ppxfxbqfkf = wkgbmnqykc(context, nufgyqmvbuVarZoijcleaow, mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableRight)) {
            this.f3509wkgbmnqykc = wkgbmnqykc(context, nufgyqmvbuVarZoijcleaow, mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableBottom)) {
            this.f3501eablkybsjg = wkgbmnqykc(context, nufgyqmvbuVarZoijcleaow, mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableStart)) {
            this.f3503gxszxtbevo = wkgbmnqykc(context, nufgyqmvbuVarZoijcleaow, mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableEnd)) {
            this.f3505lqeggnwhkg = wkgbmnqykc(context, nufgyqmvbuVarZoijcleaow, mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextHelper_android_drawableEnd, 0));
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        boolean z14 = this.f3504iobyxmoadg.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z15 = true;
        if (iAgtfadlqog != -1) {
            mbcevpiqjq mbcevpiqjqVarZdlpuopuiu = mbcevpiqjq.zdlpuopuiu(context, iAgtfadlqog, lqeggnwhkg.btonecajqb.TextAppearance);
            if (z14 || !mbcevpiqjqVarZdlpuopuiu.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps)) {
                zIobyxmoadg = false;
                z13 = false;
            } else {
                zIobyxmoadg = mbcevpiqjqVarZdlpuopuiu.iobyxmoadg(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps, false);
                z13 = true;
            }
            istkbnxepw(context, mbcevpiqjqVarZdlpuopuiu);
            strOjitshcjhn = mbcevpiqjqVarZdlpuopuiu.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_textLocale) ? mbcevpiqjqVarZdlpuopuiu.ojitshcjhn(lqeggnwhkg.btonecajqb.TextAppearance_textLocale) : null;
            strOjitshcjhn2 = mbcevpiqjqVarZdlpuopuiu.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_fontVariationSettings) ? mbcevpiqjqVarZdlpuopuiu.ojitshcjhn(lqeggnwhkg.btonecajqb.TextAppearance_fontVariationSettings) : null;
            mbcevpiqjqVarZdlpuopuiu.cqumvgiudr();
        } else {
            zIobyxmoadg = false;
            z13 = false;
            strOjitshcjhn = null;
            strOjitshcjhn2 = null;
        }
        mbcevpiqjq mbcevpiqjqVarJyumaefscl2 = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.TextAppearance, i13, 0);
        if (z14 || !mbcevpiqjqVarJyumaefscl2.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps)) {
            z15 = z13;
        } else {
            zIobyxmoadg = mbcevpiqjqVarJyumaefscl2.iobyxmoadg(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps, false);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (mbcevpiqjqVarJyumaefscl2.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_textLocale)) {
            strOjitshcjhn = mbcevpiqjqVarJyumaefscl2.ojitshcjhn(lqeggnwhkg.btonecajqb.TextAppearance_textLocale);
        }
        if (mbcevpiqjqVarJyumaefscl2.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_fontVariationSettings)) {
            strOjitshcjhn2 = mbcevpiqjqVarJyumaefscl2.ojitshcjhn(lqeggnwhkg.btonecajqb.TextAppearance_fontVariationSettings);
        }
        if (i14 >= 28 && mbcevpiqjqVarJyumaefscl2.kcexrzcfyt(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize) && mbcevpiqjqVarJyumaefscl2.gxszxtbevo(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize, -1) == 0) {
            this.f3504iobyxmoadg.setTextSize(0, 0.0f);
        }
        istkbnxepw(context, mbcevpiqjqVarJyumaefscl2);
        mbcevpiqjqVarJyumaefscl2.cqumvgiudr();
        if (!z14 && z15) {
            kcexrzcfyt(zIobyxmoadg);
        }
        Typeface typeface = this.f3499draadjrbmk;
        if (typeface != null) {
            if (this.f3502gtknphoqwx == -1) {
                this.f3504iobyxmoadg.setTypeface(typeface, this.f3498btonecajqb);
            } else {
                this.f3504iobyxmoadg.setTypeface(typeface);
            }
        }
        if (strOjitshcjhn2 != null) {
            wkgbmnqykc.wkgbmnqykc(this.f3504iobyxmoadg, strOjitshcjhn2);
        }
        if (strOjitshcjhn != null) {
            ppxfxbqfkf.zoijcleaow(this.f3504iobyxmoadg, ppxfxbqfkf.iobyxmoadg(strOjitshcjhn));
        }
        this.f3500dxjokdxxww.ojitshcjhn(attributeSet, i13);
        if (vipkmwdibw.f3402ppxfxbqfkf && this.f3500dxjokdxxww.btonecajqb() != 0) {
            int[] iArrDxjokdxxww = this.f3500dxjokdxxww.dxjokdxxww();
            if (iArrDxjokdxxww.length > 0) {
                if (wkgbmnqykc.iobyxmoadg(this.f3504iobyxmoadg) != -1.0f) {
                    wkgbmnqykc.zoijcleaow(this.f3504iobyxmoadg, this.f3500dxjokdxxww.lqeggnwhkg(), this.f3500dxjokdxxww.gxszxtbevo(), this.f3500dxjokdxxww.nufgyqmvbu(), 0);
                } else {
                    wkgbmnqykc.ppxfxbqfkf(this.f3504iobyxmoadg, iArrDxjokdxxww, 0);
                }
            }
        }
        mbcevpiqjq mbcevpiqjqVarYggfygwlhe = mbcevpiqjq.yggfygwlhe(context, attributeSet, lqeggnwhkg.btonecajqb.AppCompatTextView);
        int iAgtfadlqog2 = mbcevpiqjqVarYggfygwlhe.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawablePpxfxbqfkf = iAgtfadlqog2 != -1 ? nufgyqmvbuVarZoijcleaow.ppxfxbqfkf(context, iAgtfadlqog2) : null;
        int iAgtfadlqog3 = mbcevpiqjqVarYggfygwlhe.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawablePpxfxbqfkf2 = iAgtfadlqog3 != -1 ? nufgyqmvbuVarZoijcleaow.ppxfxbqfkf(context, iAgtfadlqog3) : null;
        int iAgtfadlqog4 = mbcevpiqjqVarYggfygwlhe.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawablePpxfxbqfkf3 = iAgtfadlqog4 != -1 ? nufgyqmvbuVarZoijcleaow.ppxfxbqfkf(context, iAgtfadlqog4) : null;
        int iAgtfadlqog5 = mbcevpiqjqVarYggfygwlhe.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawablePpxfxbqfkf4 = iAgtfadlqog5 != -1 ? nufgyqmvbuVarZoijcleaow.ppxfxbqfkf(context, iAgtfadlqog5) : null;
        int iAgtfadlqog6 = mbcevpiqjqVarYggfygwlhe.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawablePpxfxbqfkf5 = iAgtfadlqog6 != -1 ? nufgyqmvbuVarZoijcleaow.ppxfxbqfkf(context, iAgtfadlqog6) : null;
        int iAgtfadlqog7 = mbcevpiqjqVarYggfygwlhe.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableEndCompat, -1);
        esjtqupxsv(drawablePpxfxbqfkf, drawablePpxfxbqfkf2, drawablePpxfxbqfkf3, drawablePpxfxbqfkf4, drawablePpxfxbqfkf5, iAgtfadlqog7 != -1 ? nufgyqmvbuVarZoijcleaow.ppxfxbqfkf(context, iAgtfadlqog7) : null);
        if (mbcevpiqjqVarYggfygwlhe.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableTint)) {
            androidx.core.widget.dxjokdxxww.nufgyqmvbu(this.f3504iobyxmoadg, mbcevpiqjqVarYggfygwlhe.ppxfxbqfkf(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableTint));
        }
        if (mbcevpiqjqVarYggfygwlhe.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableTintMode)) {
            androidx.core.widget.dxjokdxxww.dxjokdxxww(this.f3504iobyxmoadg, yadqdtsiqt.eablkybsjg(mbcevpiqjqVarYggfygwlhe.gtknphoqwx(lqeggnwhkg.btonecajqb.AppCompatTextView_drawableTintMode, -1), null));
        }
        int iGxszxtbevo = mbcevpiqjqVarYggfygwlhe.gxszxtbevo(lqeggnwhkg.btonecajqb.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iGxszxtbevo2 = mbcevpiqjqVarYggfygwlhe.gxszxtbevo(lqeggnwhkg.btonecajqb.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (mbcevpiqjqVarYggfygwlhe.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatTextView_lineHeight)) {
            TypedValue typedValueIwizpuwonk = mbcevpiqjqVarYggfygwlhe.iwizpuwonk(lqeggnwhkg.btonecajqb.AppCompatTextView_lineHeight);
            if (typedValueIwizpuwonk == null || typedValueIwizpuwonk.type != 5) {
                fGxszxtbevo = mbcevpiqjqVarYggfygwlhe.gxszxtbevo(lqeggnwhkg.btonecajqb.AppCompatTextView_lineHeight, -1);
            } else {
                iIobyxmoadg = u1.btonecajqb.iobyxmoadg(typedValueIwizpuwonk.data);
                fGxszxtbevo = TypedValue.complexToFloat(typedValueIwizpuwonk.data);
            }
            mbcevpiqjqVarYggfygwlhe.cqumvgiudr();
            if (iGxszxtbevo != -1) {
                androidx.core.widget.dxjokdxxww.gtknphoqwx(this.f3504iobyxmoadg, iGxszxtbevo);
            }
            if (iGxszxtbevo2 != -1) {
                androidx.core.widget.dxjokdxxww.draadjrbmk(this.f3504iobyxmoadg, iGxszxtbevo2);
            }
            if (fGxszxtbevo != -1.0f) {
                if (iIobyxmoadg == -1) {
                    androidx.core.widget.dxjokdxxww.wflxmlrfwp(this.f3504iobyxmoadg, (int) fGxszxtbevo);
                } else {
                    androidx.core.widget.dxjokdxxww.agtfadlqog(this.f3504iobyxmoadg, iIobyxmoadg, fGxszxtbevo);
                }
            }
        }
        fGxszxtbevo = -1.0f;
        iIobyxmoadg = -1;
        mbcevpiqjqVarYggfygwlhe.cqumvgiudr();
        if (iGxszxtbevo != -1) {
            androidx.core.widget.dxjokdxxww.gtknphoqwx(this.f3504iobyxmoadg, iGxszxtbevo);
        }
        if (iGxszxtbevo2 != -1) {
            androidx.core.widget.dxjokdxxww.draadjrbmk(this.f3504iobyxmoadg, iGxszxtbevo2);
        }
        if (fGxszxtbevo != -1.0f) {
            if (iIobyxmoadg == -1) {
                androidx.core.widget.dxjokdxxww.wflxmlrfwp(this.f3504iobyxmoadg, (int) fGxszxtbevo);
            } else {
                androidx.core.widget.dxjokdxxww.agtfadlqog(this.f3504iobyxmoadg, iIobyxmoadg, fGxszxtbevo);
            }
        }
    }

    void yggfygwlhe(int[] iArr, int i13) {
        this.f3500dxjokdxxww.vdvldrhtss(iArr, i13);
    }

    void zdlpuopuiu(int i13, int i14, int i15, int i16) {
        this.f3500dxjokdxxww.rgvfuqvkyq(i13, i14, i15, i16);
    }

    void zoijcleaow() {
        if (this.f3510zoijcleaow != null || this.f3507ppxfxbqfkf != null || this.f3509wkgbmnqykc != null || this.f3501eablkybsjg != null) {
            Drawable[] compoundDrawables = this.f3504iobyxmoadg.getCompoundDrawables();
            iobyxmoadg(compoundDrawables[0], this.f3510zoijcleaow);
            iobyxmoadg(compoundDrawables[1], this.f3507ppxfxbqfkf);
            iobyxmoadg(compoundDrawables[2], this.f3509wkgbmnqykc);
            iobyxmoadg(compoundDrawables[3], this.f3501eablkybsjg);
        }
        if (this.f3503gxszxtbevo == null && this.f3505lqeggnwhkg == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f3504iobyxmoadg.getCompoundDrawablesRelative();
        iobyxmoadg(compoundDrawablesRelative[0], this.f3503gxszxtbevo);
        iobyxmoadg(compoundDrawablesRelative[2], this.f3505lqeggnwhkg);
    }
}
