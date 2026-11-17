package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
final class yggfygwlhe {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f23385agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f23386btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f23387cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Animator f23388draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private LinearLayout f23389dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final TimeInterpolator f23390eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private TextView f23391esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private FrameLayout f23392gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TimeInterpolator f23393gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f23394iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private CharSequence f23395iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ColorStateList f23396jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private CharSequence f23397kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f23398lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Context f23399lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final TextInputLayout f23400nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f23401ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private TextView f23402oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ColorStateList f23403pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f23404ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private CharSequence f23405rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f23406vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final float f23407wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final TimeInterpolator f23408wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f23409yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f23410zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f23411zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Typeface f23412zynmafqrjb;

    class iobyxmoadg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f23414iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ int f23415ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ TextView f23416wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ TextView f23417zoijcleaow;

        iobyxmoadg(int i13, TextView textView, int i14, TextView textView2) {
            this.f23414iobyxmoadg = i13;
            this.f23417zoijcleaow = textView;
            this.f23415ppxfxbqfkf = i14;
            this.f23416wkgbmnqykc = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            yggfygwlhe.this.f23385agtfadlqog = this.f23414iobyxmoadg;
            yggfygwlhe.this.f23388draadjrbmk = null;
            TextView textView = this.f23417zoijcleaow;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f23415ppxfxbqfkf == 1 && yggfygwlhe.this.f23402oxmwwwfdhm != null) {
                    yggfygwlhe.this.f23402oxmwwwfdhm.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f23416wkgbmnqykc;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f23416wkgbmnqykc.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f23416wkgbmnqykc;
            if (textView != null) {
                textView.setVisibility(0);
                this.f23416wkgbmnqykc.setAlpha(0.0f);
            }
        }
    }

    class zoijcleaow extends View.AccessibilityDelegate {
        zoijcleaow() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = yggfygwlhe.this.f23400nufgyqmvbu.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public yggfygwlhe(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f23399lqeggnwhkg = context;
        this.f23400nufgyqmvbu = textInputLayout;
        this.f23407wflxmlrfwp = context.getResources().getDimensionPixelSize(da.wkgbmnqykc.design_textinput_caption_translate_y);
        this.f23394iobyxmoadg = na.nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationShort4, 217);
        this.f23411zoijcleaow = na.nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationMedium4, 167);
        this.f23404ppxfxbqfkf = na.nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationShort4, 167);
        this.f23408wkgbmnqykc = na.nufgyqmvbu.lqeggnwhkg(context, da.zoijcleaow.motionEasingEmphasizedDecelerateInterpolator, ea.iobyxmoadg.f31022wkgbmnqykc);
        int i13 = da.zoijcleaow.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = ea.iobyxmoadg.f31020iobyxmoadg;
        this.f23390eablkybsjg = na.nufgyqmvbu.lqeggnwhkg(context, i13, timeInterpolator);
        this.f23393gxszxtbevo = na.nufgyqmvbu.lqeggnwhkg(context, da.zoijcleaow.motionEasingLinearInterpolator, timeInterpolator);
    }

    private ObjectAnimator btonecajqb(TextView textView, boolean z13) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z13 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z13 ? this.f23411zoijcleaow : this.f23404ppxfxbqfkf);
        objectAnimatorOfFloat.setInterpolator(z13 ? this.f23390eablkybsjg : this.f23393gxszxtbevo);
        return objectAnimatorOfFloat;
    }

    private void cdpycssgdh(int i13, int i14) {
        TextView textViewWflxmlrfwp;
        TextView textViewWflxmlrfwp2;
        if (i13 == i14) {
            return;
        }
        if (i14 != 0 && (textViewWflxmlrfwp2 = wflxmlrfwp(i14)) != null) {
            textViewWflxmlrfwp2.setVisibility(0);
            textViewWflxmlrfwp2.setAlpha(1.0f);
        }
        if (i13 != 0 && (textViewWflxmlrfwp = wflxmlrfwp(i13)) != null) {
            textViewWflxmlrfwp.setVisibility(4);
            if (i13 == 1) {
                textViewWflxmlrfwp.setText((CharSequence) null);
            }
        }
        this.f23385agtfadlqog = i14;
    }

    private void dsvhmnatus(ViewGroup viewGroup, int i13) {
        if (i13 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void dxjokdxxww(List list, boolean z13, TextView textView, int i13, int i14, int i15) {
        if (textView == null || !z13) {
            return;
        }
        if (i13 == i15 || i13 == i14) {
            ObjectAnimator objectAnimatorBtonecajqb = btonecajqb(textView, i15 == i13);
            if (i13 == i15 && i14 != 0) {
                objectAnimatorBtonecajqb.setStartDelay(this.f23404ppxfxbqfkf);
            }
            list.add(objectAnimatorBtonecajqb);
            if (i15 != i13 || i14 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorGtknphoqwx = gtknphoqwx(textView);
            objectAnimatorGtknphoqwx.setStartDelay(this.f23404ppxfxbqfkf);
            list.add(objectAnimatorGtknphoqwx);
        }
    }

    private boolean esjtqupxsv(int i13) {
        return (i13 != 1 || this.f23402oxmwwwfdhm == null || TextUtils.isEmpty(this.f23405rgvfuqvkyq)) ? false : true;
    }

    private ObjectAnimator gtknphoqwx(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f23407wflxmlrfwp, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f23394iobyxmoadg);
        objectAnimatorOfFloat.setInterpolator(this.f23408wkgbmnqykc);
        return objectAnimatorOfFloat;
    }

    private void hkdspvbjdz(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private int jyumaefscl(boolean z13, int i13, int i14) {
        return z13 ? this.f23399lqeggnwhkg.getResources().getDimensionPixelSize(i13) : i14;
    }

    private boolean lqeggnwhkg() {
        return (this.f23389dxjokdxxww == null || this.f23400nufgyqmvbu.getEditText() == null) ? false : true;
    }

    private void tzroggbefp(int i13, int i14, boolean z13) {
        if (i13 == i14) {
            return;
        }
        if (z13) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f23388draadjrbmk = animatorSet;
            ArrayList arrayList = new ArrayList();
            dxjokdxxww(arrayList, this.f23387cqumvgiudr, this.f23391esjtqupxsv, 2, i13, i14);
            dxjokdxxww(arrayList, this.f23406vdvldrhtss, this.f23402oxmwwwfdhm, 1, i13, i14);
            ea.zoijcleaow.iobyxmoadg(animatorSet, arrayList);
            animatorSet.addListener(new iobyxmoadg(i14, wflxmlrfwp(i13), i13, wflxmlrfwp(i14)));
            animatorSet.start();
        } else {
            cdpycssgdh(i13, i14);
        }
        this.f23400nufgyqmvbu.bfopjjpdmp();
        this.f23400nufgyqmvbu.zeieaojujs(z13);
        this.f23400nufgyqmvbu.iwxlajgraz();
    }

    private TextView wflxmlrfwp(int i13) {
        if (i13 == 1) {
            return this.f23402oxmwwwfdhm;
        }
        if (i13 != 2) {
            return null;
        }
        return this.f23391esjtqupxsv;
    }

    private boolean wypolnanlu(TextView textView, CharSequence charSequence) {
        return jhduphickx.tzroggbefp(this.f23400nufgyqmvbu) && this.f23400nufgyqmvbu.isEnabled() && !(this.f23401ojitshcjhn == this.f23385agtfadlqog && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    int agtfadlqog() {
        return this.f23410zdlpuopuiu;
    }

    void cllcsxoeiz(Typeface typeface) {
        if (typeface != this.f23412zynmafqrjb) {
            this.f23412zynmafqrjb = typeface;
            hkdspvbjdz(this.f23402oxmwwwfdhm, typeface);
            hkdspvbjdz(this.f23391esjtqupxsv, typeface);
        }
    }

    void cqumvgiudr() {
        nufgyqmvbu();
        int i13 = this.f23385agtfadlqog;
        if (i13 == 2) {
            this.f23401ojitshcjhn = 0;
        }
        tzroggbefp(i13, this.f23401ojitshcjhn, wypolnanlu(this.f23391esjtqupxsv, ""));
    }

    boolean draadjrbmk() {
        return esjtqupxsv(this.f23401ojitshcjhn);
    }

    void eablkybsjg(TextView textView, int i13) {
        if (this.f23389dxjokdxxww == null && this.f23392gtknphoqwx == null) {
            LinearLayout linearLayout = new LinearLayout(this.f23399lqeggnwhkg);
            this.f23389dxjokdxxww = linearLayout;
            linearLayout.setOrientation(0);
            this.f23400nufgyqmvbu.addView(this.f23389dxjokdxxww, -1, -2);
            this.f23392gtknphoqwx = new FrameLayout(this.f23399lqeggnwhkg);
            this.f23389dxjokdxxww.addView(this.f23392gtknphoqwx, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f23400nufgyqmvbu.getEditText() != null) {
                gxszxtbevo();
            }
        }
        if (lereixgezr(i13)) {
            this.f23392gtknphoqwx.setVisibility(0);
            this.f23392gtknphoqwx.addView(textView);
        } else {
            this.f23389dxjokdxxww.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f23389dxjokdxxww.setVisibility(0);
        this.f23386btonecajqb++;
    }

    void gxszxtbevo() {
        if (lqeggnwhkg()) {
            EditText editText = this.f23400nufgyqmvbu.getEditText();
            boolean zNufgyqmvbu = oa.ppxfxbqfkf.nufgyqmvbu(this.f23399lqeggnwhkg);
            jhduphickx.lxfrhoxuzk(this.f23389dxjokdxxww, jyumaefscl(zNufgyqmvbu, da.wkgbmnqykc.material_helper_text_font_1_3_padding_horizontal, jhduphickx.yadqdtsiqt(editText)), jyumaefscl(zNufgyqmvbu, da.wkgbmnqykc.material_helper_text_font_1_3_padding_top, this.f23399lqeggnwhkg.getResources().getDimensionPixelSize(da.wkgbmnqykc.material_helper_text_default_padding_top)), jyumaefscl(zNufgyqmvbu, da.wkgbmnqykc.material_helper_text_font_1_3_padding_horizontal, jhduphickx.cdpycssgdh(editText)), 0);
        }
    }

    void hcddaimhww(boolean z13) {
        if (this.f23387cqumvgiudr == z13) {
            return;
        }
        nufgyqmvbu();
        if (z13) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f23399lqeggnwhkg);
            this.f23391esjtqupxsv = appCompatTextView;
            appCompatTextView.setId(da.gxszxtbevo.textinput_helper_text);
            this.f23391esjtqupxsv.setTextAlignment(5);
            Typeface typeface = this.f23412zynmafqrjb;
            if (typeface != null) {
                this.f23391esjtqupxsv.setTypeface(typeface);
            }
            this.f23391esjtqupxsv.setVisibility(4);
            jhduphickx.opjhrmiecq(this.f23391esjtqupxsv, 1);
            pkzmftpjix(this.f23398lereixgezr);
            jpowsppfya(this.f23403pmvmpeiblj);
            eablkybsjg(this.f23391esjtqupxsv, 1);
            this.f23391esjtqupxsv.setAccessibilityDelegate(new zoijcleaow());
        } else {
            cqumvgiudr();
            istkbnxepw(this.f23391esjtqupxsv, 1);
            this.f23391esjtqupxsv = null;
            this.f23400nufgyqmvbu.bfopjjpdmp();
            this.f23400nufgyqmvbu.iwxlajgraz();
        }
        this.f23387cqumvgiudr = z13;
    }

    void iozdgvuglv(CharSequence charSequence) {
        this.f23397kcexrzcfyt = charSequence;
        TextView textView = this.f23402oxmwwwfdhm;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void istkbnxepw(TextView textView, int i13) {
        FrameLayout frameLayout;
        if (this.f23389dxjokdxxww == null) {
            return;
        }
        if (!lereixgezr(i13) || (frameLayout = this.f23392gtknphoqwx) == null) {
            this.f23389dxjokdxxww.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i14 = this.f23386btonecajqb - 1;
        this.f23386btonecajqb = i14;
        dsvhmnatus(this.f23389dxjokdxxww, i14);
    }

    void iwizpuwonk() {
        this.f23405rgvfuqvkyq = null;
        nufgyqmvbu();
        if (this.f23385agtfadlqog == 1) {
            if (!this.f23387cqumvgiudr || TextUtils.isEmpty(this.f23395iwizpuwonk)) {
                this.f23401ojitshcjhn = 0;
            } else {
                this.f23401ojitshcjhn = 2;
            }
        }
        tzroggbefp(this.f23385agtfadlqog, this.f23401ojitshcjhn, wypolnanlu(this.f23402oxmwwwfdhm, ""));
    }

    void jpowsppfya(ColorStateList colorStateList) {
        this.f23403pmvmpeiblj = colorStateList;
        TextView textView = this.f23391esjtqupxsv;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    CharSequence kcexrzcfyt() {
        return this.f23395iwizpuwonk;
    }

    void kegysxyocb(CharSequence charSequence) {
        nufgyqmvbu();
        this.f23395iwizpuwonk = charSequence;
        this.f23391esjtqupxsv.setText(charSequence);
        int i13 = this.f23385agtfadlqog;
        if (i13 != 2) {
            this.f23401ojitshcjhn = 2;
        }
        tzroggbefp(i13, this.f23401ojitshcjhn, wypolnanlu(this.f23391esjtqupxsv, charSequence));
    }

    boolean lereixgezr(int i13) {
        return i13 == 0 || i13 == 1;
    }

    void lmojexxdyd(boolean z13) {
        if (this.f23406vdvldrhtss == z13) {
            return;
        }
        nufgyqmvbu();
        if (z13) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f23399lqeggnwhkg);
            this.f23402oxmwwwfdhm = appCompatTextView;
            appCompatTextView.setId(da.gxszxtbevo.textinput_error);
            this.f23402oxmwwwfdhm.setTextAlignment(5);
            Typeface typeface = this.f23412zynmafqrjb;
            if (typeface != null) {
                this.f23402oxmwwwfdhm.setTypeface(typeface);
            }
            wwaezpbzkn(this.f23409yggfygwlhe);
            ylkuphrtab(this.f23396jyumaefscl);
            iozdgvuglv(this.f23397kcexrzcfyt);
            yadqdtsiqt(this.f23410zdlpuopuiu);
            this.f23402oxmwwwfdhm.setVisibility(4);
            eablkybsjg(this.f23402oxmwwwfdhm, 0);
        } else {
            iwizpuwonk();
            istkbnxepw(this.f23402oxmwwwfdhm, 0);
            this.f23402oxmwwwfdhm = null;
            this.f23400nufgyqmvbu.bfopjjpdmp();
            this.f23400nufgyqmvbu.iwxlajgraz();
        }
        this.f23406vdvldrhtss = z13;
    }

    void nufgyqmvbu() {
        Animator animator = this.f23388draadjrbmk;
        if (animator != null) {
            animator.cancel();
        }
    }

    CharSequence ojitshcjhn() {
        return this.f23397kcexrzcfyt;
    }

    ColorStateList oxmwwwfdhm() {
        TextView textView = this.f23402oxmwwwfdhm;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    void pkzmftpjix(int i13) {
        this.f23398lereixgezr = i13;
        TextView textView = this.f23391esjtqupxsv;
        if (textView != null) {
            androidx.core.widget.dxjokdxxww.rgvfuqvkyq(textView, i13);
        }
    }

    boolean pmvmpeiblj() {
        return this.f23406vdvldrhtss;
    }

    CharSequence rgvfuqvkyq() {
        return this.f23405rgvfuqvkyq;
    }

    void stevsuqkhv(CharSequence charSequence) {
        nufgyqmvbu();
        this.f23405rgvfuqvkyq = charSequence;
        this.f23402oxmwwwfdhm.setText(charSequence);
        int i13 = this.f23385agtfadlqog;
        if (i13 != 1) {
            this.f23401ojitshcjhn = 1;
        }
        tzroggbefp(i13, this.f23401ojitshcjhn, wypolnanlu(this.f23402oxmwwwfdhm, charSequence));
    }

    int vdvldrhtss() {
        TextView textView = this.f23402oxmwwwfdhm;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void wwaezpbzkn(int i13) {
        this.f23409yggfygwlhe = i13;
        TextView textView = this.f23402oxmwwwfdhm;
        if (textView != null) {
            this.f23400nufgyqmvbu.ikoacuggdj(textView, i13);
        }
    }

    void yadqdtsiqt(int i13) {
        this.f23410zdlpuopuiu = i13;
        TextView textView = this.f23402oxmwwwfdhm;
        if (textView != null) {
            jhduphickx.opjhrmiecq(textView, i13);
        }
    }

    int yggfygwlhe() {
        TextView textView = this.f23391esjtqupxsv;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void ylkuphrtab(ColorStateList colorStateList) {
        this.f23396jyumaefscl = colorStateList;
        TextView textView = this.f23402oxmwwwfdhm;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    View zdlpuopuiu() {
        return this.f23391esjtqupxsv;
    }

    boolean zynmafqrjb() {
        return this.f23387cqumvgiudr;
    }
}
