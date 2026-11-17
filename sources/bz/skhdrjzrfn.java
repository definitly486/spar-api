package bz;

import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
abstract class skhdrjzrfn implements wizcaqwiak {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AudioManager f17626iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private HandlerThread f17628wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f17629zoijcleaow = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private wizcaqwiak.zoijcleaow f17627ppxfxbqfkf = wizcaqwiak.zoijcleaow.Invalid;

    skhdrjzrfn(AudioManager audioManager) {
        this.f17626iobyxmoadg = audioManager;
        nufgyqmvbu(audioManager.getMode());
    }

    private void btonecajqb() {
        Iterator it = this.f17629zoijcleaow.iterator();
        while (it.hasNext()) {
            ((wizcaqwiak.iobyxmoadg) it.next()).cqumvgiudr(this.f17627ppxfxbqfkf);
        }
    }

    private void gtknphoqwx() {
        HandlerThread handlerThread = this.f17628wkgbmnqykc;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f17628wkgbmnqykc = null;
        }
    }

    private static wizcaqwiak.zoijcleaow gxszxtbevo(int i13) {
        switch (i13) {
            case 0:
                return wizcaqwiak.zoijcleaow.Normal;
            case 1:
                return wizcaqwiak.zoijcleaow.Ringtone;
            case 2:
            case 5:
                return wizcaqwiak.zoijcleaow.InCall;
            case 3:
            case 6:
                return wizcaqwiak.zoijcleaow.InVoipCall;
            case 4:
                return wizcaqwiak.zoijcleaow.CallScreen;
            default:
                return wizcaqwiak.zoijcleaow.Invalid;
        }
    }

    private void wflxmlrfwp(int i13) {
        Iterator it = this.f17629zoijcleaow.iterator();
        while (it.hasNext()) {
            ((wizcaqwiak.iobyxmoadg) it.next()).wkgbmnqykc(i13);
        }
    }

    protected boolean agtfadlqog(int i13, boolean z13) {
        wizcaqwiak.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(i13);
        boolean z14 = this.f17627ppxfxbqfkf != zoijcleaowVarGxszxtbevo;
        if (z14) {
            this.f17627ppxfxbqfkf = zoijcleaowVarGxszxtbevo;
            if (z13) {
                btonecajqb();
            }
        }
        return z14;
    }

    protected boolean draadjrbmk() {
        return this.f17629zoijcleaow.isEmpty();
    }

    protected void dxjokdxxww(int i13) {
        wflxmlrfwp(i13);
    }

    protected Handler eablkybsjg() {
        gtknphoqwx();
        HandlerThread handlerThread = new HandlerThread("AudioStateBaseListener");
        this.f17628wkgbmnqykc = handlerThread;
        handlerThread.start();
        return new Handler(this.f17628wkgbmnqykc.getLooper());
    }

    protected void finalize() throws Throwable {
        try {
            ojitshcjhn();
        } finally {
            super.finalize();
        }
    }

    @Override // bz.wizcaqwiak
    public wizcaqwiak.zoijcleaow iobyxmoadg() {
        agtfadlqog(lqeggnwhkg().getMode(), false);
        return this.f17627ppxfxbqfkf;
    }

    protected AudioManager lqeggnwhkg() {
        return this.f17626iobyxmoadg;
    }

    protected boolean nufgyqmvbu(int i13) {
        return agtfadlqog(i13, true);
    }

    protected void ojitshcjhn() {
        this.f17629zoijcleaow.clear();
        gtknphoqwx();
    }

    @Override // bz.wizcaqwiak
    public void ppxfxbqfkf(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
        this.f17629zoijcleaow.add(iobyxmoadgVar);
    }

    @Override // bz.wizcaqwiak
    public void wkgbmnqykc(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
        this.f17629zoijcleaow.remove(iobyxmoadgVar);
    }
}
