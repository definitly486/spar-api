package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
class gxszxtbevo extends kcexrzcfyt {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final View.OnClickListener f23295btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private AnimatorSet f23296draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private EditText f23297dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f23298eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final View.OnFocusChangeListener f23299gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f23300gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final TimeInterpolator f23301lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final TimeInterpolator f23302nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private ValueAnimator f23303wflxmlrfwp;

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            gxszxtbevo.this.f23322zoijcleaow.vipkmwdibw(true);
        }
    }

    class zoijcleaow extends AnimatorListenerAdapter {
        zoijcleaow() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gxszxtbevo.this.f23322zoijcleaow.vipkmwdibw(false);
        }
    }

    gxszxtbevo(oxmwwwfdhm oxmwwwfdhmVar) {
        super(oxmwwwfdhmVar);
        this.f23295btonecajqb = new View.OnClickListener() { // from class: com.google.android.material.textfield.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23306zdlpuopuiu.lmojexxdyd(view);
            }
        };
        this.f23299gtknphoqwx = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.zoijcleaow
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                this.f23419iobyxmoadg.wwaezpbzkn(view, z13);
            }
        };
        this.f23298eablkybsjg = na.nufgyqmvbu.gxszxtbevo(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionDurationShort3, 100);
        this.f23300gxszxtbevo = na.nufgyqmvbu.gxszxtbevo(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionDurationShort3, 150);
        this.f23301lqeggnwhkg = na.nufgyqmvbu.lqeggnwhkg(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionEasingLinearInterpolator, ea.iobyxmoadg.f31020iobyxmoadg);
        this.f23302nufgyqmvbu = na.nufgyqmvbu.lqeggnwhkg(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionEasingEmphasizedInterpolator, ea.iobyxmoadg.f31022wkgbmnqykc);
    }

    private void cdpycssgdh() {
        ValueAnimator valueAnimatorIstkbnxepw = istkbnxepw();
        ValueAnimator valueAnimatorZynmafqrjb = zynmafqrjb(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f23296draadjrbmk = animatorSet;
        animatorSet.playTogether(valueAnimatorIstkbnxepw, valueAnimatorZynmafqrjb);
        this.f23296draadjrbmk.addListener(new iobyxmoadg());
        ValueAnimator valueAnimatorZynmafqrjb2 = zynmafqrjb(1.0f, 0.0f);
        this.f23303wflxmlrfwp = valueAnimatorZynmafqrjb2;
        valueAnimatorZynmafqrjb2.addListener(new zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iozdgvuglv(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f23321wkgbmnqykc.setScaleX(fFloatValue);
        this.f23321wkgbmnqykc.setScaleY(fFloatValue);
    }

    private ValueAnimator istkbnxepw() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f23302nufgyqmvbu);
        valueAnimatorOfFloat.setDuration(this.f23300gxszxtbevo);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.eablkybsjg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23290iobyxmoadg.iozdgvuglv(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lmojexxdyd(View view) {
        EditText editText = this.f23297dxjokdxxww;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        oxmwwwfdhm();
    }

    private boolean pkzmftpjix() {
        EditText editText = this.f23297dxjokdxxww;
        return editText != null && (editText.hasFocus() || this.f23321wkgbmnqykc.hasFocus()) && this.f23297dxjokdxxww.getText().length() > 0;
    }

    private void pmvmpeiblj(boolean z13) {
        boolean z14 = this.f23322zoijcleaow.iozdgvuglv() == z13;
        if (z13 && !this.f23296draadjrbmk.isRunning()) {
            this.f23303wflxmlrfwp.cancel();
            this.f23296draadjrbmk.start();
            if (z14) {
                this.f23296draadjrbmk.end();
                return;
            }
            return;
        }
        if (z13) {
            return;
        }
        this.f23296draadjrbmk.cancel();
        this.f23303wflxmlrfwp.start();
        if (z14) {
            this.f23303wflxmlrfwp.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wwaezpbzkn(View view, boolean z13) {
        pmvmpeiblj(pkzmftpjix());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yadqdtsiqt(ValueAnimator valueAnimator) {
        this.f23321wkgbmnqykc.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ylkuphrtab() {
        pmvmpeiblj(true);
    }

    private ValueAnimator zynmafqrjb(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f23301lqeggnwhkg);
        valueAnimatorOfFloat.setDuration(this.f23298eablkybsjg);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ppxfxbqfkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23366iobyxmoadg.yadqdtsiqt(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    public void agtfadlqog(EditText editText) {
        this.f23297dxjokdxxww = editText;
        this.f23319iobyxmoadg.setEndIconVisible(pkzmftpjix());
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    View.OnFocusChangeListener eablkybsjg() {
        return this.f23299gtknphoqwx;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    View.OnClickListener gxszxtbevo() {
        return this.f23295btonecajqb;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void iobyxmoadg(Editable editable) {
        if (this.f23322zoijcleaow.iwizpuwonk() != null) {
            return;
        }
        pmvmpeiblj(pkzmftpjix());
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void kcexrzcfyt() {
        cdpycssgdh();
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    View.OnFocusChangeListener lqeggnwhkg() {
        return this.f23299gtknphoqwx;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    int ppxfxbqfkf() {
        return da.btonecajqb.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void vdvldrhtss(boolean z13) {
        if (this.f23322zoijcleaow.iwizpuwonk() == null) {
            return;
        }
        pmvmpeiblj(z13);
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    int wkgbmnqykc() {
        return da.eablkybsjg.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void yggfygwlhe() {
        EditText editText = this.f23297dxjokdxxww;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.wkgbmnqykc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23384zdlpuopuiu.ylkuphrtab();
                }
            });
        }
    }
}
