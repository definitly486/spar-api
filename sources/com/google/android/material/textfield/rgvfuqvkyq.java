package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class rgvfuqvkyq extends kcexrzcfyt {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final boolean f23367kcexrzcfyt = true;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f23368agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final View.OnFocusChangeListener f23369btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f23370draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final View.OnClickListener f23371dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f23372eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final w1.ppxfxbqfkf.zoijcleaow f23373gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f23374gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final TimeInterpolator f23375lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private AutoCompleteTextView f23376nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f23377ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private ValueAnimator f23378oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private AccessibilityManager f23379rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private ValueAnimator f23380vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f23381wflxmlrfwp;

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            rgvfuqvkyq.this.oxmwwwfdhm();
            rgvfuqvkyq.this.f23378oxmwwwfdhm.start();
        }
    }

    rgvfuqvkyq(oxmwwwfdhm oxmwwwfdhmVar) {
        super(oxmwwwfdhmVar);
        this.f23371dxjokdxxww = new View.OnClickListener() { // from class: com.google.android.material.textfield.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23288zdlpuopuiu.pkzmftpjix(view);
            }
        };
        this.f23369btonecajqb = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.wflxmlrfwp
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                this.f23383iobyxmoadg.hcddaimhww(view, z13);
            }
        };
        this.f23373gtknphoqwx = new w1.ppxfxbqfkf.zoijcleaow() { // from class: com.google.android.material.textfield.agtfadlqog
            @Override // w1.ppxfxbqfkf.zoijcleaow
            public final void onTouchExplorationStateChanged(boolean z13) {
                this.f23285iobyxmoadg.jpowsppfya(z13);
            }
        };
        this.f23377ojitshcjhn = Long.MAX_VALUE;
        this.f23374gxszxtbevo = na.nufgyqmvbu.gxszxtbevo(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionDurationShort3, 67);
        this.f23372eablkybsjg = na.nufgyqmvbu.gxszxtbevo(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionDurationShort3, 50);
        this.f23375lqeggnwhkg = na.nufgyqmvbu.lqeggnwhkg(oxmwwwfdhmVar.getContext(), da.zoijcleaow.motionEasingLinearInterpolator, ea.iobyxmoadg.f31020iobyxmoadg);
    }

    private static AutoCompleteTextView cdpycssgdh(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cllcsxoeiz() {
        kegysxyocb();
        dsvhmnatus(false);
    }

    private void dsvhmnatus(boolean z13) {
        if (this.f23368agtfadlqog != z13) {
            this.f23368agtfadlqog = z13;
            this.f23378oxmwwwfdhm.cancel();
            this.f23380vdvldrhtss.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hcddaimhww(View view, boolean z13) {
        this.f23370draadjrbmk = z13;
        oxmwwwfdhm();
        if (z13) {
            return;
        }
        dsvhmnatus(false);
        this.f23381wflxmlrfwp = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean hkdspvbjdz(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (lmojexxdyd()) {
                this.f23381wflxmlrfwp = false;
            }
            stevsuqkhv();
            kegysxyocb();
        }
        return false;
    }

    private void iozdgvuglv() {
        this.f23378oxmwwwfdhm = yadqdtsiqt(this.f23374gxszxtbevo, 0.0f, 1.0f);
        ValueAnimator valueAnimatorYadqdtsiqt = yadqdtsiqt(this.f23372eablkybsjg, 1.0f, 0.0f);
        this.f23380vdvldrhtss = valueAnimatorYadqdtsiqt;
        valueAnimatorYadqdtsiqt.addListener(new iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jpowsppfya(boolean z13) {
        AutoCompleteTextView autoCompleteTextView = this.f23376nufgyqmvbu;
        if (autoCompleteTextView == null || vdvldrhtss.iobyxmoadg(autoCompleteTextView)) {
            return;
        }
        jhduphickx.uawqvzlxes(this.f23321wkgbmnqykc, z13 ? 2 : 1);
    }

    private void kegysxyocb() {
        this.f23381wflxmlrfwp = true;
        this.f23377ojitshcjhn = System.currentTimeMillis();
    }

    private boolean lmojexxdyd() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f23377ojitshcjhn;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pkzmftpjix(View view) {
        stevsuqkhv();
    }

    private void stevsuqkhv() {
        if (this.f23376nufgyqmvbu == null) {
            return;
        }
        if (lmojexxdyd()) {
            this.f23381wflxmlrfwp = false;
        }
        if (this.f23381wflxmlrfwp) {
            this.f23381wflxmlrfwp = false;
            return;
        }
        if (f23367kcexrzcfyt) {
            dsvhmnatus(!this.f23368agtfadlqog);
        } else {
            this.f23368agtfadlqog = !this.f23368agtfadlqog;
            oxmwwwfdhm();
        }
        if (!this.f23368agtfadlqog) {
            this.f23376nufgyqmvbu.dismissDropDown();
        } else {
            this.f23376nufgyqmvbu.requestFocus();
            this.f23376nufgyqmvbu.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wwaezpbzkn() {
        boolean zIsPopupShowing = this.f23376nufgyqmvbu.isPopupShowing();
        dsvhmnatus(zIsPopupShowing);
        this.f23381wflxmlrfwp = zIsPopupShowing;
    }

    private void wypolnanlu() {
        this.f23376nufgyqmvbu.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.btonecajqb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f23286zdlpuopuiu.hkdspvbjdz(view, motionEvent);
            }
        });
        if (f23367kcexrzcfyt) {
            this.f23376nufgyqmvbu.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.gtknphoqwx
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f23294iobyxmoadg.cllcsxoeiz();
                }
            });
        }
        this.f23376nufgyqmvbu.setThreshold(0);
    }

    private ValueAnimator yadqdtsiqt(int i13, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f23375lqeggnwhkg);
        valueAnimatorOfFloat.setDuration(i13);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.dxjokdxxww
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23289iobyxmoadg.ylkuphrtab(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ylkuphrtab(ValueAnimator valueAnimator) {
        this.f23321wkgbmnqykc.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    public void agtfadlqog(EditText editText) {
        this.f23376nufgyqmvbu = cdpycssgdh(editText);
        wypolnanlu();
        this.f23319iobyxmoadg.setErrorIconDrawable((Drawable) null);
        if (!vdvldrhtss.iobyxmoadg(editText) && this.f23379rgvfuqvkyq.isTouchExplorationEnabled()) {
            jhduphickx.uawqvzlxes(this.f23321wkgbmnqykc, 2);
        }
        this.f23319iobyxmoadg.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean btonecajqb() {
        return true;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean draadjrbmk() {
        return true;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean dxjokdxxww(int i13) {
        return i13 != 0;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    View.OnFocusChangeListener eablkybsjg() {
        return this.f23369btonecajqb;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean gtknphoqwx() {
        return this.f23370draadjrbmk;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    View.OnClickListener gxszxtbevo() {
        return this.f23371dxjokdxxww;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    public void iobyxmoadg(Editable editable) {
        if (this.f23379rgvfuqvkyq.isTouchExplorationEnabled() && vdvldrhtss.iobyxmoadg(this.f23376nufgyqmvbu) && !this.f23321wkgbmnqykc.hasFocus()) {
            this.f23376nufgyqmvbu.dismissDropDown();
        }
        this.f23376nufgyqmvbu.post(new Runnable() { // from class: com.google.android.material.textfield.ojitshcjhn
            @Override // java.lang.Runnable
            public final void run() {
                this.f23335zdlpuopuiu.wwaezpbzkn();
            }
        });
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void kcexrzcfyt() {
        iozdgvuglv();
        this.f23379rgvfuqvkyq = (AccessibilityManager) this.f23320ppxfxbqfkf.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    public w1.ppxfxbqfkf.zoijcleaow nufgyqmvbu() {
        return this.f23373gtknphoqwx;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    public void ojitshcjhn(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
        if (!vdvldrhtss.iobyxmoadg(this.f23376nufgyqmvbu)) {
            zdlpuopuiuVar.uwvvkdfqfp(Spinner.class.getName());
        }
        if (zdlpuopuiuVar.tzroggbefp()) {
            zdlpuopuiuVar.roivzttewh(null);
        }
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    int ppxfxbqfkf() {
        return da.btonecajqb.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    public void rgvfuqvkyq(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f23379rgvfuqvkyq.isEnabled() || vdvldrhtss.iobyxmoadg(this.f23376nufgyqmvbu)) {
            return;
        }
        boolean z13 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f23368agtfadlqog && !this.f23376nufgyqmvbu.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z13) {
            stevsuqkhv();
            kegysxyocb();
        }
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean wflxmlrfwp() {
        return this.f23368agtfadlqog;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    int wkgbmnqykc() {
        return f23367kcexrzcfyt ? da.eablkybsjg.mtrl_dropdown_arrow : da.eablkybsjg.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void yggfygwlhe() {
        AutoCompleteTextView autoCompleteTextView = this.f23376nufgyqmvbu;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f23367kcexrzcfyt) {
                this.f23376nufgyqmvbu.setOnDismissListener(null);
            }
        }
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean zdlpuopuiu() {
        return true;
    }
}
