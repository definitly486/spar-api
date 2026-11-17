package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends MediaCodec.Callback {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private IllegalStateException f10814agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private MediaCodec.CodecException f10815btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f10816draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private MediaFormat f10817dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private MediaCodec.CryptoException f10819gtknphoqwx;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private MediaFormat f10823nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private nufgyqmvbu.ppxfxbqfkf f10824ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Handler f10825ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f10826wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HandlerThread f10828zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f10821iobyxmoadg = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.collection.eablkybsjg f10827wkgbmnqykc = new androidx.collection.eablkybsjg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.collection.eablkybsjg f10818eablkybsjg = new androidx.collection.eablkybsjg();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ArrayDeque f10820gxszxtbevo = new ArrayDeque();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ArrayDeque f10822lqeggnwhkg = new ArrayDeque();

    eablkybsjg(HandlerThread handlerThread) {
        this.f10828zoijcleaow = handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void agtfadlqog() {
        synchronized (this.f10821iobyxmoadg) {
            try {
                if (this.f10826wflxmlrfwp) {
                    return;
                }
                long j13 = this.f10816draadjrbmk - 1;
                this.f10816draadjrbmk = j13;
                if (j13 > 0) {
                    return;
                }
                if (j13 < 0) {
                    ojitshcjhn(new IllegalStateException());
                } else {
                    gxszxtbevo();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void btonecajqb() {
        gtknphoqwx();
        wflxmlrfwp();
        draadjrbmk();
    }

    private void draadjrbmk() {
        MediaCodec.CryptoException cryptoException = this.f10819gtknphoqwx;
        if (cryptoException == null) {
            return;
        }
        this.f10819gtknphoqwx = null;
        throw cryptoException;
    }

    private boolean dxjokdxxww() {
        return this.f10816draadjrbmk > 0 || this.f10826wflxmlrfwp;
    }

    private void gtknphoqwx() {
        IllegalStateException illegalStateException = this.f10814agtfadlqog;
        if (illegalStateException == null) {
            return;
        }
        this.f10814agtfadlqog = null;
        throw illegalStateException;
    }

    private void gxszxtbevo() {
        if (!this.f10822lqeggnwhkg.isEmpty()) {
            this.f10817dxjokdxxww = (MediaFormat) this.f10822lqeggnwhkg.getLast();
        }
        this.f10827wkgbmnqykc.zoijcleaow();
        this.f10818eablkybsjg.zoijcleaow();
        this.f10820gxszxtbevo.clear();
        this.f10822lqeggnwhkg.clear();
    }

    private void ojitshcjhn(IllegalStateException illegalStateException) {
        synchronized (this.f10821iobyxmoadg) {
            this.f10814agtfadlqog = illegalStateException;
        }
    }

    private void wflxmlrfwp() {
        MediaCodec.CodecException codecException = this.f10815btonecajqb;
        if (codecException == null) {
            return;
        }
        this.f10815btonecajqb = null;
        throw codecException;
    }

    private void zoijcleaow(MediaFormat mediaFormat) {
        this.f10818eablkybsjg.iobyxmoadg(-2);
        this.f10822lqeggnwhkg.add(mediaFormat);
    }

    public void eablkybsjg() {
        synchronized (this.f10821iobyxmoadg) {
            this.f10816draadjrbmk++;
            ((Handler) stevsuqkhv.nufgyqmvbu(this.f10825ppxfxbqfkf)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.wkgbmnqykc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10866zdlpuopuiu.agtfadlqog();
                }
            });
        }
    }

    public MediaFormat lqeggnwhkg() {
        MediaFormat mediaFormat;
        synchronized (this.f10821iobyxmoadg) {
            try {
                mediaFormat = this.f10823nufgyqmvbu;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void nufgyqmvbu(MediaCodec mediaCodec) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10825ppxfxbqfkf == null);
        this.f10828zoijcleaow.start();
        Handler handler = new Handler(this.f10828zoijcleaow.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10825ppxfxbqfkf = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f10821iobyxmoadg) {
            this.f10819gtknphoqwx = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10821iobyxmoadg) {
            this.f10815btonecajqb = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i13) {
        synchronized (this.f10821iobyxmoadg) {
            try {
                this.f10827wkgbmnqykc.iobyxmoadg(i13);
                nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = this.f10824ojitshcjhn;
                if (ppxfxbqfkfVar != null) {
                    ppxfxbqfkfVar.iobyxmoadg();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i13, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10821iobyxmoadg) {
            try {
                MediaFormat mediaFormat = this.f10817dxjokdxxww;
                if (mediaFormat != null) {
                    zoijcleaow(mediaFormat);
                    this.f10817dxjokdxxww = null;
                }
                this.f10818eablkybsjg.iobyxmoadg(i13);
                this.f10820gxszxtbevo.add(bufferInfo);
                nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = this.f10824ojitshcjhn;
                if (ppxfxbqfkfVar != null) {
                    ppxfxbqfkfVar.zoijcleaow();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10821iobyxmoadg) {
            zoijcleaow(mediaFormat);
            this.f10817dxjokdxxww = null;
        }
    }

    public int ppxfxbqfkf() {
        synchronized (this.f10821iobyxmoadg) {
            try {
                btonecajqb();
                int iEablkybsjg = -1;
                if (dxjokdxxww()) {
                    return -1;
                }
                if (!this.f10827wkgbmnqykc.wkgbmnqykc()) {
                    iEablkybsjg = this.f10827wkgbmnqykc.eablkybsjg();
                }
                return iEablkybsjg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void rgvfuqvkyq(nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f10821iobyxmoadg) {
            this.f10824ojitshcjhn = ppxfxbqfkfVar;
        }
    }

    public void vdvldrhtss() {
        synchronized (this.f10821iobyxmoadg) {
            this.f10826wflxmlrfwp = true;
            this.f10828zoijcleaow.quit();
            gxszxtbevo();
        }
    }

    public int wkgbmnqykc(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10821iobyxmoadg) {
            try {
                btonecajqb();
                if (dxjokdxxww()) {
                    return -1;
                }
                if (this.f10818eablkybsjg.wkgbmnqykc()) {
                    return -1;
                }
                int iEablkybsjg = this.f10818eablkybsjg.eablkybsjg();
                if (iEablkybsjg >= 0) {
                    y2.iobyxmoadg.dxjokdxxww(this.f10823nufgyqmvbu);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f10820gxszxtbevo.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iEablkybsjg == -2) {
                    this.f10823nufgyqmvbu = (MediaFormat) this.f10822lqeggnwhkg.remove();
                }
                return iEablkybsjg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
