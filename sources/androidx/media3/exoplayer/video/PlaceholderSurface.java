package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;
import y2.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static boolean f11455cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static int f11456iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f11457jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f11458yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final boolean f11459zdlpuopuiu;

    private static class zoijcleaow extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private PlaceholderSurface f11460cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private RuntimeException f11461iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Error f11462jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Handler f11463yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private androidx.media3.common.util.iobyxmoadg f11464zdlpuopuiu;

        public zoijcleaow() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void wkgbmnqykc() {
            y2.iobyxmoadg.eablkybsjg(this.f11464zdlpuopuiu);
            this.f11464zdlpuopuiu.dxjokdxxww();
        }

        private void zoijcleaow(int i13) throws GlUtil.GlException {
            y2.iobyxmoadg.eablkybsjg(this.f11464zdlpuopuiu);
            this.f11464zdlpuopuiu.nufgyqmvbu(i13);
            this.f11460cqumvgiudr = new PlaceholderSurface(this, this.f11464zdlpuopuiu.lqeggnwhkg(), i13 != 0);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i13 = message.what;
            try {
                if (i13 != 1) {
                    if (i13 != 2) {
                        return true;
                    }
                    try {
                        wkgbmnqykc();
                    } catch (Throwable th2) {
                        try {
                            kcexrzcfyt.wkgbmnqykc("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    zoijcleaow(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e13) {
                    kcexrzcfyt.wkgbmnqykc("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                    this.f11461iwizpuwonk = new IllegalStateException(e13);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e14) {
                    kcexrzcfyt.wkgbmnqykc("PlaceholderSurface", "Failed to initialize placeholder surface", e14);
                    this.f11462jyumaefscl = e14;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e15) {
                    kcexrzcfyt.wkgbmnqykc("PlaceholderSurface", "Failed to initialize placeholder surface", e15);
                    this.f11461iwizpuwonk = e15;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }

        public PlaceholderSurface iobyxmoadg(int i13) {
            boolean z13;
            start();
            this.f11463yggfygwlhe = new Handler(getLooper(), this);
            this.f11464zdlpuopuiu = new androidx.media3.common.util.iobyxmoadg(this.f11463yggfygwlhe);
            synchronized (this) {
                z13 = false;
                this.f11463yggfygwlhe.obtainMessage(1, i13, 0).sendToTarget();
                while (this.f11460cqumvgiudr == null && this.f11461iwizpuwonk == null && this.f11462jyumaefscl == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z13 = true;
                    }
                }
            }
            if (z13) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f11461iwizpuwonk;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f11462jyumaefscl;
            if (error == null) {
                return (PlaceholderSurface) y2.iobyxmoadg.eablkybsjg(this.f11460cqumvgiudr);
            }
            throw error;
        }

        public void ppxfxbqfkf() {
            y2.iobyxmoadg.eablkybsjg(this.f11463yggfygwlhe);
            this.f11463yggfygwlhe.sendEmptyMessage(2);
        }
    }

    public static PlaceholderSurface eablkybsjg(Context context, boolean z13) {
        y2.iobyxmoadg.lqeggnwhkg(!z13 || ppxfxbqfkf(context));
        return new zoijcleaow().iobyxmoadg(z13 ? f11456iwizpuwonk : 0);
    }

    public static synchronized boolean ppxfxbqfkf(Context context) {
        try {
            if (!f11455cqumvgiudr) {
                f11456iwizpuwonk = zoijcleaow(context);
                f11455cqumvgiudr = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11456iwizpuwonk != 0;
    }

    private static int zoijcleaow(Context context) {
        if (GlUtil.dxjokdxxww(context)) {
            return GlUtil.btonecajqb() ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f11458yggfygwlhe) {
            try {
                if (!this.f11457jyumaefscl) {
                    this.f11458yggfygwlhe.ppxfxbqfkf();
                    this.f11457jyumaefscl = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private PlaceholderSurface(zoijcleaow zoijcleaowVar, SurfaceTexture surfaceTexture, boolean z13) {
        super(surfaceTexture);
        this.f11458yggfygwlhe = zoijcleaowVar;
        this.f11459zdlpuopuiu = z13;
    }
}
