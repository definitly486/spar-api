package w2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f118570eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Object f118571gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f118572iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Handler f118573ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final v2.ppxfxbqfkf f118574wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f118575zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    static class ppxfxbqfkf implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Handler f118576iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f118577zoijcleaow;

        ppxfxbqfkf(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f118577zoijcleaow = onAudioFocusChangeListener;
            this.f118576iobyxmoadg = stevsuqkhv.esjtqupxsv(handler.getLooper(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow(int i13) {
            this.f118577zoijcleaow.onAudioFocusChange(i13);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i13) {
            stevsuqkhv.krqnebusok(this.f118576iobyxmoadg, new Runnable() { // from class: w2.zoijcleaow
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118586zdlpuopuiu.zoijcleaow(i13);
                }
            });
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f118578eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f118579iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Handler f118580ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private v2.ppxfxbqfkf f118581wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f118582zoijcleaow;

        public iobyxmoadg iobyxmoadg() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f118582zoijcleaow;
            if (onAudioFocusChangeListener != null) {
                return new iobyxmoadg(this.f118579iobyxmoadg, onAudioFocusChangeListener, (Handler) y2.iobyxmoadg.eablkybsjg(this.f118580ppxfxbqfkf), this.f118581wkgbmnqykc, this.f118578eablkybsjg);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public zoijcleaow ppxfxbqfkf(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            y2.iobyxmoadg.eablkybsjg(onAudioFocusChangeListener);
            y2.iobyxmoadg.eablkybsjg(handler);
            this.f118582zoijcleaow = onAudioFocusChangeListener;
            this.f118580ppxfxbqfkf = handler;
            return this;
        }

        public zoijcleaow wkgbmnqykc(boolean z13) {
            this.f118578eablkybsjg = z13;
            return this;
        }

        public zoijcleaow zoijcleaow(v2.ppxfxbqfkf ppxfxbqfkfVar) {
            y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar);
            this.f118581wkgbmnqykc = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow(int i13) {
            this.f118581wkgbmnqykc = v2.ppxfxbqfkf.f115660lqeggnwhkg;
            this.f118579iobyxmoadg = i13;
        }

        private zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this.f118579iobyxmoadg = iobyxmoadgVar.eablkybsjg();
            this.f118582zoijcleaow = iobyxmoadgVar.gxszxtbevo();
            this.f118580ppxfxbqfkf = iobyxmoadgVar.wkgbmnqykc();
            this.f118581wkgbmnqykc = iobyxmoadgVar.zoijcleaow();
            this.f118578eablkybsjg = iobyxmoadgVar.lqeggnwhkg();
        }
    }

    iobyxmoadg(int i13, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, v2.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        this.f118572iobyxmoadg = i13;
        this.f118573ppxfxbqfkf = handler;
        this.f118574wkgbmnqykc = ppxfxbqfkfVar;
        this.f118570eablkybsjg = z13;
        int i14 = stevsuqkhv.f123602iobyxmoadg;
        if (i14 < 26) {
            this.f118575zoijcleaow = new ppxfxbqfkf(onAudioFocusChangeListener, handler);
        } else {
            this.f118575zoijcleaow = onAudioFocusChangeListener;
        }
        if (i14 >= 26) {
            this.f118571gxszxtbevo = new AudioFocusRequest.Builder(i13).setAudioAttributes(ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg).setWillPauseWhenDucked(z13).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f118571gxszxtbevo = null;
        }
    }

    public int eablkybsjg() {
        return this.f118572iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f118572iobyxmoadg == iobyxmoadgVar.f118572iobyxmoadg && this.f118570eablkybsjg == iobyxmoadgVar.f118570eablkybsjg && Objects.equals(this.f118575zoijcleaow, iobyxmoadgVar.f118575zoijcleaow) && Objects.equals(this.f118573ppxfxbqfkf, iobyxmoadgVar.f118573ppxfxbqfkf) && Objects.equals(this.f118574wkgbmnqykc, iobyxmoadgVar.f118574wkgbmnqykc);
    }

    public AudioManager.OnAudioFocusChangeListener gxszxtbevo() {
        return this.f118575zoijcleaow;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f118572iobyxmoadg), this.f118575zoijcleaow, this.f118573ppxfxbqfkf, this.f118574wkgbmnqykc, Boolean.valueOf(this.f118570eablkybsjg));
    }

    public zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public boolean lqeggnwhkg() {
        return this.f118570eablkybsjg;
    }

    AudioFocusRequest ppxfxbqfkf() {
        return (AudioFocusRequest) y2.iobyxmoadg.eablkybsjg(this.f118571gxszxtbevo);
    }

    public Handler wkgbmnqykc() {
        return this.f118573ppxfxbqfkf;
    }

    public v2.ppxfxbqfkf zoijcleaow() {
        return this.f118574wkgbmnqykc;
    }
}
