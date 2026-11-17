package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f10608dxjokdxxww;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f10610gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xa.vdvldrhtss f10611iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private w2.iobyxmoadg f10613nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f10614ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private v2.ppxfxbqfkf f10615wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f10616zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f10612lqeggnwhkg = 1.0f;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f10609eablkybsjg = 0;

    public interface iobyxmoadg {
        void eablkybsjg(int i13);

        void wkgbmnqykc(float f13);
    }

    public lqeggnwhkg(final Context context, Looper looper, iobyxmoadg iobyxmoadgVar) {
        this.f10611iobyxmoadg = xa.oxmwwwfdhm.iobyxmoadg(new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.gxszxtbevo
            @Override // xa.vdvldrhtss
            public final Object get() {
                return w2.eablkybsjg.ppxfxbqfkf(context);
            }
        });
        this.f10614ppxfxbqfkf = iobyxmoadgVar;
        this.f10616zoijcleaow = new Handler(looper);
    }

    private boolean agtfadlqog(int i13) {
        return i13 != 1 && this.f10610gxszxtbevo == 1;
    }

    private int btonecajqb() {
        if (this.f10609eablkybsjg == 2) {
            return 1;
        }
        if (gtknphoqwx() == 1) {
            wflxmlrfwp(2);
            return 1;
        }
        wflxmlrfwp(1);
        return -1;
    }

    private void eablkybsjg(int i13) {
        iobyxmoadg iobyxmoadgVar = this.f10614ppxfxbqfkf;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.eablkybsjg(i13);
        }
    }

    private int gtknphoqwx() {
        w2.iobyxmoadg iobyxmoadgVar = this.f10613nufgyqmvbu;
        if (iobyxmoadgVar == null || this.f10608dxjokdxxww) {
            this.f10613nufgyqmvbu = (iobyxmoadgVar == null ? new w2.iobyxmoadg.zoijcleaow(this.f10610gxszxtbevo) : iobyxmoadgVar.iobyxmoadg()).zoijcleaow((v2.ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(this.f10615wkgbmnqykc)).wkgbmnqykc(rgvfuqvkyq()).ppxfxbqfkf(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.eablkybsjg
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i13) {
                    this.f10537iobyxmoadg.lqeggnwhkg(i13);
                }
            }, this.f10616zoijcleaow).iobyxmoadg();
            this.f10608dxjokdxxww = false;
        }
        return w2.eablkybsjg.dxjokdxxww((AudioManager) this.f10611iobyxmoadg.get(), this.f10613nufgyqmvbu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lqeggnwhkg(int i13) {
        if (i13 == -3 || i13 == -2) {
            if (i13 != -2 && !rgvfuqvkyq()) {
                wflxmlrfwp(4);
                return;
            } else {
                eablkybsjg(0);
                wflxmlrfwp(3);
                return;
            }
        }
        if (i13 == -1) {
            eablkybsjg(-1);
            ppxfxbqfkf();
            wflxmlrfwp(1);
        } else if (i13 == 1) {
            wflxmlrfwp(2);
            eablkybsjg(1);
        } else {
            y2.kcexrzcfyt.nufgyqmvbu("AudioFocusManager", "Unknown focus change type: " + i13);
        }
    }

    private void ppxfxbqfkf() {
        int i13 = this.f10609eablkybsjg;
        if (i13 == 1 || i13 == 0 || this.f10613nufgyqmvbu == null) {
            return;
        }
        w2.eablkybsjg.zoijcleaow((AudioManager) this.f10611iobyxmoadg.get(), this.f10613nufgyqmvbu);
    }

    private boolean rgvfuqvkyq() {
        v2.ppxfxbqfkf ppxfxbqfkfVar = this.f10615wkgbmnqykc;
        return ppxfxbqfkfVar != null && ppxfxbqfkfVar.f115664iobyxmoadg == 1;
    }

    private void wflxmlrfwp(int i13) {
        if (this.f10609eablkybsjg == i13) {
            return;
        }
        this.f10609eablkybsjg = i13;
        float f13 = i13 == 4 ? 0.2f : 1.0f;
        if (this.f10612lqeggnwhkg == f13) {
            return;
        }
        this.f10612lqeggnwhkg = f13;
        iobyxmoadg iobyxmoadgVar = this.f10614ppxfxbqfkf;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.wkgbmnqykc(f13);
        }
    }

    private static int wkgbmnqykc(v2.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar == null) {
            return 0;
        }
        switch (ppxfxbqfkfVar.f115665ppxfxbqfkf) {
            case 0:
                y2.kcexrzcfyt.nufgyqmvbu("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (ppxfxbqfkfVar.f115664iobyxmoadg == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                y2.kcexrzcfyt.nufgyqmvbu("AudioFocusManager", "Unidentified audio usage: " + ppxfxbqfkfVar.f115665ppxfxbqfkf);
                return 0;
            case 16:
                return 4;
        }
    }

    public void draadjrbmk(v2.ppxfxbqfkf ppxfxbqfkfVar) {
        if (Objects.equals(this.f10615wkgbmnqykc, ppxfxbqfkfVar)) {
            return;
        }
        this.f10615wkgbmnqykc = ppxfxbqfkfVar;
        int iWkgbmnqykc = wkgbmnqykc(ppxfxbqfkfVar);
        this.f10610gxszxtbevo = iWkgbmnqykc;
        boolean z13 = true;
        if (iWkgbmnqykc != 1 && iWkgbmnqykc != 0) {
            z13 = false;
        }
        y2.iobyxmoadg.zoijcleaow(z13, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public void dxjokdxxww() {
        this.f10614ppxfxbqfkf = null;
        ppxfxbqfkf();
        wflxmlrfwp(0);
    }

    public float gxszxtbevo() {
        return this.f10612lqeggnwhkg;
    }

    public int ojitshcjhn(boolean z13, int i13) {
        if (!agtfadlqog(i13)) {
            ppxfxbqfkf();
            wflxmlrfwp(0);
            return 1;
        }
        if (z13) {
            return btonecajqb();
        }
        int i14 = this.f10609eablkybsjg;
        if (i14 != 1) {
            return i14 != 3 ? 1 : 0;
        }
        return -1;
    }
}
