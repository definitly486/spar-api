package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import lereixgezr.czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements czzsidtyhn.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f3835iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f3836ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Throwable f3837wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f3838zoijcleaow;

    public lqeggnwhkg(long j13, int i13, Throwable th2) {
        this.f3836ppxfxbqfkf = SystemClock.elapsedRealtime() - j13;
        this.f3838zoijcleaow = i13;
        if (th2 instanceof CameraValidator.CameraIdListIncorrectException) {
            this.f3835iobyxmoadg = 2;
            this.f3837wkgbmnqykc = th2;
            return;
        }
        if (!(th2 instanceof InitializationException)) {
            this.f3835iobyxmoadg = 0;
            this.f3837wkgbmnqykc = th2;
            return;
        }
        Throwable cause = th2.getCause();
        th2 = cause != null ? cause : th2;
        this.f3837wkgbmnqykc = th2;
        if (th2 instanceof CameraUnavailableException) {
            this.f3835iobyxmoadg = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            this.f3835iobyxmoadg = 1;
        } else {
            this.f3835iobyxmoadg = 0;
        }
    }

    @Override // lereixgezr.czzsidtyhn.zoijcleaow
    public int getStatus() {
        return this.f3835iobyxmoadg;
    }

    @Override // lereixgezr.czzsidtyhn.zoijcleaow
    public Throwable iobyxmoadg() {
        return this.f3837wkgbmnqykc;
    }

    @Override // lereixgezr.czzsidtyhn.zoijcleaow
    public long zoijcleaow() {
        return this.f3836ppxfxbqfkf;
    }
}
