package bz;

import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
abstract class cllcsxoeiz extends skhdrjzrfn implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t6.weqkydbzbr f17389eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f17390gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Handler f17391lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f17392nufgyqmvbu;

    cllcsxoeiz(AudioManager audioManager, t6.weqkydbzbr weqkydbzbrVar) {
        super(audioManager);
        this.f17389eablkybsjg = weqkydbzbrVar;
    }

    private void cqumvgiudr() {
        dxjokdxxww(-1);
    }

    private void esjtqupxsv() {
        this.f17389eablkybsjg.iobyxmoadg();
    }

    private void iwizpuwonk() {
        int i13 = this.f17392nufgyqmvbu + 1;
        this.f17392nufgyqmvbu = i13;
        if (i13 >= 6) {
            cqumvgiudr();
            return;
        }
        if (this.f17391lqeggnwhkg == null) {
            this.f17391lqeggnwhkg = eablkybsjg();
        }
        this.f17391lqeggnwhkg.postDelayed(new Runnable() { // from class: bz.hcddaimhww
            @Override // java.lang.Runnable
            public final void run() {
                this.f17430zdlpuopuiu.oxmwwwfdhm();
            }
        }, TimeUnit.SECONDS.toMillis(10L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jyumaefscl() {
        if (nufgyqmvbu(lqeggnwhkg().getMode())) {
            esjtqupxsv();
            kcexrzcfyt();
        }
    }

    private void lereixgezr() {
        this.f17389eablkybsjg.ppxfxbqfkf(new Runnable() { // from class: bz.jpowsppfya
            @Override // java.lang.Runnable
            public final void run() {
                this.f17488zdlpuopuiu.jyumaefscl();
            }
        }, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MINUTES.toMillis(1L), new Runnable() { // from class: bz.hkdspvbjdz
            @Override // java.lang.Runnable
            public final void run() {
                this.f17431zdlpuopuiu.kcexrzcfyt();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void oxmwwwfdhm() {
        try {
            if (!this.f17390gxszxtbevo) {
                if (zdlpuopuiu(this) != 0) {
                    this.f17390gxszxtbevo = true;
                } else {
                    iwizpuwonk();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void yggfygwlhe() {
        if (this.f17390gxszxtbevo) {
            pmvmpeiblj(this);
            this.f17390gxszxtbevo = false;
        }
    }

    void kcexrzcfyt() {
        yggfygwlhe();
        oxmwwwfdhm();
    }

    @Override // bz.skhdrjzrfn
    protected void ojitshcjhn() {
        super.ojitshcjhn();
        esjtqupxsv();
        yggfygwlhe();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i13) {
        nufgyqmvbu(lqeggnwhkg().getMode());
        esjtqupxsv();
        lereixgezr();
    }

    abstract void pmvmpeiblj(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);

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

    abstract int zdlpuopuiu(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);

    @Override // bz.wizcaqwiak
    public void zoijcleaow() {
        if (draadjrbmk()) {
            return;
        }
        this.f17392nufgyqmvbu = 0;
        oxmwwwfdhm();
    }
}
