package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class cllcsxoeiz extends dsvhmnatus {

    class eablkybsjg extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Rect f9188iobyxmoadg;

        eablkybsjg(Rect rect) {
            this.f9188iobyxmoadg = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f9188iobyxmoadg;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f9188iobyxmoadg;
        }
    }

    class iobyxmoadg extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Rect f9190iobyxmoadg;

        iobyxmoadg(Rect rect) {
            this.f9190iobyxmoadg = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f9190iobyxmoadg;
        }
    }

    class ppxfxbqfkf implements Transition.TransitionListener {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ Object f9192eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ ArrayList f9193gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Object f9194iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Object f9196ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ ArrayList f9197wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ArrayList f9198zoijcleaow;

        ppxfxbqfkf(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f9194iobyxmoadg = obj;
            this.f9198zoijcleaow = arrayList;
            this.f9196ppxfxbqfkf = obj2;
            this.f9197wkgbmnqykc = arrayList2;
            this.f9192eablkybsjg = obj3;
            this.f9193gxszxtbevo = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f9194iobyxmoadg;
            if (obj != null) {
                cllcsxoeiz.this.cdpycssgdh(obj, this.f9198zoijcleaow, null);
            }
            Object obj2 = this.f9196ppxfxbqfkf;
            if (obj2 != null) {
                cllcsxoeiz.this.cdpycssgdh(obj2, this.f9197wkgbmnqykc, null);
            }
            Object obj3 = this.f9192eablkybsjg;
            if (obj3 != null) {
                cllcsxoeiz.this.cdpycssgdh(obj3, this.f9193gxszxtbevo, null);
            }
        }
    }

    class wkgbmnqykc implements Transition.TransitionListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Runnable f9199iobyxmoadg;

        wkgbmnqykc(Runnable runnable) {
            this.f9199iobyxmoadg = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f9199iobyxmoadg.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    class zoijcleaow implements Transition.TransitionListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ View f9201iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ArrayList f9203zoijcleaow;

        zoijcleaow(View view, ArrayList arrayList) {
            this.f9201iobyxmoadg = view;
            this.f9203zoijcleaow = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f9201iobyxmoadg.setVisibility(8);
            int size = this.f9203zoijcleaow.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((View) this.f9203zoijcleaow.get(i13)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    cllcsxoeiz() {
    }

    private static boolean istkbnxepw(Transition transition) {
        return (dsvhmnatus.draadjrbmk(transition.getTargetIds()) && dsvhmnatus.draadjrbmk(transition.getTargetNames()) && dsvhmnatus.draadjrbmk(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public boolean agtfadlqog(Object obj) {
        if (!FragmentManager.rhgxfdycjh(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public void cdpycssgdh(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i13 < transitionCount) {
                cdpycssgdh(transitionSet.getTransitionAt(i13), arrayList, arrayList2);
                i13++;
            }
            return;
        }
        if (istkbnxepw(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i13 < size) {
            transition.addTarget((View) arrayList2.get(i13));
            i13++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void eablkybsjg(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void iobyxmoadg(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void iwizpuwonk(Fragment fragment, Object obj, q1.wkgbmnqykc wkgbmnqykcVar, Runnable runnable) {
        ((Transition) obj).addListener(new wkgbmnqykc(runnable));
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void jyumaefscl(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            gtknphoqwx(view, rect);
            ((Transition) obj).setEpicenterCallback(new iobyxmoadg(rect));
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void kcexrzcfyt(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new ppxfxbqfkf(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void lereixgezr(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            dsvhmnatus.gxszxtbevo(targets, (View) arrayList.get(i13));
        }
        targets.add(view);
        arrayList.add(view);
        zoijcleaow(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public boolean lqeggnwhkg(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object nufgyqmvbu(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object ojitshcjhn(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void oxmwwwfdhm(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new zoijcleaow(view, arrayList));
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void pmvmpeiblj(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            cdpycssgdh(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object rgvfuqvkyq(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public boolean wflxmlrfwp() {
        if (!FragmentManager.rhgxfdycjh(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void yggfygwlhe(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new eablkybsjg(rect));
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void zoijcleaow(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i13 < transitionCount) {
                zoijcleaow(transitionSet.getTransitionAt(i13), arrayList);
                i13++;
            }
            return;
        }
        if (istkbnxepw(transition) || !dsvhmnatus.draadjrbmk(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i13 < size) {
            transition.addTarget((View) arrayList.get(i13));
            i13++;
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object zynmafqrjb(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
