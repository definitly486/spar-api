package bz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import t6.p0;

/* JADX INFO: loaded from: classes2.dex */
final class iyctptxqzt extends skhdrjzrfn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17479eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.weqkydbzbr f17480gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f17481lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private zoijcleaow f17482nufgyqmvbu;

    private final class zoijcleaow extends BroadcastReceiver {
        private zoijcleaow() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                iyctptxqzt.this.lereixgezr(false);
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                iyctptxqzt.this.lereixgezr(true);
            }
        }
    }

    iyctptxqzt(Context context, AudioManager audioManager, t6.weqkydbzbr weqkydbzbrVar) {
        super(audioManager);
        this.f17479eablkybsjg = context;
        this.f17480gxszxtbevo = weqkydbzbrVar;
    }

    private void cqumvgiudr() {
        this.f17480gxszxtbevo.iobyxmoadg();
    }

    private void iwizpuwonk() {
        zoijcleaow zoijcleaowVar = this.f17482nufgyqmvbu;
        if (zoijcleaowVar != null) {
            this.f17479eablkybsjg.unregisterReceiver(zoijcleaowVar);
            this.f17482nufgyqmvbu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jyumaefscl() {
        nufgyqmvbu(lqeggnwhkg().getMode());
    }

    private void kcexrzcfyt() {
        jyumaefscl();
        this.f17481lqeggnwhkg = p0.iobyxmoadg(this.f17479eablkybsjg);
        zdlpuopuiu();
        vdvldrhtss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lereixgezr(boolean z13) {
        this.f17481lqeggnwhkg = z13;
        vdvldrhtss();
    }

    private void oxmwwwfdhm() {
        this.f17480gxszxtbevo.zoijcleaow(new Runnable() { // from class: bz.opjhrmiecq
            @Override // java.lang.Runnable
            public final void run() {
                this.f17545zdlpuopuiu.jyumaefscl();
            }
        }, 3000L, 0L);
    }

    private void vdvldrhtss() {
        if (this.f17481lqeggnwhkg) {
            oxmwwwfdhm();
        } else {
            cqumvgiudr();
        }
    }

    private void yggfygwlhe() {
        iwizpuwonk();
        cqumvgiudr();
    }

    private void zdlpuopuiu() {
        iwizpuwonk();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f17482nufgyqmvbu = zoijcleaowVar;
        this.f17479eablkybsjg.registerReceiver(zoijcleaowVar, intentFilter);
    }

    @Override // bz.skhdrjzrfn
    protected void ojitshcjhn() {
        super.ojitshcjhn();
        yggfygwlhe();
    }

    @Override // bz.skhdrjzrfn, bz.wizcaqwiak
    public void ppxfxbqfkf(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
        super.ppxfxbqfkf(iobyxmoadgVar);
        zoijcleaow();
    }

    @Override // bz.skhdrjzrfn, bz.wizcaqwiak
    public void wkgbmnqykc(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
        super.wkgbmnqykc(iobyxmoadgVar);
        if (draadjrbmk()) {
            yggfygwlhe();
        }
    }

    @Override // bz.wizcaqwiak
    public void zoijcleaow() {
        if (draadjrbmk()) {
            return;
        }
        kcexrzcfyt();
    }
}
