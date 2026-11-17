package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ntlheqmsrt {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f9294lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f9295eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f9296gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ViewGroup f9297iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f9298ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f9299wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f9300zoijcleaow;

    public /* synthetic */ class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f9301iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.iobyxmoadg.values().length];
            try {
                iArr[wkgbmnqykc.iobyxmoadg.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9301iobyxmoadg = iArr;
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ntlheqmsrt iobyxmoadg(ViewGroup container, FragmentManager fragmentManager) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
            ulzqkzuiru ulzqkzuiruVarFyldjkxazc = fragmentManager.fyldjkxazc();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ulzqkzuiruVarFyldjkxazc, "fragmentManager.specialEffectsControllerFactory");
            return zoijcleaow(container, ulzqkzuiruVarFyldjkxazc);
        }

        public final ntlheqmsrt zoijcleaow(ViewGroup container, ulzqkzuiru factory) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
            Object tag = container.getTag(k2.zoijcleaow.special_effects_controller_view_tag);
            if (tag instanceof ntlheqmsrt) {
                return (ntlheqmsrt) tag;
            }
            ntlheqmsrt ntlheqmsrtVarIobyxmoadg = factory.iobyxmoadg(container);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ntlheqmsrtVarIobyxmoadg, "factory.createController(container)");
            container.setTag(k2.zoijcleaow.special_effects_controller_view_tag, ntlheqmsrtVarIobyxmoadg);
            return ntlheqmsrtVarIobyxmoadg;
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final pkzmftpjix f9302draadjrbmk;

        /* JADX WARN: Illegal instructions before constructor call */
        public ppxfxbqfkf(wkgbmnqykc.zoijcleaow finalState, wkgbmnqykc.iobyxmoadg lifecycleImpact, pkzmftpjix fragmentStateManager) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finalState, "finalState");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentStateManager, "fragmentStateManager");
            Fragment fragmentGtknphoqwx = fragmentStateManager.gtknphoqwx();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentGtknphoqwx, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentGtknphoqwx);
            this.f9302draadjrbmk = fragmentStateManager;
        }

        @Override // androidx.fragment.app.ntlheqmsrt.wkgbmnqykc
        public void rgvfuqvkyq() {
            if (agtfadlqog()) {
                return;
            }
            super.rgvfuqvkyq();
            if (dxjokdxxww() != wkgbmnqykc.iobyxmoadg.ADDING) {
                if (dxjokdxxww() == wkgbmnqykc.iobyxmoadg.REMOVING) {
                    Fragment fragmentGtknphoqwx = this.f9302draadjrbmk.gtknphoqwx();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentGtknphoqwx, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentGtknphoqwx.requireView();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentGtknphoqwx);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentGtknphoqwx2 = this.f9302draadjrbmk.gtknphoqwx();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentGtknphoqwx2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentGtknphoqwx2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentGtknphoqwx2.setFocusedView(viewFindFocus);
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentGtknphoqwx2);
                }
            }
            View viewRequireView2 = nufgyqmvbu().requireView();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f9302draadjrbmk.zoijcleaow();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentGtknphoqwx2.getPostOnViewCreatedAlpha());
        }

        @Override // androidx.fragment.app.ntlheqmsrt.wkgbmnqykc
        public void wkgbmnqykc() {
            super.wkgbmnqykc();
            nufgyqmvbu().mTransitioning = false;
            this.f9302draadjrbmk.wflxmlrfwp();
        }
    }

    public static class wkgbmnqykc {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final List f9303btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f9304dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f9305eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final List f9306gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f9307gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private zoijcleaow f9308iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f9309lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f9310nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Fragment f9311ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f9312wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private iobyxmoadg f9313zoijcleaow;

        public enum iobyxmoadg {
            NONE,
            ADDING,
            REMOVING
        }

        public /* synthetic */ class ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f9318iobyxmoadg;

            static {
                int[] iArr = new int[iobyxmoadg.values().length];
                try {
                    iArr[iobyxmoadg.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[iobyxmoadg.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[iobyxmoadg.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9318iobyxmoadg = iArr;
            }
        }

        public enum zoijcleaow {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f9324zdlpuopuiu = new iobyxmoadg(null);

            public static final class iobyxmoadg {
                public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                    this();
                }

                public final zoijcleaow iobyxmoadg(View view) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? zoijcleaow.INVISIBLE : zoijcleaow(view.getVisibility());
                }

                public final zoijcleaow zoijcleaow(int i13) {
                    if (i13 == 0) {
                        return zoijcleaow.VISIBLE;
                    }
                    if (i13 == 4) {
                        return zoijcleaow.INVISIBLE;
                    }
                    if (i13 == 8) {
                        return zoijcleaow.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i13);
                }

                private iobyxmoadg() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.ntlheqmsrt$wkgbmnqykc$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
            public /* synthetic */ class C0143zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final /* synthetic */ int[] f9325iobyxmoadg;

                static {
                    int[] iArr = new int[zoijcleaow.values().length];
                    try {
                        iArr[zoijcleaow.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[zoijcleaow.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[zoijcleaow.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[zoijcleaow.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f9325iobyxmoadg = iArr;
                }
            }

            public static final zoijcleaow lqeggnwhkg(int i13) {
                return f9324zdlpuopuiu.zoijcleaow(i13);
            }

            public final void wkgbmnqykc(View view, ViewGroup container) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
                int i13 = C0143zoijcleaow.f9325iobyxmoadg[ordinal()];
                if (i13 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.rhgxfdycjh(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i13 == 2) {
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.rhgxfdycjh(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i13 == 3) {
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i13 != 4) {
                    return;
                }
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public wkgbmnqykc(zoijcleaow finalState, iobyxmoadg lifecycleImpact, Fragment fragment) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finalState, "finalState");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragment, "fragment");
            this.f9308iobyxmoadg = finalState;
            this.f9313zoijcleaow = lifecycleImpact;
            this.f9311ppxfxbqfkf = fragment;
            this.f9312wkgbmnqykc = new ArrayList();
            this.f9304dxjokdxxww = true;
            ArrayList arrayList = new ArrayList();
            this.f9303btonecajqb = arrayList;
            this.f9306gtknphoqwx = arrayList;
        }

        public final boolean agtfadlqog() {
            return this.f9310nufgyqmvbu;
        }

        public final boolean btonecajqb() {
            return this.f9304dxjokdxxww;
        }

        public final boolean draadjrbmk() {
            return this.f9307gxszxtbevo;
        }

        public final iobyxmoadg dxjokdxxww() {
            return this.f9313zoijcleaow;
        }

        public final void eablkybsjg(zoijcleaow effect) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(effect, "effect");
            if (this.f9303btonecajqb.remove(effect) && this.f9303btonecajqb.isEmpty()) {
                wkgbmnqykc();
            }
        }

        public final boolean gtknphoqwx() {
            return this.f9305eablkybsjg;
        }

        public final List gxszxtbevo() {
            return this.f9306gtknphoqwx;
        }

        public final void iobyxmoadg(Runnable listener) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
            this.f9312wkgbmnqykc.add(listener);
        }

        public final zoijcleaow lqeggnwhkg() {
            return this.f9308iobyxmoadg;
        }

        public final Fragment nufgyqmvbu() {
            return this.f9311ppxfxbqfkf;
        }

        public final void ojitshcjhn(zoijcleaow finalState, iobyxmoadg lifecycleImpact) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finalState, "finalState");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycleImpact, "lifecycleImpact");
            int i13 = ppxfxbqfkf.f9318iobyxmoadg[lifecycleImpact.ordinal()];
            if (i13 == 1) {
                if (this.f9308iobyxmoadg == zoijcleaow.REMOVED) {
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9311ppxfxbqfkf + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f9313zoijcleaow + " to ADDING.");
                    }
                    this.f9308iobyxmoadg = zoijcleaow.VISIBLE;
                    this.f9313zoijcleaow = iobyxmoadg.ADDING;
                    this.f9304dxjokdxxww = true;
                    return;
                }
                return;
            }
            if (i13 == 2) {
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9311ppxfxbqfkf + " mFinalState = " + this.f9308iobyxmoadg + " -> REMOVED. mLifecycleImpact  = " + this.f9313zoijcleaow + " to REMOVING.");
                }
                this.f9308iobyxmoadg = zoijcleaow.REMOVED;
                this.f9313zoijcleaow = iobyxmoadg.REMOVING;
                this.f9304dxjokdxxww = true;
                return;
            }
            if (i13 == 3 && this.f9308iobyxmoadg != zoijcleaow.REMOVED) {
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9311ppxfxbqfkf + " mFinalState = " + this.f9308iobyxmoadg + " -> " + finalState + '.');
                }
                this.f9308iobyxmoadg = finalState;
            }
        }

        public final void oxmwwwfdhm(boolean z13) {
            this.f9309lqeggnwhkg = z13;
        }

        public final void ppxfxbqfkf(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            this.f9310nufgyqmvbu = false;
            if (this.f9305eablkybsjg) {
                return;
            }
            this.f9305eablkybsjg = true;
            if (this.f9303btonecajqb.isEmpty()) {
                wkgbmnqykc();
                return;
            }
            Iterator it = hg.jyumaefscl.m(this.f9306gtknphoqwx).iterator();
            while (it.hasNext()) {
                ((zoijcleaow) it.next()).iobyxmoadg(container);
            }
        }

        public void rgvfuqvkyq() {
            this.f9310nufgyqmvbu = true;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f9308iobyxmoadg + " lifecycleImpact = " + this.f9313zoijcleaow + " fragment = " + this.f9311ppxfxbqfkf + '}';
        }

        public final void vdvldrhtss(boolean z13) {
            this.f9304dxjokdxxww = z13;
        }

        public final boolean wflxmlrfwp() {
            return this.f9309lqeggnwhkg;
        }

        public void wkgbmnqykc() {
            this.f9310nufgyqmvbu = false;
            if (this.f9307gxszxtbevo) {
                return;
            }
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f9307gxszxtbevo = true;
            Iterator it = this.f9312wkgbmnqykc.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void zoijcleaow(zoijcleaow effect) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(effect, "effect");
            this.f9303btonecajqb.add(effect);
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f9326iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f9327ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f9328zoijcleaow;

        public void eablkybsjg(androidx.activity.zoijcleaow backEvent, ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        }

        public void gxszxtbevo(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        }

        public final void iobyxmoadg(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            if (!this.f9327ppxfxbqfkf) {
                ppxfxbqfkf(container);
            }
            this.f9327ppxfxbqfkf = true;
        }

        public final void lqeggnwhkg(ViewGroup container) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            if (!this.f9328zoijcleaow) {
                gxszxtbevo(container);
            }
            this.f9328zoijcleaow = true;
        }

        public abstract void ppxfxbqfkf(ViewGroup viewGroup);

        public abstract void wkgbmnqykc(ViewGroup viewGroup);

        public boolean zoijcleaow() {
            return this.f9326iobyxmoadg;
        }
    }

    public ntlheqmsrt(ViewGroup container) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        this.f9297iobyxmoadg = container;
        this.f9300zoijcleaow = new ArrayList();
        this.f9298ppxfxbqfkf = new ArrayList();
    }

    private final boolean cqumvgiudr(List list) {
        Iterator it = list.iterator();
        boolean z13 = true;
        while (it.hasNext()) {
            if (!((wkgbmnqykc) it.next()).nufgyqmvbu().mTransitioning) {
                z13 = false;
            }
        }
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(ntlheqmsrt this$0, ppxfxbqfkf operation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "$operation");
        this$0.f9300zoijcleaow.remove(operation);
        this$0.f9298ppxfxbqfkf.remove(operation);
    }

    private final void istkbnxepw() {
        for (wkgbmnqykc wkgbmnqykcVar : this.f9300zoijcleaow) {
            if (wkgbmnqykcVar.dxjokdxxww() == wkgbmnqykc.iobyxmoadg.ADDING) {
                View viewRequireView = wkgbmnqykcVar.nufgyqmvbu().requireView();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewRequireView, "fragment.requireView()");
                wkgbmnqykcVar.ojitshcjhn(wkgbmnqykc.zoijcleaow.f9324zdlpuopuiu.zoijcleaow(viewRequireView.getVisibility()), wkgbmnqykc.iobyxmoadg.NONE);
            }
        }
    }

    private final boolean iwizpuwonk(List list) {
        boolean z13;
        Iterator it = list.iterator();
        loop0: while (true) {
            z13 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) it.next();
                if (!wkgbmnqykcVar.gxszxtbevo().isEmpty()) {
                    List listGxszxtbevo = wkgbmnqykcVar.gxszxtbevo();
                    if (listGxszxtbevo != null && listGxszxtbevo.isEmpty()) {
                        break;
                    }
                    Iterator it2 = listGxszxtbevo.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((zoijcleaow) it2.next()).zoijcleaow());
                }
                z13 = false;
            }
        }
        if (z13) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                hg.jyumaefscl.istkbnxepw(arrayList, ((wkgbmnqykc) it3.next()).gxszxtbevo());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final ntlheqmsrt jyumaefscl(ViewGroup viewGroup, ulzqkzuiru ulzqkzuiruVar) {
        return f9294lqeggnwhkg.zoijcleaow(viewGroup, ulzqkzuiruVar);
    }

    private final void lqeggnwhkg(wkgbmnqykc.zoijcleaow zoijcleaowVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar, pkzmftpjix pkzmftpjixVar) {
        synchronized (this.f9300zoijcleaow) {
            try {
                Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentGtknphoqwx, "fragmentStateManager.fragment");
                wkgbmnqykc wkgbmnqykcVarOjitshcjhn = ojitshcjhn(fragmentGtknphoqwx);
                if (wkgbmnqykcVarOjitshcjhn == null) {
                    if (pkzmftpjixVar.gtknphoqwx().mTransitioning) {
                        Fragment fragmentGtknphoqwx2 = pkzmftpjixVar.gtknphoqwx();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentGtknphoqwx2, "fragmentStateManager.fragment");
                        wkgbmnqykcVarOjitshcjhn = rgvfuqvkyq(fragmentGtknphoqwx2);
                    } else {
                        wkgbmnqykcVarOjitshcjhn = null;
                    }
                }
                if (wkgbmnqykcVarOjitshcjhn != null) {
                    wkgbmnqykcVarOjitshcjhn.ojitshcjhn(zoijcleaowVar, iobyxmoadgVar);
                    return;
                }
                final ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(zoijcleaowVar, iobyxmoadgVar, pkzmftpjixVar);
                this.f9300zoijcleaow.add(ppxfxbqfkfVar);
                ppxfxbqfkfVar.iobyxmoadg(new Runnable() { // from class: androidx.fragment.app.tzroggbefp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ntlheqmsrt.nufgyqmvbu(this.f9358zdlpuopuiu, ppxfxbqfkfVar);
                    }
                });
                ppxfxbqfkfVar.iobyxmoadg(new Runnable() { // from class: androidx.fragment.app.mbcevpiqjq
                    @Override // java.lang.Runnable
                    public final void run() {
                        ntlheqmsrt.dxjokdxxww(this.f9293zdlpuopuiu, ppxfxbqfkfVar);
                    }
                });
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ntlheqmsrt this$0, ppxfxbqfkf operation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "$operation");
        if (this$0.f9300zoijcleaow.contains(operation)) {
            wkgbmnqykc.zoijcleaow zoijcleaowVarLqeggnwhkg = operation.lqeggnwhkg();
            View view = operation.nufgyqmvbu().mView;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view, "operation.fragment.mView");
            zoijcleaowVarLqeggnwhkg.wkgbmnqykc(view, this$0.f9297iobyxmoadg);
        }
    }

    private final wkgbmnqykc ojitshcjhn(Fragment fragment) {
        Object next;
        Iterator it = this.f9300zoijcleaow.iterator();
        while (it.hasNext()) {
            next = it.next();
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) next;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar.nufgyqmvbu(), fragment) && !wkgbmnqykcVar.gtknphoqwx()) {
                return (wkgbmnqykc) next;
            }
        }
        next = null;
        return (wkgbmnqykc) next;
    }

    private final wkgbmnqykc rgvfuqvkyq(Fragment fragment) {
        Object next;
        Iterator it = this.f9298ppxfxbqfkf.iterator();
        while (it.hasNext()) {
            next = it.next();
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) next;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar.nufgyqmvbu(), fragment) && !wkgbmnqykcVar.gtknphoqwx()) {
                return (wkgbmnqykc) next;
            }
        }
        next = null;
        return (wkgbmnqykc) next;
    }

    public static final ntlheqmsrt yggfygwlhe(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f9294lqeggnwhkg.iobyxmoadg(viewGroup, fragmentManager);
    }

    private final void zynmafqrjb(List list) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((wkgbmnqykc) list.get(i13)).rgvfuqvkyq();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, ((wkgbmnqykc) it.next()).gxszxtbevo());
        }
        List listM = hg.jyumaefscl.m(hg.jyumaefscl.r(arrayList));
        int size2 = listM.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((zoijcleaow) listM.get(i14)).lqeggnwhkg(this.f9297iobyxmoadg);
        }
    }

    public final void agtfadlqog() {
        if (this.f9296gxszxtbevo) {
            return;
        }
        if (!this.f9297iobyxmoadg.isAttachedToWindow()) {
            vdvldrhtss();
            this.f9295eablkybsjg = false;
            return;
        }
        synchronized (this.f9300zoijcleaow) {
            try {
                List<wkgbmnqykc> listP = hg.jyumaefscl.p(this.f9298ppxfxbqfkf);
                this.f9298ppxfxbqfkf.clear();
                for (wkgbmnqykc wkgbmnqykcVar : listP) {
                    wkgbmnqykcVar.oxmwwwfdhm(!this.f9300zoijcleaow.isEmpty() && wkgbmnqykcVar.nufgyqmvbu().mTransitioning);
                }
                for (wkgbmnqykc wkgbmnqykcVar2 : listP) {
                    if (this.f9299wkgbmnqykc) {
                        if (FragmentManager.rhgxfdycjh(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + wkgbmnqykcVar2);
                        }
                        wkgbmnqykcVar2.wkgbmnqykc();
                    } else {
                        if (FragmentManager.rhgxfdycjh(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + wkgbmnqykcVar2);
                        }
                        wkgbmnqykcVar2.ppxfxbqfkf(this.f9297iobyxmoadg);
                    }
                    this.f9299wkgbmnqykc = false;
                    if (!wkgbmnqykcVar2.draadjrbmk()) {
                        this.f9298ppxfxbqfkf.add(wkgbmnqykcVar2);
                    }
                }
                if (!this.f9300zoijcleaow.isEmpty()) {
                    istkbnxepw();
                    List listP2 = hg.jyumaefscl.p(this.f9300zoijcleaow);
                    if (listP2.isEmpty()) {
                        return;
                    }
                    this.f9300zoijcleaow.clear();
                    this.f9298ppxfxbqfkf.addAll(listP2);
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    wkgbmnqykc(listP2, this.f9295eablkybsjg);
                    boolean zIwizpuwonk = iwizpuwonk(listP2);
                    boolean zCqumvgiudr = cqumvgiudr(listP2);
                    this.f9299wkgbmnqykc = zCqumvgiudr && !zIwizpuwonk;
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zIwizpuwonk + " \ntransition = " + zCqumvgiudr);
                    }
                    if (!zCqumvgiudr) {
                        zynmafqrjb(listP2);
                        eablkybsjg(listP2);
                    } else if (zIwizpuwonk) {
                        zynmafqrjb(listP2);
                        int size = listP2.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ppxfxbqfkf((wkgbmnqykc) listP2.get(i13));
                        }
                    }
                    this.f9295eablkybsjg = false;
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void btonecajqb(wkgbmnqykc.zoijcleaow finalState, pkzmftpjix fragmentStateManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finalState, "finalState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.gtknphoqwx());
        }
        lqeggnwhkg(finalState, wkgbmnqykc.iobyxmoadg.ADDING, fragmentStateManager);
    }

    public final void cdpycssgdh(boolean z13) {
        this.f9295eablkybsjg = z13;
    }

    public final void draadjrbmk(pkzmftpjix fragmentStateManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.gtknphoqwx());
        }
        lqeggnwhkg(wkgbmnqykc.zoijcleaow.REMOVED, wkgbmnqykc.iobyxmoadg.REMOVING, fragmentStateManager);
    }

    public void eablkybsjg(List operations) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, ((wkgbmnqykc) it.next()).gxszxtbevo());
        }
        List listM = hg.jyumaefscl.m(hg.jyumaefscl.r(arrayList));
        int size = listM.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((zoijcleaow) listM.get(i13)).wkgbmnqykc(this.f9297iobyxmoadg);
        }
        int size2 = operations.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ppxfxbqfkf((wkgbmnqykc) operations.get(i14));
        }
        List listM2 = hg.jyumaefscl.m(operations);
        int size3 = listM2.size();
        for (int i15 = 0; i15 < size3; i15++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) listM2.get(i15);
            if (wkgbmnqykcVar.gxszxtbevo().isEmpty()) {
                wkgbmnqykcVar.wkgbmnqykc();
            }
        }
    }

    public final boolean esjtqupxsv() {
        return !this.f9300zoijcleaow.isEmpty();
    }

    public final void gtknphoqwx(pkzmftpjix fragmentStateManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.gtknphoqwx());
        }
        lqeggnwhkg(wkgbmnqykc.zoijcleaow.GONE, wkgbmnqykc.iobyxmoadg.NONE, fragmentStateManager);
    }

    public final void gxszxtbevo() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        zynmafqrjb(this.f9298ppxfxbqfkf);
        eablkybsjg(this.f9298ppxfxbqfkf);
    }

    public final wkgbmnqykc.iobyxmoadg kcexrzcfyt(pkzmftpjix fragmentStateManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentGtknphoqwx = fragmentStateManager.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentGtknphoqwx, "fragmentStateManager.fragment");
        wkgbmnqykc wkgbmnqykcVarOjitshcjhn = ojitshcjhn(fragmentGtknphoqwx);
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarDxjokdxxww = wkgbmnqykcVarOjitshcjhn != null ? wkgbmnqykcVarOjitshcjhn.dxjokdxxww() : null;
        wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = rgvfuqvkyq(fragmentGtknphoqwx);
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarDxjokdxxww2 = wkgbmnqykcVarRgvfuqvkyq != null ? wkgbmnqykcVarRgvfuqvkyq.dxjokdxxww() : null;
        int i13 = iobyxmoadgVarDxjokdxxww == null ? -1 : eablkybsjg.f9301iobyxmoadg[iobyxmoadgVarDxjokdxxww.ordinal()];
        return (i13 == -1 || i13 == 1) ? iobyxmoadgVarDxjokdxxww2 : iobyxmoadgVarDxjokdxxww;
    }

    public final void lereixgezr() {
        Object objPrevious;
        synchronized (this.f9300zoijcleaow) {
            try {
                istkbnxepw();
                List list = this.f9300zoijcleaow;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) objPrevious;
                    wkgbmnqykc.zoijcleaow.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.zoijcleaow.f9324zdlpuopuiu;
                    View view = wkgbmnqykcVar.nufgyqmvbu().mView;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view, "operation.fragment.mView");
                    wkgbmnqykc.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(view);
                    wkgbmnqykc.zoijcleaow zoijcleaowVarLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
                    wkgbmnqykc.zoijcleaow zoijcleaowVar = wkgbmnqykc.zoijcleaow.VISIBLE;
                    if (zoijcleaowVarLqeggnwhkg == zoijcleaowVar && zoijcleaowVarIobyxmoadg != zoijcleaowVar) {
                        break;
                    }
                }
                wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) objPrevious;
                Fragment fragmentNufgyqmvbu = wkgbmnqykcVar2 != null ? wkgbmnqykcVar2.nufgyqmvbu() : null;
                this.f9296gxszxtbevo = fragmentNufgyqmvbu != null ? fragmentNufgyqmvbu.isPostponed() : false;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void oxmwwwfdhm() {
        if (this.f9296gxszxtbevo) {
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f9296gxszxtbevo = false;
            agtfadlqog();
        }
    }

    public final void pmvmpeiblj(androidx.activity.zoijcleaow backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.iobyxmoadg());
        }
        List list = this.f9298ppxfxbqfkf;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, ((wkgbmnqykc) it.next()).gxszxtbevo());
        }
        List listM = hg.jyumaefscl.m(hg.jyumaefscl.r(arrayList));
        int size = listM.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((zoijcleaow) listM.get(i13)).eablkybsjg(backEvent, this.f9297iobyxmoadg);
        }
    }

    public final void ppxfxbqfkf(wkgbmnqykc operation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operation, "operation");
        if (operation.btonecajqb()) {
            wkgbmnqykc.zoijcleaow zoijcleaowVarLqeggnwhkg = operation.lqeggnwhkg();
            View viewRequireView = operation.nufgyqmvbu().requireView();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewRequireView, "operation.fragment.requireView()");
            zoijcleaowVarLqeggnwhkg.wkgbmnqykc(viewRequireView, this.f9297iobyxmoadg);
            operation.vdvldrhtss(false);
        }
    }

    public final void vdvldrhtss() {
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f9297iobyxmoadg.isAttachedToWindow();
        synchronized (this.f9300zoijcleaow) {
            try {
                istkbnxepw();
                zynmafqrjb(this.f9300zoijcleaow);
                List<wkgbmnqykc> listP = hg.jyumaefscl.p(this.f9298ppxfxbqfkf);
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    ((wkgbmnqykc) it.next()).oxmwwwfdhm(false);
                }
                for (wkgbmnqykc wkgbmnqykcVar : listP) {
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f9297iobyxmoadg + " is not attached to window. ") + "Cancelling running operation " + wkgbmnqykcVar);
                    }
                    wkgbmnqykcVar.ppxfxbqfkf(this.f9297iobyxmoadg);
                }
                List<wkgbmnqykc> listP2 = hg.jyumaefscl.p(this.f9300zoijcleaow);
                Iterator it2 = listP2.iterator();
                while (it2.hasNext()) {
                    ((wkgbmnqykc) it2.next()).oxmwwwfdhm(false);
                }
                for (wkgbmnqykc wkgbmnqykcVar2 : listP2) {
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f9297iobyxmoadg + " is not attached to window. ") + "Cancelling pending operation " + wkgbmnqykcVar2);
                    }
                    wkgbmnqykcVar2.ppxfxbqfkf(this.f9297iobyxmoadg);
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void wflxmlrfwp(pkzmftpjix fragmentStateManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.gtknphoqwx());
        }
        lqeggnwhkg(wkgbmnqykc.zoijcleaow.VISIBLE, wkgbmnqykc.iobyxmoadg.NONE, fragmentStateManager);
    }

    public abstract void wkgbmnqykc(List list, boolean z13);

    public final ViewGroup zdlpuopuiu() {
        return this.f9297iobyxmoadg;
    }
}
