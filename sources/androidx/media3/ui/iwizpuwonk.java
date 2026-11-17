package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import modern.payments.ecomAndroid.data.common.MockConstants;

/* JADX INFO: loaded from: classes.dex */
final class iwizpuwonk {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final AnimatorSet f11840agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final View f11841btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AnimatorSet f11843draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ViewGroup f11844dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ViewGroup f11845eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final View f11847gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ViewGroup f11848gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.media3.ui.wkgbmnqykc f11849iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ViewGroup f11855lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ViewGroup f11856nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final AnimatorSet f11857ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final ValueAnimator f11858oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f11859pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ViewGroup f11860ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final AnimatorSet f11861rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final ValueAnimator f11862vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final AnimatorSet f11863wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ViewGroup f11864wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final View f11867zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f11868zynmafqrjb;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final Runnable f11853kcexrzcfyt = new Runnable() { // from class: androidx.media3.ui.btonecajqb
        @Override // java.lang.Runnable
        public final void run() {
            this.f11785zdlpuopuiu.ikoacuggdj();
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Runnable f11866zdlpuopuiu = new Runnable() { // from class: androidx.media3.ui.rgvfuqvkyq
        @Override // java.lang.Runnable
        public final void run() {
            this.f11898zdlpuopuiu.cdpycssgdh();
        }
    };

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Runnable f11865yggfygwlhe = new Runnable() { // from class: androidx.media3.ui.vdvldrhtss
        @Override // java.lang.Runnable
        public final void run() {
            this.f11899zdlpuopuiu.wwaezpbzkn();
        }
    };

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Runnable f11852jyumaefscl = new Runnable() { // from class: androidx.media3.ui.oxmwwwfdhm
        @Override // java.lang.Runnable
        public final void run() {
            this.f11897zdlpuopuiu.lmojexxdyd();
        }
    };

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Runnable f11851iwizpuwonk = new Runnable() { // from class: androidx.media3.ui.kcexrzcfyt
        @Override // java.lang.Runnable
        public final void run() {
            this.f11882zdlpuopuiu.yadqdtsiqt();
        }
    };

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final View.OnLayoutChangeListener f11842cqumvgiudr = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.zdlpuopuiu
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
            this.f12009iobyxmoadg.kegysxyocb(view, i13, i14, i15, i16, i17, i18, i19, i23);
        }
    };

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f11850istkbnxepw = true;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f11854lereixgezr = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final List f11846esjtqupxsv = new ArrayList();

    class dxjokdxxww extends AnimatorListenerAdapter {
        dxjokdxxww() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (iwizpuwonk.this.f11856nufgyqmvbu != null) {
                iwizpuwonk.this.f11856nufgyqmvbu.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (iwizpuwonk.this.f11848gxszxtbevo != null) {
                iwizpuwonk.this.f11848gxszxtbevo.setVisibility(0);
            }
        }
    }

    class eablkybsjg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.wkgbmnqykc f11870iobyxmoadg;

        eablkybsjg(androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar) {
            this.f11870iobyxmoadg = wkgbmnqykcVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(2);
            if (iwizpuwonk.this.f11868zynmafqrjb) {
                this.f11870iobyxmoadg.post(iwizpuwonk.this.f11853kcexrzcfyt);
                iwizpuwonk.this.f11868zynmafqrjb = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(3);
        }
    }

    class gxszxtbevo extends AnimatorListenerAdapter {
        gxszxtbevo() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(4);
        }
    }

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (iwizpuwonk.this.f11867zoijcleaow != null) {
                iwizpuwonk.this.f11867zoijcleaow.setVisibility(4);
            }
            if (iwizpuwonk.this.f11860ppxfxbqfkf != null) {
                iwizpuwonk.this.f11860ppxfxbqfkf.setVisibility(4);
            }
            if (iwizpuwonk.this.f11845eablkybsjg != null) {
                iwizpuwonk.this.f11845eablkybsjg.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(iwizpuwonk.this.f11841btonecajqb instanceof androidx.media3.ui.zoijcleaow) || iwizpuwonk.this.f11859pmvmpeiblj) {
                return;
            }
            ((androidx.media3.ui.zoijcleaow) iwizpuwonk.this.f11841btonecajqb).nufgyqmvbu(250L);
        }
    }

    class lqeggnwhkg extends AnimatorListenerAdapter {
        lqeggnwhkg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(4);
        }
    }

    class nufgyqmvbu extends AnimatorListenerAdapter {
        nufgyqmvbu() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (iwizpuwonk.this.f11848gxszxtbevo != null) {
                iwizpuwonk.this.f11848gxszxtbevo.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (iwizpuwonk.this.f11856nufgyqmvbu != null) {
                iwizpuwonk.this.f11856nufgyqmvbu.setVisibility(0);
                iwizpuwonk.this.f11856nufgyqmvbu.setTranslationX(iwizpuwonk.this.f11856nufgyqmvbu.getWidth());
                iwizpuwonk.this.f11856nufgyqmvbu.scrollTo(iwizpuwonk.this.f11856nufgyqmvbu.getWidth(), 0);
            }
        }
    }

    class ppxfxbqfkf extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.wkgbmnqykc f11876iobyxmoadg;

        ppxfxbqfkf(androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar) {
            this.f11876iobyxmoadg = wkgbmnqykcVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(1);
            if (iwizpuwonk.this.f11868zynmafqrjb) {
                this.f11876iobyxmoadg.post(iwizpuwonk.this.f11853kcexrzcfyt);
                iwizpuwonk.this.f11868zynmafqrjb = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(3);
        }
    }

    class wkgbmnqykc extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.wkgbmnqykc f11878iobyxmoadg;

        wkgbmnqykc(androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar) {
            this.f11878iobyxmoadg = wkgbmnqykcVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(2);
            if (iwizpuwonk.this.f11868zynmafqrjb) {
                this.f11878iobyxmoadg.post(iwizpuwonk.this.f11853kcexrzcfyt);
                iwizpuwonk.this.f11868zynmafqrjb = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            iwizpuwonk.this.ribwqtqdhb(3);
        }
    }

    class zoijcleaow extends AnimatorListenerAdapter {
        zoijcleaow() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (iwizpuwonk.this.f11867zoijcleaow != null) {
                iwizpuwonk.this.f11867zoijcleaow.setVisibility(0);
            }
            if (iwizpuwonk.this.f11860ppxfxbqfkf != null) {
                iwizpuwonk.this.f11860ppxfxbqfkf.setVisibility(0);
            }
            if (iwizpuwonk.this.f11845eablkybsjg != null) {
                iwizpuwonk.this.f11845eablkybsjg.setVisibility(iwizpuwonk.this.f11859pmvmpeiblj ? 0 : 4);
            }
            if (!(iwizpuwonk.this.f11841btonecajqb instanceof androidx.media3.ui.zoijcleaow) || iwizpuwonk.this.f11859pmvmpeiblj) {
                return;
            }
            ((androidx.media3.ui.zoijcleaow) iwizpuwonk.this.f11841btonecajqb).yggfygwlhe(250L);
        }
    }

    public iwizpuwonk(androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar) {
        this.f11849iobyxmoadg = wkgbmnqykcVar;
        this.f11867zoijcleaow = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_controls_background);
        this.f11860ppxfxbqfkf = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_center_controls);
        this.f11845eablkybsjg = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_bottom_bar);
        this.f11864wkgbmnqykc = viewGroup;
        this.f11844dxjokdxxww = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_time);
        View viewFindViewById = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_progress);
        this.f11841btonecajqb = viewFindViewById;
        this.f11848gxszxtbevo = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_basic_controls);
        this.f11855lqeggnwhkg = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_extra_controls);
        this.f11856nufgyqmvbu = (ViewGroup) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_extra_controls_scroll_view);
        View viewFindViewById2 = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_overflow_show);
        this.f11847gtknphoqwx = viewFindViewById2;
        View viewFindViewById3 = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.yggfygwlhe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12008zdlpuopuiu.mbcevpiqjq(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.yggfygwlhe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12008zdlpuopuiu.mbcevpiqjq(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.jyumaefscl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11881iobyxmoadg.pkzmftpjix(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new iobyxmoadg());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.gtknphoqwx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11795iobyxmoadg.hcddaimhww(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new zoijcleaow());
        Resources resources = wkgbmnqykcVar.getResources();
        float dimension = resources.getDimension(d5.yggfygwlhe.exo_styled_bottom_bar_height) - resources.getDimension(d5.yggfygwlhe.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(d5.yggfygwlhe.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11843draadjrbmk = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ppxfxbqfkf(wkgbmnqykcVar));
        animatorSet.play(valueAnimatorOfFloat).with(cllcsxoeiz(0.0f, dimension, viewFindViewById)).with(cllcsxoeiz(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f11863wflxmlrfwp = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new wkgbmnqykc(wkgbmnqykcVar));
        animatorSet2.play(cllcsxoeiz(dimension, dimension2, viewFindViewById)).with(cllcsxoeiz(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f11840agtfadlqog = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new eablkybsjg(wkgbmnqykcVar));
        animatorSet3.play(valueAnimatorOfFloat).with(cllcsxoeiz(0.0f, dimension2, viewFindViewById)).with(cllcsxoeiz(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f11857ojitshcjhn = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new gxszxtbevo());
        animatorSet4.play(valueAnimatorOfFloat2).with(cllcsxoeiz(dimension, 0.0f, viewFindViewById)).with(cllcsxoeiz(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f11861rgvfuqvkyq = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new lqeggnwhkg());
        animatorSet5.play(valueAnimatorOfFloat2).with(cllcsxoeiz(dimension2, 0.0f, viewFindViewById)).with(cllcsxoeiz(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11862vdvldrhtss = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.agtfadlqog
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11784iobyxmoadg.jpowsppfya(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new nufgyqmvbu());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f11858oxmwwwfdhm = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.ojitshcjhn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11896iobyxmoadg.hkdspvbjdz(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new dxjokdxxww());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdpycssgdh() {
        this.f11840agtfadlqog.start();
    }

    private static ObjectAnimator cllcsxoeiz(float f13, float f14, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f13, f14);
    }

    private void esjtqupxsv(float f13) {
        ViewGroup viewGroup = this.f11856nufgyqmvbu;
        if (viewGroup != null) {
            this.f11856nufgyqmvbu.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f13)));
        }
        ViewGroup viewGroup2 = this.f11844dxjokdxxww;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f13);
        }
        ViewGroup viewGroup3 = this.f11848gxszxtbevo;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hcddaimhww(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f11867zoijcleaow;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f11860ppxfxbqfkf;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f11845eablkybsjg;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hkdspvbjdz(ValueAnimator valueAnimator) {
        esjtqupxsv(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ikoacuggdj() {
        if (!this.f11850istkbnxepw) {
            ribwqtqdhb(0);
            sopmlzcsov();
            return;
        }
        int i13 = this.f11854lereixgezr;
        if (i13 == 1) {
            this.f11857ojitshcjhn.start();
        } else if (i13 == 2) {
            this.f11861rgvfuqvkyq.start();
        } else if (i13 == 3) {
            this.f11868zynmafqrjb = true;
        } else if (i13 == 4) {
            return;
        }
        sopmlzcsov();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jpowsppfya(ValueAnimator valueAnimator) {
        esjtqupxsv(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private boolean jztzpxfvev() {
        int width = (this.f11849iobyxmoadg.getWidth() - this.f11849iobyxmoadg.getPaddingLeft()) - this.f11849iobyxmoadg.getPaddingRight();
        int height = (this.f11849iobyxmoadg.getHeight() - this.f11849iobyxmoadg.getPaddingBottom()) - this.f11849iobyxmoadg.getPaddingTop();
        int iZynmafqrjb = zynmafqrjb(this.f11860ppxfxbqfkf);
        ViewGroup viewGroup = this.f11860ppxfxbqfkf;
        int paddingLeft = iZynmafqrjb - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f11860ppxfxbqfkf.getPaddingRight() : 0);
        int iLereixgezr = lereixgezr(this.f11860ppxfxbqfkf);
        ViewGroup viewGroup2 = this.f11860ppxfxbqfkf;
        return width <= Math.max(paddingLeft, zynmafqrjb(this.f11844dxjokdxxww) + zynmafqrjb(this.f11847gtknphoqwx)) || height <= (iLereixgezr - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f11860ppxfxbqfkf.getPaddingBottom() : 0)) + (lereixgezr(this.f11864wkgbmnqykc) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kegysxyocb(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        boolean zJztzpxfvev = jztzpxfvev();
        if (this.f11859pmvmpeiblj != zJztzpxfvev) {
            this.f11859pmvmpeiblj = zJztzpxfvev;
            view.post(new Runnable() { // from class: androidx.media3.ui.draadjrbmk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11789zdlpuopuiu.okpsazkaxt();
                }
            });
        }
        boolean z13 = i15 - i13 != i19 - i17;
        if (this.f11859pmvmpeiblj || !z13) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.wflxmlrfwp
            @Override // java.lang.Runnable
            public final void run() {
                this.f11900zdlpuopuiu.tzroggbefp();
            }
        });
    }

    private static int lereixgezr(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lmojexxdyd() {
        this.f11843draadjrbmk.start();
        ntlheqmsrt(this.f11865yggfygwlhe, MockConstants.TWO_SECONDS_DELAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mbcevpiqjq(View view) {
        sopmlzcsov();
        if (view.getId() == d5.cqumvgiudr.exo_overflow_show) {
            this.f11862vdvldrhtss.start();
        } else if (view.getId() == d5.cqumvgiudr.exo_overflow_hide) {
            this.f11858oxmwwwfdhm.start();
        }
    }

    private void ntlheqmsrt(Runnable runnable, long j13) {
        if (j13 >= 0) {
            this.f11849iobyxmoadg.postDelayed(runnable, j13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void okpsazkaxt() {
        ViewGroup viewGroup = this.f11845eablkybsjg;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f11859pmvmpeiblj ? 0 : 4);
        }
        if (this.f11841btonecajqb != null) {
            int dimensionPixelSize = this.f11849iobyxmoadg.getResources().getDimensionPixelSize(d5.yggfygwlhe.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11841btonecajqb.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f11859pmvmpeiblj) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f11841btonecajqb.setLayoutParams(marginLayoutParams);
            }
            View view = this.f11841btonecajqb;
            if (view instanceof androidx.media3.ui.zoijcleaow) {
                androidx.media3.ui.zoijcleaow zoijcleaowVar = (androidx.media3.ui.zoijcleaow) view;
                if (this.f11859pmvmpeiblj) {
                    zoijcleaowVar.dxjokdxxww(true);
                } else {
                    int i13 = this.f11854lereixgezr;
                    if (i13 == 1) {
                        zoijcleaowVar.dxjokdxxww(false);
                    } else if (i13 != 3) {
                        zoijcleaowVar.zdlpuopuiu();
                    }
                }
            }
        }
        for (View view2 : this.f11846esjtqupxsv) {
            view2.setVisibility((this.f11859pmvmpeiblj && vipkmwdibw(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pkzmftpjix(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f11867zoijcleaow;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f11860ppxfxbqfkf;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f11845eablkybsjg;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ribwqtqdhb(int i13) {
        int i14 = this.f11854lereixgezr;
        this.f11854lereixgezr = i13;
        if (i13 == 2) {
            this.f11849iobyxmoadg.setVisibility(8);
        } else if (i14 == 2) {
            this.f11849iobyxmoadg.setVisibility(0);
        }
        if (i14 != i13) {
            this.f11849iobyxmoadg.xrmfcynszj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tzroggbefp() {
        int i13;
        if (this.f11848gxszxtbevo == null || this.f11855lqeggnwhkg == null) {
            return;
        }
        int width = (this.f11849iobyxmoadg.getWidth() - this.f11849iobyxmoadg.getPaddingLeft()) - this.f11849iobyxmoadg.getPaddingRight();
        while (true) {
            if (this.f11855lqeggnwhkg.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f11855lqeggnwhkg.getChildCount() - 2;
            View childAt = this.f11855lqeggnwhkg.getChildAt(childCount);
            this.f11855lqeggnwhkg.removeViewAt(childCount);
            this.f11848gxszxtbevo.addView(childAt, 0);
        }
        View view = this.f11847gtknphoqwx;
        if (view != null) {
            view.setVisibility(8);
        }
        int iZynmafqrjb = zynmafqrjb(this.f11844dxjokdxxww);
        int childCount2 = this.f11848gxszxtbevo.getChildCount() - 1;
        for (int i14 = 0; i14 < childCount2; i14++) {
            iZynmafqrjb += zynmafqrjb(this.f11848gxszxtbevo.getChildAt(i14));
        }
        if (iZynmafqrjb <= width) {
            ViewGroup viewGroup = this.f11856nufgyqmvbu;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f11858oxmwwwfdhm.isStarted()) {
                return;
            }
            this.f11862vdvldrhtss.cancel();
            this.f11858oxmwwwfdhm.start();
            return;
        }
        View view2 = this.f11847gtknphoqwx;
        if (view2 != null) {
            view2.setVisibility(0);
            iZynmafqrjb += zynmafqrjb(this.f11847gtknphoqwx);
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = this.f11848gxszxtbevo.getChildAt(i15);
            iZynmafqrjb -= zynmafqrjb(childAt2);
            arrayList.add(childAt2);
            if (iZynmafqrjb <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f11848gxszxtbevo.removeViews(0, arrayList.size());
        for (i13 = 0; i13 < arrayList.size(); i13++) {
            this.f11855lqeggnwhkg.addView((View) arrayList.get(i13), this.f11855lqeggnwhkg.getChildCount() - 1);
        }
    }

    private boolean vipkmwdibw(View view) {
        int id2 = view.getId();
        return id2 == d5.cqumvgiudr.exo_bottom_bar || id2 == d5.cqumvgiudr.exo_prev || id2 == d5.cqumvgiudr.exo_next || id2 == d5.cqumvgiudr.exo_rew || id2 == d5.cqumvgiudr.exo_rew_with_amount || id2 == d5.cqumvgiudr.exo_ffwd || id2 == d5.cqumvgiudr.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wwaezpbzkn() {
        this.f11863wflxmlrfwp.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yadqdtsiqt() {
        ribwqtqdhb(2);
    }

    private static int zynmafqrjb(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public void crxdokpmqz(boolean z13) {
        this.f11850istkbnxepw = z13;
    }

    public void dsvhmnatus() {
        this.f11849iobyxmoadg.addOnLayoutChangeListener(this.f11842cqumvgiudr);
    }

    public void iozdgvuglv() {
        int i13 = this.f11854lereixgezr;
        if (i13 == 3 || i13 == 2) {
            return;
        }
        ulzqkzuiru();
        yadqdtsiqt();
    }

    public void istkbnxepw() {
        int i13 = this.f11854lereixgezr;
        if (i13 == 3 || i13 == 2) {
            return;
        }
        ulzqkzuiru();
        if (!this.f11850istkbnxepw) {
            yadqdtsiqt();
        } else if (this.f11854lereixgezr == 1) {
            wwaezpbzkn();
        } else {
            cdpycssgdh();
        }
    }

    public void jhduphickx() {
        if (!this.f11849iobyxmoadg.jztzpxfvev()) {
            this.f11849iobyxmoadg.setVisibility(0);
            this.f11849iobyxmoadg.zfvoamnweg();
            this.f11849iobyxmoadg.yfnezrywwk();
        }
        ikoacuggdj();
    }

    public void jlmebxxoox(View view, boolean z13) {
        if (view == null) {
            return;
        }
        if (!z13) {
            view.setVisibility(8);
            this.f11846esjtqupxsv.remove(view);
            return;
        }
        if (this.f11859pmvmpeiblj && vipkmwdibw(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f11846esjtqupxsv.add(view);
    }

    public boolean pmvmpeiblj(View view) {
        return view != null && this.f11846esjtqupxsv.contains(view);
    }

    public void sopmlzcsov() {
        if (this.f11854lereixgezr == 3) {
            return;
        }
        ulzqkzuiru();
        int showTimeoutMs = this.f11849iobyxmoadg.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f11850istkbnxepw) {
                ntlheqmsrt(this.f11851iwizpuwonk, showTimeoutMs);
            } else if (this.f11854lereixgezr == 1) {
                ntlheqmsrt(this.f11865yggfygwlhe, MockConstants.TWO_SECONDS_DELAY);
            } else {
                ntlheqmsrt(this.f11852jyumaefscl, showTimeoutMs);
            }
        }
    }

    public void stevsuqkhv(boolean z13, int i13, int i14, int i15, int i16) {
        View view = this.f11867zoijcleaow;
        if (view != null) {
            view.layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    public void ulzqkzuiru() {
        this.f11849iobyxmoadg.removeCallbacks(this.f11851iwizpuwonk);
        this.f11849iobyxmoadg.removeCallbacks(this.f11866zdlpuopuiu);
        this.f11849iobyxmoadg.removeCallbacks(this.f11852jyumaefscl);
        this.f11849iobyxmoadg.removeCallbacks(this.f11865yggfygwlhe);
    }

    public void wypolnanlu() {
        this.f11849iobyxmoadg.removeOnLayoutChangeListener(this.f11842cqumvgiudr);
    }

    public boolean ylkuphrtab() {
        return this.f11854lereixgezr == 0 && this.f11849iobyxmoadg.jztzpxfvev();
    }
}
