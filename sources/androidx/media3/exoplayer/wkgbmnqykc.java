package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f11613iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.ojitshcjhn f11614ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f11615wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f11616zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    final class iobyxmoadg extends BroadcastReceiver {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zoijcleaow f11617iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final y2.ojitshcjhn f11619zoijcleaow;

        public iobyxmoadg(y2.ojitshcjhn ojitshcjhnVar, zoijcleaow zoijcleaowVar) {
            this.f11619zoijcleaow = ojitshcjhnVar;
            this.f11617iobyxmoadg = zoijcleaowVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zoijcleaow() {
            if (wkgbmnqykc.this.f11615wkgbmnqykc) {
                this.f11617iobyxmoadg.pmvmpeiblj();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f11619zoijcleaow.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.ppxfxbqfkf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10938zdlpuopuiu.zoijcleaow();
                    }
                });
            }
        }
    }

    public interface zoijcleaow {
        void pmvmpeiblj();
    }

    public wkgbmnqykc(Context context, Looper looper, Looper looper2, zoijcleaow zoijcleaowVar, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f11613iobyxmoadg = context.getApplicationContext();
        this.f11614ppxfxbqfkf = dxjokdxxwwVar.iobyxmoadg(looper, null);
        this.f11616zoijcleaow = new iobyxmoadg(dxjokdxxwwVar.iobyxmoadg(looper2, null), zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg() {
        this.f11613iobyxmoadg.unregisterReceiver(this.f11616zoijcleaow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc() {
        this.f11613iobyxmoadg.registerReceiver(this.f11616zoijcleaow, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public void gxszxtbevo(boolean z13) {
        if (z13 == this.f11615wkgbmnqykc) {
            return;
        }
        if (z13) {
            this.f11614ppxfxbqfkf.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.iobyxmoadg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10579zdlpuopuiu.wkgbmnqykc();
                }
            });
            this.f11615wkgbmnqykc = true;
        } else {
            this.f11614ppxfxbqfkf.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.zoijcleaow
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11681zdlpuopuiu.eablkybsjg();
                }
            });
            this.f11615wkgbmnqykc = false;
        }
    }
}
