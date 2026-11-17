package lereixgezr;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class tbqsvytpvh {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final Range f62387rgvfuqvkyq = androidx.camera.core.impl.iwizpuwonk.f3803iobyxmoadg;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private dxjokdxxww f62388agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f62389btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final DeferrableSurface f62390draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f62391dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final istkbnxepw.iwizpuwonk f62392eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f62393gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f62394gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f62395iobyxmoadg = new Object();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final com.google.common.util.concurrent.wkgbmnqykc f62396lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f62397nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private Executor f62398ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iwizpuwonk f62399ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private nufgyqmvbu f62400wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Range f62401wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Size f62402zoijcleaow;

    public interface dxjokdxxww {
        void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar);
    }

    class eablkybsjg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Runnable f62403iobyxmoadg;

        eablkybsjg(Runnable runnable) {
            this.f62403iobyxmoadg = runnable;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            this.f62403iobyxmoadg.run();
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
        }
    }

    private static final class gxszxtbevo extends RuntimeException {
        gxszxtbevo(String str, Throwable th2) {
            super(str, th2);
        }
    }

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f62405iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f62407zoijcleaow;

        iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
            this.f62405iobyxmoadg = iobyxmoadgVar;
            this.f62407zoijcleaow = wkgbmnqykcVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            u1.nufgyqmvbu.nufgyqmvbu(this.f62405iobyxmoadg.ppxfxbqfkf(null));
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            if (th2 instanceof gxszxtbevo) {
                u1.nufgyqmvbu.nufgyqmvbu(this.f62407zoijcleaow.cancel(false));
            } else {
                u1.nufgyqmvbu.nufgyqmvbu(this.f62405iobyxmoadg.ppxfxbqfkf(null));
            }
        }
    }

    public static abstract class lqeggnwhkg {
        lqeggnwhkg() {
        }

        static lqeggnwhkg ppxfxbqfkf(int i13, Surface surface) {
            return new lereixgezr.lqeggnwhkg(i13, surface);
        }

        public abstract int iobyxmoadg();

        public abstract Surface zoijcleaow();
    }

    public static abstract class nufgyqmvbu {
        nufgyqmvbu() {
        }

        public static nufgyqmvbu lqeggnwhkg(Rect rect, int i13, int i14, boolean z13, Matrix matrix, boolean z14) {
            return new lereixgezr.nufgyqmvbu(rect, i13, i14, z13, matrix, z14);
        }

        public abstract boolean eablkybsjg();

        public abstract boolean gxszxtbevo();

        public abstract Rect iobyxmoadg();

        public abstract Matrix ppxfxbqfkf();

        public abstract int wkgbmnqykc();

        public abstract int zoijcleaow();
    }

    class ppxfxbqfkf implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f62408iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ String f62409ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f62411zoijcleaow;

        ppxfxbqfkf(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, String str) {
            this.f62408iobyxmoadg = wkgbmnqykcVar;
            this.f62411zoijcleaow = iobyxmoadgVar;
            this.f62409ppxfxbqfkf = str;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            iozdgvuglv.gtknphoqwx.yggfygwlhe(this.f62408iobyxmoadg, this.f62411zoijcleaow);
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f62411zoijcleaow.ppxfxbqfkf(null);
                return;
            }
            u1.nufgyqmvbu.nufgyqmvbu(this.f62411zoijcleaow.gxszxtbevo(new gxszxtbevo(this.f62409ppxfxbqfkf + " cancelled.", th2)));
        }
    }

    class wkgbmnqykc implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ u1.iobyxmoadg f62412iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Surface f62414zoijcleaow;

        wkgbmnqykc(u1.iobyxmoadg iobyxmoadgVar, Surface surface) {
            this.f62412iobyxmoadg = iobyxmoadgVar;
            this.f62414zoijcleaow = surface;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            this.f62412iobyxmoadg.accept(lqeggnwhkg.ppxfxbqfkf(0, this.f62414zoijcleaow));
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            u1.nufgyqmvbu.dxjokdxxww(th2 instanceof gxszxtbevo, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f62412iobyxmoadg.accept(lqeggnwhkg.ppxfxbqfkf(1, this.f62414zoijcleaow));
        }
    }

    class zoijcleaow extends DeferrableSurface {
        zoijcleaow(Size size, int i13) {
            super(size, i13);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        protected com.google.common.util.concurrent.wkgbmnqykc oxmwwwfdhm() {
            return tbqsvytpvh.this.f62396lqeggnwhkg;
        }
    }

    public tbqsvytpvh(Size size, istkbnxepw.iwizpuwonk iwizpuwonkVar, boolean z13, iwizpuwonk iwizpuwonkVar2, Range range, Runnable runnable) {
        this.f62402zoijcleaow = size;
        this.f62392eablkybsjg = iwizpuwonkVar;
        this.f62394gxszxtbevo = z13;
        this.f62399ppxfxbqfkf = iwizpuwonkVar2;
        this.f62401wkgbmnqykc = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: lereixgezr.oipsdeybqn
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return tbqsvytpvh.zdlpuopuiu(atomicReference, str, iobyxmoadgVar);
            }
        });
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo((androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) atomicReference.get());
        this.f62393gtknphoqwx = iobyxmoadgVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: lereixgezr.bfopjjpdmp
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2) {
                return tbqsvytpvh.yggfygwlhe(atomicReference2, str, iobyxmoadgVar2);
            }
        });
        this.f62391dxjokdxxww = wkgbmnqykcVarIobyxmoadg2;
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarIobyxmoadg2, new iobyxmoadg(iobyxmoadgVar, wkgbmnqykcVarIobyxmoadg), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = (androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo((androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg3 = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: lereixgezr.opjhrmiecq
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3) {
                return tbqsvytpvh.jyumaefscl(atomicReference3, str, iobyxmoadgVar3);
            }
        });
        this.f62396lqeggnwhkg = wkgbmnqykcVarIobyxmoadg3;
        this.f62397nufgyqmvbu = (androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo((androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) atomicReference3.get());
        zoijcleaow zoijcleaowVar = new zoijcleaow(size, 34);
        this.f62390draadjrbmk = zoijcleaowVar;
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = zoijcleaowVar.gtknphoqwx();
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarIobyxmoadg3, new ppxfxbqfkf(wkgbmnqykcVarGtknphoqwx, iobyxmoadgVar2, str), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        wkgbmnqykcVarGtknphoqwx.iobyxmoadg(new Runnable() { // from class: lereixgezr.iyctptxqzt
            @Override // java.lang.Runnable
            public final void run() {
                this.f62295zdlpuopuiu.iwizpuwonk();
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        this.f62389btonecajqb = rgvfuqvkyq(yadqdtsiqt.iobyxmoadg.iobyxmoadg(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void cqumvgiudr(u1.iobyxmoadg iobyxmoadgVar, Surface surface) {
        iobyxmoadgVar.accept(lqeggnwhkg.ppxfxbqfkf(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void esjtqupxsv(u1.iobyxmoadg iobyxmoadgVar, Surface surface) {
        iobyxmoadgVar.accept(lqeggnwhkg.ppxfxbqfkf(4, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk() {
        this.f62396lqeggnwhkg.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object jyumaefscl(AtomicReference atomicReference, String str, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        atomicReference.set(iobyxmoadgVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object kcexrzcfyt(AtomicReference atomicReference, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        atomicReference.set(iobyxmoadgVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg rgvfuqvkyq(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: lereixgezr.weqkydbzbr
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f62444iobyxmoadg.kcexrzcfyt(atomicReference, iobyxmoadgVar);
            }
        }), new eablkybsjg(runnable), executor);
        return (androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo((androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) atomicReference.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object yggfygwlhe(AtomicReference atomicReference, String str, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        atomicReference.set(iobyxmoadgVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object zdlpuopuiu(AtomicReference atomicReference, String str, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        atomicReference.set(iobyxmoadgVar);
        return str + "-cancellation";
    }

    public iwizpuwonk agtfadlqog() {
        return this.f62399ppxfxbqfkf;
    }

    public void btonecajqb(Executor executor, Runnable runnable) {
        this.f62393gtknphoqwx.iobyxmoadg(runnable, executor);
    }

    public void cdpycssgdh(final nufgyqmvbu nufgyqmvbuVar) {
        final dxjokdxxww dxjokdxxwwVar;
        Executor executor;
        synchronized (this.f62395iobyxmoadg) {
            this.f62400wflxmlrfwp = nufgyqmvbuVar;
            dxjokdxxwwVar = this.f62388agtfadlqog;
            executor = this.f62398ojitshcjhn;
        }
        if (dxjokdxxwwVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: lereixgezr.zfvoamnweg
            @Override // java.lang.Runnable
            public final void run() {
                dxjokdxxwwVar.iobyxmoadg(nufgyqmvbuVar);
            }
        });
    }

    public istkbnxepw.iwizpuwonk draadjrbmk() {
        return this.f62392eablkybsjg;
    }

    public void gtknphoqwx() {
        synchronized (this.f62395iobyxmoadg) {
            this.f62388agtfadlqog = null;
            this.f62398ojitshcjhn = null;
        }
    }

    public void istkbnxepw(Executor executor, final dxjokdxxww dxjokdxxwwVar) {
        final nufgyqmvbu nufgyqmvbuVar;
        synchronized (this.f62395iobyxmoadg) {
            this.f62388agtfadlqog = dxjokdxxwwVar;
            this.f62398ojitshcjhn = executor;
            nufgyqmvbuVar = this.f62400wflxmlrfwp;
        }
        if (nufgyqmvbuVar != null) {
            executor.execute(new Runnable() { // from class: lereixgezr.lrnfpwlwnk
                @Override // java.lang.Runnable
                public final void run() {
                    dxjokdxxwwVar.iobyxmoadg(nufgyqmvbuVar);
                }
            });
        }
    }

    public Size ojitshcjhn() {
        return this.f62402zoijcleaow;
    }

    public boolean oxmwwwfdhm() {
        return this.f62394gxszxtbevo;
    }

    public boolean vdvldrhtss() {
        yadqdtsiqt();
        return this.f62389btonecajqb.ppxfxbqfkf(null);
    }

    public DeferrableSurface wflxmlrfwp() {
        return this.f62390draadjrbmk;
    }

    public boolean yadqdtsiqt() {
        return this.f62397nufgyqmvbu.gxszxtbevo(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public void zynmafqrjb(final Surface surface, Executor executor, final u1.iobyxmoadg iobyxmoadgVar) {
        if (this.f62397nufgyqmvbu.ppxfxbqfkf(surface) || this.f62396lqeggnwhkg.isCancelled()) {
            iozdgvuglv.gtknphoqwx.lqeggnwhkg(this.f62391dxjokdxxww, new wkgbmnqykc(iobyxmoadgVar, surface), executor);
            return;
        }
        u1.nufgyqmvbu.nufgyqmvbu(this.f62396lqeggnwhkg.isDone());
        try {
            this.f62396lqeggnwhkg.get();
            executor.execute(new Runnable() { // from class: lereixgezr.zeieaojujs
                @Override // java.lang.Runnable
                public final void run() {
                    tbqsvytpvh.cqumvgiudr(iobyxmoadgVar, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: lereixgezr.nuxfzjnpeb
                @Override // java.lang.Runnable
                public final void run() {
                    tbqsvytpvh.esjtqupxsv(iobyxmoadgVar, surface);
                }
            });
        }
    }
}
