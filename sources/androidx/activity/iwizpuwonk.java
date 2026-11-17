package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private OnBackInvokedCallback f2298eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private OnBackInvokedDispatcher f2299gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Runnable f2300iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f2301lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f2302nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hg.wflxmlrfwp f2303ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private jyumaefscl f2304wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final u1.iobyxmoadg f2305zoijcleaow;

    /* synthetic */ class btonecajqb extends kotlin.jvm.internal.vdvldrhtss implements tg.iobyxmoadg {
        btonecajqb(Object obj) {
            super(0, obj, iwizpuwonk.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            ((iwizpuwonk) this.receiver).vdvldrhtss();
        }
    }

    private final class dxjokdxxww implements androidx.activity.ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk f2306yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final jyumaefscl f2307zdlpuopuiu;

        public dxjokdxxww(iwizpuwonk iwizpuwonkVar, jyumaefscl onBackPressedCallback) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressedCallback, "onBackPressedCallback");
            this.f2306yggfygwlhe = iwizpuwonkVar;
            this.f2307zdlpuopuiu = onBackPressedCallback;
        }

        @Override // androidx.activity.ppxfxbqfkf
        public void cancel() {
            this.f2306yggfygwlhe.f2303ppxfxbqfkf.remove(this.f2307zdlpuopuiu);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f2306yggfygwlhe.f2304wkgbmnqykc, this.f2307zdlpuopuiu)) {
                this.f2307zdlpuopuiu.gxszxtbevo();
                this.f2306yggfygwlhe.f2304wkgbmnqykc = null;
            }
            this.f2307zdlpuopuiu.draadjrbmk(this);
            tg.iobyxmoadg iobyxmoadgVarEablkybsjg = this.f2307zdlpuopuiu.eablkybsjg();
            if (iobyxmoadgVarEablkybsjg != null) {
                iobyxmoadgVarEablkybsjg.invoke();
            }
            this.f2307zdlpuopuiu.agtfadlqog(null);
        }
    }

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        eablkybsjg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            iwizpuwonk.this.draadjrbmk();
        }
    }

    /* synthetic */ class gtknphoqwx extends kotlin.jvm.internal.vdvldrhtss implements tg.iobyxmoadg {
        gtknphoqwx(Object obj) {
            super(0, obj, iwizpuwonk.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            ((iwizpuwonk) this.receiver).vdvldrhtss();
        }
    }

    public static final class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f2309iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ppxfxbqfkf(tg.iobyxmoadg onBackInvoked) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final void eablkybsjg(Object dispatcher, Object callback) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }

        public final void wkgbmnqykc(Object dispatcher, int i13, Object callback) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i13, (OnBackInvokedCallback) callback);
        }

        public final OnBackInvokedCallback zoijcleaow(final tg.iobyxmoadg onBackInvoked) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.cqumvgiudr
                public final void onBackInvoked() {
                    iwizpuwonk.gxszxtbevo.ppxfxbqfkf(onBackInvoked);
                }
            };
        }
    }

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.activity.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.activity.zoijcleaow backEvent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
            iwizpuwonk.this.agtfadlqog(backEvent);
        }
    }

    public static final class lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f2311iobyxmoadg = new lqeggnwhkg();

        public static final class iobyxmoadg implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f2312iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ tg.iobyxmoadg f2313ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ tg.iobyxmoadg f2314wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f2315zoijcleaow;

            iobyxmoadg(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
                this.f2312iobyxmoadg = draadjrbmkVar;
                this.f2315zoijcleaow = draadjrbmkVar2;
                this.f2313ppxfxbqfkf = iobyxmoadgVar;
                this.f2314wkgbmnqykc = iobyxmoadgVar2;
            }

            public void onBackCancelled() {
                this.f2314wkgbmnqykc.invoke();
            }

            public void onBackInvoked() {
                this.f2313ppxfxbqfkf.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
                this.f2315zoijcleaow.invoke(new androidx.activity.zoijcleaow(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
                this.f2312iobyxmoadg.invoke(new androidx.activity.zoijcleaow(backEvent));
            }
        }

        private lqeggnwhkg() {
        }

        public final OnBackInvokedCallback iobyxmoadg(tg.draadjrbmk onBackStarted, tg.draadjrbmk onBackProgressed, tg.iobyxmoadg onBackInvoked, tg.iobyxmoadg onBackCancelled) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackCancelled, "onBackCancelled");
            return new iobyxmoadg(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class nufgyqmvbu implements androidx.lifecycle.agtfadlqog, androidx.activity.ppxfxbqfkf {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk f2316iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private androidx.activity.ppxfxbqfkf f2317jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final jyumaefscl f2318yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final androidx.lifecycle.gtknphoqwx f2319zdlpuopuiu;

        public nufgyqmvbu(iwizpuwonk iwizpuwonkVar, androidx.lifecycle.gtknphoqwx lifecycle, jyumaefscl onBackPressedCallback) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycle, "lifecycle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressedCallback, "onBackPressedCallback");
            this.f2316iwizpuwonk = iwizpuwonkVar;
            this.f2319zdlpuopuiu = lifecycle;
            this.f2318yggfygwlhe = onBackPressedCallback;
            lifecycle.iobyxmoadg(this);
        }

        @Override // androidx.activity.ppxfxbqfkf
        public void cancel() {
            this.f2319zdlpuopuiu.wkgbmnqykc(this);
            this.f2318yggfygwlhe.draadjrbmk(this);
            androidx.activity.ppxfxbqfkf ppxfxbqfkfVar = this.f2317jyumaefscl;
            if (ppxfxbqfkfVar != null) {
                ppxfxbqfkfVar.cancel();
            }
            this.f2317jyumaefscl = null;
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss source, androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START) {
                this.f2317jyumaefscl = this.f2316iwizpuwonk.btonecajqb(this.f2318yggfygwlhe);
                return;
            }
            if (event != androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP) {
                if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.ppxfxbqfkf ppxfxbqfkfVar = this.f2317jyumaefscl;
                if (ppxfxbqfkfVar != null) {
                    ppxfxbqfkfVar.cancel();
                }
            }
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            iwizpuwonk.this.draadjrbmk();
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            iwizpuwonk.this.gtknphoqwx();
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.activity.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.activity.zoijcleaow backEvent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
            iwizpuwonk.this.wflxmlrfwp(backEvent);
        }
    }

    public iwizpuwonk(Runnable runnable, u1.iobyxmoadg iobyxmoadgVar) {
        this.f2300iobyxmoadg = runnable;
        this.f2305zoijcleaow = iobyxmoadgVar;
        this.f2303ppxfxbqfkf = new hg.wflxmlrfwp();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            this.f2298eablkybsjg = i13 >= 34 ? lqeggnwhkg.f2311iobyxmoadg.iobyxmoadg(new iobyxmoadg(), new zoijcleaow(), new ppxfxbqfkf(), new wkgbmnqykc()) : gxszxtbevo.f2309iobyxmoadg.zoijcleaow(new eablkybsjg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agtfadlqog(androidx.activity.zoijcleaow zoijcleaowVar) {
        Object objPrevious;
        hg.wflxmlrfwp wflxmlrfwpVar = this.f2303ppxfxbqfkf;
        ListIterator<E> listIterator = wflxmlrfwpVar.listIterator(wflxmlrfwpVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((jyumaefscl) objPrevious).btonecajqb());
        jyumaefscl jyumaefsclVar = (jyumaefscl) objPrevious;
        this.f2304wkgbmnqykc = jyumaefsclVar;
        if (jyumaefsclVar != null) {
            jyumaefsclVar.dxjokdxxww(zoijcleaowVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gtknphoqwx() {
        Object objPrevious;
        jyumaefscl jyumaefsclVar = this.f2304wkgbmnqykc;
        if (jyumaefsclVar == null) {
            hg.wflxmlrfwp wflxmlrfwpVar = this.f2303ppxfxbqfkf;
            ListIterator<E> listIterator = wflxmlrfwpVar.listIterator(wflxmlrfwpVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((jyumaefscl) objPrevious).btonecajqb());
            jyumaefsclVar = (jyumaefscl) objPrevious;
        }
        this.f2304wkgbmnqykc = null;
        if (jyumaefsclVar != null) {
            jyumaefsclVar.gxszxtbevo();
        }
    }

    private final void rgvfuqvkyq(boolean z13) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2299gxszxtbevo;
        OnBackInvokedCallback onBackInvokedCallback = this.f2298eablkybsjg;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z13 && !this.f2301lqeggnwhkg) {
            gxszxtbevo.f2309iobyxmoadg.wkgbmnqykc(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2301lqeggnwhkg = true;
        } else {
            if (z13 || !this.f2301lqeggnwhkg) {
                return;
            }
            gxszxtbevo.f2309iobyxmoadg.eablkybsjg(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2301lqeggnwhkg = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vdvldrhtss() {
        boolean z13 = this.f2302nufgyqmvbu;
        hg.wflxmlrfwp wflxmlrfwpVar = this.f2303ppxfxbqfkf;
        boolean z14 = false;
        if (wflxmlrfwpVar == null || !wflxmlrfwpVar.isEmpty()) {
            Iterator<E> it = wflxmlrfwpVar.iterator();
            while (it.hasNext()) {
                if (((jyumaefscl) it.next()).btonecajqb()) {
                    z14 = true;
                    break;
                }
            }
        }
        this.f2302nufgyqmvbu = z14;
        if (z14 != z13) {
            u1.iobyxmoadg iobyxmoadgVar = this.f2305zoijcleaow;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.accept(Boolean.valueOf(z14));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                rgvfuqvkyq(z14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wflxmlrfwp(androidx.activity.zoijcleaow zoijcleaowVar) {
        Object objPrevious;
        jyumaefscl jyumaefsclVar = this.f2304wkgbmnqykc;
        if (jyumaefsclVar == null) {
            hg.wflxmlrfwp wflxmlrfwpVar = this.f2303ppxfxbqfkf;
            ListIterator<E> listIterator = wflxmlrfwpVar.listIterator(wflxmlrfwpVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((jyumaefscl) objPrevious).btonecajqb());
            jyumaefsclVar = (jyumaefscl) objPrevious;
        }
        if (jyumaefsclVar != null) {
            jyumaefsclVar.nufgyqmvbu(zoijcleaowVar);
        }
    }

    public final androidx.activity.ppxfxbqfkf btonecajqb(jyumaefscl onBackPressedCallback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressedCallback, "onBackPressedCallback");
        this.f2303ppxfxbqfkf.add(onBackPressedCallback);
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this, onBackPressedCallback);
        onBackPressedCallback.wkgbmnqykc(dxjokdxxwwVar);
        vdvldrhtss();
        onBackPressedCallback.agtfadlqog(new gtknphoqwx(this));
        return dxjokdxxwwVar;
    }

    public final void draadjrbmk() {
        Object objPrevious;
        jyumaefscl jyumaefsclVar = this.f2304wkgbmnqykc;
        if (jyumaefsclVar == null) {
            hg.wflxmlrfwp wflxmlrfwpVar = this.f2303ppxfxbqfkf;
            ListIterator<E> listIterator = wflxmlrfwpVar.listIterator(wflxmlrfwpVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((jyumaefscl) objPrevious).btonecajqb());
            jyumaefsclVar = (jyumaefscl) objPrevious;
        }
        this.f2304wkgbmnqykc = null;
        if (jyumaefsclVar != null) {
            jyumaefsclVar.lqeggnwhkg();
            return;
        }
        Runnable runnable = this.f2300iobyxmoadg;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void dxjokdxxww(androidx.lifecycle.vdvldrhtss owner, jyumaefscl onBackPressedCallback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.gtknphoqwx lifecycle = owner.getLifecycle();
        if (lifecycle.zoijcleaow() == androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED) {
            return;
        }
        onBackPressedCallback.wkgbmnqykc(new nufgyqmvbu(this, lifecycle, onBackPressedCallback));
        vdvldrhtss();
        onBackPressedCallback.agtfadlqog(new btonecajqb(this));
    }

    public final void nufgyqmvbu(jyumaefscl onBackPressedCallback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressedCallback, "onBackPressedCallback");
        btonecajqb(onBackPressedCallback);
    }

    public final void ojitshcjhn(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(invoker, "invoker");
        this.f2299gxszxtbevo = invoker;
        rgvfuqvkyq(this.f2302nufgyqmvbu);
    }

    public iwizpuwonk(Runnable runnable) {
        this(runnable, null);
    }
}
