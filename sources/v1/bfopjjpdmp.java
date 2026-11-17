package v1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bfopjjpdmp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private eablkybsjg f115076iobyxmoadg;

    private static class eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private float f115077eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115078iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Interpolator f115079ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final long f115080wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f115081zoijcleaow;

        eablkybsjg(int i13, Interpolator interpolator, long j13) {
            this.f115078iobyxmoadg = i13;
            this.f115079ppxfxbqfkf = interpolator;
            this.f115080wkgbmnqykc = j13;
        }

        public void eablkybsjg(float f13) {
            this.f115081zoijcleaow = f13;
        }

        public float iobyxmoadg() {
            return this.f115077eablkybsjg;
        }

        public float ppxfxbqfkf() {
            Interpolator interpolator = this.f115079ppxfxbqfkf;
            return interpolator != null ? interpolator.getInterpolation(this.f115081zoijcleaow) : this.f115081zoijcleaow;
        }

        public int wkgbmnqykc() {
            return this.f115078iobyxmoadg;
        }

        public long zoijcleaow() {
            return this.f115080wkgbmnqykc;
        }
    }

    private static class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final Interpolator f115084gxszxtbevo = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static final Interpolator f115085lqeggnwhkg = new o2.iobyxmoadg();

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static final Interpolator f115086nufgyqmvbu = new DecelerateInterpolator();

        private static class iobyxmoadg implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final zoijcleaow f115087iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private skhdrjzrfn f115088zoijcleaow;

            /* JADX INFO: renamed from: v1.bfopjjpdmp$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            class C2867iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
                final /* synthetic */ View f115089eablkybsjg;

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                final /* synthetic */ bfopjjpdmp f115091iobyxmoadg;

                /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
                final /* synthetic */ skhdrjzrfn f115092ppxfxbqfkf;

                /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
                final /* synthetic */ int f115093wkgbmnqykc;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                final /* synthetic */ skhdrjzrfn f115094zoijcleaow;

                C2867iobyxmoadg(bfopjjpdmp bfopjjpdmpVar, skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn skhdrjzrfnVar2, int i13, View view) {
                    this.f115091iobyxmoadg = bfopjjpdmpVar;
                    this.f115094zoijcleaow = skhdrjzrfnVar;
                    this.f115092ppxfxbqfkf = skhdrjzrfnVar2;
                    this.f115093wkgbmnqykc = i13;
                    this.f115089eablkybsjg = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f115091iobyxmoadg.gxszxtbevo(valueAnimator.getAnimatedFraction());
                    ppxfxbqfkf.draadjrbmk(this.f115089eablkybsjg, ppxfxbqfkf.rgvfuqvkyq(this.f115094zoijcleaow, this.f115092ppxfxbqfkf, this.f115091iobyxmoadg.ppxfxbqfkf(), this.f115093wkgbmnqykc), Collections.singletonList(this.f115091iobyxmoadg));
                }
            }

            /* JADX INFO: renamed from: v1.bfopjjpdmp$ppxfxbqfkf$iobyxmoadg$ppxfxbqfkf, reason: collision with other inner class name */
            class RunnableC2868ppxfxbqfkf implements Runnable {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f115096iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ iobyxmoadg f115097jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ bfopjjpdmp f115098yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ View f115099zdlpuopuiu;

                RunnableC2868ppxfxbqfkf(View view, bfopjjpdmp bfopjjpdmpVar, iobyxmoadg iobyxmoadgVar, ValueAnimator valueAnimator) {
                    this.f115099zdlpuopuiu = view;
                    this.f115098yggfygwlhe = bfopjjpdmpVar;
                    this.f115097jyumaefscl = iobyxmoadgVar;
                    this.f115096iwizpuwonk = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ppxfxbqfkf.wflxmlrfwp(this.f115099zdlpuopuiu, this.f115098yggfygwlhe, this.f115097jyumaefscl);
                    this.f115096iwizpuwonk.start();
                }
            }

            class zoijcleaow extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                final /* synthetic */ bfopjjpdmp f115100iobyxmoadg;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                final /* synthetic */ View f115102zoijcleaow;

                zoijcleaow(bfopjjpdmp bfopjjpdmpVar, View view) {
                    this.f115100iobyxmoadg = bfopjjpdmpVar;
                    this.f115102zoijcleaow = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f115100iobyxmoadg.gxszxtbevo(1.0f);
                    ppxfxbqfkf.btonecajqb(this.f115102zoijcleaow, this.f115100iobyxmoadg);
                }
            }

            iobyxmoadg(View view, zoijcleaow zoijcleaowVar) {
                this.f115087iobyxmoadg = zoijcleaowVar;
                skhdrjzrfn skhdrjzrfnVarLmojexxdyd = jhduphickx.lmojexxdyd(view);
                this.f115088zoijcleaow = skhdrjzrfnVarLmojexxdyd != null ? new skhdrjzrfn.iobyxmoadg(skhdrjzrfnVarLmojexxdyd).iobyxmoadg() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iGxszxtbevo;
                if (!view.isLaidOut()) {
                    this.f115088zoijcleaow = skhdrjzrfn.lereixgezr(windowInsets, view);
                    return ppxfxbqfkf.agtfadlqog(view, windowInsets);
                }
                skhdrjzrfn skhdrjzrfnVarLereixgezr = skhdrjzrfn.lereixgezr(windowInsets, view);
                if (this.f115088zoijcleaow == null) {
                    this.f115088zoijcleaow = jhduphickx.lmojexxdyd(view);
                }
                if (this.f115088zoijcleaow == null) {
                    this.f115088zoijcleaow = skhdrjzrfnVarLereixgezr;
                    return ppxfxbqfkf.agtfadlqog(view, windowInsets);
                }
                zoijcleaow zoijcleaowVarOjitshcjhn = ppxfxbqfkf.ojitshcjhn(view);
                if ((zoijcleaowVarOjitshcjhn == null || !Objects.equals(zoijcleaowVarOjitshcjhn.f115109zdlpuopuiu, windowInsets)) && (iGxszxtbevo = ppxfxbqfkf.gxszxtbevo(skhdrjzrfnVarLereixgezr, this.f115088zoijcleaow)) != 0) {
                    skhdrjzrfn skhdrjzrfnVar = this.f115088zoijcleaow;
                    bfopjjpdmp bfopjjpdmpVar = new bfopjjpdmp(iGxszxtbevo, ppxfxbqfkf.nufgyqmvbu(iGxszxtbevo, skhdrjzrfnVarLereixgezr, skhdrjzrfnVar), 160L);
                    bfopjjpdmpVar.gxszxtbevo(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(bfopjjpdmpVar.zoijcleaow());
                    iobyxmoadg iobyxmoadgVarLqeggnwhkg = ppxfxbqfkf.lqeggnwhkg(skhdrjzrfnVarLereixgezr, skhdrjzrfnVar, iGxszxtbevo);
                    ppxfxbqfkf.gtknphoqwx(view, bfopjjpdmpVar, windowInsets, false);
                    duration.addUpdateListener(new C2867iobyxmoadg(bfopjjpdmpVar, skhdrjzrfnVarLereixgezr, skhdrjzrfnVar, iGxszxtbevo, view));
                    duration.addListener(new zoijcleaow(bfopjjpdmpVar, view));
                    hkdspvbjdz.iobyxmoadg(view, new RunnableC2868ppxfxbqfkf(view, bfopjjpdmpVar, iobyxmoadgVarLqeggnwhkg, duration));
                    this.f115088zoijcleaow = skhdrjzrfnVarLereixgezr;
                    return ppxfxbqfkf.agtfadlqog(view, windowInsets);
                }
                return ppxfxbqfkf.agtfadlqog(view, windowInsets);
            }
        }

        ppxfxbqfkf(int i13, Interpolator interpolator, long j13) {
            super(i13, interpolator, j13);
        }

        static WindowInsets agtfadlqog(View view, WindowInsets windowInsets) {
            return view.getTag(g1.ppxfxbqfkf.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static void btonecajqb(View view, bfopjjpdmp bfopjjpdmpVar) {
            zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn(view);
            if (zoijcleaowVarOjitshcjhn != null) {
                zoijcleaowVarOjitshcjhn.ppxfxbqfkf(bfopjjpdmpVar);
                if (zoijcleaowVarOjitshcjhn.zoijcleaow() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    btonecajqb(viewGroup.getChildAt(i13), bfopjjpdmpVar);
                }
            }
        }

        static void draadjrbmk(View view, skhdrjzrfn skhdrjzrfnVar, List list) {
            zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn(view);
            if (zoijcleaowVarOjitshcjhn != null) {
                skhdrjzrfnVar = zoijcleaowVarOjitshcjhn.eablkybsjg(skhdrjzrfnVar, list);
                if (zoijcleaowVarOjitshcjhn.zoijcleaow() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    draadjrbmk(viewGroup.getChildAt(i13), skhdrjzrfnVar, list);
                }
            }
        }

        private static View.OnApplyWindowInsetsListener dxjokdxxww(View view, zoijcleaow zoijcleaowVar) {
            return new iobyxmoadg(view, zoijcleaowVar);
        }

        static void gtknphoqwx(View view, bfopjjpdmp bfopjjpdmpVar, WindowInsets windowInsets, boolean z13) {
            zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn(view);
            if (zoijcleaowVarOjitshcjhn != null) {
                zoijcleaowVarOjitshcjhn.f115109zdlpuopuiu = windowInsets;
                if (!z13) {
                    zoijcleaowVarOjitshcjhn.wkgbmnqykc(bfopjjpdmpVar);
                    z13 = zoijcleaowVarOjitshcjhn.zoijcleaow() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    gtknphoqwx(viewGroup.getChildAt(i13), bfopjjpdmpVar, windowInsets, z13);
                }
            }
        }

        static int gxszxtbevo(skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn skhdrjzrfnVar2) {
            int i13 = 0;
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if (!skhdrjzrfnVar.gxszxtbevo(i14).equals(skhdrjzrfnVar2.gxszxtbevo(i14))) {
                    i13 |= i14;
                }
            }
            return i13;
        }

        static iobyxmoadg lqeggnwhkg(skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn skhdrjzrfnVar2, int i13) {
            j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = skhdrjzrfnVar.gxszxtbevo(i13);
            j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = skhdrjzrfnVar2.gxszxtbevo(i13);
            return new iobyxmoadg(j1.wkgbmnqykc.zoijcleaow(Math.min(wkgbmnqykcVarGxszxtbevo.f50505iobyxmoadg, wkgbmnqykcVarGxszxtbevo2.f50505iobyxmoadg), Math.min(wkgbmnqykcVarGxszxtbevo.f50508zoijcleaow, wkgbmnqykcVarGxszxtbevo2.f50508zoijcleaow), Math.min(wkgbmnqykcVarGxszxtbevo.f50506ppxfxbqfkf, wkgbmnqykcVarGxszxtbevo2.f50506ppxfxbqfkf), Math.min(wkgbmnqykcVarGxszxtbevo.f50507wkgbmnqykc, wkgbmnqykcVarGxszxtbevo2.f50507wkgbmnqykc)), j1.wkgbmnqykc.zoijcleaow(Math.max(wkgbmnqykcVarGxszxtbevo.f50505iobyxmoadg, wkgbmnqykcVarGxszxtbevo2.f50505iobyxmoadg), Math.max(wkgbmnqykcVarGxszxtbevo.f50508zoijcleaow, wkgbmnqykcVarGxszxtbevo2.f50508zoijcleaow), Math.max(wkgbmnqykcVarGxszxtbevo.f50506ppxfxbqfkf, wkgbmnqykcVarGxszxtbevo2.f50506ppxfxbqfkf), Math.max(wkgbmnqykcVarGxszxtbevo.f50507wkgbmnqykc, wkgbmnqykcVarGxszxtbevo2.f50507wkgbmnqykc)));
        }

        static Interpolator nufgyqmvbu(int i13, skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn skhdrjzrfnVar2) {
            if ((i13 & 8) != 0) {
                return skhdrjzrfnVar.gxszxtbevo(skhdrjzrfn.draadjrbmk.wkgbmnqykc()).f50507wkgbmnqykc > skhdrjzrfnVar2.gxszxtbevo(skhdrjzrfn.draadjrbmk.wkgbmnqykc()).f50507wkgbmnqykc ? f115084gxszxtbevo : f115085lqeggnwhkg;
            }
            return f115086nufgyqmvbu;
        }

        static zoijcleaow ojitshcjhn(View view) {
            Object tag = view.getTag(g1.ppxfxbqfkf.tag_window_insets_animation_callback);
            if (tag instanceof iobyxmoadg) {
                return ((iobyxmoadg) tag).f115087iobyxmoadg;
            }
            return null;
        }

        static skhdrjzrfn rgvfuqvkyq(skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn skhdrjzrfnVar2, float f13, int i13) {
            skhdrjzrfn.iobyxmoadg iobyxmoadgVar = new skhdrjzrfn.iobyxmoadg(skhdrjzrfnVar);
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i13 & i14) == 0) {
                    iobyxmoadgVar.zoijcleaow(i14, skhdrjzrfnVar.gxszxtbevo(i14));
                } else {
                    j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = skhdrjzrfnVar.gxszxtbevo(i14);
                    j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = skhdrjzrfnVar2.gxszxtbevo(i14);
                    float f14 = 1.0f - f13;
                    iobyxmoadgVar.zoijcleaow(i14, skhdrjzrfn.rgvfuqvkyq(wkgbmnqykcVarGxszxtbevo, (int) (((double) ((wkgbmnqykcVarGxszxtbevo.f50505iobyxmoadg - wkgbmnqykcVarGxszxtbevo2.f50505iobyxmoadg) * f14)) + 0.5d), (int) (((double) ((wkgbmnqykcVarGxszxtbevo.f50508zoijcleaow - wkgbmnqykcVarGxszxtbevo2.f50508zoijcleaow) * f14)) + 0.5d), (int) (((double) ((wkgbmnqykcVarGxszxtbevo.f50506ppxfxbqfkf - wkgbmnqykcVarGxszxtbevo2.f50506ppxfxbqfkf) * f14)) + 0.5d), (int) (((double) ((wkgbmnqykcVarGxszxtbevo.f50507wkgbmnqykc - wkgbmnqykcVarGxszxtbevo2.f50507wkgbmnqykc) * f14)) + 0.5d)));
                }
            }
            return iobyxmoadgVar.iobyxmoadg();
        }

        static void vdvldrhtss(View view, zoijcleaow zoijcleaowVar) {
            Object tag = view.getTag(g1.ppxfxbqfkf.tag_on_apply_window_listener);
            if (zoijcleaowVar == null) {
                view.setTag(g1.ppxfxbqfkf.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerDxjokdxxww = dxjokdxxww(view, zoijcleaowVar);
            view.setTag(g1.ppxfxbqfkf.tag_window_insets_animation_callback, onApplyWindowInsetsListenerDxjokdxxww);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerDxjokdxxww);
            }
        }

        static void wflxmlrfwp(View view, bfopjjpdmp bfopjjpdmpVar, iobyxmoadg iobyxmoadgVar) {
            zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn(view);
            if (zoijcleaowVarOjitshcjhn != null) {
                zoijcleaowVarOjitshcjhn.gxszxtbevo(bfopjjpdmpVar, iobyxmoadgVar);
                if (zoijcleaowVarOjitshcjhn.zoijcleaow() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    wflxmlrfwp(viewGroup.getChildAt(i13), bfopjjpdmpVar, iobyxmoadgVar);
                }
            }
        }
    }

    public static abstract class zoijcleaow {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f115108yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        WindowInsets f115109zdlpuopuiu;

        public zoijcleaow(int i13) {
            this.f115108yggfygwlhe = i13;
        }

        public abstract skhdrjzrfn eablkybsjg(skhdrjzrfn skhdrjzrfnVar, List list);

        public iobyxmoadg gxszxtbevo(bfopjjpdmp bfopjjpdmpVar, iobyxmoadg iobyxmoadgVar) {
            return iobyxmoadgVar;
        }

        public void ppxfxbqfkf(bfopjjpdmp bfopjjpdmpVar) {
        }

        public void wkgbmnqykc(bfopjjpdmp bfopjjpdmpVar) {
        }

        public final int zoijcleaow() {
            return this.f115108yggfygwlhe;
        }
    }

    public bfopjjpdmp(int i13, Interpolator interpolator, long j13) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f115076iobyxmoadg = new wkgbmnqykc(i13, interpolator, j13);
        } else {
            this.f115076iobyxmoadg = new ppxfxbqfkf(i13, interpolator, j13);
        }
    }

    static void eablkybsjg(View view, zoijcleaow zoijcleaowVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            wkgbmnqykc.dxjokdxxww(view, zoijcleaowVar);
        } else {
            ppxfxbqfkf.vdvldrhtss(view, zoijcleaowVar);
        }
    }

    static bfopjjpdmp lqeggnwhkg(WindowInsetsAnimation windowInsetsAnimation) {
        return new bfopjjpdmp(windowInsetsAnimation);
    }

    public void gxszxtbevo(float f13) {
        this.f115076iobyxmoadg.eablkybsjg(f13);
    }

    public float iobyxmoadg() {
        return this.f115076iobyxmoadg.iobyxmoadg();
    }

    public float ppxfxbqfkf() {
        return this.f115076iobyxmoadg.ppxfxbqfkf();
    }

    public int wkgbmnqykc() {
        return this.f115076iobyxmoadg.wkgbmnqykc();
    }

    public long zoijcleaow() {
        return this.f115076iobyxmoadg.zoijcleaow();
    }

    private static class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final WindowInsetsAnimation f115103gxszxtbevo;

        private static class iobyxmoadg extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final zoijcleaow f115104iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private ArrayList f115105ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final HashMap f115106wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private List f115107zoijcleaow;

            iobyxmoadg(zoijcleaow zoijcleaowVar) {
                super(zoijcleaowVar.zoijcleaow());
                this.f115106wkgbmnqykc = new HashMap();
                this.f115104iobyxmoadg = zoijcleaowVar;
            }

            private bfopjjpdmp iobyxmoadg(WindowInsetsAnimation windowInsetsAnimation) {
                bfopjjpdmp bfopjjpdmpVar = (bfopjjpdmp) this.f115106wkgbmnqykc.get(windowInsetsAnimation);
                if (bfopjjpdmpVar != null) {
                    return bfopjjpdmpVar;
                }
                bfopjjpdmp bfopjjpdmpVarLqeggnwhkg = bfopjjpdmp.lqeggnwhkg(windowInsetsAnimation);
                this.f115106wkgbmnqykc.put(windowInsetsAnimation, bfopjjpdmpVarLqeggnwhkg);
                return bfopjjpdmpVarLqeggnwhkg;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f115104iobyxmoadg.ppxfxbqfkf(iobyxmoadg(windowInsetsAnimation));
                this.f115106wkgbmnqykc.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f115104iobyxmoadg.wkgbmnqykc(iobyxmoadg(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f115105ppxfxbqfkf;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f115105ppxfxbqfkf = arrayList2;
                    this.f115107zoijcleaow = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationIobyxmoadg = iwxlajgraz.iobyxmoadg(list.get(size));
                    bfopjjpdmp bfopjjpdmpVarIobyxmoadg = iobyxmoadg(windowInsetsAnimationIobyxmoadg);
                    bfopjjpdmpVarIobyxmoadg.gxszxtbevo(windowInsetsAnimationIobyxmoadg.getFraction());
                    this.f115105ppxfxbqfkf.add(bfopjjpdmpVarIobyxmoadg);
                }
                return this.f115104iobyxmoadg.eablkybsjg(skhdrjzrfn.esjtqupxsv(windowInsets), this.f115107zoijcleaow).cqumvgiudr();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f115104iobyxmoadg.gxszxtbevo(iobyxmoadg(windowInsetsAnimation), iobyxmoadg.eablkybsjg(bounds)).wkgbmnqykc();
            }
        }

        wkgbmnqykc(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f115103gxszxtbevo = windowInsetsAnimation;
        }

        public static void dxjokdxxww(View view, zoijcleaow zoijcleaowVar) {
            view.setWindowInsetsAnimationCallback(zoijcleaowVar != null ? new iobyxmoadg(zoijcleaowVar) : null);
        }

        public static WindowInsetsAnimation.Bounds gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
            auzgnhcxok.iobyxmoadg();
            return uawqvzlxes.iobyxmoadg(iobyxmoadgVar.iobyxmoadg().eablkybsjg(), iobyxmoadgVar.zoijcleaow().eablkybsjg());
        }

        public static j1.wkgbmnqykc lqeggnwhkg(WindowInsetsAnimation.Bounds bounds) {
            return j1.wkgbmnqykc.wkgbmnqykc(bounds.getUpperBound());
        }

        public static j1.wkgbmnqykc nufgyqmvbu(WindowInsetsAnimation.Bounds bounds) {
            return j1.wkgbmnqykc.wkgbmnqykc(bounds.getLowerBound());
        }

        @Override // v1.bfopjjpdmp.eablkybsjg
        public void eablkybsjg(float f13) {
            this.f115103gxszxtbevo.setFraction(f13);
        }

        @Override // v1.bfopjjpdmp.eablkybsjg
        public float ppxfxbqfkf() {
            return this.f115103gxszxtbevo.getInterpolatedFraction();
        }

        @Override // v1.bfopjjpdmp.eablkybsjg
        public int wkgbmnqykc() {
            return this.f115103gxszxtbevo.getTypeMask();
        }

        @Override // v1.bfopjjpdmp.eablkybsjg
        public long zoijcleaow() {
            return this.f115103gxszxtbevo.getDurationMillis();
        }

        wkgbmnqykc(int i13, Interpolator interpolator, long j13) {
            this(roivzttewh.iobyxmoadg(i13, interpolator, j13));
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final j1.wkgbmnqykc f115082iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final j1.wkgbmnqykc f115083zoijcleaow;

        public iobyxmoadg(j1.wkgbmnqykc wkgbmnqykcVar, j1.wkgbmnqykc wkgbmnqykcVar2) {
            this.f115082iobyxmoadg = wkgbmnqykcVar;
            this.f115083zoijcleaow = wkgbmnqykcVar2;
        }

        public static iobyxmoadg eablkybsjg(WindowInsetsAnimation.Bounds bounds) {
            return new iobyxmoadg(bounds);
        }

        public j1.wkgbmnqykc iobyxmoadg() {
            return this.f115082iobyxmoadg;
        }

        public iobyxmoadg ppxfxbqfkf(j1.wkgbmnqykc wkgbmnqykcVar) {
            return new iobyxmoadg(skhdrjzrfn.rgvfuqvkyq(this.f115082iobyxmoadg, wkgbmnqykcVar.f50505iobyxmoadg, wkgbmnqykcVar.f50508zoijcleaow, wkgbmnqykcVar.f50506ppxfxbqfkf, wkgbmnqykcVar.f50507wkgbmnqykc), skhdrjzrfn.rgvfuqvkyq(this.f115083zoijcleaow, wkgbmnqykcVar.f50505iobyxmoadg, wkgbmnqykcVar.f50508zoijcleaow, wkgbmnqykcVar.f50506ppxfxbqfkf, wkgbmnqykcVar.f50507wkgbmnqykc));
        }

        public String toString() {
            return "Bounds{lower=" + this.f115082iobyxmoadg + " upper=" + this.f115083zoijcleaow + "}";
        }

        public WindowInsetsAnimation.Bounds wkgbmnqykc() {
            return wkgbmnqykc.gxszxtbevo(this);
        }

        public j1.wkgbmnqykc zoijcleaow() {
            return this.f115083zoijcleaow;
        }

        private iobyxmoadg(WindowInsetsAnimation.Bounds bounds) {
            this.f115082iobyxmoadg = wkgbmnqykc.nufgyqmvbu(bounds);
            this.f115083zoijcleaow = wkgbmnqykc.lqeggnwhkg(bounds);
        }
    }

    private bfopjjpdmp(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f115076iobyxmoadg = new wkgbmnqykc(windowInsetsAnimation);
        }
    }
}
