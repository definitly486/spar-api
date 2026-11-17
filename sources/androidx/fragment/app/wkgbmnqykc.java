package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import v1.jhduphickx;
import v1.xrmfcynszj;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends ntlheqmsrt {

    static final class dxjokdxxww extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Collection f9361zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(Collection collection) {
            super(1);
            this.f9361zdlpuopuiu = collection;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entry, "entry");
            return Boolean.valueOf(hg.jyumaefscl.xrmfcynszj(this.f9361zdlpuopuiu, jhduphickx.ylkuphrtab((View) entry.getValue())));
        }
    }

    public static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f9362iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public final void iobyxmoadg(AnimatorSet animatorSet) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void zoijcleaow(AnimatorSet animatorSet, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j13);
        }
    }

    public static class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ntlheqmsrt.wkgbmnqykc f9363iobyxmoadg;

        public gxszxtbevo(ntlheqmsrt.wkgbmnqykc operation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "operation");
            this.f9363iobyxmoadg = operation;
        }

        public final ntlheqmsrt.wkgbmnqykc iobyxmoadg() {
            return this.f9363iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVar;
            View view = this.f9363iobyxmoadg.nufgyqmvbu().mView;
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVarIobyxmoadg = view != null ? ntlheqmsrt.wkgbmnqykc.zoijcleaow.f9324zdlpuopuiu.iobyxmoadg(view) : null;
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVarLqeggnwhkg = this.f9363iobyxmoadg.lqeggnwhkg();
            return zoijcleaowVarIobyxmoadg == zoijcleaowVarLqeggnwhkg || !(zoijcleaowVarIobyxmoadg == (zoijcleaowVar = ntlheqmsrt.wkgbmnqykc.zoijcleaow.VISIBLE) || zoijcleaowVarLqeggnwhkg == zoijcleaowVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg extends ntlheqmsrt.zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final zoijcleaow f9364wkgbmnqykc;

        /* JADX INFO: renamed from: androidx.fragment.app.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0144iobyxmoadg implements Animation.AnimationListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ ntlheqmsrt.wkgbmnqykc f9365iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ View f9366ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f9367wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ ViewGroup f9368zoijcleaow;

            AnimationAnimationListenerC0144iobyxmoadg(ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar, ViewGroup viewGroup, View view, iobyxmoadg iobyxmoadgVar) {
                this.f9365iobyxmoadg = wkgbmnqykcVar;
                this.f9368zoijcleaow = viewGroup;
                this.f9366ppxfxbqfkf = view;
                this.f9367wkgbmnqykc = iobyxmoadgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void zoijcleaow(ViewGroup container, View view, iobyxmoadg this$0) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "$container");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
                container.endViewTransition(view);
                this$0.nufgyqmvbu().iobyxmoadg().eablkybsjg(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
                final ViewGroup viewGroup = this.f9368zoijcleaow;
                final View view = this.f9366ppxfxbqfkf;
                final iobyxmoadg iobyxmoadgVar = this.f9367wkgbmnqykc;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.ppxfxbqfkf
                    @Override // java.lang.Runnable
                    public final void run() {
                        wkgbmnqykc.iobyxmoadg.AnimationAnimationListenerC0144iobyxmoadg.zoijcleaow(viewGroup, view, iobyxmoadgVar);
                    }
                });
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f9365iobyxmoadg + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f9365iobyxmoadg + " has reached onAnimationStart.");
                }
            }
        }

        public iobyxmoadg(zoijcleaow animationInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animationInfo, "animationInfo");
            this.f9364wkgbmnqykc = animationInfo;
        }

        public final zoijcleaow nufgyqmvbu() {
            return this.f9364wkgbmnqykc;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void ppxfxbqfkf(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f9364wkgbmnqykc.iobyxmoadg();
            View view = wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f9364wkgbmnqykc.iobyxmoadg().eablkybsjg(this);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Animation from operation " + wkgbmnqykcVarIobyxmoadg + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void wkgbmnqykc(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            if (this.f9364wkgbmnqykc.zoijcleaow()) {
                this.f9364wkgbmnqykc.iobyxmoadg().eablkybsjg(this);
                return;
            }
            Context context = container.getContext();
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f9364wkgbmnqykc.iobyxmoadg();
            View view = wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().mView;
            zoijcleaow zoijcleaowVar = this.f9364wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
            kcexrzcfyt.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(context);
            if (iobyxmoadgVarPpxfxbqfkf == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = iobyxmoadgVarPpxfxbqfkf.f9272iobyxmoadg;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (wkgbmnqykcVarIobyxmoadg.lqeggnwhkg() != ntlheqmsrt.wkgbmnqykc.zoijcleaow.REMOVED) {
                view.startAnimation(animation);
                this.f9364wkgbmnqykc.iobyxmoadg().eablkybsjg(this);
                return;
            }
            container.startViewTransition(view);
            kcexrzcfyt.zoijcleaow zoijcleaowVar2 = new kcexrzcfyt.zoijcleaow(animation, container, view);
            zoijcleaowVar2.setAnimationListener(new AnimationAnimationListenerC0144iobyxmoadg(wkgbmnqykcVarIobyxmoadg, container, view, this));
            view.startAnimation(zoijcleaowVar2);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Animation from operation " + wkgbmnqykcVarIobyxmoadg + " has started.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class lqeggnwhkg extends ntlheqmsrt.zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private final androidx.collection.iobyxmoadg f9369agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final ArrayList f9370btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final ArrayList f9371draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final ArrayList f9372dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final ntlheqmsrt.wkgbmnqykc f9373eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final androidx.collection.iobyxmoadg f9374gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final ntlheqmsrt.wkgbmnqykc f9375gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final dsvhmnatus f9376lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final Object f9377nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private final androidx.collection.iobyxmoadg f9378ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private Object f9379oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private final boolean f9380rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private final q1.wkgbmnqykc f9381vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final ArrayList f9382wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f9383wkgbmnqykc;

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ Object f9384jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ViewGroup f9385yggfygwlhe;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f9385yggfygwlhe = viewGroup;
                this.f9384jyumaefscl = obj;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                lqeggnwhkg.this.jyumaefscl().eablkybsjg(this.f9385yggfygwlhe, this.f9384jyumaefscl);
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f9387iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ Object f9388jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ViewGroup f9389yggfygwlhe;

            static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ ViewGroup f9391jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ Object f9392yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ lqeggnwhkg f9393zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f9393zdlpuopuiu = lqeggnwhkgVar;
                    this.f9392yggfygwlhe = obj;
                    this.f9391jyumaefscl = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void agtfadlqog(lqeggnwhkg this$0, ViewGroup container) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "$container");
                    Iterator it = this$0.iwizpuwonk().iterator();
                    while (it.hasNext()) {
                        ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ((nufgyqmvbu) it.next()).iobyxmoadg();
                        View view = wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().getView();
                        if (view != null) {
                            wkgbmnqykcVarIobyxmoadg.lqeggnwhkg().wkgbmnqykc(view, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void ojitshcjhn(lqeggnwhkg this$0) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator it = this$0.iwizpuwonk().iterator();
                    while (it.hasNext()) {
                        ((nufgyqmvbu) it.next()).iobyxmoadg().eablkybsjg(this$0);
                    }
                }

                public final void btonecajqb() {
                    List listIwizpuwonk = this.f9393zdlpuopuiu.iwizpuwonk();
                    if (listIwizpuwonk == null || !listIwizpuwonk.isEmpty()) {
                        Iterator it = listIwizpuwonk.iterator();
                        while (it.hasNext()) {
                            if (!((nufgyqmvbu) it.next()).iobyxmoadg().wflxmlrfwp()) {
                                if (FragmentManager.rhgxfdycjh(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                q1.wkgbmnqykc wkgbmnqykcVar = new q1.wkgbmnqykc();
                                dsvhmnatus dsvhmnatusVarJyumaefscl = this.f9393zdlpuopuiu.jyumaefscl();
                                Fragment fragmentNufgyqmvbu = ((nufgyqmvbu) this.f9393zdlpuopuiu.iwizpuwonk().get(0)).iobyxmoadg().nufgyqmvbu();
                                Object obj = this.f9392yggfygwlhe;
                                final lqeggnwhkg lqeggnwhkgVar = this.f9393zdlpuopuiu;
                                dsvhmnatusVarJyumaefscl.iwizpuwonk(fragmentNufgyqmvbu, obj, wkgbmnqykcVar, new Runnable() { // from class: androidx.fragment.app.draadjrbmk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        wkgbmnqykc.lqeggnwhkg.zoijcleaow.iobyxmoadg.ojitshcjhn(lqeggnwhkgVar);
                                    }
                                });
                                wkgbmnqykcVar.iobyxmoadg();
                                return;
                            }
                        }
                    }
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    dsvhmnatus dsvhmnatusVarJyumaefscl2 = this.f9393zdlpuopuiu.jyumaefscl();
                    Object objKcexrzcfyt = this.f9393zdlpuopuiu.kcexrzcfyt();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objKcexrzcfyt);
                    final lqeggnwhkg lqeggnwhkgVar2 = this.f9393zdlpuopuiu;
                    final ViewGroup viewGroup = this.f9391jyumaefscl;
                    dsvhmnatusVarJyumaefscl2.wkgbmnqykc(objKcexrzcfyt, new Runnable() { // from class: androidx.fragment.app.gtknphoqwx
                        @Override // java.lang.Runnable
                        public final void run() {
                            wkgbmnqykc.lqeggnwhkg.zoijcleaow.iobyxmoadg.agtfadlqog(lqeggnwhkgVar2, viewGroup);
                        }
                    });
                }

                @Override // tg.iobyxmoadg
                public /* bridge */ /* synthetic */ Object invoke() {
                    btonecajqb();
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(ViewGroup viewGroup, Object obj, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar) {
                super(0);
                this.f9389yggfygwlhe = viewGroup;
                this.f9388jyumaefscl = obj;
                this.f9387iwizpuwonk = hkdspvbjdzVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
                lqeggnwhkgVar.istkbnxepw(lqeggnwhkgVar.jyumaefscl().btonecajqb(this.f9389yggfygwlhe, this.f9388jyumaefscl));
                boolean z13 = lqeggnwhkg.this.kcexrzcfyt() != null;
                Object obj = this.f9388jyumaefscl;
                ViewGroup viewGroup = this.f9389yggfygwlhe;
                if (!z13) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f9387iwizpuwonk.f60015zdlpuopuiu = new iobyxmoadg(lqeggnwhkg.this, obj, viewGroup);
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + lqeggnwhkg.this.zdlpuopuiu() + " to " + lqeggnwhkg.this.yggfygwlhe());
                }
            }
        }

        public lqeggnwhkg(List transitionInfos, ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar, ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar2, dsvhmnatus transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, androidx.collection.iobyxmoadg sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, androidx.collection.iobyxmoadg firstOutViews, androidx.collection.iobyxmoadg lastInViews, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transitionInfos, "transitionInfos");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transitionImpl, "transitionImpl");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedElementLastInViews, "sharedElementLastInViews");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedElementNameMapping, "sharedElementNameMapping");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enteringNames, "enteringNames");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(exitingNames, "exitingNames");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firstOutViews, "firstOutViews");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lastInViews, "lastInViews");
            this.f9383wkgbmnqykc = transitionInfos;
            this.f9373eablkybsjg = wkgbmnqykcVar;
            this.f9375gxszxtbevo = wkgbmnqykcVar2;
            this.f9376lqeggnwhkg = transitionImpl;
            this.f9377nufgyqmvbu = obj;
            this.f9372dxjokdxxww = sharedElementFirstOutViews;
            this.f9370btonecajqb = sharedElementLastInViews;
            this.f9374gtknphoqwx = sharedElementNameMapping;
            this.f9371draadjrbmk = enteringNames;
            this.f9382wflxmlrfwp = exitingNames;
            this.f9369agtfadlqog = firstOutViews;
            this.f9378ojitshcjhn = lastInViews;
            this.f9380rgvfuqvkyq = z13;
            this.f9381vdvldrhtss = new q1.wkgbmnqykc();
        }

        private final void agtfadlqog(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (xrmfcynszj.iobyxmoadg(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View child = viewGroup.getChildAt(i13);
                if (child.getVisibility() == 0) {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(child, "child");
                    agtfadlqog(arrayList, child);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void esjtqupxsv(ntlheqmsrt.wkgbmnqykc operation, lqeggnwhkg this$0) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "$operation");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.eablkybsjg(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void lereixgezr(kotlin.jvm.internal.hkdspvbjdz seekCancelLambda) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(seekCancelLambda, "$seekCancelLambda");
            tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) seekCancelLambda.f60015zdlpuopuiu;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        }

        private final gg.vdvldrhtss ojitshcjhn(ViewGroup viewGroup, final ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar, final ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar2) {
            wkgbmnqykcVar = wkgbmnqykcVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f9383wkgbmnqykc.iterator();
            boolean z13 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((nufgyqmvbu) it.next()).lqeggnwhkg() && wkgbmnqykcVar2 != null && wkgbmnqykcVar != null && !this.f9374gtknphoqwx.isEmpty() && this.f9377nufgyqmvbu != null) {
                    hkdspvbjdz.iobyxmoadg(wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar2.nufgyqmvbu(), this.f9380rgvfuqvkyq, this.f9369agtfadlqog, true);
                    v1.hkdspvbjdz.iobyxmoadg(viewGroup, new Runnable() { // from class: androidx.fragment.app.nufgyqmvbu
                        @Override // java.lang.Runnable
                        public final void run() {
                            wkgbmnqykc.lqeggnwhkg.rgvfuqvkyq(wkgbmnqykcVar, wkgbmnqykcVar2, this);
                        }
                    });
                    this.f9372dxjokdxxww.addAll(this.f9369agtfadlqog.values());
                    if (!this.f9382wflxmlrfwp.isEmpty()) {
                        Object obj = this.f9382wflxmlrfwp.get(0);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(obj, "exitingNames[0]");
                        view2 = (View) this.f9369agtfadlqog.get((String) obj);
                        this.f9376lqeggnwhkg.jyumaefscl(this.f9377nufgyqmvbu, view2);
                    }
                    this.f9370btonecajqb.addAll(this.f9378ojitshcjhn.values());
                    if (!this.f9371draadjrbmk.isEmpty()) {
                        Object obj2 = this.f9371draadjrbmk.get(0);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f9378ojitshcjhn.get((String) obj2);
                        if (view3 != null) {
                            final dsvhmnatus dsvhmnatusVar = this.f9376lqeggnwhkg;
                            v1.hkdspvbjdz.iobyxmoadg(viewGroup, new Runnable() { // from class: androidx.fragment.app.dxjokdxxww
                                @Override // java.lang.Runnable
                                public final void run() {
                                    wkgbmnqykc.lqeggnwhkg.vdvldrhtss(dsvhmnatusVar, view3, rect);
                                }
                            });
                            z13 = true;
                        }
                    }
                    this.f9376lqeggnwhkg.lereixgezr(this.f9377nufgyqmvbu, view, this.f9372dxjokdxxww);
                    dsvhmnatus dsvhmnatusVar2 = this.f9376lqeggnwhkg;
                    Object obj3 = this.f9377nufgyqmvbu;
                    dsvhmnatusVar2.kcexrzcfyt(obj3, null, null, null, null, obj3, this.f9370btonecajqb);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f9383wkgbmnqykc.iterator();
            Object objRgvfuqvkyq = null;
            Object objRgvfuqvkyq2 = null;
            while (it2.hasNext()) {
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) it2.next();
                ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = nufgyqmvbuVar.iobyxmoadg();
                it2 = it2;
                Object objNufgyqmvbu = this.f9376lqeggnwhkg.nufgyqmvbu(nufgyqmvbuVar.gxszxtbevo());
                if (objNufgyqmvbu != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Object obj4 = objRgvfuqvkyq2;
                    View view4 = wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().mView;
                    Object obj5 = objRgvfuqvkyq;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view4, "operation.fragment.mView");
                    agtfadlqog(arrayList2, view4);
                    if (this.f9377nufgyqmvbu != null && (wkgbmnqykcVarIobyxmoadg == wkgbmnqykcVar2 || wkgbmnqykcVarIobyxmoadg == wkgbmnqykcVar)) {
                        if (wkgbmnqykcVarIobyxmoadg == wkgbmnqykcVar2) {
                            arrayList2.removeAll(hg.jyumaefscl.r(this.f9372dxjokdxxww));
                        } else {
                            arrayList2.removeAll(hg.jyumaefscl.r(this.f9370btonecajqb));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f9376lqeggnwhkg.iobyxmoadg(objNufgyqmvbu, view);
                    } else {
                        this.f9376lqeggnwhkg.zoijcleaow(objNufgyqmvbu, arrayList2);
                        this.f9376lqeggnwhkg.kcexrzcfyt(objNufgyqmvbu, objNufgyqmvbu, arrayList2, null, null, null, null);
                        if (wkgbmnqykcVarIobyxmoadg.lqeggnwhkg() == ntlheqmsrt.wkgbmnqykc.zoijcleaow.GONE) {
                            wkgbmnqykcVarIobyxmoadg.vdvldrhtss(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().mView);
                            this.f9376lqeggnwhkg.oxmwwwfdhm(objNufgyqmvbu, wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().mView, arrayList3);
                            v1.hkdspvbjdz.iobyxmoadg(viewGroup, new Runnable() { // from class: androidx.fragment.app.btonecajqb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    wkgbmnqykc.lqeggnwhkg.oxmwwwfdhm(arrayList2);
                                }
                            });
                        }
                    }
                    if (wkgbmnqykcVarIobyxmoadg.lqeggnwhkg() == ntlheqmsrt.wkgbmnqykc.zoijcleaow.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z13) {
                            this.f9376lqeggnwhkg.yggfygwlhe(objNufgyqmvbu, rect);
                        }
                        if (FragmentManager.rhgxfdycjh(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objNufgyqmvbu);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object transitioningViews : arrayList2) {
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.f9376lqeggnwhkg.jyumaefscl(objNufgyqmvbu, view2);
                        if (FragmentManager.rhgxfdycjh(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objNufgyqmvbu);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object transitioningViews2 : arrayList2) {
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (nufgyqmvbuVar.nufgyqmvbu()) {
                        objRgvfuqvkyq = this.f9376lqeggnwhkg.rgvfuqvkyq(obj5, objNufgyqmvbu, null);
                        objRgvfuqvkyq2 = obj4;
                    } else {
                        objRgvfuqvkyq = obj5;
                        objRgvfuqvkyq2 = this.f9376lqeggnwhkg.rgvfuqvkyq(obj4, objNufgyqmvbu, null);
                    }
                }
            }
            Object objOjitshcjhn = this.f9376lqeggnwhkg.ojitshcjhn(objRgvfuqvkyq, objRgvfuqvkyq2, this.f9377nufgyqmvbu);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objOjitshcjhn);
            }
            return new gg.vdvldrhtss(arrayList, objOjitshcjhn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void oxmwwwfdhm(ArrayList transitioningViews) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transitioningViews, "$transitioningViews");
            hkdspvbjdz.wkgbmnqykc(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void pmvmpeiblj(ntlheqmsrt.wkgbmnqykc operation, lqeggnwhkg this$0) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "$operation");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.eablkybsjg(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void rgvfuqvkyq(ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar, ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar2, lqeggnwhkg this$0) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
            hkdspvbjdz.iobyxmoadg(wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar2.nufgyqmvbu(), this$0.f9380rgvfuqvkyq, this$0.f9378ojitshcjhn, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void vdvldrhtss(dsvhmnatus impl, View view, Rect lastInEpicenterRect) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(impl, "$impl");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.gtknphoqwx(view, lastInEpicenterRect);
        }

        private final void zynmafqrjb(ArrayList arrayList, ViewGroup viewGroup, tg.iobyxmoadg iobyxmoadgVar) {
            hkdspvbjdz.wkgbmnqykc(arrayList, 4);
            ArrayList arrayListVdvldrhtss = this.f9376lqeggnwhkg.vdvldrhtss(this.f9370btonecajqb);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object sharedElementFirstOutViews : this.f9372dxjokdxxww) {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + jhduphickx.ylkuphrtab(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object sharedElementLastInViews : this.f9370btonecajqb) {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + jhduphickx.ylkuphrtab(view2));
                }
            }
            iobyxmoadgVar.invoke();
            this.f9376lqeggnwhkg.esjtqupxsv(viewGroup, this.f9372dxjokdxxww, this.f9370btonecajqb, arrayListVdvldrhtss, this.f9374gtknphoqwx);
            hkdspvbjdz.wkgbmnqykc(arrayList, 0);
            this.f9376lqeggnwhkg.pmvmpeiblj(this.f9377nufgyqmvbu, this.f9372dxjokdxxww, this.f9370btonecajqb);
        }

        public final boolean cqumvgiudr() {
            List list = this.f9383wkgbmnqykc;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((nufgyqmvbu) it.next()).iobyxmoadg().nufgyqmvbu().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void eablkybsjg(androidx.activity.zoijcleaow backEvent, ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            Object obj = this.f9379oxmwwwfdhm;
            if (obj != null) {
                this.f9376lqeggnwhkg.zdlpuopuiu(obj, backEvent.iobyxmoadg());
            }
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void gxszxtbevo(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f9383wkgbmnqykc.iterator();
                while (it.hasNext()) {
                    ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ((nufgyqmvbu) it.next()).iobyxmoadg();
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + wkgbmnqykcVarIobyxmoadg);
                    }
                }
                return;
            }
            if (cqumvgiudr() && this.f9377nufgyqmvbu != null && !zoijcleaow()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f9377nufgyqmvbu + " between " + this.f9373eablkybsjg + " and " + this.f9375gxszxtbevo + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (zoijcleaow() && cqumvgiudr()) {
                final kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
                gg.vdvldrhtss vdvldrhtssVarOjitshcjhn = ojitshcjhn(container, this.f9375gxszxtbevo, this.f9373eablkybsjg);
                ArrayList arrayList = (ArrayList) vdvldrhtssVarOjitshcjhn.iobyxmoadg();
                Object objWkgbmnqykc = vdvldrhtssVarOjitshcjhn.wkgbmnqykc();
                List list = this.f9383wkgbmnqykc;
                ArrayList<ntlheqmsrt.wkgbmnqykc> arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((nufgyqmvbu) it2.next()).iobyxmoadg());
                }
                for (final ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar : arrayList2) {
                    this.f9376lqeggnwhkg.cqumvgiudr(wkgbmnqykcVar.nufgyqmvbu(), objWkgbmnqykc, this.f9381vdvldrhtss, new Runnable() { // from class: androidx.fragment.app.eablkybsjg
                        @Override // java.lang.Runnable
                        public final void run() {
                            wkgbmnqykc.lqeggnwhkg.lereixgezr(hkdspvbjdzVar);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.gxszxtbevo
                        @Override // java.lang.Runnable
                        public final void run() {
                            wkgbmnqykc.lqeggnwhkg.pmvmpeiblj(wkgbmnqykcVar, this);
                        }
                    });
                }
                zynmafqrjb(arrayList, container, new zoijcleaow(container, objWkgbmnqykc, hkdspvbjdzVar));
            }
        }

        public final void istkbnxepw(Object obj) {
            this.f9379oxmwwwfdhm = obj;
        }

        public final List iwizpuwonk() {
            return this.f9383wkgbmnqykc;
        }

        public final dsvhmnatus jyumaefscl() {
            return this.f9376lqeggnwhkg;
        }

        public final Object kcexrzcfyt() {
            return this.f9379oxmwwwfdhm;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void ppxfxbqfkf(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            this.f9381vdvldrhtss.iobyxmoadg();
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void wkgbmnqykc(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            if (!container.isLaidOut()) {
                for (nufgyqmvbu nufgyqmvbuVar : this.f9383wkgbmnqykc) {
                    ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = nufgyqmvbuVar.iobyxmoadg();
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + wkgbmnqykcVarIobyxmoadg);
                    }
                    nufgyqmvbuVar.iobyxmoadg().eablkybsjg(this);
                }
                return;
            }
            Object obj = this.f9379oxmwwwfdhm;
            if (obj != null) {
                dsvhmnatus dsvhmnatusVar = this.f9376lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
                dsvhmnatusVar.ppxfxbqfkf(obj);
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f9373eablkybsjg + " to " + this.f9375gxszxtbevo);
                    return;
                }
                return;
            }
            gg.vdvldrhtss vdvldrhtssVarOjitshcjhn = ojitshcjhn(container, this.f9375gxszxtbevo, this.f9373eablkybsjg);
            ArrayList arrayList = (ArrayList) vdvldrhtssVarOjitshcjhn.iobyxmoadg();
            Object objWkgbmnqykc = vdvldrhtssVarOjitshcjhn.wkgbmnqykc();
            List list = this.f9383wkgbmnqykc;
            ArrayList<ntlheqmsrt.wkgbmnqykc> arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((nufgyqmvbu) it.next()).iobyxmoadg());
            }
            for (final ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar : arrayList2) {
                this.f9376lqeggnwhkg.iwizpuwonk(wkgbmnqykcVar.nufgyqmvbu(), objWkgbmnqykc, this.f9381vdvldrhtss, new Runnable() { // from class: androidx.fragment.app.lqeggnwhkg
                    @Override // java.lang.Runnable
                    public final void run() {
                        wkgbmnqykc.lqeggnwhkg.esjtqupxsv(wkgbmnqykcVar, this);
                    }
                });
            }
            zynmafqrjb(arrayList, container, new iobyxmoadg(container, objWkgbmnqykc));
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f9373eablkybsjg + " to " + this.f9375gxszxtbevo);
            }
        }

        public final ntlheqmsrt.wkgbmnqykc yggfygwlhe() {
            return this.f9375gxszxtbevo;
        }

        public final ntlheqmsrt.wkgbmnqykc zdlpuopuiu() {
            return this.f9373eablkybsjg;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public boolean zoijcleaow() {
            Object obj;
            if (this.f9376lqeggnwhkg.wflxmlrfwp()) {
                List<nufgyqmvbu> list = this.f9383wkgbmnqykc;
                if (list != null && list.isEmpty()) {
                    obj = this.f9377nufgyqmvbu;
                    if (obj != null) {
                    }
                    return true;
                }
                for (nufgyqmvbu nufgyqmvbuVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || nufgyqmvbuVar.gxszxtbevo() == null || !this.f9376lqeggnwhkg.agtfadlqog(nufgyqmvbuVar.gxszxtbevo())) {
                    }
                }
                obj = this.f9377nufgyqmvbu;
                if (obj != null || this.f9376lqeggnwhkg.agtfadlqog(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f9394ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Object f9395wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Object f9396zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(ntlheqmsrt.wkgbmnqykc operation, boolean z13, boolean z14) {
            Object returnTransition;
            super(operation);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "operation");
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVarLqeggnwhkg = operation.lqeggnwhkg();
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVar = ntlheqmsrt.wkgbmnqykc.zoijcleaow.VISIBLE;
            if (zoijcleaowVarLqeggnwhkg == zoijcleaowVar) {
                Fragment fragmentNufgyqmvbu = operation.nufgyqmvbu();
                returnTransition = z13 ? fragmentNufgyqmvbu.getReenterTransition() : fragmentNufgyqmvbu.getEnterTransition();
            } else {
                Fragment fragmentNufgyqmvbu2 = operation.nufgyqmvbu();
                returnTransition = z13 ? fragmentNufgyqmvbu2.getReturnTransition() : fragmentNufgyqmvbu2.getExitTransition();
            }
            this.f9396zoijcleaow = returnTransition;
            this.f9394ppxfxbqfkf = operation.lqeggnwhkg() == zoijcleaowVar ? z13 ? operation.nufgyqmvbu().getAllowReturnTransitionOverlap() : operation.nufgyqmvbu().getAllowEnterTransitionOverlap() : true;
            this.f9395wkgbmnqykc = z14 ? z13 ? operation.nufgyqmvbu().getSharedElementReturnTransition() : operation.nufgyqmvbu().getSharedElementEnterTransition() : null;
        }

        private final dsvhmnatus wkgbmnqykc(Object obj) {
            if (obj == null) {
                return null;
            }
            dsvhmnatus dsvhmnatusVar = hkdspvbjdz.f9232zoijcleaow;
            if (dsvhmnatusVar != null && dsvhmnatusVar.lqeggnwhkg(obj)) {
                return dsvhmnatusVar;
            }
            dsvhmnatus dsvhmnatusVar2 = hkdspvbjdz.f9231ppxfxbqfkf;
            if (dsvhmnatusVar2 != null && dsvhmnatusVar2.lqeggnwhkg(obj)) {
                return dsvhmnatusVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + iobyxmoadg().nufgyqmvbu() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object eablkybsjg() {
            return this.f9395wkgbmnqykc;
        }

        public final Object gxszxtbevo() {
            return this.f9396zoijcleaow;
        }

        public final boolean lqeggnwhkg() {
            return this.f9395wkgbmnqykc != null;
        }

        public final boolean nufgyqmvbu() {
            return this.f9394ppxfxbqfkf;
        }

        public final dsvhmnatus ppxfxbqfkf() {
            dsvhmnatus dsvhmnatusVarWkgbmnqykc = wkgbmnqykc(this.f9396zoijcleaow);
            dsvhmnatus dsvhmnatusVarWkgbmnqykc2 = wkgbmnqykc(this.f9395wkgbmnqykc);
            if (dsvhmnatusVarWkgbmnqykc == null || dsvhmnatusVarWkgbmnqykc2 == null || dsvhmnatusVarWkgbmnqykc == dsvhmnatusVarWkgbmnqykc2) {
                return dsvhmnatusVarWkgbmnqykc == null ? dsvhmnatusVarWkgbmnqykc2 : dsvhmnatusVarWkgbmnqykc;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + iobyxmoadg().nufgyqmvbu() + " returned Transition " + this.f9396zoijcleaow + " which uses a different Transition  type than its shared element transition " + this.f9395wkgbmnqykc).toString());
        }
    }

    private static final class ppxfxbqfkf extends ntlheqmsrt.zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private AnimatorSet f9397eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final zoijcleaow f9398wkgbmnqykc;

        public static final class iobyxmoadg extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f9399eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ ViewGroup f9400iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ boolean f9401ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ ntlheqmsrt.wkgbmnqykc f9402wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ View f9403zoijcleaow;

            iobyxmoadg(ViewGroup viewGroup, View view, boolean z13, ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar, ppxfxbqfkf ppxfxbqfkfVar) {
                this.f9400iobyxmoadg = viewGroup;
                this.f9403zoijcleaow = view;
                this.f9401ppxfxbqfkf = z13;
                this.f9402wkgbmnqykc = wkgbmnqykcVar;
                this.f9399eablkybsjg = ppxfxbqfkfVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(anim, "anim");
                this.f9400iobyxmoadg.endViewTransition(this.f9403zoijcleaow);
                if (this.f9401ppxfxbqfkf) {
                    ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVarLqeggnwhkg = this.f9402wkgbmnqykc.lqeggnwhkg();
                    View viewToAnimate = this.f9403zoijcleaow;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewToAnimate, "viewToAnimate");
                    zoijcleaowVarLqeggnwhkg.wkgbmnqykc(viewToAnimate, this.f9400iobyxmoadg);
                }
                this.f9399eablkybsjg.nufgyqmvbu().iobyxmoadg().eablkybsjg(this.f9399eablkybsjg);
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f9402wkgbmnqykc + " has ended.");
                }
            }
        }

        public ppxfxbqfkf(zoijcleaow animatorInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animatorInfo, "animatorInfo");
            this.f9398wkgbmnqykc = animatorInfo;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void eablkybsjg(androidx.activity.zoijcleaow backEvent, ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f9398wkgbmnqykc.iobyxmoadg();
            AnimatorSet animatorSet = this.f9397eablkybsjg;
            if (animatorSet == null) {
                this.f9398wkgbmnqykc.iobyxmoadg().eablkybsjg(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !wkgbmnqykcVarIobyxmoadg.nufgyqmvbu().mTransitioning) {
                return;
            }
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + wkgbmnqykcVarIobyxmoadg);
            }
            long jIobyxmoadg = C0145wkgbmnqykc.f9404iobyxmoadg.iobyxmoadg(animatorSet);
            long jIobyxmoadg2 = (long) (backEvent.iobyxmoadg() * jIobyxmoadg);
            if (jIobyxmoadg2 == 0) {
                jIobyxmoadg2 = 1;
            }
            if (jIobyxmoadg2 == jIobyxmoadg) {
                jIobyxmoadg2 = jIobyxmoadg - 1;
            }
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + jIobyxmoadg2 + " for Animator " + animatorSet + " on operation " + wkgbmnqykcVarIobyxmoadg);
            }
            eablkybsjg.f9362iobyxmoadg.zoijcleaow(animatorSet, jIobyxmoadg2);
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void gxszxtbevo(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            if (this.f9398wkgbmnqykc.zoijcleaow()) {
                return;
            }
            Context context = container.getContext();
            zoijcleaow zoijcleaowVar = this.f9398wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
            kcexrzcfyt.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(context);
            this.f9397eablkybsjg = iobyxmoadgVarPpxfxbqfkf != null ? iobyxmoadgVarPpxfxbqfkf.f9273zoijcleaow : null;
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f9398wkgbmnqykc.iobyxmoadg();
            Fragment fragmentNufgyqmvbu = wkgbmnqykcVarIobyxmoadg.nufgyqmvbu();
            boolean z13 = wkgbmnqykcVarIobyxmoadg.lqeggnwhkg() == ntlheqmsrt.wkgbmnqykc.zoijcleaow.GONE;
            View view = fragmentNufgyqmvbu.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f9397eablkybsjg;
            if (animatorSet != null) {
                animatorSet.addListener(new iobyxmoadg(container, view, z13, wkgbmnqykcVarIobyxmoadg, this));
            }
            AnimatorSet animatorSet2 = this.f9397eablkybsjg;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final zoijcleaow nufgyqmvbu() {
            return this.f9398wkgbmnqykc;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void ppxfxbqfkf(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            AnimatorSet animatorSet = this.f9397eablkybsjg;
            if (animatorSet == null) {
                this.f9398wkgbmnqykc.iobyxmoadg().eablkybsjg(this);
                return;
            }
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f9398wkgbmnqykc.iobyxmoadg();
            if (wkgbmnqykcVarIobyxmoadg.wflxmlrfwp()) {
                eablkybsjg.f9362iobyxmoadg.iobyxmoadg(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.rhgxfdycjh(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Animator from operation ");
                sb3.append(wkgbmnqykcVarIobyxmoadg);
                sb3.append(" has been canceled");
                sb3.append(wkgbmnqykcVarIobyxmoadg.wflxmlrfwp() ? " with seeking." : ".");
                sb3.append(' ');
                Log.v("FragmentManager", sb3.toString());
            }
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public void wkgbmnqykc(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f9398wkgbmnqykc.iobyxmoadg();
            AnimatorSet animatorSet = this.f9397eablkybsjg;
            if (animatorSet == null) {
                this.f9398wkgbmnqykc.iobyxmoadg().eablkybsjg(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Animator from operation " + wkgbmnqykcVarIobyxmoadg + " has started.");
            }
        }

        @Override // androidx.fragment.app.ntlheqmsrt.zoijcleaow
        public boolean zoijcleaow() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0145wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0145wkgbmnqykc f9404iobyxmoadg = new C0145wkgbmnqykc();

        private C0145wkgbmnqykc() {
        }

        public final long iobyxmoadg(AnimatorSet animatorSet) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    private static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f9405ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private kcexrzcfyt.iobyxmoadg f9406wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f9407zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ntlheqmsrt.wkgbmnqykc operation, boolean z13) {
            super(operation);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "operation");
            this.f9407zoijcleaow = z13;
        }

        public final kcexrzcfyt.iobyxmoadg ppxfxbqfkf(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            if (this.f9405ppxfxbqfkf) {
                return this.f9406wkgbmnqykc;
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVarZoijcleaow = kcexrzcfyt.zoijcleaow(context, iobyxmoadg().nufgyqmvbu(), iobyxmoadg().lqeggnwhkg() == ntlheqmsrt.wkgbmnqykc.zoijcleaow.VISIBLE, this.f9407zoijcleaow);
            this.f9406wkgbmnqykc = iobyxmoadgVarZoijcleaow;
            this.f9405ppxfxbqfkf = true;
            return iobyxmoadgVarZoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(ViewGroup container) {
        super(container);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
    }

    private final void hcddaimhww(List list) {
        Fragment fragmentNufgyqmvbu = ((ntlheqmsrt.wkgbmnqykc) hg.jyumaefscl.skhdrjzrfn(list)).nufgyqmvbu();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar = (ntlheqmsrt.wkgbmnqykc) it.next();
            wkgbmnqykcVar.nufgyqmvbu().mAnimationInfo.f9051ppxfxbqfkf = fragmentNufgyqmvbu.mAnimationInfo.f9051ppxfxbqfkf;
            wkgbmnqykcVar.nufgyqmvbu().mAnimationInfo.f9055wkgbmnqykc = fragmentNufgyqmvbu.mAnimationInfo.f9055wkgbmnqykc;
            wkgbmnqykcVar.nufgyqmvbu().mAnimationInfo.f9042eablkybsjg = fragmentNufgyqmvbu.mAnimationInfo.f9042eablkybsjg;
            wkgbmnqykcVar.nufgyqmvbu().mAnimationInfo.f9044gxszxtbevo = fragmentNufgyqmvbu.mAnimationInfo.f9044gxszxtbevo;
        }
    }

    private final void iozdgvuglv(List list) {
        ArrayList<zoijcleaow> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList2, ((zoijcleaow) it.next()).iobyxmoadg().gxszxtbevo());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z13 = false;
        while (it2.hasNext()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) it2.next();
            Context context = zdlpuopuiu().getContext();
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
            kcexrzcfyt.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(context);
            if (iobyxmoadgVarPpxfxbqfkf != null) {
                if (iobyxmoadgVarPpxfxbqfkf.f9273zoijcleaow == null) {
                    arrayList.add(zoijcleaowVar);
                } else {
                    Fragment fragmentNufgyqmvbu = wkgbmnqykcVarIobyxmoadg.nufgyqmvbu();
                    if (wkgbmnqykcVarIobyxmoadg.gxszxtbevo().isEmpty()) {
                        if (wkgbmnqykcVarIobyxmoadg.lqeggnwhkg() == ntlheqmsrt.wkgbmnqykc.zoijcleaow.GONE) {
                            wkgbmnqykcVarIobyxmoadg.vdvldrhtss(false);
                        }
                        wkgbmnqykcVarIobyxmoadg.zoijcleaow(new ppxfxbqfkf(zoijcleaowVar));
                        z13 = true;
                    } else if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragmentNufgyqmvbu + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (zoijcleaow zoijcleaowVar2 : arrayList) {
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = zoijcleaowVar2.iobyxmoadg();
            Fragment fragmentNufgyqmvbu2 = wkgbmnqykcVarIobyxmoadg2.nufgyqmvbu();
            if (zIsEmpty) {
                if (!z13) {
                    wkgbmnqykcVarIobyxmoadg2.zoijcleaow(new iobyxmoadg(zoijcleaowVar2));
                } else if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentNufgyqmvbu2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragmentNufgyqmvbu2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lmojexxdyd(wkgbmnqykc this$0, ntlheqmsrt.wkgbmnqykc operation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "$operation");
        this$0.ppxfxbqfkf(operation);
    }

    private final void pkzmftpjix(androidx.collection.iobyxmoadg iobyxmoadgVar, Collection collection) {
        Set entries = iobyxmoadgVar.entrySet();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(entries, "entries");
        hg.jyumaefscl.dsvhmnatus(entries, new dxjokdxxww(collection));
    }

    private final void wwaezpbzkn(List list, boolean z13, ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar, ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar2) {
        Object objZynmafqrjb;
        dsvhmnatus dsvhmnatusVar;
        Iterator it;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((nufgyqmvbu) obj).zoijcleaow()) {
                arrayList.add(obj);
            }
        }
        ArrayList<nufgyqmvbu> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((nufgyqmvbu) obj2).ppxfxbqfkf() != null) {
                arrayList2.add(obj2);
            }
        }
        dsvhmnatus dsvhmnatusVar2 = null;
        for (nufgyqmvbu nufgyqmvbuVar : arrayList2) {
            dsvhmnatus dsvhmnatusVarPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
            if (dsvhmnatusVar2 != null && dsvhmnatusVarPpxfxbqfkf != dsvhmnatusVar2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + nufgyqmvbuVar.iobyxmoadg().nufgyqmvbu() + " returned Transition " + nufgyqmvbuVar.gxszxtbevo() + " which uses a different Transition type than other Fragments.").toString());
            }
            dsvhmnatusVar2 = dsvhmnatusVarPpxfxbqfkf;
        }
        if (dsvhmnatusVar2 == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        androidx.collection.iobyxmoadg iobyxmoadgVar = new androidx.collection.iobyxmoadg();
        ArrayList<String> arrayList5 = new ArrayList<>();
        ArrayList<String> arrayList6 = new ArrayList<>();
        androidx.collection.iobyxmoadg iobyxmoadgVar2 = new androidx.collection.iobyxmoadg();
        androidx.collection.iobyxmoadg iobyxmoadgVar3 = new androidx.collection.iobyxmoadg();
        Iterator it2 = arrayList2.iterator();
        ArrayList<String> sharedElementTargetNames = arrayList5;
        ArrayList<String> sharedElementSourceNames = arrayList6;
        loop3: while (true) {
            objZynmafqrjb = null;
            while (true) {
                if (!it2.hasNext()) {
                    break loop3;
                }
                nufgyqmvbu nufgyqmvbuVar2 = (nufgyqmvbu) it2.next();
                if (nufgyqmvbuVar2.lqeggnwhkg() && wkgbmnqykcVar != null && wkgbmnqykcVar2 != null) {
                    objZynmafqrjb = dsvhmnatusVar2.zynmafqrjb(dsvhmnatusVar2.nufgyqmvbu(nufgyqmvbuVar2.eablkybsjg()));
                    sharedElementSourceNames = wkgbmnqykcVar2.nufgyqmvbu().getSharedElementSourceNames();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = wkgbmnqykcVar.nufgyqmvbu().getSharedElementSourceNames();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames2 = wkgbmnqykcVar.nufgyqmvbu().getSharedElementTargetNames();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames2.size();
                    it = it2;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i13));
                        ArrayList<String> arrayList7 = sharedElementTargetNames2;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i13));
                        }
                        i13++;
                        size = i14;
                        sharedElementTargetNames2 = arrayList7;
                    }
                    sharedElementTargetNames = wkgbmnqykcVar2.nufgyqmvbu().getSharedElementTargetNames();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                    if (z13) {
                        wkgbmnqykcVar.nufgyqmvbu().getEnterTransitionCallback();
                        wkgbmnqykcVar2.nufgyqmvbu().getExitTransitionCallback();
                        vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(null, null);
                    } else {
                        wkgbmnqykcVar.nufgyqmvbu().getExitTransitionCallback();
                        wkgbmnqykcVar2.nufgyqmvbu().getEnterTransitionCallback();
                        vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(null, null);
                    }
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(vdvldrhtssVarIobyxmoadg.iobyxmoadg());
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(vdvldrhtssVarIobyxmoadg.wkgbmnqykc());
                    int size2 = sharedElementSourceNames.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        String str = sharedElementSourceNames.get(i15);
                        int i16 = size2;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "exitingNames[i]");
                        String str2 = sharedElementTargetNames.get(i15);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "enteringNames[i]");
                        iobyxmoadgVar.put(str, str2);
                        i15++;
                        size2 = i16;
                        dsvhmnatusVar2 = dsvhmnatusVar2;
                    }
                    dsvhmnatusVar = dsvhmnatusVar2;
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator<String> it3 = sharedElementTargetNames.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + it3.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it4 = sharedElementSourceNames.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + it4.next());
                        }
                    }
                    View view = wkgbmnqykcVar.nufgyqmvbu().mView;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view, "firstOut.fragment.mView");
                    ylkuphrtab(iobyxmoadgVar2, view);
                    iobyxmoadgVar2.ojitshcjhn(sharedElementSourceNames);
                    iobyxmoadgVar.ojitshcjhn(iobyxmoadgVar2.keySet());
                    View view2 = wkgbmnqykcVar2.nufgyqmvbu().mView;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view2, "lastIn.fragment.mView");
                    ylkuphrtab(iobyxmoadgVar3, view2);
                    iobyxmoadgVar3.ojitshcjhn(sharedElementTargetNames);
                    iobyxmoadgVar3.ojitshcjhn(iobyxmoadgVar.values());
                    hkdspvbjdz.ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar3);
                    Collection collectionKeySet = iobyxmoadgVar.keySet();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionKeySet, "sharedElementNameMapping.keys");
                    pkzmftpjix(iobyxmoadgVar2, collectionKeySet);
                    Collection collectionValues = iobyxmoadgVar.values();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionValues, "sharedElementNameMapping.values");
                    pkzmftpjix(iobyxmoadgVar3, collectionValues);
                    if (iobyxmoadgVar.isEmpty()) {
                        break;
                    }
                } else {
                    dsvhmnatusVar = dsvhmnatusVar2;
                    it = it2;
                }
                it2 = it;
                dsvhmnatusVar2 = dsvhmnatusVar;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + objZynmafqrjb + " between " + wkgbmnqykcVar + " and " + wkgbmnqykcVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList3.clear();
            arrayList4.clear();
            it2 = it;
            dsvhmnatusVar2 = dsvhmnatusVar;
        }
        dsvhmnatus dsvhmnatusVar3 = dsvhmnatusVar2;
        if (objZynmafqrjb == null) {
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                if (((nufgyqmvbu) it5.next()).gxszxtbevo() == null) {
                }
            }
            return;
        }
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(arrayList2, wkgbmnqykcVar, wkgbmnqykcVar2, dsvhmnatusVar3, objZynmafqrjb, arrayList3, arrayList4, iobyxmoadgVar, sharedElementTargetNames, sharedElementSourceNames, iobyxmoadgVar2, iobyxmoadgVar3, z13);
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((nufgyqmvbu) it6.next()).iobyxmoadg().zoijcleaow(lqeggnwhkgVar);
        }
    }

    private final void ylkuphrtab(Map map, View view) {
        String strYlkuphrtab = jhduphickx.ylkuphrtab(view);
        if (strYlkuphrtab != null) {
            map.put(strYlkuphrtab, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View child = viewGroup.getChildAt(i13);
                if (child.getVisibility() == 0) {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(child, "child");
                    ylkuphrtab(map, child);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    @Override // androidx.fragment.app.ntlheqmsrt
    public void wkgbmnqykc(List operations, boolean z13) {
        Object obj;
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar = (ntlheqmsrt.wkgbmnqykc) next;
            ntlheqmsrt.wkgbmnqykc.zoijcleaow.iobyxmoadg iobyxmoadgVar = ntlheqmsrt.wkgbmnqykc.zoijcleaow.f9324zdlpuopuiu;
            View view = wkgbmnqykcVar.nufgyqmvbu().mView;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view, "operation.fragment.mView");
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(view);
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVar = ntlheqmsrt.wkgbmnqykc.zoijcleaow.VISIBLE;
            if (zoijcleaowVarIobyxmoadg == zoijcleaowVar && wkgbmnqykcVar.lqeggnwhkg() != zoijcleaowVar) {
                break;
            }
        }
        ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar2 = (ntlheqmsrt.wkgbmnqykc) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar3 = (ntlheqmsrt.wkgbmnqykc) objPrevious;
            ntlheqmsrt.wkgbmnqykc.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = ntlheqmsrt.wkgbmnqykc.zoijcleaow.f9324zdlpuopuiu;
            View view2 = wkgbmnqykcVar3.nufgyqmvbu().mView;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view2, "operation.fragment.mView");
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg(view2);
            ntlheqmsrt.wkgbmnqykc.zoijcleaow zoijcleaowVar2 = ntlheqmsrt.wkgbmnqykc.zoijcleaow.VISIBLE;
            if (zoijcleaowVarIobyxmoadg2 != zoijcleaowVar2 && wkgbmnqykcVar3.lqeggnwhkg() == zoijcleaowVar2) {
                obj = objPrevious;
                break;
            }
        }
        ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar4 = (ntlheqmsrt.wkgbmnqykc) obj;
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Executing operations from " + wkgbmnqykcVar2 + " to " + wkgbmnqykcVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        hcddaimhww(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final ntlheqmsrt.wkgbmnqykc wkgbmnqykcVar5 = (ntlheqmsrt.wkgbmnqykc) it2.next();
            arrayList.add(new zoijcleaow(wkgbmnqykcVar5, z13));
            boolean z14 = false;
            if (z13) {
                if (wkgbmnqykcVar5 == wkgbmnqykcVar2) {
                    z14 = true;
                }
            } else if (wkgbmnqykcVar5 == wkgbmnqykcVar4) {
                z14 = true;
            }
            arrayList2.add(new nufgyqmvbu(wkgbmnqykcVar5, z13, z14));
            wkgbmnqykcVar5.iobyxmoadg(new Runnable() { // from class: androidx.fragment.app.zoijcleaow
                @Override // java.lang.Runnable
                public final void run() {
                    wkgbmnqykc.lmojexxdyd(this.f9417zdlpuopuiu, wkgbmnqykcVar5);
                }
            });
        }
        wwaezpbzkn(arrayList2, z13, wkgbmnqykcVar2, wkgbmnqykcVar4);
        iozdgvuglv(arrayList);
    }
}
