package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.mbcevpiqjq;
import com.google.android.material.internal.CheckableImageButton;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class lereixgezr extends LinearLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private ColorStateList f23323cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private PorterDuff.Mode f23324esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f23325istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final CheckableImageButton f23326iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private CharSequence f23327jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f23328lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ImageView.ScaleType f23329pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final TextView f23330yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final TextInputLayout f23331zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private View.OnLongClickListener f23332zynmafqrjb;

    lereixgezr(TextInputLayout textInputLayout, mbcevpiqjq mbcevpiqjqVar) {
        super(textInputLayout.getContext());
        this.f23331zdlpuopuiu = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(da.nufgyqmvbu.design_text_input_start_icon, (ViewGroup) this, false);
        this.f23326iwizpuwonk = checkableImageButton;
        zdlpuopuiu.eablkybsjg(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f23330yggfygwlhe = appCompatTextView;
        btonecajqb(mbcevpiqjqVar);
        dxjokdxxww(mbcevpiqjqVar);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void btonecajqb(mbcevpiqjq mbcevpiqjqVar) {
        if (oa.ppxfxbqfkf.nufgyqmvbu(getContext())) {
            v1.iwizpuwonk.ppxfxbqfkf((ViewGroup.MarginLayoutParams) this.f23326iwizpuwonk.getLayoutParams(), 0);
        }
        yggfygwlhe(null);
        jyumaefscl(null);
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_startIconTint)) {
            this.f23323cqumvgiudr = oa.ppxfxbqfkf.zoijcleaow(getContext(), mbcevpiqjqVar, da.draadjrbmk.TextInputLayout_startIconTint);
        }
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_startIconTintMode)) {
            this.f23324esjtqupxsv = com.google.android.material.internal.ojitshcjhn.btonecajqb(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_startIconTintMode, -1), null);
        }
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_startIconDrawable)) {
            kcexrzcfyt(mbcevpiqjqVar.lqeggnwhkg(da.draadjrbmk.TextInputLayout_startIconDrawable));
            if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_startIconContentDescription)) {
                oxmwwwfdhm(mbcevpiqjqVar.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_startIconContentDescription));
            }
            vdvldrhtss(mbcevpiqjqVar.iobyxmoadg(da.draadjrbmk.TextInputLayout_startIconCheckable, true));
        }
        zdlpuopuiu(mbcevpiqjqVar.gxszxtbevo(da.draadjrbmk.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(da.wkgbmnqykc.mtrl_min_touch_target_size)));
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_startIconScaleType)) {
            iwizpuwonk(zdlpuopuiu.zoijcleaow(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void dxjokdxxww(mbcevpiqjq mbcevpiqjqVar) {
        this.f23330yggfygwlhe.setVisibility(8);
        this.f23330yggfygwlhe.setId(da.gxszxtbevo.textinput_prefix_text);
        this.f23330yggfygwlhe.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        jhduphickx.opjhrmiecq(this.f23330yggfygwlhe, 1);
        ojitshcjhn(mbcevpiqjqVar.agtfadlqog(da.draadjrbmk.TextInputLayout_prefixTextAppearance, 0));
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_prefixTextColor)) {
            rgvfuqvkyq(mbcevpiqjqVar.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_prefixTextColor));
        }
        agtfadlqog(mbcevpiqjqVar.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_prefixText));
    }

    private void istkbnxepw() {
        int i13 = (this.f23327jyumaefscl == null || this.f23325istkbnxepw) ? 8 : 0;
        setVisibility((this.f23326iwizpuwonk.getVisibility() == 0 || i13 == 0) ? 0 : 8);
        this.f23330yggfygwlhe.setVisibility(i13);
        this.f23331zdlpuopuiu.oipsdeybqn();
    }

    void agtfadlqog(CharSequence charSequence) {
        this.f23327jyumaefscl = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f23330yggfygwlhe.setText(charSequence);
        istkbnxepw();
    }

    void cqumvgiudr(ColorStateList colorStateList) {
        if (this.f23323cqumvgiudr != colorStateList) {
            this.f23323cqumvgiudr = colorStateList;
            zdlpuopuiu.iobyxmoadg(this.f23331zdlpuopuiu, this.f23326iwizpuwonk, colorStateList, this.f23324esjtqupxsv);
        }
    }

    void draadjrbmk(boolean z13) {
        this.f23325istkbnxepw = z13;
        istkbnxepw();
    }

    CharSequence eablkybsjg() {
        return this.f23326iwizpuwonk.getContentDescription();
    }

    void esjtqupxsv(PorterDuff.Mode mode) {
        if (this.f23324esjtqupxsv != mode) {
            this.f23324esjtqupxsv = mode;
            zdlpuopuiu.iobyxmoadg(this.f23331zdlpuopuiu, this.f23326iwizpuwonk, this.f23323cqumvgiudr, mode);
        }
    }

    boolean gtknphoqwx() {
        return this.f23326iwizpuwonk.getVisibility() == 0;
    }

    Drawable gxszxtbevo() {
        return this.f23326iwizpuwonk.getDrawable();
    }

    CharSequence iobyxmoadg() {
        return this.f23327jyumaefscl;
    }

    void iwizpuwonk(ImageView.ScaleType scaleType) {
        this.f23329pmvmpeiblj = scaleType;
        zdlpuopuiu.btonecajqb(this.f23326iwizpuwonk, scaleType);
    }

    void jyumaefscl(View.OnLongClickListener onLongClickListener) {
        this.f23332zynmafqrjb = onLongClickListener;
        zdlpuopuiu.dxjokdxxww(this.f23326iwizpuwonk, onLongClickListener);
    }

    void kcexrzcfyt(Drawable drawable) {
        this.f23326iwizpuwonk.setImageDrawable(drawable);
        if (drawable != null) {
            zdlpuopuiu.iobyxmoadg(this.f23331zdlpuopuiu, this.f23326iwizpuwonk, this.f23323cqumvgiudr, this.f23324esjtqupxsv);
            lereixgezr(true);
            wflxmlrfwp();
        } else {
            lereixgezr(false);
            yggfygwlhe(null);
            jyumaefscl(null);
            oxmwwwfdhm(null);
        }
    }

    void lereixgezr(boolean z13) {
        if (gtknphoqwx() != z13) {
            this.f23326iwizpuwonk.setVisibility(z13 ? 0 : 8);
            zynmafqrjb();
            istkbnxepw();
        }
    }

    int lqeggnwhkg() {
        return this.f23328lereixgezr;
    }

    ImageView.ScaleType nufgyqmvbu() {
        return this.f23329pmvmpeiblj;
    }

    void ojitshcjhn(int i13) {
        androidx.core.widget.dxjokdxxww.rgvfuqvkyq(this.f23330yggfygwlhe, i13);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        zynmafqrjb();
    }

    void oxmwwwfdhm(CharSequence charSequence) {
        if (eablkybsjg() != charSequence) {
            this.f23326iwizpuwonk.setContentDescription(charSequence);
        }
    }

    void pmvmpeiblj(w1.zdlpuopuiu zdlpuopuiuVar) {
        if (this.f23330yggfygwlhe.getVisibility() != 0) {
            zdlpuopuiuVar.krqnebusok(this.f23326iwizpuwonk);
        } else {
            zdlpuopuiuVar.auzgnhcxok(this.f23330yggfygwlhe);
            zdlpuopuiuVar.krqnebusok(this.f23330yggfygwlhe);
        }
    }

    int ppxfxbqfkf() {
        return jhduphickx.yadqdtsiqt(this) + jhduphickx.yadqdtsiqt(this.f23330yggfygwlhe) + (gtknphoqwx() ? this.f23326iwizpuwonk.getMeasuredWidth() + v1.iwizpuwonk.iobyxmoadg((ViewGroup.MarginLayoutParams) this.f23326iwizpuwonk.getLayoutParams()) : 0);
    }

    void rgvfuqvkyq(ColorStateList colorStateList) {
        this.f23330yggfygwlhe.setTextColor(colorStateList);
    }

    void vdvldrhtss(boolean z13) {
        this.f23326iwizpuwonk.setCheckable(z13);
    }

    void wflxmlrfwp() {
        zdlpuopuiu.wkgbmnqykc(this.f23331zdlpuopuiu, this.f23326iwizpuwonk, this.f23323cqumvgiudr);
    }

    TextView wkgbmnqykc() {
        return this.f23330yggfygwlhe;
    }

    void yggfygwlhe(View.OnClickListener onClickListener) {
        zdlpuopuiu.nufgyqmvbu(this.f23326iwizpuwonk, onClickListener, this.f23332zynmafqrjb);
    }

    void zdlpuopuiu(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i13 != this.f23328lereixgezr) {
            this.f23328lereixgezr = i13;
            zdlpuopuiu.lqeggnwhkg(this.f23326iwizpuwonk, i13);
        }
    }

    ColorStateList zoijcleaow() {
        return this.f23330yggfygwlhe.getTextColors();
    }

    void zynmafqrjb() {
        EditText editText = this.f23331zdlpuopuiu.f23224iwizpuwonk;
        if (editText == null) {
            return;
        }
        jhduphickx.lxfrhoxuzk(this.f23330yggfygwlhe, gtknphoqwx() ? 0 : jhduphickx.yadqdtsiqt(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(da.wkgbmnqykc.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
