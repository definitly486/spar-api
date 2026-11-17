package f3;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f32683iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private HandlerThread f32684ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f32685wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Looper f32686zoijcleaow;

    public pkzmftpjix() {
        this(null);
    }

    public Looper iobyxmoadg() {
        Looper looper;
        synchronized (this.f32683iobyxmoadg) {
            try {
                if (this.f32686zoijcleaow == null) {
                    y2.iobyxmoadg.lqeggnwhkg(this.f32685wkgbmnqykc == 0 && this.f32684ppxfxbqfkf == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f32684ppxfxbqfkf = handlerThread;
                    handlerThread.start();
                    this.f32686zoijcleaow = this.f32684ppxfxbqfkf.getLooper();
                }
                this.f32685wkgbmnqykc++;
                looper = this.f32686zoijcleaow;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void zoijcleaow() {
        HandlerThread handlerThread;
        synchronized (this.f32683iobyxmoadg) {
            try {
                y2.iobyxmoadg.lqeggnwhkg(this.f32685wkgbmnqykc > 0);
                int i13 = this.f32685wkgbmnqykc - 1;
                this.f32685wkgbmnqykc = i13;
                if (i13 == 0 && (handlerThread = this.f32684ppxfxbqfkf) != null) {
                    handlerThread.quit();
                    this.f32684ppxfxbqfkf = null;
                    this.f32686zoijcleaow = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public pkzmftpjix(Looper looper) {
        this.f32683iobyxmoadg = new Object();
        this.f32686zoijcleaow = looper;
        this.f32684ppxfxbqfkf = null;
        this.f32685wkgbmnqykc = 0;
    }
}
