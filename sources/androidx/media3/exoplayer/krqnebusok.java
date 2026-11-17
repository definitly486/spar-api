package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class krqnebusok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f10600iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f10601ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f10602wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.ojitshcjhn f10603zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f10604iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private WifiManager.WifiLock f10605zoijcleaow;

        public iobyxmoadg(Context context) {
            this.f10604iobyxmoadg = context;
        }

        public void iobyxmoadg(boolean z13, boolean z14) {
            if (z13 && this.f10605zoijcleaow == null) {
                WifiManager wifiManager = (WifiManager) this.f10604iobyxmoadg.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    y2.kcexrzcfyt.nufgyqmvbu("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f10605zoijcleaow = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f10605zoijcleaow;
            if (wifiLock == null) {
                return;
            }
            if (z13 && z14) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public krqnebusok(Context context, Looper looper, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10600iobyxmoadg = new iobyxmoadg(context.getApplicationContext());
        this.f10603zoijcleaow = dxjokdxxwwVar.iobyxmoadg(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ppxfxbqfkf(boolean z13, boolean z14) {
        this.f10600iobyxmoadg.iobyxmoadg(z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc(boolean z13) {
        this.f10600iobyxmoadg.iobyxmoadg(true, z13);
    }

    public void eablkybsjg(final boolean z13) {
        if (this.f10601ppxfxbqfkf == z13) {
            return;
        }
        this.f10601ppxfxbqfkf = z13;
        final boolean z14 = this.f10602wkgbmnqykc;
        this.f10603zoijcleaow.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.yzdjzghtvl
            @Override // java.lang.Runnable
            public final void run() {
                this.f11656zdlpuopuiu.ppxfxbqfkf(z13, z14);
            }
        });
    }

    public void gxszxtbevo(final boolean z13) {
        if (this.f10602wkgbmnqykc == z13) {
            return;
        }
        this.f10602wkgbmnqykc = z13;
        if (this.f10601ppxfxbqfkf) {
            this.f10603zoijcleaow.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.eslsurpljm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10539zdlpuopuiu.wkgbmnqykc(z13);
                }
            });
        }
    }
}
