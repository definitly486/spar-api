package bz;

import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class wypolnanlu extends skhdrjzrfn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AudioManager.OnModeChangedListener f17668eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f17669gxszxtbevo;

    wypolnanlu(AudioManager audioManager) {
        super(audioManager);
        this.f17668eablkybsjg = new AudioManager.OnModeChangedListener() { // from class: bz.dsvhmnatus
            @Override // android.media.AudioManager.OnModeChangedListener
            public final void onModeChanged(int i13) {
                this.f17404iobyxmoadg.nufgyqmvbu(i13);
            }
        };
    }

    private synchronized void rgvfuqvkyq() {
        if (this.f17669gxszxtbevo) {
            lqeggnwhkg().removeOnModeChangedListener(this.f17668eablkybsjg);
            this.f17669gxszxtbevo = false;
        }
    }

    private synchronized void vdvldrhtss() {
        if (!this.f17669gxszxtbevo) {
            AudioManager audioManagerLqeggnwhkg = lqeggnwhkg();
            Handler handlerEablkybsjg = eablkybsjg();
            Objects.requireNonNull(handlerEablkybsjg);
            audioManagerLqeggnwhkg.addOnModeChangedListener(new h3.iozdgvuglv(handlerEablkybsjg), this.f17668eablkybsjg);
            this.f17669gxszxtbevo = true;
        }
    }

    @Override // bz.skhdrjzrfn
    protected void ojitshcjhn() {
        super.ojitshcjhn();
        rgvfuqvkyq();
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
            rgvfuqvkyq();
        }
    }

    @Override // bz.wizcaqwiak
    public void zoijcleaow() {
        if (draadjrbmk()) {
            return;
        }
        vdvldrhtss();
    }
}
