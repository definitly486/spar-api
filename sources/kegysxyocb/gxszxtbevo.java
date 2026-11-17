package kegysxyocb;

import android.os.SystemClock;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f55352iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f55353zoijcleaow;

    public gxszxtbevo() {
        this(androidx.camera.extensions.internal.compat.quirk.iobyxmoadg.zoijcleaow(CrashWhenOnDisableTooSoon.class) != null);
    }

    private void iobyxmoadg() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f55353zoijcleaow;
        while (true) {
            long j14 = jElapsedRealtime - j13;
            if (j14 >= 100) {
                return;
            }
            long j15 = 100 - j14;
            try {
                sopmlzcsov.iobyxmoadg("OnEnableDisableSessionDurationCheck", "onDisableSession too soon, wait " + j15 + " ms");
                Thread.sleep(j15);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j13 = this.f55353zoijcleaow;
            } catch (InterruptedException unused) {
                sopmlzcsov.ppxfxbqfkf("OnEnableDisableSessionDurationCheck", "sleep interrupted");
                return;
            }
        }
    }

    public void ppxfxbqfkf() {
        if (this.f55352iobyxmoadg) {
            this.f55353zoijcleaow = SystemClock.elapsedRealtime();
        }
    }

    public void zoijcleaow() {
        if (this.f55352iobyxmoadg) {
            iobyxmoadg();
        }
    }

    gxszxtbevo(boolean z13) {
        this.f55353zoijcleaow = 0L;
        this.f55352iobyxmoadg = z13;
    }
}
