package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f3607iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private q1.wkgbmnqykc f3608ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private CancellationSignal f3609zoijcleaow;

    class iobyxmoadg implements ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.biometric.lqeggnwhkg.ppxfxbqfkf
        public q1.wkgbmnqykc iobyxmoadg() {
            return new q1.wkgbmnqykc();
        }

        @Override // androidx.biometric.lqeggnwhkg.ppxfxbqfkf
        public CancellationSignal zoijcleaow() {
            return zoijcleaow.zoijcleaow();
        }
    }

    interface ppxfxbqfkf {
        q1.wkgbmnqykc iobyxmoadg();

        CancellationSignal zoijcleaow();
    }

    private static class zoijcleaow {
        static void iobyxmoadg(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal zoijcleaow() {
            return new CancellationSignal();
        }
    }

    lqeggnwhkg() {
    }

    void iobyxmoadg() {
        CancellationSignal cancellationSignal = this.f3609zoijcleaow;
        if (cancellationSignal != null) {
            try {
                zoijcleaow.iobyxmoadg(cancellationSignal);
            } catch (NullPointerException e13) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e13);
            }
            this.f3609zoijcleaow = null;
        }
        q1.wkgbmnqykc wkgbmnqykcVar = this.f3608ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            try {
                wkgbmnqykcVar.iobyxmoadg();
            } catch (NullPointerException e14) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e14);
            }
            this.f3608ppxfxbqfkf = null;
        }
    }

    q1.wkgbmnqykc ppxfxbqfkf() {
        if (this.f3608ppxfxbqfkf == null) {
            this.f3608ppxfxbqfkf = this.f3607iobyxmoadg.iobyxmoadg();
        }
        return this.f3608ppxfxbqfkf;
    }

    CancellationSignal zoijcleaow() {
        if (this.f3609zoijcleaow == null) {
            this.f3609zoijcleaow = this.f3607iobyxmoadg.zoijcleaow();
        }
        return this.f3609zoijcleaow;
    }
}
