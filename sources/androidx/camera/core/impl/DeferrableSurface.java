package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    Class f3715btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f3716dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f3717eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f3718gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f3719iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f3720lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Size f3721nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f3722ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f3723wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f3724zoijcleaow;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final Size f3713gtknphoqwx = new Size(0, 0);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final boolean f3712draadjrbmk = sopmlzcsov.gxszxtbevo("DeferrableSurface");

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final AtomicInteger f3714wflxmlrfwp = new AtomicInteger(0);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final AtomicInteger f3711agtfadlqog = new AtomicInteger(0);

    public static final class SurfaceClosedException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        DeferrableSurface f3725zdlpuopuiu;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.f3725zdlpuopuiu = deferrableSurface;
        }

        public DeferrableSurface iobyxmoadg() {
            return this.f3725zdlpuopuiu;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(f3713gtknphoqwx, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object agtfadlqog(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f3719iobyxmoadg) {
            this.f3723wkgbmnqykc = iobyxmoadgVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object ojitshcjhn(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f3719iobyxmoadg) {
            this.f3718gxszxtbevo = iobyxmoadgVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rgvfuqvkyq(String str) {
        try {
            this.f3717eablkybsjg.get();
            vdvldrhtss("Surface terminated", f3711agtfadlqog.decrementAndGet(), f3714wflxmlrfwp.get());
        } catch (Exception e13) {
            sopmlzcsov.ppxfxbqfkf("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f3719iobyxmoadg) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f3722ppxfxbqfkf), Integer.valueOf(this.f3724zoijcleaow)), e13);
            }
        }
    }

    private void vdvldrhtss(String str, int i13, int i14) {
        if (!f3712draadjrbmk && sopmlzcsov.gxszxtbevo("DeferrableSurface")) {
            sopmlzcsov.iobyxmoadg("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        sopmlzcsov.iobyxmoadg("DeferrableSurface", str + "[total_surfaces=" + i13 + ", used_surfaces=" + i14 + "](" + this + "}");
    }

    public final com.google.common.util.concurrent.wkgbmnqykc btonecajqb() {
        synchronized (this.f3719iobyxmoadg) {
            try {
                if (this.f3722ppxfxbqfkf) {
                    return iozdgvuglv.gtknphoqwx.btonecajqb(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return oxmwwwfdhm();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void draadjrbmk() {
        synchronized (this.f3719iobyxmoadg) {
            try {
                int i13 = this.f3724zoijcleaow;
                if (i13 == 0 && this.f3722ppxfxbqfkf) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f3724zoijcleaow = i13 + 1;
                if (sopmlzcsov.gxszxtbevo("DeferrableSurface")) {
                    if (this.f3724zoijcleaow == 1) {
                        vdvldrhtss("New surface in use", f3711agtfadlqog.get(), f3714wflxmlrfwp.incrementAndGet());
                    }
                    sopmlzcsov.iobyxmoadg("DeferrableSurface", "use count+1, useCount=" + this.f3724zoijcleaow + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int dxjokdxxww() {
        return this.f3716dxjokdxxww;
    }

    public void eablkybsjg() {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar;
        synchronized (this.f3719iobyxmoadg) {
            try {
                int i13 = this.f3724zoijcleaow;
                if (i13 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i14 = i13 - 1;
                this.f3724zoijcleaow = i14;
                if (i14 == 0 && this.f3722ppxfxbqfkf) {
                    iobyxmoadgVar = this.f3723wkgbmnqykc;
                    this.f3723wkgbmnqykc = null;
                } else {
                    iobyxmoadgVar = null;
                }
                if (sopmlzcsov.gxszxtbevo("DeferrableSurface")) {
                    sopmlzcsov.iobyxmoadg("DeferrableSurface", "use count-1,  useCount=" + this.f3724zoijcleaow + " closed=" + this.f3722ppxfxbqfkf + " " + this);
                    if (this.f3724zoijcleaow == 0) {
                        vdvldrhtss("Surface no longer in use", f3711agtfadlqog.get(), f3714wflxmlrfwp.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(null);
        }
    }

    public com.google.common.util.concurrent.wkgbmnqykc gtknphoqwx() {
        return iozdgvuglv.gtknphoqwx.zdlpuopuiu(this.f3717eablkybsjg);
    }

    public com.google.common.util.concurrent.wkgbmnqykc gxszxtbevo() {
        return iozdgvuglv.gtknphoqwx.zdlpuopuiu(this.f3720lqeggnwhkg);
    }

    public void kcexrzcfyt(Class cls) {
        this.f3715btonecajqb = cls;
    }

    public Class lqeggnwhkg() {
        return this.f3715btonecajqb;
    }

    public Size nufgyqmvbu() {
        return this.f3721nufgyqmvbu;
    }

    protected abstract com.google.common.util.concurrent.wkgbmnqykc oxmwwwfdhm();

    public boolean wflxmlrfwp() {
        boolean z13;
        synchronized (this.f3719iobyxmoadg) {
            z13 = this.f3722ppxfxbqfkf;
        }
        return z13;
    }

    public void wkgbmnqykc() {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar;
        synchronized (this.f3719iobyxmoadg) {
            try {
                if (this.f3722ppxfxbqfkf) {
                    iobyxmoadgVar = null;
                } else {
                    this.f3722ppxfxbqfkf = true;
                    this.f3718gxszxtbevo.ppxfxbqfkf(null);
                    if (this.f3724zoijcleaow == 0) {
                        iobyxmoadgVar = this.f3723wkgbmnqykc;
                        this.f3723wkgbmnqykc = null;
                    } else {
                        iobyxmoadgVar = null;
                    }
                    if (sopmlzcsov.gxszxtbevo("DeferrableSurface")) {
                        sopmlzcsov.iobyxmoadg("DeferrableSurface", "surface closed,  useCount=" + this.f3724zoijcleaow + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(null);
        }
    }

    public DeferrableSurface(Size size, int i13) {
        this.f3719iobyxmoadg = new Object();
        this.f3724zoijcleaow = 0;
        this.f3722ppxfxbqfkf = false;
        this.f3721nufgyqmvbu = size;
        this.f3716dxjokdxxww = i13;
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: istkbnxepw.yadqdtsiqt
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f49444iobyxmoadg.agtfadlqog(iobyxmoadgVar);
            }
        });
        this.f3717eablkybsjg = wkgbmnqykcVarIobyxmoadg;
        this.f3720lqeggnwhkg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: istkbnxepw.iozdgvuglv
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f49337iobyxmoadg.ojitshcjhn(iobyxmoadgVar);
            }
        });
        if (sopmlzcsov.gxszxtbevo("DeferrableSurface")) {
            vdvldrhtss("Surface created", f3711agtfadlqog.incrementAndGet(), f3714wflxmlrfwp.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            wkgbmnqykcVarIobyxmoadg.iobyxmoadg(new Runnable() { // from class: istkbnxepw.lmojexxdyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49365zdlpuopuiu.rgvfuqvkyq(stackTraceString);
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
    }
}
