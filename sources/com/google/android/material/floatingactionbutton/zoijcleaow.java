package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import ra.agtfadlqog;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
abstract class zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private ea.gxszxtbevo f22786agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    float f22787btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final qa.zoijcleaow f22788cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final com.google.android.material.internal.lqeggnwhkg f22789draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    float f22790dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    Drawable f22791eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    int f22793gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    boolean f22794gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    ra.gtknphoqwx f22795iobyxmoadg;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f22796istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final FloatingActionButton f22797iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ArrayList f22798jyumaefscl;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    float f22802nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private ea.gxszxtbevo f22803ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f22804oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    Drawable f22806ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float f22807rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Animator f22809wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.iobyxmoadg f22810wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ArrayList f22811yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ArrayList f22812zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    ra.lqeggnwhkg f22813zoijcleaow;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final TimeInterpolator f22775cdpycssgdh = ea.iobyxmoadg.f31021ppxfxbqfkf;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final int f22784yadqdtsiqt = da.zoijcleaow.motionDurationLong2;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final int f22779iozdgvuglv = da.zoijcleaow.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final int f22781lmojexxdyd = da.zoijcleaow.motionDurationMedium1;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final int f22783wwaezpbzkn = da.zoijcleaow.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    static final int[] f22785ylkuphrtab = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final int[] f22782pkzmftpjix = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    static final int[] f22777hcddaimhww = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    static final int[] f22780jpowsppfya = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    static final int[] f22778hkdspvbjdz = {R.attr.state_enabled};

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    static final int[] f22776cllcsxoeiz = new int[0];

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    boolean f22801lqeggnwhkg = true;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f22808vdvldrhtss = 1.0f;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f22799kcexrzcfyt = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Rect f22792esjtqupxsv = new Rect();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final RectF f22800lereixgezr = new RectF();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final RectF f22805pmvmpeiblj = new RectF();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Matrix f22814zynmafqrjb = new Matrix();

    interface btonecajqb {
        void iobyxmoadg();

        void zoijcleaow();
    }

    private class draadjrbmk extends wflxmlrfwp {
        draadjrbmk() {
            super(zoijcleaow.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.zoijcleaow.wflxmlrfwp
        protected float iobyxmoadg() {
            return zoijcleaow.this.f22802nufgyqmvbu;
        }
    }

    private class dxjokdxxww extends wflxmlrfwp {
        dxjokdxxww() {
            super(zoijcleaow.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.zoijcleaow.wflxmlrfwp
        protected float iobyxmoadg() {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            return zoijcleaowVar.f22802nufgyqmvbu + zoijcleaowVar.f22787btonecajqb;
        }
    }

    class eablkybsjg implements TypeEvaluator {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        FloatEvaluator f22817iobyxmoadg = new FloatEvaluator();

        eablkybsjg() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f13, Float f14, Float f15) {
            float fFloatValue = this.f22817iobyxmoadg.evaluate(f13, (Number) f14, (Number) f15).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    interface gtknphoqwx {
        void iobyxmoadg();

        void zoijcleaow();
    }

    class gxszxtbevo implements ViewTreeObserver.OnPreDrawListener {
        gxszxtbevo() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            zoijcleaow.this.yadqdtsiqt();
            return true;
        }
    }

    class iobyxmoadg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f22820iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f22821ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean f22823zoijcleaow;

        iobyxmoadg(boolean z13, gtknphoqwx gtknphoqwxVar) {
            this.f22823zoijcleaow = z13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f22820iobyxmoadg = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zoijcleaow.this.f22799kcexrzcfyt = 0;
            zoijcleaow.this.f22809wflxmlrfwp = null;
            if (this.f22820iobyxmoadg) {
                return;
            }
            FloatingActionButton floatingActionButton = zoijcleaow.this.f22797iwizpuwonk;
            boolean z13 = this.f22823zoijcleaow;
            floatingActionButton.zoijcleaow(z13 ? 8 : 4, z13);
            gtknphoqwx gtknphoqwxVar = this.f22821ppxfxbqfkf;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.zoijcleaow();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            zoijcleaow.this.f22797iwizpuwonk.zoijcleaow(0, this.f22823zoijcleaow);
            zoijcleaow.this.f22799kcexrzcfyt = 1;
            zoijcleaow.this.f22809wflxmlrfwp = animator;
            this.f22820iobyxmoadg = false;
        }
    }

    private class lqeggnwhkg extends wflxmlrfwp {
        lqeggnwhkg() {
            super(zoijcleaow.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.zoijcleaow.wflxmlrfwp
        protected float iobyxmoadg() {
            return 0.0f;
        }
    }

    private class nufgyqmvbu extends wflxmlrfwp {
        nufgyqmvbu() {
            super(zoijcleaow.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.zoijcleaow.wflxmlrfwp
        protected float iobyxmoadg() {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            return zoijcleaowVar.f22802nufgyqmvbu + zoijcleaowVar.f22790dxjokdxxww;
        }
    }

    class ppxfxbqfkf extends ea.eablkybsjg {
        ppxfxbqfkf() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f13, Matrix matrix, Matrix matrix2) {
            zoijcleaow.this.f22808vdvldrhtss = f13;
            return super.evaluate(f13, matrix, matrix2);
        }
    }

    private abstract class wflxmlrfwp extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f22827iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private float f22828ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f22830zoijcleaow;

        private wflxmlrfwp() {
        }

        protected abstract float iobyxmoadg();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zoijcleaow.this.okpsazkaxt((int) this.f22828ppxfxbqfkf);
            this.f22827iobyxmoadg = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f22827iobyxmoadg) {
                ra.lqeggnwhkg lqeggnwhkgVar = zoijcleaow.this.f22813zoijcleaow;
                this.f22830zoijcleaow = lqeggnwhkgVar == null ? 0.0f : lqeggnwhkgVar.iwizpuwonk();
                this.f22828ppxfxbqfkf = iobyxmoadg();
                this.f22827iobyxmoadg = true;
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            float f13 = this.f22830zoijcleaow;
            zoijcleaowVar.okpsazkaxt((int) (f13 + ((this.f22828ppxfxbqfkf - f13) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ wflxmlrfwp(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    class wkgbmnqykc implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ float f22832eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ float f22833gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ float f22834iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final /* synthetic */ float f22835lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        final /* synthetic */ Matrix f22836nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ float f22837ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ float f22838wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ float f22839zoijcleaow;

        wkgbmnqykc(float f13, float f14, float f15, float f16, float f17, float f18, float f19, Matrix matrix) {
            this.f22834iobyxmoadg = f13;
            this.f22839zoijcleaow = f14;
            this.f22837ppxfxbqfkf = f15;
            this.f22838wkgbmnqykc = f16;
            this.f22832eablkybsjg = f17;
            this.f22833gxszxtbevo = f18;
            this.f22835lqeggnwhkg = f19;
            this.f22836nufgyqmvbu = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            zoijcleaow.this.f22797iwizpuwonk.setAlpha(ea.iobyxmoadg.zoijcleaow(this.f22834iobyxmoadg, this.f22839zoijcleaow, 0.0f, 0.2f, fFloatValue));
            zoijcleaow.this.f22797iwizpuwonk.setScaleX(ea.iobyxmoadg.iobyxmoadg(this.f22837ppxfxbqfkf, this.f22838wkgbmnqykc, fFloatValue));
            zoijcleaow.this.f22797iwizpuwonk.setScaleY(ea.iobyxmoadg.iobyxmoadg(this.f22832eablkybsjg, this.f22838wkgbmnqykc, fFloatValue));
            zoijcleaow.this.f22808vdvldrhtss = ea.iobyxmoadg.iobyxmoadg(this.f22833gxszxtbevo, this.f22835lqeggnwhkg, fFloatValue);
            zoijcleaow.this.eablkybsjg(ea.iobyxmoadg.iobyxmoadg(this.f22833gxszxtbevo, this.f22835lqeggnwhkg, fFloatValue), this.f22836nufgyqmvbu);
            zoijcleaow.this.f22797iwizpuwonk.setImageMatrix(this.f22836nufgyqmvbu);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C0399zoijcleaow extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ boolean f22840iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f22842zoijcleaow;

        C0399zoijcleaow(boolean z13, gtknphoqwx gtknphoqwxVar) {
            this.f22840iobyxmoadg = z13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zoijcleaow.this.f22799kcexrzcfyt = 0;
            zoijcleaow.this.f22809wflxmlrfwp = null;
            gtknphoqwx gtknphoqwxVar = this.f22842zoijcleaow;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.iobyxmoadg();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            zoijcleaow.this.f22797iwizpuwonk.zoijcleaow(0, this.f22840iobyxmoadg);
            zoijcleaow.this.f22799kcexrzcfyt = 2;
            zoijcleaow.this.f22809wflxmlrfwp = animator;
        }
    }

    zoijcleaow(FloatingActionButton floatingActionButton, qa.zoijcleaow zoijcleaowVar) {
        this.f22797iwizpuwonk = floatingActionButton;
        this.f22788cqumvgiudr = zoijcleaowVar;
        com.google.android.material.internal.lqeggnwhkg lqeggnwhkgVar = new com.google.android.material.internal.lqeggnwhkg();
        this.f22789draadjrbmk = lqeggnwhkgVar;
        lqeggnwhkgVar.iobyxmoadg(f22785ylkuphrtab, nufgyqmvbu(new dxjokdxxww()));
        lqeggnwhkgVar.iobyxmoadg(f22782pkzmftpjix, nufgyqmvbu(new nufgyqmvbu()));
        lqeggnwhkgVar.iobyxmoadg(f22777hcddaimhww, nufgyqmvbu(new nufgyqmvbu()));
        lqeggnwhkgVar.iobyxmoadg(f22780jpowsppfya, nufgyqmvbu(new nufgyqmvbu()));
        lqeggnwhkgVar.iobyxmoadg(f22778hkdspvbjdz, nufgyqmvbu(new draadjrbmk()));
        lqeggnwhkgVar.iobyxmoadg(f22776cllcsxoeiz, nufgyqmvbu(new lqeggnwhkg()));
        this.f22807rgvfuqvkyq = floatingActionButton.getRotation();
    }

    private ViewTreeObserver.OnPreDrawListener agtfadlqog() {
        if (this.f22796istkbnxepw == null) {
            this.f22796istkbnxepw = new gxszxtbevo();
        }
        return this.f22796istkbnxepw;
    }

    private boolean crxdokpmqz() {
        return jhduphickx.tzroggbefp(this.f22797iwizpuwonk) && !this.f22797iwizpuwonk.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eablkybsjg(float f13, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f22797iwizpuwonk.getDrawable();
        if (drawable == null || this.f22804oxmwwwfdhm == 0) {
            return;
        }
        RectF rectF = this.f22800lereixgezr;
        RectF rectF2 = this.f22805pmvmpeiblj;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i13 = this.f22804oxmwwwfdhm;
        rectF2.set(0.0f, 0.0f, i13, i13);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i14 = this.f22804oxmwwwfdhm;
        matrix.postScale(f13, f13, i14 / 2.0f, i14 / 2.0f);
    }

    private AnimatorSet gxszxtbevo(ea.gxszxtbevo gxszxtbevoVar, float f13, float f14, float f15) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f22797iwizpuwonk, (Property<FloatingActionButton, Float>) View.ALPHA, f13);
        gxszxtbevoVar.eablkybsjg("opacity").iobyxmoadg(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f22797iwizpuwonk, (Property<FloatingActionButton, Float>) View.SCALE_X, f14);
        gxszxtbevoVar.eablkybsjg("scale").iobyxmoadg(objectAnimatorOfFloat2);
        jztzpxfvev(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f22797iwizpuwonk, (Property<FloatingActionButton, Float>) View.SCALE_Y, f14);
        gxszxtbevoVar.eablkybsjg("scale").iobyxmoadg(objectAnimatorOfFloat3);
        jztzpxfvev(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        eablkybsjg(f15, this.f22814zynmafqrjb);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f22797iwizpuwonk, new ea.wkgbmnqykc(), new ppxfxbqfkf(), new Matrix(this.f22814zynmafqrjb));
        gxszxtbevoVar.eablkybsjg("iconScale").iobyxmoadg(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ea.zoijcleaow.iobyxmoadg(animatorSet, arrayList);
        return animatorSet;
    }

    private void jztzpxfvev(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new eablkybsjg());
    }

    private AnimatorSet lqeggnwhkg(float f13, float f14, float f15, int i13, int i14) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new wkgbmnqykc(this.f22797iwizpuwonk.getAlpha(), f13, this.f22797iwizpuwonk.getScaleX(), f14, this.f22797iwizpuwonk.getScaleY(), this.f22808vdvldrhtss, f15, new Matrix(this.f22814zynmafqrjb)));
        arrayList.add(valueAnimatorOfFloat);
        ea.zoijcleaow.iobyxmoadg(animatorSet, arrayList);
        animatorSet.setDuration(na.nufgyqmvbu.gxszxtbevo(this.f22797iwizpuwonk.getContext(), i13, this.f22797iwizpuwonk.getContext().getResources().getInteger(da.lqeggnwhkg.material_motion_duration_long_1)));
        animatorSet.setInterpolator(na.nufgyqmvbu.lqeggnwhkg(this.f22797iwizpuwonk.getContext(), i14, ea.iobyxmoadg.f31023zoijcleaow));
        return animatorSet;
    }

    private ValueAnimator nufgyqmvbu(wflxmlrfwp wflxmlrfwpVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f22775cdpycssgdh);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(wflxmlrfwpVar);
        valueAnimator.addUpdateListener(wflxmlrfwpVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    abstract float btonecajqb();

    void cdpycssgdh(Rect rect) {
        u1.nufgyqmvbu.lqeggnwhkg(this.f22791eablkybsjg, "Didn't initialize content background");
        if (!sopmlzcsov()) {
            this.f22788cqumvgiudr.ppxfxbqfkf(this.f22791eablkybsjg);
        } else {
            this.f22788cqumvgiudr.ppxfxbqfkf(new InsetDrawable(this.f22791eablkybsjg, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    final void cllcsxoeiz(float f13) {
        if (this.f22790dxjokdxxww != f13) {
            this.f22790dxjokdxxww = f13;
            istkbnxepw(this.f22802nufgyqmvbu, f13, this.f22787btonecajqb);
        }
    }

    abstract void cqumvgiudr();

    final ea.gxszxtbevo draadjrbmk() {
        return this.f22803ojitshcjhn;
    }

    final void dsvhmnatus(float f13) {
        this.f22808vdvldrhtss = f13;
        Matrix matrix = this.f22814zynmafqrjb;
        eablkybsjg(f13, matrix);
        this.f22797iwizpuwonk.setImageMatrix(matrix);
    }

    final Drawable dxjokdxxww() {
        return this.f22791eablkybsjg;
    }

    void esjtqupxsv() {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f22813zoijcleaow;
        if (lqeggnwhkgVar != null) {
            ra.nufgyqmvbu.gxszxtbevo(this.f22797iwizpuwonk, lqeggnwhkgVar);
        }
        if (wwaezpbzkn()) {
            this.f22797iwizpuwonk.getViewTreeObserver().addOnPreDrawListener(agtfadlqog());
        }
    }

    boolean gtknphoqwx() {
        return this.f22794gxszxtbevo;
    }

    final void hcddaimhww(float f13) {
        if (this.f22802nufgyqmvbu != f13) {
            this.f22802nufgyqmvbu = f13;
            istkbnxepw(f13, this.f22790dxjokdxxww, this.f22787btonecajqb);
        }
    }

    final void hkdspvbjdz(ea.gxszxtbevo gxszxtbevoVar) {
        this.f22803ojitshcjhn = gxszxtbevoVar;
    }

    final void ikoacuggdj() {
        Rect rect = this.f22792esjtqupxsv;
        ojitshcjhn(rect);
        cdpycssgdh(rect);
        this.f22788cqumvgiudr.iobyxmoadg(rect.left, rect.top, rect.right, rect.bottom);
    }

    void iozdgvuglv() {
        ArrayList arrayList = this.f22798jyumaefscl;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((btonecajqb) it.next()).zoijcleaow();
            }
        }
    }

    abstract void istkbnxepw(float f13, float f14, float f15);

    boolean iwizpuwonk() {
        if (this.f22797iwizpuwonk.getVisibility() != 0) {
            return this.f22799kcexrzcfyt == 2;
        }
        return this.f22799kcexrzcfyt != 1;
    }

    final void jhduphickx() {
        dsvhmnatus(this.f22808vdvldrhtss);
    }

    final boolean jlmebxxoox() {
        return !this.f22794gxszxtbevo || this.f22797iwizpuwonk.getSizeDimension() >= this.f22793gtknphoqwx;
    }

    void jpowsppfya(boolean z13) {
        this.f22794gxszxtbevo = z13;
    }

    boolean jyumaefscl() {
        if (this.f22797iwizpuwonk.getVisibility() == 0) {
            return this.f22799kcexrzcfyt == 1;
        }
        return this.f22799kcexrzcfyt != 2;
    }

    int kcexrzcfyt() {
        if (this.f22794gxszxtbevo) {
            return Math.max((this.f22793gtknphoqwx - this.f22797iwizpuwonk.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    final void kegysxyocb(float f13) {
        if (this.f22787btonecajqb != f13) {
            this.f22787btonecajqb = f13;
            istkbnxepw(this.f22802nufgyqmvbu, this.f22790dxjokdxxww, f13);
        }
    }

    abstract void lereixgezr();

    void lmojexxdyd() {
        ArrayList arrayList = this.f22798jyumaefscl;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((btonecajqb) it.next()).iobyxmoadg();
            }
        }
    }

    void mbcevpiqjq(boolean z13) {
        this.f22801lqeggnwhkg = z13;
        ikoacuggdj();
    }

    final void ntlheqmsrt(ra.gtknphoqwx gtknphoqwxVar) {
        this.f22795iobyxmoadg = gtknphoqwxVar;
        ra.lqeggnwhkg lqeggnwhkgVar = this.f22813zoijcleaow;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.setShapeAppearanceModel(gtknphoqwxVar);
        }
        Object obj = this.f22806ppxfxbqfkf;
        if (obj instanceof agtfadlqog) {
            ((agtfadlqog) obj).setShapeAppearanceModel(gtknphoqwxVar);
        }
        com.google.android.material.floatingactionbutton.iobyxmoadg iobyxmoadgVar = this.f22810wkgbmnqykc;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(gtknphoqwxVar);
        }
    }

    void ojitshcjhn(Rect rect) {
        int iKcexrzcfyt = kcexrzcfyt();
        float fBtonecajqb = this.f22801lqeggnwhkg ? btonecajqb() + this.f22787btonecajqb : 0.0f;
        int iMax = Math.max(iKcexrzcfyt, (int) Math.ceil(fBtonecajqb));
        int iMax2 = Math.max(iKcexrzcfyt, (int) Math.ceil(fBtonecajqb * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    void okpsazkaxt(float f13) {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f22813zoijcleaow;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.sopmlzcsov(f13);
        }
    }

    final ea.gxszxtbevo oxmwwwfdhm() {
        return this.f22786agtfadlqog;
    }

    void pkzmftpjix(PorterDuff.Mode mode) {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f22813zoijcleaow;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.setTintMode(mode);
        }
    }

    void pmvmpeiblj() {
        ViewTreeObserver viewTreeObserver = this.f22797iwizpuwonk.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f22796istkbnxepw;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f22796istkbnxepw = null;
        }
    }

    float rgvfuqvkyq() {
        return this.f22787btonecajqb;
    }

    void ribwqtqdhb(gtknphoqwx gtknphoqwxVar, boolean z13) {
        if (iwizpuwonk()) {
            return;
        }
        Animator animator = this.f22809wflxmlrfwp;
        if (animator != null) {
            animator.cancel();
        }
        boolean z14 = this.f22786agtfadlqog == null;
        if (!crxdokpmqz()) {
            this.f22797iwizpuwonk.zoijcleaow(0, z13);
            this.f22797iwizpuwonk.setAlpha(1.0f);
            this.f22797iwizpuwonk.setScaleY(1.0f);
            this.f22797iwizpuwonk.setScaleX(1.0f);
            dsvhmnatus(1.0f);
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.iobyxmoadg();
                return;
            }
            return;
        }
        if (this.f22797iwizpuwonk.getVisibility() != 0) {
            this.f22797iwizpuwonk.setAlpha(0.0f);
            this.f22797iwizpuwonk.setScaleY(z14 ? 0.4f : 0.0f);
            this.f22797iwizpuwonk.setScaleX(z14 ? 0.4f : 0.0f);
            dsvhmnatus(z14 ? 0.4f : 0.0f);
        }
        ea.gxszxtbevo gxszxtbevoVar = this.f22786agtfadlqog;
        AnimatorSet animatorSetGxszxtbevo = gxszxtbevoVar != null ? gxszxtbevo(gxszxtbevoVar, 1.0f, 1.0f, 1.0f) : lqeggnwhkg(1.0f, 1.0f, 1.0f, f22784yadqdtsiqt, f22779iozdgvuglv);
        animatorSetGxszxtbevo.addListener(new C0399zoijcleaow(z13, gtknphoqwxVar));
        ArrayList arrayList = this.f22812zdlpuopuiu;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetGxszxtbevo.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetGxszxtbevo.start();
    }

    abstract boolean sopmlzcsov();

    void stevsuqkhv(int i13) {
        this.f22793gtknphoqwx = i13;
    }

    void tzroggbefp(ColorStateList colorStateList) {
        Drawable drawable = this.f22806ppxfxbqfkf;
        if (drawable != null) {
            k1.iobyxmoadg.ojitshcjhn(drawable, pa.zoijcleaow.wkgbmnqykc(colorStateList));
        }
    }

    final void ulzqkzuiru(ea.gxszxtbevo gxszxtbevoVar) {
        this.f22786agtfadlqog = gxszxtbevoVar;
    }

    final ra.gtknphoqwx vdvldrhtss() {
        return this.f22795iobyxmoadg;
    }

    abstract void vipkmwdibw();

    float wflxmlrfwp() {
        return this.f22790dxjokdxxww;
    }

    abstract boolean wwaezpbzkn();

    final void wypolnanlu(int i13) {
        if (this.f22804oxmwwwfdhm != i13) {
            this.f22804oxmwwwfdhm = i13;
            jhduphickx();
        }
    }

    void yadqdtsiqt() {
        float rotation = this.f22797iwizpuwonk.getRotation();
        if (this.f22807rgvfuqvkyq != rotation) {
            this.f22807rgvfuqvkyq = rotation;
            vipkmwdibw();
        }
    }

    abstract void yggfygwlhe(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i13);

    void ylkuphrtab(ColorStateList colorStateList) {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f22813zoijcleaow;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.iobyxmoadg iobyxmoadgVar = this.f22810wkgbmnqykc;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(colorStateList);
        }
    }

    void zdlpuopuiu(gtknphoqwx gtknphoqwxVar, boolean z13) {
        if (jyumaefscl()) {
            return;
        }
        Animator animator = this.f22809wflxmlrfwp;
        if (animator != null) {
            animator.cancel();
        }
        if (!crxdokpmqz()) {
            this.f22797iwizpuwonk.zoijcleaow(z13 ? 8 : 4, z13);
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.zoijcleaow();
                return;
            }
            return;
        }
        ea.gxszxtbevo gxszxtbevoVar = this.f22803ojitshcjhn;
        AnimatorSet animatorSetGxszxtbevo = gxszxtbevoVar != null ? gxszxtbevo(gxszxtbevoVar, 0.0f, 0.0f, 0.0f) : lqeggnwhkg(0.0f, 0.4f, 0.4f, f22781lmojexxdyd, f22783wwaezpbzkn);
        animatorSetGxszxtbevo.addListener(new iobyxmoadg(z13, gtknphoqwxVar));
        ArrayList arrayList = this.f22811yggfygwlhe;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetGxszxtbevo.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetGxszxtbevo.start();
    }

    abstract void zynmafqrjb(int[] iArr);
}
