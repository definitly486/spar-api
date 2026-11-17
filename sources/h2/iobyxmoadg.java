package h2;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.jztzpxfvev;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final ThreadLocal f39100lqeggnwhkg = new ThreadLocal();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ppxfxbqfkf f39105wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jztzpxfvev f39103iobyxmoadg = new jztzpxfvev();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final ArrayList f39106zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final C0898iobyxmoadg f39104ppxfxbqfkf = new C0898iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    long f39101eablkybsjg = 0;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f39102gxszxtbevo = false;

    /* JADX INFO: renamed from: h2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0898iobyxmoadg {
        C0898iobyxmoadg() {
        }

        void iobyxmoadg() {
            iobyxmoadg.this.f39101eablkybsjg = SystemClock.uptimeMillis();
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar.f39101eablkybsjg);
            if (iobyxmoadg.this.f39106zoijcleaow.size() > 0) {
                iobyxmoadg.this.eablkybsjg().iobyxmoadg();
            }
        }
    }

    static abstract class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final C0898iobyxmoadg f39108iobyxmoadg;

        ppxfxbqfkf(C0898iobyxmoadg c0898iobyxmoadg) {
            this.f39108iobyxmoadg = c0898iobyxmoadg;
        }

        abstract void iobyxmoadg();
    }

    private static class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Choreographer.FrameCallback f39109ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Choreographer f39110zoijcleaow;

        /* JADX INFO: renamed from: h2.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0899iobyxmoadg implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0899iobyxmoadg() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j13) {
                wkgbmnqykc.this.f39108iobyxmoadg.iobyxmoadg();
            }
        }

        wkgbmnqykc(C0898iobyxmoadg c0898iobyxmoadg) {
            super(c0898iobyxmoadg);
            this.f39110zoijcleaow = Choreographer.getInstance();
            this.f39109ppxfxbqfkf = new ChoreographerFrameCallbackC0899iobyxmoadg();
        }

        @Override // h2.iobyxmoadg.ppxfxbqfkf
        void iobyxmoadg() {
            this.f39110zoijcleaow.postFrameCallback(this.f39109ppxfxbqfkf);
        }
    }

    interface zoijcleaow {
        boolean iobyxmoadg(long j13);
    }

    iobyxmoadg() {
    }

    private boolean gxszxtbevo(zoijcleaow zoijcleaowVar, long j13) {
        Long l13 = (Long) this.f39103iobyxmoadg.get(zoijcleaowVar);
        if (l13 == null) {
            return true;
        }
        if (l13.longValue() >= j13) {
            return false;
        }
        this.f39103iobyxmoadg.remove(zoijcleaowVar);
        return true;
    }

    public static iobyxmoadg wkgbmnqykc() {
        ThreadLocal threadLocal = f39100lqeggnwhkg;
        if (threadLocal.get() == null) {
            threadLocal.set(new iobyxmoadg());
        }
        return (iobyxmoadg) threadLocal.get();
    }

    private void zoijcleaow() {
        if (this.f39102gxszxtbevo) {
            for (int size = this.f39106zoijcleaow.size() - 1; size >= 0; size--) {
                if (this.f39106zoijcleaow.get(size) == null) {
                    this.f39106zoijcleaow.remove(size);
                }
            }
            this.f39102gxszxtbevo = false;
        }
    }

    ppxfxbqfkf eablkybsjg() {
        if (this.f39105wkgbmnqykc == null) {
            this.f39105wkgbmnqykc = new wkgbmnqykc(this.f39104ppxfxbqfkf);
        }
        return this.f39105wkgbmnqykc;
    }

    public void iobyxmoadg(zoijcleaow zoijcleaowVar, long j13) {
        if (this.f39106zoijcleaow.size() == 0) {
            eablkybsjg().iobyxmoadg();
        }
        if (!this.f39106zoijcleaow.contains(zoijcleaowVar)) {
            this.f39106zoijcleaow.add(zoijcleaowVar);
        }
        if (j13 > 0) {
            this.f39103iobyxmoadg.put(zoijcleaowVar, Long.valueOf(SystemClock.uptimeMillis() + j13));
        }
    }

    public void lqeggnwhkg(zoijcleaow zoijcleaowVar) {
        this.f39103iobyxmoadg.remove(zoijcleaowVar);
        int iIndexOf = this.f39106zoijcleaow.indexOf(zoijcleaowVar);
        if (iIndexOf >= 0) {
            this.f39106zoijcleaow.set(iIndexOf, null);
            this.f39102gxszxtbevo = true;
        }
    }

    void ppxfxbqfkf(long j13) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i13 = 0; i13 < this.f39106zoijcleaow.size(); i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f39106zoijcleaow.get(i13);
            if (zoijcleaowVar != null && gxszxtbevo(zoijcleaowVar, jUptimeMillis)) {
                zoijcleaowVar.iobyxmoadg(j13);
            }
        }
        zoijcleaow();
    }
}
