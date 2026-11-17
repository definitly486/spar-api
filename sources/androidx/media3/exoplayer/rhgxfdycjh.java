package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
final class rhgxfdycjh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f10940iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f10941ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f10942wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.ojitshcjhn f10943zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f10944iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private PowerManager.WakeLock f10945zoijcleaow;

        public iobyxmoadg(Context context) {
            this.f10944iobyxmoadg = context;
        }

        public void iobyxmoadg(boolean z13, boolean z14) {
            if (z13 && this.f10945zoijcleaow == null) {
                PowerManager powerManager = (PowerManager) this.f10944iobyxmoadg.getSystemService("power");
                if (powerManager == null) {
                    y2.kcexrzcfyt.nufgyqmvbu("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f10945zoijcleaow = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f10945zoijcleaow;
            if (wakeLock == null) {
                return;
            }
            if (z13 && z14) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public rhgxfdycjh(Context context, Looper looper, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10940iobyxmoadg = new iobyxmoadg(context.getApplicationContext());
        this.f10943zoijcleaow = dxjokdxxwwVar.iobyxmoadg(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ppxfxbqfkf(boolean z13, boolean z14) {
        this.f10940iobyxmoadg.iobyxmoadg(z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc(boolean z13) {
        this.f10940iobyxmoadg.iobyxmoadg(true, z13);
    }

    public void eablkybsjg(final boolean z13) {
        if (this.f10941ppxfxbqfkf == z13) {
            return;
        }
        this.f10941ppxfxbqfkf = z13;
        final boolean z14 = this.f10942wkgbmnqykc;
        this.f10943zoijcleaow.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.ezmngbhpjk
            @Override // java.lang.Runnable
            public final void run() {
                this.f10542zdlpuopuiu.ppxfxbqfkf(z13, z14);
            }
        });
    }

    public void gxszxtbevo(final boolean z13) {
        if (this.f10942wkgbmnqykc == z13) {
            return;
        }
        this.f10942wkgbmnqykc = z13;
        if (this.f10941ppxfxbqfkf) {
            this.f10943zoijcleaow.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.fmlbqenlif
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10550zdlpuopuiu.wkgbmnqykc(z13);
                }
            });
        }
    }
}
